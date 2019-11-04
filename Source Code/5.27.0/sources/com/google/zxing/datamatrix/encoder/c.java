package com.google.zxing.datamatrix.encoder;

/* compiled from: C40Encoder */
class c implements g {
    public int yM() {
        return 1;
    }

    c() {
    }

    public void a(h hVar) {
        StringBuilder stringBuilder = new StringBuilder();
        while (hVar.yU()) {
            char yP = hVar.yP();
            hVar.pos++;
            int a = a(yP, stringBuilder);
            int yR = hVar.yR() + ((stringBuilder.length() / 3) << 1);
            hVar.db(yR);
            int zg = hVar.yX().zg() - yR;
            if (hVar.yU()) {
                if (stringBuilder.length() % 3 == 0 && j.c(hVar.getMessage(), hVar.pos, yM()) != yM()) {
                    hVar.da(0);
                    break;
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (stringBuilder.length() % 3 == 2 && zg != 2) {
                    a = a(hVar, stringBuilder, stringBuilder2, a);
                }
                while (stringBuilder.length() % 3 == 1 && (a > 3 || zg != 1)) {
                    a = a(hVar, stringBuilder, stringBuilder2, a);
                }
            }
        }
        b(hVar, stringBuilder);
    }

    private int a(h hVar, StringBuilder stringBuilder, StringBuilder stringBuilder2, int i) {
        int length = stringBuilder.length();
        stringBuilder.delete(length - i, length);
        hVar.pos--;
        int a = a(hVar.yP(), stringBuilder2);
        hVar.yZ();
        return a;
    }

    static void a(h hVar, StringBuilder stringBuilder) {
        hVar.cS(b((CharSequence) stringBuilder, 0));
        stringBuilder.delete(0, 3);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(h hVar, StringBuilder stringBuilder) {
        int length = stringBuilder.length() % 3;
        int yR = hVar.yR() + ((stringBuilder.length() / 3) << 1);
        hVar.db(yR);
        int zg = hVar.yX().zg() - yR;
        if (length == 2) {
            stringBuilder.append(0);
            while (stringBuilder.length() >= 3) {
                a(hVar, stringBuilder);
            }
            if (hVar.yU()) {
                hVar.m(254);
            }
        } else if (zg == 1 && length == 1) {
            while (stringBuilder.length() >= 3) {
                a(hVar, stringBuilder);
            }
            if (hVar.yU()) {
                hVar.m(254);
            }
            hVar.pos--;
        } else if (length == 0) {
            while (stringBuilder.length() >= 3) {
                a(hVar, stringBuilder);
            }
            if (zg > 0 || hVar.yU()) {
                hVar.m(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.da(0);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(char c, StringBuilder stringBuilder) {
        if (c == ' ') {
            stringBuilder.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - 48) + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            stringBuilder.append((char) ((c - 65) + 14));
            return 1;
        } else if (c < ' ') {
            stringBuilder.append(0);
            stringBuilder.append(c);
            return 2;
        } else if (c <= '/') {
            stringBuilder.append(1);
            stringBuilder.append((char) (c - 33));
            return 2;
        } else if (c <= '@') {
            stringBuilder.append(1);
            stringBuilder.append((char) ((c - 58) + 15));
            return 2;
        } else if (c <= '_') {
            stringBuilder.append(1);
            stringBuilder.append((char) ((c - 91) + 22));
            return 2;
        } else if (c <= 127) {
            stringBuilder.append(2);
            stringBuilder.append((char) (c - 96));
            return 2;
        } else {
            stringBuilder.append("\u0001\u001e");
            return a((char) (c - 128), stringBuilder) + 2;
        }
    }

    private static String b(CharSequence charSequence, int i) {
        char charAt = (char) (((((charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * 40)) + charSequence.charAt(i + 2)) + 1) % 256);
        return new String(new char[]{(char) (r0 / 256), charAt});
    }
}
