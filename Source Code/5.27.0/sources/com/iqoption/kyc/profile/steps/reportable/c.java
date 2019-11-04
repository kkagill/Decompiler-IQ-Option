package com.iqoption.kyc.profile.steps.reportable;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.microservices.kyc.response.Gender;
import com.iqoption.core.microservices.kyc.response.h;
import com.iqoption.core.ui.f.d;
import com.iqoption.kyc.j;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "progress", "Landroidx/lifecycle/LiveData;", "", "getProgress", "()Landroidx/lifecycle/LiveData;", "progressLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "saveProfile", "", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "Companion", "kyc_release"})
/* compiled from: KycReportableViewModel.kt */
public final class c extends d {
    public static final a dCx = new a();
    private final com.iqoption.core.data.b.b<Boolean> dCw = new com.iqoption.core.data.b.b();
    private j drN;
    private final LiveData<Boolean> dsB = this.dCw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/steps/reportable/KycReportableViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycReportableViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aI(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…bleViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.drN = j.dsW.am(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/UpdateProfileResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycReportableViewModel.kt */
    static final class b<T> implements f<h> {
        final /* synthetic */ c dCy;

        b(c cVar) {
            this.dCy = cVar;
        }

        /* renamed from: b */
        public final void accept(h hVar) {
            c.a(this.dCy).en(true);
            com.iqoption.kyc.a.a.b(true, null, c.a(this.dCy).Er());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycReportableViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ c dCy;

        c(c cVar) {
            this.dCy = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            String K = com.iqoption.kyc.h.dsg.aIX().K(th);
            CharSequence charSequence = K;
            Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
            if (obj == null) {
                com.iqoption.core.d.a(K, 0, 2, null);
            }
            this.dCy.dCw.postValue(Boolean.valueOf(false));
            com.iqoption.kyc.a.a.b(false, null, c.a(this.dCy).Er());
        }
    }

    public static final /* synthetic */ j a(c cVar) {
        j jVar = cVar.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public final LiveData<Boolean> aJl() {
        return this.dsB;
    }

    public final void q(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        this.dCw.postValue(Boolean.valueOf(true));
        String firstName = aVar.getFirstName();
        if (firstName == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String lastName = aVar.getLastName();
        if (lastName == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String aLQ = aVar.aLQ();
        if (aLQ == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        com.iqoption.core.microservices.kyc.response.Gender.b bVar = Gender.Companion;
        Boolean aLR = aVar.aLR();
        if (aLR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Gender fromBoolean = bVar.fromBoolean(aLR);
        String DX = aVar.DX();
        if (DX == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Long YC = aVar.YC();
        if (YC == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        long longValue = YC.longValue();
        String city = aVar.getCity();
        if (city == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String address = aVar.getAddress();
        if (address == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String DY = aVar.DY();
        if (DY == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.c.a(firstName, lastName, aLQ, fromBoolean, DX, longValue, city, address, DY, null).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new b(this), (f) new c(this));
        kotlin.jvm.internal.i.e(a, "KycRequests.updateUserPr…      }\n                )");
        b(a);
    }
}
