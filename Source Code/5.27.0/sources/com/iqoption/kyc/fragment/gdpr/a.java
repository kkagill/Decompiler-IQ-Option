package com.iqoption.kyc.fragment.gdpr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.e.kc;
import com.iqoption.e.pj;
import com.iqoption.kyc.s;
import com.iqoption.util.u;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0011\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020$H\u0016J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u000200H\u0016J\u001a\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020$H\u0002J\u0012\u00107\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00108\u001a\u00020$H\u0002J\u0012\u00109\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b\u001f\u0010\tR\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000¨\u0006<"}, bng = {"Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment;", "Lcom/iqoption/fragment/base/IQFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "binding", "Lcom/iqoption/databinding/FragmentKycGdprOldBinding;", "gdprLink", "Lcom/iqoption/core/util/link/Link;", "getGdprLink", "()Lcom/iqoption/core/util/link/Link;", "gdprLink$delegate", "Lkotlin/Lazy;", "isContinueClicked", "", "isContinuePressedAnalytics", "()Z", "linkClickListener", "com/iqoption/kyc/fragment/gdpr/KycGdprFragment$linkClickListener$1", "Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment$linkClickListener$1;", "listener", "Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment$OnFragmentInteractionListener;", "nextButton", "Lcom/iqoption/core/ui/widget/ConfirmButtonView;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "shownLink", "stageName", "getStageName", "termsLink", "getTermsLink", "termsLink$delegate", "viewModel", "Lcom/iqoption/kyc/fragment/gdpr/KycGdprViewModel;", "loadLink", "", "link", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onSaveInstanceState", "outState", "onViewCreated", "view", "prepareButton", "prepareCheckBox", "prepareToolbar", "prepareWebView", "Companion", "OnFragmentInteractionListener", "app_optionXRelease"})
/* compiled from: KycGdprFragment.kt */
public final class a extends com.iqoption.fragment.b.d implements com.iqoption.kyc.a.b {
    public static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "termsLink", "getTermsLink()Lcom/iqoption/core/util/link/Link;")), k.a(new PropertyReference1Impl(k.G(a.class), "gdprLink", "getGdprLink()Lcom/iqoption/core/util/link/Link;"))};
    public static final a dyg = new a();
    private HashMap apm;
    private ConfirmButtonView cfW;
    private final String dtM;
    private final String dtN;
    private kc dxY;
    private boolean dxZ;
    private com.iqoption.core.util.b.a dya;
    private final kotlin.d dyb = g.c(new KycGdprFragment$termsLink$2(this));
    private final kotlin.d dyc = g.c(new KycGdprFragment$gdprLink$2(this));
    private b dyd;
    private b dye;
    private final c dyf = new c(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment$Companion;", "", "()V", "STATE_SHOWN_URL", "", "TAG", "newInstance", "Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment;", "app_optionXRelease"})
    /* compiled from: KycGdprFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a aLg() {
            return new a();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/kyc/fragment/gdpr/KycGdprFragment$OnFragmentInteractionListener;", "", "onGdprAccepted", "", "app_optionXRelease"})
    /* compiled from: KycGdprFragment.kt */
    public interface b {
        void aJR();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"})
    /* compiled from: KycGdprFragment.kt */
    static final class e implements OnCheckedChangeListener {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a.a(this.this$0).setEnabled(z);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/fragment/gdpr/KycGdprFragment$linkClickListener$1", "Lcom/iqoption/core/util/link/LinkClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "app_optionXRelease"})
    /* compiled from: KycGdprFragment.kt */
    public static final class c implements com.iqoption.core.util.b.b {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            if ((kotlin.jvm.internal.i.y(this.this$0.dya, aVar) ^ 1) != 0) {
                this.this$0.b(aVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/fragment/gdpr/KycGdprFragment$prepareButton$1", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: KycGdprFragment.kt */
    public static final class d extends com.iqoption.view.d.b {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            a.a(this.this$0).d(true, true);
            this.this$0.dxZ = true;
            u.a(a.b(this.this$0).b(new com.iqoption.core.microservices.busapi.response.b(Boolean.valueOf(true), null, null, null, null, 30, null)), new KycGdprFragment$prepareButton$1$onDelayClick$1(this), new KycGdprFragment$prepareButton$1$onDelayClick$2(this), null, 4, null);
        }
    }

    private final com.iqoption.core.util.b.a aLc() {
        kotlin.d dVar = this.dyb;
        j jVar = anY[0];
        return (com.iqoption.core.util.b.a) dVar.getValue();
    }

    private final com.iqoption.core.util.b.a aLd() {
        kotlin.d dVar = this.dyc;
        j jVar = anY[1];
        return (com.iqoption.core.util.b.a) dVar.getValue();
    }

    public static final a aLg() {
        return dyg.aLg();
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

    public a() {
        String str = "GdprAcceptance";
        this.dtM = str;
        this.dtN = str;
    }

    public static final /* synthetic */ ConfirmButtonView a(a aVar) {
        ConfirmButtonView confirmButtonView = aVar.cfW;
        if (confirmButtonView == null) {
            kotlin.jvm.internal.i.lG("nextButton");
        }
        return confirmButtonView;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onAttach(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        super.onAttach(context);
        this.dye = (b) context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dxY = (kc) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_kyc_gdpr_old, viewGroup, false, 4, null);
        kc kcVar = this.dxY;
        String str = "binding";
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ConfirmButtonView confirmButtonView = kcVar.cga.cfW;
        kotlin.jvm.internal.i.e(confirmButtonView, "binding.nextButton.nextButton");
        this.cfW = confirmButtonView;
        kcVar = this.dxY;
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return kcVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.dyd = b.dyh.x(com.iqoption.core.ext.a.r(this));
        aLe();
        Q(bundle);
        R(bundle);
        aLf();
    }

    private final void aLe() {
        kc kcVar = this.dxY;
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        pj pjVar = kcVar.cfS;
        if (pjVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Toolbar toolbar = pjVar.toolbar;
        kotlin.jvm.internal.i.e(toolbar, "binding.kycToolbarLayout!!.toolbar");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            s.a((AppCompatActivity) activity, toolbar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.util.b.a aVar = this.dya;
        if (aVar != null) {
            bundle.putParcelable("STATE_SHOWN_URL", aVar);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onDetach() {
        this.dye = (b) null;
        super.onDetach();
    }

    private final void Q(Bundle bundle) {
        kc kcVar = this.dxY;
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = kcVar.cgK;
        WebSettings settings = webView.getSettings();
        String str = "settings";
        kotlin.jvm.internal.i.e(settings, str);
        settings.setJavaScriptEnabled(true);
        settings = webView.getSettings();
        kotlin.jvm.internal.i.e(settings, str);
        settings.setLoadWithOverviewMode(true);
        settings = webView.getSettings();
        kotlin.jvm.internal.i.e(settings, str);
        settings.setUseWideViewPort(true);
        webView.setBackgroundColor(0);
        webView.setWebChromeClient(new WebChromeClient());
        com.iqoption.core.util.b.a aVar = bundle != null ? (com.iqoption.core.util.b.a) bundle.getParcelable("STATE_SHOWN_URL") : null;
        if (aVar == null) {
            aVar = aLc();
        }
        b(aVar);
    }

    private final void R(Bundle bundle) {
        kotlin.jvm.internal.i.e(getString(R.string.n1_and_n2, aLc().getText(), aLd().getText()), "getString(R.string.n1_an…Link.text, gdprLink.text)");
        String string = getString(R.string.i_hereby_accept, string);
        kotlin.jvm.internal.i.e(string, "getString(R.string.i_hereby_accept, linksText)");
        kc kcVar = this.dxY;
        String str = "binding";
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = kcVar.cgI;
        kotlin.jvm.internal.i.e(textView, "binding.kycGdprCheckBoxText");
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aLc(), aLd()};
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView, string, 0, 0, false, this.dyf, 56, null));
        kc kcVar2 = this.dxY;
        if (kcVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        CheckBox checkBox = kcVar2.cgH;
        kotlin.jvm.internal.i.e(checkBox, "binding.kycGdprCheckBox");
        checkBox.setOnCheckedChangeListener(new e(this));
        if (bundle == null) {
            checkBox.setChecked(false);
        }
        ConfirmButtonView confirmButtonView = this.cfW;
        if (confirmButtonView == null) {
            kotlin.jvm.internal.i.lG("nextButton");
        }
        confirmButtonView.setEnabled(checkBox.isChecked());
    }

    private final void aLf() {
        ConfirmButtonView confirmButtonView = this.cfW;
        if (confirmButtonView == null) {
            kotlin.jvm.internal.i.lG("nextButton");
        }
        confirmButtonView.setOnClickListener(new d(this));
    }

    private final void b(com.iqoption.core.util.b.a aVar) {
        kc kcVar = this.dxY;
        String str = "binding";
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = kcVar.cgJ;
        kotlin.jvm.internal.i.e(textView, "binding.kycGdprTitle");
        textView.setText(aVar.getText());
        this.dya = aVar;
        kcVar = this.dxY;
        if (kcVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kcVar.cgK.loadUrl(aVar.getUrl());
    }

    public String aKn() {
        return this.dtM;
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxZ;
    }
}
