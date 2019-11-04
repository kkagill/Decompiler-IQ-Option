package io.reactivex.internal.a;

import io.reactivex.b.d;

/* compiled from: ObjectHelper */
public final class b {
    static final d<Object, Object> eQL = new a();

    /* compiled from: ObjectHelper */
    static final class a implements d<Object, Object> {
        a() {
        }

        public boolean test(Object obj, Object obj2) {
            return b.equals(obj, obj2);
        }
    }

    public static int compare(int i, int i2) {
        return i < i2 ? -1 : i > i2 ? 1 : 0;
    }

    public static int compare(long j, long j2) {
        return j < j2 ? -1 : j > j2 ? 1 : 0;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> d<T, T> blu() {
        return eQL;
    }

    public static int i(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
