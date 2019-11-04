package io.reactivex.subjects;

import io.reactivex.c.a;
import io.reactivex.disposables.b;
import io.reactivex.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishSubject<T> extends a<T> {
    static final PublishDisposable[] eUJ = new PublishDisposable[0];
    static final PublishDisposable[] eUK = new PublishDisposable[0];
    Throwable error;
    final AtomicReference<PublishDisposable<T>[]> subscribers = new AtomicReference(eUK);

    static final class PublishDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        final n<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(n<? super T> nVar, PublishSubject<T> publishSubject) {
            this.downstream = nVar;
            this.parent = publishSubject;
        }

        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                a.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> PublishSubject<T> bmR() {
        return new PublishSubject();
    }

    PublishSubject() {
    }

    /* Access modifiers changed, original: protected */
    public void b(n<? super T> nVar) {
        PublishDisposable publishDisposable = new PublishDisposable(nVar, this);
        nVar.d(publishDisposable);
        if (!a(publishDisposable)) {
            Throwable th = this.error;
            if (th != null) {
                nVar.onError(th);
            } else {
                nVar.onComplete();
            }
        } else if (publishDisposable.isDisposed()) {
            b(publishDisposable);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(PublishDisposable<T> publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.subscribers.get();
            if (publishDisposableArr == eUJ) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[(length + 1)];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.subscribers.compareAndSet(publishDisposableArr, publishDisposableArr2));
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(PublishDisposable<T> publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        Object obj;
        do {
            publishDisposableArr = (PublishDisposable[]) this.subscribers.get();
            if (publishDisposableArr != eUJ && publishDisposableArr != eUK) {
                int length = publishDisposableArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (publishDisposableArr[i2] == publishDisposable) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = eUK;
                    } else {
                        Object obj2 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr, 0, obj2, 0, i);
                        System.arraycopy(publishDisposableArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            }
        } while (!this.subscribers.compareAndSet(publishDisposableArr, obj));
    }

    public void d(b bVar) {
        if (this.subscribers.get() == eUJ) {
            bVar.dispose();
        }
    }

    public void onNext(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable onNext : (PublishDisposable[]) this.subscribers.get()) {
            onNext.onNext(t);
        }
    }

    public void onError(Throwable th) {
        io.reactivex.internal.a.b.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.subscribers.get();
        Object obj2 = eUJ;
        if (obj == obj2) {
            a.onError(th);
            return;
        }
        this.error = th;
        for (PublishDisposable onError : (PublishDisposable[]) this.subscribers.getAndSet(obj2)) {
            onError.onError(th);
        }
    }

    public void onComplete() {
        Object obj = this.subscribers.get();
        Object obj2 = eUJ;
        if (obj != obj2) {
            for (PublishDisposable onComplete : (PublishDisposable[]) this.subscribers.getAndSet(obj2)) {
                onComplete.onComplete();
            }
        }
    }
}
