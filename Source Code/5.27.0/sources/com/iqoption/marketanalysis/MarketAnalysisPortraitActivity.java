package com.iqoption.marketanalysis;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.feed.g;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0004\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\"\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0013H\u0014J\b\u0010\u001f\u001a\u00020\u0013H\u0014J\b\u0010 \u001a\u00020\u0013H\u0014J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "callbacks", "com/iqoption/marketanalysis/MarketAnalysisPortraitActivity$callbacks$1", "Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity$callbacks$1;", "feedDetails", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "getFeedDetails", "()Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "feedDetails$delegate", "Lkotlin/Lazy;", "router", "Lcom/iqoption/marketanalysis/MarketAnalysisRouter;", "showSplashRunnable", "Ljava/lang/Runnable;", "splash", "Lcom/iqoption/core/splash/SplashFragment;", "finish", "", "hideSplash", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onStop", "openDetailScreen", "calendarEvent", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "showFeedDetails", "details", "addToBackStack", "", "showSplash", "Companion", "OpenConnectionCallback", "app_optionXRelease"})
/* compiled from: MarketAnalysisPortraitActivity.kt */
public final class MarketAnalysisPortraitActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG = MarketAnalysisPortraitActivity.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(MarketAnalysisPortraitActivity.class), "feedDetails", "getFeedDetails()Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;"))};
    public static final a dFn = new a();
    private com.iqoption.core.splash.d ajo;
    private final Runnable cGy = new e(this);
    private e dFk;
    private final kotlin.d dFl = g.c(new MarketAnalysisPortraitActivity$feedDetails$2(this));
    private final c dFm = new c(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity$Companion;", "", "()V", "EXTRA_FEED_DETAILS", "", "TAG", "kotlin.jvm.PlatformType", "app_optionXRelease"})
    /* compiled from: MarketAnalysisPortraitActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: MarketAnalysisPortraitActivity.kt */
    static final class e implements Runnable {
        final /* synthetic */ MarketAnalysisPortraitActivity this$0;

        e(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity) {
            this.this$0 = marketAnalysisPortraitActivity;
        }

        public final void run() {
            this.this$0.Aq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/marketanalysis/MarketAnalysisPortraitActivity$callbacks$1", "Lcom/iqoption/marketanalysis/MarketAnalysisCallbacks;", "finishMA", "", "setResultMA", "resultCode", "", "intent", "Landroid/content/Intent;", "startActivityForResultMA", "requestCode", "app_optionXRelease"})
    /* compiled from: MarketAnalysisPortraitActivity.kt */
    public static final class c implements a {
        final /* synthetic */ MarketAnalysisPortraitActivity this$0;

        c(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity) {
            this.this$0 = marketAnalysisPortraitActivity;
        }

        public void b(Intent intent, int i) {
            kotlin.jvm.internal.i.f(intent, "intent");
            this.this$0.startActivityForResult(intent, i);
        }

        public void e(int i, Intent intent) {
            kotlin.jvm.internal.i.f(intent, "intent");
            this.this$0.setResult(i, intent);
        }

        public void Av() {
            this.this$0.finish();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, bng = {"com/iqoption/marketanalysis/MarketAnalysisPortraitActivity$onCreate$1", "Lcom/iqoption/marketanalysis/MarketAnalysisRouter;", "openFeedDetails", "", "feed", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "openForexDetails", "event", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "app_optionXRelease"})
    /* compiled from: MarketAnalysisPortraitActivity.kt */
    public static final class d extends e {
        final /* synthetic */ MarketAnalysisPortraitActivity dFo;
        final /* synthetic */ MarketAnalysisPortraitActivity this$0;

        d(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity, MarketAnalysisPortraitActivity marketAnalysisPortraitActivity2, FragmentActivity fragmentActivity, a aVar) {
            this.this$0 = marketAnalysisPortraitActivity;
            this.dFo = marketAnalysisPortraitActivity2;
            super(fragmentActivity, aVar);
        }

        public void b(com.iqoption.core.marketanalysis.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "feed");
            this.this$0.a(cVar, true);
        }

        public void h(com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "event");
            this.this$0.g(aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity$OpenConnectionCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity;", "", "activity", "(Lcom/iqoption/marketanalysis/MarketAnalysisPortraitActivity;)V", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: MarketAnalysisPortraitActivity.kt */
    private static final class b extends com.iqoption.system.c.b<MarketAnalysisPortraitActivity, Object> {
        public b(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity) {
            kotlin.jvm.internal.i.f(marketAnalysisPortraitActivity, "activity");
            super(marketAnalysisPortraitActivity, Object.class);
        }

        /* renamed from: a */
        public void v(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity, Object obj) {
            kotlin.jvm.internal.i.f(marketAnalysisPortraitActivity, "activity");
            com.iqoption.core.c.a.biN.removeCallbacks(marketAnalysisPortraitActivity.cGy);
            marketAnalysisPortraitActivity.Ar();
        }

        /* renamed from: a */
        public void c(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity, Throwable th) {
            kotlin.jvm.internal.i.f(marketAnalysisPortraitActivity, "activity");
            kotlin.jvm.internal.i.f(th, "t");
            com.iqoption.core.c.a.biN.removeCallbacks(marketAnalysisPortraitActivity.cGy);
            marketAnalysisPortraitActivity.Ar();
        }
    }

    private final com.iqoption.core.marketanalysis.c aNK() {
        kotlin.d dVar = this.dFl;
        j jVar = anY[0];
        return (com.iqoption.core.marketanalysis.c) dVar.getValue();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MarketAnalysisPortraitActivity marketAnalysisPortraitActivity = this;
        this.dFk = new d(this, marketAnalysisPortraitActivity, marketAnalysisPortraitActivity, this.dFm);
        setContentView((int) R.layout.feed_portrait_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.iqoption.core.splash.d.a aVar = com.iqoption.core.splash.d.bGp;
        kotlin.jvm.internal.i.e(supportFragmentManager, "fm");
        this.ajo = aVar.a(supportFragmentManager, R.id.splashContainer, false);
        if (bundle == null) {
            com.iqoption.core.marketanalysis.c aNK = aNK();
            if (aNK != null) {
                a(aNK, false);
            } else if (supportFragmentManager.findFragmentByTag(b.dFj.Bx()) == null) {
                supportFragmentManager.beginTransaction().add(R.id.content, b.dFj.eU(true), b.dFj.Bx()).commitNowAllowingStateLoss();
            }
        }
    }

    private final void a(com.iqoption.core.marketanalysis.c cVar, boolean z) {
        com.iqoption.core.ui.d.c b = g.cOT.b(cVar.YP(), cVar.YQ());
        FragmentTransaction add = getSupportFragmentManager().beginTransaction().add(R.id.content, b.bh(this), b.getName());
        kotlin.jvm.internal.i.e(add, "supportFragmentManager.b…is), navigatorEntry.name)");
        if (z) {
            add.addToBackStack(b.getName());
        }
        add.commitAllowingStateLoss();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e eVar = this.dFk;
        if (eVar != null) {
            eVar.b(i, i2, intent);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        t cj = WebSocketHandler.aTn().cj(TAG);
        com.iqoption.core.c.a.biN.postDelayed(this.cGy, 1000);
        v.a(cj, (o) new b(this));
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onStop();
    }

    public void finish() {
        e eVar = this.dFk;
        if (eVar != null) {
            eVar.aNN();
        }
        super.finish();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onDestroy();
    }

    public final void Aq() {
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.show();
    }

    public final void Ar() {
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.hide();
    }

    private final void g(com.iqoption.core.microservices.b.a.a aVar) {
        getSupportFragmentManager().beginTransaction().add(R.id.content, com.iqoption.forexcalendar.detail.a.cTp.e(aVar), com.iqoption.forexcalendar.detail.a.cTp.Bx()).addToBackStack(com.iqoption.forexcalendar.detail.a.cTp.Bx()).commitAllowingStateLoss();
    }
}
