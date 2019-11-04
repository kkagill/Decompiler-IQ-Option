package io.reactivex.c;

import io.reactivex.b;
import io.reactivex.b.c;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.i;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.m;
import io.reactivex.n;
import io.reactivex.o;
import io.reactivex.p;
import io.reactivex.r;
import java.util.concurrent.Callable;

/* compiled from: RxJavaPlugins */
public final class a {
    static volatile f<? super Throwable> eTS;
    static volatile g<? super Runnable, ? extends Runnable> eTT;
    static volatile g<? super Callable<o>, ? extends o> eTU;
    static volatile g<? super Callable<o>, ? extends o> eTV;
    static volatile g<? super Callable<o>, ? extends o> eTW;
    static volatile g<? super Callable<o>, ? extends o> eTX;
    static volatile g<? super o, ? extends o> eTY;
    static volatile g<? super o, ? extends o> eTZ;
    static volatile g<? super e, ? extends e> eUa;
    static volatile g<? super io.reactivex.a.a, ? extends io.reactivex.a.a> eUb;
    static volatile g<? super i, ? extends i> eUc;
    static volatile g<? super p, ? extends p> eUd;
    static volatile g<? super io.reactivex.a, ? extends io.reactivex.a> eUe;
    static volatile c<? super e, ? super org.a.c, ? extends org.a.c> eUf;
    static volatile c<? super i, ? super j, ? extends j> eUg;
    static volatile c<? super m, ? super n, ? extends n> eUh;
    static volatile c<? super p, ? super r, ? extends r> eUi;
    static volatile c<? super io.reactivex.a, ? super b, ? extends b> eUj;
    static volatile io.reactivex.b.e eUk;
    static volatile boolean eUl;
    static volatile boolean eUm;

    public static boolean bmE() {
        return eUm;
    }

    public static o k(Callable<o> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "Scheduler Callable can't be null");
        g gVar = eTU;
        if (gVar == null) {
            return o(callable);
        }
        return a(gVar, (Callable) callable);
    }

    public static o l(Callable<o> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "Scheduler Callable can't be null");
        g gVar = eTW;
        if (gVar == null) {
            return o(callable);
        }
        return a(gVar, (Callable) callable);
    }

    public static o m(Callable<o> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "Scheduler Callable can't be null");
        g gVar = eTX;
        if (gVar == null) {
            return o(callable);
        }
        return a(gVar, (Callable) callable);
    }

    public static o n(Callable<o> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "Scheduler Callable can't be null");
        g gVar = eTV;
        if (gVar == null) {
            return o(callable);
        }
        return a(gVar, (Callable) callable);
    }

    public static o i(o oVar) {
        g gVar = eTY;
        if (gVar == null) {
            return oVar;
        }
        return (o) a(gVar, (Object) oVar);
    }

    public static void onError(Throwable th) {
        Object th2;
        f fVar = eTS;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!al(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (fVar != null) {
            try {
                fVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                am(th3);
            }
        }
        th2.printStackTrace();
        am(th2);
    }

    static boolean al(Throwable th) {
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException)) {
            return true;
        }
        return false;
    }

    static void am(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static Runnable q(Runnable runnable) {
        io.reactivex.internal.a.b.requireNonNull(runnable, "run is null");
        g gVar = eTT;
        if (gVar == null) {
            return runnable;
        }
        return (Runnable) a(gVar, (Object) runnable);
    }

    public static o j(o oVar) {
        g gVar = eTZ;
        if (gVar == null) {
            return oVar;
        }
        return (o) a(gVar, (Object) oVar);
    }

    public static void k(f<? super Throwable> fVar) {
        if (eUl) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        eTS = fVar;
    }

    public static <T> org.a.c<? super T> a(e<T> eVar, org.a.c<? super T> cVar) {
        c cVar2 = eUf;
        return cVar2 != null ? (org.a.c) a(cVar2, eVar, cVar) : cVar;
    }

    public static <T> n<? super T> a(m<T> mVar, n<? super T> nVar) {
        c cVar = eUh;
        return cVar != null ? (n) a(cVar, mVar, nVar) : nVar;
    }

    public static <T> r<? super T> a(p<T> pVar, r<? super T> rVar) {
        c cVar = eUi;
        return cVar != null ? (r) a(cVar, pVar, rVar) : rVar;
    }

    public static b a(io.reactivex.a aVar, b bVar) {
        c cVar = eUj;
        return cVar != null ? (b) a(cVar, aVar, bVar) : bVar;
    }

    public static <T> j<? super T> a(i<T> iVar, j<? super T> jVar) {
        c cVar = eUg;
        return cVar != null ? (j) a(cVar, iVar, jVar) : jVar;
    }

    public static <T> i<T> a(i<T> iVar) {
        g gVar = eUc;
        return gVar != null ? (i) a(gVar, (Object) iVar) : iVar;
    }

    public static <T> e<T> k(e<T> eVar) {
        g gVar = eUa;
        return gVar != null ? (e) a(gVar, (Object) eVar) : eVar;
    }

    public static <T> io.reactivex.a.a<T> a(io.reactivex.a.a<T> aVar) {
        g gVar = eUb;
        return gVar != null ? (io.reactivex.a.a) a(gVar, (Object) aVar) : aVar;
    }

    public static <T> p<T> f(p<T> pVar) {
        g gVar = eUd;
        return gVar != null ? (p) a(gVar, (Object) pVar) : pVar;
    }

    public static io.reactivex.a b(io.reactivex.a aVar) {
        g gVar = eUe;
        return gVar != null ? (io.reactivex.a) a(gVar, (Object) aVar) : aVar;
    }

    public static boolean bmF() {
        io.reactivex.b.e eVar = eUk;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.getAsBoolean();
        } catch (Throwable th) {
            RuntimeException aj = ExceptionHelper.aj(th);
        }
    }

    static <T, R> R a(g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            RuntimeException aj = ExceptionHelper.aj(th);
        }
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.apply(t, u);
        } catch (Throwable th) {
            RuntimeException aj = ExceptionHelper.aj(th);
        }
    }

    static o o(Callable<o> callable) {
        try {
            return (o) io.reactivex.internal.a.b.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            RuntimeException aj = ExceptionHelper.aj(th);
        }
    }

    static o a(g<? super Callable<o>, ? extends o> gVar, Callable<o> callable) {
        return (o) io.reactivex.internal.a.b.requireNonNull(a((g) gVar, (Object) callable), "Scheduler Callable result can't be null");
    }
}
