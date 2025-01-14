package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public abstract int getEventType();

    public abstract long getTimeMillis();

    public abstract long zzu();

    public abstract String zzv();

    public String toString() {
        long timeMillis = getTimeMillis();
        int eventType = getEventType();
        long zzu = zzu();
        String zzv = zzv();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzv).length() + 53);
        stringBuilder.append(timeMillis);
        String str = "\t";
        stringBuilder.append(str);
        stringBuilder.append(eventType);
        stringBuilder.append(str);
        stringBuilder.append(zzu);
        stringBuilder.append(zzv);
        return stringBuilder.toString();
    }
}
