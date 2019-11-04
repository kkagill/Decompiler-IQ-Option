package com.iqoption.deposit.hold;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.j;
import com.iqoption.deposit.k;
import io.reactivex.b.g;
import io.reactivex.b.h;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0002J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\fJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/deposit/hold/DepositHoldViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "cardIdProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "warningStatusStream", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "composeHoldStatus", "selectedCardId", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "(Ljava/lang/Long;Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;Ljava/util/List;)Lcom/iqoption/deposit/hold/HoldScreenStatus;", "createWarningStateFlowable", "Lio/reactivex/Flowable;", "currentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "holdStatus", "setCardId", "", "cardId", "Companion", "deposit_release"})
/* compiled from: DepositHoldViewModel.kt */
public final class f extends AndroidViewModel {
    public static final a cDZ = new a();
    private final BehaviorProcessor<Long> cDX;
    private LiveData<com.iqoption.core.ui.d<i>> cDY;
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/hold/DepositHoldViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/hold/DepositHoldViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "useSelectionViewModel", "", "deposit_release"})
    /* compiled from: DepositHoldViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f a(Fragment fragment, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…oldViewModel::class.java)");
            f fVar = (f) viewModel;
            if (z) {
                fVar.cxD = k.cxn.C(fragment);
            }
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "kotlin.jvm.PlatformType", "it", "apply"})
    /* compiled from: DepositHoldViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b cEa = new b();

        b() {
        }

        /* renamed from: a */
        public final Optional<j> apply(j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            return Optional.an(jVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\n¢\u0006\u0004\b\u000b\u0010\f"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "selectedCardId", "", "kycData", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "kotlin.jvm.PlatformType", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "apply", "(Ljava/lang/Long;Lcom/google/common/base/Optional;Ljava/util/List;)Lcom/iqoption/deposit/hold/HoldScreenStatus;"})
    /* compiled from: DepositHoldViewModel.kt */
    static final class c<T1, T2, T3, R> implements h<Long, Optional<j>, List<? extends com.iqoption.core.microservices.billing.verification.response.c>, i> {
        final /* synthetic */ f cEb;

        c(f fVar) {
            this.cEb = fVar;
        }

        public final i a(Long l, Optional<j> optional, List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            kotlin.jvm.internal.i.f(l, "selectedCardId");
            kotlin.jvm.internal.i.f(optional, "kycData");
            kotlin.jvm.internal.i.f(list, "cards");
            return this.cEb.a(l, (j) optional.pN(), list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "it", "apply"})
    /* compiled from: DepositHoldViewModel.kt */
    static final class d<T, R> implements g<T, R> {
        public static final d cEc = new d();

        d() {
        }

        /* renamed from: b */
        public final com.iqoption.core.ui.d<i> apply(i iVar) {
            kotlin.jvm.internal.i.f(iVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(iVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "it", "", "apply"})
    /* compiled from: DepositHoldViewModel.kt */
    static final class e<T, R> implements g<Throwable, com.iqoption.core.ui.d<i>> {
        public static final e cEd = new e();

        e() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<i> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    public f(Application application) {
        kotlin.jvm.internal.i.f(application, "application");
        super(application);
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<Long>()");
        this.cDX = bmG;
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar != null) {
            return kVar.aoy();
        }
        throw new IllegalStateException("depositSelectionViewModel is not initialized");
    }

    public final LiveData<com.iqoption.core.ui.d<i>> aru() {
        if (this.cDY == null) {
            this.cDY = LiveDataReactiveStreams.fromPublisher(arv().g(d.cEc).h(e.cEd).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        }
        LiveData liveData = this.cDY;
        if (liveData == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return liveData;
    }

    public final void bu(long j) {
        this.cDX.onNext(Long.valueOf(j));
    }

    private final io.reactivex.e<i> arv() {
        io.reactivex.e eVar = this.cDX;
        io.reactivex.e cF = com.iqoption.core.data.repository.d.bdF.WT().g(b.cEa).cF(Optional.pW());
        kotlin.jvm.internal.i.e(cF, "KycRepository.observeVer…rnItem(Optional.absent())");
        io.reactivex.e cF2 = com.iqoption.cardsverification.repository.a.aBI.Lo().cF(m.emptyList());
        kotlin.jvm.internal.i.e(cF2, "VerifyCardsRepository.ob…orReturnItem(emptyList())");
        return com.iqoption.core.rx.g.a(eVar, cF, cF2, (h) new c(this));
    }

    private final i a(Long l, j jVar, List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        Object obj = null;
        com.iqoption.deposit.verification.b a = jVar != null ? com.iqoption.deposit.verification.f.a(jVar, false, 2, null) : null;
        Iterable iterable = list;
        for (Object next : iterable) {
            Object obj2;
            long id = ((com.iqoption.core.microservices.billing.verification.response.c) next).getId();
            if (l != null && id == l.longValue()) {
                obj2 = 1;
                continue;
            } else {
                obj2 = null;
                continue;
            }
            if (obj2 != null) {
                obj = next;
                break;
            }
        }
        com.iqoption.core.microservices.billing.verification.response.c cVar = (com.iqoption.core.microservices.billing.verification.response.c) obj;
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication()");
        Context context = application;
        Collection arrayList = new ArrayList();
        for (Object next2 : iterable) {
            if ((((com.iqoption.core.microservices.billing.verification.response.c) next2).Lq() != CardStatus.VERIFIED ? 1 : null) != null) {
                arrayList.add(next2);
            }
        }
        return new i(a, com.iqoption.deposit.verification.f.a(context, cVar, (List) arrayList), cVar);
    }
}
