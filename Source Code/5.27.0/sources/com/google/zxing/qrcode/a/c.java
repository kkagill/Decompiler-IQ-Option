package com.google.zxing.qrcode.a;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.a;
import com.google.zxing.qrcode.decoder.a.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Encoder */
public final class c {
    private static final int[] aiy = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder */
    /* renamed from: com.google.zxing.qrcode.a.c$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aiz = new int[Mode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.google.zxing.qrcode.decoder.Mode.values();
            r0 = r0.length;
            r0 = new int[r0];
            aiz = r0;
            r0 = aiz;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = aiz;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = aiz;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.google.zxing.qrcode.decoder.Mode.BYTE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = aiz;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.google.zxing.qrcode.decoder.Mode.KANJI;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.a.c$AnonymousClass1.<clinit>():void");
        }
    }

    private static int a(b bVar) {
        return ((d.b(bVar) + d.c(bVar)) + d.d(bVar)) + d.e(bVar);
    }

    public static f a(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) {
        a a;
        Object obj = 1;
        Object obj2 = (map == null || !map.containsKey(EncodeHintType.CHARACTER_SET)) ? null : 1;
        String obj3 = obj2 != null ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode V = V(str, obj3);
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        if (V == Mode.BYTE && obj2 != null) {
            CharacterSetECI characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(obj3);
            if (characterSetECIByName != null) {
                a(characterSetECIByName, aVar);
            }
        }
        if (map == null || !map.containsKey(EncodeHintType.GS1_FORMAT)) {
            obj = null;
        }
        if (obj != null && Boolean.valueOf(map.get(EncodeHintType.GS1_FORMAT).toString()).booleanValue()) {
            a(Mode.FNC1_FIRST_POSITION, aVar);
        }
        a(V, aVar);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        a(str, V, aVar2, obj3);
        if (map == null || !map.containsKey(EncodeHintType.QR_VERSION)) {
            a = a(errorCorrectionLevel, V, aVar, aVar2);
        } else {
            a = a.df(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!a(a(V, aVar, aVar2, a), a, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        com.google.zxing.common.a aVar3 = new com.google.zxing.common.a();
        aVar3.a(aVar);
        a(V == Mode.BYTE ? aVar2.yF() : str.length(), a, V, aVar3);
        aVar3.a(aVar2);
        b a2 = a.a(errorCorrectionLevel);
        int zq = a.zq() - a2.zw();
        a(zq, aVar3);
        com.google.zxing.common.a a3 = a(aVar3, a.zq(), zq, a2.zv());
        f fVar = new f();
        fVar.b(errorCorrectionLevel);
        fVar.a(V);
        fVar.a(a);
        int zr = a.zr();
        b bVar = new b(zr, zr);
        zr = a(a3, errorCorrectionLevel, a, bVar);
        fVar.dj(zr);
        e.a(a3, errorCorrectionLevel, a, zr, bVar);
        fVar.j(bVar);
        return fVar;
    }

    private static a a(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2) {
        return a(a(mode, aVar, aVar2, a(a(mode, aVar, aVar2, a.df(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    private static int a(Mode mode, com.google.zxing.common.a aVar, com.google.zxing.common.a aVar2, a aVar3) {
        return (aVar.getSize() + mode.getCharacterCountBits(aVar3)) + aVar2.getSize();
    }

    static int dg(int i) {
        int[] iArr = aiy;
        return i < iArr.length ? iArr[i] : -1;
    }

    private static Mode V(String str, String str2) {
        if ("Shift_JIS".equals(str2) && cY(str)) {
            return Mode.KANJI;
        }
        Object obj = null;
        Object obj2 = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                obj2 = 1;
            } else if (dg(charAt) == -1) {
                return Mode.BYTE;
            } else {
                obj = 1;
            }
        }
        if (obj != null) {
            return Mode.ALPHANUMERIC;
        }
        if (obj2 != null) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    private static boolean cY(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(com.google.zxing.common.a aVar, ErrorCorrectionLevel errorCorrectionLevel, a aVar2, b bVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            e.a(aVar, errorCorrectionLevel, aVar2, i3, bVar);
            int a = a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    private static a a(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            a df = a.df(i2);
            if (a(i, df, errorCorrectionLevel)) {
                return df;
            }
        }
        throw new WriterException("Data too big");
    }

    private static boolean a(int i, a aVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return aVar.zq() - aVar.a(errorCorrectionLevel).zw() >= (i + 7) / 8;
    }

    static void a(int i, com.google.zxing.common.a aVar) {
        int i2 = i << 3;
        if (aVar.getSize() <= i2) {
            int i3;
            int i4 = 0;
            for (i3 = 0; i3 < 4 && aVar.getSize() < i2; i3++) {
                aVar.au(false);
            }
            i3 = aVar.getSize() & 7;
            if (i3 > 0) {
                while (i3 < 8) {
                    aVar.au(false);
                    i3++;
                }
            }
            i -= aVar.yF();
            while (i4 < i) {
                aVar.O((i4 & 1) == 0 ? 236 : 17, 8);
                i4++;
            }
            if (aVar.getSize() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
        stringBuilder.append(aVar.getSize());
        stringBuilder.append(" > ");
        stringBuilder.append(i2);
        throw new WriterException(stringBuilder.toString());
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            i2 /= i3;
            int i9 = i2 + 1;
            i7 -= i2;
            i8 -= i9;
            if (i7 != i8) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i2 + i7) * i6) + ((i9 + i8) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i2;
                iArr2[0] = i7;
                return;
            } else {
                iArr[0] = i9;
                iArr2[0] = i8;
                return;
            }
        }
        throw new WriterException("Block ID too large");
    }

    static com.google.zxing.common.a a(com.google.zxing.common.a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.yF() == i5) {
            ArrayList<a> arrayList = new ArrayList(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                a(i, i2, i3, i11, iArr, iArr2);
                int i12 = iArr[0];
                byte[] bArr = new byte[i12];
                aVar.a(i8 << 3, bArr, 0, i12);
                byte[] a = a(bArr, iArr3[0]);
                arrayList.add(new a(bArr, a));
                i9 = Math.max(i9, i12);
                i10 = Math.max(i10, a.length);
                i8 += iArr[0];
            }
            if (i5 == i8) {
                com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
                for (int i13 = 0; i13 < i9; i13++) {
                    for (a zy : arrayList) {
                        byte[] zy2 = zy.zy();
                        if (i13 < zy2.length) {
                            aVar2.O(zy2[i13], 8);
                        }
                    }
                }
                while (i7 < i10) {
                    for (a zz : arrayList) {
                        byte[] zz2 = zz.zz();
                        if (i7 < zz2.length) {
                            aVar2.O(zz2[i7], 8);
                        }
                    }
                    i7++;
                }
                if (i4 == aVar2.yF()) {
                    return aVar2;
                }
                StringBuilder stringBuilder = new StringBuilder("Interleaving error: ");
                stringBuilder.append(i4);
                stringBuilder.append(" and ");
                stringBuilder.append(aVar2.yF());
                stringBuilder.append(" differ.");
                throw new WriterException(stringBuilder.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new com.google.zxing.common.a.c(com.google.zxing.common.a.a.agL).a(iArr, i);
        bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) iArr[length + i3];
        }
        return bArr;
    }

    static void a(Mode mode, com.google.zxing.common.a aVar) {
        aVar.O(mode.getBits(), 4);
    }

    static void a(int i, a aVar, Mode mode, com.google.zxing.common.a aVar2) {
        int characterCountBits = mode.getCharacterCountBits(aVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            aVar2.O(i, characterCountBits);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" is bigger than ");
        stringBuilder.append(i2 - 1);
        throw new WriterException(stringBuilder.toString());
    }

    static void a(String str, Mode mode, com.google.zxing.common.a aVar, String str2) {
        int i = AnonymousClass1.aiz[mode.ordinal()];
        if (i == 1) {
            a((CharSequence) str, aVar);
        } else if (i == 2) {
            b(str, aVar);
        } else if (i == 3) {
            a(str, aVar, str2);
        } else if (i == 4) {
            a(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
    }

    static void a(CharSequence charSequence, com.google.zxing.common.a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - 48;
            int i2 = i + 2;
            if (i2 < length) {
                aVar.O(((charAt * 100) + ((charSequence.charAt(i + 1) - 48) * 10)) + (charSequence.charAt(i2) - 48), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.O((charAt * 10) + (charSequence.charAt(i) - 48), 7);
                    i = i2;
                } else {
                    aVar.O(charAt, 4);
                }
            }
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.common.a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int dg = dg(charSequence.charAt(i));
            if (dg != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    i2 = dg(charSequence.charAt(i2));
                    if (i2 != -1) {
                        aVar.O((dg * 45) + i2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                }
                aVar.O(dg, 6);
                i = i2;
            } else {
                throw new WriterException();
            }
        }
    }

    static void a(String str, com.google.zxing.common.a aVar, String str2) {
        try {
            for (byte O : str.getBytes(str2)) {
                aVar.O(O, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A:{LOOP_END, LOOP:0: B:5:0x000f->B:18:0x003c} */
    static void a(java.lang.String r6, com.google.zxing.common.a r7) {
        /*
        r0 = "Shift_JIS";
        r6 = r6.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x005c }
        r0 = r6.length;
        r0 = r0 % 2;
        if (r0 != 0) goto L_0x0054;
    L_0x000b:
        r0 = r6.length;
        r0 = r0 + -1;
        r1 = 0;
    L_0x000f:
        if (r1 >= r0) goto L_0x0053;
    L_0x0011:
        r2 = r6[r1];
        r2 = r2 & 255;
        r3 = r1 + 1;
        r3 = r6[r3];
        r3 = r3 & 255;
        r2 = r2 << 8;
        r2 = r2 | r3;
        r3 = 33088; // 0x8140 float:4.6366E-41 double:1.63476E-319;
        r4 = -1;
        if (r2 < r3) goto L_0x002b;
    L_0x0024:
        r5 = 40956; // 0x9ffc float:5.7392E-41 double:2.0235E-319;
        if (r2 > r5) goto L_0x002b;
    L_0x0029:
        r2 = r2 - r3;
        goto L_0x003a;
    L_0x002b:
        r3 = 57408; // 0xe040 float:8.0446E-41 double:2.83633E-319;
        if (r2 < r3) goto L_0x0039;
    L_0x0030:
        r3 = 60351; // 0xebbf float:8.457E-41 double:2.98174E-319;
        if (r2 > r3) goto L_0x0039;
    L_0x0035:
        r3 = 49472; // 0xc140 float:6.9325E-41 double:2.44424E-319;
        goto L_0x0029;
    L_0x0039:
        r2 = -1;
    L_0x003a:
        if (r2 == r4) goto L_0x004b;
    L_0x003c:
        r3 = r2 >> 8;
        r3 = r3 * 192;
        r2 = r2 & 255;
        r3 = r3 + r2;
        r2 = 13;
        r7.O(r3, r2);
        r1 = r1 + 2;
        goto L_0x000f;
    L_0x004b:
        r6 = new com.google.zxing.WriterException;
        r7 = "Invalid byte sequence";
        r6.<init>(r7);
        throw r6;
    L_0x0053:
        return;
    L_0x0054:
        r6 = new com.google.zxing.WriterException;
        r7 = "Kanji byte size not even";
        r6.<init>(r7);
        throw r6;
    L_0x005c:
        r6 = move-exception;
        r7 = new com.google.zxing.WriterException;
        r7.<init>(r6);
        goto L_0x0064;
    L_0x0063:
        throw r7;
    L_0x0064:
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.a.c.a(java.lang.String, com.google.zxing.common.a):void");
    }

    private static void a(CharacterSetECI characterSetECI, com.google.zxing.common.a aVar) {
        aVar.O(Mode.ECI.getBits(), 4);
        aVar.O(characterSetECI.getValue(), 8);
    }
}
