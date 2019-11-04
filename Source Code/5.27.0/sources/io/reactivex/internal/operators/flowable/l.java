package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.b.e;
import org.a.c;

/* compiled from: FlowableFilter */
public final class l<T> extends a<T, T> {
    final io.reactivex.b.l<? super T> eQS;

    /* compiled from: FlowableFilter */
    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {
        final io.reactivex.b.l<? super T> eRF;

        a(io.reactivex.internal.b.a<? super T> aVar, io.reactivex.b.l<? super T> lVar) {
            super(aVar);
            this.eRF = lVar;
        }

        public void onNext(T t) {
            if (!cN(t)) {
                this.upstream.request(1);
            }
        }

        public boolean cN(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.cN(null);
            }
            boolean z = true;
            try {
                if (!(this.eRF.test(t) && this.downstream.cN(t))) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                U(th);
                return true;
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            e eVar = this.qs;
            io.reactivex.b.l lVar = this.eRF;
            while (true) {
                Object poll = eVar.poll();
                if (poll == null) {
                    return null;
                }
                if (lVar.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    eVar.request(1);
                }
            }
        }
    }

    /* compiled from: FlowableFilter */
    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements io.reactivex.internal.b.a<T> {
        final io.reactivex.b.l<? super T> eRF;

        b(c<? super T> cVar, io.reactivex.b.l<? super T> lVar) {
            super(cVar);
            this.eRF = lVar;
        }

        public void onNext(T t) {
            if (!cN(t)) {
                this.upstream.request(1);
            }
        }

        public boolean cN(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                boolean test = this.eRF.test(t);
                if (test) {
                    this.downstream.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                U(th);
                return true;
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            e eVar = this.qs;
            io.reactivex.b.l lVar = this.eRF;
            while (true) {
                Object poll = eVar.poll();
                if (poll == null) {
                    return null;
                }
                if (lVar.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    eVar.request(1);
                }
            }
        }
    }

    public l(io.reactivex.e<T> eVar, io.reactivex.b.l<? super T> lVar) {
        super(eVar);
        this.eQS = lVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new a((io.reactivex.internal.b.a) cVar, this.eQS));
        } else {
            this.eRc.a(new b(cVar, this.eQS));
        }
    }
}
