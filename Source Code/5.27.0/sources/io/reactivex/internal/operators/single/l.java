package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.internal.a.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: SingleZipIterable */
public final class l<T, R> extends p<R> {
    final Iterable<? extends t<? extends T>> eSy;
    final g<? super Object[], ? extends R> zipper;

    /* compiled from: SingleZipIterable */
    final class a implements g<T, R> {
        a() {
        }

        public R apply(T t) {
            return b.requireNonNull(l.this.zipper.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public l(Iterable<? extends t<? extends T>> iterable, g<? super Object[], ? extends R> gVar) {
        this.eSy = iterable;
        this.zipper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super R> rVar) {
        t[] tVarArr = new t[8];
        try {
            int i = 0;
            Object[] objArr = tVarArr;
            int i2 = 0;
            for (t tVar : this.eSy) {
                if (tVar == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), (r) rVar);
                    return;
                }
                if (i2 == objArr.length) {
                    objArr = (t[]) Arrays.copyOf(objArr, (i2 >> 2) + i2);
                }
                int i3 = i2 + 1;
                objArr[i2] = tVar;
                i2 = i3;
            }
            if (i2 == 0) {
                EmptyDisposable.error(new NoSuchElementException(), (r) rVar);
            } else if (i2 == 1) {
                objArr[0].a(new a(rVar, new a()));
            } else {
                ZipCoordinator zipCoordinator = new ZipCoordinator(rVar, i2, this.zipper);
                rVar.d(zipCoordinator);
                while (i < i2 && !zipCoordinator.isDisposed()) {
                    objArr[i].a(zipCoordinator.observers[i]);
                    i++;
                }
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptyDisposable.error(th, (r) rVar);
        }
    }
}
