package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzfd {
    private static final Logger logger = Logger.getLogger(zzfd.class.getName());
    private static final Class<?> zzfb = zzaw.zzy();
    private static final boolean zzfy = zzeg();
    private static final Unsafe zzmh = zzef();
    private static final boolean zzpg = zzi(Long.TYPE);
    private static final boolean zzph = zzi(Integer.TYPE);
    private static final zzd zzpi;
    private static final boolean zzpj = zzeh();
    private static final long zzpk = ((long) zzg(byte[].class));
    private static final long zzpl = ((long) zzg(boolean[].class));
    private static final long zzpm = ((long) zzh(boolean[].class));
    private static final long zzpn = ((long) zzg(int[].class));
    private static final long zzpo = ((long) zzh(int[].class));
    private static final long zzpp = ((long) zzg(long[].class));
    private static final long zzpq = ((long) zzh(long[].class));
    private static final long zzpr = ((long) zzg(float[].class));
    private static final long zzps = ((long) zzh(float[].class));
    private static final long zzpt = ((long) zzg(double[].class));
    private static final long zzpu = ((long) zzh(double[].class));
    private static final long zzpv = ((long) zzg(Object[].class));
    private static final long zzpw = ((long) zzh(Object[].class));
    private static final long zzpx = zzb(zzei());
    private static final long zzpy;
    private static final boolean zzpz = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static abstract class zzd {
        Unsafe zzqa;

        zzd(Unsafe unsafe) {
            this.zzqa = unsafe;
        }

        public final long zza(Field field) {
            return this.zzqa.objectFieldOffset(field);
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, int i) {
            this.zzqa.putInt(obj, j, i);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzqa.putLong(obj, j, j2);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(Object obj, long j, byte b);

        public final int zzj(Object obj, long j) {
            return this.zzqa.getInt(obj, j);
        }

        public final long zzk(Object obj, long j) {
            return this.zzqa.getLong(obj, j);
        }

        public abstract boolean zzl(Object obj, long j);

        public abstract float zzm(Object obj, long j);

        public abstract double zzn(Object obj, long j);

        public abstract byte zzx(Object obj, long j);
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j, z);
            } else {
                zzfd.zzc(obj, j, z);
            }
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j, b);
            } else {
                zzfd.zzb(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            return zzfd.zzpz ? zzfd.zzr(obj, j) : zzfd.zzs(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final byte zzx(Object obj, long j) {
            return zzfd.zzpz ? zzfd.zzp(obj, j) : zzfd.zzq(obj, j);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j, z);
            } else {
                zzfd.zzc(obj, j, z);
            }
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j, b);
            } else {
                zzfd.zzb(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            return zzfd.zzpz ? zzfd.zzr(obj, j) : zzfd.zzs(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final byte zzx(Object obj, long j) {
            return zzfd.zzpz ? zzfd.zzp(obj, j) : zzfd.zzq(obj, j);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            this.zzqa.putByte(j, b);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzqa.putDouble(obj, j, d);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzqa.putFloat(obj, j, f);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzqa.putBoolean(obj, j, z);
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzqa.copyMemory(bArr, zzfd.zzpk + j, null, j2, j3);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzqa.putByte(obj, j, b);
        }

        public final boolean zzl(Object obj, long j) {
            return this.zzqa.getBoolean(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return this.zzqa.getFloat(obj, j);
        }

        public final double zzn(Object obj, long j) {
            return this.zzqa.getDouble(obj, j);
        }

        public final byte zzx(Object obj, long j) {
            return this.zzqa.getByte(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0104  */
    static {
        /*
        r0 = com.google.android.gms.internal.clearcut.zzfd.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        logger = r0;
        r0 = zzef();
        zzmh = r0;
        r0 = com.google.android.gms.internal.clearcut.zzaw.zzy();
        zzfb = r0;
        r0 = java.lang.Long.TYPE;
        r0 = zzi(r0);
        zzpg = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = zzi(r0);
        zzph = r0;
        r0 = zzmh;
        r1 = 0;
        if (r0 != 0) goto L_0x002f;
    L_0x002d:
        r0 = r1;
        goto L_0x0054;
    L_0x002f:
        r0 = com.google.android.gms.internal.clearcut.zzaw.zzx();
        if (r0 == 0) goto L_0x004d;
    L_0x0035:
        r0 = zzpg;
        if (r0 == 0) goto L_0x0041;
    L_0x0039:
        r0 = new com.google.android.gms.internal.clearcut.zzfd$zzb;
        r2 = zzmh;
        r0.<init>(r2);
        goto L_0x0054;
    L_0x0041:
        r0 = zzph;
        if (r0 == 0) goto L_0x002d;
    L_0x0045:
        r0 = new com.google.android.gms.internal.clearcut.zzfd$zza;
        r2 = zzmh;
        r0.<init>(r2);
        goto L_0x0054;
    L_0x004d:
        r0 = new com.google.android.gms.internal.clearcut.zzfd$zzc;
        r2 = zzmh;
        r0.<init>(r2);
    L_0x0054:
        zzpi = r0;
        r0 = zzeh();
        zzpj = r0;
        r0 = zzeg();
        zzfy = r0;
        r0 = byte[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpk = r2;
        r0 = boolean[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpl = r2;
        r0 = boolean[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzpm = r2;
        r0 = int[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpn = r2;
        r0 = int[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzpo = r2;
        r0 = long[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpp = r2;
        r0 = long[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzpq = r2;
        r0 = float[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpr = r2;
        r0 = float[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzps = r2;
        r0 = double[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpt = r2;
        r0 = double[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzpu = r2;
        r0 = java.lang.Object[].class;
        r0 = zzg(r0);
        r2 = (long) r0;
        zzpv = r2;
        r0 = java.lang.Object[].class;
        r0 = zzh(r0);
        r2 = (long) r0;
        zzpw = r2;
        r0 = zzei();
        r2 = zzb(r0);
        zzpx = r2;
        r0 = java.lang.String.class;
        r2 = "value";
        r0 = zzb(r0, r2);
        if (r0 == 0) goto L_0x00f5;
    L_0x00ec:
        r2 = r0.getType();
        r3 = char[].class;
        if (r2 != r3) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00f6;
    L_0x00f5:
        r0 = r1;
    L_0x00f6:
        r0 = zzb(r0);
        zzpy = r0;
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x0106;
    L_0x0104:
        r0 = 1;
        goto L_0x0107;
    L_0x0106:
        r0 = 0;
    L_0x0107:
        zzpz = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfd.<clinit>():void");
    }

    private zzfd() {
    }

    static byte zza(byte[] bArr, long j) {
        return zzpi.zzx(bArr, zzpk + j);
    }

    static long zza(Field field) {
        return zzpi.zza(field);
    }

    static void zza(long j, byte b) {
        zzpi.zza(j, b);
    }

    private static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & ((255 << i) ^ -1)));
    }

    static void zza(Object obj, long j, double d) {
        zzpi.zza(obj, j, d);
    }

    static void zza(Object obj, long j, float f) {
        zzpi.zza(obj, j, f);
    }

    static void zza(Object obj, long j, int i) {
        zzpi.zza(obj, j, i);
    }

    static void zza(Object obj, long j, long j2) {
        zzpi.zza(obj, j, j2);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzpi.zzqa.putObject(obj, j, obj2);
    }

    static void zza(Object obj, long j, boolean z) {
        zzpi.zza(obj, j, z);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzpi.zze(bArr, zzpk + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzpi.zza(bArr, j, j2, j3);
    }

    private static long zzb(Field field) {
        if (field != null) {
            zzd zzd = zzpi;
            if (zzd != null) {
                return zzd.zza(field);
            }
        }
        return -1;
    }

    static long zzb(ByteBuffer byteBuffer) {
        return zzpi.zzk(byteBuffer, zzpx);
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & ((255 << i) ^ -1)));
    }

    private static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, (byte) z);
    }

    private static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, (byte) z);
    }

    static boolean zzed() {
        return zzfy;
    }

    static boolean zzee() {
        return zzpj;
    }

    static Unsafe zzef() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfe());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzeg() {
        Unsafe unsafe = zzmh;
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
            if (zzaw.zzx()) {
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

    private static boolean zzeh() {
        String str = "copyMemory";
        String str2 = "getLong";
        Unsafe unsafe = zzmh;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod(str2, new Class[]{Object.class, Long.TYPE});
            if (zzei() == null) {
                return false;
            }
            if (zzaw.zzx()) {
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

    private static Field zzei() {
        Field zzb;
        if (zzaw.zzx()) {
            zzb = zzb(Buffer.class, "effectiveDirectAddress");
            if (zzb != null) {
                return zzb;
            }
        }
        zzb = zzb(Buffer.class, "address");
        return (zzb == null || zzb.getType() != Long.TYPE) ? null : zzb;
    }

    private static int zzg(Class<?> cls) {
        return zzfy ? zzpi.zzqa.arrayBaseOffset(cls) : -1;
    }

    private static int zzh(Class<?> cls) {
        return zzfy ? zzpi.zzqa.arrayIndexScale(cls) : -1;
    }

    private static boolean zzi(Class<?> cls) {
        if (!zzaw.zzx()) {
            return false;
        }
        try {
            Class cls2 = zzfb;
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

    static int zzj(Object obj, long j) {
        return zzpi.zzj(obj, j);
    }

    static long zzk(Object obj, long j) {
        return zzpi.zzk(obj, j);
    }

    static boolean zzl(Object obj, long j) {
        return zzpi.zzl(obj, j);
    }

    static float zzm(Object obj, long j) {
        return zzpi.zzm(obj, j);
    }

    static double zzn(Object obj, long j) {
        return zzpi.zzn(obj, j);
    }

    static Object zzo(Object obj, long j) {
        return zzpi.zzqa.getObject(obj, j);
    }

    private static byte zzp(Object obj, long j) {
        return (byte) (zzj(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    private static byte zzq(Object obj, long j) {
        return (byte) (zzj(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    private static boolean zzr(Object obj, long j) {
        return zzp(obj, j) != (byte) 0;
    }

    private static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != (byte) 0;
    }
}
