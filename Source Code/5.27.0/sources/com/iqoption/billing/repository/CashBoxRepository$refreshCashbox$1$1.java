package com.iqoption.billing.repository;

import com.iqoption.core.microservices.billing.response.crypto.a;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "invoke"})
/* compiled from: CashBoxRepository.kt */
final class CashBoxRepository$refreshCashbox$1$1 extends Lambda implements b<List<? extends a>, List<? extends a>> {
    final /* synthetic */ List $newDeposits;

    CashBoxRepository$refreshCashbox$1$1(List list) {
        this.$newDeposits = list;
        super(1);
    }

    /* renamed from: t */
    public final List<a> invoke(List<a> list) {
        kotlin.jvm.internal.i.f(list, "<anonymous parameter 0>");
        List list2 = this.$newDeposits;
        kotlin.jvm.internal.i.e(list2, "newDeposits");
        return list2;
    }
}
