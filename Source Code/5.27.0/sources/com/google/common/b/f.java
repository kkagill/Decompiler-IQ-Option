package com.google.common.b;

import com.google.common.base.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: Subscriber */
class f {
    private d Yg;
    private final Method Yh;
    private final Executor executor;
    final Object target;

    /* compiled from: Subscriber */
    static final class a extends f {
        /* synthetic */ a(d dVar, Object obj, Method method, AnonymousClass1 anonymousClass1) {
            this(dVar, obj, method);
        }

        private a(d dVar, Object obj, Method method) {
            super(dVar, obj, method, null);
        }

        /* Access modifiers changed, original: 0000 */
        public void bf(Object obj) {
            synchronized (this) {
                super.bf(obj);
            }
        }
    }

    /* synthetic */ f(d dVar, Object obj, Method method, AnonymousClass1 anonymousClass1) {
        this(dVar, obj, method);
    }

    static f a(d dVar, Object obj, Method method) {
        return a(method) ? new f(dVar, obj, method) : new a(dVar, obj, method, null);
    }

    private f(d dVar, Object obj, Method method) {
        this.Yg = dVar;
        this.target = i.checkNotNull(obj);
        this.Yh = method;
        method.setAccessible(true);
        this.executor = dVar.uL();
    }

    /* Access modifiers changed, original: final */
    public final void be(final Object obj) {
        this.executor.execute(new Runnable() {
            public void run() {
                try {
                    f.this.bf(obj);
                } catch (InvocationTargetException e) {
                    f.this.Yg.a(e.getCause(), f.this.bg(obj));
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(Object obj) {
        StringBuilder stringBuilder;
        try {
            this.Yh.invoke(this.target, new Object[]{i.checkNotNull(obj)});
        } catch (IllegalArgumentException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Method rejected target/argument: ");
            stringBuilder.append(obj);
            throw new Error(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Method became inaccessible: ");
            stringBuilder.append(obj);
            throw new Error(stringBuilder.toString(), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    private g bg(Object obj) {
        return new g(this.Yg, obj, this.target, this.Yh);
    }

    public final int hashCode() {
        return ((this.Yh.hashCode() + 31) * 31) + System.identityHashCode(this.target);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.target == fVar.target && this.Yh.equals(fVar.Yh)) {
            return true;
        }
        return false;
    }

    private static boolean a(Method method) {
        return method.getAnnotation(a.class) != null;
    }
}
