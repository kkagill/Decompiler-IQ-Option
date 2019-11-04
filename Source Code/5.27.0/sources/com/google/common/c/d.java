package com.google.common.c;

/* compiled from: MathPreconditions */
final class d {
    static int m(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(i);
        stringBuilder.append(") must be > 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static double b(String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(d);
        stringBuilder.append(") must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void ak(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("overflow: ");
            stringBuilder.append(str);
            stringBuilder.append("(");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            stringBuilder.append(")");
            throw new ArithmeticException(stringBuilder.toString());
        }
    }
}
