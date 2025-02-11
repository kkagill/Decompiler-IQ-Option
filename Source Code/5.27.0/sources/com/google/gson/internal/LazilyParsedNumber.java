package com.google.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number {
    private final String value;

    public LazilyParsedNumber(String str) {
        this.value = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:6:0x000e, code skipped:
            return (int) java.lang.Long.parseLong(r2.value);
     */
    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            return new java.math.BigDecimal(r2.value).intValue();
     */
    public int intValue() {
        /*
        r2 = this;
        r0 = r2.value;	 Catch:{ NumberFormatException -> 0x0007 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = r2.value;	 Catch:{ NumberFormatException -> 0x000f }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x000f }
        r1 = (int) r0;
        return r1;
    L_0x000f:
        r0 = new java.math.BigDecimal;
        r1 = r2.value;
        r0.<init>(r1);
        r0 = r0.intValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LazilyParsedNumber.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public String toString() {
        return this.value;
    }

    private Object writeReplace() {
        return new BigDecimal(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        LazilyParsedNumber lazilyParsedNumber = (LazilyParsedNumber) obj;
        String str = this.value;
        String str2 = lazilyParsedNumber.value;
        if (!(str == str2 || str.equals(str2))) {
            z = false;
        }
        return z;
    }
}
