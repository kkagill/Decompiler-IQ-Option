package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo.State;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    @NonNull
    private UUID mId;
    @NonNull
    private Set<String> mTags;
    @NonNull
    private WorkSpec mWorkSpec;

    public static abstract class Builder<B extends Builder, W extends WorkRequest> {
        boolean mBackoffCriteriaSet = false;
        UUID mId = UUID.randomUUID();
        Set<String> mTags = new HashSet();
        WorkSpec mWorkSpec;

        @NonNull
        public abstract W buildInternal();

        @NonNull
        public abstract B getThis();

        Builder(@NonNull Class<? extends ListenableWorker> cls) {
            this.mWorkSpec = new WorkSpec(this.mId.toString(), cls.getName());
            addTag(cls.getName());
        }

        @NonNull
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, long j, @NonNull TimeUnit timeUnit) {
            this.mBackoffCriteriaSet = true;
            WorkSpec workSpec = this.mWorkSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j));
            return getThis();
        }

        @RequiresApi(26)
        @NonNull
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, @NonNull Duration duration) {
            this.mBackoffCriteriaSet = true;
            WorkSpec workSpec = this.mWorkSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(duration.toMillis());
            return getThis();
        }

        @NonNull
        public final B setConstraints(@NonNull Constraints constraints) {
            this.mWorkSpec.constraints = constraints;
            return getThis();
        }

        @NonNull
        public final B setInputData(@NonNull Data data) {
            this.mWorkSpec.input = data;
            return getThis();
        }

        @NonNull
        public final B addTag(@NonNull String str) {
            this.mTags.add(str);
            return getThis();
        }

        @NonNull
        public final B keepResultsForAtLeast(long j, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.minimumRetentionDuration = timeUnit.toMillis(j);
            return getThis();
        }

        @RequiresApi(26)
        @NonNull
        public final B keepResultsForAtLeast(@NonNull Duration duration) {
            this.mWorkSpec.minimumRetentionDuration = duration.toMillis();
            return getThis();
        }

        @NonNull
        public final W build() {
            WorkRequest buildInternal = buildInternal();
            this.mId = UUID.randomUUID();
            this.mWorkSpec = new WorkSpec(this.mWorkSpec);
            this.mWorkSpec.id = this.mId.toString();
            return buildInternal;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NonNull
        public final B setInitialState(@NonNull State state) {
            this.mWorkSpec.state = state;
            return getThis();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NonNull
        public final B setInitialRunAttemptCount(int i) {
            this.mWorkSpec.runAttemptCount = i;
            return getThis();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NonNull
        public final B setPeriodStartTime(long j, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.periodStartTime = timeUnit.toMillis(j);
            return getThis();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NonNull
        public final B setScheduleRequestedAt(long j, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.scheduleRequestedAt = timeUnit.toMillis(j);
            return getThis();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected WorkRequest(@NonNull UUID uuid, @NonNull WorkSpec workSpec, @NonNull Set<String> set) {
        this.mId = uuid;
        this.mWorkSpec = workSpec;
        this.mTags = set;
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public String getStringId() {
        return this.mId.toString();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Set<String> getTags() {
        return this.mTags;
    }
}
