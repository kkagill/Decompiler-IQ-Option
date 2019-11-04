package com.google.android.gms.internal.clearcut;

public final class zzgt {

    public static final class zza extends zzcg<zza, zza> implements zzdq {
        private static volatile zzdz<zza> zzbg;
        private static final zza zzbil = new zza();

        public enum zzb implements zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);
            
            private static final zzck<zzb> zzbq = null;
            private final int value;

            static {
                zzbq = new zzgv();
            }

            private zzb(int i) {
                this.value = i;
            }

            public static zzb zzbe(int i) {
                return i != 0 ? i != 1 ? i != 2 ? null : LATCHSKY_DEVICE : SIDEWINDER_DEVICE : NO_RESTRICTION;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            public final int zzc() {
                return this.value;
            }
        }

        public static final class zza extends com.google.android.gms.internal.clearcut.zzcg.zza<zza, zza> implements zzdq {
            private zza() {
                super(zza.zzbil);
            }

            /* synthetic */ zza(zzgu zzgu) {
                this();
            }
        }

        static {
            zzcg.zza(zza.class, zzbil);
        }

        private zza() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgu.zzba[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    return zzcg.zza((zzdo) zzbil, "\u0001\u0000", null);
                case 4:
                    return zzbil;
                case 5:
                    Object obj3 = zzbg;
                    if (obj3 == null) {
                        synchronized (zza.class) {
                            obj3 = zzbg;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzbil);
                                zzbg = obj3;
                            }
                        }
                    }
                    return obj3;
                case 6:
                    return Byte.valueOf((byte) 1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
