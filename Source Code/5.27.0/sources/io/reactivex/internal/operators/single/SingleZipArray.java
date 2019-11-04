package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleZipArray<T, R> extends p<R> {
    final t<? extends T>[] eSw;
    final g<? super Object[], ? extends R> zipper;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = -5556924161382950569L;
        final r<? super R> downstream;
        final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final g<? super Object[], ? extends R> zipper;

        ZipCoordinator(r<? super R> rVar, int i, g<? super Object[], ? extends R> gVar) {
            super(i);
            this.downstream = rVar;
            this.zipper = gVar;
            ZipSingleObserver[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver(this, i2);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i];
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        public void dispose() {
            int i = 0;
            if (getAndSet(0) > 0) {
                ZipSingleObserver[] zipSingleObserverArr = this.observers;
                int length = zipSingleObserverArr.length;
                while (i < length) {
                    zipSingleObserverArr[i].dispose();
                    i++;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void o(T t, int i) {
            this.values[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.downstream.onSuccess(io.reactivex.internal.a.b.requireNonNull(this.zipper.apply(this.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.downstream.onError(th);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void jy(int i) {
            ZipSingleObserver[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i < length) {
                    zipSingleObserverArr[i].dispose();
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void b(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                jy(i);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.c.a.onError(th);
        }
    }

    static final class ZipSingleObserver<T> extends AtomicReference<b> implements r<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void d(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void onSuccess(T t) {
            this.parent.o(t, this.index);
        }

        public void onError(Throwable th) {
            this.parent.b(th, this.index);
        }
    }

    final class a implements g<T, R> {
        a() {
        }

        public R apply(T t) {
            return io.reactivex.internal.a.b.requireNonNull(SingleZipArray.this.zipper.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public SingleZipArray(t<? extends T>[] tVarArr, g<? super Object[], ? extends R> gVar) {
        this.eSw = tVarArr;
        this.zipper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super R> rVar) {
        t[] tVarArr = this.eSw;
        int length = tVarArr.length;
        int i = 0;
        if (length == 1) {
            tVarArr[0].a(new a(rVar, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(rVar, length, this.zipper);
        rVar.d(zipCoordinator);
        while (i < length && !zipCoordinator.isDisposed()) {
            t tVar = tVarArr[i];
            if (tVar == null) {
                zipCoordinator.b(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                tVar.a(zipCoordinator.observers[i]);
                i++;
            }
        }
    }
}
