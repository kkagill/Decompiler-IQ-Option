package com.google.zxing.datamatrix.encoder;

/* compiled from: ASCIIEncoder */
final class a implements g {
    public int yM() {
        return 0;
    }

    a() {
    }

    public void a(h hVar) {
        if (j.d(hVar.getMessage(), hVar.pos) >= 2) {
            hVar.m(a(hVar.getMessage().charAt(hVar.pos), hVar.getMessage().charAt(hVar.pos + 1)));
            hVar.pos += 2;
            return;
        }
        char yP = hVar.yP();
        int c = j.c(hVar.getMessage(), hVar.pos, yM());
        if (c != yM()) {
            if (c == 1) {
                hVar.m(230);
                hVar.da(1);
            } else if (c == 2) {
                hVar.m(239);
                hVar.da(2);
            } else if (c == 3) {
                hVar.m(238);
                hVar.da(3);
            } else if (c == 4) {
                hVar.m(240);
                hVar.da(4);
            } else if (c == 5) {
                hVar.m(231);
                hVar.da(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(c)));
            }
        } else if (j.n(yP)) {
            hVar.m(235);
            hVar.m((char) ((yP - 128) + 1));
            hVar.pos++;
        } else {
            hVar.m((char) (yP + 1));
            hVar.pos++;
        }
    }

    private static char a(char c, char c2) {
        if (j.isDigit(c) && j.isDigit(c2)) {
            return (char) ((((c - 48) * 10) + (c2 - 48)) + 130);
        }
        StringBuilder stringBuilder = new StringBuilder("not digits: ");
        stringBuilder.append(c);
        stringBuilder.append(c2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
