package io.reactivex;

import io.reactivex.c.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.flowable.o;

/* compiled from: Observable */
public abstract class m<T> {

    /* compiled from: Observable */
    /* renamed from: io.reactivex.m$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eQi = new int[BackpressureStrategy.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = io.reactivex.BackpressureStrategy.values();
            r0 = r0.length;
            r0 = new int[r0];
            eQi = r0;
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = io.reactivex.BackpressureStrategy.DROP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = io.reactivex.BackpressureStrategy.LATEST;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = io.reactivex.BackpressureStrategy.MISSING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = io.reactivex.BackpressureStrategy.ERROR;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.m$AnonymousClass1.<clinit>():void");
        }
    }

    public abstract void b(n<? super T> nVar);

    public final void a(n<? super T> nVar) {
        b.requireNonNull(nVar, "observer is null");
        try {
            n a = a.a(this, (n) nVar);
            b.requireNonNull(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            a.onError(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }

    public final e<T> a(BackpressureStrategy backpressureStrategy) {
        o oVar = new o(this);
        int i = AnonymousClass1.eQi[backpressureStrategy.ordinal()];
        if (i == 1) {
            return oVar.bkX();
        }
        if (i == 2) {
            return oVar.bkY();
        }
        if (i == 3) {
            return oVar;
        }
        if (i != 4) {
            return oVar.bkW();
        }
        return a.k(new FlowableOnBackpressureError(oVar));
    }
}
