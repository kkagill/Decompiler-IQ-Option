package com.iqoption.kyc.profile;

import com.iqoption.kyc.profile.steps.ProfileStep;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "invoke"})
/* compiled from: KycProfileSelectionViewModel.kt */
final class KycProfileSelectionViewModel$selectNextProfileStep$next$1 extends Lambda implements b<ProfileStep, Boolean> {
    final /* synthetic */ d this$0;

    KycProfileSelectionViewModel$selectNextProfileStep$next$1(d dVar) {
        this.this$0 = dVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(e((ProfileStep) obj));
    }

    public final boolean e(ProfileStep profileStep) {
        kotlin.jvm.internal.i.f(profileStep, "it");
        return this.this$0.d(profileStep);
    }
}
