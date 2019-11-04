package com.iqoption.cardsverification;

import androidx.annotation.StringRes;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.microservices.billing.verification.response.DeclineReason;
import com.iqoption.core.microservices.billing.verification.response.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, bng = {"getDeclinedDescription", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cardsverification_release"})
/* compiled from: VerifyCardExtentions.kt */
public final class h {
    @StringRes
    public static final int a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "$this$getDeclinedDescription");
        DeclineReason abb = cVar.abb();
        if (abb != null) {
            switch (i.aob[abb.ordinal()]) {
                case 1:
                    return f.your_card_is_not_signed;
                case 2:
                    return f.you_did_not_provide_us_with_the_back;
                case 3:
                    return f.you_did_not_provide_us_with_the_front;
                case 4:
                    return f.you_have_provided_us_with_black_and_white;
                case 5:
                    return f.you_have_provided_us_with_wrong_card;
                case 6:
                    return f.the_copy_of_your_card_is_blurry;
                case 7:
                    return f.we_were_not_able_to_see;
            }
        }
        return f.we_were_not_able_to_verify;
    }
}
