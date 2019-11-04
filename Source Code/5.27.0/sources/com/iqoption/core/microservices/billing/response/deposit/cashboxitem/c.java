package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import com.iqoption.core.microservices.billing.response.deposit.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getPayMethodId", "", "isKycRestricted", "", "processingTime", "Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "core_release"})
/* compiled from: PayMethod.kt */
public interface c extends a {

    @i(bne = {1, 1, 15})
    /* compiled from: PayMethod.kt */
    public static final class a {
        public static boolean a(c cVar) {
            return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.g(cVar);
        }

        public static String b(c cVar) {
            return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.h(cVar);
        }
    }

    long aaD();

    boolean aaE();

    g aaF();
}
