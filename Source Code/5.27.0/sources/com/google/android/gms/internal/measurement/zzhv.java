package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzhv {
    private static final Logger logger = Logger.getLogger(zzhv.class.getName());
    private static final Class<?> zzacx = zzdi.zzrw();
    private static final boolean zzaec = zzww();
    private static final Unsafe zzaki = zzwv();
    private static final boolean zzame = zzk(Long.TYPE);
    private static final boolean zzamf = zzk(Integer.TYPE);
    private static final zzd zzamg;
    private static final boolean zzamh = zzwx();
    static final long zzami = ((long) zzi(byte[].class));
    private static final long zzamj = ((long) zzi(boolean[].class));
    private static final long zzamk = ((long) zzj(boolean[].class));
    private static final long zzaml = ((long) zzi(int[].class));
    private static final long zzamm = ((long) zzj(int[].class));
    private static final long zzamn = ((long) zzi(long[].class));
    private static final long zzamo = ((long) zzj(long[].class));
    private static final long zzamp = ((long) zzi(float[].class));
    private static final long zzamq = ((long) zzj(float[].class));
    private static final long zzamr = ((long) zzi(double[].class));
    private static final long zzams = ((long) zzj(double[].class));
    private static final long zzamt = ((long) zzi(Object[].class));
    private static final long zzamu = ((long) zzj(Object[].class));
    private static final long zzamv;
    private static final int zzamw = ((int) (zzami & 7));
    static final boolean zzamx = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static abstract class zzd {
        Unsafe zzana;

        zzd(Unsafe unsafe) {
            this.zzana = unsafe;
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzana.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzana.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzana.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzana.putLong(obj, j, j2);
        }
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final byte zzy(Object obj, long j) {
            if (zzhv.zzamx) {
                return zzhv.zzq(obj, j);
            }
            return zzhv.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzhv.zzamx) {
                zzhv.zza(obj, j, b);
            } else {
                zzhv.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzhv.zzamx) {
                return zzhv.zzs(obj, j);
            }
            return zzhv.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzhv.zzamx) {
                zzhv.zzb(obj, j, z);
            } else {
                zzhv.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            this.zzana.putByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzana.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzana.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzana.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzana.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzana.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzana.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzana.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzana.putDouble(obj, j, d);
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzana.copyMemory(bArr, zzhv.zzami + j, null, j2, j3);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            if (zzhv.zzamx) {
                return zzhv.zzq(obj, j);
            }
            return zzhv.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzhv.zzamx) {
                zzhv.zza(obj, j, b);
            } else {
                zzhv.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzhv.zzamx) {
                return zzhv.zzs(obj, j);
            }
            return zzhv.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzhv.zzamx) {
                zzhv.zzb(obj, j, z);
            } else {
                zzhv.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    private zzhv() {
    }

    static boolean zzwt() {
        return zzaec;
    }

    static boolean zzwu() {
        return zzamh;
    }

    static <T> T zzh(Class<T> cls) {
        try {
            return zzaki.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        return zzaec ? zzamg.zzana.arrayBaseOffset(cls) : -1;
    }

    private static int zzj(Class<?> cls) {
        return zzaec ? zzamg.zzana.arrayIndexScale(cls) : -1;
    }

    static int zzk(Object obj, long j) {
        return zzamg.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzamg.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzamg.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzamg.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzamg.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzamg.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzamg.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzamg.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzamg.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzamg.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzamg.zzana.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzamg.zzana.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzamg.zzy(bArr, zzami + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzamg.zze(bArr, zzami + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzamg.zza(bArr, j, j2, j3);
    }

    static void zza(long j, byte b) {
        zzamg.zza(j, b);
    }

    static long zzb(ByteBuffer byteBuffer) {
        return zzamg.zzl(byteBuffer, zzamv);
    }

    static Unsafe zzwv() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhx());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzww() {
        Unsafe unsafe = zzaki;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzdi.zzrv()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    private static boolean zzwx() {
        String str = "copyMemory";
        String str2 = "getLong";
        Unsafe unsafe = zzaki;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod(str2, new Class[]{Object.class, Long.TYPE});
            if (zzwy() == null) {
                return false;
            }
            if (zzdi.zzrv()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod(str2, new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = logger;
            Level level = Level.WARNING;
            str = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(str);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }

    private static boolean zzk(Class<?> cls) {
        if (!zzdi.zzrv()) {
            return false;
        }
        try {
            Class cls2 = zzacx;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field zzwy() {
        Field zzb;
        if (zzdi.zzrv()) {
            zzb = zzb(Buffer.class, "effectiveDirectAddress");
            if (zzb != null) {
                return zzb;
            }
        }
        zzb = zzb(Buffer.class, "address");
        return (zzb == null || zzb.getType() != Long.TYPE) ? null : zzb;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    private static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    private static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    private static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    private static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != (byte) 0;
    }

    private static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != (byte) 0;
    }

    private static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, (byte) z);
    }

    private static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, (byte) z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fc  */
    static {
        /*
        r0 = com.google.android.gms.internal.measurement.zzhv.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        logger = r0;
        r0 = zzwv();
        zzaki = r0;
        r0 = com.google.android.gms.internal.measurement.zzdi.zzrw();
        zzacx = r0;
        r0 = java.lang.Long.TYPE;
        r0 = zzk(r0);
        zzame = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = zzk(r0);
        zzamf = r0;
        r0 = zzaki;
        r1 = 0;
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0053;
    L_0x002e:
        r0 = com.google.android.gms.internal.measurement.zzdi.zzrv();
        if (r0 == 0) goto L_0x004c;
    L_0x0034:
        r0 = zzame;
        if (r0 == 0) goto L_0x0040;
    L_0x0038:
        r1 = new com.google.android.gms.internal.measurement.zzhv$zzc;
        r0 = zzaki;
        r1.<init>(r0);
        goto L_0x0053;
    L_0x0040:
        r0 = zzamf;
        if (r0 == 0) goto L_0x0053;
    L_0x0044:
        r1 = new com.google.android.gms.internal.measurement.zzhv$zza;
        r0 = zzaki;
        r1.<init>(r0);
        goto L_0x0053;
    L_0x004c:
        r1 = new com.google.android.gms.internal.measurement.zzhv$zzb;
        r0 = zzaki;
        r1.<init>(r0);
    L_0x0053:
        zzamg = r1;
        r0 = zzwx();
        zzamh = r0;
        r0 = zzww();
        zzaec = r0;
        r0 = byte[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzami = r0;
        r0 = boolean[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzamj = r0;
        r0 = boolean[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzamk = r0;
        r0 = int[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzaml = r0;
        r0 = int[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzamm = r0;
        r0 = long[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzamn = r0;
        r0 = long[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzamo = r0;
        r0 = float[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzamp = r0;
        r0 = float[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzamq = r0;
        r0 = double[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzamr = r0;
        r0 = double[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzams = r0;
        r0 = java.lang.Object[].class;
        r0 = zzi(r0);
        r0 = (long) r0;
        zzamt = r0;
        r0 = java.lang.Object[].class;
        r0 = zzj(r0);
        r0 = (long) r0;
        zzamu = r0;
        r0 = zzwy();
        if (r0 == 0) goto L_0x00e8;
    L_0x00dc:
        r1 = zzamg;
        if (r1 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e8;
    L_0x00e1:
        r1 = r1.zzana;
        r0 = r1.objectFieldOffset(r0);
        goto L_0x00ea;
    L_0x00e8:
        r0 = -1;
    L_0x00ea:
        zzamv = r0;
        r0 = zzami;
        r2 = 7;
        r0 = r0 & r2;
        r1 = (int) r0;
        zzamw = r1;
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x00fe;
    L_0x00fc:
        r0 = 1;
        goto L_0x00ff;
    L_0x00fe:
        r0 = 0;
    L_0x00ff:
        zzamx = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhv.<clinit>():void");
    }
}
