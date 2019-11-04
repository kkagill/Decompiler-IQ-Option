package com.iqoption.marketanalysis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.core.ext.g;
import com.iqoption.core.marketanalysis.MarketAnalysisTab;
import com.iqoption.e.lo;
import com.iqoption.forexcalendar.h;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010#\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006("}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentMarketAnalysisBinding;", "childOpenedEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "isMacro", "", "()Z", "isMacro$delegate", "Lkotlin/Lazy;", "screenOpenedEvent", "viewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "back", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "reportBack", "reportChildScreenOpened", "newTab", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "Companion", "app_optionXRelease"})
/* compiled from: MarketAnalysisFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "isMacro", "isMacro()Z"))};
    private static final List<MarketAnalysisTab> dFi = m.listOf(MarketAnalysisTab.NEWS, MarketAnalysisTab.FOREX, MarketAnalysisTab.EARNINGS);
    public static final a dFj = new a();
    private com.iqoption.core.analytics.c ajY;
    private HashMap apm;
    private com.iqoption.core.marketanalysis.f dFe;
    private lo dFf;
    private final kotlin.d dFg = g.c(new MarketAnalysisFragment$isMacro$2(this));
    private com.iqoption.core.analytics.c dFh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisFragment$Companion;", "", "()V", "ARG_IS_MACRO", "", "TABS", "", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/marketanalysis/MarketAnalysisFragment;", "isMacro", "", "app_optionXRelease"})
    /* compiled from: MarketAnalysisFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final b eU(boolean z) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_MACRO", z);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/marketanalysis/MarketAnalysisFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ b this$0;

        public b(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.awK();
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/marketanalysis/MarketAnalysisFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ b this$0;

        public c(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
        public void M(android.view.View r2) {
            /*
            r1 = this;
            r0 = "v";
            kotlin.jvm.internal.i.f(r2, r0);
            r2 = r1.this$0;
            r2 = com.iqoption.marketanalysis.b.b(r2);
            r2.YY();
            r2 = r1.this$0;
            r2 = com.iqoption.marketanalysis.b.b(r2);
            r2 = r2.YW();
            r2 = r2.getValue();
            r2 = (com.iqoption.core.marketanalysis.MarketAnalysisTab) r2;
            if (r2 != 0) goto L_0x0021;
        L_0x0020:
            goto L_0x002f;
        L_0x0021:
            r0 = com.iqoption.marketanalysis.c.aob;
            r2 = r2.ordinal();
            r2 = r0[r2];
            r0 = 1;
            if (r2 == r0) goto L_0x0034;
        L_0x002c:
            r0 = 2;
            if (r2 == r0) goto L_0x0031;
        L_0x002f:
            r2 = 0;
            goto L_0x0036;
        L_0x0031:
            r2 = "earnings-calendar_extend";
            goto L_0x0036;
        L_0x0034:
            r2 = "economic-calendar_extend";
        L_0x0036:
            if (r2 == 0) goto L_0x003f;
        L_0x0038:
            r0 = com.iqoption.core.d.EC();
            r0.di(r2);
        L_0x003f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.marketanalysis.b$c.M(android.view.View):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, bng = {"com/iqoption/marketanalysis/MarketAnalysisFragment$onCreateView$1$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_optionXRelease"})
    /* compiled from: MarketAnalysisFragment.kt */
    public static final class d implements OnPageChangeListener {
        final /* synthetic */ b this$0;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        d(b bVar) {
            this.this$0 = bVar;
        }

        public void onPageSelected(int i) {
            if (i >= 0) {
                MarketAnalysisTab marketAnalysisTab = (MarketAnalysisTab) b.b(this.this$0).YW().getValue();
                MarketAnalysisTab marketAnalysisTab2 = (MarketAnalysisTab) b.dFi.get(i);
                String str = (marketAnalysisTab == MarketAnalysisTab.NEWS && marketAnalysisTab2 == MarketAnalysisTab.FOREX) ? "smart-feed_ext-earnings-calendar" : (marketAnalysisTab == MarketAnalysisTab.NEWS && marketAnalysisTab2 == MarketAnalysisTab.EARNINGS) ? "smart-feed_ext-economic-calendar" : (marketAnalysisTab == MarketAnalysisTab.FOREX && marketAnalysisTab2 == MarketAnalysisTab.NEWS) ? "economic-calendar_ext-smart-feed" : (marketAnalysisTab == MarketAnalysisTab.FOREX && marketAnalysisTab2 == MarketAnalysisTab.EARNINGS) ? "economic-calendar_ext-earnings-calendar" : (marketAnalysisTab == MarketAnalysisTab.EARNINGS && marketAnalysisTab2 == MarketAnalysisTab.NEWS) ? "earnings-calendar_ext-smart-feed" : (marketAnalysisTab == MarketAnalysisTab.EARNINGS && marketAnalysisTab2 == MarketAnalysisTab.FOREX) ? "earnings-calendar_ext-economic-calendar" : null;
                if (str != null) {
                    com.iqoption.core.d.EC().di(str);
                }
                com.iqoption.core.analytics.c c = this.this$0.dFh;
                if (c != null) {
                    c.Cc();
                }
                this.this$0.c(marketAnalysisTab2);
                b.b(this.this$0).a(marketAnalysisTab2);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisFragment.kt */
    static final class e<T> implements Observer<MarketAnalysisTab> {
        final /* synthetic */ b this$0;

        e(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: b */
        public final void onChanged(MarketAnalysisTab marketAnalysisTab) {
            b.d(this.this$0).aRy.setCurrentItem(b.dFi.indexOf(marketAnalysisTab), false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisFragment.kt */
    static final class f<T> implements Observer<com.iqoption.core.microservices.tradingengine.response.active.f> {
        final /* synthetic */ b this$0;

        f(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
            com.iqoption.core.ext.a.t(this.this$0).popBackStack();
        }
    }

    private final boolean aNI() {
        kotlin.d dVar = this.dFg;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ com.iqoption.core.marketanalysis.f b(b bVar) {
        com.iqoption.core.marketanalysis.f fVar = bVar.dFe;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return fVar;
    }

    public static final /* synthetic */ lo d(b bVar) {
        lo loVar = bVar.dFf;
        if (loVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return loVar;
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dFe = com.iqoption.core.marketanalysis.f.blw.k(com.iqoption.core.ext.a.r(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dFf = (lo) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_market_analysis, viewGroup, false, 4, null);
        lo loVar = this.dFf;
        String str = "binding";
        if (loVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        String str2 = "marketAnalysisBack";
        String str3 = "btnExpand";
        ImageView imageView;
        if (aNI()) {
            imageView = loVar.aIs;
            kotlin.jvm.internal.i.e(imageView, str3);
            com.iqoption.core.ext.a.al(imageView);
            imageView = loVar.chi;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
            imageView = loVar.chi;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setOnClickListener(new b(this));
        } else {
            imageView = loVar.aIs;
            kotlin.jvm.internal.i.e(imageView, str3);
            com.iqoption.core.ext.a.ak(imageView);
            imageView = loVar.aIs;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setOnClickListener(new c(this));
            imageView = loVar.chi;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.al(imageView);
        }
        List K = m.K(getString(R.string.news));
        Fragment[] fragmentArr = new Fragment[1];
        com.iqoption.feed.j avw = com.iqoption.feed.j.avw();
        kotlin.jvm.internal.i.e(avw, "SmartFeedFragment.newInstance()");
        fragmentArr[0] = avw;
        List K2 = m.K(fragmentArr);
        if (com.iqoption.core.d.EH().ej("economic-calendar")) {
            K.add(getString(R.string.forex));
            K2.add(h.cSE.dl(false));
        }
        if (com.iqoption.core.d.EH().ej("earnings-calendar")) {
            K.add(getString(R.string.earnings));
            K2.add(com.iqoption.earningscalendar.f.cNk.de(false));
        }
        ViewPager viewPager = loVar.aRy;
        String str4 = "pager";
        kotlin.jvm.internal.i.e(viewPager, str4);
        viewPager.setOffscreenPageLimit(3);
        loVar.cfQ.setupWithViewPager(loVar.aRy);
        String str5 = "tabs";
        TabLayout tabLayout;
        if (K.size() > 1) {
            tabLayout = loVar.cfQ;
            kotlin.jvm.internal.i.e(tabLayout, str5);
            com.iqoption.core.ext.a.ak(tabLayout);
        } else {
            tabLayout = loVar.cfQ;
            kotlin.jvm.internal.i.e(tabLayout, str5);
            com.iqoption.core.ext.a.al(tabLayout);
        }
        com.iqoption.core.marketanalysis.f fVar = this.dFe;
        String str6 = "viewModel";
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str6);
        }
        MarketAnalysisTab marketAnalysisTab = (MarketAnalysisTab) fVar.YW().getValue();
        if (marketAnalysisTab == null) {
            marketAnalysisTab = MarketAnalysisTab.NEWS;
        }
        kotlin.jvm.internal.i.e(marketAnalysisTab, "viewModel.currentTab.value ?: NEWS");
        if (marketAnalysisTab == MarketAnalysisTab.NEWS) {
            c(MarketAnalysisTab.NEWS);
        }
        loVar.aRy.addOnPageChangeListener(new d(this));
        ViewPager viewPager2 = loVar.aRy;
        kotlin.jvm.internal.i.e(viewPager2, str4);
        viewPager2.setAdapter(new com.iqoption.marketanalysis.a.a(com.iqoption.core.ext.a.u(this), K, K2));
        com.iqoption.core.marketanalysis.f fVar2 = this.dFe;
        if (fVar2 == null) {
            kotlin.jvm.internal.i.lG(str6);
        }
        LifecycleOwner lifecycleOwner = this;
        fVar2.YW().observe(lifecycleOwner, new e(this));
        if (com.iqoption.core.ext.a.p(this)) {
            fVar2 = this.dFe;
            if (fVar2 == null) {
                kotlin.jvm.internal.i.lG(str6);
            }
            fVar2.Zb().observe(lifecycleOwner, new f(this));
        }
        loVar = this.dFf;
        if (loVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return loVar.getRoot();
    }

    private final void c(MarketAnalysisTab marketAnalysisTab) {
        boolean p = com.iqoption.core.ext.a.p(this);
        com.iqoption.core.analytics.b bVar = null;
        String str = (marketAnalysisTab == MarketAnalysisTab.NEWS && p) ? "smart-feed_show" : marketAnalysisTab == MarketAnalysisTab.NEWS ? "smart-feed_full-screen" : marketAnalysisTab == MarketAnalysisTab.FOREX ? "economic-calendar_show" : marketAnalysisTab == MarketAnalysisTab.EARNINGS ? "earnings-calendar_show" : null;
        double d = p ? 0.0d : 1.0d;
        if (str != null) {
            bVar = com.iqoption.core.d.EC().g(str, d);
        }
        this.dFh = bVar;
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            this.ajY = com.iqoption.core.d.EC().dm("open_market_analysis");
        }
    }

    public void back() {
        awK();
        super.back();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    private final void awK() {
        /*
        r2 = this;
        r0 = r2.dFe;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r1 = "viewModel";
        kotlin.jvm.internal.i.lG(r1);
    L_0x0009:
        r0 = r0.YW();
        r0 = r0.getValue();
        r0 = (com.iqoption.core.marketanalysis.MarketAnalysisTab) r0;
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0027;
    L_0x0016:
        r1 = com.iqoption.marketanalysis.c.axg;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        if (r0 == r1) goto L_0x002f;
    L_0x0021:
        r1 = 2;
        if (r0 == r1) goto L_0x002c;
    L_0x0024:
        r1 = 3;
        if (r0 == r1) goto L_0x0029;
    L_0x0027:
        r0 = 0;
        goto L_0x0031;
    L_0x0029:
        r0 = "earnings-calendar_ext-back";
        goto L_0x0031;
    L_0x002c:
        r0 = "economic-calendar_ext-back";
        goto L_0x0031;
    L_0x002f:
        r0 = "smart-feed_news_ext-back";
    L_0x0031:
        if (r0 == 0) goto L_0x003a;
    L_0x0033:
        r1 = com.iqoption.core.d.EC();
        r1.di(r0);
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.marketanalysis.b.awK():void");
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.ajY;
        if (cVar != null) {
            cVar.Cc();
        }
        cVar = this.dFh;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation loadAnimation = i2 == 0 ? null : AnimationUtils.loadAnimation(com.iqoption.core.ext.a.q(this), i2);
        if (loadAnimation != null && z) {
            com.iqoption.core.ui.f.a.bJH.B(this).a(loadAnimation);
        }
        return loadAnimation;
    }
}
