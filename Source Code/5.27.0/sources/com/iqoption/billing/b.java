package com.iqoption.billing;

import androidx.annotation.DrawableRes;
import com.iqoption.billing.i.a;
import io.card.payment.CardType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"cardIconResId", "", "type", "Lio/card/payment/CardType;", "(Lio/card/payment/CardType;)Ljava/lang/Integer;", "billing_release"})
/* compiled from: CardTypes.kt */
public final class b {
    @DrawableRes
    public static final Integer a(CardType cardType) {
        if (cardType != null) {
            int i = c.aob[cardType.ordinal()];
            if (i == 1) {
                return Integer.valueOf(a.ic_visa);
            }
            if (i == 2) {
                return Integer.valueOf(a.ic_master_card);
            }
            if (i == 3) {
                return Integer.valueOf(a.cio_ic_amex);
            }
            if (i == 4) {
                return Integer.valueOf(a.cio_ic_discover);
            }
            if (i == 5) {
                return Integer.valueOf(a.cio_ic_jcb);
            }
        }
        return null;
    }
}
