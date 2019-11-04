package com.iqoption.withdraw.fields.verify;

import androidx.arch.core.util.Function;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.restriction.RestrictionId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "cardsWarning", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "docLiveData", "Landroidx/lifecycle/MediatorLiveData;", "docWarning", "refreshDocLiveData", "Landroidx/lifecycle/LiveData;", "verifyCardsViewModel", "Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "warningsLiveData", "", "getCardsWarning", "getDocWarning", "getVerificationWarnings", "postValueIfAllLoaded", "", "refreshCardsWaring", "refreshDocWarning", "Companion", "withdraw_release"})
/* compiled from: WithdrawVerifyViewModel.kt */
public final class g extends com.iqoption.core.ui.f.d {
    public static final a esv = new a();
    private com.iqoption.cardsverification.list.f aCG;
    private MediatorLiveData<List<c>> esq;
    private MediatorLiveData<c> esr = new MediatorLiveData();
    private LiveData<c> ess;
    private c est;
    private c esu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "withdraw_release"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g T(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…ifyViewModel::class.java]");
            g gVar = (g) viewModel;
            gVar.aCG = com.iqoption.cardsverification.list.f.aBB.d(fragmentActivity);
            return gVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "apply"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class b<I, O> implements Function<X, Y> {
        public static final b esw = new b();

        b() {
        }

        /* renamed from: bC */
        public final c apply(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            List list2;
            if (list != null) {
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if ((((com.iqoption.core.microservices.billing.verification.response.c) next).Lq() != CardStatus.VERIFIED ? 1 : null) != null) {
                        arrayList.add(next);
                    }
                }
                list2 = (List) arrayList;
            } else {
                list2 = m.emptyList();
            }
            if (list2.isEmpty()) {
                return new d(VerificationWarningType.NONE);
            }
            return new a(list2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class c<T> implements Observer<S> {
        final /* synthetic */ g esx;

        c(g gVar) {
            this.esx = gVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            this.esx.est = cVar;
            this.esx.bcG();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class d<T> implements Observer<S> {
        final /* synthetic */ g esx;

        d(g gVar) {
            this.esx = gVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            this.esx.esu = cVar;
            this.esx.bcG();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class e<T> implements Observer<S> {
        final /* synthetic */ g esx;

        e(g gVar) {
            this.esx = gVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            this.esx.esr.postValue(cVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "restrictions", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.kyc.response.restriction.b>> {
        final /* synthetic */ MutableLiveData $liveData;

        f(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.kyc.response.restriction.b> list) {
            Object bVar;
            com.iqoption.core.microservices.kyc.response.restriction.a aVar = null;
            if (list != null) {
                for (Object next : list) {
                    Object obj;
                    if (((com.iqoption.core.microservices.kyc.response.restriction.b) next).afC() == RestrictionId.BLOCK_WITHDRAW) {
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
                com.iqoption.core.microservices.kyc.response.restriction.b bVar2 = (com.iqoption.core.microservices.kyc.response.restriction.b) next2;
                if (bVar2 != null) {
                    aVar = bVar2.afD();
                }
            }
            if (aVar != null) {
                bVar = new b(aVar);
            } else {
                bVar = new d(VerificationWarningType.NONE);
            }
            this.$liveData.postValue(bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawVerifyViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        g(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.postValue(new d(VerificationWarningType.NONE));
        }
    }

    public final LiveData<List<c>> bcF() {
        MediatorLiveData mediatorLiveData;
        if (this.esq == null) {
            mediatorLiveData = new MediatorLiveData();
            mediatorLiveData.addSource(bcH(), new c(this));
            mediatorLiveData.addSource(bcJ(), new d(this));
            this.esq = mediatorLiveData;
        }
        bcI();
        bcK();
        mediatorLiveData = this.esq;
        if (mediatorLiveData == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return mediatorLiveData;
    }

    private final void bcG() {
        if (this.est != null && this.esu != null) {
            MediatorLiveData mediatorLiveData = this.esq;
            if (mediatorLiveData == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            c[] cVarArr = new c[2];
            c cVar = this.est;
            if (cVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVarArr[0] = cVar;
            cVar = this.esu;
            if (cVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVarArr[1] = cVar;
            Collection arrayList = new ArrayList();
            for (Object next : m.listOf(cVarArr)) {
                if ((((c) next).bcz() != VerificationWarningType.NONE ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            mediatorLiveData.postValue((List) arrayList);
        }
    }

    private final LiveData<c> bcH() {
        bcI();
        return this.esr;
    }

    public final void bcI() {
        LiveData liveData = this.ess;
        if (liveData != null) {
            this.esr.removeSource(liveData);
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        LiveData liveData2 = mutableLiveData;
        this.esr.addSource(liveData2, new e(this));
        io.reactivex.disposables.b a = com.iqoption.core.data.repository.d.bdF.WX().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(mutableLiveData), (io.reactivex.b.f) new g(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "KycRepository.observeRes…      }\n                )");
        b(a);
        this.ess = liveData2;
    }

    private final LiveData<c> bcJ() {
        if (com.iqoption.core.d.EH().ej("jumio-card-verification")) {
            com.iqoption.cardsverification.list.f fVar = this.aCG;
            if (fVar == null) {
                kotlin.jvm.internal.i.lG("verifyCardsViewModel");
            }
            LiveData map = Transformations.map(fVar.Ll(), b.esw);
            kotlin.jvm.internal.i.e(map, "Transformations.map(veri…)\n            }\n        }");
            return map;
        }
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.postValue(new d(VerificationWarningType.NONE));
        return mediatorLiveData;
    }

    public final void bcK() {
        com.iqoption.cardsverification.list.f fVar = this.aCG;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("verifyCardsViewModel");
        }
        fVar.Lm();
    }
}
