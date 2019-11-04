package com.iqoption.kyc.profile.steps.reportable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.d.c;
import com.iqoption.kyc.b.aq;
import com.iqoption.kyc.h;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001e"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableErrorFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycReportableErrorBinding;", "isBlock", "", "()Z", "isBlock$delegate", "Lkotlin/Lazy;", "isContinuePressedAnalytics", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showBottomBar", "Companion", "kyc_release"})
/* compiled from: KycReportableErrorFragment.kt */
public final class a extends com.iqoption.kyc.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "isBlock", "isBlock()Z"))};
    public static final a dCq = new a();
    private HashMap apm;
    private aq dCo;
    private final d dCp = g.c(new KycReportableErrorFragment$isBlock$2(this));
    private final String dtM = "PersonalData";
    private final String dtN = "USRestricted";
    private final boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableErrorFragment$Companion;", "", "()V", "ARG_IS_BLOCK", "", "TAG", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "isBlock", "", "kyc_release"})
    /* compiled from: KycReportableErrorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final c eQ(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_BLOCK", z);
            return new c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            h.dsg.aIX().al(this.this$0);
            com.iqoption.kyc.a.a.dtL.n(this.this$0.aKn(), this.this$0.aKo(), this.this$0.aIB().Er());
        }
    }

    private final boolean aMk() {
        d dVar = this.dCp;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
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

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dCo = (aq) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_reportable_error, viewGroup, false, 4, null);
        setHasOptionsMenu(aMk());
        aq aqVar = this.dCo;
        if (aqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aqVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        aq aqVar;
        TextView textView;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String str = "binding.contactSupport";
        String str2 = "binding";
        if (com.iqoption.core.d.Un().Dq()) {
            aqVar = this.dCo;
            if (aqVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = aqVar.dvK;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
        } else {
            aqVar = this.dCo;
            if (aqVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = aqVar.dvK;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
            aqVar = this.dCo;
            if (aqVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = aqVar.dvK;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setOnClickListener(new b(this));
        }
        kotlin.jvm.internal.i.e(getString(f.support_email), "getString(R.string.support_email)");
        aq aqVar2 = this.dCo;
        if (aqVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextView textView2 = aqVar2.cgY;
        kotlin.jvm.internal.i.e(textView2, "binding.kycReportableWarning");
        String string = getString(f.kyc_us_person_alert_text_n1, r12);
        kotlin.jvm.internal.i.e(string, "getString(R.string.kyc_u…son_alert_text_n1, email)");
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{new com.iqoption.core.util.b.a(r12, r12)};
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView2, string, com.iqoption.kyc.o.a.white, com.iqoption.kyc.o.a.white, true, new com.iqoption.core.util.b.h(com.iqoption.core.d.Uo())));
        str = "binding.kycReportableCancel";
        if (aMk()) {
            aqVar = this.dCo;
            if (aqVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = aqVar.dvL;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
            return;
        }
        aqVar = this.dCo;
        if (aqVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = aqVar.dvL;
        kotlin.jvm.internal.i.e(textView, str);
        com.iqoption.core.ext.a.al(textView);
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxb;
    }

    public String aKn() {
        return this.dtM;
    }
}
