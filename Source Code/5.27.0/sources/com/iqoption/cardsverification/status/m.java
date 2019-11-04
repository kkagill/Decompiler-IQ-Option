package com.iqoption.cardsverification.status;

import android.content.Context;
import android.widget.TextView;
import com.iqoption.cardsverification.g.f;
import com.iqoption.cardsverification.h;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.core.microservices.billing.verification.response.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, bng = {"setDescription", "", "textView", "Landroid/widget/TextView;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "cardsverification_release"})
/* compiled from: VerifyStatusFragment.kt */
public final class m {
    private static final void a(TextView textView, c cVar, CardStatus cardStatus) {
        Context context = textView.getContext();
        String string = d.abc().contains(cardStatus) ? context.getString(f.please_wait_until_your_card_is_verified) : cardStatus == CardStatus.DECLINED ? context.getString(h.a(cVar)) : null;
        if (string != null) {
            textView.setText(string);
        }
    }
}
