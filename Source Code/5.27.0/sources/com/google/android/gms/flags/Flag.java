package com.google.android.gms.flags;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
public abstract class Flag<T> {
    private final String mKey;
    private final int zze;
    private final T zzf;

    @Deprecated
    public static class BooleanFlag extends Flag<Boolean> {
        public BooleanFlag(int i, String str, Boolean bool) {
            super(i, str, bool, null);
        }

        private final Boolean zzb(zzc zzc) {
            try {
                return Boolean.valueOf(zzc.getBooleanFlagValue(getKey(), ((Boolean) zzb()).booleanValue(), getSource()));
            } catch (RemoteException unused) {
                return (Boolean) zzb();
            }
        }

        public final /* synthetic */ Object zza(zzc zzc) {
            return zzb(zzc);
        }
    }

    @KeepForSdk
    @Deprecated
    public static class IntegerFlag extends Flag<Integer> {
        public IntegerFlag(int i, String str, Integer num) {
            super(i, str, num, null);
        }

        private final Integer zzc(zzc zzc) {
            try {
                return Integer.valueOf(zzc.getIntFlagValue(getKey(), ((Integer) zzb()).intValue(), getSource()));
            } catch (RemoteException unused) {
                return (Integer) zzb();
            }
        }

        public final /* synthetic */ Object zza(zzc zzc) {
            return zzc(zzc);
        }
    }

    @KeepForSdk
    @Deprecated
    public static class LongFlag extends Flag<Long> {
        public LongFlag(int i, String str, Long l) {
            super(i, str, l, null);
        }

        private final Long zzd(zzc zzc) {
            try {
                return Long.valueOf(zzc.getLongFlagValue(getKey(), ((Long) zzb()).longValue(), getSource()));
            } catch (RemoteException unused) {
                return (Long) zzb();
            }
        }

        public final /* synthetic */ Object zza(zzc zzc) {
            return zzd(zzc);
        }
    }

    @KeepForSdk
    @Deprecated
    public static class StringFlag extends Flag<String> {
        public StringFlag(int i, String str, String str2) {
            super(i, str, str2, null);
        }

        private final String zze(zzc zzc) {
            try {
                return zzc.getStringFlagValue(getKey(), (String) zzb(), getSource());
            } catch (RemoteException unused) {
                return (String) zzb();
            }
        }

        public final /* synthetic */ Object zza(zzc zzc) {
            return zze(zzc);
        }
    }

    private Flag(int i, String str, T t) {
        this.zze = i;
        this.mKey = str;
        this.zzf = t;
        Singletons.flagRegistry().zza(this);
    }

    public abstract T zza(zzc zzc);

    public final String getKey() {
        return this.mKey;
    }

    public final T zzb() {
        return this.zzf;
    }

    @KeepForSdk
    public T get() {
        return Singletons.zzd().zzb(this);
    }

    @KeepForSdk
    @Deprecated
    public static BooleanFlag define(int i, String str, Boolean bool) {
        return new BooleanFlag(i, str, bool);
    }

    @KeepForSdk
    @Deprecated
    public static IntegerFlag define(int i, String str, int i2) {
        return new IntegerFlag(i, str, Integer.valueOf(i2));
    }

    @KeepForSdk
    @Deprecated
    public static LongFlag define(int i, String str, long j) {
        return new LongFlag(i, str, Long.valueOf(j));
    }

    @KeepForSdk
    @Deprecated
    public static StringFlag define(int i, String str, String str2) {
        return new StringFlag(i, str, str2);
    }

    @Deprecated
    public final int getSource() {
        return this.zze;
    }

    /* synthetic */ Flag(int i, String str, Object obj, zza zza) {
        this(i, str, obj);
    }
}
