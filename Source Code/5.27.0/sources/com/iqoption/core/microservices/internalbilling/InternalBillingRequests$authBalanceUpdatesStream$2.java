package com.iqoption.core.microservices.internalbilling;

import com.iqoption.core.d;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/internalbilling/response/AuthBalanceChanged;", "invoke"})
/* compiled from: InternalBillingRequests.kt */
final class InternalBillingRequests$authBalanceUpdatesStream$2 extends Lambda implements a<e<com.iqoption.core.microservices.internalbilling.a.a>> {
    public static final InternalBillingRequests$authBalanceUpdatesStream$2 btX = new InternalBillingRequests$authBalanceUpdatesStream$2();

    InternalBillingRequests$authBalanceUpdatesStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<com.iqoption.core.microservices.internalbilling.a.a> invoke() {
        return d.EW().b("auth-balance-changed", com.iqoption.core.microservices.internalbilling.a.a.class).HQ();
    }
}
