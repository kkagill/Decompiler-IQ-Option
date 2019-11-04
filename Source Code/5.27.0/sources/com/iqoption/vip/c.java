package com.iqoption.vip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.analytics.r;
import com.iqoption.e.nx;
import com.iqoption.x.R;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u000eJ\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u000e0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/vip/ChooseTimeFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentVipChooseTimeBinding;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "isPeriodSelected", "Lkotlin/Function2;", "", "Lcom/iqoption/vip/WorkingPeriod;", "", "periodSelected", "", "selectedDate", "selectedWorkingPeriod", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/vip/VipManagerViewModel;", "clearSelectedPeriod", "notifyWorkingPeriodSelected", "date", "workingPeriod", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onHideAnimation", "onShowAnimation", "Companion", "OnWorkingPeriodSelected", "app_optionXRelease"})
/* compiled from: ChooseTimeFragment.kt */
public final class c extends com.iqoption.fragment.b.b {
    private static final String TAG = "javaClass";
    public static final a ejw = new a();
    private HashMap apm;
    private final Calendar calendar = Calendar.getInstance();
    private com.iqoption.core.analytics.c dfd;
    private j ejm;
    private final m<Long, k, l> ejp = new ChooseTimeFragment$periodSelected$1(this);
    private final m<Long, k, Boolean> ejq = new ChooseTimeFragment$isPeriodSelected$1(this);
    private nx ejt;
    private k eju;
    private long ejv;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, bng = {"Lcom/iqoption/vip/ChooseTimeFragment$OnWorkingPeriodSelected;", "", "onWorkingPeriodSelected", "", "date", "", "workingPeriod", "Lcom/iqoption/vip/WorkingPeriod;", "app_optionXRelease"})
    /* compiled from: ChooseTimeFragment.kt */
    public interface b {
        void a(long j, k kVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\n"}, bng = {"Lcom/iqoption/vip/ChooseTimeFragment$Companion;", "", "()V", "TAG", "", "TAG$annotations", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: ChooseTimeFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void C(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(R.id.fragment, new c(), c.TAG).addToBackStack(c.TAG).commitAllowingStateLoss();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/vip/ChooseTimeFragment$onCreateView$1$1"})
    /* compiled from: ChooseTimeFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ c this$0;

        c(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            r.aqZ.CN();
            FragmentManager fragmentManager = this.this$0.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.popBackStack();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/vip/ChooseTimeFragment$onCreateView$1$2"})
    /* compiled from: ChooseTimeFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ c this$0;

        d(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            r.aqZ.CQ();
            FragmentManager fragmentManager = this.this$0.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.popBackStack();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/vip/ChooseTimeFragment$onCreateView$1$3"})
    /* compiled from: ChooseTimeFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ c this$0;

        e(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            r.aqZ.CP();
            c cVar = this.this$0;
            cVar.b(cVar.ejv, this.this$0.eju);
            FragmentManager fragmentManager = this.this$0.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.popBackStack();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
    /* compiled from: ChooseTimeFragment.kt */
    static final class f implements AnimatorUpdateListener {
        final /* synthetic */ LayoutParams ejx;
        final /* synthetic */ c this$0;

        f(c cVar, LayoutParams layoutParams) {
            this.this$0 = cVar;
            this.ejx = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.this$0.isAdded()) {
                kotlin.jvm.internal.i.e(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.ejx.width = ((Integer) animatedValue).intValue();
                    LinearLayout linearLayout = c.c(this.this$0).ckJ;
                    kotlin.jvm.internal.i.e(linearLayout, "binding.main");
                    linearLayout.setLayoutParams(this.ejx);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ nx c(c cVar) {
        nx nxVar = cVar.ejt;
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return nxVar;
    }

    private final void b(long j, k kVar) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof b)) {
            activity = null;
        }
        b bVar = (b) activity;
        if (bVar != null) {
            bVar.a(j, kVar);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        kotlin.jvm.internal.i.f(layoutInflater2, "inflater");
        this.dfd = r.aqZ.CF();
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater2, R.layout.fragment_vip_choose_time, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…e_time, container, false)");
        this.ejt = (nx) inflate;
        nx nxVar = this.ejt;
        String str = "binding";
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nxVar.bYq.setOnClickListener(new c(this));
        nxVar.ckI.setOnClickListener(new d(this));
        nxVar.ckG.setOnClickListener(new e(this));
        RecyclerView recyclerView = nxVar.ckO;
        String str2 = "todayPeriods";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView = nxVar.ckO;
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String str3 = "context!!";
        kotlin.jvm.internal.i.e(context, str3);
        recyclerView.addItemDecoration(new com.iqoption.widget.c(context.getResources().getDimensionPixelOffset(R.dimen.dp16), true, true));
        recyclerView = nxVar.ckK;
        String str4 = "nextDayPeriods";
        kotlin.jvm.internal.i.e(recyclerView, str4);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView = nxVar.ckK;
        Context context2 = getContext();
        if (context2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context2, str3);
        recyclerView.addItemDecoration(new com.iqoption.widget.c(context2.getResources().getDimensionPixelOffset(R.dimen.dp16), true, true));
        recyclerView = nxVar.ckM;
        String str5 = "nextNextDayPeriods";
        kotlin.jvm.internal.i.e(recyclerView, str5);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = nxVar.ckM;
        Context context3 = getContext();
        if (context3 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context3, str3);
        recyclerView2.addItemDecoration(new com.iqoption.widget.c(context3.getResources().getDimensionPixelOffset(R.dimen.dp16), true, true));
        com.iqoption.vip.j.b bVar = j.ejY;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(activity, "activity!!");
        this.ejm = bVar.K(activity);
        j jVar = this.ejm;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        Triple aZo = jVar.aZo();
        if (aZo != null) {
            nx nxVar2 = this.ejt;
            if (nxVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = nxVar2.ckP;
            kotlin.jvm.internal.i.e(textView, "todayTitle");
            textView.setText(((com.iqoption.vip.j.a) aZo.getFirst()).aZq());
            textView = nxVar2.ckL;
            kotlin.jvm.internal.i.e(textView, "nextDayTitle");
            textView.setText(((com.iqoption.vip.j.a) aZo.bni()).aZq());
            textView = nxVar2.ckN;
            kotlin.jvm.internal.i.e(textView, "nextNextDayTitle");
            textView.setText(((com.iqoption.vip.j.a) aZo.bnl()).aZq());
            recyclerView = nxVar2.ckO;
            kotlin.jvm.internal.i.e(recyclerView, str2);
            recyclerView.setAdapter(new b(((com.iqoption.vip.j.a) aZo.getFirst()).getDate().getTime(), ((com.iqoption.vip.j.a) aZo.getFirst()).ahf(), this.ejp, this.ejq));
            this.calendar.add(5, 1);
            recyclerView = nxVar2.ckK;
            kotlin.jvm.internal.i.e(recyclerView, str4);
            recyclerView.setAdapter(new b(((com.iqoption.vip.j.a) aZo.bni()).getDate().getTime(), ((com.iqoption.vip.j.a) aZo.bni()).ahf(), this.ejp, this.ejq));
            this.calendar.add(5, 1);
            RecyclerView recyclerView3 = nxVar2.ckM;
            kotlin.jvm.internal.i.e(recyclerView3, str5);
            recyclerView3.setAdapter(new b(((com.iqoption.vip.j.a) aZo.bnl()).getDate().getTime(), ((com.iqoption.vip.j.a) aZo.bnl()).ahf(), this.ejp, this.ejq));
        }
        nxVar = this.ejt;
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return nxVar.getRoot();
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.dfd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    public void att() {
        nx nxVar = this.ejt;
        String str = "binding";
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = nxVar.ckJ;
        String str2 = "binding.main";
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setAlpha(0.0f);
        nxVar = this.ejt;
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nxVar.ckJ, "alpha", new float[]{1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "contentAlphaAnimation");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        ofFloat.setDuration(300);
        nx nxVar2 = this.ejt;
        if (nxVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = nxVar2.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        int width = root.getWidth();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp450);
        nx nxVar3 = this.ejt;
        if (nxVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout2 = nxVar3.ckJ;
        kotlin.jvm.internal.i.e(linearLayout2, str2);
        LayoutParams layoutParams = linearLayout2.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{width, dimensionPixelOffset});
        ofInt.addUpdateListener(new f(this, layoutParams));
        kotlin.jvm.internal.i.e(ofInt, "widthAnimateStep");
        ofInt.setDuration(400);
        ofInt.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofInt, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        nx nxVar = this.ejt;
        if (nxVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        nxVar.ckJ.animate().alpha(0.0f).scaleY(1.7f).scaleX(1.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
