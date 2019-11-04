package com.iqoption.deposit.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.util.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import okhttp3.HttpUrl;

@i(bne = {1, 1, 15}, bnf = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001'\b&\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u0012\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020*H\u0016J\b\u00101\u001a\u00020*H\u0016J\b\u00102\u001a\u00020*H\u0016J\u001a\u00103\u001a\u00020*2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000205H$J\u0012\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010$\u001a\u00020%H$R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00158BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u001b*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R#\u0010!\u001a\n \u001b*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u001dR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006="}, bng = {"Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "getDepositParams", "()Lcom/iqoption/deposit/DepositParams;", "depositParams$delegate", "Lkotlin/Lazy;", "isFiltered", "", "isPost", "()Z", "isPost$delegate", "listener", "Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$OnFragmentInteractionListener;", "getListener", "()Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$OnFragmentInteractionListener;", "pageLoadedEventHelper", "Lcom/iqoption/deposit/web/BillingPaymentPageLoadedEventHelper;", "redirectParams", "Ljava/util/HashMap;", "", "getRedirectParams", "()Ljava/util/HashMap;", "redirectParams$delegate", "redirectUrl", "kotlin.jvm.PlatformType", "getRedirectUrl", "()Ljava/lang/String;", "redirectUrl$delegate", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "session", "getSession", "session$delegate", "webView", "Landroid/webkit/WebView;", "webViewClient", "com/iqoption/deposit/web/BaseRedirectWebPaymentFragment$webViewClient$1", "Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$webViewClient$1;", "addCookies", "", "loadRedirectPageGet", "loadRedirectPagePost", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onDestroy", "onDestroyView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "toolbarClose", "tryHandleUrlManually", "urlRaw", "Companion", "OnFragmentInteractionListener", "deposit_release"})
/* compiled from: BaseRedirectWebPaymentFragment.kt */
public abstract class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "redirectUrl", "getRedirectUrl()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "redirectParams", "getRedirectParams()Ljava/util/HashMap;")), k.a(new PropertyReference1Impl(k.G(a.class), "isPost", "isPost()Z")), k.a(new PropertyReference1Impl(k.G(a.class), "depositParams", "getDepositParams()Lcom/iqoption/deposit/DepositParams;")), k.a(new PropertyReference1Impl(k.G(a.class), "session", "getSession()Ljava/lang/String;"))};
    public static final a cGO = new a();
    private WebView Aa;
    private HashMap apm;
    private final kotlin.d cAn = g.c(new BaseRedirectWebPaymentFragment$depositParams$2(this));
    private final kotlin.d cGH = g.c(new BaseRedirectWebPaymentFragment$redirectUrl$2(this));
    private final kotlin.d cGI = g.c(new BaseRedirectWebPaymentFragment$redirectParams$2(this));
    private final kotlin.d cGJ = g.c(new BaseRedirectWebPaymentFragment$isPost$2(this));
    private final kotlin.d cGK = g.c(new BaseRedirectWebPaymentFragment$session$2(this));
    private boolean cGL;
    private final b cGM = new b();
    private final d cGN = new d(this);
    private com.iqoption.core.analytics.c czd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, bng = {"Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$Companion;", "", "()V", "ARG_DEPOSIT_PARAMS", "", "ARG_REDIRECT_METHOD_IS_POST", "ARG_REDIRECT_PARAMS", "ARG_REDIRECT_URL", "ARG_SESSION", "BITCOIN_SCHEME", "FAILED_URL", "HOLD_URL", "REDIRECT_FAILED", "REDIRECT_HOLD", "REDIRECT_SUCCESSED", "START_AGAIN_URL", "SUCCESS_URL", "TAG", "getTAG", "()Ljava/lang/String;", "deposit_release"})
    /* compiled from: BaseRedirectWebPaymentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$OnFragmentInteractionListener;", "", "onDepositPageWebPaymentHold", "", "onDepositPageWebPaymentResult", "isSuccess", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "session", "", "onDepositPageWebPaymentStartAgain", "deposit_release"})
    /* compiled from: BaseRedirectWebPaymentFragment.kt */
    public interface b {
        void asX();

        void asY();

        void b(boolean z, com.iqoption.deposit.i iVar, String str);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BaseRedirectWebPaymentFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            com.iqoption.deposit.navigator.b.cGp.P(this.this$0).alG();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, bng = {"com/iqoption/deposit/web/BaseRedirectWebPaymentFragment$webViewClient$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "deposit_release"})
    /* compiled from: BaseRedirectWebPaymentFragment.kt */
    public static final class d extends WebViewClient {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            kotlin.jvm.internal.i.f(webView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(str, "url");
            b a = this.this$0.atn();
            if (!(a == null || this.this$0.cGL)) {
                Uri parse = Uri.parse(str);
                kotlin.jvm.internal.i.e(parse, "Uri.parse(url)");
                String path = parse.getPath();
                if (path == null) {
                    path = str;
                }
                CharSequence charSequence = path;
                if (v.b(charSequence, (CharSequence) "page/payment/success", false, 2, null) || v.b(charSequence, (CharSequence) "redirect/success", false, 2, null)) {
                    this.this$0.cGL = true;
                    a.b(true, this.this$0.aqY(), this.this$0.Zx());
                } else if (v.b(charSequence, (CharSequence) "page/payment/failed", false, 2, null) || v.b(charSequence, (CharSequence) "redirect/failed", false, 2, null)) {
                    this.this$0.cGL = true;
                    a.b(false, this.this$0.aqY(), this.this$0.Zx());
                } else if (v.b(charSequence, (CharSequence) "page/payment/new", false, 2, null)) {
                    this.this$0.cGL = true;
                    a.asX();
                } else if (v.b(charSequence, (CharSequence) "page/payment/hold", false, 2, null) || v.b(charSequence, (CharSequence) "redirect/hold", false, 2, null)) {
                    this.this$0.cGL = true;
                    a.asY();
                } else {
                    this.this$0.cGM.hO(str);
                }
            }
            super.onPageStarted(webView, str, bitmap);
        }

        /* JADX WARNING: Missing block: B:8:0x0029, code skipped:
            if (r1 != null) goto L_0x002e;
     */
        public void onReceivedError(android.webkit.WebView r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceError r5) {
            /*
            r2 = this;
            r0 = "view";
            kotlin.jvm.internal.i.f(r3, r0);
            r0 = "error";
            kotlin.jvm.internal.i.f(r5, r0);
            r0 = android.os.Build.VERSION.SDK_INT;
            r1 = 21;
            if (r0 < r1) goto L_0x0031;
        L_0x0011:
            if (r4 == 0) goto L_0x0031;
        L_0x0013:
            r0 = r4.getUrl();
            if (r0 == 0) goto L_0x0031;
        L_0x0019:
            r0 = r2.this$0;
            r0 = r0.cGM;
            r1 = r4.getUrl();
            if (r1 == 0) goto L_0x002c;
        L_0x0025:
            r1 = r1.toString();
            if (r1 == 0) goto L_0x002c;
        L_0x002b:
            goto L_0x002e;
        L_0x002c:
            r1 = "";
        L_0x002e:
            r0.hQ(r1);
        L_0x0031:
            super.onReceivedError(r3, r4, r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.web.a$d.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.this$0.hN(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public void onPageFinished(WebView webView, String str) {
            kotlin.jvm.internal.i.f(webView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(str, "url");
            this.this$0.cGM.hP(str);
            super.onPageFinished(webView, str);
        }
    }

    private final String Zx() {
        kotlin.d dVar = this.cGK;
        j jVar = anY[4];
        return (String) dVar.getValue();
    }

    private final com.iqoption.deposit.i aqY() {
        kotlin.d dVar = this.cAn;
        j jVar = anY[3];
        return (com.iqoption.deposit.i) dVar.getValue();
    }

    private final HashMap<String, String> atl() {
        kotlin.d dVar = this.cGI;
        j jVar = anY[1];
        return (HashMap) dVar.getValue();
    }

    private final boolean atm() {
        kotlin.d dVar = this.cGJ;
        j jVar = anY[2];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final String gG() {
        kotlin.d dVar = this.cGH;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract View asP();

    public abstract WebView asQ();

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private final b atn() {
        if (getContext() instanceof b) {
            return (b) getContext();
        }
        if (getTargetFragment() instanceof b) {
            return (b) getTargetFragment();
        }
        return getParentFragment() instanceof b ? (b) getParentFragment() : null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        WebView asQ = asQ();
        this.Aa = asQ;
        asQ.setWebViewClient(this.cGN);
        WebSettings settings = asQ.getSettings();
        kotlin.jvm.internal.i.e(settings, "settings");
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        atq();
        if (atm()) {
            ato();
        } else {
            atp();
        }
        asP().setOnClickListener(new c(this));
        this.czd = com.iqoption.core.d.Um().EC().h("deposit-gate", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
    }

    public void onResume() {
        super.onResume();
        v.j(getActivity());
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.czd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    public void onDestroy() {
        this.cGM.atr();
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        WebView webView = this.Aa;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        webView.goBack();
        return true;
    }

    private final void ato() {
        Builder buildUpon = Uri.parse(gG()).buildUpon();
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = atl().entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.i.e(next, "iterator.next()");
            Entry entry = (Entry) next;
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append((String) entry.getValue());
            if (it.hasNext()) {
                stringBuilder.append('&');
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "postDataBuilder.toString()");
        byte[] decode = Base64.decode(stringBuilder2, 0);
        String uri = buildUpon.build().toString();
        kotlin.jvm.internal.i.e(uri, "uriBuilder.build().toString()");
        asQ().postUrl(uri, decode);
    }

    private final void atp() {
        Builder buildUpon = Uri.parse(gG()).buildUpon();
        for (Entry entry : atl().entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        kotlin.jvm.internal.i.e(uri, "uriBuilder.build().toString()");
        asQ().loadUrl(uri);
    }

    private final void atq() {
        CookieSyncManager.createInstance(getActivity());
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookie();
        instance.setAcceptCookie(true);
        if (!TextUtils.isEmpty(gG())) {
            HttpUrl parse = HttpUrl.parse(gG());
            if (parse == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String host = parse.host();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lang=");
            stringBuilder.append(com.iqoption.core.d.getLocale());
            instance.setCookie(host, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("platform=");
            stringBuilder.append(com.iqoption.core.d.Un().Dx());
            instance.setCookie(host, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("ssid=");
            stringBuilder.append(com.iqoption.core.connect.http.c.baF.UL());
            instance.setCookie(host, stringBuilder.toString());
        }
        CookieSyncManager.getInstance().sync();
    }

    private final boolean hN(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if ((kotlin.jvm.internal.i.y(parse.getScheme(), "bitcoin") ^ 1) == 0) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        kotlin.jvm.internal.i.e(activity, "it");
                        com.iqoption.core.util.b.d.a((Context) activity, parse, Integer.valueOf(268435456), null, 8, null);
                    }
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
