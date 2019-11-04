package okhttp3.internal.tls;

import javax.security.auth.x500.X500Principal;

final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length = this.dn.length();
    private int pos;

    DistinguishedNameParser(X500Principal x500Principal) {
        this.dn = x500Principal.getName("RFC2253");
    }

    private String nextAT() {
        int i;
        while (true) {
            i = this.pos;
            if (i >= this.length || this.chars[i] != ' ') {
                i = this.pos;
            } else {
                this.pos = i + 1;
            }
        }
        i = this.pos;
        if (i == this.length) {
            return null;
        }
        char[] cArr;
        this.beg = i;
        this.pos = i + 1;
        while (true) {
            i = this.pos;
            if (i >= this.length) {
                break;
            }
            cArr = this.chars;
            if (cArr[i] == '=' || cArr[i] == ' ') {
                break;
            }
            this.pos = i + 1;
        }
        i = this.pos;
        String str = "Unexpected end of DN: ";
        StringBuilder stringBuilder;
        if (i < this.length) {
            char[] cArr2;
            int i2;
            this.end = i;
            if (this.chars[i] == ' ') {
                while (true) {
                    i = this.pos;
                    if (i >= this.length) {
                        break;
                    }
                    cArr = this.chars;
                    if (cArr[i] == '=' || cArr[i] != ' ') {
                        break;
                    }
                    this.pos = i + 1;
                }
                cArr2 = this.chars;
                i2 = this.pos;
                if (cArr2[i2] != '=' || i2 == this.length) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(this.dn);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.pos++;
            while (true) {
                i = this.pos;
                if (i >= this.length || this.chars[i] != ' ') {
                    i = this.end;
                    i2 = this.beg;
                } else {
                    this.pos = i + 1;
                }
            }
            i = this.end;
            i2 = this.beg;
            if (i - i2 > 4) {
                cArr2 = this.chars;
                if (cArr2[i2 + 3] == '.' && (cArr2[i2] == 'O' || cArr2[i2] == 'o')) {
                    cArr2 = this.chars;
                    i2 = this.beg;
                    if (cArr2[i2 + 1] == 'I' || cArr2[i2 + 1] == 'i') {
                        cArr2 = this.chars;
                        i2 = this.beg;
                        if (cArr2[i2 + 2] == 'D' || cArr2[i2 + 2] == 'd') {
                            this.beg += 4;
                        }
                    }
                }
            }
            cArr = this.chars;
            int i3 = this.beg;
            return new String(cArr, i3, this.end - i3);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.dn);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private String quotedAV() {
        this.pos++;
        this.beg = this.pos;
        this.end = this.beg;
        while (true) {
            int i = this.pos;
            if (i != this.length) {
                char[] cArr = this.chars;
                if (cArr[i] == '\"') {
                    int i2;
                    this.pos = i + 1;
                    while (true) {
                        i = this.pos;
                        if (i >= this.length || this.chars[i] != ' ') {
                            cArr = this.chars;
                            i2 = this.beg;
                        } else {
                            this.pos = i + 1;
                        }
                    }
                    cArr = this.chars;
                    i2 = this.beg;
                    return new String(cArr, i2, this.end - i2);
                }
                if (cArr[i] == '\\') {
                    cArr[this.end] = getEscaped();
                } else {
                    cArr[this.end] = cArr[i];
                }
                this.pos++;
                this.end++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected end of DN: ");
                stringBuilder.append(this.dn);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private String hexAV() {
        int i = this.pos;
        String str = "Unexpected end of DN: ";
        StringBuilder stringBuilder;
        if (i + 4 < this.length) {
            this.beg = i;
            this.pos = i + 1;
            while (true) {
                i = this.pos;
                if (i == this.length) {
                    break;
                }
                char[] cArr = this.chars;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.end = i;
                    this.pos = i + 1;
                    while (true) {
                        i = this.pos;
                        if (i >= this.length || this.chars[i] != ' ') {
                            break;
                        }
                        this.pos = i + 1;
                    }
                } else {
                    if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                        cArr[i] = (char) (cArr[i] + 32);
                    }
                    this.pos++;
                }
            }
            this.end = this.pos;
            i = this.end;
            int i2 = this.beg;
            i -= i2;
            if (i < 5 || (i & 1) == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.dn);
                throw new IllegalStateException(stringBuilder.toString());
            }
            byte[] bArr = new byte[(i / 2)];
            i2++;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                bArr[i3] = (byte) getByte(i2);
                i2 += 2;
            }
            return new String(this.chars, this.beg, i);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.dn);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* JADX WARNING: Missing block: B:30:0x009b, code skipped:
            r1 = r8.chars;
            r2 = r8.beg;
     */
    /* JADX WARNING: Missing block: B:31:0x00a7, code skipped:
            return new java.lang.String(r1, r2, r8.cur - r2);
     */
    private java.lang.String escapedAV() {
        /*
        r8 = this;
        r0 = r8.pos;
        r8.beg = r0;
        r8.end = r0;
    L_0x0006:
        r0 = r8.pos;
        r1 = r8.length;
        if (r0 < r1) goto L_0x0019;
    L_0x000c:
        r0 = new java.lang.String;
        r1 = r8.chars;
        r2 = r8.beg;
        r3 = r8.end;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
    L_0x0019:
        r1 = r8.chars;
        r2 = r1[r0];
        r3 = 44;
        r4 = 43;
        r5 = 59;
        r6 = 32;
        if (r2 == r6) goto L_0x0060;
    L_0x0027:
        if (r2 == r5) goto L_0x0053;
    L_0x0029:
        r5 = 92;
        if (r2 == r5) goto L_0x0040;
    L_0x002d:
        if (r2 == r4) goto L_0x0053;
    L_0x002f:
        if (r2 == r3) goto L_0x0053;
    L_0x0031:
        r2 = r8.end;
        r3 = r2 + 1;
        r8.end = r3;
        r3 = r1[r0];
        r1[r2] = r3;
        r0 = r0 + 1;
        r8.pos = r0;
        goto L_0x0006;
    L_0x0040:
        r0 = r8.end;
        r2 = r0 + 1;
        r8.end = r2;
        r2 = r8.getEscaped();
        r1[r0] = r2;
        r0 = r8.pos;
        r0 = r0 + 1;
        r8.pos = r0;
        goto L_0x0006;
    L_0x0053:
        r0 = new java.lang.String;
        r1 = r8.chars;
        r2 = r8.beg;
        r3 = r8.end;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
    L_0x0060:
        r2 = r8.end;
        r8.cur = r2;
        r0 = r0 + 1;
        r8.pos = r0;
        r0 = r2 + 1;
        r8.end = r0;
        r1[r2] = r6;
    L_0x006e:
        r0 = r8.pos;
        r1 = r8.length;
        if (r0 >= r1) goto L_0x0087;
    L_0x0074:
        r1 = r8.chars;
        r2 = r1[r0];
        if (r2 != r6) goto L_0x0087;
    L_0x007a:
        r2 = r8.end;
        r7 = r2 + 1;
        r8.end = r7;
        r1[r2] = r6;
        r0 = r0 + 1;
        r8.pos = r0;
        goto L_0x006e;
    L_0x0087:
        r0 = r8.pos;
        r1 = r8.length;
        if (r0 == r1) goto L_0x009b;
    L_0x008d:
        r1 = r8.chars;
        r2 = r1[r0];
        if (r2 == r3) goto L_0x009b;
    L_0x0093:
        r2 = r1[r0];
        if (r2 == r4) goto L_0x009b;
    L_0x0097:
        r0 = r1[r0];
        if (r0 != r5) goto L_0x0006;
    L_0x009b:
        r0 = new java.lang.String;
        r1 = r8.chars;
        r2 = r8.beg;
        r3 = r8.cur;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private char getEscaped() {
        this.pos++;
        int i = this.pos;
        if (i != this.length) {
            char c = this.chars[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return getUTF8();
                        }
                }
            }
            return this.chars[this.pos];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end of DN: ");
        stringBuilder.append(this.dn);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private char getUTF8() {
        int i = getByte(this.pos);
        this.pos++;
        if (i < 128) {
            return (char) i;
        }
        if (i < 192 || i > 247) {
            return '?';
        }
        int i2;
        if (i <= 223) {
            i &= 31;
            i2 = 1;
        } else if (i <= 239) {
            i2 = 2;
            i &= 15;
        } else {
            i2 = 3;
            i &= 7;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.pos++;
            int i4 = this.pos;
            if (i4 == this.length || this.chars[i4] != '\\') {
                return '?';
            }
            this.pos = i4 + 1;
            i4 = getByte(this.pos);
            this.pos++;
            if ((i4 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (i4 & 63);
        }
        return (char) i;
    }

    private int getByte(int i) {
        int i2 = i + 1;
        String str = "Malformed DN: ";
        StringBuilder stringBuilder;
        if (i2 < this.length) {
            char c = this.chars[i];
            if (c >= '0' && c <= '9') {
                i = c - 48;
            } else if (c >= 'a' && c <= 'f') {
                i = c - 87;
            } else if (c < 'A' || c > 'F') {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.dn);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                i = c - 55;
            }
            char c2 = this.chars[i2];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - 48;
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 87;
            } else if (c2 < 'A' || c2 > 'F') {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.dn);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                i2 = c2 - 55;
            }
            return (i << 4) + i2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.dn);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String findMostSpecific(String str) {
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        while (true) {
            int i = this.pos;
            if (i == this.length) {
                return null;
            }
            char c = this.chars[i];
            String escapedAV = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : escapedAV() : hexAV() : quotedAV();
            if (str.equalsIgnoreCase(nextAT)) {
                return escapedAV;
            }
            int i2 = this.pos;
            if (i2 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            String str2 = "Malformed DN: ";
            StringBuilder stringBuilder;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.pos++;
                nextAT = nextAT();
                if (nextAT == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(this.dn);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(this.dn);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
