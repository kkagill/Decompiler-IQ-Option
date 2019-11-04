package com.iqoption.cardsverification.status;

import androidx.core.app.NotificationCompat;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.d;
import com.iqoption.core.ui.d.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyDetailsFragmentFactory;", "", "()V", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "cardsverification_release"})
/* compiled from: VerifyDetailsFragmentFactory.kt */
public final class h {
    public static final h aCv = new h();

    private h() {
    }

    public final c g(CardStatus cardStatus) {
        kotlin.jvm.internal.i.f(cardStatus, NotificationCompat.CATEGORY_STATUS);
        if (cardStatus == CardStatus.VERIFIED || cardStatus == CardStatus.DECLINED || d.abc().contains(cardStatus)) {
            return l.aCE.Lj();
        }
        return e.aCf.Lj();
    }
}
