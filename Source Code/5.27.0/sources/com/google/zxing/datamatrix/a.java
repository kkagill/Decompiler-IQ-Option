package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.datamatrix.encoder.e;
import com.google.zxing.datamatrix.encoder.i;
import com.google.zxing.datamatrix.encoder.j;
import com.google.zxing.datamatrix.encoder.k;
import java.util.Map;

/* compiled from: DataMatrixWriter */
public final class a implements c {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("Requested dimensions can't be negative: ");
            stringBuilder.append(i);
            stringBuilder.append('x');
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            com.google.zxing.a aVar;
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            com.google.zxing.a aVar2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                aVar = (com.google.zxing.a) map.get(EncodeHintType.MIN_SIZE);
                if (aVar == null) {
                    aVar = null;
                }
                com.google.zxing.a aVar3 = (com.google.zxing.a) map.get(EncodeHintType.MAX_SIZE);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                }
            } else {
                aVar = null;
            }
            str = j.a(str, symbolShapeHint, aVar, aVar2);
            k a = k.a(str.length(), symbolShapeHint, aVar, aVar2, true);
            e eVar = new e(i.a(str, a), a.zc(), a.zd());
            eVar.yO();
            return a(eVar, a, i, i2);
        }
    }

    private static b a(e eVar, k kVar, int i, int i2) {
        int zc = kVar.zc();
        int zd = kVar.zd();
        com.google.zxing.qrcode.a.b bVar = new com.google.zxing.qrcode.a.b(kVar.ze(), kVar.zf());
        int i3 = 0;
        for (int i4 = 0; i4 < zd; i4++) {
            int i5;
            int i6;
            if (i4 % kVar.ahu == 0) {
                i5 = 0;
                for (i6 = 0; i6 < kVar.ze(); i6++) {
                    bVar.set(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            i5 = 0;
            for (i6 = 0; i6 < zc; i6++) {
                if (i6 % kVar.aht == 0) {
                    bVar.set(i5, i3, true);
                    i5++;
                }
                bVar.set(i5, i3, eVar.U(i6, i4));
                i5++;
                if (i6 % kVar.aht == kVar.aht - 1) {
                    bVar.set(i5, i3, i4 % 2 == 0);
                    i5++;
                }
            }
            i3++;
            if (i4 % kVar.ahu == kVar.ahu - 1) {
                i5 = 0;
                for (i6 = 0; i6 < kVar.ze(); i6++) {
                    bVar.set(i5, i3, true);
                    i5++;
                }
                i3++;
            }
        }
        return a(bVar, i, i2);
    }

    private static b a(com.google.zxing.qrcode.a.b bVar, int i, int i2) {
        b bVar2;
        int width = bVar.getWidth();
        int height = bVar.getHeight();
        int max = Math.max(i, width);
        int max2 = Math.max(i2, height);
        int min = Math.min(max / width, max2 / height);
        max = (max - (width * min)) / 2;
        max2 = (max2 - (height * min)) / 2;
        if (i2 < height || i < width) {
            bVar2 = new b(width, height);
            max = 0;
            max2 = 0;
        } else {
            bVar2 = new b(i, i2);
        }
        bVar2.clear();
        i = 0;
        while (i < height) {
            int i3 = max;
            i2 = 0;
            while (i2 < width) {
                if (bVar.Y(i2, i) == (byte) 1) {
                    bVar2.d(i3, max2, min, min);
                }
                i2++;
                i3 += min;
            }
            i++;
            max2 += min;
        }
        return bVar2;
    }
}
