package com.iqoption.marginaddon;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.ToastEntity;
import com.iqoption.e.ga;
import com.iqoption.popup.PopupPriority;
import com.iqoption.util.af;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J)\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010\b\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00062"}, bng = {"Lcom/iqoption/marginaddon/MarginAddOnInfoDialog;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "Lcom/iqoption/view/BackController$OnBackListener;", "()V", "binding", "Lcom/iqoption/databinding/DialogMarginAddOnInfoBinding;", "closeRunnable", "Ljava/lang/Runnable;", "event", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "handler", "Landroid/os/Handler;", "isEnabled", "", "rightOffset", "", "getRightOffset", "()I", "rightOffset$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/marginaddon/MarginAddOnViewModel;", "enableMarginAddOn", "", "onClose", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "reportEvent", "category", "", "value", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "setUiStateEnabled", "enabled", "animate", "Companion", "app_optionXRelease"})
/* compiled from: MarginAddOnInfoDialog.kt */
public final class a extends com.iqoption.fragment.b.b implements com.iqoption.view.b.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "rightOffset", "getRightOffset()I"))};
    public static final a dEX = new a();
    private HashMap apm;
    private Builder arm;
    private final Runnable cVr = new b(this);
    private ga dEU;
    private c dEV;
    private final kotlin.d dEW = g.c(new MarginAddOnInfoDialog$rightOffset$2(this));
    private final Handler handler = new Handler();
    private boolean isEnabled;

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\"\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/marginaddon/MarginAddOnInfoDialog$Companion;", "", "()V", "ARG_RIGHT_OFFSET", "", "CLOSE_DELAY_MILLIS", "", "TAG", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "containerViewId", "", "rightOffset", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: MarginAddOnInfoDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ int dEY;
            final /* synthetic */ FragmentManager deH;
            final /* synthetic */ int dkJ;

            a(FragmentManager fragmentManager, int i, int i2) {
                this.deH = fragmentManager;
                this.dkJ = i;
                this.dEY = i2;
            }

            public final void run() {
                a aVar = a.dEX;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.a(fragmentManager, this.dkJ, this.dEY);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentActivity fragmentActivity, @IdRes int i, int i2) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
            if (!A.js(a.TAG)) {
                A.a((Runnable) new a(supportFragmentManager, i, i2), a.TAG, PopupPriority.HIGH);
            }
        }

        private final boolean a(FragmentManager fragmentManager, @IdRes int i, int i2) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_RIGHT_OFFSET", i2);
            aVar.setArguments(bundle);
            fragmentManager.beginTransaction().replace(i, aVar, a.TAG).addToBackStack(a.TAG).commitAllowingStateLoss();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    static final class b implements Runnable {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void run() {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c implements OnPreDrawListener {
        final /* synthetic */ View aTo;
        final /* synthetic */ a this$0;

        public c(View view, a aVar) {
            this.aTo = view;
            this.this$0 = aVar;
        }

        public boolean onPreDraw() {
            this.aTo.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = a.b(this.this$0).cbG;
            kotlin.jvm.internal.i.e(view, "binding.dialogMarginTouchablePart");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).width = this.this$0.aNw();
                a.b(this.this$0).cbG.requestLayout();
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            a.a(this.this$0, Event.CATEGORY_BUTTON_PRESSED, "trading-tip_close", null, 4, null);
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    static final class f implements OnTouchListener {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.this$0.onClose();
            return false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: MarginAddOnInfoDialog.kt */
    static final class g implements OnClickListener {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.a(Event.CATEGORY_BUTTON_PRESSED, "trading-tip_enable", Double.valueOf(1.0d));
            this.this$0.aNx();
        }
    }

    public static final void a(FragmentActivity fragmentActivity, @IdRes int i, int i2) {
        dEX.a(fragmentActivity, i, i2);
    }

    private final int aNw() {
        kotlin.d dVar = this.dEW;
        j jVar = anY[0];
        return ((Number) dVar.getValue()).intValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ ga b(a aVar) {
        ga gaVar = aVar.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gaVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dEV = c.dFd.aS(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dEU = (ga) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.dialog_margin_add_on_info, viewGroup, false, 4, null);
        ga gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gaVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.dEV;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        k(cVar.aNF(), false);
        ga gaVar = this.dEU;
        String str2 = "binding";
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gaVar.cbz.setOnClickListener(new d(this));
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gaVar.cby.setOnClickListener(new e(this));
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gaVar.cbG.setOnTouchListener(new f(this));
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gaVar.cbv.setOnClickListener(new g(this));
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        view = gaVar.getRoot();
        kotlin.jvm.internal.i.e(view, "binding.root");
        view.getViewTreeObserver().addOnPreDrawListener(new c(view, this));
        if (bundle == null) {
            cVar = this.dEV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            a(Event.CATEGORY_POPUP_SERVED, "trading-tip_show", Double.valueOf((double) cVar.aNH()));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacks(this.cVr);
        Builder builder = this.arm;
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
        Bj();
    }

    private final void k(boolean z, boolean z2) {
        this.isEnabled = z;
        String str = "binding";
        if (z2) {
            ga gaVar = this.dEU;
            if (gaVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TransitionManager.beginDelayedTransition(gaVar.cbw);
        }
        String str2 = "binding.dialogMarginEnabledText";
        String str3 = "binding.dialogMarginEnabledIcon";
        String str4 = "binding.dialogMarginButton";
        ga gaVar2;
        TextView textView;
        ImageView imageView;
        if (z) {
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gaVar2.cbv;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.ext.a.al(textView);
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            imageView = gaVar2.cbB;
            kotlin.jvm.internal.i.e(imageView, str3);
            com.iqoption.core.ext.a.ak(imageView);
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gaVar2.cbC;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            return;
        }
        gaVar2 = this.dEU;
        if (gaVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = gaVar2.cbv;
        kotlin.jvm.internal.i.e(textView, str4);
        com.iqoption.core.ext.a.ak(textView);
        gaVar2 = this.dEU;
        if (gaVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView = gaVar2.cbB;
        kotlin.jvm.internal.i.e(imageView, str3);
        com.iqoption.core.ext.a.al(imageView);
        gaVar2 = this.dEU;
        if (gaVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = gaVar2.cbC;
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.al(textView);
    }

    private final void aNx() {
        c cVar = this.dEV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.aNG();
        k(true, true);
        this.handler.postDelayed(this.cVr, ToastEntity.ERROR_TOAST_DURATION);
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public void att() {
        ga gaVar = this.dEU;
        String str = "binding";
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gaVar.cbA;
        String str2 = "binding.dialogMarginContainer";
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setAlpha(0.0f);
        float dimension;
        ga gaVar2;
        LinearLayout linearLayout2;
        ga gaVar3;
        LinearLayout linearLayout3;
        float height;
        if (af.ebR) {
            dimension = getResources().getDimension(R.dimen.dp12);
            float dimension2 = getResources().getDimension(R.dimen.dp6);
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout2 = gaVar2.cbA;
            kotlin.jvm.internal.i.e(linearLayout2, str2);
            linearLayout2.setTranslationX(dimension2);
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout2 = gaVar2.cbA;
            kotlin.jvm.internal.i.e(linearLayout2, str2);
            linearLayout2.setTranslationY(-dimension2);
            gaVar3 = this.dEU;
            if (gaVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout3 = gaVar3.cbA;
            kotlin.jvm.internal.i.e(linearLayout3, str2);
            dimension2 = ((float) linearLayout3.getWidth()) - dimension;
            gaVar2 = this.dEU;
            if (gaVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout2 = gaVar2.cbA;
            kotlin.jvm.internal.i.e(linearLayout2, str2);
            height = ((float) linearLayout2.getHeight()) - dimension;
            ga gaVar4 = this.dEU;
            if (gaVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout4 = gaVar4.cbA;
            kotlin.jvm.internal.i.e(linearLayout4, str2);
            double width = (double) linearLayout4.getWidth();
            ga gaVar5 = this.dEU;
            if (gaVar5 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout5 = gaVar5.cbA;
            kotlin.jvm.internal.i.e(linearLayout5, str2);
            float hypot = (float) Math.hypot(width, (double) linearLayout5.getHeight());
            ga gaVar6 = this.dEU;
            if (gaVar6 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(gaVar6.cbA, (int) dimension2, (int) height, dimension, hypot);
            Animator duration = createCircularReveal.setDuration(400);
            kotlin.jvm.internal.i.e(duration, "animator.setDuration(400)");
            duration.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
            ga gaVar7 = this.dEU;
            if (gaVar7 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout6 = gaVar7.cbA;
            r5 = new PropertyValuesHolder[2];
            r5[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r5[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout6, r5);
            ObjectAnimator duration2 = ofPropertyValuesHolder.setDuration(200);
            kotlin.jvm.internal.i.e(duration2, "shift.setDuration(200)");
            duration2.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            gaVar = this.dEU;
            if (gaVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = gaVar.cbA;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            linearLayout.setAlpha(1.0f);
            return;
        }
        dimension = getResources().getDimension(R.dimen.dp12);
        gaVar3 = this.dEU;
        if (gaVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout3 = gaVar3.cbA;
        kotlin.jvm.internal.i.e(linearLayout3, str2);
        height = -dimension;
        linearLayout3.setTranslationX(height);
        gaVar3 = this.dEU;
        if (gaVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout3 = gaVar3.cbA;
        kotlin.jvm.internal.i.e(linearLayout3, str2);
        linearLayout3.setTranslationY(height);
        gaVar3 = this.dEU;
        if (gaVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout3 = gaVar3.cbA;
        kotlin.jvm.internal.i.e(linearLayout3, str2);
        gaVar2 = this.dEU;
        if (gaVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout2 = gaVar2.cbA;
        kotlin.jvm.internal.i.e(linearLayout2, str2);
        linearLayout3.setPivotX(((float) linearLayout2.getWidth()) - dimension);
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gaVar.cbA;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setPivotY(1.0f);
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gaVar.cbA;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setScaleX(0.3f);
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gaVar.cbA;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setScaleY(0.3f);
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gaVar.cbA.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        ga gaVar = this.dEU;
        String str = "binding";
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gaVar.cbA;
        String str2 = "binding.dialogMarginContainer";
        kotlin.jvm.internal.i.e(linearLayout, str2);
        ga gaVar2 = this.dEU;
        if (gaVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout2 = gaVar2.cbA;
        kotlin.jvm.internal.i.e(linearLayout2, str2);
        linearLayout.setPivotX((float) linearLayout2.getWidth());
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gaVar.cbA;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        linearLayout.setPivotY(1.0f);
        gaVar = this.dEU;
        if (gaVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gaVar.cbA.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    static /* synthetic */ void a(a aVar, String str, String str2, Double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = (Double) null;
        }
        aVar.a(str, str2, d);
    }

    private final void a(String str, String str2, Double d) {
        Builder parameters = Event.Builder(str, str2).setParameters(u.anp().o("type", "margin_add_on").anr());
        if (d != null) {
            parameters.setValue(Double.valueOf(d.doubleValue()));
        }
        EventManager.BS().a(parameters.build());
    }
}
