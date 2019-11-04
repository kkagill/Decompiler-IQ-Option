package com.iqoption.fragment.tradingtoday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.iqoption.analytics.p;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.ext.g;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.np;
import com.iqoption.fragment.ah;
import com.iqoption.signals.q;
import com.iqoption.util.m;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.view.toppanel.TopPanelFragment;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/fragment/tradingtoday/TrendingTodayFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;", "()V", "binding", "Lcom/iqoption/databinding/FragmentTrendingTodayBinding;", "mEvent", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "viewModel", "Lcom/iqoption/fragment/tradingtoday/TrendingTodayModel;", "getAnimationDuration", "", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onHideAnimation", "onItemClick", "item", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "onShowAnimation", "setTopPadding", "topPadding", "", "Companion", "app_optionXRelease"})
/* compiled from: TrendingTodayFragment.kt */
public final class e extends com.iqoption.fragment.b.b implements com.iqoption.fragment.tradingtoday.b.b {
    private static final String TAG = TAG;
    public static final a dqJ = new a();
    private Builder ajf;
    private HashMap apm;
    private f dqH;
    private np dqI;

    @i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/tradingtoday/TrendingTodayFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isPassed12hours", "", "()Z", "newInstance", "Lcom/iqoption/fragment/tradingtoday/TrendingTodayFragment;", "passedTime", "", "show", "", "containerViewId", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tryShow", "app_optionXRelease"})
    /* compiled from: TrendingTodayFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return e.TAG;
        }

        private final e aIh() {
            e eVar = new e();
            eVar.setArguments(new Bundle());
            return eVar;
        }

        public final void b(@IdRes int i, FragmentManager fragmentManager) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
            kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
            if (Fa.Ft()) {
                a aVar = this;
                if (aVar.aIj() && com.iqoption.app.managers.feature.a.ef("popup-trending-now") && !com.iqoption.core.d.Un().Dq() && fragmentManager.findFragmentByTag(aVar.Bx()) == null) {
                    aVar.a(i, fragmentManager);
                }
            }
        }

        private final void a(@IdRes int i, FragmentManager fragmentManager) {
            a aVar = this;
            if (fragmentManager.findFragmentByTag(aVar.Bx()) == null) {
                fragmentManager.beginTransaction().add(i, aVar.aIh(), aVar.Bx()).commitAllowingStateLoss();
                com.iqoption.app.d.setLong("last_time_showed_trending_today_screen", System.currentTimeMillis());
            }
        }

        private final long aIi() {
            return TimeUnit.HOURS.toMillis(12);
        }

        private final boolean aIj() {
            return System.currentTimeMillis() - com.iqoption.app.d.getLong("last_time_showed_trending_today_screen") > e.dqJ.aIi();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TrendingTodayFragment.kt */
    static final class e implements Runnable {
        public static final e dqO = new e();

        e() {
        }

        public final void run() {
            p.CA();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/tradingtoday/TrendingTodayFragment$onCreateView$2$closeClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: TrendingTodayFragment.kt */
    public static final class b extends g {
        final /* synthetic */ e dqK;
        final /* synthetic */ a dqL;

        b(e eVar, a aVar) {
            this.dqK = eVar;
            this.dqL = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.dqK.onClose();
            p.Cz();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "list", "", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TrendingTodayFragment.kt */
    static final class c<T> implements Observer<List<? extends d>> {
        final /* synthetic */ a dqM;

        c(a aVar) {
            this.dqM = aVar;
        }

        /* renamed from: u */
        public final void onChanged(List<d> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.dqM, list, null, 2, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, bng = {"com/iqoption/fragment/tradingtoday/TrendingTodayFragment$onCreateView$2$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_optionXRelease"})
    /* compiled from: TrendingTodayFragment.kt */
    public static final class d extends OnScrollListener {
        final /* synthetic */ m dqN;

        d(m mVar) {
            this.dqN = mVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.dqN.cp(500);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public long getAnimationDuration() {
        return 300;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a aVar = new a(this);
        this.dqH = f.dqR.ah(this);
        f fVar = this.dqH;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        fVar.aIk().observe(this, new c(aVar));
        np npVar = (np) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.fragment_trending_today, viewGroup, false, 4, null);
        OnClickListener bVar = new b(this, aVar);
        npVar.ccJ.setOnClickListener(bVar);
        npVar.ckv.setOnClickListener(bVar);
        npVar.ckx.addOnScrollListener(new d(new m(e.dqO)));
        npVar.ckx.setHasFixedSize(true);
        RecyclerView recyclerView = npVar.ckx;
        kotlin.jvm.internal.i.e(recyclerView, "trendingTodayList");
        recyclerView.setAdapter(aVar);
        this.dqI = npVar;
        ah PM = PM();
        if (PM != null) {
            TopPanelFragment topPanelFragment = PM.cXC;
            kotlin.jvm.internal.i.e(topPanelFragment, "it.topPanel");
            gj(topPanelFragment.aYZ());
        }
        this.ajf = p.Cy();
        npVar = this.dqI;
        if (npVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return npVar.getRoot();
    }

    public void b(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        f fVar = this.dqH;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        if (fVar.c(dVar) == 0) {
            onClose();
        }
        if (dVar.aIg() != null) {
            q.dTF.b(dVar.aIg());
        } else {
            TabHelper.IM().a(dVar.Jt(), true);
        }
        p.c((double) dVar.aIf().ordinal(), dVar.Jt().getActiveId());
    }

    public void onDestroyView() {
        super.onDestroyView();
        p.b(this.ajf);
        Bj();
    }

    public boolean onClose() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            kotlin.jvm.internal.i.e(fragmentManager, "fm");
            if (!fragmentManager.isStateSaved()) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
                    kotlin.jvm.internal.i.e(activity, "activity");
                    aVar.A(activity).jr(TAG);
                }
            }
        }
        return true;
    }

    public void att() {
        np npVar = this.dqI;
        String str = "binding";
        if (npVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ConstraintLayout constraintLayout = npVar.ckv;
        kotlin.jvm.internal.i.e(constraintLayout, "binding.contentContainer");
        constraintLayout.setAlpha(0.0f);
        npVar = this.dqI;
        if (npVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FormattedTextView formattedTextView = npVar.ckw;
        String str2 = "trendingToday";
        kotlin.jvm.internal.i.e(formattedTextView, str2);
        FormattedTextView formattedTextView2 = npVar.ckw;
        kotlin.jvm.internal.i.e(formattedTextView2, str2);
        formattedTextView.setTranslationX(((float) formattedTextView2.getWidth()) / 2.0f);
        RecyclerView recyclerView = npVar.ckx;
        str2 = "trendingTodayList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        RecyclerView recyclerView2 = npVar.ckx;
        kotlin.jvm.internal.i.e(recyclerView2, str2);
        recyclerView.setTranslationX(((float) recyclerView2.getWidth()) / 2.0f);
        npVar.ckv.animate().alpha(1.0f).setDuration(getAnimationDuration()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        npVar.ckw.animate().translationX(0.0f).setDuration(getAnimationDuration()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        npVar.ckx.animate().translationX(0.0f).setDuration(getAnimationDuration()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        np npVar = this.dqI;
        String str = "binding";
        if (npVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ViewPropertyAnimator alpha = npVar.ckv.animate().alpha(0.0f);
        np npVar2 = this.dqI;
        if (npVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = npVar2.ckx;
        kotlin.jvm.internal.i.e(recyclerView, "binding.trendingTodayList");
        alpha.translationY(-((float) recyclerView.getHeight())).setDuration(getAnimationDuration()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public final void gj(int i) {
        np npVar = this.dqI;
        if (npVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        npVar.ckv.animate().translationY((float) i).start();
    }
}
