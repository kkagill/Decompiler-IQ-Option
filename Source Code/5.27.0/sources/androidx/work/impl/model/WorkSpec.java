package androidx.work.impl.model;

import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(indices = {@Index({"schedule_requested_at"})})
public class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG = Logger.tagWithPrefix("WorkSpec");
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new Function<List<WorkInfoPojo>, List<WorkInfo>>() {
        public List<WorkInfo> apply(List<WorkInfoPojo> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (WorkInfoPojo toWorkInfo : list) {
                arrayList.add(toWorkInfo.toWorkInfo());
            }
            return arrayList;
        }
    };
    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration = 30000;
    @ColumnInfo(name = "backoff_policy")
    @NonNull
    public BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
    @NonNull
    @Embedded
    public Constraints constraints = Constraints.NONE;
    @ColumnInfo(name = "flex_duration")
    public long flexDuration;
    @ColumnInfo(name = "id")
    @NonNull
    @PrimaryKey
    public String id;
    @ColumnInfo(name = "initial_delay")
    public long initialDelay;
    @ColumnInfo(name = "input")
    @NonNull
    public Data input = Data.EMPTY;
    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName = OverwritingInputMerger.class.getName();
    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;
    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;
    @ColumnInfo(name = "output")
    @NonNull
    public Data output = Data.EMPTY;
    @ColumnInfo(name = "period_start_time")
    public long periodStartTime;
    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;
    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt = -1;
    @ColumnInfo(name = "state")
    @NonNull
    public State state = State.ENQUEUED;
    @ColumnInfo(name = "worker_class_name")
    @NonNull
    public String workerClassName;

    public static class IdAndState {
        @ColumnInfo(name = "id")
        public String id;
        @ColumnInfo(name = "state")
        public State state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.state != idAndState.state) {
                return false;
            }
            return this.id.equals(idAndState.id);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }

    public static class WorkInfoPojo {
        @ColumnInfo(name = "id")
        public String id;
        @ColumnInfo(name = "output")
        public Data output;
        @ColumnInfo(name = "state")
        public State state;
        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> tags;

        public WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            String str = this.id;
            if (!str == null ? str.equals(workInfoPojo.id) : workInfoPojo.id == null) {
                return false;
            }
            if (this.state != workInfoPojo.state) {
                return false;
            }
            Data data = this.output;
            if (!data == null ? data.equals(workInfoPojo.output) : workInfoPojo.output == null) {
                return false;
            }
            List list = this.tags;
            if (list != null) {
                z = list.equals(workInfoPojo.tags);
            } else if (workInfoPojo.tags != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            State state = this.state;
            hashCode = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            Data data = this.output;
            hashCode = (hashCode + (data != null ? data.hashCode() : 0)) * 31;
            List list = this.tags;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }
    }

    public WorkSpec(@NonNull String str, @NonNull String str2) {
        this.id = str;
        this.workerClassName = str2;
    }

    public WorkSpec(@NonNull WorkSpec workSpec) {
        this.id = workSpec.id;
        this.workerClassName = workSpec.workerClassName;
        this.state = workSpec.state;
        this.inputMergerClassName = workSpec.inputMergerClassName;
        this.input = new Data(workSpec.input);
        this.output = new Data(workSpec.output);
        this.initialDelay = workSpec.initialDelay;
        this.intervalDuration = workSpec.intervalDuration;
        this.flexDuration = workSpec.flexDuration;
        this.constraints = new Constraints(workSpec.constraints);
        this.runAttemptCount = workSpec.runAttemptCount;
        this.backoffPolicy = workSpec.backoffPolicy;
        this.backoffDelayDuration = workSpec.backoffDelayDuration;
        this.periodStartTime = workSpec.periodStartTime;
        this.minimumRetentionDuration = workSpec.minimumRetentionDuration;
        this.scheduleRequestedAt = workSpec.scheduleRequestedAt;
    }

    public void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = WorkRequest.MAX_BACKOFF_MILLIS;
        }
        if (j < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.backoffDelayDuration = j;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public boolean isBackedOff() {
        return this.state == State.ENQUEUED && this.runAttemptCount > 0;
    }

    public void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)}), new Throwable[0]);
            j = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        }
        setPeriodic(j, j);
    }

    public void setPeriodic(long j, long j2) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)}), new Throwable[0]);
            j = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        }
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)}), new Throwable[0]);
            j2 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        }
        if (j2 > j) {
            Logger.get().warning(TAG, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)}), new Throwable[0]);
            j2 = j;
        }
        this.intervalDuration = j;
        this.flexDuration = j2;
    }

    public long calculateNextRunTime() {
        Object obj = null;
        long j;
        if (isBackedOff()) {
            if (this.backoffPolicy == BackoffPolicy.LINEAR) {
                obj = 1;
            }
            if (obj != null) {
                j = this.backoffDelayDuration * ((long) this.runAttemptCount);
            } else {
                j = (long) Math.scalb((float) this.backoffDelayDuration, this.runAttemptCount - 1);
            }
            return this.periodStartTime + Math.min(WorkRequest.MAX_BACKOFF_MILLIS, j);
        } else if (!isPeriodic()) {
            return this.periodStartTime + this.initialDelay;
        } else {
            if (VERSION.SDK_INT > 22) {
                return (this.periodStartTime + this.intervalDuration) - this.flexDuration;
            }
            if (this.flexDuration != this.intervalDuration) {
                obj = 1;
            }
            if (obj == null) {
                return this.periodStartTime + this.intervalDuration;
            }
            j = this.periodStartTime == 0 ? -1 * this.flexDuration : 0;
            long j2 = this.periodStartTime;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return (j2 + this.intervalDuration) + j;
        }
    }

    public boolean hasConstraints() {
        return Constraints.NONE.equals(this.constraints) ^ 1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.initialDelay != workSpec.initialDelay || this.intervalDuration != workSpec.intervalDuration || this.flexDuration != workSpec.flexDuration || this.runAttemptCount != workSpec.runAttemptCount || this.backoffDelayDuration != workSpec.backoffDelayDuration || this.periodStartTime != workSpec.periodStartTime || this.minimumRetentionDuration != workSpec.minimumRetentionDuration || this.scheduleRequestedAt != workSpec.scheduleRequestedAt || !this.id.equals(workSpec.id) || this.state != workSpec.state || !this.workerClassName.equals(workSpec.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (!str == null ? str.equals(workSpec.inputMergerClassName) : workSpec.inputMergerClassName == null) {
            return false;
        }
        if (!this.input.equals(workSpec.input) || !this.output.equals(workSpec.output) || !this.constraints.equals(workSpec.constraints)) {
            return false;
        }
        if (this.backoffPolicy != workSpec.backoffPolicy) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31;
        long j = this.initialDelay;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.intervalDuration;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.flexDuration;
        hashCode = (((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31;
        j = this.backoffDelayDuration;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.periodStartTime;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.minimumRetentionDuration;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.scheduleRequestedAt;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{WorkSpec: ");
        stringBuilder.append(this.id);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
