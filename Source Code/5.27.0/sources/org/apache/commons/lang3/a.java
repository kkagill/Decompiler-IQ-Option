package org.apache.commons.lang3;

/* compiled from: ArrayUtils */
public class a {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final double[] bgS = new double[0];
    public static final long[] bgT = new long[0];
    public static final int[] bgU = new int[0];
    public static final Object[] fBX = new Object[0];
    public static final Class<?>[] fBY = new Class[0];
    public static final Long[] fBZ = new Long[0];
    public static final Integer[] fCa = new Integer[0];
    public static final short[] fCb = new short[0];
    public static final Short[] fCc = new Short[0];
    public static final Byte[] fCd = new Byte[0];
    public static final Double[] fCe = new Double[0];
    public static final float[] fCf = new float[0];
    public static final Float[] fCg = new Float[0];
    public static final boolean[] fCh = new boolean[0];
    public static final Boolean[] fCi = new Boolean[0];
    public static final char[] fCj = new char[0];
    public static final Character[] fCk = new Character[0];

    public static byte[] af(byte[] bArr) {
        return bArr == null ? null : (byte[]) bArr.clone();
    }

    public static byte[] r(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > bArr.length) {
            i2 = bArr.length;
        }
        i2 -= i;
        if (i2 <= 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int indexOf(Object[] objArr, Object obj) {
        return a(objArr, obj, 0);
    }

    public static int a(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static boolean contains(Object[] objArr, Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static Long[] j(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return fBZ;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    public static byte[] b(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return af(bArr2);
        }
        if (bArr2 == null) {
            return af(bArr);
        }
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
