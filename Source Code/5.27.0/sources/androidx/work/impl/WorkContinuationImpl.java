package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkContinuationImpl extends WorkContinuation {
    private static final String TAG = Logger.tagWithPrefix("WorkContinuationImpl");
    private final List<String> mAllIds;
    private boolean mEnqueued;
    private final ExistingWorkPolicy mExistingWorkPolicy;
    private final List<String> mIds;
    private final String mName;
    private Operation mOperation;
    private final List<WorkContinuationImpl> mParents;
    private final List<? extends WorkRequest> mWork;
    private final WorkManagerImpl mWorkManagerImpl;

    @NonNull
    public WorkManagerImpl getWorkManagerImpl() {
        return this.mWorkManagerImpl;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    public ExistingWorkPolicy getExistingWorkPolicy() {
        return this.mExistingWorkPolicy;
    }

    @NonNull
    public List<? extends WorkRequest> getWork() {
        return this.mWork;
    }

    @NonNull
    public List<String> getIds() {
        return this.mIds;
    }

    public List<String> getAllIds() {
        return this.mAllIds;
    }

    public boolean isEnqueued() {
        return this.mEnqueued;
    }

    public void markEnqueued() {
        this.mEnqueued = true;
    }

    public List<WorkContinuationImpl> getParents() {
        return this.mParents;
    }

    WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list, @Nullable List<WorkContinuationImpl> list2) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mName = str;
        this.mExistingWorkPolicy = existingWorkPolicy;
        this.mWork = list;
        this.mParents = list2;
        this.mIds = new ArrayList(this.mWork.size());
        this.mAllIds = new ArrayList();
        if (list2 != null) {
            for (WorkContinuationImpl workContinuationImpl : list2) {
                this.mAllIds.addAll(workContinuationImpl.mAllIds);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            str = ((WorkRequest) list.get(i)).getStringId();
            this.mIds.add(str);
            this.mAllIds.add(str);
        }
    }

    @NonNull
    public WorkContinuation then(List<OneTimeWorkRequest> list) {
        return new WorkContinuationImpl(this.mWorkManagerImpl, this.mName, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosLiveData() {
        return this.mWorkManagerImpl.getWorkInfosById(this.mAllIds);
    }

    @NonNull
    public t<List<WorkInfo>> getWorkInfos() {
        StatusRunnable forStringIds = StatusRunnable.forStringIds(this.mWorkManagerImpl, this.mAllIds);
        this.mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(forStringIds);
        return forStringIds.getFuture();
    }

    @NonNull
    public Operation enqueue() {
        if (this.mEnqueued) {
            Logger logger = Logger.get();
            String str = TAG;
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.join(", ", this.mIds);
            logger.warning(str, String.format("Already enqueued work ids (%s)", objArr), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(this);
            this.mWorkManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(enqueueRunnable);
            this.mOperation = enqueueRunnable.getOperation();
        }
        return this.mOperation;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public WorkContinuation combineInternal(@NonNull List<WorkContinuation> list) {
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) new Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        for (WorkContinuation workContinuation : list) {
            arrayList.add((WorkContinuationImpl) workContinuation);
        }
        return new WorkContinuationImpl(this.mWorkManagerImpl, null, ExistingWorkPolicy.KEEP, Collections.singletonList(oneTimeWorkRequest), arrayList);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean hasCycles() {
        return hasCycles(this, new HashSet());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    private static boolean hasCycles(@NonNull WorkContinuationImpl workContinuationImpl, @NonNull Set<String> set) {
        set.addAll(workContinuationImpl.getIds());
        Set prerequisitesFor = prerequisitesFor(workContinuationImpl);
        for (String contains : set) {
            if (prerequisitesFor.contains(contains)) {
                return true;
            }
        }
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (!(parents == null || parents.isEmpty())) {
            for (WorkContinuationImpl hasCycles : parents) {
                if (hasCycles(hasCycles, set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.getIds());
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Set<String> prerequisitesFor(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (!(parents == null || parents.isEmpty())) {
            for (WorkContinuationImpl ids : parents) {
                hashSet.addAll(ids.getIds());
            }
        }
        return hashSet;
    }
}
