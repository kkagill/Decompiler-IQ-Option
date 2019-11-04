package io.reactivex.internal.a;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: Functions */
public final class a {
    static final io.reactivex.b.f<Object> aMo = new g();
    public static final io.reactivex.b.a aMp = new f();
    public static final io.reactivex.b.k eQA = new h();
    static final io.reactivex.b.l<Object> eQB = new s();
    static final io.reactivex.b.l<Object> eQC = new k();
    static final Callable<Object> eQD = new q();
    static final Comparator<Object> eQE = new p();
    public static final io.reactivex.b.f<org.a.d> eQF = new o();
    static final io.reactivex.b.g<Object, Object> eQw = new m();
    public static final Runnable eQx = new i();
    public static final io.reactivex.b.f<Throwable> eQy = new j();
    public static final io.reactivex.b.f<Throwable> eQz = new r();

    /* compiled from: Functions */
    static final class i implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        i() {
        }
    }

    /* compiled from: Functions */
    static final class p implements Comparator<Object> {
        p() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions */
    static final class q implements Callable<Object> {
        public Object call() {
            return null;
        }

        q() {
        }
    }

    /* compiled from: Functions */
    static final class a<T1, T2, R> implements io.reactivex.b.g<Object[], R> {
        final io.reactivex.b.c<? super T1, ? super T2, ? extends R> eQG;

        a(io.reactivex.b.c<? super T1, ? super T2, ? extends R> cVar) {
            this.eQG = cVar;
        }

        /* renamed from: x */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.eQG.apply(objArr[0], objArr[1]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 2 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* compiled from: Functions */
    static final class b<T1, T2, T3, R> implements io.reactivex.b.g<Object[], R> {
        final io.reactivex.b.h<T1, T2, T3, R> eQH;

        b(io.reactivex.b.h<T1, T2, T3, R> hVar) {
            this.eQH = hVar;
        }

        /* renamed from: x */
        public R apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.eQH.a(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 3 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* compiled from: Functions */
    static final class c<T1, T2, T3, T4, R> implements io.reactivex.b.g<Object[], R> {
        final io.reactivex.b.i<T1, T2, T3, T4, R> eQI;

        c(io.reactivex.b.i<T1, T2, T3, T4, R> iVar) {
            this.eQI = iVar;
        }

        /* renamed from: x */
        public R apply(Object[] objArr) {
            if (objArr.length == 4) {
                return this.eQI.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 4 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* compiled from: Functions */
    static final class d<T1, T2, T3, T4, T5, R> implements io.reactivex.b.g<Object[], R> {
        private final io.reactivex.b.j<T1, T2, T3, T4, T5, R> eQJ;

        d(io.reactivex.b.j<T1, T2, T3, T4, T5, R> jVar) {
            this.eQJ = jVar;
        }

        /* renamed from: x */
        public R apply(Object[] objArr) {
            if (objArr.length == 5) {
                return this.eQJ.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 5 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* compiled from: Functions */
    static final class e<T, U> implements io.reactivex.b.g<T, U> {
        final Class<U> eQK;

        e(Class<U> cls) {
            this.eQK = cls;
        }

        public U apply(T t) {
            return this.eQK.cast(t);
        }
    }

    /* compiled from: Functions */
    static final class f implements io.reactivex.b.a {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }

        f() {
        }
    }

    /* compiled from: Functions */
    static final class g implements io.reactivex.b.f<Object> {
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        g() {
        }
    }

    /* compiled from: Functions */
    static final class h implements io.reactivex.b.k {
        public void accept(long j) {
        }

        h() {
        }
    }

    /* compiled from: Functions */
    static final class j implements io.reactivex.b.f<Throwable> {
        j() {
        }

        /* renamed from: o */
        public void accept(Throwable th) {
            io.reactivex.c.a.onError(th);
        }
    }

    /* compiled from: Functions */
    static final class k implements io.reactivex.b.l<Object> {
        public boolean test(Object obj) {
            return false;
        }

        k() {
        }
    }

    /* compiled from: Functions */
    static final class l implements io.reactivex.b.a {
        final Future<?> future;

        l(Future<?> future) {
            this.future = future;
        }

        public void run() {
            this.future.get();
        }
    }

    /* compiled from: Functions */
    static final class m implements io.reactivex.b.g<Object, Object> {
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        m() {
        }
    }

    /* compiled from: Functions */
    static final class n<T, U> implements io.reactivex.b.g<T, U>, Callable<U> {
        final U value;

        n(U u) {
            this.value = u;
        }

        public U call() {
            return this.value;
        }

        public U apply(T t) {
            return this.value;
        }
    }

    /* compiled from: Functions */
    static final class o implements io.reactivex.b.f<org.a.d> {
        o() {
        }

        public void accept(org.a.d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* compiled from: Functions */
    static final class r implements io.reactivex.b.f<Throwable> {
        r() {
        }

        /* renamed from: o */
        public void accept(Throwable th) {
            io.reactivex.c.a.onError(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions */
    static final class s implements io.reactivex.b.l<Object> {
        public boolean test(Object obj) {
            return true;
        }

        s() {
        }
    }

    public static <T1, T2, R> io.reactivex.b.g<Object[], R> b(io.reactivex.b.c<? super T1, ? super T2, ? extends R> cVar) {
        b.requireNonNull(cVar, "f is null");
        return new a(cVar);
    }

    public static <T1, T2, T3, R> io.reactivex.b.g<Object[], R> a(io.reactivex.b.h<T1, T2, T3, R> hVar) {
        b.requireNonNull(hVar, "f is null");
        return new b(hVar);
    }

    public static <T1, T2, T3, T4, R> io.reactivex.b.g<Object[], R> a(io.reactivex.b.i<T1, T2, T3, T4, R> iVar) {
        b.requireNonNull(iVar, "f is null");
        return new c(iVar);
    }

    public static <T1, T2, T3, T4, T5, R> io.reactivex.b.g<Object[], R> a(io.reactivex.b.j<T1, T2, T3, T4, T5, R> jVar) {
        b.requireNonNull(jVar, "f is null");
        return new d(jVar);
    }

    public static <T> io.reactivex.b.g<T, T> blr() {
        return eQw;
    }

    public static <T> io.reactivex.b.f<T> bls() {
        return aMo;
    }

    public static <T> io.reactivex.b.l<T> blt() {
        return eQB;
    }

    public static io.reactivex.b.a e(Future<?> future) {
        return new l(future);
    }

    public static <T> Callable<T> cL(T t) {
        return new n(t);
    }

    public static <T, U> io.reactivex.b.g<T, U> cM(U u) {
        return new n(u);
    }

    public static <T, U> io.reactivex.b.g<T, U> E(Class<U> cls) {
        return new e(cls);
    }
}
