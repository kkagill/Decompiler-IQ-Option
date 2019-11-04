package com.iqoption.kyc.steps;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.step.c;
import com.iqoption.kyc.l;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/steps/KycStepsViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "steps", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getSteps", "()Landroidx/lifecycle/LiveData;", "clearCurrentStep", "", "goToNextStep", "openStep", "step", "Companion", "kyc_release"})
/* compiled from: KycStepsViewModel.kt */
public final class a extends l {
    public static final a dEa = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/steps/KycStepsViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/steps/KycStepsViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycStepsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a aQ(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…epsViewModel::class.java)");
            a aVar = (a) viewModel;
            aVar.an(fragment);
            return aVar;
        }
    }

    public final LiveData<List<c>> aNe() {
        return aIB().aJc();
    }

    public final void aKS() {
        aIB().em(false);
    }

    public final void h(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        aIB().a(cVar, false);
    }

    public final void aNf() {
        aIB().b(null);
    }
}
