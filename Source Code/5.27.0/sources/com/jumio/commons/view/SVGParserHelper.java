package com.jumio.commons.view;

class SVGParserHelper {
    private static final double[] pow10 = new double[128];
    private char current;
    private int n;
    public int pos;
    private CharSequence s;

    public SVGParserHelper(CharSequence charSequence, int i) {
        this.s = charSequence;
        this.pos = i;
        this.n = charSequence.length();
        this.current = charSequence.charAt(i);
    }

    private char read() {
        int i = this.pos;
        if (i < this.n) {
            this.pos = i + 1;
        }
        i = this.pos;
        if (i == this.n) {
            return 0;
        }
        return this.s.charAt(i);
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.pos;
            if (i < this.n && Character.isWhitespace(this.s.charAt(i))) {
                advance();
            } else {
                return;
            }
        }
    }

    public void skipNumberSeparator() {
        while (true) {
            int i = this.pos;
            if (i < this.n) {
                char charAt = this.s.charAt(i);
                if (charAt == 9 || charAt == 10 || charAt == ' ' || charAt == ',') {
                    advance();
                } else {
                    return;
                }
            }
            return;
        }
    }

    public void advance() {
        this.current = read();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A:{LOOP_START, PHI: r12 } */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARNING: Missing block: B:11:0x0028, code skipped:
            r15.current = read();
            r5 = r15.current;
     */
    /* JADX WARNING: Missing block: B:12:0x0030, code skipped:
            if (r5 == '.') goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:13:0x0032, code skipped:
            if (r5 == 'E') goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:14:0x0034, code skipped:
            if (r5 == 'e') goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:15:0x0036, code skipped:
            switch(r5) {
                case 48: goto L_0x0028;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x003a;
                case 52: goto L_0x003a;
                case 53: goto L_0x003a;
                case 54: goto L_0x003a;
                case 55: goto L_0x003a;
                case 56: goto L_0x003a;
                case 57: goto L_0x003a;
                default: goto L_0x0039;
            };
     */
    /* JADX WARNING: Missing block: B:16:0x0039, code skipped:
            return 0.0f;
     */
    /* JADX WARNING: Missing block: B:17:0x003a, code skipped:
            r5 = 0;
            r11 = 0;
            r12 = 0;
     */
    /* JADX WARNING: Missing block: B:18:0x003d, code skipped:
            if (r5 >= 9) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:19:0x003f, code skipped:
            r5 = r5 + 1;
            r12 = (r12 * 10) + (r15.current - 48);
     */
    /* JADX WARNING: Missing block: B:20:0x0049, code skipped:
            r11 = r11 + 1;
     */
    /* JADX WARNING: Missing block: B:21:0x004b, code skipped:
            r15.current = read();
     */
    /* JADX WARNING: Missing block: B:22:0x0053, code skipped:
            switch(r15.current) {
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
                case 50: goto L_0x003d;
                case 51: goto L_0x003d;
                case 52: goto L_0x003d;
                case 53: goto L_0x003d;
                case 54: goto L_0x003d;
                case 55: goto L_0x003d;
                case 56: goto L_0x003d;
                case 57: goto L_0x003d;
                default: goto L_0x0056;
            };
     */
    /* JADX WARNING: Missing block: B:23:0x0056, code skipped:
            r13 = r12;
            r12 = r11;
            r11 = r5;
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:24:0x005b, code skipped:
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:26:0x005e, code skipped:
            r11 = 0;
            r12 = 0;
            r13 = 0;
     */
    /* JADX WARNING: Missing block: B:41:0x0095, code skipped:
            r15.current = read();
     */
    /* JADX WARNING: Missing block: B:59:0x00d0, code skipped:
            r15.current = read();
     */
    /* JADX WARNING: Missing block: B:60:0x00d8, code skipped:
            switch(r15.current) {
                case 48: goto L_0x00d0;
                case 49: goto L_0x00dc;
                case 50: goto L_0x00dc;
                case 51: goto L_0x00dc;
                case 52: goto L_0x00dc;
                case 53: goto L_0x00dc;
                case 54: goto L_0x00dc;
                case 55: goto L_0x00dc;
                case 56: goto L_0x00dc;
                case 57: goto L_0x00dc;
                default: goto L_0x00db;
            };
     */
    /* JADX WARNING: Missing block: B:61:0x00dc, code skipped:
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:63:0x00de, code skipped:
            if (r4 >= 3) goto L_0x00e9;
     */
    /* JADX WARNING: Missing block: B:64:0x00e0, code skipped:
            r4 = r4 + 1;
            r1 = (r1 * 10) + (r15.current - 48);
     */
    /* JADX WARNING: Missing block: B:65:0x00e9, code skipped:
            r15.current = read();
     */
    /* JADX WARNING: Missing block: B:66:0x00f1, code skipped:
            switch(r15.current) {
                case 48: goto L_0x00dd;
                case 49: goto L_0x00dd;
                case 50: goto L_0x00dd;
                case 51: goto L_0x00dd;
                case 52: goto L_0x00dd;
                case 53: goto L_0x00dd;
                case 54: goto L_0x00dd;
                case 55: goto L_0x00dd;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00dd;
                default: goto L_0x00f4;
            };
     */
    /* JADX WARNING: Missing block: B:67:0x00f4, code skipped:
            r4 = r1;
     */
    public float parseFloat() {
        /*
        r15 = this;
        r0 = r15.current;
        r1 = 45;
        r2 = 43;
        r3 = 1;
        r4 = 0;
        if (r0 == r2) goto L_0x0010;
    L_0x000a:
        if (r0 == r1) goto L_0x000e;
    L_0x000c:
        r0 = 1;
        goto L_0x0017;
    L_0x000e:
        r0 = 0;
        goto L_0x0011;
    L_0x0010:
        r0 = 1;
    L_0x0011:
        r5 = r15.read();
        r15.current = r5;
    L_0x0017:
        r5 = r15.current;
        r6 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r7 = 69;
        r8 = 46;
        r9 = 9;
        r10 = 0;
        switch(r5) {
            case 46: goto L_0x005d;
            case 47: goto L_0x0025;
            case 48: goto L_0x0028;
            case 49: goto L_0x003a;
            case 50: goto L_0x003a;
            case 51: goto L_0x003a;
            case 52: goto L_0x003a;
            case 53: goto L_0x003a;
            case 54: goto L_0x003a;
            case 55: goto L_0x003a;
            case 56: goto L_0x003a;
            case 57: goto L_0x003a;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        return r0;
    L_0x0028:
        r5 = r15.read();
        r15.current = r5;
        r5 = r15.current;
        if (r5 == r8) goto L_0x005b;
    L_0x0032:
        if (r5 == r7) goto L_0x005b;
    L_0x0034:
        if (r5 == r6) goto L_0x005b;
    L_0x0036:
        switch(r5) {
            case 48: goto L_0x0028;
            case 49: goto L_0x003a;
            case 50: goto L_0x003a;
            case 51: goto L_0x003a;
            case 52: goto L_0x003a;
            case 53: goto L_0x003a;
            case 54: goto L_0x003a;
            case 55: goto L_0x003a;
            case 56: goto L_0x003a;
            case 57: goto L_0x003a;
            default: goto L_0x0039;
        };
    L_0x0039:
        return r10;
    L_0x003a:
        r5 = 0;
        r11 = 0;
        r12 = 0;
    L_0x003d:
        if (r5 >= r9) goto L_0x0049;
    L_0x003f:
        r5 = r5 + 1;
        r12 = r12 * 10;
        r13 = r15.current;
        r13 = r13 + -48;
        r12 = r12 + r13;
        goto L_0x004b;
    L_0x0049:
        r11 = r11 + 1;
    L_0x004b:
        r13 = r15.read();
        r15.current = r13;
        r13 = r15.current;
        switch(r13) {
            case 48: goto L_0x003d;
            case 49: goto L_0x003d;
            case 50: goto L_0x003d;
            case 51: goto L_0x003d;
            case 52: goto L_0x003d;
            case 53: goto L_0x003d;
            case 54: goto L_0x003d;
            case 55: goto L_0x003d;
            case 56: goto L_0x003d;
            case 57: goto L_0x003d;
            default: goto L_0x0056;
        };
    L_0x0056:
        r13 = r12;
        r12 = r11;
        r11 = r5;
        r5 = 1;
        goto L_0x0061;
    L_0x005b:
        r5 = 1;
        goto L_0x005e;
    L_0x005d:
        r5 = 0;
    L_0x005e:
        r11 = 0;
        r12 = 0;
        r13 = 0;
    L_0x0061:
        r14 = r15.current;
        if (r14 != r8) goto L_0x00a0;
    L_0x0065:
        r8 = r15.read();
        r15.current = r8;
        r8 = r15.current;
        switch(r8) {
            case 48: goto L_0x0076;
            case 49: goto L_0x0088;
            case 50: goto L_0x0088;
            case 51: goto L_0x0088;
            case 52: goto L_0x0088;
            case 53: goto L_0x0088;
            case 54: goto L_0x0088;
            case 55: goto L_0x0088;
            case 56: goto L_0x0088;
            case 57: goto L_0x0088;
            default: goto L_0x0070;
        };
    L_0x0070:
        if (r5 != 0) goto L_0x00a0;
    L_0x0072:
        r15.reportUnexpectedCharacterError(r8);
        return r10;
    L_0x0076:
        if (r11 != 0) goto L_0x0088;
    L_0x0078:
        r8 = r15.read();
        r15.current = r8;
        r12 = r12 + -1;
        r8 = r15.current;
        switch(r8) {
            case 48: goto L_0x0078;
            case 49: goto L_0x0088;
            case 50: goto L_0x0088;
            case 51: goto L_0x0088;
            case 52: goto L_0x0088;
            case 53: goto L_0x0088;
            case 54: goto L_0x0088;
            case 55: goto L_0x0088;
            case 56: goto L_0x0088;
            case 57: goto L_0x0088;
            default: goto L_0x0085;
        };
    L_0x0085:
        if (r5 != 0) goto L_0x00a0;
    L_0x0087:
        return r10;
    L_0x0088:
        if (r11 >= r9) goto L_0x0095;
    L_0x008a:
        r11 = r11 + 1;
        r13 = r13 * 10;
        r5 = r15.current;
        r5 = r5 + -48;
        r13 = r13 + r5;
        r12 = r12 + -1;
    L_0x0095:
        r5 = r15.read();
        r15.current = r5;
        r5 = r15.current;
        switch(r5) {
            case 48: goto L_0x0088;
            case 49: goto L_0x0088;
            case 50: goto L_0x0088;
            case 51: goto L_0x0088;
            case 52: goto L_0x0088;
            case 53: goto L_0x0088;
            case 54: goto L_0x0088;
            case 55: goto L_0x0088;
            case 56: goto L_0x0088;
            case 57: goto L_0x0088;
            default: goto L_0x00a0;
        };
    L_0x00a0:
        r5 = r15.current;
        if (r5 == r7) goto L_0x00a7;
    L_0x00a4:
        if (r5 == r6) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00f5;
    L_0x00a7:
        r5 = r15.read();
        r15.current = r5;
        r5 = r15.current;
        if (r5 == r2) goto L_0x00bb;
    L_0x00b1:
        if (r5 == r1) goto L_0x00ba;
    L_0x00b3:
        switch(r5) {
            case 48: goto L_0x00ca;
            case 49: goto L_0x00ca;
            case 50: goto L_0x00ca;
            case 51: goto L_0x00ca;
            case 52: goto L_0x00ca;
            case 53: goto L_0x00ca;
            case 54: goto L_0x00ca;
            case 55: goto L_0x00ca;
            case 56: goto L_0x00ca;
            case 57: goto L_0x00ca;
            default: goto L_0x00b6;
        };
    L_0x00b6:
        r15.reportUnexpectedCharacterError(r5);
        return r10;
    L_0x00ba:
        r3 = 0;
    L_0x00bb:
        r1 = r15.read();
        r15.current = r1;
        r1 = r15.current;
        switch(r1) {
            case 48: goto L_0x00ca;
            case 49: goto L_0x00ca;
            case 50: goto L_0x00ca;
            case 51: goto L_0x00ca;
            case 52: goto L_0x00ca;
            case 53: goto L_0x00ca;
            case 54: goto L_0x00ca;
            case 55: goto L_0x00ca;
            case 56: goto L_0x00ca;
            case 57: goto L_0x00ca;
            default: goto L_0x00c6;
        };
    L_0x00c6:
        r15.reportUnexpectedCharacterError(r1);
        return r10;
    L_0x00ca:
        r1 = r15.current;
        switch(r1) {
            case 48: goto L_0x00d0;
            case 49: goto L_0x00dc;
            case 50: goto L_0x00dc;
            case 51: goto L_0x00dc;
            case 52: goto L_0x00dc;
            case 53: goto L_0x00dc;
            case 54: goto L_0x00dc;
            case 55: goto L_0x00dc;
            case 56: goto L_0x00dc;
            case 57: goto L_0x00dc;
            default: goto L_0x00cf;
        };
    L_0x00cf:
        goto L_0x00f5;
    L_0x00d0:
        r1 = r15.read();
        r15.current = r1;
        r1 = r15.current;
        switch(r1) {
            case 48: goto L_0x00d0;
            case 49: goto L_0x00dc;
            case 50: goto L_0x00dc;
            case 51: goto L_0x00dc;
            case 52: goto L_0x00dc;
            case 53: goto L_0x00dc;
            case 54: goto L_0x00dc;
            case 55: goto L_0x00dc;
            case 56: goto L_0x00dc;
            case 57: goto L_0x00dc;
            default: goto L_0x00db;
        };
    L_0x00db:
        goto L_0x00f5;
    L_0x00dc:
        r1 = 0;
    L_0x00dd:
        r2 = 3;
        if (r4 >= r2) goto L_0x00e9;
    L_0x00e0:
        r4 = r4 + 1;
        r1 = r1 * 10;
        r2 = r15.current;
        r2 = r2 + -48;
        r1 = r1 + r2;
    L_0x00e9:
        r2 = r15.read();
        r15.current = r2;
        r2 = r15.current;
        switch(r2) {
            case 48: goto L_0x00dd;
            case 49: goto L_0x00dd;
            case 50: goto L_0x00dd;
            case 51: goto L_0x00dd;
            case 52: goto L_0x00dd;
            case 53: goto L_0x00dd;
            case 54: goto L_0x00dd;
            case 55: goto L_0x00dd;
            case 56: goto L_0x00dd;
            case 57: goto L_0x00dd;
            default: goto L_0x00f4;
        };
    L_0x00f4:
        r4 = r1;
    L_0x00f5:
        if (r3 != 0) goto L_0x00f8;
    L_0x00f7:
        r4 = -r4;
    L_0x00f8:
        r4 = r4 + r12;
        if (r0 != 0) goto L_0x00fc;
    L_0x00fb:
        r13 = -r13;
    L_0x00fc:
        r0 = buildFloat(r13, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.view.SVGParserHelper.parseFloat():float");
    }

    private void reportUnexpectedCharacterError(char c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected char '");
        stringBuilder.append(c);
        stringBuilder.append("'.");
        throw new RuntimeException(stringBuilder.toString());
    }

    public static float buildFloat(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        } else if (i2 == 0) {
            return (float) i;
        } else {
            double d;
            if (i >= 67108864) {
                i++;
            }
            double d2;
            if (i2 > 0) {
                d = (double) i;
                d2 = pow10[i2];
                Double.isNaN(d);
                d *= d2;
            } else {
                d = (double) i;
                d2 = pow10[-i2];
                Double.isNaN(d);
                d /= d2;
            }
            return (float) d;
        }
    }

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i < dArr.length) {
                dArr[i] = Math.pow(10.0d, (double) i);
                i++;
            } else {
                return;
            }
        }
    }

    public float nextFloat() {
        skipWhitespace();
        float parseFloat = parseFloat();
        skipNumberSeparator();
        return parseFloat;
    }
}
