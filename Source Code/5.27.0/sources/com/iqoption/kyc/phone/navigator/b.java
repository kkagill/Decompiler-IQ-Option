package com.iqoption.kyc.phone.navigator;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.microservices.kyc.response.step.c;
import com.iqoption.kyc.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "setCurrentStep", "", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "setTitle", "title", "", "Companion", "kyc_release"})
/* compiled from: KycPhoneNavigatorViewModel.kt */
public final class b extends ViewModel {
    public static final a dBf = new a();
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycPhoneNavigatorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aC(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…torViewModel::class.java)");
            b bVar = (b) viewModel;
            bVar.drN = j.dsW.am(fragment);
            return bVar;
        }
    }

    public final void setTitle(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.setTitle(str);
    }

    public final void b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.b(cVar);
    }
}
