package com.iqoption.kyc.profile.steps;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.kyc.j;
import com.iqoption.kyc.profile.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "commonSelectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "profile", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/kyc/profile/KycProfile;", "getProfile", "()Landroidx/lifecycle/LiveData;", "profileSelectionViewModel", "Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel;", "init", "", "fragment", "Landroidx/fragment/app/Fragment;", "isRegulated", "", "setProfileStepOpened", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "setProgress", "updateProfile", "updateProfileAndGoNext", "current", "Companion", "kyc_release"})
/* compiled from: KycProfileStepViewModel.kt */
public final class e extends ViewModel {
    public static final a dBL = new a();
    private j dBs;
    private d dBw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycProfileStepViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e aF(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tepViewModel::class.java)");
            e eVar = (e) viewModel;
            eVar.an(fragment);
            return eVar;
        }
    }

    public final void an(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        this.dBs = j.dsW.am(fragment);
        this.dBw = d.dBv.aD(fragment);
    }

    public final LiveData<com.iqoption.kyc.profile.a> aLU() {
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        return dVar.aLU();
    }

    public final void a(ProfileStep profileStep, com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(profileStep, "current");
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        d dVar = this.dBw;
        String str = "profileSelectionViewModel";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.l(aVar);
        d dVar2 = this.dBw;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.c(profileStep);
    }

    public final boolean Er() {
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        return dVar.Er();
    }

    public final void p(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        d dVar = this.dBw;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("profileSelectionViewModel");
        }
        dVar.l(aVar);
    }

    public final void f(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "step");
        boolean z = profileStep == g.aMe();
        j jVar = this.dBs;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("commonSelectionViewModel");
        }
        jVar.es(z);
        g(profileStep);
    }

    private final void g(ProfileStep profileStep) {
        Integer h = g.h(profileStep);
        if (h != null) {
            int intValue = h.intValue();
            j jVar = this.dBs;
            if (jVar == null) {
                kotlin.jvm.internal.i.lG("commonSelectionViewModel");
            }
            jVar.a(KycStepType.PROFILE, (intValue * 100) / g.aMd().size());
        }
    }
}
