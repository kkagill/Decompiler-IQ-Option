package com.iqoption.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.deposit.web.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.fragment.b.d;
import com.iqoption.mobbtech.connect.response.a.a;
import com.iqoption.util.ac;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: WebFragment */
public class aj extends d {
    protected WebView Aa;
    private ProgressBar bYs;
    private final b cGM = new b();
    protected String cOO;
    private boolean cYA;
    private Builder cYB;
    private Builder cYC;
    private Builder cYD;
    private boolean cYq;
    private boolean cYr;
    private boolean cYs;
    private boolean cYt;
    private boolean cYu;
    private ViewGroup cYv;
    protected View cYw;
    protected View cYx;
    protected View cYy;
    private boolean cYz;

    public static aj O(Bundle bundle) {
        aj ajVar = new aj();
        ajVar.setArguments(bundle);
        return ajVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.web_fragment, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cOO = getArguments().getString("EXTRA_URL", "");
        this.cYq = getArguments().getBoolean("EXTRA_IS_NEW_BILLING", false);
        this.cYr = getArguments().getBoolean("EXTRA_IS_DEPOSIT", false);
        this.cYt = getArguments().getBoolean("EXTRA_IS_WITHDRAWAL", false);
        boolean z = getArguments().getBoolean("EXTRA_IS_POST", false);
        bi(view);
        zM();
        String Vb = IQApp.Ev().Vb();
        if (this.cYq) {
            azh();
        } else if (this.cYt) {
            azi();
        } else {
            String str = this.cOO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Vb);
            stringBuilder.append("mobile/education/");
            if (str.startsWith(stringBuilder.toString())) {
                azj();
            } else if (this.cOO.equalsIgnoreCase("https://otn.org/?aff=6&afftrack=android_app")) {
                this.cYB = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "otn_otn-info-web-page");
                this.cYC = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_otn-info-web-page-return");
            }
        }
        if (z) {
            this.Aa.postUrl(this.cOO, getArguments().getByteArray("EXTRA_POST_BYTE_ARRAY"));
        } else {
            this.Aa.loadUrl(this.cOO);
        }
        this.Aa.setAlpha(0.0f);
        this.Aa.animate().alpha(1.0f).setDuration(600).start();
    }

    public void onDestroy() {
        if (this.cYr) {
            this.cGM.atr();
        }
        azl();
        super.onDestroy();
    }

    private void azh() {
        this.cYD = Event.Builder(Event.CATEGORY_SYSTEM, "billing_page-loaded");
        this.cYB = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "deposit");
        this.cYC = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deposit_back");
        k.f(getContext(), 512);
        this.cYx.setVisibility(8);
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Personal data");
        String str = "&cid";
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get(str))).build());
        aO.send(((EventBuilder) ((EventBuilder) new EventBuilder().setCustomMetric(1, (float) com.iqoption.app.b.aK(getContext()).getUserId())).setCategory("Android").setAction("Billing_Metrics").setLabel("BilingPage_Loading").setCustomDimension(2, aO.get(str))).build());
    }

    private void azi() {
        this.cYB = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "withdrawal");
        this.cYC = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "withdrawal_back");
        k.f(getContext(), 1024);
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Withdrawal page");
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get("&cid"))).build());
    }

    private void azj() {
        this.cYB = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "education");
        this.cYC = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "education_back");
        k.f(getContext(), 2048);
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Education");
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get("&cid"))).build());
    }

    private void bi(View view) {
        ((TextView) view.findViewById(R.id.title)).setText(getArguments().getString("EXTRA_TITLE"));
        this.Aa = (WebView) view.findViewById(R.id.fragmentWeb);
        this.bYs = (ProgressBar) view.findViewById(R.id.toolbarProgress);
        this.cYv = (ViewGroup) view.findViewById(R.id.mainContent);
        this.cYy = view.findViewById(R.id.titleContainer);
        avr();
        avp();
        atq();
        bm(view);
    }

    private void bm(View view) {
        view.findViewById(R.id.backButton).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (aj.this.getArguments().getBoolean("EXTRA_ACTIVITY_BACK_PRESSED", false)) {
                    aj.this.getActivity().onBackPressed();
                } else if (aj.this.getFragmentManager().getBackStackEntryCount() > 0) {
                    aj.this.onBackPressed();
                } else {
                    aj.this.azk();
                }
            }
        });
        this.cYw = view.findViewById(R.id.backButton2);
        this.cYw.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (aj.this.akX()) {
                    y.a(aj.this.getActivity(), aj.this.Aa);
                } else {
                    aj.this.Aa.loadUrl(aj.this.cOO);
                }
            }
        });
        this.cYx = view.findViewById(R.id.closeButton);
        this.cYx.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (aj.this.akX()) {
                    y.a(aj.this.getActivity(), aj.this.Aa);
                } else {
                    aj.this.azk();
                }
            }
        });
    }

    private void azk() {
        if (!super.onBackPressed()) {
            if (akX()) {
                y.a(getActivity(), this.Aa);
            }
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                fragmentManager = getActivity().getSupportFragmentManager();
            }
            if (fragmentManager.findFragmentByTag("WebFragment") != null) {
                fragmentManager.popBackStack();
            }
            if (getTradeRoomActivity() != null) {
                getTradeRoomActivity().Af();
            }
            if (this.cYq) {
                Tracker aO = IQApp.aO(getActivity());
                String str = "&cid";
                String str2 = "Billing_Metrics";
                String str3 = "Android";
                if (this.cYz) {
                    aO.send(((EventBuilder) ((EventBuilder) new EventBuilder().setCustomMetric(1, (float) com.iqoption.app.b.aK(getContext()).getUserId())).setCategory(str3).setAction(str2).setLabel("BilingPageIsLoaded").setCustomDimension(2, aO.get(str))).build());
                }
                if (this.cYA) {
                    aO.send(((EventBuilder) ((EventBuilder) new EventBuilder().setCustomMetric(1, (float) com.iqoption.app.b.aK(getContext()).getUserId())).setCategory(str3).setAction(str2).setLabel("GatePage_Loaded").setCustomDimension(2, aO.get(str))).build());
                }
            }
            if (this.cYB != null) {
                EventManager.BS().a(this.cYB.calcDuration().build());
            }
            azl();
        }
    }

    private void azl() {
        if (!this.cYu && this.cYt && this.cOO.contains("frontend/mobile/withdrawal/?sess_id=")) {
            IQApp.Ex().bd(new a());
            this.cYu = true;
        }
    }

    public boolean onBackPressed() {
        if (!isAdded()) {
            return false;
        }
        if (akX()) {
            y.a(getActivity(), this.Aa);
            return true;
        }
        if (this.cOO != null) {
            WebView webView = this.Aa;
            if (!(webView == null || webView.getUrl() == null)) {
                if (!this.Aa.canGoBack() || this.Aa.getUrl().startsWith(this.cOO)) {
                    azk();
                } else {
                    this.Aa.loadUrl(this.cOO);
                    if (this.cYC != null) {
                        EventManager.BS().a(this.cYC.build());
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void avp() {
        this.Aa.setWebViewClient(avq());
        this.Aa.setWebChromeClient(new WebChromeClient() {
            private View OH;
            private CustomViewCallback cOX;

            public void onHideCustomView() {
                if (this.OH != null) {
                    aj.this.cYv.removeView(this.OH);
                    this.OH.setVisibility(8);
                    this.cOX.onCustomViewHidden();
                    this.cOX = null;
                    this.OH = null;
                }
            }

            public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
                if (this.OH == null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                this.OH = view;
                aj.this.cYv.addView(view);
                this.cOX = customViewCallback;
            }
        });
        this.Aa.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (aj.this.isAdded()) {
                    Context activity = aj.this.getActivity();
                    if (activity != null) {
                        com.iqoption.core.util.b.d.a(activity, str, null, null);
                    }
                }
            }
        });
        WebSettings settings = this.Aa.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setCacheMode(2);
    }

    private WebViewClient avq() {
        return new WebViewClient() {
            private String cOU = null;
            private boolean cOV = false;

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.contains("/traderoom")) {
                    aj.this.azk();
                    webView.stopLoading();
                    return true;
                }
                String str2 = this.cOU;
                if (str2 == null) {
                    this.cOU = str;
                } else if (str.equals(str2)) {
                    if (this.cOV) {
                        aj.this.azk();
                        webView.stopLoading();
                        return false;
                    }
                    this.cOV = true;
                }
                webView.loadUrl(str);
                return true;
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (aj.this.cYr) {
                    aj.this.cGM.hO(str);
                }
                if (aj.this.cYs) {
                    if (str.contains("external/counting/mobile") || str.contains("page/cashbox/mobile") || str.contains("page/payment/success") || str.contains("page/payment/failed")) {
                        aj.this.cYw.setVisibility(8);
                    } else {
                        aj.this.cYw.setVisibility(0);
                    }
                }
                if (str.contains("cabinet/counting/success")) {
                    com.iqoption.app.a.b.b(aj.this.getString(R.string.payment_successfull), aj.this.getActivity());
                    aj.this.Aa.stopLoading();
                    aj.this.onBackPressed();
                } else if (str.contains("cabinet/counting/failed")) {
                    com.iqoption.app.a.b.b(aj.this.getString(R.string.payment_unsuccessfull), aj.this.getActivity());
                    aj.this.onBackPressed();
                    aj.this.Aa.stopLoading();
                } else if (str.contains("/traderoom")) {
                    aj.this.Aa.stopLoading();
                    aj.this.azk();
                } else {
                    aj.this.zM();
                }
            }

            public void onPageFinished(WebView webView, String str) {
                if (str.equals(aj.this.cOO)) {
                    aj.this.cYz = true;
                } else {
                    aj.this.cYA = true;
                }
                aj.this.azm();
                if (aj.this.cYr) {
                    aj.this.cGM.hP(str);
                }
                if (aj.this.cYD != null) {
                    EventManager.BS().a(aj.this.cYD.calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                aj.this.azm();
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (aj.this.cYr && VERSION.SDK_INT >= 21 && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    aj.this.cGM.hQ(webResourceRequest.getUrl().toString());
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        };
    }

    public void zM() {
        this.bYs.setVisibility(0);
    }

    public void azm() {
        this.bYs.setVisibility(8);
    }

    private void atq() {
        CookieSyncManager.createInstance(getActivity());
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookie();
        instance.setAcceptCookie(true);
        ac.a(instance, IQApp.Ev().Vb());
        ac.a(instance, this.cOO);
        CookieSyncManager.getInstance().sync();
    }

    /* Access modifiers changed, original: protected */
    public void avr() {
        this.Aa.clearCache(true);
        this.Aa.clearFormData();
        this.Aa.clearHistory();
        this.Aa.clearMatches();
        this.Aa.clearSslPreferences();
    }
}
