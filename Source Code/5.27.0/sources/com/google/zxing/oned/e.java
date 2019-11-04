package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.b;
import java.util.Map;

/* compiled from: Code39Writer */
public final class e extends m {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public boolean[] cT(String str) {
        int length = str.length();
        String str2 = "Requested contents should be less than 80 digits long, but got ";
        if (length <= 80) {
            String str3;
            int i = 0;
            while (true) {
                str3 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
                if (i >= length) {
                    break;
                } else if (str3.indexOf(str.charAt(i)) < 0) {
                    str = cU(str);
                    length = str.length();
                    if (length > 80) {
                        StringBuilder stringBuilder = new StringBuilder(str2);
                        stringBuilder.append(length);
                        stringBuilder.append(" (extended full ASCII mode)");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            a(148, iArr);
            int a = m.a(zArr, 0, iArr, true);
            int[] iArr2 = new int[]{1};
            int a2 = a + m.a(zArr, a, iArr2, false);
            for (a = 0; a < length; a++) {
                a(d.ahz[str3.indexOf(str.charAt(a))], iArr);
                a2 += m.a(zArr, a2, iArr, true);
                a2 += m.a(zArr, a2, iArr2, false);
            }
            a(148, iArr);
            m.a(zArr, a2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException(str2.concat(String.valueOf(length)));
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    private static String cU(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        stringBuilder.append("%V");
                    } else if (charAt == '`') {
                        stringBuilder.append("%W");
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            stringBuilder.append('$');
                            stringBuilder.append((char) ((charAt - 1) + 65));
                        } else if (charAt < ' ') {
                            stringBuilder.append('%');
                            stringBuilder.append((char) ((charAt - 27) + 65));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            stringBuilder.append('/');
                            stringBuilder.append((char) ((charAt - 33) + 65));
                        } else if (charAt <= '9') {
                            stringBuilder.append((char) ((charAt - 48) + 48));
                        } else if (charAt <= '?') {
                            stringBuilder.append('%');
                            stringBuilder.append((char) ((charAt - 59) + 70));
                        } else if (charAt <= 'Z') {
                            stringBuilder.append((char) ((charAt - 65) + 65));
                        } else if (charAt <= '_') {
                            stringBuilder.append('%');
                            stringBuilder.append((char) ((charAt - 91) + 75));
                        } else if (charAt <= 'z') {
                            stringBuilder.append('+');
                            stringBuilder.append((char) ((charAt - 97) + 65));
                        } else if (charAt <= 127) {
                            stringBuilder.append('%');
                            stringBuilder.append((char) ((charAt - 123) + 80));
                        } else {
                            stringBuilder = new StringBuilder("Requested content contains a non-encodable character: '");
                            stringBuilder.append(str.charAt(i));
                            stringBuilder.append("'");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append("%U");
            }
        }
        return stringBuilder.toString();
    }
}
