package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbk {

    public static final class zza extends zzey<zza, zza> implements zzgk {
        private static final zza zzun = new zza();
        private static volatile zzgr<zza> zzuo;
        private int zzue;
        private int zzuf;
        private String zzug = "";
        private zzff<zzb> zzuh = zzey.zzun();
        private boolean zzui;
        private zzc zzuj;
        private boolean zzuk;
        private boolean zzul;
        private boolean zzum;

        public static final class zza extends com.google.android.gms.internal.measurement.zzey.zza<zza, zza> implements zzgk {
            private zza() {
                super(zza.zzun);
            }

            public final String zzjz() {
                return ((zza) this.zzahx).zzjz();
            }

            public final zza zzbs(String str) {
                zzuc();
                ((zza) this.zzahx).zzbt(str);
                return this;
            }

            public final int zzka() {
                return ((zza) this.zzahx).zzka();
            }

            public final zzb zze(int i) {
                return ((zza) this.zzahx).zze(i);
            }

            public final zza zza(int i, zzb zzb) {
                zzuc();
                ((zza) this.zzahx).zzb(i, zzb);
                return this;
            }

            /* synthetic */ zza(zzbj zzbj) {
                this();
            }
        }

        private zza() {
        }

        public final boolean zzkb() {
            return (this.zzue & 1) != 0;
        }

        public final int getId() {
            return this.zzuf;
        }

        public final String zzjz() {
            return this.zzug;
        }

        private final void zzbt(String str) {
            if (str != null) {
                this.zzue |= 2;
                this.zzug = str;
                return;
            }
            throw new NullPointerException();
        }

        public final List<zzb> zzkc() {
            return this.zzuh;
        }

        public final int zzka() {
            return this.zzuh.size();
        }

        public final zzb zze(int i) {
            return (zzb) this.zzuh.get(i);
        }

        private final void zzb(int i, zzb zzb) {
            if (zzb != null) {
                if (!this.zzuh.zzrx()) {
                    this.zzuh = zzey.zza(this.zzuh);
                }
                this.zzuh.set(i, zzb);
                return;
            }
            throw new NullPointerException();
        }

        public final boolean zzkd() {
            return (this.zzue & 8) != 0;
        }

        public final zzc zzke() {
            zzc zzc = this.zzuj;
            return zzc == null ? zzc.zzle() : zzc;
        }

        public final boolean zzkf() {
            return this.zzuk;
        }

        public final boolean zzkg() {
            return this.zzul;
        }

        public final boolean zzkh() {
            return (this.zzue & 64) != 0;
        }

        public final boolean zzki() {
            return this.zzum;
        }

        public static zza zza(byte[] bArr, zzel zzel) {
            return (zza) zzey.zza(zzun, bArr, zzel);
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    return zzey.zza((zzgi) zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzue", "zzuf", "zzug", "zzuh", zzb.class, "zzui", "zzuj", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzun;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zza.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.measurement.zzey.zzc(zzun);
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
            return (zzgr) zzun.zza(com.google.android.gms.internal.measurement.zzey.zzd.zzaij, null, null);
        }

        static {
            zzey.zza(zza.class, zzun);
        }
    }

    public static final class zzb extends zzey<zzb, zza> implements zzgk {
        private static volatile zzgr<zzb> zzuo;
        private static final zzb zzut = new zzb();
        private int zzue;
        private zze zzup;
        private zzc zzuq;
        private boolean zzur;
        private String zzus = "";

        public static final class zza extends com.google.android.gms.internal.measurement.zzey.zza<zzb, zza> implements zzgk {
            private zza() {
                super(zzb.zzut);
            }

            public final zza zzbu(String str) {
                zzuc();
                ((zzb) this.zzahx).zzbv(str);
                return this;
            }

            /* synthetic */ zza(zzbj zzbj) {
                this();
            }
        }

        private zzb() {
        }

        public final boolean zzkl() {
            return (this.zzue & 1) != 0;
        }

        public final zze zzkm() {
            zze zze = this.zzup;
            return zze == null ? zze.zzls() : zze;
        }

        public final boolean zzkn() {
            return (this.zzue & 2) != 0;
        }

        public final zzc zzko() {
            zzc zzc = this.zzuq;
            return zzc == null ? zzc.zzle() : zzc;
        }

        public final boolean zzkp() {
            return (this.zzue & 4) != 0;
        }

        public final boolean zzkq() {
            return this.zzur;
        }

        public final String zzkr() {
            return this.zzus;
        }

        private final void zzbv(String str) {
            if (str != null) {
                this.zzue |= 8;
                this.zzus = str;
                return;
            }
            throw new NullPointerException();
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzey.zza((zzgi) zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzue", "zzup", "zzuq", "zzur", "zzus"});
                case 4:
                    return zzut;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zzb.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.measurement.zzey.zzc(zzut);
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

        public static zzb zzks() {
            return zzut;
        }

        static {
            zzey.zza(zzb.class, zzut);
        }
    }

    public static final class zzc extends zzey<zzc, zza> implements zzgk {
        private static volatile zzgr<zzc> zzuo;
        private static final zzc zzuz = new zzc();
        private int zzue;
        private int zzuu;
        private boolean zzuv;
        private String zzuw;
        private String zzux;
        private String zzuy;

        public enum zzb implements zzfc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzfb<zzb> zzvf = null;
            private final int value;

            public final int zzlg() {
                return this.value;
            }

            public static zzb zzf(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i != 3) {
                    return i != 4 ? null : BETWEEN;
                } else {
                    return EQUAL;
                }
            }

            public static zzfe zzlh() {
                return zzbm.zzvk;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzvf = new zzbl();
            }
        }

        public static final class zza extends com.google.android.gms.internal.measurement.zzey.zza<zzc, zza> implements zzgk {
            private zza() {
                super(zzc.zzuz);
            }

            /* synthetic */ zza(zzbj zzbj) {
                this();
            }
        }

        private zzc() {
            String str = "";
            this.zzuw = str;
            this.zzux = str;
            this.zzuy = str;
        }

        public final boolean zzku() {
            return (this.zzue & 1) != 0;
        }

        public final zzb zzkv() {
            zzb zzf = zzb.zzf(this.zzuu);
            return zzf == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzf;
        }

        public final boolean zzkw() {
            return (this.zzue & 2) != 0;
        }

        public final boolean zzkx() {
            return this.zzuv;
        }

        public final boolean zzky() {
            return (this.zzue & 4) != 0;
        }

        public final String zzkz() {
            return this.zzuw;
        }

        public final boolean zzla() {
            return (this.zzue & 8) != 0;
        }

        public final String zzlb() {
            return this.zzux;
        }

        public final boolean zzlc() {
            return (this.zzue & 16) != 0;
        }

        public final String zzld() {
            return this.zzuy;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzey.zza((zzgi) zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzue", "zzuu", zzb.zzlh(), "zzuv", "zzuw", "zzux", "zzuy"});
                case 4:
                    return zzuz;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zzc.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.measurement.zzey.zzc(zzuz);
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

        public static zzc zzle() {
            return zzuz;
        }

        static {
            zzey.zza(zzc.class, zzuz);
        }
    }

    public static final class zzd extends zzey<zzd, zza> implements zzgk {
        private static volatile zzgr<zzd> zzuo;
        private static final zzd zzvj = new zzd();
        private int zzue;
        private int zzuf;
        private boolean zzuk;
        private boolean zzul;
        private boolean zzum;
        private String zzvh = "";
        private zzb zzvi;

        public static final class zza extends com.google.android.gms.internal.measurement.zzey.zza<zzd, zza> implements zzgk {
            private zza() {
                super(zzd.zzvj);
            }

            public final zza zzbw(String str) {
                zzuc();
                ((zzd) this.zzahx).setPropertyName(str);
                return this;
            }

            /* synthetic */ zza(zzbj zzbj) {
                this();
            }
        }

        private zzd() {
        }

        public final boolean zzkb() {
            return (this.zzue & 1) != 0;
        }

        public final int getId() {
            return this.zzuf;
        }

        public final String getPropertyName() {
            return this.zzvh;
        }

        private final void setPropertyName(String str) {
            if (str != null) {
                this.zzue |= 2;
                this.zzvh = str;
                return;
            }
            throw new NullPointerException();
        }

        public final zzb zzli() {
            zzb zzb = this.zzvi;
            return zzb == null ? zzb.zzks() : zzb;
        }

        public final boolean zzkf() {
            return this.zzuk;
        }

        public final boolean zzkg() {
            return this.zzul;
        }

        public final boolean zzkh() {
            return (this.zzue & 32) != 0;
        }

        public final boolean zzki() {
            return this.zzum;
        }

        public static zzd zzb(byte[] bArr, zzel zzel) {
            return (zzd) zzey.zza(zzvj, bArr, zzel);
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzey.zza((zzgi) zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzue", "zzuf", "zzvh", "zzvi", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzvj;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zzd.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.measurement.zzey.zzc(zzvj);
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

        public static zzgr<zzd> zzkj() {
            return (zzgr) zzvj.zza(com.google.android.gms.internal.measurement.zzey.zzd.zzaij, null, null);
        }

        static {
            zzey.zza(zzd.class, zzvj);
        }
    }

    public static final class zze extends zzey<zze, zzb> implements zzgk {
        private static volatile zzgr<zze> zzuo;
        private static final zze zzvp = new zze();
        private int zzue;
        private int zzvl;
        private String zzvm = "";
        private boolean zzvn;
        private zzff<String> zzvo = zzey.zzun();

        public enum zza implements zzfc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzfb<zza> zzvf = null;
            private final int value;

            public final int zzlg() {
                return this.value;
            }

            public static zza zzh(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzfe zzlh() {
                return zzbn.zzvk;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzvf = new zzbo();
            }
        }

        public static final class zzb extends com.google.android.gms.internal.measurement.zzey.zza<zze, zzb> implements zzgk {
            private zzb() {
                super(zze.zzvp);
            }

            /* synthetic */ zzb(zzbj zzbj) {
                this();
            }
        }

        private zze() {
        }

        public final boolean zzlk() {
            return (this.zzue & 1) != 0;
        }

        public final zza zzll() {
            zza zzh = zza.zzh(this.zzvl);
            return zzh == null ? zza.UNKNOWN_MATCH_TYPE : zzh;
        }

        public final boolean zzlm() {
            return (this.zzue & 2) != 0;
        }

        public final String zzln() {
            return this.zzvm;
        }

        public final boolean zzlo() {
            return (this.zzue & 4) != 0;
        }

        public final boolean zzlp() {
            return this.zzvn;
        }

        public final List<String> zzlq() {
            return this.zzvo;
        }

        public final int zzlr() {
            return this.zzvo.size();
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zzb();
                case 3:
                    return zzey.zza((zzgi) zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzue", "zzvl", zza.zzlh(), "zzvm", "zzvn", "zzvo"});
                case 4:
                    return zzvp;
                case 5:
                    Object obj3 = zzuo;
                    if (obj3 == null) {
                        synchronized (zze.class) {
                            obj3 = zzuo;
                            if (obj3 == null) {
                                obj3 = new com.google.android.gms.internal.measurement.zzey.zzc(zzvp);
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

        public static zze zzls() {
            return zzvp;
        }

        static {
            zzey.zza(zze.class, zzvp);
        }
    }
}
