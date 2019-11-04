package com.iqoption.gdpr.removal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.app.IQApp;
import com.iqoption.app.b.b.h;
import com.iqoption.core.microservices.busapi.response.ForgetUserStatus;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.fragment.dialog.k;
import com.iqoption.popup.PopupPriority;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003\u001f !B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalDialog;", "Lcom/iqoption/fragment/dialog/ScrollableDialogFragment;", "Lcom/iqoption/view/BackController$OnBackListener;", "()V", "analytics", "Lcom/iqoption/core/analytics/IQAnalytics;", "eventHandler", "Lcom/iqoption/gdpr/removal/PendingRemovalDialog$EventHandler;", "popupServedEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/gdpr/removal/PendingRemovalViewModel;", "onBackPressed", "", "onClose", "onDestroyView", "", "onHideAnimation", "onPause", "onPositiveClicked", "onResume", "onShowAnimation", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "performCancel", "setCancelButtonState", "progress", "showBouncing", "Companion", "EventHandler", "OnPendingRemovalCloseListener", "app_optionXRelease"})
/* compiled from: PendingRemovalDialog.kt */
public final class a extends k implements com.iqoption.view.b.a {
    private static final String TAG;
    public static final a drh = new a();
    private com.iqoption.core.analytics.d aZI;
    private HashMap apm;
    private b dre;
    private final b drf = new b(this);
    private com.iqoption.core.analytics.c drg;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalDialog$Companion;", "", "()V", "TAG", "", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tryShow", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: PendingRemovalDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: PendingRemovalDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = a.drh;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.k(fragmentManager);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void p(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
            if (!A.js(a.TAG)) {
                A.a((Runnable) new a(supportFragmentManager), a.TAG, PopupPriority.VERY_HIGH);
            }
        }

        private final boolean k(FragmentManager fragmentManager) {
            a aVar = new a();
            Context Uo = com.iqoption.core.d.Uo();
            com.iqoption.fragment.dialog.k.a aVar2 = k.deC;
            CharSequence string = Uo.getString(R.string.account_and_personal_data_deletion_requested);
            CharSequence string2 = Uo.getString(R.string.you_submitted_a_request_for_deletion);
            String string3 = Uo.getString(R.string.processing_of_your_request_may_take);
            kotlin.jvm.internal.i.e(string3, "context.getString(R.stri…of_your_request_may_take)");
            aVar.setArguments(aVar2.b(string, string2, string3, null, com.iqoption.core.d.getString(R.string.cancel_request), Integer.valueOf(Uo.getResources().getDimensionPixelSize(R.dimen.dp300))));
            fragmentManager.beginTransaction().replace(R.id.other_fragment, aVar, a.TAG).addToBackStack(a.TAG).commitAllowingStateLoss();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalDialog$OnPendingRemovalCloseListener;", "", "onPendingRemovalClose", "", "app_optionXRelease"})
    /* compiled from: PendingRemovalDialog.kt */
    public interface c {
        void aIs();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/gdpr/removal/PendingRemovalDialog$onHideAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "app_optionXRelease"})
    /* compiled from: PendingRemovalDialog.kt */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ a drk;

