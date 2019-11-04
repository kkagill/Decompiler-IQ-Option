package androidx.work;

import android.os.Build.VERSION;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;
    @NonNull
    private final Executor mExecutor;
    private final int mLoggingLevel;
    private final int mMaxJobSchedulerId;
    private final int mMaxSchedulerLimit;
    private final int mMinJobSchedulerId;
    @NonNull
    private final WorkerFactory mWorkerFactory;

    public static final class Builder {
        Executor mExecutor;
        int mLoggingLevel = 4;
        int mMaxJobSchedulerId = Integer.MAX_VALUE;
        int mMaxSchedulerLimit = 20;
        int mMinJobSchedulerId = 0;
        WorkerFactory mWorkerFactory;

        @NonNull
        public Builder setWorkerFactory(@NonNull WorkerFactory workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        @NonNull
        public Builder setJobSchedulerJobIdRange(int i, int i2) {
            if (i2 - i >= 1000) {
                this.mMinJobSchedulerId = i;
                this.mMaxJobSchedulerId = i2;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        @NonNull
        public Builder setMaxSchedulerLimit(int i) {
            if (i >= 20) {
                this.mMaxSchedulerLimit = Math.min(i, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }

        @NonNull
        public Builder setMinimumLoggingLevel(int i) {
            this.mLoggingLevel = i;
            return this;
        }

        @NonNull
        public Configuration build() {
            return new Configuration(this);
        }
    }

    Configuration(@NonNull Builder builder) {
        if (builder.mExecutor == null) {
            this.mExecutor = createDefaultExecutor();
        } else {
            this.mExecutor = builder.mExecutor;
        }
        if (builder.mWorkerFactory == null) {
            this.mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
        } else {
            this.mWorkerFactory = builder.mWorkerFactory;
        }
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
    }

    @NonNull
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @NonNull
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    @RestrictTo({Scope.LIBRARY})
    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getMaxSchedulerLimit() {
        if (VERSION.SDK_INT == 23) {
            return this.mMaxSchedulerLimit / 2;
        }
        return this.mMaxSchedulerLimit;
    }

    @NonNull
    private Executor createDefaultExecutor() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
