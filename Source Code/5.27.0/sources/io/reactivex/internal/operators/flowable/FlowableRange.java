package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.b.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import org.a.c;

public final class FlowableRange extends e<Integer> {
    final int end;
    final int start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public abstract void blN();

        public abstract void cT(long j);

        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }

        /* renamed from: blS */
        public final Integer poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
        }

        public final boolean isEmpty() {
            return this.index == this.end;
        }

        public final void clear() {
            this.index = this.end;
        }

        public final void request(long j) {
            if (!SubscriptionHelper.validate(j) || b.a(this, j) != 0) {
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

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final a<? super Integer> downstream;

        RangeConditionalSubscription(a<? super Integer> aVar, int i, int i2) {
            super(i, i2);
            this.downstream = aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            int i = this.end;
            a aVar = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    aVar.cN(Integer.valueOf(i2));
                    i2++;
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
            int i = this.end;
            int i2 = this.index;
            a aVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        if (aVar.cN(Integer.valueOf(i2))) {
                            j++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c<? super Integer> downstream;

        RangeSubscription(c<? super Integer> cVar, int i, int i2) {
            super(i, i2);
            this.downstream = cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blN() {
            int i = this.end;
            c cVar = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    cVar.onNext(Integer.valueOf(i2));
                    i2++;
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
            int i = this.end;
            int i2 = this.index;
            c cVar = this.downstream;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.cancelled) {
                        cVar.onNext(Integer.valueOf(i2));
                        j++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public FlowableRange(int i, int i2) {
        this.start = i;
        this.end = i + i2;
    }

    public void a(c<? super Integer> cVar) {
        if (cVar instanceof a) {
            cVar.onSubscribe(new RangeConditionalSubscription((a) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }
}
