package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.b;
import java.util.ArrayList;
import java.util.Map;

public final class Code128Writer extends m {

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public boolean[] cT(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    }
                    throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            int d = d(str, i3, i5);
            int i7 = 100;
            if (d == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i7 = 102;
                        break;
                    case 242:
                        i7 = 97;
                        break;
                    case 243:
                        i7 = 96;
                        break;
                    case 244:
                        if (i5 == 101) {
                            i7 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i5 != 100) {
                            if (i5 == 101) {
                                i7 = str.charAt(i3) - 32;
                                if (i7 < 0) {
                                    i7 += 96;
                                    break;
                                }
                            }
                            i7 = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                            break;
                        }
                        i7 = str.charAt(i3) - 32;
                        break;
                        break;
                }
                i3++;
            } else {
                i7 = i5 == 0 ? d != 100 ? d != 101 ? 105 : 103 : 104 : d;
                i5 = d;
            }
            arrayList.add(c.ahF[i7]);
            i4 += i7 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        arrayList.add(c.ahF[i4 % 103]);
        arrayList.add(c.ahF[106]);
        length = 0;
        for (int[] iArr : arrayList) {
            i5 = length;
            for (int i62 : (int[]) r13.next()) {
                i5 += i62;
            }
            length = i5;
        }
        boolean[] zArr = new boolean[length];
        for (int[] a : arrayList) {
            i += m.a(zArr, i, a, true);
        }
        return zArr;
    }

    private static CType e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        i++;
        if (i >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i);
        if (charAt2 < '0' || charAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }

    private static int d(CharSequence charSequence, int i, int i2) {
        CType e = e(charSequence, i);
        if (e == CType.ONE_DIGIT) {
            return i2 == 101 ? 101 : 100;
        } else {
            if (e == CType.UNCODABLE) {
                if (i < charSequence.length()) {
                    char charAt = charSequence.charAt(i);
                    if (charAt < ' ' || (i2 == 101 && (charAt < '`' || (charAt >= 241 && charAt <= 244)))) {
                        return 101;
                    }
                }
                return 100;
            } else if (i2 == 101 && e == CType.FNC_1) {
                return 101;
            } else {
                if (i2 == 99) {
                    return 99;
                }
                if (i2 != 100) {
                    if (e == CType.FNC_1) {
                        e = e(charSequence, i + 1);
                    }
                    if (e == CType.TWO_DIGITS) {
                        return 99;
                    }
                    return 100;
                } else if (e == CType.FNC_1) {
                    return 100;
                } else {
                    CType e2 = e(charSequence, i + 2);
                    if (e2 == CType.UNCODABLE || e2 == CType.ONE_DIGIT) {
                        return 100;
                    }
                    if (e2 != CType.FNC_1) {
                        i += 4;
                        while (true) {
                            e2 = e(charSequence, i);
                            if (e2 != CType.TWO_DIGITS) {
                                break;
                            }
                            i += 2;
                        }
                        if (e2 == CType.ONE_DIGIT) {
                            return 100;
                        }
                        return 99;
                    } else if (e(charSequence, i + 3) == CType.TWO_DIGITS) {
                        return 99;
                    } else {
                        return 100;
                    }
                }
            }
        }
    }
}
