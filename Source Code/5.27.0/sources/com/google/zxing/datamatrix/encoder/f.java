package com.google.zxing.datamatrix.encoder;

/* compiled from: EdifactEncoder */
final class f implements g {
    public int yM() {
        return 4;
    }

    f() {
    }

    public void a(h hVar) {
        CharSequence stringBuilder = new StringBuilder();
        while (hVar.yU()) {
            b(hVar.yP(), (StringBuilder) stringBuilder);
            hVar.pos++;
            if (stringBuilder.length() >= 4) {
                hVar.cS(b(stringBuilder, 0));
                stringBuilder.delete(0, 4);
                if (j.c(hVar.getMessage(), hVar.pos, yM()) != yM()) {
                    hVar.da(0);
                    break;
                }
            }
        }
        stringBuilder.append(31);
        a(hVar, stringBuilder);
    }

    private static void a(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                int i = 1;
                if (length == 1) {
                    hVar.yY();
                    int zg = hVar.yX().zg() - hVar.yR();
                    int yW = hVar.yW();
                    if (yW > zg) {
                        hVar.db(hVar.yR() + 1);
                        zg = hVar.yX().zg() - hVar.yR();
                    }
                    if (yW <= zg && zg <= 2) {
                        hVar.da(0);
                        return;
                    }
                }
                if (length <= 4) {
                    length--;
                    String b = b(charSequence, 0);
                    if ((hVar.yU() ^ 1) == 0 || length > 2) {
                        i = 0;
                    }
                    if (length <= 2) {
                        hVar.db(hVar.yR() + length);
                        if (hVar.yX().zg() - hVar.yR() >= 3) {
                            hVar.db(hVar.yR() + b.length());
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        hVar.yZ();
                        hVar.pos -= length;
                    } else {
                        hVar.cS(b);
                    }
                    hVar.da(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.da(0);
        }
    }

    private static void b(char c, StringBuilder stringBuilder) {
        if (c >= ' ' && c <= '?') {
            stringBuilder.append(c);
        } else if (c < '@' || c > '^') {
            j.u(c);
        } else {
            stringBuilder.append((char) (c - 64));
        }
    }

    private static String b(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            int i2 = 0;
            int charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            int charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                i2 = charSequence.charAt(i + 3);
            }
            int i3 = (((charAt << 18) + (charAt2 << 12)) + (charAt3 << 6)) + i2;
            char c = (char) ((i3 >> 16) & 255);
            charAt = (char) ((i3 >> 8) & 255);
            char c2 = (char) (i3 & 255);
            StringBuilder stringBuilder = new StringBuilder(3);
            stringBuilder.append(c);
            if (length >= 2) {
                stringBuilder.append(charAt);
            }
            if (length >= 3) {
                stringBuilder.append(c2);
            }
            return stringBuilder.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
