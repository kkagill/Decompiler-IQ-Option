package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;

/* compiled from: ReflectProperties */
public class x {

    /* compiled from: ReflectProperties */
    public static abstract class c<T> {
        private static final Object eYh = new Object() {
        };

        public abstract T invoke();

        public final T B(Object obj, Object obj2) {
            return invoke();
        }

        /* Access modifiers changed, original: protected */
        public Object ds(T t) {
            return t == null ? eYh : t;
        }

        /* Access modifiers changed, original: protected */
        public T dt(Object obj) {
            return obj == eYh ? null : obj;
        }
    }

    /* compiled from: ReflectProperties */
    public static class a<T> extends c<T> {
        private SoftReference<Object> eYg;
        private final kotlin.jvm.a.a<T> initializer;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public a(T t, kotlin.jvm.a.a<T> aVar) {
            if (aVar == null) {
                $$$reportNull$$$0(0);
            }
            this.eYg = null;
            this.initializer = aVar;
            if (t != null) {
                this.eYg = new SoftReference(ds(t));
            }
        }

        public T invoke() {
            Object obj;
            SoftReference softReference = this.eYg;
            if (softReference != null) {
                obj = softReference.get();
                if (obj != null) {
                    return dt(obj);
                }
            }
            obj = this.initializer.invoke();
            this.eYg = new SoftReference(ds(obj));
            return obj;
        }
    }

    /* compiled from: ReflectProperties */
    public static class b<T> extends c<T> {
        private final kotlin.jvm.a.a<T> initializer;
        private Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        public b(kotlin.jvm.a.a<T> aVar) {
            if (aVar == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = aVar;
        }

        public T invoke() {
            Object obj = this.value;
            if (obj != null) {
                return dt(obj);
            }
            obj = this.initializer.invoke();
            this.value = ds(obj);
            return obj;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 1 || i == 3 || i == 5) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "initializer";
        }
        String str3 = "lazySoft";
        String str4 = "lazy";
        if (i == 1) {
            objArr[1] = str4;
        } else if (i == 3 || i == 5) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            objArr[2] = str4;
                        }
                    }
                }
            }
            objArr[2] = str3;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 1 || i == 3 || i == 5) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static <T> b<T> d(kotlin.jvm.a.a<T> aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        return new b(aVar);
    }

    public static <T> a<T> a(T t, kotlin.jvm.a.a<T> aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(2);
        }
        return new a(t, aVar);
    }

    public static <T> a<T> e(kotlin.jvm.a.a<T> aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(4);
        }
        a a = a(null, aVar);
        if (a == null) {
            $$$reportNull$$$0(5);
        }
        return a;
    }
}
