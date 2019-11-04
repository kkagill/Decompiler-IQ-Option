package com.iqoption.welcomeonboarding;

import androidx.fragment.app.FragmentManager;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcomeonboarding/TrialRegistrationDialogFactory;", "", "()V", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
/* compiled from: TrialRegistrationDialogFactory.kt */
public final class a {
    public static final a enO = new a();

    private a() {
    }

    public static final void d(FragmentManager fragmentManager) {
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        com.iqoption.welcome.register.a.a.emD.a(fragmentManager, R.id.other_fragment);
    }
}
