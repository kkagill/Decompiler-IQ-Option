package io.reactivex.internal.operators.flowable;

import io.reactivex.b.d;
import io.reactivex.b.g;
import org.a.c;

/* compiled from: FlowableDistinctUntilChanged */
public final class e<T, K> extends a<T, T> {
    final g<? super T, K> eRx;
    final d<? super K, ? super K> eRy;

    /* compiled from: FlowableDistinctUntilChanged */
    static final class a<T, K> extends io.reactivex.internal.subscribers.a<T, T> {
        boolean eRA;
        final g<? super T, K> eRx;
        final d<? super K, ? super K> eRy;
        K eRz;

        a(io.reactivex.internal.b.a<? super T> aVar, g<? super T, K> gVar, d<? super K, ? super K> dVar) {
            super(aVar);
            this.eRx = gVar;
            this.eRy = dVar;
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
                return this.downstream.cN(t);
            }
            try {
                Object apply = this.eRx.apply(t);
                if (this.eRA) {
                    boolean test = this.eRy.test(this.eRz, apply);
                    this.eRz = apply;
                    if (test) {
                        return false;
                    }
                }
                this.eRA = true;
                this.eRz = apply;
                this.downstream.onNext(t);
                return true;
            } catch (Throwable th) {
                U(th);
                return true;
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            while (true) {
                Object poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.eRx.apply(poll);
                if (!this.eRA) {
                    this.eRA = true;
                    this.eRz = apply;
                    return poll;
                } else if (this.eRy.test(this.eRz, apply)) {
                    this.eRz = apply;
                    if (this.sourceMode != 1) {
                        this.upstream.request(1);
                    }
                } else {
                    this.eRz = apply;
                    return poll;
                }
            }
        }
    }

    /* compiled from: FlowableDistinctUntilChanged */
    static final class b<T, K> extends io.reactivex.internal.subscribers.b<T, T> implements io.reactivex.internal.b.a<T> {
        boolean eRA;
        final g<? super T, K> eRx;
        final d<? super K, ? super K> eRy;
        K eRz;

        b(c<? super T> cVar, g<? super T, K> gVar, d<? super K, ? super K> dVar) {
            super(cVar);
            this.eRx = gVar;
            this.eRy = dVar;
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
                this.downstream.onNext(t);
                return true;
            }
            try {
                Object apply = this.eRx.apply(t);
                if (this.eRA) {
                    boolean test = this.eRy.test(this.eRz, apply);
                    this.eRz = apply;
                    if (test) {
                        return false;
                    }
                }
                this.eRA = true;
                this.eRz = apply;
                this.downstream.onNext(t);
                return true;
            } catch (Throwable th) {
                U(th);
                return true;
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            while (true) {
                Object poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.eRx.apply(poll);
                if (!this.eRA) {
                    this.eRA = true;
                    this.eRz = apply;
                    return poll;
                } else if (this.eRy.test(this.eRz, apply)) {
                    this.eRz = apply;
                    if (this.sourceMode != 1) {
                        this.upstream.request(1);
                    }
                } else {
                    this.eRz = apply;
                    return poll;
                }
            }
        }
    }

    public e(io.reactivex.e<T> eVar, g<? super T, K> gVar, d<? super K, ? super K> dVar) {
        super(eVar);
        this.eRx = gVar;
        this.eRy = dVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new a((io.reactivex.internal.b.a) cVar, this.eRx, this.eRy));
            return;
        }
        this.eRc.a(new b(cVar, this.eRx, this.eRy));
    }
}
