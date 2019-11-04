package com.iqoption.fragment.dialog.popup.whatsnew.depositpage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.util.w;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BanksViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "banks", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;", "getBanks", "()Landroidx/lifecycle/LiveData;", "banksData", "Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "onCleared", "", "parseBanks", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "Companion", "app_optionXRelease"})
/* compiled from: BanksViewModel.kt */
public final class a extends ViewModel {
    public static final a dgn = new a();
    private final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();
    private final MutableLiveData<List<BankItem>> dgl = new MutableLiveData();
    private final LiveData<List<BankItem>> dgm = this.dgl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BanksViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BanksViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: BanksViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a aa(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…nksViewModel::class.java)");
            return (a) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/fragment/dialog/popup/whatsnew/depositpage/BanksViewModel$parseBanks$1$1"})
    /* compiled from: BanksViewModel.kt */
    static final class b implements Runnable {
        final /* synthetic */ com.iqoption.core.microservices.popupserver.response.a dgo;
        final /* synthetic */ a dgp;

        b(com.iqoption.core.microservices.popupserver.response.a aVar, a aVar2) {
            this.dgo = aVar;
            this.dgp = aVar2;
        }

        public final void run() {
            this.dgp.dgl.postValue(w.aWM().fromJson((String) this.dgo.agj().get("banks"), BankItem.List.class));
        }
    }

    public static final a aa(Fragment fragment) {
        return dgn.aa(fragment);
    }

    public final LiveData<List<BankItem>> aCV() {
        return this.dgm;
    }

    public final void k(com.iqoption.core.microservices.popupserver.response.a aVar) {
        if (aVar != null) {
            this.aqB.e(com.iqoption.core.rx.i.aki().m(new b(aVar, this)));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aqB.clear();
    }
}
