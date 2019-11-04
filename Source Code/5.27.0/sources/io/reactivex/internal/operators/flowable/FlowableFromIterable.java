package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.a.b;
import io.reactivex.internal.b.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import org.a.c;

public final class FlowableFromIterable<T> extends e<T> {
    final Iterable<? extends T> eRI;

    static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        public abstract void blN();

        public abstract void cT(long j);

        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseRangeSubscription(Iterator<? extends T> it) {
            this.it = it;
        }

        public final T poll() {
            Iterator it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return b.requireNonNull(this.it.next(), "Iterator.next() returned a null value");
        }

        public final boolean isEmpty() {
            Iterator it = this.it;
            return it == null || !it.hasNext();
        }

        public final void clear() {
            this.it = null;
        }

        public final void request(long j) {
            if (!SubscriptionHelper.validate(j) || io.reactivex.internal.util.b.a(this, j) != 0) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                blN();
            } else {
                cT(j);
            }
        }

        public final void cancel() {
            this.cancelled = true;
        }
    }

    static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final a<? super T> downstream;

        IteratorConditionalSubscription(a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            Iterator it = this.it;
            a aVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        aVar.cN(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        aVar.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.ad(th);
                                aVar.onError(th);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.ad(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cT(long j) {
            Iterator it = this.it;
            a aVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2) {
                        j2 = get();
                        if (j == j2) {
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean cN = aVar.cN(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                aVar.onComplete();
                                            }
                                            return;
                                        } else if (cN) {
                                            j++;
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.exceptions.a.ad(th);
                                        aVar.onError(th);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.ad(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final c<? super T> downstream;

        IteratorSubscription(c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            Iterator it = this.it;
            c cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        cVar.onNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        cVar.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                io.reactivex.exceptions.a.ad(th);
                                cVar.onError(th);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.ad(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cT(long j) {
            Iterator it = this.it;
            c cVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2) {
                        j2 = get();
                        if (j == j2) {
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                cVar.onNext(next);
                                if (!this.cancelled) {
                                    try {
                                        if (it.hasNext()) {
                                            j++;
                                        } else {
                                            if (!this.cancelled) {
                                                cVar.onComplete();
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.exceptions.a.ad(th);
                                        cVar.onError(th);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.ad(th2);
                            cVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.eRI = iterable;
    }

    public void a(c<? super T> cVar) {
        try {
            a(cVar, this.eRI.iterator());
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public static <T> void a(c<? super T> cVar, Iterator<? extends T> it) {
        try {
            if (it.hasNext()) {
                if (cVar instanceof a) {
                    cVar.onSubscribe(new IteratorConditionalSubscription((a) cVar, it));
                } else {
                    cVar.onSubscribe(new IteratorSubscription(cVar, it));
                }
                return;
            }
            EmptySubscription.complete(cVar);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
