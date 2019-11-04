package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import org.a.c;

/* compiled from: FlowableDoOnEach */
public final class f<T> extends a<T, T> {
    final io.reactivex.b.a eQV;
    final io.reactivex.b.a onComplete;
    final io.reactivex.b.f<? super Throwable> onError;
    final io.reactivex.b.f<? super T> onNext;

    /* compiled from: FlowableDoOnEach */
    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {
        final io.reactivex.b.a eQV;
        final io.reactivex.b.a onComplete;
        final io.reactivex.b.f<? super Throwable> onError;
        final io.reactivex.b.f<? super T> onNext;

        a(io.reactivex.internal.b.a<? super T> aVar, io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar2, io.reactivex.b.a aVar3) {
            super(aVar);
            this.onNext = fVar;
            this.onError = fVar2;
            this.onComplete = aVar2;
            this.eQV = aVar3;
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    this.downstream.onNext(null);
                    return;
                }
                try {
                    this.onNext.accept(t);
                    this.downstream.onNext(t);
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
                this.onNext.accept(t);
                return this.downstream.cN(t);
            } catch (Throwable th) {
                U(th);
                return false;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            boolean z = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                this.downstream.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.downstream.onError(th);
            }
            try {
                this.eQV.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.ad(th3);
                io.reactivex.c.a.onError(th3);
            }
        }

        public void onComplete() {
            if (!this.done) {
                try {
                    this.onComplete.run();
                    this.done = true;
                    this.downstream.onComplete();
                    try {
                        this.eQV.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        io.reactivex.c.a.onError(th);
                    }
                } catch (Throwable th2) {
                    U(th2);
                }
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            Exception ak;
            CompositeException compositeException;
            try {
                Object poll = this.qs.poll();
                if (poll != null) {
                    try {
                        this.onNext.accept(poll);
                        this.eQV.run();
                    } catch (Throwable th) {
                        compositeException = new CompositeException(th, th);
                    }
                } else if (this.sourceMode == 1) {
                    this.onComplete.run();
                    this.eQV.run();
                }
                return poll;
            } catch (Throwable th2) {
                compositeException = new CompositeException(th, th2);
            }
        }
    }

    /* compiled from: FlowableDoOnEach */
    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {
        final io.reactivex.b.a eQV;
        final io.reactivex.b.a onComplete;
        final io.reactivex.b.f<? super Throwable> onError;
        final io.reactivex.b.f<? super T> onNext;

        b(c<? super T> cVar, io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.a aVar2) {
            super(cVar);
            this.onNext = fVar;
            this.onError = fVar2;
            this.onComplete = aVar;
            this.eQV = aVar2;
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    this.downstream.onNext(null);
                    return;
                }
                try {
                    this.onNext.accept(t);
                    this.downstream.onNext(t);
                } catch (Throwable th) {
                    U(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            boolean z = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                this.downstream.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.downstream.onError(th);
            }
            try {
                this.eQV.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.ad(th3);
                io.reactivex.c.a.onError(th3);
            }
        }

        public void onComplete() {
            if (!this.done) {
                try {
                    this.onComplete.run();
                    this.done = true;
                    this.downstream.onComplete();
                    try {
                        this.eQV.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        io.reactivex.c.a.onError(th);
                    }
                } catch (Throwable th2) {
                    U(th2);
                }
            }
        }

        public int requestFusion(int i) {
            return jC(i);
        }

        public T poll() {
            Exception ak;
            CompositeException compositeException;
            try {
                Object poll = this.qs.poll();
                if (poll != null) {
                    try {
                        this.onNext.accept(poll);
                        this.eQV.run();
                    } catch (Throwable th) {
                        compositeException = new CompositeException(th, th);
                    }
                } else if (this.sourceMode == 1) {
                    this.onComplete.run();
                    this.eQV.run();
                }
                return poll;
            } catch (Throwable th2) {
                compositeException = new CompositeException(th, th2);
            }
        }
    }

    public f(e<T> eVar, io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.a aVar2) {
        super(eVar);
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.eQV = aVar2;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new a((io.reactivex.internal.b.a) cVar, this.onNext, this.onError, this.onComplete, this.eQV));
            return;
        }
        this.eRc.a(new b(cVar, this.onNext, this.onError, this.onComplete, this.eQV));
    }
}
