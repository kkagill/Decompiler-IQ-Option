package com.iqoption.kyc.questionnaire.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.d;
import com.iqoption.kyc.b.as;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0014J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/kyc/questionnaire/risks/KycRisksFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycRisksBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "viewModel", "Lcom/iqoption/kyc/questionnaire/risks/KycRisksViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showBottomBar", "showProgress", "show", "Companion", "kyc_release"})
/* compiled from: KycRisksFragment.kt */
public final class a extends com.iqoption.kyc.b {
    private static final String TAG = a.class.getName();
    public static final a dDn = new a();
    private HashMap apm;
    private as dDl;
    private b dDm;
    private final String dtM = "TradingExperience";
    private final String dtN = "RiskDisclosure";
    private final boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/kyc/questionnaire/risks/KycRisksFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycRisksFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c aLM() {
            String Bw = a.TAG;
            kotlin.jvm.internal.i.e(Bw, "TAG");
            return new com.iqoption.core.ui.d.c(Bw, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/kyc/questionnaire/risks/KycRisksFragment$onViewCreated$1$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "kyc_release"})
    /* compiled from: KycRisksFragment.kt */
    public static final class b extends WebViewClient {
        final /* synthetic */ WebView dDo;

        b(WebView webView) {
            this.dDo = webView;
        }

        public void onPageFinished(WebView webView, String str) {
            kotlin.jvm.internal.i.f(webView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(str, "url");
            this.dDo.setBackgroundColor(0);
            this.dDo.setLayerType(1, null);
            this.dDo.loadUrl("javascript:document.body.style.setProperty(\"color\", \"white\");");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "Lcom/iqoption/kyc/questionnaire/risks/RiskDisclosure;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycRisksFragment.kt */
    static final class c<T> implements Observer<Optional<c>> {
        final /* synthetic */ a dDp;

        c(a aVar) {
            this.dDp = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<c> optional) {
            this.dDp.ev(false);
            c cVar = optional != null ? (c) optional.pN() : null;
            if (cVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<html><head><style type=\"text/css\">body{color: rgb(255,255,255); background-color: rgba(0,0,0,0);} ol li { list-style-type: none; }</style></head><body>");
                stringBuilder.append(cVar.getText());
                stringBuilder.append("</body></html>");
                a.a(this.dDp).dvN.loadData(stringBuilder.toString(), "text/html; charset=utf-8", null);
                return;
            }
            d.a(f.unknown_error_occurred, 0, 2, null);
        }
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

    public static final /* synthetic */ as a(a aVar) {
        as asVar = aVar.dDl;
        if (asVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return asVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dDm = b.dDq.aN(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dDl = (as) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_risks, viewGroup, false, 4, null);
        as asVar = this.dDl;
        if (asVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return asVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        as asVar = this.dDl;
        if (asVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = asVar.dvN;
        webView.setBackgroundColor(0);
        webView.setLayerType(1, null);
        webView.setWebViewClient(new b(webView));
        ev(true);
        b bVar = this.dDm;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aMB().observe(this, new c(this));
    }

    private final void ev(boolean z) {
        as asVar = this.dDl;
        if (asVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ContentLoadingProgressBar contentLoadingProgressBar = asVar.dvM;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.kycRisksProgress");
        contentLoadingProgressBar.setVisibility(z ? 0 : 8);
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
