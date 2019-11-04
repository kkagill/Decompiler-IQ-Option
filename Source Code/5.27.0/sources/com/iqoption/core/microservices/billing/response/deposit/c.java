package com.iqoption.core.microservices.billing.response.deposit;

import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\t*\u00020\n\u001a\n\u0010\f\u001a\u00020\t*\u00020\n\u001a\n\u0010\r\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000e\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\t*\u00020\n\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"ADD_NEW_CARD_METHODS", "", "", "CARD_UI_METHODS", "CRYPTO_METHODS", "GOOGLE_PAY_METHODS", "HIDDEN_CARD_SCAN_METHODS", "HIDDEN_HOLDER_METHODS", "isGooglePayMethod", "", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "isNewCard", "shouldHideCardHolder", "shouldHideCardScan", "shouldShowCardUi", "shouldShowCryptoUi", "core_release"})
/* compiled from: CashboxItemExtensions.kt */
public final class c {
    private static final List<String> bnA;
    private static final List<String> bnB;
    private static final List<String> bnC = l.listOf("crypto_to_fiat");
    private static final List<String> bnD = l.listOf("worldpay_google_pay");
    private static final List<String> bny;
    private static final List<String> bnz;

    static {
        String str = "bank_card";
        bny = l.listOf(str);
        String str2 = "astropay_card";
        bnz = m.listOf(str, str2);
        bnA = l.listOf(str2);
        bnB = l.listOf(str2);
    }

    public static final boolean a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$isNewCard");
        return (aVar instanceof d) && u.b((Iterable) bny, (Object) ((d) aVar).aaG());
    }

    public static final boolean b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$shouldShowCardUi");
        return (aVar instanceof d) && u.b((Iterable) bnz, (Object) ((d) aVar).aaG());
    }

    public static final boolean c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$shouldHideCardHolder");
        return (aVar instanceof d) && u.b((Iterable) bnA, (Object) ((d) aVar).aaG());
    }

    public static final boolean d(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$shouldHideCardScan");
        return (aVar instanceof d) && u.b((Iterable) bnB, (Object) ((d) aVar).aaG());
    }

    public static final boolean e(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$shouldShowCryptoUi");
        return (aVar instanceof d) && u.b((Iterable) bnC, (Object) ((d) aVar).aaG());
    }

    public static final boolean f(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$isGooglePayMethod");
        return (aVar instanceof d) && u.b((Iterable) bnD, (Object) ((d) aVar).aaG());
    }
}
