package com.google.common.io;

import com.google.common.base.i;
import com.google.common.base.o;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Closer */
public final class g implements Closeable {
    private static final c Yv = (b.isAvailable() ? b.YA : a.Yz);
    final c Yw;
    private final Deque<Closeable> Yx = new ArrayDeque(4);
    private Throwable Yy;

    /* compiled from: Closer */
    interface c {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    /* compiled from: Closer */
    static final class a implements c {
        static final a Yz = new a();

        a() {
        }

        public void a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = f.logger;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppressing exception thrown when closing ");
            stringBuilder.append(closeable);
            logger.log(level, stringBuilder.toString(), th2);
        }
    }

    /* compiled from: Closer */
    static final class b implements c {
        static final b YA = new b();
        static final Method YB = vb();

        b() {
        }

        static boolean isAvailable() {
            return YB != null;
        }

        private static Method vb() {
            try {
                return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
            } catch (Throwable unused) {
                return null;
            }
        }

        public void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    YB.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    a.Yz.a(closeable, th, th2);
                }
            }
        }
    }

    public static g va() {
        return new g(Yv);
    }

    g(c cVar) {
        this.Yw = (c) i.checkNotNull(cVar);
    }

    public <C extends Closeable> C a(C c) {
        if (c != null) {
            this.Yx.addFirst(c);
        }
        return c;
    }

    public RuntimeException j(Throwable th) {
        i.checkNotNull(th);
        this.Yy = th;
        o.d(th, IOException.class);
        throw new RuntimeException(th);
    }

    public void close() {
        Throwable th = this.Yy;
        while (!this.Yx.isEmpty()) {
            Closeable closeable = (Closeable) this.Yx.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.Yw.a(closeable, th, th2);
                }
            }
        }
        if (this.Yy == null && th != null) {
            o.d(th, IOException.class);
            throw new AssertionError(th);
        }
    }
}
