package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.t;
import java.util.List;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class StatusRunnable<T> implements Runnable {
    private final SettableFuture<T> mFuture = SettableFuture.create();

    @WorkerThread
    public abstract T runInternal();

    public void run() {
        try {
            this.mFuture.set(runInternal());
        } catch (Throwable th) {
            this.mFuture.setException(th);
        }
    }

    public t<T> getFuture() {
        return this.mFuture;
    }

    public static StatusRunnable<List<WorkInfo>> forStringIds(@NonNull final WorkManagerImpl workManagerImpl, @NonNull final List<String> list) {
        return new StatusRunnable<List<WorkInfo>>() {
            public List<WorkInfo> runInternal() {
                return (List) WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(list));
            }
        };
    }

    public static StatusRunnable<WorkInfo> forUUID(@NonNull final WorkManagerImpl workManagerImpl, @NonNull final UUID uuid) {
        return new StatusRunnable<WorkInfo>() {
            /* Access modifiers changed, original: 0000 */
            public WorkInfo runInternal() {
                WorkInfoPojo workStatusPojoForId = workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(uuid.toString());
                return workStatusPojoForId != null ? workStatusPojoForId.toWorkInfo() : null;
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forTag(@NonNull final WorkManagerImpl workManagerImpl, @NonNull final String str) {
        return new StatusRunnable<List<WorkInfo>>() {
            /* Access modifiers changed, original: 0000 */
            public List<WorkInfo> runInternal() {
                return (List) WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(str));
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forUniqueWork(@NonNull final WorkManagerImpl workManagerImpl, @NonNull final String str) {
        return new StatusRunnable<List<WorkInfo>>() {
            /* Access modifiers changed, original: 0000 */
            public List<WorkInfo> runInternal() {
                return (List) WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(str));
            }
        };
    }
}
