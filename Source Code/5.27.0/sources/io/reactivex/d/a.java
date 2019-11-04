package io.reactivex.d;

import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.i;
import io.reactivex.internal.schedulers.j;
import io.reactivex.o;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: Schedulers */
public final class a {
    static final o eUB = io.reactivex.c.a.n(new h());
    static final o eUC = io.reactivex.c.a.k(new b());
    static final o eUD = io.reactivex.c.a.l(new c());
    static final o eUE = j.bmr();
    static final o eUF = io.reactivex.c.a.m(new f());

    /* compiled from: Schedulers */
    static final class a {
        static final o eUG = new io.reactivex.internal.schedulers.a();
    }

    /* compiled from: Schedulers */
    static final class b implements Callable<o> {
        b() {
        }

        /* renamed from: bmP */
        public o call() {
            return a.eUG;
        }
    }

    /* compiled from: Schedulers */
    static final class c implements Callable<o> {
        c() {
        }

        /* renamed from: bmP */
        public o call() {
            return d.eUG;
        }
    }

    /* compiled from: Schedulers */
    static final class d {
        static final o eUG = new io.reactivex.internal.schedulers.d();
    }

    /* compiled from: Schedulers */
    static final class e {
        static final o eUG = new io.reactivex.internal.schedulers.e();
    }

    /* compiled from: Schedulers */
    static final class f implements Callable<o> {
        f() {
        }

        /* renamed from: bmP */
        public o call() {
            return e.eUG;
        }
    }

    /* compiled from: Schedulers */
    static final class g {
        static final o eUG = new i();
    }

    /* compiled from: Schedulers */
    static final class h implements Callable<o> {
        h() {
        }

        /* renamed from: bmP */
        public o call() {
            return g.eUG;
        }
    }

    public static o bmM() {
        return io.reactivex.c.a.i(eUC);
    }

    public static o bmN() {
        return eUE;
    }

    public static o bmO() {
        return io.reactivex.c.a.j(eUB);
    }

    public static o b(Executor executor) {
        return new ExecutorScheduler(executor, false);
    }
}
