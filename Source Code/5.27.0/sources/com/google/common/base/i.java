package com.google.common.base;

/* compiled from: Preconditions */
public final class i {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, obj));
        }
    }

    public static void a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, Long.valueOf(j), obj));
        }
    }

    public static void a(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, obj, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m.g(str, obj, obj2));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(m.g(str, objArr));
        }
    }

    public static void b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(m.g(str, Integer.valueOf(i)));
        }
    }

    public static void b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(m.g(str, Long.valueOf(j)));
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m.g(str, obj));
        }
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T a(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m.g(str, obj));
    }

    public static int s(int i, int i2) {
        return c(i, i2, "index");
    }

    public static int c(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(d(i, i2, str));
    }

    private static String d(int i, int i2, String str) {
        if (i < 0) {
            return m.g("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m.g("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static int t(int i, int i2) {
        return e(i, i2, "index");
    }

    public static int e(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(f(i, i2, str));
    }

    private static String f(int i, int i2, String str) {
        if (i < 0) {
            return m.g("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m.g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(g(i, i2, i3));
        }
    }

    private static String g(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return f(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return f(i2, i3, "end index");
        }
        return m.g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
