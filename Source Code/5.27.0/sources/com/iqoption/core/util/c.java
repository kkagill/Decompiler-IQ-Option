package com.iqoption.core.util;

import com.iqoption.core.d;
import io.card.payment.CardType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007¨\u0006\n"}, bng = {"Lcom/iqoption/core/util/CardTypeUtils;", "", "()V", "formatCardNumber", "", "maskedCardNumber", "", "fromCardNumberSafe", "Lio/card/payment/CardType;", "number", "core_release"})
/* compiled from: CardTypeUtils.kt */
public final class c {
    public static final c bQl = new c();

    private c() {
    }

    public static final CardType hm(String str) {
        kotlin.jvm.internal.i.f(str, "number");
        try {
            str = CardType.fromCardNumber(str);
            return str;
        } catch (Exception unused) {
            return ((((CharSequence) str).length() > 0 ? 1 : null) == null || str.charAt(0) != '4') ? null : CardType.VISA;
        }
    }

    public final CharSequence hn(String str) {
        kotlin.jvm.internal.i.f(str, "maskedCardNumber");
        String str2 = d.EH().ej("card_mask_amazing_stars") ? "**** " : "•••• ";
        str = str.substring(str.length() - 4);
        kotlin.jvm.internal.i.e(str, "(this as java.lang.String).substring(startIndex)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
