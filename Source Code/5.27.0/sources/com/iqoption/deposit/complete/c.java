package com.iqoption.deposit.complete;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\b¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/complete/CompleteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getPaymentStatus", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "sessionId", "", "realBalance", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/data/mediators/BalanceData;", "currencyName", "Companion", "deposit_release"})
/* compiled from: CompleteViewModel.kt */
public final class c extends ViewModel {
    private static final String TAG;
    public static final a cys = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/deposit/complete/CompleteViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "create", "Lcom/iqoption/deposit/complete/CompleteViewModel;", "f", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: CompleteViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c F(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "it", "apply"})
    /* compiled from: CompleteViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b cyt = new b();

        b() {
        }

        /* renamed from: a */
        public final com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a> apply(com.iqoption.core.microservices.billing.response.failure.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "it", "", "apply"})
    /* compiled from: CompleteViewModel.kt */
    static final class c<T, R> implements g<Throwable, com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a>> {
        public static final c cyu = new c();

        c() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/data/mediators/BalanceData;", "kotlin.jvm.PlatformType", "balances", "", "apply"})
    /* compiled from: CompleteViewModel.kt */
    static final class d<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ String cyv;

        d(String str) {
            this.cyv = str;
        }

        /* renamed from: H */
        public final e<com.iqoption.core.data.c.a> apply(List<com.iqoption.core.data.c.a> list) {
            kotlin.jvm.internal.i.f(list, "balances");
            for (Object next : list) {
                Object obj;
                com.iqoption.core.data.c.a aVar = (com.iqoption.core.data.c.a) next;
                if (aVar.isReal() && kotlin.jvm.internal.i.y(aVar.VK(), this.cyv)) {
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
            com.iqoption.core.data.c.a aVar2 = (com.iqoption.core.data.c.a) next2;
            if (aVar2 != null) {
                e<com.iqoption.core.data.c.a> cD = e.cD(aVar2);
                if (cD != null) {
                    return cD;
                }
            }
            return e.bkQ();
        }
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final e<com.iqoption.core.data.c.a> hE(String str) {
        kotlin.jvm.internal.i.f(str, "currencyName");
        e d = com.iqoption.core.data.c.b.bcS.VQ().d((g) new d(str));
        kotlin.jvm.internal.i.e(d, "BalanceMediator.observeB…?: Flowable.empty()\n    }");
        return d;
    }

    public final LiveData<com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a>> hF(String str) {
        kotlin.jvm.internal.i.f(str, "sessionId");
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.billing.repository.a.ayY.ev(str).t(b.cyt).u(c.cyu).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }
}
