package com.iqoption.core.microservices.internalbilling;

import com.iqoption.core.d;
import com.iqoption.core.microservices.internalbilling.a.c;
import io.reactivex.b.g;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: InternalBillingRequests.kt */
final class InternalBillingRequests$balanceUpdatesStream$2 extends Lambda implements kotlin.jvm.a.a<e<com.iqoption.core.microservices.b<com.iqoption.core.microservices.internalbilling.a.b>>> {
    public static final InternalBillingRequests$balanceUpdatesStream$2 btY = new InternalBillingRequests$balanceUpdatesStream$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "it", "apply"})
    /* compiled from: InternalBillingRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a btZ = new a();

        a() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.b<com.iqoption.core.microservices.internalbilling.a.b> apply(com.iqoption.core.microservices.internalbilling.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return new com.iqoption.core.microservices.b(1, bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "it", "Lcom/iqoption/core/microservices/internalbilling/response/BalanceChanged;", "apply"})
    /* compiled from: InternalBillingRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b bua = new b();

        b() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.b<com.iqoption.core.microservices.internalbilling.a.b> apply(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            com.iqoption.core.microservices.internalbilling.a.b aer = cVar.aer();
            if (aer == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return new com.iqoption.core.microservices.b(2, aer);
        }
    }

    InternalBillingRequests$balanceUpdatesStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<com.iqoption.core.microservices.b<com.iqoption.core.microservices.internalbilling.a.b>> invoke() {
        kotlin.jvm.internal.i.e(d.EW().b("balance-created", com.iqoption.core.microservices.internalbilling.a.b.class).HO().HQ().g(a.btZ), "eventBuilderFactory\n    …Event.TYPE_CREATED, it) }");
        kotlin.jvm.internal.i.e(d.EW().b("balance-changed", c.class).HO().HQ().g(b.bua), "eventBuilderFactory\n    …D, it.currentBalance!!) }");
        return e.H(m.listOf(r0, r1)).blb();
    }
}
