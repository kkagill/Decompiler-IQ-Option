package com.iqoption.welcome.register.email;

import android.animation.Animator;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.country.g;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.v;
import com.iqoption.welcome.AuthDone;
import com.iqoption.welcome.a.aa;
import com.iqoption.welcome.a.p;
import com.iqoption.welcome.m;
import com.iqoption.welcome.register.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020+H\u0014J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0015H\u0014J\b\u0010/\u001a\u000200H\u0002J \u00101\u001a\u0002022\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020#H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u000200H\u0002J\u001a\u0010?\u001a\u0002002\u0006\u0010@\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010A\u001a\u00020)H\u0014J\b\u0010B\u001a\u00020-H\u0014J\b\u0010C\u001a\u00020-H\u0014J\b\u0010D\u001a\u00020#H\u0014J\b\u0010E\u001a\u00020FH\u0014J\b\u0010G\u001a\u00020-H\u0014R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0016R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00198B@BX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006I"}, bng = {"Lcom/iqoption/welcome/register/email/RegistrationFragment;", "Lcom/iqoption/welcome/register/BaseEmailRegistrationFragment;", "Lcom/iqoption/core/ui/country/DisappearViewProvider;", "()V", "<set-?>", "Lcom/iqoption/welcome/register/email/AnimatorFactory;", "animatorFactory", "getAnimatorFactory", "()Lcom/iqoption/welcome/register/email/AnimatorFactory;", "setAnimatorFactory", "(Lcom/iqoption/welcome/register/email/AnimatorFactory;)V", "animatorFactory$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;", "binding", "getBinding", "()Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;", "setBinding", "(Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;)V", "binding$delegate", "isTrialEnding", "", "()Z", "isTrialEnding$delegate", "Lkotlin/Lazy;", "Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;", "registerButtonBinding", "getRegisterButtonBinding", "()Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;", "setRegisterButtonBinding", "(Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;)V", "registerButtonBinding$delegate", "acceptTermsCheck", "Landroid/widget/CheckBox;", "containerOther", "", "createEventsProvider", "Lcom/iqoption/welcome/register/RegisterEventsProvider;", "createViewModel", "Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "emailEdit", "Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "emailLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getViewToHide", "Landroid/widget/TextView;", "isTrialUser", "onBackButtonClick", "", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPreviewAppClick", "onViewCreated", "view", "passwordEdit", "policyTextView", "registerButton", "registerButtonText", "registerProgress", "Landroidx/core/widget/ContentLoadingProgressBar;", "titleView", "Companion", "welcome_release"})
/* compiled from: RegistrationFragment.kt */
public final class e extends com.iqoption.welcome.register.a implements g {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(e.class), "binding", "getBinding()Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;")), k.a(new MutablePropertyReference1Impl(k.G(e.class), "registerButtonBinding", "getRegisterButtonBinding()Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;")), k.a(new MutablePropertyReference1Impl(k.G(e.class), "animatorFactory", "getAnimatorFactory()Lcom/iqoption/welcome/register/email/AnimatorFactory;")), k.a(new PropertyReference1Impl(k.G(e.class), "isTrialEnding", "isTrialEnding()Z"))};
    public static final a emx = new a();
    private HashMap apm;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d emu = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d emv = kotlin.f.a.eWg.bnQ();
    private final kotlin.d emw = g.c(new RegistrationFragment$isTrialEnding$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/welcome/register/email/RegistrationFragment$Companion;", "", "()V", "ARG_IS_TRIAL_ENDING", "", "TAG", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "isTrialEnding", "", "welcome_release"})
    /* compiled from: RegistrationFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c fz(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_TRIAL_ENDING", z);
            return new com.iqoption.core.ui.d.c(e.TAG, e.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RegistrationFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e this$0;

        b(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            this.this$0.aZY();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: RegistrationFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ e this$0;

        c(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            this.this$0.baX();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/welcome/AuthDone;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RegistrationFragment.kt */
    static final class d<T> implements Observer<AuthDone> {
        final /* synthetic */ e this$0;

        d(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: b */
        public final void onChanged(AuthDone authDone) {
            if (authDone == AuthDone.REGISTERED) {
                this.this$0.azk();
            }
        }
    }

    private final void a(aa aaVar) {
        this.emu.a(this, anY[1], aaVar);
    }

    private final void a(p pVar) {
        this.bIb.a(this, anY[0], pVar);
    }

    private final void a(a aVar) {
        this.emv.a(this, anY[2], aVar);
    }

    private final p baR() {
        return (p) this.bIb.b(this, anY[0]);
    }

    private final boolean baS() {
        kotlin.d dVar = this.emw;
        j jVar = anY[3];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final aa baV() {
        return (aa) this.emu.b(this, anY[1]);
    }

    private final a baW() {
        return (a) this.emv.b(this, anY[2]);
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a dVar;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((p) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_welcome_registration, viewGroup, false));
        aa aaVar = baR().elb;
        kotlin.jvm.internal.i.e(aaVar, "binding.layoutRegisterButton");
        a(aaVar);
        Resources resources = getResources();
        kotlin.jvm.internal.i.e(resources, "resources");
        if (resources.getConfiguration().orientation == 1) {
            dVar = new d(baR());
        } else {
            dVar = new c(baR());
        }
        a(dVar);
        return baR().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        baR().bfR.setOnClickListener(new b(this));
        baR().elc.setOnClickListener(new c(this));
        TextView textView = (TextView) view.findViewById(com.iqoption.welcome.g.d.socialTitle);
        view = view.findViewById(com.iqoption.welcome.g.d.social_container);
        kotlin.jvm.internal.i.e(view, "view.findViewById<View>(R.id.social_container)");
        view.setVisibility(8);
        kotlin.jvm.internal.i.e(textView, "socialTitle");
        textView.setVisibility(8);
        String str = "binding.previewApp";
        TextView textView2;
        if (baS()) {
            textView2 = baR().elc;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
            ((b) bao()).baK().observe(this, new d(this));
            return;
        }
        textView2 = baR().elc;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.ak(textView2);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        if (z) {
            return baW().aZJ();
        }
        return baW().aZK();
    }

    private final void baX() {
        if (baz().isChecked()) {
            ((b) bao()).baT();
        } else {
            kotlin.jvm.internal.i.e(getString(com.iqoption.welcome.g.g.terms_and_conditions), "getString(R.string.terms_and_conditions)");
            kotlin.jvm.internal.i.e(getString(com.iqoption.welcome.g.g.privacy_policy), "getString(R.string.privacy_policy)");
            String string = getString(com.iqoption.welcome.g.g.you_need_to_read_and_agree_with_n1_and_n2, string, r2);
            kotlin.jvm.internal.i.e(string, "getString(R.string.you_n…h_n1_and_n2, terms, gdpr)");
            com.iqoption.core.d.a(string, 0, 2, null);
        }
        com.iqoption.core.d.EC().a("Demka", null);
    }

    private final void aZY() {
        v.j(getActivity());
        if (baS()) {
            azk();
        } else if (getParentFragment() != null) {
            com.iqoption.welcome.p.a aVar = com.iqoption.welcome.p.ekx;
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
            aVar.bo(parentFragment).aZG();
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: baY */
    public b bav() {
        return m.ekn.aZw().e(this, baS());
    }

    /* Access modifiers changed, original: protected */
    public TextInputLayout bal() {
        TextInputLayout textInputLayout = baR().ekK;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.emailLayout");
        return textInputLayout;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: baZ */
    public IQTextInputEditText bam() {
        IQTextInputEditText iQTextInputEditText = baR().ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
        return iQTextInputEditText;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bba */
    public IQTextInputEditText ban() {
        IQTextInputEditText iQTextInputEditText = baR().ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit");
        return iQTextInputEditText;
    }

    /* renamed from: bbb */
    public TextView alo() {
        if (baS()) {
            return null;
        }
        return baR().elc;
    }

    /* Access modifiers changed, original: protected */
    public int baw() {
        return com.iqoption.welcome.g.d.registerContentContainer;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbc */
    public TextView bax() {
        TextView textView = baR().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public TextView bay() {
        TextView textView = baR().eld.ekR;
        if (textView == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(textView, "binding.welcomePolicy.welcomePolicyText!!");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public CheckBox baz() {
        CheckBox checkBox = baR().eld.ekQ;
        if (checkBox == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(checkBox, "binding.welcomePolicy.welcomePolicyCheck!!");
        return checkBox;
    }

    /* Access modifiers changed, original: protected */
    public TextView baA() {
        TextView textView = baV().aRV;
        kotlin.jvm.internal.i.e(textView, "registerButtonBinding.button");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbd */
    public ContentLoadingProgressBar baB() {
        ContentLoadingProgressBar contentLoadingProgressBar = baV().bYW;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "registerButtonBinding.progress");
        return contentLoadingProgressBar;
    }

    /* Access modifiers changed, original: protected */
    public int baC() {
        return com.iqoption.welcome.g.g.open_account;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.welcome.register.e baD() {
        return baS() ? f.emp : com.iqoption.welcome.register.d.emo;
    }
}
