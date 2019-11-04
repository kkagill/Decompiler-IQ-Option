package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.b;
import java.util.Map;

/* compiled from: Code93Writer */
public class g extends m {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public boolean[] cT(String str) {
        str = cV(str);
        int length = str.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((((str.length() + 2) + 2) * 9) + 1)];
            int i = 0;
            int a = a(zArr, 0, f.ahG);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i < length) {
                    a += a(zArr, a, f.ahz[str2.indexOf(str.charAt(i))]);
                    i++;
                } else {
                    length = p(str, 20);
                    a += a(zArr, a, f.ahz[length]);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2.charAt(length));
                    a += a(zArr, a, f.ahz[p(stringBuilder.toString(), 15)]);
                    zArr[a + a(zArr, a, f.ahG)] = true;
                    return zArr;
                }
            }
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    private static int a(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    private static int p(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    static String cV(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                stringBuilder.append("bU");
            } else if (charAt <= 26) {
                stringBuilder.append('a');
                stringBuilder.append((char) ((charAt + 65) - 1));
            } else if (charAt <= 31) {
                stringBuilder.append('b');
                stringBuilder.append((char) ((charAt + 65) - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                stringBuilder.append(charAt);
            } else if (charAt <= ',') {
                stringBuilder.append('c');
                stringBuilder.append((char) ((charAt + 65) - 33));
            } else if (charAt <= '9') {
                stringBuilder.append(charAt);
            } else if (charAt == ':') {
                stringBuilder.append("cZ");
            } else if (charAt <= '?') {
                stringBuilder.append('b');
                stringBuilder.append((char) ((charAt + 70) - 59));
            } else if (charAt == '@') {
                stringBuilder.append("bV");
            } else if (charAt <= 'Z') {
                stringBuilder.append(charAt);
            } else if (charAt <= '_') {
                stringBuilder.append('b');
                stringBuilder.append((char) ((charAt + 75) - 91));
            } else if (charAt == '`') {
                stringBuilder.append("bW");
            } else if (charAt <= 'z') {
                stringBuilder.append('d');
                stringBuilder.append((char) ((charAt + 65) - 97));
            } else if (charAt <= 127) {
                stringBuilder.append('b');
                stringBuilder.append((char) ((charAt + 80) - 123));
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("Requested content contains a non-encodable character: '");
                stringBuilder2.append(charAt);
                stringBuilder2.append("'");
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        return stringBuilder.toString();
    }
}
