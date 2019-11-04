package com.iqoption.cardsverification.repository;

import com.iqoption.core.d;
import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: VerifyCardsRepository.kt */
final class VerifyCardsRepository$cardsStream$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<List<? extends c>>, List<? extends c>>> {
    public static final VerifyCardsRepository$cardsStream$2 aBJ = new VerifyCardsRepository$cardsStream$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "cards", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: VerifyCardsRepository.kt */
    static final class a<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final a aBK = new a();

        a() {
        }

        /* renamed from: a */
        public final List<c> apply(List<c> list, kotlin.jvm.a.b<? super List<c>, ? extends List<c>> bVar) {
            kotlin.jvm.internal.i.f(list, "cards");
            kotlin.jvm.internal.i.f(bVar, "mutator");
            return (List) bVar.invoke(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "updated", "apply"})
    /* compiled from: VerifyCardsRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b aBL = new b();

        b() {
        }

        /* renamed from: g */
        public final kotlin.jvm.a.b<List<c>, List<c>> apply(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "updated");
            return new VerifyCardsRepository$cardsStream$2$updates$1$1(cVar);
        }
    }

    VerifyCardsRepository$cardsStream$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<c>>, List<c>> invoke() {
        e bkO = com.iqoption.core.microservices.billing.verification.a.boJ.aT(d.EA().getUserId()).bkO();
        kotlin.jvm.internal.i.e(bkO, "VerificationRequests.req…            .toFlowable()");
        bkO = com.iqoption.core.rx.g.f(bkO);
        e g = com.iqoption.core.microservices.billing.verification.a.boJ.aaY().g(b.aBL);
        kotlin.jvm.internal.i.e(g, "VerificationRequests.get…      }\n                }");
        e cR = bkO.c((org.a.b) e.b((org.a.b) g, (org.a.b) a.aBH)).a(m.emptyList(), (io.reactivex.b.c) a.aBK).cR(1);
        ac acVar = ac.bkp;
        kotlin.jvm.internal.i.e(cR, "stream");
        return acVar.a("Verify cards", cR, 1, TimeUnit.MINUTES);
    }
}
