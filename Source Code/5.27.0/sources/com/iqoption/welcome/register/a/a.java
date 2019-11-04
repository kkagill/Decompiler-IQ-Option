package com.iqoption.welcome.register.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.welcome.AuthDone;
import com.iqoption.welcome.a.g;
import com.iqoption.welcome.m;
import com.iqoption.welcome.n;
import com.iqoption.welcome.register.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u0013H\u0014J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u001a\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010/\u001a\u00020\u001eH\u0014J\b\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u000201H\u0014J\b\u00103\u001a\u00020\u0018H\u0014J\b\u00104\u001a\u000205H\u0014J\u0018\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000201H\u0014R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014¨\u0006="}, bng = {"Lcom/iqoption/welcome/register/trial/TrialRegistrationDialog;", "Lcom/iqoption/welcome/register/BaseEmailRegistrationFragment;", "()V", "<set-?>", "Lcom/iqoption/welcome/databinding/FragmentTrialRegistrationBinding;", "binding", "getBinding", "()Lcom/iqoption/welcome/databinding/FragmentTrialRegistrationBinding;", "setBinding", "(Lcom/iqoption/welcome/databinding/FragmentTrialRegistrationBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "enterAnimationDuration", "", "getEnterAnimationDuration", "()J", "exitAnimationDuration", "getExitAnimationDuration", "isCustomAnimationsEnabled", "", "()Z", "acceptTermsCheck", "Landroid/widget/CheckBox;", "containerOther", "", "createEventsProvider", "Lcom/iqoption/welcome/register/TrialRegisterEventsProvider;", "createViewModel", "Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "emailEdit", "Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "emailLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "isTrialUser", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimation", "", "onExitAnimation", "onViewCreated", "view", "passwordEdit", "policyTextView", "Landroid/widget/TextView;", "registerButton", "registerButtonText", "registerProgress", "Landroidx/core/widget/ContentLoadingProgressBar;", "replace", "f", "Landroidx/fragment/app/Fragment;", "tag", "", "titleView", "Companion", "welcome_release"})
/* compiled from: TrialRegistrationDialog.kt */
public final class a extends com.iqoption.welcome.register.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/welcome/databinding/FragmentTrialRegistrationBinding;"))};
    public static final a emD = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private final long bIO = 350;
    private final long bIP = 350;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/welcome/register/trial/TrialRegistrationDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "welcome_release"})
    /* compiled from: TrialRegistrationDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final void a(FragmentManager fragmentManager, int i) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            a aVar = this;
            if (fragmentManager.findFragmentByTag(aVar.Bx()) == null) {
                fragmentManager.beginTransaction().add(i, new a(), aVar.Bx()).addToBackStack(aVar.Bx()).commit();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: TrialRegistrationDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a emE;

        b(a aVar) {
            this.emE = aVar;
        }

        public final void onClick(View view) {
            this.emE.bat();
            this.emE.azk();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: TrialRegistrationDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a emE;
        final /* synthetic */ int emF;

        c(a aVar, int i) {
            this.emE = aVar;
            this.emF = i;
        }

        public final void onClick(View view) {
            if (!this.emE.bau()) {
                FrameLayout frameLayout = this.emE.bbm().ekN;
                kotlin.jvm.internal.i.e(frameLayout, "binding.registerContainer");
                com.iqoption.core.util.b.o(frameLayout, this.emF);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/welcome/AuthDone;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TrialRegistrationDialog.kt */
    static final class d<T> implements Observer<AuthDone> {
        final /* synthetic */ a emE;

        d(a aVar) {
            this.emE = aVar;
        }

        /* renamed from: b */
        public final void onChanged(AuthDone authDone) {
            if (authDone == AuthDone.REGISTERED) {
                this.emE.azk();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/welcome/WelcomeScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TrialRegistrationDialog.kt */
    static final class e<T> implements Observer<n> {
        final /* synthetic */ a emE;

        e(a aVar) {
            this.emE = aVar;
        }

        /* renamed from: c */
        public final void onChanged(n nVar) {
            if (nVar != null && (nVar instanceof com.iqoption.welcome.k)) {
                this.emE.c(com.iqoption.welcome.twostepauth.a.enz.d(((com.iqoption.welcome.k) nVar).aZr()), com.iqoption.welcome.twostepauth.a.enz.Bx());
            }
        }
    }

    private final void a(g gVar) {
        this.bIb.a(this, anY[0], gVar);
    }

    private final g bbm() {
        return (g) this.bIb.b(this, anY[0]);
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
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((g) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_trial_registration, viewGroup, false));
        return bbm().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        bbm().ekP.setOnClickListener(new b(this));
        bbm().aoG.setOnClickListener(new c(this, com.iqoption.core.util.b.bi(com.iqoption.core.ext.a.q(this))));
        if (!com.iqoption.core.d.Un().Du()) {
            Tracker Ca = com.iqoption.core.d.EC().Ca();
            kotlin.jvm.internal.i.e(Ca, "analytics.defaultTracker");
            Ca.setScreenName("Open real account");
            Ca.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, Ca.get("&cid"))).build());
        }
        LifecycleOwner lifecycleOwner = this;
        ((com.iqoption.welcome.register.email.b) bao()).baK().observe(lifecycleOwner, new d(this));
        ((com.iqoption.welcome.register.email.b) bao()).bad().observe(lifecycleOwner, new e(this));
    }

    private final void c(Fragment fragment, String str) {
        com.iqoption.core.ext.a.u(this).beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).add(baw(), fragment, str).addToBackStack(str).commit();
    }

    public boolean PU() {
        return this.bIN;
    }

    public long PV() {
        return this.bIO;
    }

    public long PW() {
        return this.bIP;
    }

    public void PX() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        FrameLayout frameLayout = bbm().aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        aVar.d(frameLayout, com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), com.iqoption.welcome.g.a.transparent), com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), com.iqoption.welcome.g.a.black_65)).setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bbm().ekN, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bbm().ekN, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{r0, ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void PY() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        FrameLayout frameLayout = bbm().aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        Animator d = aVar.d(frameLayout, com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), com.iqoption.welcome.g.a.black_65), com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), com.iqoption.welcome.g.a.transparent));
        frameLayout = bbm().ekN;
        r2 = new PropertyValuesHolder[3];
        r2[0] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f});
        r2[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f});
        r2[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PW());
        animatorSet.playTogether(new Animator[]{d, ofPropertyValuesHolder});
        animatorSet.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        animatorSet.start();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: baY */
    public com.iqoption.welcome.register.email.b bav() {
        return m.ekn.aZw().e(this, true);
    }

    /* Access modifiers changed, original: protected */
    public TextInputLayout bal() {
        TextInputLayout textInputLayout = bbm().ekK;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.emailLayout");
        return textInputLayout;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: baZ */
    public IQTextInputEditText bam() {
        IQTextInputEditText iQTextInputEditText = bbm().ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
        return iQTextInputEditText;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bba */
    public IQTextInputEditText ban() {
        IQTextInputEditText iQTextInputEditText = bbm().ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit");
        return iQTextInputEditText;
    }

    /* Access modifiers changed, original: protected */
    public int baw() {
        return com.iqoption.welcome.g.d.registerContainer;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbc */
    public TextView bax() {
        TextView textView = bbm().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public TextView bay() {
        TextView textView = bbm().ekR;
        kotlin.jvm.internal.i.e(textView, "binding.welcomePolicyText");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public CheckBox baz() {
        CheckBox checkBox = bbm().ekQ;
        kotlin.jvm.internal.i.e(checkBox, "binding.welcomePolicyCheck");
        return checkBox;
    }

    /* Access modifiers changed, original: protected */
    public TextView baA() {
        TextView textView = bbm().aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbd */
    public ContentLoadingProgressBar baB() {
        ContentLoadingProgressBar contentLoadingProgressBar = bbm().bYW;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.progress");
        return contentLoadingProgressBar;
    }

    /* Access modifiers changed, original: protected */
    public int baC() {
        return com.iqoption.welcome.g.g.next;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbn */
    public f baD() {
        return f.emp;
    }
}
