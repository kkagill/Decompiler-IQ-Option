package com.iqoption.feed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.util.v;
import com.iqoption.dto.ToastEntity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0003J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0017H\u0002J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/feed/FeedWebFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/feed/databinding/FeedWebBinding;", "item", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "getItem", "()Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "item$delegate", "Lkotlin/Lazy;", "lastActive", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "startUrl", "", "url", "kotlin.jvm.PlatformType", "getUrl", "()Ljava/lang/String;", "url$delegate", "viewModel", "Lcom/iqoption/feed/FeedWebViewModel;", "clearWebView", "", "close", "", "getClient", "Landroid/webkit/WebViewClient;", "initSuggest", "assetData", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "initWebView", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCloseSuggestBySwipe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateSubtitle", "Companion", "feed_release"})
/* compiled from: FeedWebFragment.kt */
public final class g extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(g.class), "url", "getUrl()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(g.class), "item", "getItem()Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;"))};
    public static final a cOT = new a();
    private final kotlin.d aTe = g.c(new FeedWebFragment$url$2(this));
    private HashMap apm;
    private String cOO;
    private com.iqoption.feed.a.g cOP;
    private com.iqoption.core.microservices.tradingengine.response.active.a cOQ;
    private final kotlin.d cOR = g.c(new FeedWebFragment$item$2(this));
    private h cOS;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, bng = {"Lcom/iqoption/feed/FeedWebFragment$Companion;", "", "()V", "ANIMATION_DELAY", "", "ANIMATION_DURATION", "ARG_URL", "", "ARG_WEB_BUTTON_ITEM", "SWIPE_THRESHOLD", "", "SWIPE_VELOCITY_THRESHOLD", "TAG", "getTAG", "()Ljava/lang/String;", "navigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "url", "item", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "feed_release"})
    /* compiled from: FeedWebFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return g.TAG;
        }

        public final com.iqoption.core.ui.d.c b(String str, com.iqoption.core.microservices.feed.response.a aVar) {
            String str2 = str;
            com.iqoption.core.microservices.feed.response.a aVar2 = aVar;
            kotlin.jvm.internal.i.f(str2, "url");
            kotlin.jvm.internal.i.f(aVar2, "item");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_URL", str2);
            bundle.putParcelable("ARG_WEB_BUTTON_ITEM", aVar2);
            return new com.iqoption.core.ui.d.c(Bx(), g.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"com/iqoption/feed/FeedWebFragment$getClient$1", "Landroid/webkit/WebViewClient;", "firstUrl", "", "firstUrlLoadingOnce", "", "shouldOverrideUrlLoading", "webView", "Landroid/webkit/WebView;", "url", "feed_release"})
    /* compiled from: FeedWebFragment.kt */
    public static final class b extends WebViewClient {
        private String cOU;
        private boolean cOV;
        final /* synthetic */ g this$0;

        b(g gVar) {
            this.this$0 = gVar;
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
                    this.this$0.avt();
                    return false;
                }
                this.cOV = true;
            }
            webView.loadUrl(str);
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: FeedWebFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ g this$0;

        c(g gVar) {
            this.this$0 = gVar;
        }

        public final void onClick(View view) {
            g.d(this.this$0).a(this.this$0.avo(), false, false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"})
    /* compiled from: FeedWebFragment.kt */
    static final class d implements OnTouchListener {
        final /* synthetic */ GestureDetectorCompat cOW;

        d(GestureDetectorCompat gestureDetectorCompat) {
            this.cOW = gestureDetectorCompat;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.cOW.onTouchEvent(motionEvent);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, bng = {"com/iqoption/feed/FeedWebFragment$initSuggest$gestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "feed_release"})
    /* compiled from: FeedWebFragment.kt */
    public static final class e extends SimpleOnGestureListener {
        final /* synthetic */ g this$0;

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        e(g gVar) {
            this.this$0 = gVar;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y;
            f = 0.0f;
            if (motionEvent != null) {
                try {
                    y = motionEvent.getY();
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
            y = 0.0f;
            if (motionEvent2 != null) {
                f = motionEvent2.getY();
            }
            f -= y;
            if (Math.abs(f) <= ((float) 50) || Math.abs(f2) <= ((float) 100) || f <= ((float) null)) {
                return false;
            }
            this.this$0.avs();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"com/iqoption/feed/FeedWebFragment$initWebView$1", "Landroid/webkit/WebChromeClient;", "customCallback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "customView", "Landroid/view/View;", "onHideCustomView", "", "onShowCustomView", "view", "callback", "feed_release"})
    /* compiled from: FeedWebFragment.kt */
    public static final class f extends WebChromeClient {
        private View OH;
        private CustomViewCallback cOX;
        final /* synthetic */ g this$0;

        f(g gVar) {
            this.this$0 = gVar;
        }

        public void onHideCustomView() {
            if (this.OH != null) {
                g.b(this.this$0).cPU.removeView(this.OH);
                View view = this.OH;
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
            g.b(this.this$0).cPU.addView(view);
            this.cOX = customViewCallback;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, bng = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "", "onDownloadStart"})
    /* compiled from: FeedWebFragment.kt */
    static final class g implements DownloadListener {
        final /* synthetic */ g this$0;

        g(g gVar) {
            this.this$0 = gVar;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Context q = com.iqoption.core.ext.a.q(this.this$0);
            kotlin.jvm.internal.i.e(str, "url");
            com.iqoption.core.util.b.d.a(q, str, null, null, 12, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "result", "Lcom/google/common/base/Optional;", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/feed/FeedWebFragment$onViewCreated$1$1"})
    /* compiled from: FeedWebFragment.kt */
    static final class h<T> implements Observer<Optional<com.iqoption.asset.mediators.a>> {
        final /* synthetic */ g this$0;

        h(g gVar) {
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<com.iqoption.asset.mediators.a> optional) {
            if (optional != null) {
                com.iqoption.asset.mediators.a aVar = (com.iqoption.asset.mediators.a) optional.pN();
                if (aVar != null) {
                    Object obj = this.this$0.cOQ == null ? 1 : null;
                    this.this$0.cOQ = aVar.Jt();
                    String str = "it";
                    g gVar;
                    if (obj != null) {
                        gVar = this.this$0;
                        kotlin.jvm.internal.i.e(aVar, str);
                        gVar.a(aVar);
                        this.this$0.b(aVar);
                        return;
                    }
                    gVar = this.this$0;
                    kotlin.jvm.internal.i.e(aVar, str);
                    gVar.b(aVar);
                }
            }
        }
    }

    private final com.iqoption.core.microservices.feed.response.a avo() {
        kotlin.d dVar = this.cOR;
        j jVar = anY[1];
        return (com.iqoption.core.microservices.feed.response.a) dVar.getValue();
    }

    private final String getUrl() {
        kotlin.d dVar = this.aTe;
        j jVar = anY[0];
        return (String) dVar.getValue();
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

    public static final /* synthetic */ h d(g gVar) {
        h hVar = gVar.cOS;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return hVar;
    }

    static {
        String name = g.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cOS = h.cOY.Y(this);
        h hVar = this.cOS;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        hVar.avv();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cOP = (com.iqoption.feed.a.g) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.feed.i.f.feed_web, null, false);
        com.iqoption.feed.a.g gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String url = getUrl();
        kotlin.jvm.internal.i.e(url, "url");
        this.cOO = url;
        avr();
        avp();
        com.iqoption.feed.a.g gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = gVar.Aa;
        String str = this.cOO;
        if (str == null) {
            kotlin.jvm.internal.i.lG("startUrl");
        }
        webView.loadUrl(str);
        com.iqoption.core.microservices.feed.response.c adN = avo().adN();
        if (adN != null) {
            h hVar = this.cOS;
            if (hVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            hVar.f(adN.Bs(), adN.getInstrumentType()).observe(this, new h(this));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void avp() {
        com.iqoption.feed.a.g gVar = this.cOP;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        WebView webView = gVar.Aa;
        String str2 = "binding.webView";
        kotlin.jvm.internal.i.e(webView, str2);
        webView.setWebViewClient(avq());
        gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        webView = gVar.Aa;
        kotlin.jvm.internal.i.e(webView, str2);
        webView.setWebChromeClient(new f(this));
        gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.Aa.setDownloadListener(new g(this));
        gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        webView = gVar.Aa;
        kotlin.jvm.internal.i.e(webView, str2);
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.i.e(settings, "settings");
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setCacheMode(2);
    }

    private final WebViewClient avq() {
        return new b(this);
    }

    private final void avr() {
        com.iqoption.feed.a.g gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        WebView webView = gVar.Aa;
        webView.clearCache(true);
        webView.clearFormData();
        webView.clearHistory();
        webView.clearMatches();
        webView.clearSslPreferences();
    }

    private final void a(com.iqoption.asset.mediators.a aVar) {
        com.iqoption.core.microservices.feed.response.c adN = avo().adN();
        if (adN != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a Jt = aVar.Jt();
            com.iqoption.feed.a.g gVar = this.cOP;
            String str = "binding";
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = gVar.cPY;
            kotlin.jvm.internal.i.e(textView, "binding.suggestTitle");
            textView.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(Jt));
            RequestCreator load = Picasso.with(com.iqoption.core.ext.a.q(this)).load(Jt.getImage());
            gVar = this.cOP;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            load.into(gVar.cPW);
            int action = adN.getAction();
            if (action == 0) {
                action = com.iqoption.feed.i.g.sell;
            } else if (action != 1) {
                action = com.iqoption.feed.i.g.trade;
            } else {
                action = com.iqoption.feed.i.g.buy;
            }
            com.iqoption.feed.a.g gVar2 = this.cOP;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView2 = gVar2.cPZ;
            kotlin.jvm.internal.i.e(textView2, "binding.tradeButton");
            textView2.setText(action);
            textView2.setOnClickListener(new c(this));
            GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(com.iqoption.core.ext.a.q(this), new e(this));
            gVar2 = this.cOP;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar2.cPV.setOnTouchListener(new d(gestureDetectorCompat));
            com.iqoption.feed.a.g gVar3 = this.cOP;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ConstraintLayout constraintLayout = gVar3.cPV;
            kotlin.jvm.internal.i.e(constraintLayout, "binding.suggestContainer");
            constraintLayout.setVisibility(0);
            gVar3 = this.cOP;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar3.cPV.animate().setStartDelay(ToastEntity.ERROR_TOAST_DURATION).translationY(0.0f).setDuration(300).setInterpolator(new OvershootInterpolator()).start();
        }
    }

    private final void b(com.iqoption.asset.mediators.a aVar) {
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = aVar.Jt();
        com.iqoption.core.microservices.f.a.a.a JS = aVar.JS();
        String str = "binding";
        String str2 = "binding.suggestSubtitle";
        if (JS != null) {
            com.iqoption.core.microservices.f.a.a.a.c ahz = JS.ahz();
            if (ahz != null && ahz.isValid()) {
                ahz = JS.ahw();
                if (ahz != null && ahz.isValid()) {
                    ahz = JS.ahz();
                    Double d = null;
                    Double ahD = ahz != null ? ahz.ahD() : null;
                    if (ahD == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    double doubleValue = ahD.doubleValue();
                    com.iqoption.core.microservices.f.a.a.a.c ahw = JS.ahw();
                    if (ahw != null) {
                        d = ahw.ahD();
                    }
                    if (d == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    double doubleValue2 = d.doubleValue();
                    double d2 = (double) 2;
                    Double.isNaN(d2);
                    String q = com.iqoption.core.util.e.q(doubleValue + (doubleValue2 / d2));
                    com.iqoption.feed.a.g gVar = this.cOP;
                    if (gVar == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    TextView textView = gVar.cPX;
                    kotlin.jvm.internal.i.e(textView, str2);
                    n nVar = n.eWf;
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.i.e(locale, "Locale.US");
                    Object[] objArr = new Object[]{com.iqoption.core.microservices.tradingengine.response.active.d.C(Jt), q};
                    String format = String.format(locale, "1%s = %s", Arrays.copyOf(objArr, objArr.length));
                    kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
                    textView.setText(format);
                    return;
                }
            }
        }
        com.iqoption.feed.a.g gVar2 = this.cOP;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView2 = gVar2.cPX;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setText(com.iqoption.core.microservices.tradingengine.response.active.d.C(Jt));
    }

    private final void avs() {
        com.iqoption.feed.a.g gVar = this.cOP;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        gVar.cPV.animate().setStartDelay(0).translationY((float) getResources().getDimensionPixelOffset(com.iqoption.feed.i.c.dp64)).setDuration(300).setInterpolator(new AccelerateInterpolator()).start();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        String str = "binding";
        if (akX()) {
            Context q = com.iqoption.core.ext.a.q(this);
            com.iqoption.feed.a.g gVar = this.cOP;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            v.a(q, (View) gVar.Aa);
            return true;
        }
        com.iqoption.feed.a.g gVar2 = this.cOP;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        if (gVar2.Aa.canGoBack()) {
            gVar2 = this.cOP;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            WebView webView = gVar2.Aa;
            kotlin.jvm.internal.i.e(webView, "binding.webView");
            String url = webView.getUrl();
            kotlin.jvm.internal.i.e(url, "binding.webView.url");
            String str2 = this.cOO;
            String str3 = "startUrl";
            if (str2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            if (!u.a(url, str2, false, 2, null)) {
                gVar2 = this.cOP;
                if (gVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                webView = gVar2.Aa;
                str = this.cOO;
                if (str == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                webView.loadUrl(str);
                return true;
            }
        }
        com.iqoption.core.d.EC().di("smart-feed_news-back");
        return avt();
    }

    private final boolean avt() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || fragmentManager.getBackStackEntryCount() <= 0) {
            return false;
        }
        fragmentManager.popBackStack();
        return true;
    }
}
