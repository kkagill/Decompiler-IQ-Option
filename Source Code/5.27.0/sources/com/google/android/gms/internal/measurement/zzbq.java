package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey.zzc;
import com.google.android.gms.internal.measurement.zzey.zzd;

public final class zzbq {

    public static final class zza extends zzey<zza, zza> implements zzgk {
        private static volatile zzgr<zza> zzuo;
        private static final zza zzwa = new zza();
        private int zzue;
        private String zzvy;
        private String zzvz;

        public static final class zza extends com.google.android.gms.internal.measurement.zzey.zza<zza, zza> implements zzgk {
            private zza() {
                super(zza.zzwa);
            }

            /* synthetic */ zza(zzbp zzbp) {
                this();
            }
        }

        private zza() {
            String str = "";
            this.zzvy = str;
            this.zzvz = str;
        }

        public final String getKey() {
            return this.zzvy;
        }

        public final String getValue() {
            return this.zzvz;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbp.zzud[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    return zzey.zza((zzgi) zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzue", "zzvy", "zzvz"});
                case 4:
                    return zzwa;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zza.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new zzc(zzwa);
                                zzuo = obj3;
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

        public static zzgr<zza> zzkj() {
            return (zzgr) zzwa.zza(zzd.zzaij, null, null);
        }

        static {
            zzey.zza(zza.class, zzwa);
        }
    }
}
