package com.iqoption.withdraw.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.util.z;
import com.iqoption.withdraw.h;
import com.iqoption.withdraw.l;
import io.reactivex.b.f;
import io.reactivex.b.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/withdraw/history/WithdrawHistoryViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "historyLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "cancel", "Landroidx/lifecycle/LiveData;", "Ljava/lang/Void;", "payout", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "getWithdrawHistory", "refreshHistory", "", "Companion", "withdraw_release"})
/* compiled from: WithdrawHistoryViewModel.kt */
public final class o extends com.iqoption.core.ui.f.d {
    public static final a esV = new a();
    private MediatorLiveData<l> esU = new MediatorLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/history/WithdrawHistoryViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/withdraw/history/WithdrawHistoryViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "withdraw_release"})
    /* compiled from: WithdrawHistoryViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final o bC(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(o.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…oryViewModel::class.java]");
            return (o) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "apply"})
    /* compiled from: WithdrawHistoryViewModel.kt */
    static final class b<T, R> implements g<com.iqoption.core.microservices.billing.response.a, io.reactivex.c> {
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.o esJ;

        b(com.iqoption.core.microservices.withdraw.response.o oVar) {
            this.esJ = oVar;
        }

        /* renamed from: c */
        public final io.reactivex.a apply(com.iqoption.core.microservices.billing.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return com.iqoption.core.microservices.withdraw.a.bDL.b(com.iqoption.billing.a.Kh(), aVar.Zx(), this.esJ.getId());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: WithdrawHistoryViewModel.kt */
    static final class c implements io.reactivex.b.a {
        final /* synthetic */ MutableLiveData esW;

        c(MutableLiveData mutableLiveData) {
            this.esW = mutableLiveData;
        }

        public final void run() {
            this.esW.setValue(null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawHistoryViewModel.kt */
    static final class d<T> implements f<Throwable> {
        final /* synthetic */ MutableLiveData esW;

        d(MutableLiveData mutableLiveData) {
            this.esW = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.esW.setValue(null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawHistoryViewModel.kt */
    static final class e<T> implements Observer<S> {
        final /* synthetic */ MediatorLiveData esX;

        e(MediatorLiveData mediatorLiveData) {
            this.esX = mediatorLiveData;
        }

        /* renamed from: f */
        public final void onChanged(z<l> zVar) {
            if (zVar != null || this.esX.getValue() == null) {
                this.esX.postValue(zVar.anw());
            }
        }
    }

    public final LiveData<l> bcT() {
        bcU();
        return this.esU;
    }

    public final void bcU() {
        MediatorLiveData mediatorLiveData = this.esU;
        mediatorLiveData.addSource(h.epl.bbU(), new e(mediatorLiveData));
    }

    public final LiveData<Void> d(com.iqoption.core.microservices.withdraw.response.o oVar) {
        kotlin.jvm.internal.i.f(oVar, "payout");
        MutableLiveData mutableLiveData = new MutableLiveData();
        io.reactivex.disposables.b a = com.iqoption.billing.repository.d.azu.Ki().bkV().o(new b(oVar)).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new c(mutableLiveData), new d(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "SessionRepository.getSes… null }\n                )");
        b(a);
        return mutableLiveData;
    }
}
