package io.reactivex.internal.operators.single;

import io.reactivex.c.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.r;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCreate<T> extends p<T> {
    final s<T> eSm;

    static final class Emitter<T> extends AtomicReference<b> implements b, q<T> {
        private static final long serialVersionUID = -2467358622224974244L;
        final r<? super T> downstream;

        Emitter(r<? super T> rVar) {
            this.downstream = rVar;
        }

        public void onSuccess(T t) {
            if (get() != DisposableHelper.DISPOSED) {
                b bVar = (b) getAndSet(DisposableHelper.DISPOSED);
                if (bVar != DisposableHelper.DISPOSED) {
                    if (t == null) {
                        try {
                            this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (bVar != null) {
                                bVar.dispose();
                            }
                        }
                    } else {
                        this.downstream.onSuccess(t);
                    }
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!af(th)) {
                a.onError(th);
            }
        }

        public boolean af(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != DisposableHelper.DISPOSED) {
                b bVar = (b) getAndSet(DisposableHelper.DISPOSED);
                if (bVar != DisposableHelper.DISPOSED) {
                    try {
                        this.downstream.onError(th);
                        return true;
                    } finally {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                    }
                }
            }
            return false;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public SingleCreate(s<T> sVar) {
        this.eSm = sVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        Emitter emitter = new Emitter(rVar);
        rVar.d(emitter);
        try {
            this.eSm.a(emitter);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            emitter.onError(th);
        }
    }
}
