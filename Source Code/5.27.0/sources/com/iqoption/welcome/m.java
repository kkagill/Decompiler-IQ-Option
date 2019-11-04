package com.iqoption.welcome;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.welcome.b.d;
import com.iqoption.welcome.d.b;
import com.iqoption.welcome.d.c;
import com.iqoption.welcome.register.social.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, bng = {"Lcom/iqoption/welcome/WelcomeProvider;", "", "getEmailRegistrationViewModel", "Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "isTrialEnding", "", "getFacebookAuthViewModel", "Lcom/iqoption/welcome/social/FacebookAuthViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getGoogleAuthViewModel", "Lcom/iqoption/welcome/social/GoogleAuthViewModel;", "getLoginViewModel", "Lcom/iqoption/welcome/login/LoginViewModel;", "getSocialRegistrationViewModel", "Lcom/iqoption/welcome/register/social/SocialRegistrationViewModel;", "getVerifyAuthViewModel", "Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel;", "Companion", "welcome_release"})
/* compiled from: WelcomeProvider.kt */
public interface m {
    public static final a ekn = a.ekp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/welcome/WelcomeProvider$Companion;", "", "()V", "instance", "Lcom/iqoption/welcome/WelcomeProvider;", "getInstance", "()Lcom/iqoption/welcome/WelcomeProvider;", "setInstance", "(Lcom/iqoption/welcome/WelcomeProvider;)V", "welcome_release"})
    /* compiled from: WelcomeProvider.kt */
    public static final class a {
        public static m eko;
        static final /* synthetic */ a ekp = new a();

        private a() {
        }

        public final void a(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "<set-?>");
            eko = mVar;
        }

        public final m aZw() {
            m mVar = eko;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return mVar;
        }
    }

    b L(FragmentActivity fragmentActivity);

    c M(FragmentActivity fragmentActivity);

    f bl(Fragment fragment);

    d bm(Fragment fragment);

    com.iqoption.welcome.twostepauth.b bn(Fragment fragment);

    com.iqoption.welcome.register.email.b e(Fragment fragment, boolean z);
}