        d(a aVar) {
            this.drk = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            FragmentActivity activity = this.drk.getActivity();
            if (!(activity instanceof c)) {
                activity = null;
            }
            c cVar = (c) activity;
            if (cVar != null) {
                cVar.aIs();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: PendingRemovalDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ a drk;

        e(a aVar) {
            this.drk = aVar;
        }

        public final void onClick(View view) {
            this.drk.atB();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalDialog$EventHandler;", "Lcom/iqoption/system/event/EventHandlerBaseT;", "Lcom/iqoption/gdpr/removal/PendingRemovalDialog;", "ref", "(Lcom/iqoption/gdpr/removal/PendingRemovalDialog;)V", "onForgetUserDataChanged", "", "event", "Lcom/iqoption/app/events/IQAccountEvents$ForgetUserDataChanged;", "app_optionXRelease"})
    /* compiled from: PendingRemovalDialog.kt */
    private static final class b extends com.iqoption.system.a.e<a> {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: PendingRemovalDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ b dri;
            final /* synthetic */ h drj;

            a(b bVar, h hVar) {
                this.dri = bVar;
                this.drj = hVar;
            }

            public final void run() {
                a aVar = (a) this.dri.dUo.get();
                if (aVar != null && !aVar.isAdded()) {
                    com.iqoption.core.microservices.busapi.response.a aVar2 = (com.iqoption.core.microservices.busapi.response.a) this.drj.getValue();
                    if (aVar2 != null && aVar2.abt() == ForgetUserStatus.WAITING) {
                        aVar.onClose();
                    }
                }
            }
        }

        public b(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "ref");
            super(aVar);
        }

        @com.google.common.b.e
        public final void onForgetUserDataChanged(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "event");
            com.iqoption.core.c.a.biN.execute(new a(this, hVar));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: PendingRemovalDialog.kt */
    static final class f implements io.reactivex.b.a {
        final /* synthetic */ a drk;

        f(a aVar) {
            this.drk = aVar;
        }

        public final void run() {
            this.drk.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PendingRemovalDialog.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g drl = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            com.iqoption.app.a.b.Gq();
        }
    }

    public static final void p(FragmentActivity fragmentActivity) {
        drh.p(fragmentActivity);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.core.analytics.d EC = IQApp.Eu().EC();
        kotlin.jvm.internal.i.e(EC, "IQApp.instance().analytics");
        this.aZI = EC;
        this.dre = b.drm.w(com.iqoption.core.ext.a.r(this));
        aCb().aHP.setOnClickListener(new e(this));
        EC = this.aZI;
        if (EC == null) {
            kotlin.jvm.internal.i.lG("analytics");
        }
        this.drg = EC.dl("account-is-blocked_show");
    }

    public void onResume() {
        super.onResume();
        this.drf.register();
    }

    public void onPause() {
        this.drf.unregister();
        super.onPause();
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.drg;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public void aCe() {
        com.iqoption.core.analytics.d dVar = this.aZI;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("analytics");
        }
        dVar.di("account-is-blocked_cancel-block");
        eg(true);
        aIt();
    }

    private final void aIt() {
        b bVar = this.dre;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        a(bVar.aIu().a(new f(this), g.drl));
    }

    private final void eg(boolean z) {
        String str = "binding.buttonsProgress";
        String str2 = "binding.positiveButton";
        TextView textView;
        ContentLoadingProgressBar contentLoadingProgressBar;
        if (z) {
            textView = aCb().ciD;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            contentLoadingProgressBar = aCb().ciB;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            contentLoadingProgressBar.setVisibility(0);
            return;
        }
        textView = aCb().ciD;
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.ak(textView);
        contentLoadingProgressBar = aCb().ciB;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
    }

    public boolean onBackPressed() {
        atB();
        return true;
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    private final void atB() {
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        int bi = com.iqoption.core.util.b.bi(context);
        MaxSizeCardViewLayout maxSizeCardViewLayout = aCb().aQN;
        kotlin.jvm.internal.i.e(maxSizeCardViewLayout, "binding.frame");
        com.iqoption.core.util.b.o(maxSizeCardViewLayout, bi);
    }

    public void att() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        FrameLayout frameLayout = aCb().aHP;
        kotlin.jvm.internal.i.e(frameLayout, "binding.outside");
        aVar.d(frameLayout, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(aCb().aQN, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(2.5f));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aCb().aQN, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        FrameLayout frameLayout = aCb().aHP;
        kotlin.jvm.internal.i.e(frameLayout, "binding.outside");
        Animator d = aVar.d(frameLayout, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        MaxSizeCardViewLayout maxSizeCardViewLayout = aCb().aQN;
        r2 = new PropertyValuesHolder[3];
        r2[0] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f});
        r2[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f});
        r2[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(maxSizeCardViewLayout, r2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{d, ofPropertyValuesHolder});
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.addListener(new d(this));
        animatorSet.start();
    }
}
