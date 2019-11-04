package androidx.work;

import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.room.ColumnInfo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class Constraints {
    public static final Constraints NONE = new Builder().build();
    @ColumnInfo(name = "content_uri_triggers")
    private ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();
    @ColumnInfo(name = "required_network_type")
    private NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
    @ColumnInfo(name = "requires_battery_not_low")
    private boolean mRequiresBatteryNotLow;
    @ColumnInfo(name = "requires_charging")
    private boolean mRequiresCharging;
    @ColumnInfo(name = "requires_device_idle")
    private boolean mRequiresDeviceIdle;
    @ColumnInfo(name = "requires_storage_not_low")
    private boolean mRequiresStorageNotLow;
    @ColumnInfo(name = "trigger_content_update_delay")
    private long mTriggerContentUpdateDelay = -1;
    @ColumnInfo(name = "trigger_max_content_delay")
    private long mTriggerMaxContentDelay = -1;

    public static final class Builder {
        ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();
        NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        boolean mRequiresBatteryNotLow = false;
        boolean mRequiresCharging = false;
        boolean mRequiresDeviceIdle = false;
        boolean mRequiresStorageNotLow = false;
        long mTriggerContentMaxDelay = -1;
        long mTriggerContentUpdateDelay = -1;

        @NonNull
        public Builder setRequiresCharging(boolean z) {
            this.mRequiresCharging = z;
            return this;
        }

        @RequiresApi(23)
        @NonNull
        public Builder setRequiresDeviceIdle(boolean z) {
            this.mRequiresDeviceIdle = z;
            return this;
        }

        @NonNull
        public Builder setRequiredNetworkType(@NonNull NetworkType networkType) {
            this.mRequiredNetworkType = networkType;
            return this;
        }

        @NonNull
        public Builder setRequiresBatteryNotLow(boolean z) {
            this.mRequiresBatteryNotLow = z;
            return this;
        }

        @NonNull
        public Builder setRequiresStorageNotLow(boolean z) {
            this.mRequiresStorageNotLow = z;
            return this;
        }

        @RequiresApi(24)
        @NonNull
        public Builder addContentUriTrigger(@NonNull Uri uri, boolean z) {
            this.mContentUriTriggers.add(uri, z);
            return this;
        }

        @RequiresApi(24)
        @NonNull
        public Builder setTriggerContentUpdateDelay(long j, @NonNull TimeUnit timeUnit) {
            this.mTriggerContentUpdateDelay = timeUnit.toMillis(j);
            return this;
        }

        @RequiresApi(26)
        @NonNull
        public Builder setTriggerContentUpdateDelay(Duration duration) {
            this.mTriggerContentUpdateDelay = duration.toMillis();
            return this;
        }

        @RequiresApi(24)
        @NonNull
        public Builder setTriggerContentMaxDelay(long j, @NonNull TimeUnit timeUnit) {
            this.mTriggerContentMaxDelay = timeUnit.toMillis(j);
            return this;
        }

        @RequiresApi(26)
        @NonNull
        public Builder setTriggerContentMaxDelay(Duration duration) {
            this.mTriggerContentMaxDelay = duration.toMillis();
            return this;
        }

        @NonNull
        public Constraints build() {
            return new Constraints(this);
        }
    }

    Constraints(Builder builder) {
        this.mRequiresCharging = builder.mRequiresCharging;
        boolean z = VERSION.SDK_INT >= 23 && builder.mRequiresDeviceIdle;
        this.mRequiresDeviceIdle = z;
        this.mRequiredNetworkType = builder.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = builder.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = builder.mRequiresStorageNotLow;
        if (VERSION.SDK_INT >= 24) {
            this.mContentUriTriggers = builder.mContentUriTriggers;
            this.mTriggerContentUpdateDelay = builder.mTriggerContentUpdateDelay;
            this.mTriggerMaxContentDelay = builder.mTriggerContentMaxDelay;
        }
    }

    public Constraints(@NonNull Constraints constraints) {
        this.mRequiresCharging = constraints.mRequiresCharging;
        this.mRequiresDeviceIdle = constraints.mRequiresDeviceIdle;
        this.mRequiredNetworkType = constraints.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = constraints.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = constraints.mRequiresStorageNotLow;
        this.mContentUriTriggers = constraints.mContentUriTriggers;
    }

    @NonNull
    public NetworkType getRequiredNetworkType() {
        return this.mRequiredNetworkType;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRequiredNetworkType(@NonNull NetworkType networkType) {
        this.mRequiredNetworkType = networkType;
    }

    public boolean requiresCharging() {
        return this.mRequiresCharging;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRequiresCharging(boolean z) {
        this.mRequiresCharging = z;
    }

    @RequiresApi(23)
    public boolean requiresDeviceIdle() {
        return this.mRequiresDeviceIdle;
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRequiresDeviceIdle(boolean z) {
        this.mRequiresDeviceIdle = z;
    }

    public boolean requiresBatteryNotLow() {
        return this.mRequiresBatteryNotLow;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRequiresBatteryNotLow(boolean z) {
        this.mRequiresBatteryNotLow = z;
    }

    public boolean requiresStorageNotLow() {
        return this.mRequiresStorageNotLow;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRequiresStorageNotLow(boolean z) {
        this.mRequiresStorageNotLow = z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public long getTriggerContentUpdateDelay() {
        return this.mTriggerContentUpdateDelay;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setTriggerContentUpdateDelay(long j) {
        this.mTriggerContentUpdateDelay = j;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public long getTriggerMaxContentDelay() {
        return this.mTriggerMaxContentDelay;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setTriggerMaxContentDelay(long j) {
        this.mTriggerMaxContentDelay = j;
    }

    @RequiresApi(24)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setContentUriTriggers(@Nullable ContentUriTriggers contentUriTriggers) {
        this.mContentUriTriggers = contentUriTriggers;
    }

    @RequiresApi(24)
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ContentUriTriggers getContentUriTriggers() {
        return this.mContentUriTriggers;
    }

    @RequiresApi(24)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean hasContentUriTriggers() {
        return this.mContentUriTriggers.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.mRequiresCharging == constraints.mRequiresCharging && this.mRequiresDeviceIdle == constraints.mRequiresDeviceIdle && this.mRequiresBatteryNotLow == constraints.mRequiresBatteryNotLow && this.mRequiresStorageNotLow == constraints.mRequiresStorageNotLow && this.mTriggerContentUpdateDelay == constraints.mTriggerContentUpdateDelay && this.mTriggerMaxContentDelay == constraints.mTriggerMaxContentDelay && this.mRequiredNetworkType == constraints.mRequiredNetworkType) {
            return this.mContentUriTriggers.equals(constraints.mContentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.mRequiredNetworkType.hashCode() * 31) + this.mRequiresCharging) * 31) + this.mRequiresDeviceIdle) * 31) + this.mRequiresBatteryNotLow) * 31) + this.mRequiresStorageNotLow) * 31;
        long j = this.mTriggerContentUpdateDelay;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.mTriggerMaxContentDelay;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.mContentUriTriggers.hashCode();
    }
}
