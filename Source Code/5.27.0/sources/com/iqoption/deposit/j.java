package com.iqoption.deposit;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.ui.f.d;
import io.reactivex.b.f;
import io.reactivex.processors.BehaviorProcessor;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0005J\"\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0002J\u0006\u0010%\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/deposit/DepositPayViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "googlePayResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/billing/wallet/GooglePayResult;", "getGooglePayResult", "()Landroidx/lifecycle/LiveData;", "googlePayResultLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "payProgress", "", "getPayProgress", "payProgress$delegate", "Lkotlin/Lazy;", "payProgressProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "kotlin.jvm.PlatformType", "payResultScreen", "Lcom/iqoption/deposit/light/DepositPayResultScreen;", "getPayResultScreen", "payResultScreenLiveData", "onDepositPaymentResult", "", "payResponse", "Lcom/iqoption/core/microservices/billing/response/PayResponse;", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "pay", "extraParams", "", "", "", "setGooglePayResult", "showCompletePaymentFragment", "isSuccess", "session", "showPayProgressTemporary", "Companion", "deposit_release"})
/* compiled from: DepositPayViewModel.kt */
public final class j extends d {
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(j.class), "payProgress", "getPayProgress()Landroidx/lifecycle/LiveData;"))};
    public static final a cwW = new a();
    private final BehaviorProcessor<Boolean> cwQ;
    private final kotlin.d cwR = g.c(new DepositPayViewModel$payProgress$2(this));
    private final com.iqoption.core.data.b.b<com.iqoption.deposit.light.a> cwS = new com.iqoption.core.data.b.b();
    private final LiveData<com.iqoption.deposit.light.a> cwT = this.cwS;
    private final com.iqoption.core.data.b.b<com.iqoption.billing.wallet.b> cwU = new com.iqoption.core.data.b.b();
    private final LiveData<com.iqoption.billing.wallet.b> cwV = this.cwU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/DepositPayViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/deposit/DepositPayViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "deposit_release"})
    /* compiled from: DepositPayViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final j m(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(j.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…PayViewModel::class.java)");
            return (j) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/PayResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositPayViewModel.kt */
    static final class b<T> implements f<com.iqoption.core.microservices.billing.response.f> {
        final /* synthetic */ i cwX;
        final /* synthetic */ j this$0;

        b(j jVar, i iVar) {
            this.this$0 = jVar;
            this.cwX = iVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.billing.response.f fVar) {
            this.this$0.cwQ.onNext(Boolean.valueOf(false));
            this.this$0.a(fVar, this.cwX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositPayViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ i cwX;
        final /* synthetic */ j this$0;

        c(j jVar, i iVar) {
            this.this$0 = jVar;
            this.cwX = iVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.cwQ.onNext(Boolean.valueOf(false));
            this.this$0.a(false, this.cwX, null);
        }
    }

    public final LiveData<Boolean> aor() {
        kotlin.d dVar = this.cwR;
        kotlin.reflect.j jVar = anY[0];
        return (LiveData) dVar.getValue();
    }

    public j() {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<Boolean>()");
        this.cwQ = bmG;
    }

    public final LiveData<com.iqoption.deposit.light.a> aos() {
        return this.cwT;
    }

    public final LiveData<com.iqoption.billing.wallet.b> aot() {
        return this.cwV;
    }

    public final void a(i iVar, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        kotlin.jvm.internal.i.f(map, "extraParams");
        this.cwQ.onNext(Boolean.valueOf(true));
        com.iqoption.billing.repository.a.ayY.Kx();
        io.reactivex.disposables.b a = com.iqoption.core.microservices.billing.a.bmi.a(com.iqoption.billing.a.Kh(), iVar.Zx(), iVar.aon().aaD(), iVar.aoo().getName(), iVar.aeo(), null, map, iVar.aop(), iVar.aoq()).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new b(this, iVar), (f) new c(this, iVar));
        kotlin.jvm.internal.i.e(a, "CashBoxRequests.pay(\n   … null)\n                })");
        b(a);
    }

    private final void a(com.iqoption.core.microservices.billing.response.f fVar, i iVar) {
        com.iqoption.core.microservices.billing.response.f.b ZE = fVar != null ? fVar.ZE() : null;
        com.iqoption.core.microservices.billing.response.f.a ZI = ZE != null ? ZE.ZI() : null;
        com.iqoption.core.microservices.billing.response.f.c ZH = ZE != null ? ZE.ZH() : null;
        String url = ZH != null ? ZH.getUrl() : null;
        String ZG = ZE != null ? ZE.ZG() : null;
        if (fVar == null || (kotlin.jvm.internal.i.y(fVar.ZD(), Boolean.valueOf(true)) ^ 1) != 0) {
            a(false, iVar, ZG);
        } else if (ZI != null) {
            this.cwS.setValue(new com.iqoption.deposit.light.a(com.iqoption.deposit.crypto.address.a.cze.h(ZI.ZF(), null), false));
        } else if (url == null) {
            a(true, iVar, ZG);
        } else {
            CharSequence charSequence = url;
            if (v.b(charSequence, (CharSequence) "redirect/success", false, 2, null)) {
                a(true, iVar, ZG);
            } else if (v.b(charSequence, (CharSequence) "redirect/failed", false, 2, null)) {
                a(false, iVar, ZG);
            } else {
                HashMap HU = ZH.HU();
                if (HU == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                this.cwS.setValue(new com.iqoption.deposit.light.a(com.iqoption.deposit.light.e.a.cGc.a(url, HU, ZG, kotlin.jvm.internal.i.y("POST", ZH.getMethod()), iVar), false));
            }
        }
    }

    private final void a(boolean z, i iVar, String str) {
        this.cwS.setValue(new com.iqoption.deposit.light.a(com.iqoption.deposit.light.b.a.cEE.a(z ? "deposit" : "error_deposit", iVar.aoo().getName(), iVar.aeo(), str, iVar.aom()), true));
    }

    public final void aou() {
        this.cwQ.onNext(Boolean.valueOf(true));
        this.cwQ.onNext(Boolean.valueOf(false));
    }

    public final void a(com.iqoption.billing.wallet.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "googlePayResult");
        this.cwU.postValue(bVar);
    }
}
