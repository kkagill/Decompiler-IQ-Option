package kotlin.reflect.jvm.internal.impl.utils;

public class WrappedValues {
    private static final Object eYh = new Object() {
        public String toString() {
            return "NULL_VALUE";
        }
    };
    public static volatile boolean fAj = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    private static final class a {
        private final Throwable bHa;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = str2;
            }
            if (i != 1) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        /* synthetic */ a(Throwable th, AnonymousClass1 anonymousClass1) {
            this(th);
        }

        private a(Throwable th) {
            if (th == null) {
                $$$reportNull$$$0(0);
            }
            this.bHa = th;
        }

        public Throwable getThrowable() {
            Throwable th = this.bHa;
            if (th == null) {
                $$$reportNull$$$0(1);
            }
            return th;
        }

        public String toString() {
            return this.bHa.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    private static /* synthetic */ void $$$reportNull$$$0(int r9) {
        /*
        r0 = 4;
        r1 = 1;
        r2 = 2;
        if (r9 == r1) goto L_0x000c;
    L_0x0005:
        if (r9 == r2) goto L_0x000c;
    L_0x0007:
        if (r9 == r0) goto L_0x000c;
    L_0x0009:
        r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        goto L_0x000e;
    L_0x000c:
        r3 = "@NotNull method %s.%s must not return null";
    L_0x000e:
        r4 = 3;
        if (r9 == r1) goto L_0x0017;
    L_0x0011:
        if (r9 == r2) goto L_0x0017;
    L_0x0013:
        if (r9 == r0) goto L_0x0017;
    L_0x0015:
        r5 = 3;
        goto L_0x0018;
    L_0x0017:
        r5 = 2;
    L_0x0018:
        r5 = new java.lang.Object[r5];
        r6 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        r7 = 0;
        if (r9 == r1) goto L_0x0031;
    L_0x001f:
        if (r9 == r2) goto L_0x0031;
    L_0x0021:
        if (r9 == r4) goto L_0x002b;
    L_0x0023:
        if (r9 == r0) goto L_0x0031;
    L_0x0025:
        r8 = "value";
        r5[r7] = r8;
        goto L_0x0033;
    L_0x002b:
        r8 = "throwable";
        r5[r7] = r8;
        goto L_0x0033;
    L_0x0031:
        r5[r7] = r6;
    L_0x0033:
        r7 = "escapeThrowable";
        if (r9 == r1) goto L_0x0041;
    L_0x0037:
        if (r9 == r2) goto L_0x0041;
    L_0x0039:
        if (r9 == r0) goto L_0x003e;
    L_0x003b:
        r5[r1] = r6;
        goto L_0x0045;
    L_0x003e:
        r5[r1] = r7;
        goto L_0x0045;
    L_0x0041:
        r6 = "escapeNull";
        r5[r1] = r6;
    L_0x0045:
        if (r9 == r1) goto L_0x005e;
    L_0x0047:
        if (r9 == r2) goto L_0x005e;
    L_0x0049:
        if (r9 == r4) goto L_0x005c;
    L_0x004b:
        if (r9 == r0) goto L_0x005e;
    L_0x004d:
        r4 = 5;
        if (r9 == r4) goto L_0x0056;
    L_0x0050:
        r4 = "unescapeNull";
        r5[r2] = r4;
        goto L_0x005e;
    L_0x0056:
        r4 = "unescapeExceptionOrNull";
        r5[r2] = r4;
        goto L_0x005e;
    L_0x005c:
        r5[r2] = r7;
    L_0x005e:
        r3 = java.lang.String.format(r3, r5);
        if (r9 == r1) goto L_0x006e;
    L_0x0064:
        if (r9 == r2) goto L_0x006e;
    L_0x0066:
        if (r9 == r0) goto L_0x006e;
    L_0x0068:
        r9 = new java.lang.IllegalArgumentException;
        r9.<init>(r3);
        goto L_0x0073;
    L_0x006e:
        r9 = new java.lang.IllegalStateException;
        r9.<init>(r3);
    L_0x0073:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.utils.WrappedValues.$$$reportNull$$$0(int):void");
    }

    public static <V> V dY(Object obj) {
        if (obj == null) {
            $$$reportNull$$$0(0);
        }
        return obj == eYh ? null : obj;
    }

    public static <V> Object dZ(V v) {
        if (v == null) {
            Object obj = eYh;
            if (obj == null) {
                $$$reportNull$$$0(1);
            }
            return obj;
        }
        if (v == null) {
            $$$reportNull$$$0(2);
        }
        return v;
    }

    public static Object ar(Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(3);
        }
        return new a(th, null);
    }

    public static <V> V ea(Object obj) {
        if (obj == null) {
            $$$reportNull$$$0(5);
        }
        return dY(eb(obj));
    }

    public static <V> V eb(Object obj) {
        if (!(obj instanceof a)) {
            return obj;
        }
        Throwable throwable = ((a) obj).getThrowable();
        if (fAj && c.aq(throwable)) {
            throw new WrappedProcessCanceledException(throwable);
        }
        throw c.j(throwable);
    }
}
