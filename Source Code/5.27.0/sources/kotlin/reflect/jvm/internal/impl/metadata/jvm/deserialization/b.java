package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: BitEncoding */
public class b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean foI;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i3 = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? 2 : 3;
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) {
            objArr[0] = str2;
        } else {
            objArr[0] = "data";
        }
        String str3 = "decodeBytes";
        String str4 = "splitBytesToStringArray";
        String str5 = "encode8to7";
        String str6 = "encodeBytes";
        if (i2 == 1 || i2 == 2) {
            objArr[1] = str6;
        } else if (i2 == 4) {
            objArr[1] = str5;
        } else if (i2 == 7) {
            objArr[1] = str4;
        } else if (i2 == 12) {
            objArr[1] = "dropMarker";
        } else if (i2 == 14) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 == 16) {
            objArr[1] = "decode7to8";
        } else if (i2 == 9 || i2 == 10) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
                break;
            case 3:
                objArr[2] = str5;
                break;
            case 5:
                objArr[2] = "addModuloByte";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 11:
                objArr[2] = "dropMarker";
                break;
            case 13:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 15:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = str6;
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    static {
        Object property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        foI = "true".equals(property);
    }

    private b() {
    }

    private static void g(byte[] bArr, int i) {
        if (bArr == null) {
            $$$reportNull$$$0(5);
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    public static byte[] k(String[] strArr) {
        byte[] n;
        if (strArr == null) {
            $$$reportNull$$$0(8);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                n = n.n(l(strArr));
                if (n == null) {
                    $$$reportNull$$$0(9);
                }
                return n;
            } else if (charAt == 65535) {
                strArr = l(strArr);
            }
        }
        n = m(strArr);
        g(n, 127);
        n = Z(n);
        if (n == null) {
            $$$reportNull$$$0(10);
        }
        return n;
    }

    private static String[] l(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(11);
        }
        strArr = (String[]) strArr.clone();
        strArr[0] = strArr[0].substring(1);
        if (strArr == null) {
            $$$reportNull$$$0(12);
        }
        return strArr;
    }

    private static byte[] m(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(13);
        }
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int length2 = strArr.length;
        i = 0;
        int i2 = 0;
        while (i < length2) {
            String str = strArr[i];
            int length3 = str.length();
            int i3 = i2;
            i2 = 0;
            while (i2 < length3) {
                int i4 = i3 + 1;
                bArr[i3] = (byte) str.charAt(i2);
                i2++;
                i3 = i4;
            }
            i++;
            i2 = i3;
        }
        return bArr;
    }

    private static byte[] Z(byte[] bArr) {
        if (bArr == null) {
            $$$reportNull$$$0(15);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i++;
            int i4 = i2 + 1;
            bArr2[i3] = (byte) (((bArr[i] & 255) >>> i2) + ((bArr[i] & ((1 << i4) - 1)) << (7 - i2)));
            if (i2 == 6) {
                i++;
                i2 = 0;
            } else {
                i2 = i4;
            }
        }
        return bArr2;
    }
}
