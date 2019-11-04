package com.iqoption.cardsverification.repository;

import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cards", "invoke"})
/* compiled from: VerifyCardsRepository.kt */
final class VerifyCardsRepository$cardsStream$2$updates$1$1 extends Lambda implements b<List<? extends c>, List<? extends c>> {
    final /* synthetic */ c $updated;

    VerifyCardsRepository$cardsStream$2$updates$1$1(c cVar) {
        this.$updated = cVar;
        super(1);
    }

    /* renamed from: t */
    public final List<c> invoke(List<c> list) {
        kotlin.jvm.internal.i.f(list, "cards");
        int i = 0;
        for (c id : list) {
            if ((id.getId() == this.$updated.getId() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return com.iqoption.core.ext.c.a((List) list, i, this.$updated);
        }
        return com.iqoption.core.ext.c.a((List) list, this.$updated, 0, 2, null);
    }
}
