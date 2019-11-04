package com.iqoption.kyc.profile;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.data.b.b;
import com.iqoption.kyc.c;
import com.iqoption.kyc.f;
import com.iqoption.kyc.j;
import com.iqoption.kyc.profile.steps.ProfileStep;
import com.iqoption.kyc.profile.steps.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "commonSelectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "profile", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/kyc/profile/KycProfile;", "getProfile", "()Landroidx/lifecycle/LiveData;", "profileLiveData", "Landroidx/lifecycle/MutableLiveData;", "profileStep", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getProfileStep", "profileStepLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "init", "", "fragment", "Landroidx/fragment/app/Fragment;", "isRegulated", "", "isStepAllowed", "step", "selectNextProfileStep", "current", "selectProfileStep", "setProfile", "Companion", "kyc_release"})
/* compiled from: KycProfileSelectionViewModel.kt */
public final class d extends com.iqoption.core.ui.f.d {
    public static final a dBv = new a();
    private final MutableLiveData<a> dBq = new MutableLiveData();
    private final LiveData<a> dBr = this.dBq;
    private j dBs;
    private final b<ProfileStep> dBt = new b();
    private final LiveData<ProfileStep> dBu = this.dBt;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycProfileSelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d aD(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            fragment = f.dsb.aj(fragment);
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ho…ionViewModel::class.java)");
            d dVar = (d) viewModel;
            dVar.an(fragment);
            return dVar;
        }
    }

    private final void an(Fragment fragment) {
        this.dBs = j.dsW.am(fragment);
    }

    public final LiveData<a> aLU() {
        return this.dBr;
    }

    public final void l(a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        this.dBq.setValue(aVar);
    }

    public final LiveData<ProfileStep> aLV() {
        return this.dBu;
    }

    public final void b(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "step");
        this.dBt.postValue(profileStep);
    }

    public final void c(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "current");
        profileStep = (ProfileStep) f.a(g.aMd(), g.aMd().indexOf(profileStep), new KycProfileSelectionViewModel$selectNextProfileStep$next$1(this));
        if (profileStep != null) {
            this.dBt.postValue(profileStep);
        }
    }

    public final boolean Er() {
        j jVar = this.dBs;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("commonSelectionViewModel");
        }
        return jVar.Er();
    }

    private final boolean d(ProfileStep profileStep) {
        int i = e.aob[profileStep.ordinal()];
        if (i == 1) {
            return c.aIF();
        }
        Long l = null;
        if (i == 2) {
            a aVar = (a) this.dBr.getValue();
            if (aVar != null) {
                l = aVar.aLS();
            }
            if (l != null && c.aIF()) {
                return false;
            }
        } else if (i == 3) {
            if (!com.iqoption.core.d.EH().ej("gdpr-support") || !Er()) {
                return false;
            }
            Object abv;
            com.iqoption.core.microservices.busapi.response.b Ed = com.iqoption.core.d.EA().Ed();
            if (Ed != null) {
                abv = Ed.abv();
            }
            if ((kotlin.jvm.internal.i.y(abv, Boolean.valueOf(true)) ^ 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
