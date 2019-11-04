package com.iqoption.cardsverification.repository;

import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cards", "invoke"})
/* compiled from: VerifyCardsRepository.kt */
final class VerifyCardsRepository$setVerifyCardUploaded$1$1 extends Lambda implements b<List<? extends c>, List<? extends c>> {
    final /* synthetic */ CardStatus $newStatus;
    final /* synthetic */ a this$0;

    VerifyCardsRepository$setVerifyCardUploaded$1$1(a aVar, CardStatus cardStatus) {
        this.this$0 = aVar;
        this.$newStatus = cardStatus;
        super(1);
    }

    /* renamed from: t */
    public final List<c> invoke(List<c> list) {
        kotlin.jvm.internal.i.f(list, "cards");
        a aVar = a.aBI;
        c cVar = this.this$0.aBM;
        CardStatus cardStatus = this.$newStatus;
        kotlin.jvm.internal.i.e(cardStatus, "newStatus");
        return aVar.a(list, cVar, cardStatus);
    }
}
