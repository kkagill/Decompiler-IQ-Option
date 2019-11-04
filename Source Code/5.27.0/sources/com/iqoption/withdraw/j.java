package com.iqoption.withdraw;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.b.b;
import io.reactivex.e;
import io.reactivex.processors.BehaviorProcessor;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/withdraw/WithdrawSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "infoPopup", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/withdraw/InfoPopupParams;", "getInfoPopup", "()Landroidx/lifecycle/LiveData;", "infoPopupData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "userPayoutSettingsProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "kotlin.jvm.PlatformType", "setUserPayoutSettings", "", "settings", "showInfoPopup", "params", "userPayoutSettings", "Lio/reactivex/Flowable;", "Companion", "withdraw_release"})
/* compiled from: WithdrawSelectionViewModel.kt */
public final class j extends ViewModel {
    public static final a epC = new a();
    private final b<c> epA = new b();
    private final LiveData<c> epB = this.epA;
    private final io.reactivex.processors.a<com.iqoption.core.microservices.withdraw.response.i> epz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\b"}, bng = {"Lcom/iqoption/withdraw/WithdrawSelectionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/withdraw/WithdrawSelectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "getHost", "withdraw_release"})
    /* compiled from: WithdrawSelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final j bz(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(aj(fragment)).get(j.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ge…ionViewModel::class.java)");
            return (j) viewModel;
        }

        private final Fragment aj(Fragment fragment) {
            return fragment instanceof com.iqoption.withdraw.d.b ? fragment : com.iqoption.core.ext.a.a(fragment, com.iqoption.withdraw.d.b.class);
        }
    }

    public j() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…ettings>().toSerialized()");
        this.epz = bmJ;
    }

    public final LiveData<c> bbW() {
        return this.epB;
    }

    public final void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        this.epA.postValue(cVar);
    }

    public final void a(com.iqoption.core.microservices.withdraw.response.i iVar) {
        kotlin.jvm.internal.i.f(iVar, "settings");
        this.epz.onNext(iVar);
    }

    public final e<com.iqoption.core.microservices.withdraw.response.i> bbX() {
        e c = this.epz.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "userPayoutSettingsProcessor.observeOn(bg)");
        return c;
    }
}
