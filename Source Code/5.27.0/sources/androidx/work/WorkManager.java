package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.t;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class WorkManager {
    @NonNull
    public abstract WorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract Operation cancelAllWork();

    @NonNull
    public abstract Operation cancelAllWorkByTag(@NonNull String str);

    @NonNull
    public abstract Operation cancelUniqueWork(@NonNull String str);

    @NonNull
    public abstract Operation cancelWorkById(@NonNull UUID uuid);

    @NonNull
    public abstract Operation enqueue(@NonNull List<? extends WorkRequest> list);

    @NonNull
    public abstract Operation enqueueUniquePeriodicWork(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWorkRequest);

    @NonNull
    public abstract Operation enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract t<Long> getLastCancelAllTimeMillis();

    @NonNull
    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    @NonNull
    public abstract t<WorkInfo> getWorkInfoById(@NonNull UUID uuid);

    @NonNull
    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID uuid);

    @NonNull
    public abstract t<List<WorkInfo>> getWorkInfosByTag(@NonNull String str);

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String str);

    @NonNull
    public abstract t<List<WorkInfo>> getWorkInfosForUniqueWork(@NonNull String str);

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String str);

    @NonNull
    public abstract Operation pruneWork();

    @NonNull
    public static WorkManager getInstance() {
        WorkManagerImpl instance = WorkManagerImpl.getInstance();
        if (instance != null) {
            return instance;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void initialize(@NonNull Context context, @NonNull Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    @NonNull
    public final Operation enqueue(@NonNull WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @NonNull
    public final WorkContinuation beginWith(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public final WorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public Operation enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected WorkManager() {
    }
}
