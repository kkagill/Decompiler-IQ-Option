package com.iqoption.welcome.register.social;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.login.widget.ProfilePictureView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.manager.aa;
import com.iqoption.core.ui.widget.rounded.RoundedFrameLayout;
import com.iqoption.core.ui.widget.rounded.RoundedImageView;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.v;
import com.iqoption.welcome.a.s;
import com.iqoption.welcome.g;
import com.iqoption.welcome.m;
import com.iqoption.welcome.p;
import com.iqoption.welcome.register.e;
import com.squareup.picasso.Picasso;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020\u0002H\u0014J\b\u0010*\u001a\u00020$H\u0014J\u0012\u0010+\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J \u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020&H\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0014J\u001a\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u0002042\b\u00109\u001a\u0004\u0018\u00010:H\u0017J\b\u0010A\u001a\u00020BH\u0014J\b\u0010C\u001a\u00020<H\u0014J\b\u0010D\u001a\u00020BH\u0014J\b\u0010E\u001a\u00020&H\u0014J\b\u0010F\u001a\u00020GH\u0014J\u0010\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020$H\u0014J\b\u0010J\u001a\u00020BH\u0014R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00148B@BX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006L"}, bng = {"Lcom/iqoption/welcome/register/social/SocialRegistrationFragment;", "Lcom/iqoption/welcome/register/BaseRegistrationFragment;", "Lcom/iqoption/welcome/register/social/SocialRegistrationViewModel;", "()V", "<set-?>", "Lcom/iqoption/welcome/register/social/AnimatorFactory;", "animatorFactory", "getAnimatorFactory", "()Lcom/iqoption/welcome/register/social/AnimatorFactory;", "setAnimatorFactory", "(Lcom/iqoption/welcome/register/social/AnimatorFactory;)V", "animatorFactory$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;", "binding", "getBinding", "()Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;", "setBinding", "(Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;)V", "binding$delegate", "Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;", "registerButtonBinding", "getRegisterButtonBinding", "()Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;", "setRegisterButtonBinding", "(Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;)V", "registerButtonBinding$delegate", "socialAuthInfo", "Lcom/iqoption/core/manager/SocialAuthInfo;", "getSocialAuthInfo", "()Lcom/iqoption/core/manager/SocialAuthInfo;", "socialAuthInfo$delegate", "Lkotlin/Lazy;", "acceptTermsCheck", "Landroid/widget/CheckBox;", "areFieldsValid", "", "containerOther", "", "createEventsProvider", "Lcom/iqoption/welcome/register/RegisterEventsProvider;", "createViewModel", "isTrialUser", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRegistrationFailed", "", "throwable", "", "onViewCreated", "view", "policyTextView", "Landroid/widget/TextView;", "register", "registerButton", "registerButtonText", "registerProgress", "Landroidx/core/widget/ContentLoadingProgressBar;", "setFieldsEnabled", "enabled", "titleView", "Companion", "welcome_release"})
/* compiled from: SocialRegistrationFragment.kt */
public final class d extends com.iqoption.welcome.register.b<f> {
    public static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(d.class), "binding", "getBinding()Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;")), k.a(new MutablePropertyReference1Impl(k.G(d.class), "registerButtonBinding", "getRegisterButtonBinding()Lcom/iqoption/welcome/databinding/LayoutRegisterButtonBinding;")), k.a(new PropertyReference1Impl(k.G(d.class), "socialAuthInfo", "getSocialAuthInfo()Lcom/iqoption/core/manager/SocialAuthInfo;")), k.a(new MutablePropertyReference1Impl(k.G(d.class), "animatorFactory", "getAnimatorFactory()Lcom/iqoption/welcome/register/social/AnimatorFactory;"))};
    public static final a emA = new a();
    private HashMap apm;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d emu = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d emv = kotlin.f.a.eWg.bnQ();
    private final kotlin.d emz = g.c(new SocialRegistrationFragment$socialAuthInfo$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/welcome/register/social/SocialRegistrationFragment$Companion;", "", "()V", "ARG_AUTH_INFO", "", "TAG", "newInstance", "Lcom/iqoption/welcome/register/social/SocialRegistrationFragment;", "authInfo", "Lcom/iqoption/core/manager/SocialAuthInfo;", "welcome_release"})
    /* compiled from: SocialRegistrationFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d b(aa aaVar) {
            kotlin.jvm.internal.i.f(aaVar, "authInfo");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_AUTH_INFO", aaVar);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: SocialRegistrationFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ d this$0;

        c(d dVar) {
            this.this$0 = dVar;
        }

        public final void onClick(View view) {
            if (this.this$0.getParentFragment() != null) {
                com.iqoption.welcome.p.a aVar = p.ekx;
                Fragment parentFragment = this.this$0.getParentFragment();
                if (parentFragment == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
                aVar.bo(parentFragment).aZG();
            }
            v.j(this.this$0.getActivity());
            this.this$0.aly();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/welcome/register/social/SocialRegistrationFragment$createEventsProvider$1", "Lcom/iqoption/welcome/register/RegisterEventsProvider;", "backEvent", "", "countryChooseEvent", "countryClickEvent", "currencyChooseEventName", "currencyClickEvent", "isOldEnoughEvent", "screenEvent", "termsEvent", "welcome_release"})
    /* compiled from: SocialRegistrationFragment.kt */
    public static final class b implements e {
        public String baO() {
            return "login-registration_show";
        }

        public String baP() {
            return "login-registration_terms";
        }

        public String baQ() {
            return "login-registration_back";
        }

        b() {
        }
    }

    private final void a(com.iqoption.welcome.a.aa aaVar) {
        this.emu.a(this, anY[1], aaVar);
    }

    private final void a(s sVar) {
        this.bIb.a(this, anY[0], sVar);
    }

    private final void a(a aVar) {
        this.emv.a(this, anY[3], aVar);
    }

    private final com.iqoption.welcome.a.aa baV() {
        return (com.iqoption.welcome.a.aa) this.emu.b(this, anY[1]);
    }

    private final s bbg() {
        return (s) this.bIb.b(this, anY[0]);
    }

    private final aa bbh() {
        kotlin.d dVar = this.emz;
        j jVar = anY[2];
        return (aa) dVar.getValue();
    }

    private final a bbi() {
        return (a) this.emv.b(this, anY[3]);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean bak() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void fx(boolean z) {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a bVar;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((s) com.iqoption.core.ext.a.a((Fragment) this, g.e.fragment_welcome_registration_social, viewGroup, false));
        com.iqoption.welcome.a.aa aaVar = bbg().elb;
        kotlin.jvm.internal.i.e(aaVar, "binding.layoutRegisterButton");
        a(aaVar);
        if (ag.aZ(com.iqoption.core.ext.a.q(this))) {
            bVar = new b(bbg());
        } else {
            bVar = new c(bbg());
        }
        a(bVar);
        return bbg().getRoot();
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        bbg().bfR.setOnClickListener(new c(this));
        Picasso with = Picasso.with(com.iqoption.core.ext.a.q(this));
        aa bbh = bbh();
        if (bbh == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TextView textView = bbg().elj;
        kotlin.jvm.internal.i.e(textView, "binding.socialName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bbh.getFirstName());
        stringBuilder.append(' ');
        stringBuilder.append(bbh.getLastName());
        textView.setText(stringBuilder.toString());
        int i = e.aob[bbh.Yx().ordinal()];
        String str = "binding.socialFacebookAvatarContainer";
        String str2 = "binding.socialGoogleAvatar";
        RoundedImageView roundedImageView;
        RoundedFrameLayout roundedFrameLayout;
        if (i == 1) {
            i = com.iqoption.welcome.g.c.welcome_social_icon_f;
            roundedImageView = bbg().elh;
            kotlin.jvm.internal.i.e(roundedImageView, str2);
            com.iqoption.core.ext.a.al(roundedImageView);
            roundedFrameLayout = bbg().elg;
            kotlin.jvm.internal.i.e(roundedFrameLayout, str);
            com.iqoption.core.ext.a.ak(roundedFrameLayout);
            ProfilePictureView profilePictureView = bbg().elf;
            kotlin.jvm.internal.i.e(profilePictureView, "binding.socialFacebookAvatar");
            profilePictureView.setProfileId(bbh.Yy());
        } else if (i == 2) {
            i = com.iqoption.welcome.g.c.welcome_social_icon_g;
            roundedFrameLayout = bbg().elg;
            kotlin.jvm.internal.i.e(roundedFrameLayout, str);
            com.iqoption.core.ext.a.al(roundedFrameLayout);
            roundedImageView = bbg().elh;
            kotlin.jvm.internal.i.e(roundedImageView, str2);
            com.iqoption.core.ext.a.ak(roundedImageView);
            with.load(bbh.YE()).into((ImageView) bbg().elh);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        with.load(i).into((ImageView) bbg().eli);
    }

    /* Access modifiers changed, original: protected */
    public void register() {
        ((f) bao()).c(bbh());
        com.iqoption.core.d.Um().EC().a("login-registration_open-account", 1.0d, com.iqoption.core.microservices.core.register.b.c(bbh().Yx()));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        ((f) bao()).bbl();
        return false;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        if (z) {
            return bbi().bbe();
        }
        return bbi().bbf();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbj */
    public f bav() {
        return m.ekn.aZw().bl(this);
    }

    /* Access modifiers changed, original: protected */
    public int baw() {
        return com.iqoption.welcome.g.d.registerContentContainer;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bbc */
    public TextView bax() {
        TextView textView = bbg().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public TextView bay() {
        TextView textView = bbg().eld.ekR;
        if (textView == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(textView, "binding.welcomePolicy.welcomePolicyText!!");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public CheckBox baz() {
        CheckBox checkBox = bbg().eld.ekQ;
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
        return g.g.open_account;
    }

    /* Access modifiers changed, original: protected */
    public e baD() {
        return new b();
    }
}
