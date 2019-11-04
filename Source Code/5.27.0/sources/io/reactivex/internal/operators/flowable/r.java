package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.e;
import org.a.c;

/* compiled from: FlowableMap */
public final class r<T, U> extends a<T, U> {
    final g<? super T, ? extends U> mapper;

    /* compiled from: FlowableMap */
    static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U> {
        final g<? super T, ? extends U> mapper;

        a(io.reactivex.internal.b.a<? super U> aVar, g<? super T, ? extends U> gVar) {
            super(aVar);
            this.mapper = gVar;
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    this.downstream.onNext(null);
                    return;
                }
                try {
                    this.downstream.onNext(io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    U(th);
                }
            }
        }

        public boolean cN(T t) {
            if (this.done) {
                return false;
            }
            try {
                return this.downstream.cN(io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                U(th);
                return true;
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public U poll() {
            Object poll = this.qs.poll();
            return poll != null ? io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    /* compiled from: FlowableMap */
    static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U> {
        final g<? super T, ? extends U> mapper;

        b(c<? super U> cVar, g<? super T, ? extends U> gVar) {
            super(cVar);
            this.mapper = gVar;
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    this.downstream.onNext(null);
                    return;
                }
                try {
                    this.downstream.onNext(io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    U(th);
                }
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public U poll() {
            Object poll = this.qs.poll();
            return poll != null ? io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    public r(e<T> eVar, g<? super T, ? extends U> gVar) {
        super(eVar);
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super U> cVar) {
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new a((io.reactivex.internal.b.a) cVar, this.mapper));
        } else {
            this.eRc.a(new b(cVar, this.mapper));
        }
    }
}
