package com.iqoption.kyc;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ui.f.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, bng = {"Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "nextScreen", "Landroidx/lifecycle/LiveData;", "", "getNextScreen", "()Landroidx/lifecycle/LiveData;", "prevScreen", "getPrevScreen", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "getSelectionViewModel", "()Lcom/iqoption/kyc/KycSelectionViewModel;", "setSelectionViewModel", "(Lcom/iqoption/kyc/KycSelectionViewModel;)V", "init", "", "fragment", "Landroidx/fragment/app/Fragment;", "setTitle", "title", "", "kyc_release"})
/* compiled from: KycSubStepContainerViewModel.kt */
public class l extends d {
    protected j drN;

    public final void an(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        this.drN = j.dsW.am(fragment);
    }

    /* Access modifiers changed, original: protected|final */
    public final j aIB() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public final LiveData<Object> aJh() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJh();
    }

    public final LiveData<Object> aJj() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJj();
    }

    public final void setTitle(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.setTitle(str);
    }
}
