package com.iqoption.kyc.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.g;
import com.iqoption.kyc.b.ac;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.profile.steps.ProfileStep;
import com.iqoption.kyc.profile.steps.country.CountryMode;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020%H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycProfileBinding;", "isContinuePressedAnalytics", "", "()Z", "profileStep", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/profile/KycProfileViewModel;", "getContainerId", "", "getCurrentFragment", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "kyc_release"})
/* compiled from: KycProfileFragment.kt */
public final class b extends com.iqoption.core.ui.d.b implements com.iqoption.kyc.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dBp = new a();
    private HashMap apm;
    private g dBm;
    private ac dBn;
    private ProfileStep dBo;
    private final kotlin.d dwS = g.c(new KycProfileFragment$step$2(this));
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/profile/KycProfileFragment$Companion;", "", "()V", "ARG_STEP", "", "STATE_STEP", "TAG", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getNavigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "child", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycProfileFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c f(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(b.TAG, b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        public final g P(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((b) com.iqoption.core.ext.a.a(fragment, b.class)).alE();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycProfileFragment.kt */
    static final class b<T> implements Observer<ProfileStep> {
        final /* synthetic */ b this$0;

        b(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ProfileStep profileStep) {
            this.this$0.dBo = profileStep;
            if (profileStep != null) {
                com.iqoption.core.ui.d.c aLM;
                if (profileStep != ProfileStep.GDPR) {
                    g a = b.a(this.this$0);
                    String string = this.this$0.getString(f.personal_data);
                    kotlin.jvm.internal.i.e(string, "getString(R.string.personal_data)");
                    a.setTitle(string);
                }
                switch (profileStep) {
                    case LEGAL_NAME:
                        aLM = com.iqoption.kyc.profile.steps.d.dBK.aLM();
                        break;
                    case SEX:
                        aLM = com.iqoption.kyc.profile.steps.f.dBN.aLM();
                        break;
                    case DATE_OF_BIRTH:
                        aLM = com.iqoption.kyc.profile.steps.c.dBH.aLM();
                        break;
                    case COUNTRY:
                        aLM = com.iqoption.kyc.profile.steps.country.d.dBX.a(CountryMode.RESIDENCE);
                        break;
                    case CITIZEN_COUNTRY:
                        aLM = com.iqoption.kyc.profile.steps.country.d.dBX.a(CountryMode.CITIZENSHIP);
                        break;
                    case ADDRESS:
                        aLM = com.iqoption.kyc.profile.steps.b.dBD.aLM();
                        break;
                    case REPORTABLE:
                        aLM = com.iqoption.kyc.profile.steps.reportable.b.dCu.aLM();
                        break;
                    case GDPR:
                        aLM = com.iqoption.kyc.profile.steps.gdpr.a.dCj.aLM();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                FragmentManager u = com.iqoption.core.ext.a.u(this.this$0);
                if (u.findFragmentByTag(aLM.getName()) == null) {
                    this.this$0.alE().a(aLM, u.findFragmentById(this.this$0.KW()) == null);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycProfileFragment.kt */
    static final class c<T> implements Observer<Object> {
        final /* synthetic */ b this$0;

        c(b bVar) {
            this.this$0 = bVar;
        }

        public final void onChanged(Object obj) {
            com.iqoption.kyc.navigator.a.dAF.at(this.this$0);
            this.this$0.alE().alG();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycProfileFragment.kt */
    static final class d<T> implements Observer<Object> {
        final /* synthetic */ b this$0;

        d(b bVar) {
            this.this$0 = bVar;
        }

        public final void onChanged(Object obj) {
            com.iqoption.kyc.profile.steps.a b = this.this$0.aLT();
            if (b != null && b.aMa()) {
                com.iqoption.kyc.a.a.dtL.i("kyc_next", b.aKn(), b.aKo(), b.a(this.this$0).Er());
                b.a(this.this$0).c(b.aMb());
            }
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        kotlin.d dVar = this.dwS;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dBm = g.dBx.aE(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBn = (ac) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_profile, viewGroup, false, 4, null);
        ac acVar = this.dBn;
        if (acVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return acVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        g gVar = this.dBm;
        String str = "viewModel";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.b(aKH());
        gVar = this.dBm;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        gVar.aLV().observe(lifecycleOwner, new b(this));
        ProfileStep profileStep = (ProfileStep) (bundle != null ? bundle.getSerializable("STATE_STEP") : null);
        if (profileStep == null) {
            profileStep = (ProfileStep) u.bU(com.iqoption.kyc.profile.steps.g.aMd());
        }
        g gVar2 = this.dBm;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar2.b(profileStep);
        gVar = this.dBm;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        if (gVar.aLU().getValue() == null) {
            gVar = this.dBm;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar.aLW();
        }
        gVar = this.dBm;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.aJh().observe(lifecycleOwner, new c(this));
        gVar = this.dBm;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.aJj().observe(lifecycleOwner, new d(this));
    }

    private final com.iqoption.kyc.profile.steps.a aLT() {
        Fragment findFragmentById = com.iqoption.core.ext.a.u(this).findFragmentById(KW());
        if (!(findFragmentById instanceof com.iqoption.kyc.profile.steps.a)) {
            findFragmentById = null;
        }
        return (com.iqoption.kyc.profile.steps.a) findFragmentById;
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        bundle.putSerializable("STATE_STEP", this.dBo);
        super.onSaveInstanceState(bundle);
    }

    public int KW() {
        return com.iqoption.kyc.o.d.kycProfileContainer;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (com.iqoption.kyc.navigator.a.dAF.at(this)) {
            return true;
        }
        return super.a(fragmentManager);
    }

    public String aKn() {
        com.iqoption.kyc.profile.steps.a aLT = aLT();
        if (aLT != null) {
            String aKn = aLT.aKn();
            if (aKn != null) {
                return aKn;
            }
        }
        return "";
    }

    public String aKo() {
        com.iqoption.kyc.profile.steps.a aLT = aLT();
        if (aLT != null) {
            String aKo = aLT.aKo();
            if (aKo != null) {
                return aKo;
            }
        }
        return "";
    }

    public boolean aKp() {
        return this.dxb;
    }
}
