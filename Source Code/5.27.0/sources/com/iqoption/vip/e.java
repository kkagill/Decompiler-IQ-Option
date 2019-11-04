package com.iqoption.vip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import com.google.android.gms.plus.PlusShare;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.analytics.r;
import com.iqoption.e.ob;
import com.iqoption.microservice.vip.VipManagerDeserializer;
import com.iqoption.util.Status;
import com.iqoption.util.ah;
import com.iqoption.x.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.n;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0007H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\u001a\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006("}, bng = {"Lcom/iqoption/vip/RequestCallFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "Lcom/iqoption/vip/ChooseTimeFragment$OnWorkingPeriodSelected;", "()V", "binding", "Lcom/iqoption/databinding/FragmentVipRequestCallBinding;", "isRequestCallDialog", "", "()Z", "popUp", "Lkotlin/Lazy;", "selectedDate", "", "selectedPeriod", "Lcom/iqoption/vip/WorkingPeriod;", "sessionId", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/vip/VipManagerViewModel;", "onClose", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onHideAnimation", "onShowAnimation", "onWorkingPeriodSelected", "date", "period", "requestCall", "time", "", "Companion", "app_optionXRelease"})
/* compiled from: RequestCallFragment.kt */
public final class e extends com.iqoption.fragment.b.b implements com.iqoption.vip.c.b {
    private static final String TAG = "javaClass";
    public static final a ejC = new a();
    private HashMap apm;
    private com.iqoption.core.analytics.c dfd;
    private ob ejA;
    private k ejB;
    private j ejm;
    private long ejv;
    private final kotlin.d<Long> ejy = g.c(new RequestCallFragment$sessionId$1(this));
    private final kotlin.d<Boolean> ejz = g.c(new RequestCallFragment$popUp$1(this));

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\u0012"}, bng = {"Lcom/iqoption/vip/RequestCallFragment$Companion;", "", "()V", "EXTRA_POP_UP", "", "EXTRA_SESSION_ID", "NO_SESSION", "", "TAG", "TAG$annotations", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "sessionId", "popUp", "", "showPopup", "app_optionXRelease"})
    /* compiled from: RequestCallFragment.kt */
    public static final class a {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: RequestCallFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentActivity dxu;

            a(FragmentActivity fragmentActivity) {
                this.dxu = fragmentActivity;
            }

            public final void run() {
                e.ejC.a(this.dxu, -1, true);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ void a(a aVar, FragmentActivity fragmentActivity, long j, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                j = -1;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.a(fragmentActivity, j, z);
        }

        public final void a(FragmentActivity fragmentActivity, long j, boolean z) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putLong("extra_session", j);
            bundle.putBoolean("extra_pop_up", z);
            eVar.setArguments(bundle);
            beginTransaction.add(R.id.fragment, eVar, e.TAG).addToBackStack(e.TAG).commitAllowingStateLoss();
        }

