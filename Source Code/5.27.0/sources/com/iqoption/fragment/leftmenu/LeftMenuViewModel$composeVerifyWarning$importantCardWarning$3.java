package com.iqoption.fragment.leftmenu;

import com.iqoption.deposit.verification.VerificationState;
import com.iqoption.deposit.verification.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "invoke"})
/* compiled from: LeftMenuViewModel.kt */
final class LeftMenuViewModel$composeVerifyWarning$importantCardWarning$3 extends Lambda implements b<a, Boolean> {
    public static final LeftMenuViewModel$composeVerifyWarning$importantCardWarning$3 diX = new LeftMenuViewModel$composeVerifyWarning$importantCardWarning$3();

    LeftMenuViewModel$composeVerifyWarning$importantCardWarning$3() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((a) obj));
    }

    public final boolean a(a aVar) {
        return (aVar == null || aVar.ath() == VerificationState.OK) ? false : true;
    }
}
