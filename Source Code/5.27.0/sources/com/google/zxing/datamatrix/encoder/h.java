package com.google.zxing.datamatrix.encoder;

import com.google.zxing.a;
import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext */
final class h {
    private final String ahc;
    private SymbolShapeHint ahd;
    private a ahe;
    private a ahf;
    private final StringBuilder ahg;
    private int ahh;
    private k ahi;
    private int ahj;
    int pos;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder stringBuilder = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                stringBuilder.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.ahc = stringBuilder.toString();
        this.ahd = SymbolShapeHint.FORCE_NONE;
        this.ahg = new StringBuilder(str.length());
        this.ahh = -1;
    }

    public void a(SymbolShapeHint symbolShapeHint) {
        this.ahd = symbolShapeHint;
    }

    public void a(a aVar, a aVar2) {
        this.ahe = aVar;
        this.ahf = aVar2;
    }

    public String getMessage() {
        return this.ahc;
    }

    public void cZ(int i) {
        this.ahj = i;
    }

    public char yP() {
        return this.ahc.charAt(this.pos);
    }

    public StringBuilder yQ() {
        return this.ahg;
    }

    public void cS(String str) {
        this.ahg.append(str);
    }

    public void m(char c) {
        this.ahg.append(c);
    }

    public int yR() {
        return this.ahg.length();
    }

    public int yS() {
        return this.ahh;
    }

    public void da(int i) {
        this.ahh = i;
    }

    public void yT() {
        this.ahh = -1;
    }

    public boolean yU() {
        return this.pos < yV();
    }

    private int yV() {
        return this.ahc.length() - this.ahj;
    }

    public int yW() {
        return yV() - this.pos;
    }

    public k yX() {
        return this.ahi;
    }

    public void yY() {
        db(yR());
    }

    public void db(int i) {
        k kVar = this.ahi;
        if (kVar == null || i > kVar.zg()) {
            this.ahi = k.a(i, this.ahd, this.ahe, this.ahf, true);
        }
    }

    public void yZ() {
        this.ahi = null;
    }
}
