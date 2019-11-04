package com.google.zxing.datamatrix.encoder;

/* compiled from: X12Encoder */
final class m extends c {
    public int yM() {
        return 3;
    }

    m() {
    }

    public void a(h hVar) {
        StringBuilder stringBuilder = new StringBuilder();
        while (hVar.yU()) {
            char yP = hVar.yP();
            hVar.pos++;
            a(yP, stringBuilder);
            if (stringBuilder.length() % 3 == 0) {
                c.a(hVar, stringBuilder);
                if (j.c(hVar.getMessage(), hVar.pos, yM()) != yM()) {
                    hVar.da(0);
                    break;
                }
            }
        }
        b(hVar, stringBuilder);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(char c, StringBuilder stringBuilder) {
        if (c == 13) {
            stringBuilder.append(0);
        } else if (c == ' ') {
            stringBuilder.append(3);
        } else if (c == '*') {
            stringBuilder.append(1);
        } else if (c == '>') {
            stringBuilder.append(2);
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - 48) + 4));
        } else if (c < 'A' || c > 'Z') {
            j.u(c);
        } else {
            stringBuilder.append((char) ((c - 65) + 14));
        }
        return 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(h hVar, StringBuilder stringBuilder) {
        hVar.yY();
        int zg = hVar.yX().zg() - hVar.yR();
        hVar.pos -= stringBuilder.length();
        if (hVar.yW() > 1 || zg > 1 || hVar.yW() != zg) {
            hVar.m(254);
        }
        if (hVar.yS() < 0) {
            hVar.da(0);
        }
    }
}
