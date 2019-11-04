package com.microblink.secured;

/* compiled from: line */
public final class h {
    ae ewa = null;
    ae ewb = null;
    boolean ewc = false;
    boolean ewd = true;
    boolean ewe = true;

    public h(String str) {
        if (str == null || str.length() == 0) {
            throw new NullPointerException("Interval expression cannot be null nor empty!");
        }
        str = str.trim();
        String str2 = "*";
        if (str2.equals(str)) {
            this.ewc = true;
            return;
        }
        StringBuilder stringBuilder;
        String str3 = "Invalid version interval: ";
        if (str.charAt(0) == '[') {
            this.ewd = true;
        } else if (str.charAt(0) == '<') {
            this.ewd = false;
        } else {
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int length = str.length() - 1;
        if (str.charAt(length) == ']') {
            this.ewe = true;
        } else if (str.charAt(length) == '>') {
            this.ewe = false;
        } else {
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String[] split = str.substring(1, length).split(",");
        if (split.length == 2) {
            if (!str2.equals(split[0])) {
                this.ewa = new ae(split[0]);
            }
            if (!str2.equals(split[1])) {
                this.ewb = new ae(split[1]);
            }
            return;
        }
        stringBuilder = new StringBuilder(str3);
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.ewc) {
            stringBuilder.append('*');
        } else {
            if (this.ewd) {
                stringBuilder.append('[');
            } else {
                stringBuilder.append('<');
            }
            ae aeVar = this.ewa;
            if (aeVar != null) {
                stringBuilder.append(aeVar.toString());
            } else {
                stringBuilder.append('*');
            }
            stringBuilder.append(',');
            aeVar = this.ewb;
            if (aeVar != null) {
                stringBuilder.append(aeVar.toString());
            } else {
                stringBuilder.append('*');
            }
            if (this.ewe) {
                stringBuilder.append(']');
            } else {
                stringBuilder.append('>');
            }
        }
        return stringBuilder.toString();
    }
}
