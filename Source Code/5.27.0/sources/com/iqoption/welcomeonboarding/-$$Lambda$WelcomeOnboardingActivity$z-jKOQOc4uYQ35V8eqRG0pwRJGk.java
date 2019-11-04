package com.iqoption.welcomeonboarding;

import androidx.lifecycle.Observer;
import com.iqoption.welcome.AuthDone;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$WelcomeOnboardingActivity$z-jKOQOc4uYQ35V8eqRG0pwRJGk implements Observer {
    private final /* synthetic */ WelcomeOnboardingActivity f$0;

    public /* synthetic */ -$$Lambda$WelcomeOnboardingActivity$z-jKOQOc4uYQ35V8eqRG0pwRJGk(WelcomeOnboardingActivity welcomeOnboardingActivity) {
        this.f$0 = welcomeOnboardingActivity;
    }

    public final void onChanged(Object obj) {
        this.f$0.c((AuthDone) obj);
    }
}
