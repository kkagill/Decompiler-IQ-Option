package com.iqoption.welcomeonboarding;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.welcome.m;
import com.iqoption.welcomeonboarding.a.c;
import com.iqoption.welcomeonboarding.a.d;
import com.iqoption.welcomeonboarding.a.e;
import com.iqoption.welcomeonboarding.a.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0016"}, bng = {"Lcom/iqoption/welcomeonboarding/WelcomeProviderImpl;", "Lcom/iqoption/welcome/WelcomeProvider;", "()V", "getEmailRegistrationViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQEmailRegistrationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "isTrialEnding", "", "getFacebookAuthViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQFacebookAuthViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getGoogleAuthViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQGoogleAuthViewModel;", "getLoginViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQLoginViewModel;", "getSocialRegistrationViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQSocialRegistrationViewModel;", "getVerifyAuthViewModel", "Lcom/iqoption/welcomeonboarding/viewmodels/IQTwoStepAuthViewModel;", "Companion", "app_optionXRelease"})
/* compiled from: WelcomeProviderImpl.kt */
public final class b implements m {
    public static final a enW = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/welcomeonboarding/WelcomeProviderImpl$Companion;", "", "()V", "initWelcomeProvider", "", "app_optionXRelease"})
    /* compiled from: WelcomeProviderImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void bbK() {
            m.ekn.a(new b());
        }
    }

    public static final void bbK() {
        enW.bbK();
    }

    /* renamed from: g */
    public com.iqoption.welcomeonboarding.a.a e(Fragment fragment, boolean z) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return com.iqoption.welcomeonboarding.a.a.enX.h(fragment, z);
    }

    /* renamed from: bt */
    public e bl(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return e.eoe.bx(fragment);
    }

    /* renamed from: bu */
    public d bm(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return d.eoc.bw(fragment);
    }

    /* renamed from: bv */
    public f bn(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return f.eoi.by(fragment);
    }

    /* renamed from: P */
    public com.iqoption.welcomeonboarding.a.b L(FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        return com.iqoption.welcomeonboarding.a.b.eoa.R(fragmentActivity);
    }

    /* renamed from: Q */
    public c M(FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        return c.eob.S(fragmentActivity);
    }
}
