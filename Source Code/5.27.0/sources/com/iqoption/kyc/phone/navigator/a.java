package com.iqoption.kyc.phone.navigator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.b;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.d.g;
import com.iqoption.kyc.b.aa;
import com.iqoption.kyc.o;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycPhoneNavigatorBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorViewModel;", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "getLastAnalyticsFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showConfirmFragment", "phone", "Companion", "kyc_release"})
/* compiled from: KycPhoneNavigatorFragment.kt */
public final class a extends b implements com.iqoption.kyc.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dBe = new a();
    private HashMap apm;
    private aa dBc;
    private b dBd;
    private final d dwS = g.c(new KycPhoneNavigatorFragment$step$2(this));
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/phone/navigator/KycPhoneNavigatorFragment$Companion;", "", "()V", "ARG_STEP", "", "TAG", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "showConfirmFragment", "", "child", "Landroidx/fragment/app/Fragment;", "phone", "kyc_release"})
    /* compiled from: KycPhoneNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c e(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new c(a.TAG, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        public final void e(Fragment fragment, String str) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(str, "phone");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).iP(str);
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        d dVar = this.dwS;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dBd = b.dBf.aC(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBc = (aa) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_phone_navigator, viewGroup, false, 4, null);
        aa aaVar = this.dBc;
        if (aaVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aaVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        b bVar = this.dBd;
        String str = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.b(aKH());
        bVar = this.dBd;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        str = getString(f.phone);
        kotlin.jvm.internal.i.e(str, "getString(R.string.phone)");
        bVar.setTitle(str);
    }

    private final void iP(String str) {
        g.a(alE(), com.iqoption.kyc.phone.confirm.a.dAS.iO(str), false, 2, null);
    }

    public int KW() {
        return o.d.kycPhoneContainer;
    }

    public c KX() {
        if (com.iqoption.core.e.b.bg(com.iqoption.core.e.b.bf(com.iqoption.core.data.d.b.bdk.WB().Wz()))) {
            return com.iqoption.kyc.phone.a.a.dAW.aLM();
        }
        return com.iqoption.kyc.phone.confirm.a.a.a(com.iqoption.kyc.phone.confirm.a.dAS, null, 1, null);
    }

    private final com.iqoption.kyc.a.b aLE() {
        Fragment findFragmentById = alE().alH().findFragmentById(KW());
        if (!(findFragmentById instanceof com.iqoption.kyc.a.b)) {
            findFragmentById = null;
        }
        return (com.iqoption.kyc.a.b) findFragmentById;
    }

    public String aKn() {
        com.iqoption.kyc.a.b aLE = aLE();
        if (aLE != null) {
            String aKn = aLE.aKn();
            if (aKn != null) {
                return aKn;
            }
        }
        return "";
    }

    public String aKo() {
        com.iqoption.kyc.a.b aLE = aLE();
        if (aLE != null) {
            String aKo = aLE.aKo();
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
