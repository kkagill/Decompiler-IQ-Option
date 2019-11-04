package com.iqoption.fragment.leftmenu;

import android.app.Application;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.deposit.verification.a;
import com.iqoption.deposit.verification.f;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "it", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "invoke"})
/* compiled from: LeftMenuViewModel.kt */
final class LeftMenuViewModel$composeVerifyWarning$importantCardWarning$2 extends Lambda implements b<c, a> {
    final /* synthetic */ Application $context;
    final /* synthetic */ List $notVerifiedCards;

    LeftMenuViewModel$composeVerifyWarning$importantCardWarning$2(Application application, List list) {
        this.$context = application;
        this.$notVerifiedCards = list;
        super(1);
    }

    /* renamed from: l */
    public final a invoke(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "it");
        return f.a(this.$context, cVar, this.$notVerifiedCards);
    }
}
