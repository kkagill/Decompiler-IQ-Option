package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;
import org.a.b;
import org.a.c;

/* compiled from: FlowableScalarXMap */
public final class t {

    /* compiled from: FlowableScalarXMap */
    static final class a<T, R> extends e<R> {
        final g<? super T, ? extends b<? extends R>> mapper;
        final T value;

        a(T t, g<? super T, ? extends b<? extends R>> gVar) {
            this.value = t;
            this.mapper = gVar;
        }

        public void a(c<? super R> cVar) {
            try {
                b bVar = (b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                            return;
                        }
                        cVar.onSubscribe(new ScalarSubscription(cVar, call));
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        EmptySubscription.error(th, cVar);
                        return;
                    }
                }
                bVar.subscribe(cVar);
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }
    }

    public static <T, R> boolean a(b<T> bVar, c<? super R> cVar, g<? super T, ? extends b<? extends R>> gVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                EmptySubscription.complete(cVar);
                return true;
            }
            try {
                b bVar2 = (b) io.reactivex.internal.a.b.requireNonNull(gVar.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        call = ((Callable) bVar2).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new ScalarSubscription(cVar, call));
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        EmptySubscription.error(th, cVar);
                        return true;
                    }
                }
                bVar2.subscribe(cVar);
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                EmptySubscription.error(th2, cVar);
                return true;
            }
        } catch (Throwable th22) {
            io.reactivex.exceptions.a.ad(th22);
            EmptySubscription.error(th22, cVar);
            return true;
        }
    }

    public static <T, U> e<U> a(T t, g<? super T, ? extends b<? extends U>> gVar) {
        return io.reactivex.c.a.k(new a(t, gVar));
    }
}
