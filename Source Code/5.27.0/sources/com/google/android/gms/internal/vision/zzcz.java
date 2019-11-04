package com.google.android.gms.internal.vision;

public final class zzcz {

    public static final class zza extends zzfy<zza, zza> implements zzhh {
        private static volatile zzhq<zza> zzbf;
        private static final zza zzma = new zza();
        private int zzbg;
        private int zzlx = 1;
        private int zzly = 1;
        private String zzlz = "";

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zza, zza> implements zzhh {
            private zza() {
                super(zza.zzma);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zza() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzma, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002", new Object[]{"zzbg", "zzlx", zzdv.zzah(), "zzly", zzdy.zzah(), "zzlz"});
                case 4:
                    return zzma;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zza.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzma);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zza.class, zzma);
        }
    }

    public static final class zzb extends zzfy<zzb, zza> implements zzhh {
        private static volatile zzhq<zzb> zzbf;
        private static final zzb zzmc = new zzb();
        private zzge<zzh> zzmb = zzfy.zzey();

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzb, zza> implements zzhh {
            private zza() {
                super(zzb.zzmc);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzb() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzmc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzmb", zzh.class});
                case 4:
                    return zzmc;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzb.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzmc);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzb.class, zzmc);
        }
    }

    public static final class zzc extends zzfy<zzc, zza> implements zzhh {
        private static volatile zzhq<zzc> zzbf;
        private static final zzc zzmk = new zzc();
        private int zzbg;
        private String zzmd;
        private boolean zzme;
        private int zzmf;
        private long zzmg;
        private long zzmh;
        private long zzmi;
        private String zzmj;

        public enum zzb implements zzgb {
            REASON_UNKNOWN(0),
            REASON_MISSING(1),
            REASON_UPGRADE(2),
            REASON_INVALID(3);
            
            private static final zzgc<zzb> zzdv = null;
            private final int value;

            public final int zzr() {
                return this.value;
            }

            public static zzb zzs(int i) {
                if (i == 0) {
                    return REASON_UNKNOWN;
                }
                if (i == 1) {
                    return REASON_MISSING;
                }
                if (i != 2) {
                    return i != 3 ? null : REASON_INVALID;
                } else {
                    return REASON_UPGRADE;
                }
            }

            public static zzgd zzah() {
                return zzdc.zzhl;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzdv = new zzdb();
            }
        }

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzc, zza> implements zzhh {
            private zza() {
                super(zzc.zzmk);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzc() {
            String str = "";
            this.zzmd = str;
            this.zzmj = str;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzmk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\b\u0006", new Object[]{"zzbg", "zzmd", "zzme", "zzmf", zzb.zzah(), "zzmg", "zzmh", "zzmi", "zzmj"});
                case 4:
                    return zzmk;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzc.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzmk);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzc.class, zzmk);
        }
    }

    public static final class zzd extends zzfy<zzd, zza> implements zzhh {
        private static volatile zzhq<zzd> zzbf;
        private static final zzd zzmy = new zzd();
        private int zzbg;
        private String zzmq;
        private String zzmr;
        private zzge<String> zzms = zzfy.zzey();
        private int zzmt;
        private String zzmu;
        private long zzmv;
        private long zzmw;
        private zzge<zzi> zzmx;

        public enum zzb implements zzgb {
            RESULT_UNKNOWN(0),
            RESULT_SUCCESS(1),
            RESULT_FAIL(2),
            RESULT_SKIPPED(3);
            
            private static final zzgc<zzb> zzdv = null;
            private final int value;

            public final int zzr() {
                return this.value;
            }

            public static zzb zzt(int i) {
                if (i == 0) {
                    return RESULT_UNKNOWN;
                }
                if (i == 1) {
                    return RESULT_SUCCESS;
                }
                if (i != 2) {
                    return i != 3 ? null : RESULT_SKIPPED;
                } else {
                    return RESULT_FAIL;
                }
            }

            public static zzgd zzah() {
                return zzde.zzhl;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzdv = new zzdd();
            }
        }

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzd, zza> implements zzhh {
            private zza() {
                super(zzd.zzmy);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzd() {
            String str = "";
            this.zzmq = str;
            this.zzmr = str;
            this.zzmu = str;
            this.zzmx = zzfy.zzey();
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzmy, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001a\u0004\f\u0002\u0005\b\u0003\u0006\u0002\u0004\u0007\u0002\u0005\b\u001b", new Object[]{"zzbg", "zzmq", "zzmr", "zzms", "zzmt", zzb.zzah(), "zzmu", "zzmv", "zzmw", "zzmx", zzi.class});
                case 4:
                    return zzmy;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzd.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzmy);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzd.class, zzmy);
        }
    }

    public static final class zze extends zzfy<zze, zza> implements zzhh {
        private static volatile zzhq<zze> zzbf;
        private static final zze zznk = new zze();
        private int zzbg;
        private float zzne;
        private float zznf;
        private float zzng;
        private float zznh;
        private float zzni;
        private float zznj;

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zze, zza> implements zzhh {
            private zza() {
                super(zze.zznk);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zze() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zznk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzne", "zznf", "zzng", "zznh", "zzni", "zznj"});
                case 4:
                    return zznk;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zze.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zznk);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zze.class, zznk);
        }
    }

    public static final class zzf extends zzfy<zzf, zza> implements zzhh {
        private static volatile zzhq<zzf> zzbf;
        private static final zzf zzno = new zzf();
        private int zzbg;
        private long zzhr;
        private int zzlx;
        private long zznl;
        private long zznm;
        private long zznn;

        public enum zzb implements zzgb {
            FORMAT_UNKNOWN(0),
            FORMAT_LUMINANCE(1),
            FORMAT_RGB8(2),
            FORMAT_MONOCHROME(3);
            
            private static final zzgc<zzb> zzdv = null;
            private final int value;

            public final int zzr() {
                return this.value;
            }

            public static zzb zzu(int i) {
                if (i == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i == 1) {
                    return FORMAT_LUMINANCE;
                }
                if (i != 2) {
                    return i != 3 ? null : FORMAT_MONOCHROME;
                } else {
                    return FORMAT_RGB8;
                }
            }

            public static zzgd zzah() {
                return zzdg.zzhl;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzdv = new zzdf();
            }
        }

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzf, zza> implements zzhh {
            private zza() {
                super(zzf.zzno);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzf() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzno, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0004\u0005\u0002\u0003", new Object[]{"zzbg", "zzlx", zzb.zzah(), "zznl", "zznm", "zzhr", "zznn"});
                case 4:
                    return zzno;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzf.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzno);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzf.class, zzno);
        }
    }

    public static final class zzg extends zzfy<zzg, zza> implements zzhh {
        private static volatile zzhq<zzg> zzbf;
        private static final zzg zznu = new zzg();
        private int zzbg;
        private long zzmv;
        private long zzmw;

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzg, zza> implements zzhh {
            private zza() {
                super(zzg.zznu);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzg() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zznu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001", new Object[]{"zzbg", "zzmv", "zzmw"});
                case 4:
                    return zznu;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzg.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zznu);
                                zzbf = obj3;
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

        public static zzhq<zzg> zzbx() {
            return (zzhq) zznu.zza(com.google.android.gms.internal.vision.zzfy.zzg.zzxd, null, null);
        }

        static {
            zzfy.zza(zzg.class, zznu);
        }
    }

    public static final class zzh extends zzfy<zzh, zza> implements zzhh {
        private static volatile zzhq<zzh> zzbf;
        private static final zzh zznx = new zzh();
        private int zzbg;
        private int zznv;
        private int zznw;

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzh, zza> implements zzhh {
            private zza() {
                super(zzh.zznx);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzh() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zznx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzbg", "zznv", "zznw"});
                case 4:
                    return zznx;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzh.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zznx);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzh.class, zznx);
        }
    }

    public static final class zzi extends zzfy<zzi, zza> implements zzhh {
        private static volatile zzhq<zzi> zzbf;
        private static final zzi zzoc = new zzi();
        private int zzbg;
        private zzb zzny;
        private int zznz;
        private zze zzoa;
        private zza zzob;

        public static final class zza extends com.google.android.gms.internal.vision.zzfy.zza<zzi, zza> implements zzhh {
            private zza() {
                super(zzi.zzoc);
            }

            /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        private zzi() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    return zzfy.zza((zzhf) zzoc, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\u0004\u0001\u0010\t\u0002\u0011\t\u0003", new Object[]{"zzbg", "zzny", "zznz", "zzoa", "zzob"});
                case 4:
                    return zzoc;
                case 5:
                    Object obj3 = zzbf;
                    if (obj3 == null) {
                        synchronized (zzi.class) {
                            obj3 = zzbf;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.vision.zzfy.zzb(zzoc);
                                zzbf = obj3;
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

        static {
            zzfy.zza(zzi.class, zzoc);
        }
    }
}
