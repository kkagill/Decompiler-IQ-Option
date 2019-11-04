package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zztx {
    private static final Logger logger = Logger.getLogger(zztx.class.getName());
    private static final Class<?> zzavt = zzpp.zznb();
    private static final boolean zzawt = zzrp();
    private static final Unsafe zzbcx = zzro();
    private static final boolean zzbet = zzn(Long.TYPE);
    private static final boolean zzbeu = zzn(Integer.TYPE);
    private static final zzd zzbev;
    private static final boolean zzbew = zzrq();
    static final long zzbex = ((long) zzl(byte[].class));
    private static final long zzbey = ((long) zzl(boolean[].class));
    private static final long zzbez = ((long) zzm(boolean[].class));
    private static final long zzbfa = ((long) zzl(int[].class));
    private static final long zzbfb = ((long) zzm(int[].class));
    private static final long zzbfc = ((long) zzl(long[].class));
    private static final long zzbfd = ((long) zzm(long[].class));
    private static final long zzbfe = ((long) zzl(float[].class));
    private static final long zzbff = ((long) zzm(float[].class));
    private static final long zzbfg = ((long) zzl(double[].class));
    private static final long zzbfh = ((long) zzm(double[].class));
    private static final long zzbfi = ((long) zzl(Object[].class));
    private static final long zzbfj = ((long) zzm(Object[].class));
    private static final long zzbfk;
    private static final int zzbfl = ((int) (zzbex & 7));
    static final boolean zzbfm = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static abstract class zzd {
        Unsafe zzbfn;

        zzd(Unsafe unsafe) {
            this.zzbfn = unsafe;
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
            return this.zzbfn.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzbfn.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzbfn.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzbfn.putLong(obj, j, j2);
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
            if (zztx.zzbfm) {
                return zztx.zzq(obj, j);
            }
            return zztx.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zztx.zzbfm) {
                zztx.zza(obj, j, b);
            } else {
                zztx.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zztx.zzbfm) {
                return zztx.zzs(obj, j);
            }
            return zztx.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zztx.zzbfm) {
                zztx.zzb(obj, j, z);
            } else {
                zztx.zzc(obj, j, z);
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
            Memory.pokeByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            if (zztx.zzbfm) {
                return zztx.zzq(obj, j);
            }
            return zztx.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zztx.zzbfm) {
                zztx.zza(obj, j, b);
            } else {
                zztx.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zztx.zzbfm) {
                return zztx.zzs(obj, j);
            }
            return zztx.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zztx.zzbfm) {
                zztx.zzb(obj, j, z);
            } else {
                zztx.zzc(obj, j, z);
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

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            this.zzbfn.putByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzbfn.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzbfn.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzbfn.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzbfn.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzbfn.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzbfn.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzbfn.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzbfn.putDouble(obj, j, d);
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzbfn.copyMemory(bArr, zztx.zzbex + j, null, j2, j3);
        }
    }

    private zztx() {
    }

    static boolean zzrm() {
        return zzawt;
    }

    static boolean zzrn() {
        return zzbew;
    }

    static <T> T zzk(Class<T> cls) {
        try {
            return zzbcx.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzl(Class<?> cls) {
        return zzawt ? zzbev.zzbfn.arrayBaseOffset(cls) : -1;
    }

    private static int zzm(Class<?> cls) {
        return zzawt ? zzbev.zzbfn.arrayIndexScale(cls) : -1;
    }

    static int zzk(Object obj, long j) {
        return zzbev.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzbev.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzbev.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzbev.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzbev.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzbev.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzbev.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzbev.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzbev.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzbev.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzbev.zzbfn.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzbev.zzbfn.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzbev.zzy(bArr, zzbex + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzbev.zze(bArr, zzbex + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzbev.zza(bArr, j, j2, j3);
    }

    static void zza(long j, byte b) {
        zzbev.zza(j, b);
    }

    static long zzb(ByteBuffer byteBuffer) {
        return zzbev.zzl(byteBuffer, zzbfk);
    }

    static Unsafe zzro() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzty());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzrp() {
        Unsafe unsafe = zzbcx;
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
            if (zzpp.zzna()) {
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

    private static boolean zzrq() {
        String str = "copyMemory";
        String str2 = "getLong";
        Unsafe unsafe = zzbcx;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod(str2, new Class[]{Object.class, Long.TYPE});
            if (zzrr() == null) {
                return false;
            }
            if (zzpp.zzna()) {
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

    private static boolean zzn(Class<?> cls) {
        if (!zzpp.zzna()) {
            return false;
        }
        try {
            Class cls2 = zzavt;
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

    private static Field zzrr() {
        Field zzb;
        if (zzpp.zzna()) {
            zzb = zzb(Buffer.class, "effectiveDirectAddress");
            if (zzb != null) {
                return zzb;
            }
        }
        zzb = zzb(Buffer.class, "address");
        return (zzb == null || zzb.getType() != Long.TYPE) ? null : zzb;
    }

    static int zza(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0 || i + i3 > bArr.length || i2 + i3 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (zzawt) {
            int i5 = (zzbfl + i) & 7;
            while (i4 < i3 && (i5 & 7) != 0) {
                if (bArr[i + i4] != bArr2[i2 + i4]) {
                    return i4;
                }
                i4++;
                i5++;
            }
            i5 = ((i3 - i4) & -8) + i4;
            while (i4 < i5) {
                long j = (long) i4;
                long zzl = zzl(bArr, (zzbex + ((long) i)) + j);
                j = zzl(bArr2, (zzbex + ((long) i2)) + j);
                if (zzl != j) {
                    int numberOfLeadingZeros;
                    if (zzbfm) {
                        numberOfLeadingZeros = Long.numberOfLeadingZeros(zzl ^ j);
                    } else {
                        numberOfLeadingZeros = Long.numberOfTrailingZeros(zzl ^ j);
                    }
                    return i4 + (numberOfLeadingZeros >> 3);
                }
                i4 += 8;
            }
        }
        while (i4 < i3) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
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
        r0 = com.google.android.gms.internal.gtm.zztx.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        logger = r0;
        r0 = zzro();
        zzbcx = r0;
        r0 = com.google.android.gms.internal.gtm.zzpp.zznb();
        zzavt = r0;
        r0 = java.lang.Long.TYPE;
        r0 = zzn(r0);
        zzbet = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = zzn(r0);
        zzbeu = r0;
        r0 = zzbcx;
        r1 = 0;
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0053;
    L_0x002e:
        r0 = com.google.android.gms.internal.gtm.zzpp.zzna();
        if (r0 == 0) goto L_0x004c;
    L_0x0034:
        r0 = zzbet;
        if (r0 == 0) goto L_0x0040;
    L_0x0038:
        r1 = new com.google.android.gms.internal.gtm.zztx$zzb;
        r0 = zzbcx;
        r1.<init>(r0);
        goto L_0x0053;
    L_0x0040:
        r0 = zzbeu;
        if (r0 == 0) goto L_0x0053;
    L_0x0044:
        r1 = new com.google.android.gms.internal.gtm.zztx$zza;
        r0 = zzbcx;
        r1.<init>(r0);
        goto L_0x0053;
    L_0x004c:
        r1 = new com.google.android.gms.internal.gtm.zztx$zzc;
        r0 = zzbcx;
        r1.<init>(r0);
    L_0x0053:
        zzbev = r1;
        r0 = zzrq();
        zzbew = r0;
        r0 = zzrp();
        zzawt = r0;
        r0 = byte[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbex = r0;
        r0 = boolean[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbey = r0;
        r0 = boolean[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbez = r0;
        r0 = int[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbfa = r0;
        r0 = int[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbfb = r0;
        r0 = long[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbfc = r0;
        r0 = long[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbfd = r0;
        r0 = float[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbfe = r0;
        r0 = float[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbff = r0;
        r0 = double[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbfg = r0;
        r0 = double[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbfh = r0;
        r0 = java.lang.Object[].class;
        r0 = zzl(r0);
        r0 = (long) r0;
        zzbfi = r0;
        r0 = java.lang.Object[].class;
        r0 = zzm(r0);
        r0 = (long) r0;
        zzbfj = r0;
        r0 = zzrr();
        if (r0 == 0) goto L_0x00e8;
    L_0x00dc:
        r1 = zzbev;
        if (r1 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e8;
    L_0x00e1:
        r1 = r1.zzbfn;
        r0 = r1.objectFieldOffset(r0);
        goto L_0x00ea;
    L_0x00e8:
        r0 = -1;
    L_0x00ea:
        zzbfk = r0;
        r0 = zzbex;
        r2 = 7;
        r0 = r0 & r2;
        r1 = (int) r0;
        zzbfl = r1;
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x00fe;
    L_0x00fc:
        r0 = 1;
        goto L_0x00ff;
    L_0x00fe:
        r0 = 0;
    L_0x00ff:
        zzbfm = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zztx.<clinit>():void");
    }
}
