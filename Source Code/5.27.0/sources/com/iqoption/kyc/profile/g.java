package com.iqoption.kyc.profile;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.d;
import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.microservices.kyc.c;
import com.iqoption.kyc.l;
import com.iqoption.kyc.profile.steps.ProfileStep;
import java.util.Date;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007¨\u0006\u0019"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "profile", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/kyc/profile/KycProfile;", "getProfile", "()Landroidx/lifecycle/LiveData;", "profileSelectionViewModel", "Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel;", "profileStep", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getProfileStep", "initProfile", "", "isRegulated", "", "selectNextProfileStep", "currentStep", "selectProfileStep", "stepToSelect", "setCurrentStep", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "Companion", "kyc_release"})
/* compiled from: KycProfileViewModel.kt */
public final class g extends l {
    public static final a dBx = new a();
    private d dBw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/KycProfileViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycProfileViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g aE(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ileViewModel::class.java)");
            g gVar = (g) viewModel;
            gVar.dBw = d.dBv.aD(fragment);
            gVar.an(fragment);
            return gVar;
        }
    }

    public final LiveData<ProfileStep> aLV() {
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        return dVar.aLV();
    }

    public final void aLW() {
        long DU = d.EA().DU();
        a aVar = new a(d.EA().getFirstName(), d.EA().getLastName(), DU > 0 ? c.bur.aes().format(new Date(DU * ((long) 1000))) : null, Boolean.valueOf(d.EA().DT() == Gender.MALE), Long.valueOf(d.EA().El()), null, d.EA().DX(), d.EA().getCity(), d.EA().DY(), d.EA().getAddress(), 32, null);
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        dVar.l(aVar);
    }

    public final LiveData<a> aLU() {
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        return dVar.aLU();
    }

    public final void b(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "stepToSelect");
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        dVar.b(profileStep);
    }

    public final void c(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "currentStep");
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        dVar.c(profileStep);
    }

    public final void b(com.iqoption.core.microservices.kyc.response.step.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        aIB().b(cVar);
    }

    public final boolean Er() {
        return aIB().Er();
    }
}
