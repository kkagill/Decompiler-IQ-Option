package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.common.b;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: OneDimensionalCodeWriter */
public abstract class m implements c {
    private static final Pattern ahL = Pattern.compile("[0-9]+");

    public abstract boolean[] cT(String str);

    public int zi() {
        return 10;
    }

    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("Negative size is not allowed. Input: ");
            stringBuilder.append(i);
            stringBuilder.append('x');
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            int zi = zi();
            if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
                zi = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
            }
            return a(cT(str), i, i2, zi);
        }
    }

    private static b a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        i3 += length;
        i = Math.max(i, i3);
        i2 = Math.max(1, i2);
        i3 = i / i3;
        int i4 = (i - (length * i3)) / 2;
        b bVar = new b(i, i2);
        int i5 = i4;
        i4 = 0;
        while (i4 < length) {
            if (zArr[i4]) {
                bVar.d(i5, 0, i3, i2);
            }
            i4++;
            i5 += i3;
        }
        return bVar;
    }

    protected static void cW(String str) {
        if (!ahL.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    protected static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        i = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = iArr[i];
            int i5 = i2;
            i2 = 0;
            while (i2 < i4) {
                int i6 = i5 + 1;
                zArr[i5] = z2;
                i2++;
                i5 = i6;
            }
            i3 += i4;
            z2 = !z2;
            i++;
            i2 = i5;
        }
        return i3;
    }
}
