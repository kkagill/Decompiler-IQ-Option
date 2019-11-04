package com.iqoption.welcome.register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.analytics.b;
import com.iqoption.core.ui.f.d;
import com.iqoption.welcome.AuthDone;
import com.iqoption.welcome.n;
import com.iqoption.welcome.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0004J\u0006\u0010)\u001a\u00020(J\b\u0010*\u001a\u00020(H\u0004J\b\u0010+\u001a\u00020(H\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006-"}, bng = {"Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "isProgressShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isProgressShownData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "()Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "phoneRegState", "getPhoneRegState", "registrationEvent", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "regulationLoaded", "", "getRegulationLoaded", "regulationLoadedLiveData", "Landroidx/lifecycle/MutableLiveData;", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "getRoute", "routeData", "getRouteData", "()Landroidx/lifecycle/MutableLiveData;", "toastMessage", "", "getToastMessage", "toastMessageData", "getToastMessageData", "welcomeState", "Lcom/iqoption/welcome/AuthDone;", "getWelcomeState", "welcomeStateViewModel", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "getWelcomeStateViewModel", "()Lcom/iqoption/welcome/WelcomeStateViewModel;", "setWelcomeStateViewModel", "(Lcom/iqoption/welcome/WelcomeStateViewModel;)V", "createRegistrationEvent", "", "loadRegulation", "reportErrorEvent", "reportSuccessEvent", "Companion", "welcome_release"})
/* compiled from: BaseRegistrationViewModel.kt */
public abstract class c extends d {
    private static final String TAG = c.class.getSimpleName();
    public static final a emn = new a();
    protected o dUI;
    private final com.iqoption.core.data.b.c<Boolean> elK = new com.iqoption.core.data.b.c(Boolean.valueOf(false));
    private final LiveData<Boolean> elL = this.elK;
    private final MutableLiveData<String> elM = new MutableLiveData();
    private final LiveData<String> elN = this.elM;
    private final MutableLiveData<n> elO = new MutableLiveData();
    private final LiveData<n> elP = this.elO;
    private b emk;
    private final MutableLiveData<Object> eml = new MutableLiveData();
    private final LiveData<Object> emm = this.eml;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/register/BaseRegistrationViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: BaseRegistrationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "<set-?>");
        this.dUI = oVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final o baF() {
        o oVar = this.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar;
    }

    public final LiveData<Object> baG() {
        return this.emm;
    }

    /* Access modifiers changed, original: protected|final */
    public final MutableLiveData<String> baH() {
        return this.elM;
    }

    public final LiveData<String> bac() {
        return this.elN;
    }

    /* Access modifiers changed, original: protected|final */
    public final com.iqoption.core.data.b.c<Boolean> baI() {
        return this.elK;
    }

    public final LiveData<Boolean> bab() {
        return this.elL;
    }

    /* Access modifiers changed, original: protected|final */
    public final MutableLiveData<n> baJ() {
        return this.elO;
    }

    public final LiveData<n> bad() {
        return this.elP;
    }

    public final LiveData<Boolean> bae() {
        o oVar = this.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar.aZy();
    }

    public final LiveData<AuthDone> baK() {
        o oVar = this.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar.aUU();
    }

    /* Access modifiers changed, original: protected|final */
    public final void baL() {
        this.emk = com.iqoption.core.d.EC().b("registration_request", 0.5d, null, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final void baM() {
        b bVar = this.emk;
        if (bVar != null) {
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }
        this.emk = (b) null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void baN() {
        b bVar = this.emk;
        if (bVar != null) {
            bVar.a((Number) Integer.valueOf(0));
            bVar.Cc();
        }
        this.emk = (b) null;
    }
}
