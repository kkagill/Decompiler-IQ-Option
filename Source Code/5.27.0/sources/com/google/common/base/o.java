package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Throwables */
public final class o {
    private static final Object Ss = qj();
    private static final Method St = (Ss == null ? null : qk());
    private static final Method Su;

    public static <X extends Throwable> void b(Throwable th, Class<X> cls) {
        i.checkNotNull(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    @Deprecated
    public static <X extends Throwable> void c(Throwable th, Class<X> cls) {
        if (th != null) {
            b(th, cls);
        }
    }

    public static void f(Throwable th) {
        i.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static void g(Throwable th) {
        if (th != null) {
            f(th);
        }
    }

    public static <X extends Throwable> void d(Throwable th, Class<X> cls) {
        c(th, cls);
        g(th);
    }

    @Deprecated
    public static RuntimeException h(Throwable th) {
        f(th);
        throw new RuntimeException(th);
    }

    static {
        Method method = null;
        if (Ss != null) {
            method = ql();
        }
        Su = method;
    }

    private static Object qj() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            return obj;
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return obj;
        }
    }

    private static Method qk() {
        return a("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Method ql() {
        try {
            Method a = a("getStackTraceDepth", Throwable.class);
            if (a == null) {
                return null;
            }
            a.invoke(qj(), new Object[]{new Throwable()});
            return a;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
