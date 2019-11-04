package com.iqoption.kyc.phone.confirm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.kyc.b.w;
import com.iqoption.kyc.commonphone.c;
import com.iqoption.kyc.o;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u001a\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006'"}, bng = {"Lcom/iqoption/kyc/phone/confirm/KycPhoneConfirmFragment;", "Lcom/iqoption/kyc/phone/BaseKycPhoneFragment;", "Lcom/iqoption/kyc/commonphone/PhoneConfirmationListener;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycPhoneConfirmBinding;", "isContinuePressedAnalytics", "", "()Z", "phone", "", "kotlin.jvm.PlatformType", "getPhone", "()Ljava/lang/String;", "phone$delegate", "Lkotlin/Lazy;", "phoneStepProgress", "", "getPhoneStepProgress", "()I", "screenName", "getScreenName", "stageName", "getStageName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPhoneConfirmed", "", "onResendCode", "onViewCreated", "view", "showBottomBar", "Companion", "kyc_release"})
/* compiled from: KycPhoneConfirmFragment.kt */
public final class a extends com.iqoption.kyc.phone.a implements c {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "phone", "getPhone()Ljava/lang/String;"))};
    public static final a dAS = new a();
    private HashMap apm;
    private final d bsv = g.c(new KycPhoneConfirmFragment$phone$2(this));
    private w dAQ;
    private final int dAR = 100;
    private final String dtM = "PersonalData";
    private final String dtN = "PhoneConfirmation";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/phone/confirm/KycPhoneConfirmFragment$Companion;", "", "()V", "ARG_PHONE", "", "TAG", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "phone", "kyc_release"})
    /* compiled from: KycPhoneConfirmFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ com.iqoption.core.ui.d.c a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = com.iqoption.core.d.EA().getPhone();
            }
            return aVar.iO(str);
        }

        public final com.iqoption.core.ui.d.c iO(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_PHONE", str);
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    private final String getPhone() {
        d dVar = this.bsv;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void eE(boolean z) {
        com.iqoption.kyc.commonphone.c.a.a(this, z);
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dAQ = (w) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_phone_confirm, viewGroup, false, 4, null);
        w wVar = this.dAQ;
        if (wVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return wVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            com.iqoption.core.ui.d.c a = com.iqoption.kyc.commonphone.a.a.a(com.iqoption.kyc.commonphone.a.dtV, getPhone(), false, false, 6, null);
            com.iqoption.core.ext.a.u(this).beginTransaction().replace(o.d.kycPhoneConfirmContainer, a.bh(com.iqoption.core.ext.a.q(this)), a.getName()).commitAllowingStateLoss();
        }
    }

    public void aKE() {
        com.iqoption.kyc.a.a.dtL.o(aKn(), aKo(), aIB().Er());
    }

    public void aKD() {
        aIB().en(true);
    }

    public String aKn() {
        return this.dtM;
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxb;
    }

    public int aLL() {
        return this.dAR;
    }
}
