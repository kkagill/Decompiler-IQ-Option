package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import java.util.Map;

/* compiled from: EAN13Writer */
public final class i extends p {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public boolean[] cT(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                length = o.q(str);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(length);
                str = stringBuilder.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!o.p(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        m.cW(str);
        int i = h.ahH[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = m.a(zArr, 0, o.ahN, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a += m.a(zArr, a, o.ahQ[digit], false);
        }
        a += m.a(zArr, a, o.ahO, false);
        for (length = 7; length <= 12; length++) {
            a += m.a(zArr, a, o.ahP[Character.digit(str.charAt(length), 10)], true);
        }
        m.a(zArr, a, o.ahN, true);
        return zArr;
    }
}
