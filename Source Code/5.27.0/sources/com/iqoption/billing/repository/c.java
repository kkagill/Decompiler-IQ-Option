package com.iqoption.billing.repository;

import com.iqoption.core.manager.LogoutClearList.Clearable;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.math.BigDecimal;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0006\u0010\r\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/billing/repository/SessionCacheHoldNotifier;", "Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "hasAuthAmount", "", "Ljava/lang/Boolean;", "clearOnLogout", "", "balances", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "init", "billing_release"})
/* compiled from: SessionCacheHoldNotifier.kt */
public final class c implements Clearable {
    private static Boolean azm;
    public static final c azn = new c();
    private static io.reactivex.disposables.b disposable;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "balances", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "apply"})
    /* compiled from: SessionCacheHoldNotifier.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a azo = new a();

        a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(J((List) obj));
        }

        public final boolean J(List<com.iqoption.core.microservices.internalbilling.a.b> list) {
            kotlin.jvm.internal.i.f(list, "balances");
            return c.azn.K(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "actualHasAuthAmount", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: SessionCacheHoldNotifier.kt */
    static final class b<T> implements f<Boolean> {
        public static final b azp = new b();

        b() {
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            if (kotlin.jvm.internal.i.y(c.azm, Boolean.valueOf(true)) && !bool.booleanValue()) {
                a.ayY.Kx();
            }
            c.azm = bool;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SessionCacheHoldNotifier.kt */
    static final class c<T> implements f<Throwable> {
        public static final c azq = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private c() {
    }

    public final void init() {
        io.reactivex.disposables.b bVar = disposable;
        if (bVar == null || bVar == null || bVar.isDisposed()) {
            disposable = com.iqoption.core.data.repository.a.bds.WN().g(a.azo).d(com.iqoption.core.rx.i.aki()).a((f) b.azp, (f) c.azq);
        }
    }

    private final boolean K(List<com.iqoption.core.microservices.internalbilling.a.b> list) {
        for (Object next : list) {
            Object obj;
            BigDecimal aep = ((com.iqoption.core.microservices.internalbilling.a.b) next).aep();
            if ((aep != null ? aep.doubleValue() : 0.0d) > ((double) 0)) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return next2 != null;
    }

    public void clearOnLogout() {
        io.reactivex.disposables.b bVar = disposable;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
