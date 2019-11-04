package com.google.common.base;

import java.util.Arrays;

/* compiled from: MoreObjects */
public final class e {

    /* compiled from: MoreObjects */
    public static final class a {
        private final a Sc;
        private a Sd;
        private boolean Se;
        private final String className;

        /* compiled from: MoreObjects */
        private static final class a {
            a Sf;
            String name;
            Object value;

            private a() {
            }
        }

        private a(String str) {
            this.Sc = new a();
            this.Sd = this.Sc;
            this.Se = false;
            this.className = (String) i.checkNotNull(str);
        }

        public a d(String str, Object obj) {
            return e(str, obj);
        }

        public a a(String str, double d) {
            return e(str, String.valueOf(d));
        }

        public a k(String str, int i) {
            return e(str, String.valueOf(i));
        }

        public a d(String str, long j) {
            return e(str, String.valueOf(j));
        }

        public a ak(Object obj) {
            return al(obj);
        }

        public String toString() {
            boolean z = this.Se;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.className);
            stringBuilder.append('{');
            String str = "";
            for (a aVar = this.Sc.Sf; aVar != null; aVar = aVar.Sf) {
                Object obj = aVar.value;
                if (!z || obj != null) {
                    stringBuilder.append(str);
                    if (aVar.name != null) {
                        stringBuilder.append(aVar.name);
                        stringBuilder.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        stringBuilder.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        stringBuilder.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        private a pV() {
            a aVar = new a();
            this.Sd.Sf = aVar;
            this.Sd = aVar;
            return aVar;
        }

        private a al(Object obj) {
            pV().value = obj;
            return this;
        }

        private a e(String str, Object obj) {
            a pV = pV();
            pV.value = obj;
            pV.name = (String) i.checkNotNull(str);
            return this;
        }
    }

    public static <T> T g(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static a aj(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
