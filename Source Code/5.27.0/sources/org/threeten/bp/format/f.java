package org.threeten.bp.format;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: DecimalStyle */
public final class f {
    public static final f fIQ = new f('0', '+', '-', '.');
    private static final ConcurrentMap<Locale, f> fIR = new ConcurrentHashMap(16, 0.75f, 2);
    private final char fIS;
    private final char fIT;
    private final char fIU;
    private final char fIV;

    private f(char c, char c2, char c3, char c4) {
        this.fIS = c;
        this.fIT = c2;
        this.fIU = c3;
        this.fIV = c4;
    }

    public char getZeroDigit() {
        return this.fIS;
    }

    public char getPositiveSign() {
        return this.fIT;
    }

    public char getNegativeSign() {
        return this.fIU;
    }

    public char getDecimalSeparator() {
        return this.fIV;
    }

    /* Access modifiers changed, original: 0000 */
    public String nN(String str) {
        char c = this.fIS;
        if (c == '0') {
            return str;
        }
        int i = c - 48;
        char[] toCharArray = str.toCharArray();
        for (int i2 = 0; i2 < toCharArray.length; i2++) {
            toCharArray[i2] = (char) (toCharArray[i2] + i);
        }
        return new String(toCharArray);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!(this.fIS == fVar.fIS && this.fIT == fVar.fIT && this.fIU == fVar.fIU && this.fIV == fVar.fIV)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.fIS + this.fIT) + this.fIU) + this.fIV;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecimalStyle[");
        stringBuilder.append(this.fIS);
        stringBuilder.append(this.fIT);
        stringBuilder.append(this.fIU);
        stringBuilder.append(this.fIV);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
