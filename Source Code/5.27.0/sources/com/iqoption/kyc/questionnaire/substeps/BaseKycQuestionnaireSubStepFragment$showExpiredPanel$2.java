package com.iqoption.kyc.questionnaire.substeps;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
final class BaseKycQuestionnaireSubStepFragment$showExpiredPanel$2 extends Lambda implements a<Boolean> {
    final /* synthetic */ a this$0;

    BaseKycQuestionnaireSubStepFragment$showExpiredPanel$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    public final boolean invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getBoolean("ARG_SHOW_EXPIRED_PANEL");
    }
}
