package io.reactivex.processors;

import io.reactivex.c.a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class PublishProcessor<T> extends a<T> {
    static final PublishSubscription[] eUu = new PublishSubscription[0];
    static final PublishSubscription[] eUv = new PublishSubscription[0];
    Throwable error;
    final AtomicReference<PublishSubscription<T>[]> subscribers = new AtomicReference(eUv);

    static final class PublishSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 3562861878281475070L;
        final c<? super T> downstream;
        final PublishProcessor<T> parent;

        PublishSubscription(c<? super T> cVar, PublishProcessor<T> publishProcessor) {
            this.downstream = cVar;
            this.parent = publishProcessor;
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.downstream.onNext(t);
                    b.d(this, 1);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                a.onError(th);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.b(this, j);
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.b(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }
    }

    public static <T> PublishProcessor<T> bmK() {
        return new PublishProcessor();
    }

    PublishProcessor() {
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        PublishSubscription publishSubscription = new PublishSubscription(cVar, this);
        cVar.onSubscribe(publishSubscription);
        if (!a(publishSubscription)) {
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        } else if (publishSubscription.isCancelled()) {
            b(publishSubscription);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.subscribers.get();
            if (publishSubscriptionArr == eUu) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[(length + 1)];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        Object obj;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.subscribers.get();
            if (publishSubscriptionArr != eUu && publishSubscriptionArr != eUv) {
                int length = publishSubscriptionArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (publishSubscriptionArr[i2] == publishSubscription) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = eUv;
                    } else {
                        Object obj2 = new PublishSubscription[(length - 1)];
                        System.arraycopy(publishSubscriptionArr, 0, obj2, 0, i);
                        System.arraycopy(publishSubscriptionArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            }
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, obj));
    }

    public void onSubscribe(d dVar) {
        if (this.subscribers.get() == eUu) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public void onNext(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription onNext : (PublishSubscription[]) this.subscribers.get()) {
            onNext.onNext(t);
        }
    }

    public void onError(Throwable th) {
        io.reactivex.internal.a.b.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.subscribers.get();
        Object obj2 = eUu;
        if (obj == obj2) {
            a.onError(th);
            return;
        }
        this.error = th;
        for (PublishSubscription onError : (PublishSubscription[]) this.subscribers.getAndSet(obj2)) {
            onError.onError(th);
        }
    }

    public void onComplete() {
        Object obj = this.subscribers.get();
        Object obj2 = eUu;
        if (obj != obj2) {
            for (PublishSubscription onComplete : (PublishSubscription[]) this.subscribers.getAndSet(obj2)) {
                onComplete.onComplete();
            }
        }
    }
}
