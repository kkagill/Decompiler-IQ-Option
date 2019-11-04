package com.iqoption.deposit.navigator;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.billing.f;
import com.iqoption.deposit.j;
import com.iqoption.deposit.k;
import io.reactivex.b.g;
import io.reactivex.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tJ\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\tJ\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u0015J\u0010\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u0018J\u0006\u0010(\u001a\u00020\u000eJ\u0006\u0010)\u001a\u00020\u001cJ\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\tR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"Lcom/iqoption/deposit/navigator/DepositNavigatorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$OnFragmentInteractionListener;", "()V", "depositPayViewModel", "Lcom/iqoption/deposit/DepositPayViewModel;", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "payResultScreen", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/deposit/light/DepositPayResultScreen;", "getPayResultScreen", "()Landroidx/lifecycle/LiveData;", "shouldSelectHold", "", "webPaymentResultEvent", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "Lcom/iqoption/deposit/navigator/WebPaymentResult;", "currentCryptoStatus", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "currentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getCounting", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/billing/CashboxDisplayData;", "getCountingFlowable", "Lio/reactivex/Flowable;", "onDepositPageWebPaymentHold", "", "onDepositPageWebPaymentResult", "isSuccess", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "session", "", "onDepositPageWebPaymentStartAgain", "selectMethod", "cashboxItem", "setLoadedCashbox", "cashboxData", "shouldShowKycAfterDep", "showPayProgressTemporary", "webPaymentResultEvents", "Companion", "deposit_release"})
/* compiled from: DepositNavigatorViewModel.kt */
public final class d extends ViewModel implements com.iqoption.deposit.web.a.b {
    public static final a cGs = new a();
    private j cAq;
    private final com.iqoption.core.data.b.b<g> cGq = new com.iqoption.core.data.b.b();
    private boolean cGr;
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/navigator/DepositNavigatorViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/navigator/DepositNavigatorViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: DepositNavigatorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d V(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…torViewModel::class.java]");
            d dVar = (d) viewModel;
            dVar.cxD = k.cxn.C(fragment);
            dVar.cAq = j.cwW.m(com.iqoption.core.ext.a.r(fragment));
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/billing/CashboxDisplayData;", "it", "apply"})
    /* compiled from: DepositNavigatorViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b cGt = new b();

        b() {
        }

        /* renamed from: d */
        public final com.iqoption.core.ui.d<f> apply(f fVar) {
            kotlin.jvm.internal.i.f(fVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(fVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/billing/CashboxDisplayData;", "it", "", "apply"})
    /* compiled from: DepositNavigatorViewModel.kt */
    static final class c<T, R> implements g<Throwable, com.iqoption.core.ui.d<f>> {
        public static final c cGu = new c();

        c() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<f> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/billing/CashboxDisplayData;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositNavigatorViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<com.iqoption.core.ui.d<f>> {
        final /* synthetic */ d cGv;

        d(d dVar) {
            this.cGv = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
        /* renamed from: b */
        public final void accept(com.iqoption.core.ui.d<com.iqoption.billing.f> r4) {
            /*
            r3 = this;
            r0 = 0;
            if (r4 == 0) goto L_0x0016;
        L_0x0003:
            r4 = r4.getData();
            r4 = (com.iqoption.billing.f) r4;
            if (r4 == 0) goto L_0x0016;
        L_0x000b:
            r4 = r4.Kp();
            if (r4 == 0) goto L_0x0016;
        L_0x0011:
            r4 = r4.Km();
            goto L_0x0017;
        L_0x0016:
            r4 = r0;
        L_0x0017:
            if (r4 == 0) goto L_0x004d;
        L_0x0019:
            r1 = r4.aap();
            if (r1 == 0) goto L_0x004d;
        L_0x001f:
            r1 = (java.util.Collection) r1;
            r1 = r1.isEmpty();
            r2 = 1;
            r1 = r1 ^ r2;
            if (r1 != r2) goto L_0x004d;
        L_0x0029:
            r1 = r3.cGv;
            r1 = r1.cGr;
            if (r1 == 0) goto L_0x004d;
        L_0x0031:
            r1 = r3.cGv;
            r2 = 0;
            r1.cGr = r2;
            r1 = r3.cGv;
            r4 = r4.aap();
            if (r4 == 0) goto L_0x0048;
        L_0x003f:
            r4 = (java.util.List) r4;
            r4 = kotlin.collections.u.bV(r4);
            r0 = r4;
            r0 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) r0;
        L_0x0048:
            r0 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r0;
            r1.i(r0);
        L_0x004d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.navigator.d$d.accept(com.iqoption.core.ui.d):void");
        }
    }

    public final LiveData<com.iqoption.core.ui.d<f>> atb() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(atc());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…er(getCountingFlowable())");
        return fromPublisher;
    }

    private final e<com.iqoption.core.ui.d<f>> atc() {
        e c = com.iqoption.billing.d.ayx.Kj().g(b.cGt).j(new com.iqoption.core.rx.backoff.a(null, 0, null, (com.iqoption.core.rx.backoff.c) new com.iqoption.core.rx.backoff.d(), null, null, 55, null)).h(c.cGu).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).c((io.reactivex.b.f) new d(this));
        kotlin.jvm.internal.i.e(c, "CashBoxMediator.getCashb…      }\n                }");
        return c;
    }

    public final void a(f fVar) {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.a(fVar);
    }

    public final void i(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.i(aVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }

    public final LiveData<g> atd() {
        return this.cGq;
    }

    public void b(boolean z, com.iqoption.deposit.i iVar, String str) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        com.iqoption.core.ext.a.d((MutableLiveData) this.cGq, new a(z, iVar, str));
    }

    public void asX() {
        com.iqoption.core.ext.a.d((MutableLiveData) this.cGq, f.cGx);
    }

    public void asY() {
        this.cGr = true;
        com.iqoption.billing.repository.a.ayY.Kx();
        com.iqoption.core.ext.a.d((MutableLiveData) this.cGq, e.cGw);
    }

    public final LiveData<com.iqoption.deposit.light.a> aos() {
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        return jVar.aos();
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.crypto.a> aoI() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoI();
    }

    public final void aou() {
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        jVar.aou();
    }

    public final boolean aoK() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoK();
    }
}
