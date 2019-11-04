package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    @NonNull
    private Executor mBackgroundExecutor;
    @NonNull
    private UUID mId;
    @NonNull
    private Data mInputData;
    private int mRunAttemptCount;
    @NonNull
    private RuntimeExtras mRuntimeExtras;
    @NonNull
    private Set<String> mTags;
    @NonNull
    private TaskExecutor mWorkTaskExecutor;
    @NonNull
    private WorkerFactory mWorkerFactory;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class RuntimeExtras {
        @RequiresApi(28)
        public Network network;
        @NonNull
        public List<String> triggeredContentAuthorities = Collections.emptyList();
        @NonNull
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull RuntimeExtras runtimeExtras, int i, @NonNull Executor executor, @NonNull TaskExecutor taskExecutor, @NonNull WorkerFactory workerFactory) {
        this.mId = uuid;
        this.mInputData = data;
        this.mTags = new HashSet(collection);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = i;
        this.mBackgroundExecutor = executor;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkerFactory = workerFactory;
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    public Data getInputData() {
        return this.mInputData;
    }

    @NonNull
    public Set<String> getTags() {
        return this.mTags;
    }

    @RequiresApi(24)
    @NonNull
    public List<Uri> getTriggeredContentUris() {
        return this.mRuntimeExtras.triggeredContentUris;
    }

    @RequiresApi(24)
    @NonNull
    public List<String> getTriggeredContentAuthorities() {
        return this.mRuntimeExtras.triggeredContentAuthorities;
    }

    @RequiresApi(28)
    @Nullable
    public Network getNetwork() {
        return this.mRuntimeExtras.network;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }
}
