package com.google.zxing.a.a;

import com.google.zxing.common.a;
import com.google.zxing.common.b;

/* compiled from: Encoder */
public final class c {
    private static final int[] agr = new int[]{4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int g(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public static a e(byte[] bArr, int i, int i2) {
        boolean z;
        int abs;
        int i3;
        int i4;
        int size;
        int i5;
        int g;
        int i6;
        int i7;
        a yB = new d(bArr).yB();
        int i8 = 11;
        int size2 = ((yB.getSize() * i) / 100) + 11;
        int size3 = yB.getSize() + size2;
        int i9 = 32;
        int i10 = 0;
        int i11 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            abs = Math.abs(i2);
            if (z) {
                i9 = 4;
            }
            if (abs <= i9) {
                i9 = g(abs, z);
                i3 = agr[abs];
                i4 = i9 - (i9 % i3);
                yB = a(yB, i3);
                size = yB.getSize() + size2;
                String str = "Data to large for user specified layer";
                if (size > i4) {
                    throw new IllegalArgumentException(str);
                } else if (z && yB.getSize() > (i3 << 6)) {
                    throw new IllegalArgumentException(str);
                }
            }
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
        }
        a aVar = null;
        abs = 0;
        i4 = 0;
        while (abs <= 32) {
            boolean z2 = abs <= 3;
            i5 = z2 ? abs + 1 : abs;
            g = g(i5, z2);
            if (size3 <= g) {
                a a;
                if (aVar == null || i4 != agr[i5]) {
                    i3 = agr[i5];
                    a = a(yB, i3);
                } else {
                    int i12 = i4;
                    a = aVar;
                    i3 = i12;
                }
                i6 = g - (g % i3);
                if ((!z2 || a.getSize() <= (i3 << 6)) && a.getSize() + size2 <= i6) {
                    yB = a;
                    z = z2;
                    abs = i5;
                    i9 = g;
                } else {
                    a aVar2 = a;
                    i4 = i3;
                    aVar = aVar2;
                }
            }
            abs++;
            i10 = 0;
            i11 = 1;
        }
        throw new IllegalArgumentException("Data too large for an Aztec code");
        a a2 = a(yB, i9, i3);
        int size4 = yB.getSize() / i3;
        a a3 = a(z, abs, size4);
        if (!z) {
            i8 = 14;
        }
        i8 += abs << 2;
        int[] iArr = new int[i8];
        i4 = 2;
        if (z) {
            for (size = 0; size < iArr.length; size++) {
                iArr[size] = size;
            }
            size = i8;
        } else {
            i5 = i8 / 2;
            size = (i8 + 1) + (((i5 - 1) / 15) * 2);
            g = size / 2;
            for (i6 = 0; i6 < i5; i6++) {
                i7 = (i6 / 15) + i6;
                iArr[(i5 - i6) - i11] = (g - i7) - 1;
                iArr[i5 + i6] = (i7 + g) + i11;
            }
        }
        b bVar = new b(size);
        g = 0;
        i6 = 0;
        while (g < abs) {
            i7 = ((abs - g) << i4) + (z ? 9 : 12);
            int i13 = 0;
            while (i13 < i7) {
                int i14 = i13 << 1;
                for (i4 = 
/*
Method generation error in method: com.google.zxing.a.a.c.e(byte[], int, int):com.google.zxing.a.a.a, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r9_12 'i4' int) = (r9_11 'i4' int), (r9_24 'i4' int) binds: {(r9_11 'i4' int)=B:63:0x0121, (r9_24 'i4' int)=B:80:0x0196} in method: com.google.zxing.a.a.c.e(byte[], int, int):com.google.zxing.a.a.a, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:228)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:185)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:220)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:220)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:321)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:221)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:10)
	at jadx.core.ProcessClass.process(ProcessClass.java:38)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:539)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:511)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:222)
	... 25 more

*/

    private static void a(b bVar, int i, int i2) {
        int i3;
        int i4;
        for (i3 = 0; i3 < i2; i3 += 2) {
            i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.set(i5, i4);
                bVar.set(i5, i6);
                bVar.set(i4, i5);
                bVar.set(i6, i5);
                i5++;
            }
        }
        i3 = i - i2;
        bVar.set(i3, i3);
        i4 = i3 + 1;
        bVar.set(i4, i3);
        bVar.set(i3, i4);
        i += i2;
        bVar.set(i, i3);
        bVar.set(i, i4);
        bVar.set(i, i - 1);
    }

    static a a(boolean z, int i, int i2) {
        a aVar = new a();
        if (z) {
            aVar.O(i - 1, 2);
            aVar.O(i2 - 1, 6);
            return a(aVar, 28, 4);
        }
        aVar.O(i - 1, 5);
        aVar.O(i2 - 1, 11);
        return a(aVar, 40, 4);
    }

    private static void a(b bVar, boolean z, int i, a aVar) {
        i /= 2;
        int i2 = 0;
        int i3;
        if (z) {
            while (i2 < 7) {
                i3 = (i - 3) + i2;
                if (aVar.get(i2)) {
                    bVar.set(i3, i - 5);
                }
                if (aVar.get(i2 + 7)) {
                    bVar.set(i + 5, i3);
                }
                if (aVar.get(20 - i2)) {
                    bVar.set(i3, i + 5);
                }
                if (aVar.get(27 - i2)) {
                    bVar.set(i - 5, i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < 10) {
            i3 = ((i - 5) + i2) + (i2 / 5);
            if (aVar.get(i2)) {
                bVar.set(i3, i - 7);
            }
            if (aVar.get(i2 + 10)) {
                bVar.set(i + 7, i3);
            }
            if (aVar.get(29 - i2)) {
                bVar.set(i3, i + 7);
            }
            if (aVar.get(39 - i2)) {
                bVar.set(i - 7, i3);
            }
            i2++;
        }
    }

    private static a a(a aVar, int i, int i2) {
        int size = aVar.getSize() / i2;
        com.google.zxing.common.a.c cVar = new com.google.zxing.common.a.c(cL(i2));
        int i3 = i / i2;
        int[] b = b(aVar, i2, i3);
        cVar.a(b, i3 - size);
        i %= i2;
        a aVar2 = new a();
        int i4 = 0;
        aVar2.O(0, i);
        i = b.length;
        while (i4 < i) {
            aVar2.O(b[i4], i2);
            i4++;
        }
        return aVar2;
    }

    private static int[] b(a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int size = aVar.getSize() / i;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.get((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static com.google.zxing.common.a.a cL(int i) {
        if (i == 4) {
            return com.google.zxing.common.a.a.agK;
        }
        if (i == 6) {
            return com.google.zxing.common.a.a.agJ;
        }
        if (i == 8) {
            return com.google.zxing.common.a.a.agN;
        }
        if (i == 10) {
            return com.google.zxing.common.a.a.agI;
        }
        if (i == 12) {
            return com.google.zxing.common.a.a.agH;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    static a a(a aVar, int i) {
        a aVar2 = new a();
        int size = aVar.getSize();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < size) {
            int i4;
            int i5 = 0;
            for (i4 = 0; i4 < i; i4++) {
                int i6 = i3 + i4;
                if (i6 >= size || aVar.get(i6)) {
                    i5 |= 1 << ((i - 1) - i4);
                }
            }
            i4 = i5 & i2;
            if (i4 == i2) {
                aVar2.O(i4, i);
            } else if (i4 == 0) {
                aVar2.O(i5 | 1, i);
            } else {
                aVar2.O(i5, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }
}
