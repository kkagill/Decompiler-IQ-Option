package com.iqoption.fragment.leftmenu;

import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "invoke"})
/* compiled from: LeftMenuViewModel.kt */
final class LeftMenuViewModel$composeVerifyWarning$importantCardWarning$1 extends Lambda implements b<c, Boolean> {
    final /* synthetic */ boolean $hasAuthAmount;

    LeftMenuViewModel$composeVerifyWarning$importantCardWarning$1(boolean z) {
        this.$hasAuthAmount = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(j((c) obj));
    }

    public final boolean j(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "it");
        return this.$hasAuthAmount || cVar.Lq() == CardStatus.DECLINED;
    }
}
