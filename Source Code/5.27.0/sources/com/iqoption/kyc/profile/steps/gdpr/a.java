package com.iqoption.kyc.profile.steps.gdpr;

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
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.ext.g;
import com.iqoption.kyc.b.m;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.profile.steps.ProfileStep;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0002J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020-H\u0016J\u001a\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00102\u001a\u00020$H\u0002J\u0012\u00103\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0012\u00104\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u00105\u001a\u00020\u000fH\u0014J\u0010\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u000208H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b!\u0010\t¨\u0006:"}, bng = {"Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycGdprBinding;", "gdprLink", "Lcom/iqoption/core/util/link/Link;", "getGdprLink", "()Lcom/iqoption/core/util/link/Link;", "gdprLink$delegate", "Lkotlin/Lazy;", "gdprViewModel", "Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprViewModel;", "isContinueClicked", "", "isContinuePressedAnalytics", "()Z", "linkClickListener", "com/iqoption/kyc/profile/steps/gdpr/KycGdprFragment$linkClickListener$1", "Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprFragment$linkClickListener$1;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "shownLink", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "termsLink", "getTermsLink", "termsLink$delegate", "loadLink", "", "link", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onViewCreated", "view", "prepareButton", "prepareCheckBox", "prepareWebView", "showBottomBar", "validateAndSaveData", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "Companion", "kyc_release"})
/* compiled from: KycGdprFragment.kt */
public final class a extends com.iqoption.kyc.profile.steps.a implements com.iqoption.kyc.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "termsLink", "getTermsLink()Lcom/iqoption/core/util/link/Link;")), k.a(new PropertyReference1Impl(k.G(a.class), "gdprLink", "getGdprLink()Lcom/iqoption/core/util/link/Link;"))};
    public static final a dCj = new a();
    private HashMap apm;
    private final ProfileStep dBC;
    private m dCg;
    private b dCh;
    private final b dCi = new b(this);
    private final String dtM;
    private final String dtN;
    private boolean dxZ;
    private com.iqoption.core.util.b.a dya;
    private final kotlin.d dyb = g.c(new KycGdprFragment$termsLink$2(this));
    private final kotlin.d dyc = g.c(new KycGdprFragment$gdprLink$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprFragment$Companion;", "", "()V", "STATE_SHOWN_URL", "", "TAG", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycGdprFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"})
    /* compiled from: KycGdprFragment.kt */
    static final class e implements OnCheckedChangeListener {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FrameLayout frameLayout = a.a(this.this$0).duX.dwC;
            kotlin.jvm.internal.i.e(frameLayout, "binding.nextButton.kycButton");
            frameLayout.setEnabled(z);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/profile/steps/gdpr/KycGdprFragment$linkClickListener$1", "Lcom/iqoption/core/util/link/LinkClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "kyc_release"})
    /* compiled from: KycGdprFragment.kt */
    public static final class b implements com.iqoption.core.util.b.b {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            if ((kotlin.jvm.internal.i.y(this.this$0.dya, aVar) ^ 1) != 0) {
                this.this$0.b(aVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycGdprFragment.kt */
    static final class c<T> implements Observer<Throwable> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: L */
        public final void onChanged(Throwable th) {
            ContentLoadingProgressBar contentLoadingProgressBar = a.a(this.this$0).duX.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.nextButton.kycButtonProgress");
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
            com.iqoption.core.d.a(f.unknown_error_occurred, 0, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            ContentLoadingProgressBar contentLoadingProgressBar = a.a(this.this$0).duX.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.nextButton.kycButtonProgress");
            contentLoadingProgressBar.setVisibility(0);
            this.this$0.dxZ = true;
            a.b(this.this$0).a(new com.iqoption.core.microservices.busapi.response.b(Boolean.valueOf(true), null, null, null, null, 30, null));
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

    public a() {
        String str = "GdprAcceptance";
        this.dtM = str;
        this.dtN = str;
        this.dBC = ProfileStep.GDPR;
    }

    public static final /* synthetic */ m a(a aVar) {
        m mVar = aVar.dCg;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar;
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
        this.dCg = (m) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_gdpr, viewGroup, false, 4, null);
        m mVar = this.dCg;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.dCh = b.dCm.aH(this);
        Q(bundle);
        R(bundle);
        aLf();
        b bVar = this.dCh;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("gdprViewModel");
        }
        bVar.aMj().observe(this, new c(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.util.b.a aVar = this.dya;
        if (aVar != null) {
            bundle.putParcelable("STATE_SHOWN_URL", aVar);
        }
        super.onSaveInstanceState(bundle);
    }

    private final void Q(Bundle bundle) {
        m mVar = this.dCg;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = mVar.cgK;
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
        kotlin.jvm.internal.i.e(getString(f.n1_and_n2, aLc().getText(), aLd().getText()), "getString(R.string.n1_an…Link.text, gdprLink.text)");
        String string = getString(f.i_hereby_accept, string);
        kotlin.jvm.internal.i.e(string, "getString(R.string.i_hereby_accept, linksText)");
        m mVar = this.dCg;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mVar.cgI;
        kotlin.jvm.internal.i.e(textView, "binding.kycGdprCheckBoxText");
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aLc(), aLd()};
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView, string, 0, 0, false, this.dCi, 56, null));
        m mVar2 = this.dCg;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        CheckBox checkBox = mVar2.cgH;
        kotlin.jvm.internal.i.e(checkBox, "binding.kycGdprCheckBox");
        checkBox.setOnCheckedChangeListener(new e(this));
        if (bundle == null) {
            checkBox.setChecked(false);
        }
        m mVar3 = this.dCg;
        if (mVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = mVar3.duX.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.nextButton.kycButton");
        frameLayout.setEnabled(checkBox.isChecked());
    }

    private final void aLf() {
        m mVar = this.dCg;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        FrameLayout frameLayout = mVar.duX.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.nextButton.kycButton");
        frameLayout.setOnClickListener(new d(this));
    }

    private final void b(com.iqoption.core.util.b.a aVar) {
        m mVar = this.dCg;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mVar.cgJ;
        kotlin.jvm.internal.i.e(textView, "binding.kycGdprTitle");
        textView.setText(aVar.getText());
        this.dya = aVar;
        mVar = this.dCg;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.cgK.loadUrl(aVar.getUrl());
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

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        throw new IllegalStateException("Should not be called");
    }

    public ProfileStep aMb() {
        return this.dBC;
    }
}
