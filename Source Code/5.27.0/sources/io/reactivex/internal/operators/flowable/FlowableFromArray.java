package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.a.b;
import io.reactivex.internal.b.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;

public final class FlowableFromArray<T> extends e<T> {
    final T[] array;

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        public abstract void blN();

        public abstract void cT(long j);

        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        public final T poll() {
            int i = this.index;
            Object[] objArr = this.array;
            if (i == objArr.length) {
                return null;
            }
            this.index = i + 1;
            return b.requireNonNull(objArr[i], "array element is null");
        }

        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        public final void clear() {
            this.index = this.array.length;
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

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final a<? super T> downstream;

        ArrayConditionalSubscription(a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.downstream = aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            Object[] objArr = this.array;
            int length = objArr.length;
            a aVar = this.downstream;
            int i = this.index;
            while (i != length) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        aVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        aVar.cN(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                aVar.onComplete();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cT(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            a aVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            if (!this.cancelled) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.index = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.cN(obj)) {
                            j++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final c<? super T> downstream;

        ArraySubscription(c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            Object[] objArr = this.array;
            int length = objArr.length;
            c cVar = this.downstream;
            int i = this.index;
            while (i != length) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        cVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        cVar.onNext(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                cVar.onComplete();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cT(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            c cVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.index = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            cVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        cVar.onNext(obj);
                        j++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    public void a(c<? super T> cVar) {
        if (cVar instanceof a) {
            cVar.onSubscribe(new ArrayConditionalSubscription((a) cVar, this.array));
        } else {
            cVar.onSubscribe(new ArraySubscription(cVar, this.array));
        }
    }
}
