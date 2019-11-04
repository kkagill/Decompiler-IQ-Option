package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import java.util.Map;

/* compiled from: EAN8Writer */
public final class j extends p {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public boolean[] cT(String str) {
        int i;
        int length = str.length();
        if (length == 7) {
            try {
                length = o.q(str);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(length);
                str = stringBuilder.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!o.p(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        m.cW(str);
        boolean[] zArr = new boolean[67];
        int a = m.a(zArr, 0, o.ahN, true) + 0;
        for (i = 0; i <= 3; i++) {
            a += m.a(zArr, a, o.ahP[Character.digit(str.charAt(i), 10)], false);
        }
        a += m.a(zArr, a, o.ahO, false);
        for (i = 4; i <= 7; i++) {
            a += m.a(zArr, a, o.ahP[Character.digit(str.charAt(i), 10)], true);
        }
        m.a(zArr, a, o.ahN, true);
        return zArr;
    }
}
