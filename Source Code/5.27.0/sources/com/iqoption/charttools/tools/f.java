package com.iqoption.charttools.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.l;
import com.iqoption.charttools.model.indicator.m;
import com.iqoption.charttools.model.indicator.n;
import com.iqoption.charttools.model.indicator.o;
import com.iqoption.charttools.model.indicator.p;
import com.iqoption.charttools.model.indicator.q;
import com.iqoption.charttools.model.indicator.r;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.core.util.KeyboardAutoCloser;
import com.iqoption.e.nj;
import com.iqoption.fragment.ah;
import com.iqoption.templates.TemplateActivity;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u000207H\u0002J\u0010\u0010H\u001a\u00020D2\u0006\u0010G\u001a\u000207H\u0002J\u0018\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u0014\u0010K\u001a\u0004\u0018\u0001072\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u0014\u0010L\u001a\u0004\u0018\u00010M2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010N\u001a\u00020)2\b\u0010O\u001a\u0004\u0018\u00010PH\u0014J\b\u0010Q\u001a\u00020)H\u0016J\u0012\u0010R\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J&\u0010U\u001a\u0004\u0018\u0001072\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u0001002\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010Y\u001a\u00020DH\u0016J\b\u0010Z\u001a\u00020DH\u0016J\u0010\u0010[\u001a\u00020D2\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020D2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010^\u001a\u00020D2\u0006\u0010a\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020DH\u0016J\u0010\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020D2\u0006\u0010h\u001a\u00020iH\u0016J\u001a\u0010j\u001a\u00020D2\u0006\u0010G\u001a\u0002072\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0012\u0010k\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u000107H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158VX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R$\u0010,\u001a\u00020)2\u0006\u0010+\u001a\u00020)8B@BX\u000e¢\u0006\f\u001a\u0004\b,\u0010*\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008VX\u0002¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b1\u00102R\u0010\u00104\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020706X.¢\u0006\u0004\n\u0002\u00108R\u0016\u00109\u001a\u0004\u0018\u00010:8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006m"}, bng = {"Lcom/iqoption/charttools/tools/ToolsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "binding", "Lcom/iqoption/databinding/FragmentToolsBinding;", "callbacks", "getCallbacks", "()Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "changeTransition", "Landroidx/transition/TransitionSet;", "getChangeTransition", "()Landroidx/transition/TransitionSet;", "changeTransition$delegate", "Lkotlin/Lazy;", "commonDecoration", "Lcom/iqoption/widget/SeparatorDecoration;", "getCommonDecoration", "()Lcom/iqoption/widget/SeparatorDecoration;", "commonDecoration$delegate", "contentDelegates", "", "Lcom/iqoption/charttools/tools/ToolsScreen;", "Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "enterAnimationDuration", "", "getEnterAnimationDuration", "()J", "enterExitTransition", "Lcom/iqoption/charttools/tools/transition/CardPanelTransition;", "getEnterExitTransition", "()Lcom/iqoption/charttools/tools/transition/CardPanelTransition;", "enterExitTransition$delegate", "exitAnimationDuration", "getExitAnimationDuration", "isCustomAnimationsEnabled", "", "()Z", "value", "isOpenLibrary", "setOpenLibrary", "(Z)V", "parentView", "Landroid/view/ViewGroup;", "getParentView", "()Landroid/view/ViewGroup;", "parentView$delegate", "prevScreen", "sectionViews", "", "Landroid/view/View;", "[Landroid/view/View;", "tradeRoom", "Lcom/iqoption/fragment/TradeFragment;", "getTradeRoom", "()Lcom/iqoption/fragment/TradeFragment;", "viewModel", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "getViewModel", "()Lcom/iqoption/charttools/tools/ToolsViewModel;", "setViewModel", "(Lcom/iqoption/charttools/tools/ToolsViewModel;)V", "animateEnter", "", "offset", "", "view", "animateExit", "getContentDelegate", "screen", "getSectionView", "getTransition", "Landroidx/transition/Transition;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onClose", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onEnterAnimation", "onExitAnimation", "onOpenFigureSettings", "figure", "Lcom/iqoption/charttools/model/indicator/Figure;", "onOpenIndicatorSettings", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "onOpenTemplateActivity", "onOpenTemplateSettings", "templateItem", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "onOpenVideoPlayer", "videoUrl", "", "onViewCreated", "selectSection", "Companion", "app_optionXRelease"})
/* compiled from: ToolsFragment.kt */
public final class f extends com.iqoption.core.ui.fragment.d implements com.iqoption.charttools.tools.delegate.c, com.iqoption.charttools.tools.delegate.c.a {
    private static final String TAG = f.class.getName();
    public static final a aLL = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(f.class), "commonDecoration", "getCommonDecoration()Lcom/iqoption/widget/SeparatorDecoration;")), k.a(new PropertyReference1Impl(k.G(f.class), "parentView", "getParentView()Landroid/view/ViewGroup;")), k.a(new PropertyReference1Impl(k.G(f.class), "enterExitTransition", "getEnterExitTransition()Lcom/iqoption/charttools/tools/transition/CardPanelTransition;")), k.a(new PropertyReference1Impl(k.G(f.class), "changeTransition", "getChangeTransition()Landroidx/transition/TransitionSet;"))};
    public h aLB;
    private nj aLC;
    private final kotlin.d aLD = g.c(new ToolsFragment$commonDecoration$2(this));
    private final kotlin.d aLE = g.c(new ToolsFragment$parentView$2(this));
    private final com.iqoption.charttools.tools.delegate.c.a aLF = this;
    private final kotlin.d aLG = g.c(ToolsFragment$enterExitTransition$2.aLN);
    private final kotlin.d aLH = g.c(ToolsFragment$changeTransition$2.aLM);
    private View[] aLI;
    private final Map<ToolsScreen, com.iqoption.charttools.tools.delegate.b<?>> aLJ = new LinkedHashMap();
    private ToolsScreen aLK;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/tools/ToolsFragment$Companion;", "", "()V", "ARG_OPEN_LIBRARY", "", "DURATION", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/charttools/tools/ToolsFragment;", "openLibrary", "", "app_optionXRelease"})
    /* compiled from: ToolsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return f.TAG;
        }

        public final f cd(boolean z) {
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg.openLibrary", z);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/charttools/tools/ToolsFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: ToolsFragment.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ f this$0;

        b(f fVar) {
            this.this$0 = fVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.activesTools /*2131361868*/:
                    this.this$0.PL().e(ToolsScreen.ACTIVE_TOOLS);
                    return;
                case R.id.everything /*2131362694*/:
                    this.this$0.onClose();
                    return;
                case R.id.fibonacciArcButton /*2131362747*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) l.aJk);
                    return;
                case R.id.fibonacciLinesButton /*2131362748*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) m.aJl);
                    return;
                case R.id.fibonacciSpiralButton /*2131362749*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) n.aJm);
                    return;
                case R.id.horizontalLineButton /*2131362896*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) o.aJn);
                    return;
                case R.id.indicators /*2131362922*/:
                    this.this$0.PL().e(ToolsScreen.INDICATORS);
                    return;
                case R.id.lineButton /*2131363212*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) p.aJo);
                    return;
                case R.id.otherSettingsTools /*2131363453*/:
                    this.this$0.PL().e(ToolsScreen.SETTINGS);
                    return;
                case R.id.templatesTools /*2131364064*/:
                    e.aLA.PI();
                    this.this$0.PL().e(ToolsScreen.TEMPLATES);
                    return;
                case R.id.trendLineButton /*2131364275*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) q.aJp);
                    return;
                case R.id.verticalLineButton /*2131364365*/:
                    this.this$0.c((com.iqoption.charttools.model.indicator.k) r.aJq);
                    return;
                default:
                    return;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "screen", "Lcom/iqoption/charttools/tools/ToolsScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ToolsFragment.kt */
    static final class c<T> implements Observer<ToolsScreen> {
        final /* synthetic */ f this$0;

        c(f fVar) {
            this.this$0 = fVar;
        }

        /* renamed from: d */
        public final void onChanged(ToolsScreen toolsScreen) {
            nj a = f.a(this.this$0);
            f fVar = this.this$0;
            fVar.Y(fVar.a(toolsScreen));
            com.iqoption.charttools.tools.delegate.b b = this.this$0.b(toolsScreen);
            Transition c = this.this$0.c(toolsScreen);
            if (c != null) {
                TransitionManager.beginDelayedTransition(f.a(this.this$0).cjH, c);
            }
            this.this$0.PP().removeAllViews();
            if (b != null) {
                if (this.this$0.PP().getParent() == null) {
                    a.cjH.addView(this.this$0.PP());
                }
                this.this$0.PP().addView(b.getContentView());
            } else {
                a.cjH.removeView(this.this$0.PP());
            }
            this.this$0.aLK = toolsScreen;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: ToolsFragment.kt */
    static final class d<T> implements Observer<Integer> {
        final /* synthetic */ f this$0;

        d(f fVar) {
            this.this$0 = fVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                int intValue = num.intValue();
                TextView textView = f.a(this.this$0).cjF;
                kotlin.jvm.internal.i.e(textView, "binding.activesToolsCount");
                textView.setText(intValue > 0 ? String.valueOf(intValue) : "");
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: ToolsFragment.kt */
    static final class e<T> implements Observer<Integer> {
        final /* synthetic */ f this$0;

        e(f fVar) {
            this.this$0 = fVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                int intValue = num.intValue();
                TextView textView = f.a(this.this$0).cjD;
                kotlin.jvm.internal.i.e(textView, "binding.activeTemplatesToolsCount");
                textView.setText(intValue > 0 ? String.valueOf(intValue) : "");
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isDisabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: ToolsFragment.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ f this$0;

        f(f fVar) {
            this.this$0 = fVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                LinearLayout linearLayout = f.a(this.this$0).cjE;
                kotlin.jvm.internal.i.e(linearLayout, "binding.activesTools");
                com.iqoption.core.ext.a.b((ViewGroup) linearLayout, booleanValue ^ 1);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/charttools/tools/Event;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ToolsFragment.kt */
    static final class g<T> implements Observer<b> {
        public static final g aLO = new g();

        g() {
        }

        /* renamed from: a */
        public final void onChanged(b bVar) {
            if (bVar instanceof c) {
                com.iqoption.app.a.b.dZ(((c) bVar).Po());
            }
        }
    }

    private final com.iqoption.charttools.tools.b.a PS() {
        kotlin.d dVar = this.aLG;
        j jVar = anY[2];
        return (com.iqoption.charttools.tools.b.a) dVar.getValue();
    }

    private final TransitionSet PT() {
        kotlin.d dVar = this.aLH;
        j jVar = anY[3];
        return (TransitionSet) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: PN */
    public com.iqoption.widget.b PO() {
        kotlin.d dVar = this.aLD;
        j jVar = anY[0];
        return (com.iqoption.widget.b) dVar.getValue();
    }

    public ViewGroup PP() {
        kotlin.d dVar = this.aLE;
        j jVar = anY[1];
        return (ViewGroup) dVar.getValue();
    }

    public boolean PU() {
        return true;
    }

    public long PV() {
        return 250;
    }

    public long PW() {
        return 250;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    private final boolean PK() {
        return com.iqoption.core.ext.a.s(this).getBoolean("arg.openLibrary");
    }

    private final void cc(boolean z) {
        com.iqoption.core.ext.a.s(this).putBoolean("arg.openLibrary", z);
    }

    public h PL() {
        h hVar = this.aLB;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return hVar;
    }

    public void a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "<set-?>");
        this.aLB = hVar;
    }

    private final ah PM() {
        Activity activity = getActivity();
        if (!(activity instanceof TradeRoomActivity)) {
            activity = null;
        }
        TradeRoomActivity tradeRoomActivity = (TradeRoomActivity) activity;
        return tradeRoomActivity != null ? tradeRoomActivity.getTradeFragment() : null;
    }

    public Activity getActivity() {
        return com.iqoption.core.ext.a.r(this);
    }

    public com.iqoption.charttools.tools.delegate.c.a PQ() {
        return this.aLF;
    }

    public void k(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "indicator");
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        TabHelper.i Jh = IM.Jh();
        if (Jh != null) {
            onClose();
            com.iqoption.o.d F = com.iqoption.o.d.dUK.F(com.iqoption.core.ext.a.r(this));
            String Ju = Jh.Ju();
            kotlin.jvm.internal.i.e(Ju, "tab.idString");
            F.e(new com.iqoption.charttools.constructor.d(Ju, Jh.Jv(), hVar, false, null, 24, null));
        }
    }

    public void d(x xVar) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        TabHelper.i Jh = IM.Jh();
        if (Jh != null) {
            onClose();
            com.iqoption.o.d F = com.iqoption.o.d.dUK.F(com.iqoption.core.ext.a.r(this));
            String Ju = Jh.Ju();
            kotlin.jvm.internal.i.e(Ju, "tab.idString");
            F.e(new com.iqoption.charttools.constructor.d(Ju, Jh.Jv(), xVar, null, false, null, 56, null));
        }
    }

    public void eU(String str) {
        kotlin.jvm.internal.i.f(str, "videoUrl");
        com.iqoption.fragment.b.h.a(com.iqoption.core.ext.a.r(this), com.iqoption.core.ext.a.r(this).getSupportFragmentManager(), str, null, true);
    }

    private final View a(ToolsScreen toolsScreen) {
        if (toolsScreen == null) {
            return null;
        }
        View view;
        int i = g.aob[toolsScreen.ordinal()];
        String str = "binding";
        nj njVar;
        if (i == 1) {
            njVar = this.aLC;
            if (njVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            view = njVar.cjE;
        } else if (i == 2) {
            njVar = this.aLC;
            if (njVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            view = njVar.cjO;
        } else if (i == 3) {
            njVar = this.aLC;
            if (njVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            view = njVar.cjT;
        } else if (i == 4) {
            njVar = this.aLC;
            if (njVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            view = njVar.cjR;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return view;
    }

    private final com.iqoption.charttools.tools.delegate.b<?> b(ToolsScreen toolsScreen) {
        if (toolsScreen == null) {
            return null;
        }
        com.iqoption.charttools.tools.delegate.b<?> bVar = (com.iqoption.charttools.tools.delegate.b) this.aLJ.get(toolsScreen);
        if (bVar == null) {
            int i = g.axg[toolsScreen.ordinal()];
            if (i == 1) {
                bVar = new com.iqoption.charttools.tools.delegate.a(this);
            } else if (i == 2) {
                bVar = new com.iqoption.charttools.tools.delegate.d(this);
            } else if (i == 3) {
                bVar = new com.iqoption.charttools.tools.delegate.f(this);
            } else if (i == 4) {
                bVar = new com.iqoption.charttools.tools.delegate.e(this);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.aLJ.put(toolsScreen, bVar);
        }
        return bVar;
    }

    private final Transition c(ToolsScreen toolsScreen) {
        if (this.aLK == null || toolsScreen == null) {
            return PS();
        }
        return PT();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(h.aMs.g(this));
        if (PK()) {
            PL().e(ToolsScreen.INDICATORS);
            cc(false);
        }
        getLifecycle().addObserver(new KeyboardAutoCloser(getActivity()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        nj njVar = (nj) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.fragment_tools, viewGroup, false, 4, null);
        this.aLC = njVar;
        OnClickListener bVar = new b(this);
        njVar.cjO.setOnClickListener(bVar);
        njVar.cjE.setOnClickListener(bVar);
        String str = "templatesTools";
        if (com.iqoption.app.managers.feature.a.eg("templates")) {
            LinearLayout linearLayout = njVar.cjT;
            kotlin.jvm.internal.i.e(linearLayout, str);
            com.iqoption.core.ext.a.ak(linearLayout);
            njVar.cjT.setOnClickListener(bVar);
        }
        njVar.cjR.setOnClickListener(bVar);
        njVar.cjP.setOnClickListener(bVar);
        njVar.cjU.setOnClickListener(bVar);
        njVar.cjN.setOnClickListener(bVar);
        njVar.cjV.setOnClickListener(bVar);
        njVar.cjJ.setOnClickListener(bVar);
        njVar.cjI.setOnClickListener(bVar);
        njVar.cjK.setOnClickListener(bVar);
        njVar.cjH.setOnClickListener(bVar);
        View[] viewArr = new View[4];
        LinearLayout linearLayout2 = njVar.cjE;
        kotlin.jvm.internal.i.e(linearLayout2, "activesTools");
        viewArr[0] = linearLayout2;
        linearLayout2 = njVar.cjO;
        kotlin.jvm.internal.i.e(linearLayout2, "indicators");
        viewArr[1] = linearLayout2;
        linearLayout2 = njVar.cjT;
        kotlin.jvm.internal.i.e(linearLayout2, str);
        viewArr[2] = linearLayout2;
        LinearLayout linearLayout3 = njVar.cjR;
        kotlin.jvm.internal.i.e(linearLayout3, "otherSettingsTools");
        viewArr[3] = linearLayout3;
        this.aLI = viewArr;
        return njVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        LifecycleOwner lifecycleOwner = this;
        PL().Qd().observe(lifecycleOwner, new c(this));
        PL().Qm().observe(lifecycleOwner, new d(this));
        PL().Qn().observe(lifecycleOwner, new e(this));
        PL().Ql().observe(lifecycleOwner, new f(this));
        PL().Qk().observe(lifecycleOwner, g.aLO);
    }

    private final void Y(View view) {
        View[] viewArr = this.aLI;
        if (viewArr == null) {
            kotlin.jvm.internal.i.lG("sectionViews");
        }
        for (Object obj : viewArr) {
            obj.setSelected(kotlin.jvm.internal.i.y(obj, view));
        }
    }

    private final void c(com.iqoption.charttools.model.indicator.k kVar) {
        onClose();
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        TabHelper.i Jh = IM.Jh();
        if (Jh != null) {
            com.iqoption.o.d F = com.iqoption.o.d.dUK.F(com.iqoption.core.ext.a.r(this));
            String Ju = Jh.Ju();
            kotlin.jvm.internal.i.e(Ju, "tab.idString");
            F.e(new com.iqoption.charttools.constructor.d(Ju, Jh.Jv(), kVar, null, false, null, 56, null));
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        return onClose();
    }

    public boolean onClose() {
        ah PM = PM();
        if (PM != null) {
            View view = PM.cXQ;
            if (view != null) {
                view.setSelected(false);
            }
        }
        com.iqoption.core.ext.a.t(this).popBackStack();
        return true;
    }

    public void PX() {
        float b = com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp12);
        nj njVar = this.aLC;
        if (njVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = njVar.bgn;
        kotlin.jvm.internal.i.e(linearLayout, "mainContent");
        a(b, (View) linearLayout);
        ViewGroup PP = PP();
        if (!kotlin.jvm.internal.i.y(PP.getParent(), njVar.cjH)) {
            PP = null;
        }
        if (PP != null) {
            a(b, (View) PP);
        }
    }

    public void PY() {
        nj njVar = this.aLC;
        if (njVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = njVar.bgn;
        kotlin.jvm.internal.i.e(linearLayout, "mainContent");
        Z(linearLayout);
        ViewGroup PP = PP();
        if (!kotlin.jvm.internal.i.y(PP.getParent(), njVar.cjH)) {
            PP = null;
        }
        if (PP != null) {
            PP.setPivotX(0.0f);
            PP.setPivotY((float) PP.getMeasuredHeight());
            Z(PP);
        }
    }

    private final void a(float f, View view) {
        view.setAlpha(0.0f);
        view.setTranslationX(-f);
        view.setTranslationY(f);
        view.setPivotX(0.0f);
        view.setPivotY((float) view.getMeasuredHeight());
        com.iqoption.core.ext.a.i(view, 0.3f);
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f);
        animate.translationX(0.0f).translationY(0.0f);
        animate.scaleX(1.0f).scaleY(1.0f);
        animate.setDuration(PV());
        animate.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        animate.start();
    }

    private final void Z(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(0.0f);
        animate.scaleY(0.7f).scaleX(0.7f);
        animate.setDuration(PW());
        animate.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        animate.start();
    }

    public void PR() {
        startActivity(new Intent(com.iqoption.core.ext.a.q(this), TemplateActivity.class));
    }

    public void a(com.iqoption.charttools.tools.data.m mVar) {
        kotlin.jvm.internal.i.f(mVar, "templateItem");
        Intent intent = new Intent(com.iqoption.core.ext.a.q(this), TemplateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong("extra.templateId", mVar.QB().getId());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
