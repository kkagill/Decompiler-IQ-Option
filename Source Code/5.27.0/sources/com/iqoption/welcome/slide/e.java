package com.iqoption.welcome.slide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.welcome.WelcomeScreenFeature;
import com.iqoption.welcome.a.w;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeSlidesBinding;", "slideAdapter", "Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$OnboardingWelcomeSlidesAdapter;", "viewModel", "Lcom/iqoption/welcome/slide/SlidesViewModel;", "getOnboardingSlide", "Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "resetDotsContainer", "count", "", "Companion", "OnboardingWelcomeSlidesAdapter", "ScrollDirectionOnPageChangeListener", "SlideChangeListener", "welcome_release"})
/* compiled from: WelcomeSlidesFragment.kt */
public final class e extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final c emV = new c();
    private HashMap apm;
    private d emS;
    private a emT;
    private w emU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getSlides", "", "Lcom/iqoption/welcome/slide/WelcomeSlideData;", "feature", "Lcom/iqoption/welcome/WelcomeScreenFeature;", "(Lcom/iqoption/welcome/WelcomeScreenFeature;)[Lcom/iqoption/welcome/slide/WelcomeSlideData;", "newInstance", "Lcom/iqoption/welcome/slide/WelcomeSlidesFragment;", "welcome_release"})
    /* compiled from: WelcomeSlidesFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        public final String Bx() {
            return e.TAG;
        }

        private final c[] a(WelcomeScreenFeature welcomeScreenFeature) {
            String string = com.iqoption.core.d.getString(com.iqoption.welcome.g.g.welcome_to_n1, com.iqoption.core.d.getString(com.iqoption.welcome.g.g.app_name));
            if (com.iqoption.core.d.Un().Dq()) {
                return new c[]{new c(Integer.valueOf(com.iqoption.core.splash.a.bFU.akv()), string, null)};
            } else if (welcomeScreenFeature == WelcomeScreenFeature.WELCOME1) {
                boolean Er = com.iqoption.core.d.EA().Er();
                c[] cVarArr = new c[5];
                cVarArr[0] = new c(Integer.valueOf(com.iqoption.core.splash.a.bFU.akv()), string, com.iqoption.core.d.getString(com.iqoption.welcome.g.g.swipe_to_learn_more));
                cVarArr[1] = new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_market), com.iqoption.welcome.g.g.master_the_markets, com.iqoption.welcome.g.g.trade_forex);
                cVarArr[2] = new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_security), com.iqoption.welcome.g.g.account_security, Er ? com.iqoption.welcome.g.g.funds_are_covered : com.iqoption.welcome.g.g.__2_step_authentication);
                cVarArr[3] = new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_support), com.iqoption.welcome.g.g.__24_7_support, com.iqoption.welcome.g.g.trained_support_team);
                cVarArr[4] = new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_solutions), com.iqoption.welcome.g.g.cutting_edge_solutions, com.iqoption.welcome.g.g.smooth_charts);
                return cVarArr;
            } else {
                return new c[]{new c(Integer.valueOf(com.iqoption.core.splash.a.bFU.akv()), string, com.iqoption.core.d.getString(com.iqoption.welcome.g.g.swipe_to_learn_more)), new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_forex), com.iqoption.welcome.g.g.forex, com.iqoption.welcome.g.g.multiplier_up_to), new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_crypto), com.iqoption.welcome.g.g.cryptocurrency, com.iqoption.welcome.g.g.invest_in_top_crypto), new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_cfd), com.iqoption.welcome.g.g.cfd, com.iqoption.welcome.g.g.trade_stocks_of_industry), new c(Integer.valueOf(com.iqoption.welcome.g.f.welcome_trading), com.iqoption.welcome.g.g.option_trading, com.iqoption.welcome.g.g.turbo_trading)};
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ kotlin.jvm.a.b bgL;

        public a(kotlin.jvm.a.b bVar) {
            this.bgL = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.bgL.invoke(view);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ kotlin.jvm.a.b bgL;

        public b(kotlin.jvm.a.b bVar) {
            this.bgL = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.bgL.invoke(view);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J%\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H ¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$ScrollDirectionOnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "lastPositionAndOffsetSum", "", "<set-?>", "", "scrollDirection", "scrollDirection$annotations", "getScrollDirection", "()I", "onPageScrolled", "", "position", "positionOffset", "positionOffsetPixels", "onScroll", "onScroll$welcome_release", "Companion", "ScrollDirection", "welcome_release"})
    /* compiled from: WelcomeSlidesFragment.kt */
    public static abstract class e implements OnPageChangeListener {
        public static final a ena = new a();
        private float emY;
        private int emZ;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$ScrollDirectionOnPageChangeListener$Companion;", "", "()V", "BACKWARD", "", "FORWARD", "welcome_release"})
        /* compiled from: WelcomeSlidesFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        public abstract void a(int i, float f, int i2);

        public final int bbx() {
            return this.emZ;
        }

        public void onPageScrolled(int i, float f, int i2) {
            float f2 = ((float) i) + f;
            float f3 = this.emY;
            if (f2 > f3) {
                this.emZ = 0;
            } else if (f2 < f3) {
                this.emZ = 1;
            }
            this.emY = f2;
            a(i, f, i2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ e this$0;

        public g(e eVar) {
            this.this$0 = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.t(this.this$0).beginTransaction().add(this.this$0.getId(), com.iqoption.debugmenu.debugmenu.b.cvC.aoc(), com.iqoption.debugmenu.debugmenu.b.cvC.Bx()).addToBackStack(com.iqoption.debugmenu.debugmenu.b.cvC.Bx()).commit();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0014"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$OnboardingWelcomeSlidesAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "slideViewModels", "", "Lcom/iqoption/welcome/slide/WelcomeSlideData;", "(Landroidx/fragment/app/FragmentManager;[Lcom/iqoption/welcome/slide/WelcomeSlideData;)V", "fragments", "Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "[Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "[Lcom/iqoption/welcome/slide/WelcomeSlideData;", "getCount", "", "getItem", "position", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "welcome_release"})
    /* compiled from: WelcomeSlidesFragment.kt */
    private static final class d extends FragmentPagerAdapter {
        private final d[] emW = new d[this.emX.length];
        private final c[] emX;

        public d(FragmentManager fragmentManager, c[] cVarArr) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(cVarArr, "slideViewModels");
            super(fragmentManager);
            this.emX = cVarArr;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "container");
            Object instantiateItem = super.instantiateItem(viewGroup, i);
            kotlin.jvm.internal.i.e(instantiateItem, "super.instantiateItem(container, position)");
            d[] dVarArr = this.emW;
            if (instantiateItem != null) {
                dVarArr[i] = (d) instantiateItem;
                return instantiateItem;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.welcome.slide.WelcomeSlideFragment");
        }

        /* renamed from: hU */
        public d getItem(int i) {
            d[] dVarArr = this.emW;
            if (dVarArr[i] == null) {
                dVarArr[i] = d.emR.a(this.emX[i], i);
            }
            return this.emW[i];
        }

        public int getCount() {
            return this.emX.length;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$SlideChangeListener;", "Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$ScrollDirectionOnPageChangeListener;", "adapter", "Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$OnboardingWelcomeSlidesAdapter;", "dotsContainer", "Landroid/view/ViewGroup;", "(Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$OnboardingWelcomeSlidesAdapter;Landroid/view/ViewGroup;)V", "getAdapter", "()Lcom/iqoption/welcome/slide/WelcomeSlidesFragment$OnboardingWelcomeSlidesAdapter;", "getDotsContainer", "()Landroid/view/ViewGroup;", "lastSelectedPosition", "", "onPageScrollStateChanged", "", "state", "onPageSelected", "position", "onScroll", "positionOffset", "", "positionOffsetPixels", "updateScrollProgress", "scrollDirection", "welcome_release"})
    /* compiled from: WelcomeSlidesFragment.kt */
    private static final class f extends e {
        private int enb;
        private final d enc;
        private final ViewGroup ene;

        public void onPageScrollStateChanged(int i) {
        }

        public f(d dVar, ViewGroup viewGroup) {
            kotlin.jvm.internal.i.f(dVar, "adapter");
            kotlin.jvm.internal.i.f(viewGroup, "dotsContainer");
            this.enc = dVar;
            this.ene = viewGroup;
        }

        /* renamed from: b */
        public void a(int i, float f, int i2) {
            c(i, f, bbx());
        }

        public void onPageSelected(int i) {
            d hU = this.enc.getItem(i);
            if (hU != null) {
                hU.bbs();
            }
            int i2 = this.enb;
            if (i2 != i) {
                hU = this.enc.getItem(i2);
                if (hU != null) {
                    hU.bbt();
                }
            }
            this.enb = i;
            View childAt = this.ene.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "dotsContainer.getChildAt(position)");
            childAt.setAlpha(1.0f);
        }

        private final void c(int i, float f, int i2) {
            if (i != this.enc.getCount() - 1) {
                if (i2 == 0) {
                    i2 = i + 1;
                } else if (i2 == 1) {
                    f = ((float) 1) - f;
                    i2 = i;
                    i++;
                } else {
                    return;
                }
                d hU = this.enc.getItem(i);
                d hU2 = this.enc.getItem(i2);
                if (hU != null) {
                    hU.b(f, 1);
                }
                if (hU2 != null) {
                    hU2.b(f, 0);
                }
                View childAt = this.ene.getChildAt(i);
                View childAt2 = this.ene.getChildAt(i2);
                kotlin.jvm.internal.i.e(childAt, "outcomingDot");
                double d = (double) 1;
                double d2 = (double) f;
                Double.isNaN(d2);
                d2 *= 0.8d;
                Double.isNaN(d);
                childAt.setAlpha((float) (d - d2));
                kotlin.jvm.internal.i.e(childAt2, "incomingDot");
                childAt2.setAlpha((float) (d2 + 0.2d));
            }
        }
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

    static {
        String name = e.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.emU = (w) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_welcome_slides, viewGroup, false);
        w wVar = this.emU;
        String str = "binding";
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kotlin.jvm.a.b welcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1 = new WelcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1(this);
        TextView textView = wVar.elo;
        kotlin.jvm.internal.i.e(textView, "btnLogin");
        textView.setOnClickListener(new a(welcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1));
        textView = wVar.elp;
        kotlin.jvm.internal.i.e(textView, "btnRegister");
        textView.setOnClickListener(new b(welcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1));
        this.emS = new d(com.iqoption.core.ext.a.u(this), emV.a(WelcomeScreenFeature.Companion.getWelcomeScreenFeature(com.iqoption.core.d.EH().ei("new-welcome-screen"))));
        ViewPager viewPager = wVar.Ol;
        kotlin.jvm.internal.i.e(viewPager, "viewPager");
        d dVar = this.emS;
        String str2 = "slideAdapter";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        viewPager.setAdapter(dVar);
        viewPager = wVar.Ol;
        d dVar2 = this.emS;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LinearLayout linearLayout = wVar.elr;
        kotlin.jvm.internal.i.e(linearLayout, "dotsContainer");
        viewPager.addOnPageChangeListener(new f(dVar2, linearLayout));
        d dVar3 = this.emS;
        if (dVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        hT(dVar3.getCount());
        wVar = this.emU;
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return wVar.getRoot();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.emT = a.emH.bq(this);
        a aVar = this.emT;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        String str = "binding.debugConsoleButton";
        String str2 = "binding";
        w wVar;
        Button button;
        if (aVar.bbo()) {
            wVar = this.emU;
            if (wVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            button = wVar.elq;
            kotlin.jvm.internal.i.e(button, str);
            com.iqoption.core.ext.a.ak(button);
            wVar = this.emU;
            if (wVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            wVar.elq.setOnTouchListener(new com.iqoption.core.ui.widget.h.b(0.0f, 1, null));
            wVar = this.emU;
            if (wVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            button = wVar.elq;
            kotlin.jvm.internal.i.e(button, str);
            button.setOnClickListener(new g(this));
            return;
        }
        wVar = this.emU;
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        button = wVar.elq;
        kotlin.jvm.internal.i.e(button, str);
        com.iqoption.core.ext.a.al(button);
    }

    private final void hT(int i) {
        w wVar = this.emU;
        String str = "binding";
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        wVar.elr.removeAllViews();
        String str2 = "binding.dotsContainer";
        if (i <= 1) {
            w wVar2 = this.emU;
            if (wVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout = wVar2.elr;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.al(linearLayout);
            return;
        }
        w wVar3 = this.emU;
        if (wVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout2 = wVar3.elr;
        kotlin.jvm.internal.i.e(linearLayout2, str2);
        com.iqoption.core.ext.a.ak(linearLayout2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.iqoption.welcome.g.b.dp6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.iqoption.welcome.g.b.dp6);
        for (int i2 = 0; i2 < i; i2++) {
            View view = new View(getContext());
            LayoutParams layoutParams = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
            if (i2 != 0) {
                layoutParams.setMargins(dimensionPixelSize2, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(com.iqoption.welcome.g.c.dot8);
            view.setAlpha(0.2f);
            w wVar4 = this.emU;
            if (wVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            wVar4.elr.addView(view);
        }
    }

    public final d aZu() {
        if (getView() != null) {
            w wVar = this.emU;
            String str = "binding";
            if (wVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ViewPager viewPager = wVar.Ol;
            String str2 = "binding.viewPager";
            kotlin.jvm.internal.i.e(viewPager, str2);
            if (viewPager.getAdapter() != null) {
                wVar = this.emU;
                if (wVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                viewPager = wVar.Ol;
                kotlin.jvm.internal.i.e(viewPager, str2);
                PagerAdapter adapter = viewPager.getAdapter();
                if (adapter != null) {
                    d dVar = (d) adapter;
                    w wVar2 = this.emU;
                    if (wVar2 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    ViewPager viewPager2 = wVar2.Ol;
                    kotlin.jvm.internal.i.e(viewPager2, str2);
                    d hU = dVar.getItem(viewPager2.getCurrentItem());
                    if (hU != null) {
                        return hU;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.welcome.slide.WelcomeSlideFragment");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.welcome.slide.WelcomeSlidesFragment.OnboardingWelcomeSlidesAdapter");
            }
        }
        return null;
    }
}
