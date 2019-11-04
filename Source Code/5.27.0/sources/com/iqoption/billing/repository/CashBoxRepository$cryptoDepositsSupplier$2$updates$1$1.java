package com.iqoption.billing.repository;

import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.billing.response.crypto.a;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "deposits", "invoke"})
/* compiled from: CashBoxRepository.kt */
final class CashBoxRepository$cryptoDepositsSupplier$2$updates$1$1 extends Lambda implements b<List<? extends a>, List<? extends a>> {
    final /* synthetic */ a $updated;

    CashBoxRepository$cryptoDepositsSupplier$2$updates$1$1(a aVar) {
        this.$updated = aVar;
        super(1);
    }

    /* renamed from: t */
    public final List<a> invoke(List<a> list) {
        kotlin.jvm.internal.i.f(list, "deposits");
        int i = 0;
        for (a ZF : list) {
            if ((ZF.ZF() == this.$updated.ZF() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return c.a((List) list, i, this.$updated);
        }
        return c.a((List) list, this.$updated, 0);
    }
}
