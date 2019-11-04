package com.iqoption.protrader.web;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.app.IQApp;
import com.iqoption.core.util.b.f;
import com.iqoption.e.mv;
import com.iqoption.e.zp;
import com.iqoption.util.ac;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\"\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020.H\u0016J\u001a\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001b\u00104\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\fH\u0002J\u0006\u00108\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006:"}, bng = {"Lcom/iqoption/protrader/web/ProTraderWebFragment;", "Lcom/iqoption/fragment/base/IQFragment;", "Lcom/iqoption/dialogs/DarkDialogFragment$OnDialogListener;", "()V", "binding", "Lcom/iqoption/databinding/FragmentProTraderWebBinding;", "fileCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileCallbackOldApi", "startUrl", "", "toolbar", "Lcom/iqoption/databinding/ToolbarBlackLayoutBinding;", "type", "Lcom/iqoption/protrader/web/ProTraderWebType;", "getType", "()Lcom/iqoption/protrader/web/ProTraderWebType;", "type$delegate", "Lkotlin/Lazy;", "addCookies", "", "applyAcceptedTypes", "intent", "Landroid/content/Intent;", "mimeTypes", "(Landroid/content/Intent;[Ljava/lang/String;)V", "dismissProgressDialog", "initToolbar", "initWebView", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "", "onConfirm", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogClose", "onSaveInstanceState", "outState", "onViewCreated", "view", "pickFile", "([Ljava/lang/String;)V", "shouldOpenInBrowser", "url", "showProgressDialog", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderWebFragment.kt */
public final class a extends com.iqoption.fragment.b.d implements com.iqoption.dialogs.b.b {
    private static final String TAG = a.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "type", "getType()Lcom/iqoption/protrader/web/ProTraderWebType;"))};
    private static final List<String> dQO = m.listOf("terms-and-conditions/investor-compensation-fund", "/traderoom");
    public static final a dQP = new a();
    private HashMap apm;
    private String cOO;
    private mv dQK;
    private zp dQL;
    private ValueCallback<Uri[]> dQM;
    private ValueCallback<Uri> dQN;
    private final kotlin.d dxA = g.c(new ProTraderWebFragment$type$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/protrader/web/ProTraderWebFragment$Companion;", "", "()V", "ARG_TYPE", "", "PATH_LIST_TO_OPEN_IN_BROWSER", "", "PATH_TERMS_AND_CONDITIONS", "PATH_TRADEROOM", "REQUEST_CODE_PICK_FILE", "", "TAG", "kotlin.jvm.PlatformType", "URL_PRO_TRADERS", "URL_PRO_TRADERS_STATUS", "URL_USER_VERIFICATION", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "containerId", "type", "Lcom/iqoption/protrader/web/ProTraderWebType;", "app_optionXRelease"})
    /* compiled from: ProTraderWebFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentManager fragmentManager, int i, ProTraderWebType proTraderWebType) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(proTraderWebType, "type");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_TYPE", proTraderWebType);
            aVar.setArguments(bundle);
            fragmentManager.beginTransaction().add(i, aVar, a.TAG).addToBackStack(a.TAG).commit();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderWebFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            com.iqoption.core.ext.a.r(this.this$0).onBackPressed();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"com/iqoption/protrader/web/ProTraderWebFragment$initWebView$1", "Landroid/webkit/WebViewClient;", "firstUrl", "", "firstUrlLoadingOnce", "", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "webView", "app_optionXRelease"})
    /* compiled from: ProTraderWebFragment.kt */
    public static final class c extends WebViewClient {
        private String cOU;
        private boolean cOV;
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            kotlin.jvm.internal.i.f(webView, "webView");
            kotlin.jvm.internal.i.f(str, "url");
            String str2 = this.cOU;
            if (str2 == null) {
                this.cOU = str;
            } else if (kotlin.jvm.internal.i.y(str, str2)) {
                if (this.cOV) {
                    webView.stopLoading();
                    return false;
                }
                this.cOV = true;
            }
            if (this.this$0.jE(str)) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    kotlin.jvm.internal.i.e(activity, "it");
                    com.iqoption.core.util.b.d.a((Context) activity, str, Integer.valueOf(268435456), null, 8, null);
                }
            } else {
                webView.loadUrl(str);
            }
            return true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            kotlin.jvm.internal.i.f(webView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(str, "url");
            this.this$0.zM();
        }

        public void onPageFinished(WebView webView, String str) {
            kotlin.jvm.internal.i.f(webView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(str, "url");
            this.this$0.azm();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J$\u0010\u0015\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"com/iqoption/protrader/web/ProTraderWebFragment$initWebView$2", "Landroid/webkit/WebChromeClient;", "customCallback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "customView", "Landroid/view/View;", "onHideCustomView", "", "onShowCustomView", "view", "callback", "onShowFileChooser", "", "webView", "Landroid/webkit/WebView;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "openFileChooser", "acceptType", "", "capture", "app_optionXRelease"})
    /* compiled from: ProTraderWebFragment.kt */
    public static final class d extends WebChromeClient {
        private View OH;
        private CustomViewCallback cOX;
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public void onHideCustomView() {
            View view = this.OH;
            if (view != null) {
                if (view == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                view.setVisibility(8);
                CustomViewCallback customViewCallback = this.cOX;
                if (customViewCallback == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                customViewCallback.onCustomViewHidden();
                this.cOX = (CustomViewCallback) null;
                this.OH = (View) null;
            }
        }

        public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(customViewCallback, "callback");
            if (this.OH == null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.OH = view;
            this.cOX = customViewCallback;
        }

        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            kotlin.jvm.internal.i.f(webView, "webView");
            kotlin.jvm.internal.i.f(valueCallback, "filePathCallback");
            kotlin.jvm.internal.i.f(fileChooserParams, "fileChooserParams");
            this.this$0.dQM = valueCallback;
            a aVar = this.this$0;
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            kotlin.jvm.internal.i.e(acceptTypes, "fileChooserParams.acceptTypes");
            aVar.d(acceptTypes);
            return true;
        }
    }

    private final ProTraderWebType aTc() {
        kotlin.d dVar = this.dxA;
        j jVar = anY[0];
        return (ProTraderWebType) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void LI() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQK = (mv) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_pro_trader_web, viewGroup, false, 4, null);
        mv mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mvVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Lb();
        int i = b.aob[aTc().ordinal()];
        if (i == 1) {
            str = "https://verify.iqoption.com/pro-traders?mobile=true";
        } else if (i == 2) {
            str = f.a(com.iqoption.core.ext.a.q(this), (int) R.string.pro_info_n1_n2, com.iqoption.core.d.EE().Vh());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.cOO = str;
        avp();
        atq();
        zM();
        mv mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = mvVar.cin;
        if (bundle == null) {
            String str2 = this.cOO;
            if (str2 == null) {
                kotlin.jvm.internal.i.lG("startUrl");
            }
            webView.loadUrl(str2);
        } else {
            webView.restoreState(bundle);
        }
        webView.setAlpha(0.0f);
        webView.animate().alpha(1.0f).setDuration(600).start();
    }

    private final void Lb() {
        int i = b.axg[aTc().ordinal()];
        if (i == 1) {
            i = R.string.application_to_pro;
        } else if (i == 2) {
            i = R.string.learn_more_about_pro;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mv mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        zp zpVar = mvVar.cil;
        kotlin.jvm.internal.i.e(zpVar, "binding.proToolbar");
        this.dQL = zpVar;
        zpVar = this.dQL;
        String str = "toolbar";
        if (zpVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        zpVar.alH.setText(i);
        zp zpVar2 = this.dQL;
        if (zpVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        zpVar2.cpc.setOnClickListener(new b(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        mv mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        mvVar.cin.saveState(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onBackPressed() {
        mv mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = mvVar.cin;
        kotlin.jvm.internal.i.e(webView, "binding.proWebView");
        String url = webView.getUrl();
        boolean z = false;
        if (akX()) {
            y.a((Context) getActivity(), (View) webView);
            z = true;
        } else if ((url == null || !u.a(url, "https://verify.iqoption.com/pro-traders/status/", false, 2, null)) && aTc() == ProTraderWebType.APPLY) {
            com.iqoption.dialogs.b.a aVar = com.iqoption.dialogs.b.cLe;
            FragmentManager u = com.iqoption.core.ext.a.u(this);
            CharSequence string = getString(R.string.confirm_back);
            String string2 = getString(R.string.you_have_not_finished_your_application);
            kotlin.jvm.internal.i.e(string2, "getString(R.string.you_h…inished_your_application)");
            aVar.a(u, R.id.proWebOther, string, string2, getString(R.string.cancel), getString(R.string.confirm));
            return true;
        }
        return z;
    }

    public void LJ() {
        com.iqoption.core.ext.a.r(this).finish();
    }

    private final void avp() {
        mv mvVar = this.dQK;
        String str = "binding";
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        WebView webView = mvVar.cin;
        String str2 = "binding.proWebView";
        kotlin.jvm.internal.i.e(webView, str2);
        webView.setWebViewClient(new c(this));
        mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        webView = mvVar.cin;
        kotlin.jvm.internal.i.e(webView, str2);
        webView.setWebChromeClient(new d(this));
        mvVar = this.dQK;
        if (mvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        webView = mvVar.cin;
        kotlin.jvm.internal.i.e(webView, str2);
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setCacheMode(2);
    }

    public final void zM() {
        zp zpVar = this.dQL;
        if (zpVar == null) {
            kotlin.jvm.internal.i.lG("toolbar");
        }
        ContentLoadingProgressBar contentLoadingProgressBar = zpVar.bfT;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "toolbar.toolbarProgress");
        contentLoadingProgressBar.setVisibility(0);
    }

    public final void azm() {
        zp zpVar = this.dQL;
        if (zpVar == null) {
            kotlin.jvm.internal.i.lG("toolbar");
        }
        ContentLoadingProgressBar contentLoadingProgressBar = zpVar.bfT;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "toolbar.toolbarProgress");
        contentLoadingProgressBar.setVisibility(8);
    }

    private final void atq() {
        CookieSyncManager.createInstance(getActivity());
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookie();
        instance.setAcceptCookie(true);
        ac.a(instance, IQApp.Ev().Vb());
        String str = this.cOO;
        if (str == null) {
            kotlin.jvm.internal.i.lG("startUrl");
        }
        ac.a(instance, str);
        ac.a(instance, "https://user-verification.iqoption.com/");
        CookieSyncManager.getInstance().sync();
    }

    private final void d(String[] strArr) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        a(intent, strArr);
        startActivityForResult(Intent.createChooser(intent, getString(R.string.select_image)), 100);
    }

    private final void a(Intent intent, String[] strArr) {
        if (strArr.length == 1) {
            intent.setType(strArr[0]);
            return;
        }
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1 && intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            ValueCallback valueCallback = this.dQM;
            if (valueCallback != null) {
                if (valueCallback == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                Uri[] uriArr = new Uri[1];
                kotlin.jvm.internal.i.e(data, "uri");
                uriArr[0] = data;
                valueCallback.onReceiveValue(uriArr);
                this.dQM = (ValueCallback) null;
            }
            valueCallback = this.dQN;
            if (valueCallback != null) {
                if (valueCallback == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                valueCallback.onReceiveValue(data);
                this.dQN = (ValueCallback) null;
            }
        }
    }

    private final boolean jE(String str) {
        Iterable<String> iterable = dQO;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (v.b((CharSequence) str, (CharSequence) b, false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
