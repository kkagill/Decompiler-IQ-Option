package com.google.android.material.e;

/* compiled from: MathUtils */
public final class a {
    private static float c(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    public static boolean f(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static float lerp(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        return c(b(f, f2, f3, f4), b(f, f2, f5, f4), b(f, f2, f5, f6), b(f, f2, f3, f6));
    }
}
