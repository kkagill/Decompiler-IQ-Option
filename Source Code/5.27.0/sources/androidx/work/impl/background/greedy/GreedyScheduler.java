package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class GreedyScheduler implements ExecutionListener, Scheduler, WorkConstraintsCallback {
    private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
    private List<WorkSpec> mConstrainedWorkSpecs = new ArrayList();
    private final Object mLock;
    private boolean mRegisteredExecutionListener;
    private WorkConstraintsTracker mWorkConstraintsTracker;
    private WorkManagerImpl mWorkManagerImpl;

    public GreedyScheduler(Context context, WorkManagerImpl workManagerImpl) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = new WorkConstraintsTracker(context, (WorkConstraintsCallback) this);
        this.mLock = new Object();
    }

    @VisibleForTesting
    public GreedyScheduler(WorkManagerImpl workManagerImpl, WorkConstraintsTracker workConstraintsTracker) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = workConstraintsTracker;
        this.mLock = new Object();
    }

    public void schedule(WorkSpec... workSpecArr) {
        registerExecutionListenerIfNeeded();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (WorkSpec workSpec : workSpecArr) {
            if (workSpec.state == State.ENQUEUED && !workSpec.isPeriodic() && workSpec.initialDelay == 0 && !workSpec.isBackedOff()) {
                if (!workSpec.hasConstraints()) {
                    Logger.get().debug(TAG, String.format("Starting work for %s", new Object[]{workSpec.id}), new Throwable[0]);
                    this.mWorkManagerImpl.startWork(workSpec.id);
                } else if (VERSION.SDK_INT < 24 || !workSpec.constraints.hasContentUriTriggers()) {
                    arrayList.add(workSpec);
                    arrayList2.add(workSpec.id);
                }
            }
        }
        synchronized (this.mLock) {
            if (!arrayList.isEmpty()) {
                Logger.get().debug(TAG, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.mConstrainedWorkSpecs.addAll(arrayList);
                this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
            }
        }
    }

    public void cancel(@NonNull String str) {
        registerExecutionListenerIfNeeded();
        Logger.get().debug(TAG, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.mWorkManagerImpl.stopWork(str);
    }

    public void onAllConstraintsMet(@NonNull List<String> list) {
        for (String str : list) {
            Logger.get().debug(TAG, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.mWorkManagerImpl.startWork(str);
        }
    }

    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        for (String str : list) {
            Logger.get().debug(TAG, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.mWorkManagerImpl.stopWork(str);
        }
    }

    public void onExecuted(@NonNull String str, boolean z) {
        removeConstraintTrackingFor(str);
    }

    private void removeConstraintTrackingFor(@NonNull String str) {
        synchronized (this.mLock) {
            int size = this.mConstrainedWorkSpecs.size();
            for (int i = 0; i < size; i++) {
                if (((WorkSpec) this.mConstrainedWorkSpecs.get(i)).id.equals(str)) {
                    Logger.get().debug(TAG, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.mConstrainedWorkSpecs.remove(i);
                    this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
                    break;
                }
            }
        }
    }

    private void registerExecutionListenerIfNeeded() {
        if (!this.mRegisteredExecutionListener) {
            this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
            this.mRegisteredExecutionListener = true;
        }
    }
}
