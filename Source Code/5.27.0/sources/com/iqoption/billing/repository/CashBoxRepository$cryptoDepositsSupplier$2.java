package com.iqoption.billing.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.billing.response.crypto.d;
import com.iqoption.core.util.z;
import io.reactivex.b.c;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: CashBoxRepository.kt */
final class CashBoxRepository$cryptoDepositsSupplier$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<List<? extends com.iqoption.core.microservices.billing.response.crypto.a>>, List<? extends com.iqoption.core.microservices.billing.response.crypto.a>>> {
    public static final CashBoxRepository$cryptoDepositsSupplier$2 azd = new CashBoxRepository$cryptoDepositsSupplier$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "deposits", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: CashBoxRepository.kt */
    static final class a<T1, T2, R> implements c<R, T, R> {
        public static final a aze = new a();

        a() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.billing.response.crypto.a> apply(List<com.iqoption.core.microservices.billing.response.crypto.a> list, kotlin.jvm.a.b<? super List<com.iqoption.core.microservices.billing.response.crypto.a>, ? extends List<com.iqoption.core.microservices.billing.response.crypto.a>> bVar) {
            kotlin.jvm.internal.i.f(list, "deposits");
            kotlin.jvm.internal.i.f(bVar, "mutator");
            return (List) bVar.invoke(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "it", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "apply"})
    /* compiled from: CashBoxRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b azf = new b();

        b() {
        }

        /* renamed from: a */
        public final kotlin.jvm.a.b<List<com.iqoption.core.microservices.billing.response.crypto.a>, List<com.iqoption.core.microservices.billing.response.crypto.a>> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return new CashBoxRepository$cryptoDepositsSupplier$2$updates$1$1(dVar.aaf());
        }
    }

    CashBoxRepository$cryptoDepositsSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.billing.response.crypto.a>>, List<com.iqoption.core.microservices.billing.response.crypto.a>> invoke() {
        e bkO = com.iqoption.core.microservices.billing.a.bmi.Zu().bkO();
        kotlin.jvm.internal.i.e(bkO, "CashBoxRequests.getCrypt…            .toFlowable()");
        bkO = com.iqoption.core.rx.g.f(bkO);
        e g = com.iqoption.core.microservices.billing.a.bmi.Zv().g(b.azf);
        kotlin.jvm.internal.i.e(g, "CashBoxRequests.getCrypt…      }\n                }");
        e cR = bkO.c((org.a.b) e.b((org.a.b) g, (org.a.b) a.ayW)).a(m.emptyList(), (c) a.aze).cR(1);
        ac acVar = ac.bkp;
        kotlin.jvm.internal.i.e(cR, "stream");
        return ac.a(acVar, "Crypto deposits", cR, 0, null, 12, null);
    }
}
