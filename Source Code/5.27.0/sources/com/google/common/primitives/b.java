package com.google.common.primitives;

import java.util.regex.Pattern;

/* compiled from: Doubles */
public final class b {
    static final Pattern Zf = ve();

    private static Pattern ve() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)");
        stringBuilder.append("(?:[eE][+-]?\\d+#)?[fFdD]?");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("0[xX]");
        stringBuilder3.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        stringBuilder3.append("[pP][+-]?\\d+#[fFdD]?");
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("[+-]?(?:NaN|Infinity|");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append("|");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")");
        return Pattern.compile(stringBuilder5.toString().replace("#", "+"));
    }

    public static Double bV(String str) {
        if (Zf.matcher(str).matches()) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
