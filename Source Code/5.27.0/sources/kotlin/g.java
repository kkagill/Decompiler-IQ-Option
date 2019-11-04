package kotlin;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, bng = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, bnh = 1)
/* compiled from: LazyJVM.kt */
class g {
    public static final <T> d<T> c(a<? extends T> aVar) {
        i.f(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar, null, 2, null);
    }

    public static final <T> d<T> a(LazyThreadSafetyMode lazyThreadSafetyMode, a<? extends T> aVar) {
        i.f(lazyThreadSafetyMode, "mode");
        i.f(aVar, "initializer");
        int i = f.aob[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(aVar, null, 2, null);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
