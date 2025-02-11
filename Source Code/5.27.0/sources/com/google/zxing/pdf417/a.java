package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer */
public final class a implements c {
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            int i3;
            int i4;
            d dVar = new d();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                    dVar.at(Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                    dVar.a(Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                    com.google.zxing.pdf417.encoder.c cVar = (com.google.zxing.pdf417.encoder.c) map.get(EncodeHintType.PDF417_DIMENSIONS);
                    dVar.g(cVar.zm(), cVar.zl(), cVar.getMaxRows(), cVar.zn());
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i5 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                    dVar.b(Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return a(dVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static b a(d dVar, String str, int i, int i2, int i3, int i4) {
        Object obj;
        dVar.q(str, i);
        byte[][] W = dVar.zo().W(1, 4);
        if ((i3 > i2 ? 1 : null) != (W[0].length < W.length ? 1 : null)) {
            W = a(W);
            obj = 1;
        } else {
            obj = null;
        }
        i2 /= W[0].length;
        i3 /= W.length;
        if (i2 >= i3) {
            i2 = i3;
        }
        if (i2 <= 1) {
            return a(W, i4);
        }
        byte[][] W2 = dVar.zo().W(i2, i2 << 2);
        if (obj != null) {
            W2 = a(W2);
        }
        return a(W2, i4);
    }

    private static b a(byte[][] bArr, int i) {
        int i2 = i * 2;
        b bVar = new b(bArr[0].length + i2, bArr.length + i2);
        bVar.clear();
        int height = (bVar.getHeight() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == (byte) 1) {
                    bVar.set(i4 + i, height);
                }
            }
            i3++;
            height--;
        }
        return bVar;
    }

    private static byte[][] a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