        public final void J(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            com.iqoption.popup.c.dKG.A(fragmentActivity).a((Runnable) new a(fragmentActivity), e.TAG);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RequestCallFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e this$0;

        b(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            if (this.this$0.aZj()) {
                r.aqZ.CK();
            } else {
                r.aqZ.CS();
            }
            this.this$0.onClose();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RequestCallFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ e this$0;

        c(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            if (this.this$0.aZj()) {
                r.aqZ.CL();
            } else {
                r.aqZ.CT();
            }
            this.this$0.onClose();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RequestCallFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ e this$0;

        d(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            k b = this.this$0.ejB;
            if (b == null) {
                e eVar = this.this$0;
                j c = e.c(eVar);
                Calendar instance = Calendar.getInstance();
                kotlin.jvm.internal.i.e(instance, "Calendar.getInstance()");
                Date time = instance.getTime();
                kotlin.jvm.internal.i.e(time, "Calendar.getInstance().time");
                eVar.kc(c.g(time));
                return;
            }
            e eVar2 = this.this$0;
            eVar2.kc(e.c(eVar2).e(this.this$0.ejv, b));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RequestCallFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ e this$0;

        e(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            if (this.this$0.aZj()) {
                r.aqZ.CM();
            } else {
                r.aqZ.CU();
            }
            com.iqoption.vip.c.a aVar = c.ejw;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(activity, "activity!!");
            aVar.C(activity);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
    /* compiled from: RequestCallFragment.kt */
    static final class g implements AnimatorUpdateListener {
        final /* synthetic */ ArgbEvaluator ejD;
        final /* synthetic */ e this$0;

        g(e eVar, ArgbEvaluator argbEvaluator) {
            this.this$0 = eVar;
            this.ejD = argbEvaluator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (((Boolean) this.this$0.ejz.getValue()).booleanValue()) {
                FrameLayout frameLayout = e.e(this.this$0).ckH;
                ArgbEvaluator argbEvaluator = this.ejD;
                kotlin.jvm.internal.i.e(valueAnimator, "it");
                Object evaluate = argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(-1476395008), Integer.valueOf(0));
                if (evaluate != null) {
                    frameLayout.setBackgroundColor(((Integer) evaluate).intValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
    /* compiled from: RequestCallFragment.kt */
    static final class h implements AnimatorUpdateListener {
        final /* synthetic */ LayoutParams ejx;
        final /* synthetic */ e this$0;

        h(e eVar, LayoutParams layoutParams) {
            this.this$0 = eVar;
            this.ejx = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.this$0.isAdded()) {
                kotlin.jvm.internal.i.e(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.ejx.width = ((Integer) animatedValue).intValue();
                    LinearLayout linearLayout = e.e(this.this$0).ckJ;
                    kotlin.jvm.internal.i.e(linearLayout, "binding.main");
                    linearLayout.setLayoutParams(this.ejx);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/util/Resource;", "Lcom/iqoption/microservice/vip/VipManager;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RequestCallFragment.kt */
    static final class f<T> implements Observer<ah<com.iqoption.microservice.vip.d>> {
        final /* synthetic */ e this$0;

        f(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final void onChanged(ah<com.iqoption.microservice.vip.d> ahVar) {
            if ((ahVar != null ? ahVar.aWW() : null) == Status.SUCCESS) {
                com.iqoption.microservice.vip.d dVar = (com.iqoption.microservice.vip.d) ahVar.getData();
                if (dVar != null) {
                    ob e = e.e(this.this$0);
                    TextView textView = e.ckV;
                    kotlin.jvm.internal.i.e(textView, "workingHours");
                    textView.setText(TextUtils.join("; ", dVar.aON()));
                    String str = "managerPhone";
                    if (TextUtils.isEmpty(dVar.aOH())) {
                        TextView textView2 = e.ckS;
                        kotlin.jvm.internal.i.e(textView2, str);
                        textView2.setText("");
                        return;
                    }
                    PhoneNumberUtil xt = PhoneNumberUtil.xt();
                    PhoneNumber b = xt.b(dVar.aOH(), "CY");
                    TextView textView3 = e.ckS;
                    kotlin.jvm.internal.i.e(textView3, str);
                    textView3.setText(xt.a(b, PhoneNumberFormat.INTERNATIONAL));
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/util/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RequestCallFragment.kt */
    static final class i<T> implements Observer<ah<Void>> {
        final /* synthetic */ e this$0;

        i(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final void onChanged(ah<Void> ahVar) {
            if (ahVar != null) {
                int i = f.aob[ahVar.aWW().ordinal()];
                if (i == 1) {
                    if (this.this$0.aZj()) {
                        r.aqZ.aH(true);
                    } else {
                        r.aqZ.aI(true);
                    }
                    com.iqoption.app.a.b.dT(R.string.wait_for_a_call);
                    this.this$0.onClose();
                } else if (i == 2) {
                    if (this.this$0.aZj()) {
                        r.aqZ.aH(false);
                    } else {
                        r.aqZ.aI(false);
                    }
                    if (ahVar.getMessage() == null) {
                        com.iqoption.app.a.b.Gq();
                    } else {
                        com.iqoption.app.a.b.dZ(ahVar.getMessage());
                    }
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ j c(e eVar) {
        j jVar = eVar.ejm;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return jVar;
    }

    public static final /* synthetic */ ob e(e eVar) {
        ob obVar = eVar.ejA;
        if (obVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return obVar;
    }

    private final boolean aZj() {
        return ((Number) this.ejy.getValue()).longValue() == -1;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String stringBuilder;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_vip_request_call, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…t_call, container, false)");
        this.ejA = (ob) inflate;
        com.iqoption.vip.j.b bVar = j.ejY;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(activity, "activity!!");
        this.ejm = bVar.K(activity);
        int anj = com.iqoption.core.util.i.anj();
        ob obVar = this.ejA;
        String str = "binding";
        if (obVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = obVar.ckW;
        kotlin.jvm.internal.i.e(textView, "binding.workingHoursTitle");
        Object[] objArr = new Object[1];
        if (anj >= 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('+');
            stringBuilder2.append(anj);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = String.valueOf(anj);
        }
        objArr[0] = stringBuilder;
        textView.setText(getString(R.string.working_hours_n1, objArr));
        ob obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        obVar2.bYq.setOnClickListener(new b(this));
        obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        obVar2.ckI.setOnClickListener(new c(this));
        obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        obVar2.ckG.setOnClickListener(new d(this));
        obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        obVar2.ckT.setOnClickListener(new e(this));
        j jVar = this.ejm;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        jVar.aZn().observe(this, new f(this));
        boolean aZj = aZj();
        String str2 = "actionButton";
        String str3 = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
        TextView textView2;
        TextView textView3;
        if (aZj) {
            this.dfd = r.aqZ.CE();
            obVar2 = this.ejA;
            if (obVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = obVar2.alH;
            kotlin.jvm.internal.i.e(textView2, str3);
            textView2.setText(getString(R.string.request_a_call));
            textView3 = obVar2.ckG;
            kotlin.jvm.internal.i.e(textView3, str2);
            textView3.setText(getString(R.string.request_a_call));
        } else {
            this.dfd = r.aqZ.CH();
            obVar2 = this.ejA;
            if (obVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = obVar2.alH;
            kotlin.jvm.internal.i.e(textView2, str3);
            textView2.setText(getString(R.string.arrange_your_training_session));
            textView3 = obVar2.ckG;
            kotlin.jvm.internal.i.e(textView3, str2);
            textView3.setText(getString(R.string.schedule_session));
        }
        obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return obVar2.getRoot();
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.dfd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    public void a(long j, k kVar) {
        this.ejv = j;
        this.ejB = kVar;
        String str = "binding";
        if (kVar == null) {
            ob obVar = this.ejA;
            if (obVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            obVar.ckQ.setText(R.string.as_soon_as_possible);
            return;
        }
        String format = VipManagerDeserializer.buo.format(new Date(j));
        n nVar = n.eWf;
        Locale locale = Locale.US;
        String str2 = "Locale.US";
        kotlin.jvm.internal.i.e(locale, str2);
        Object[] objArr = new Object[]{VipManagerDeserializer.dHB.format(kVar.getStartDate()), VipManagerDeserializer.dHB.format(kVar.getEndDate())};
        String format2 = String.format(locale, "%s - %s", Arrays.copyOf(objArr, objArr.length));
        String str3 = "java.lang.String.format(locale, format, *args)";
        kotlin.jvm.internal.i.e(format2, str3);
        ob obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = obVar2.ckQ;
        kotlin.jvm.internal.i.e(textView, "binding.callTime");
        n nVar2 = n.eWf;
        Locale locale2 = Locale.US;
        kotlin.jvm.internal.i.e(locale2, str2);
        Object[] objArr2 = new Object[]{format, format2};
        format = String.format(locale2, "%s, %s", Arrays.copyOf(objArr2, objArr2.length));
        kotlin.jvm.internal.i.e(format, str3);
        textView.setText(format);
    }

    private final void kc(String str) {
        j jVar = this.ejm;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        jVar.a(getContext(), str, aZj() ? null : (Long) this.ejy.getValue()).observe(this, new i(this));
    }

    public void att() {
        ob obVar = this.ejA;
        String str = "binding";
        if (obVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = obVar.ckJ;
        String str2 = "binding.main";
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setAlpha(0.0f);
        obVar = this.ejA;
        if (obVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obVar.ckJ, "alpha", new float[]{1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "contentAlphaAnimation");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        ofFloat.setDuration(300);
        ob obVar2 = this.ejA;
        if (obVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = obVar2.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        int width = root.getWidth();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp450);
        ob obVar3 = this.ejA;
        if (obVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout2 = obVar3.ckJ;
        kotlin.jvm.internal.i.e(linearLayout2, str2);
        LayoutParams layoutParams = linearLayout2.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{width, dimensionPixelOffset});
        ofInt.addUpdateListener(new h(this, layoutParams));
        kotlin.jvm.internal.i.e(ofInt, "widthAnimateStep");
        ofInt.setDuration(400);
        ofInt.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        if (((Boolean) this.ejz.getValue()).booleanValue()) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(-1476395008)});
            ob obVar4 = this.ejA;
            if (obVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout = obVar4.ckH;
            kotlin.jvm.internal.i.e(frameLayout, "binding.background");
            ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(frameLayout));
            kotlin.jvm.internal.i.e(ofObject, "backgroundColorAnimator");
            ofObject.setInterpolator(com.iqoption.view.a.a.c.egR);
            ofObject.setDuration(400);
            animatorSet.playTogether(new Animator[]{ofInt, ofFloat, ofObject});
        } else {
            animatorSet.playTogether(new Animator[]{ofInt, ofFloat});
        }
        animatorSet.start();
    }

    public void atu() {
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ob obVar = this.ejA;
        if (obVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        obVar.ckJ.animate().alpha(0.0f).scaleY(1.7f).scaleX(1.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).setUpdateListener(new g(this, argbEvaluator)).start();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }
}
