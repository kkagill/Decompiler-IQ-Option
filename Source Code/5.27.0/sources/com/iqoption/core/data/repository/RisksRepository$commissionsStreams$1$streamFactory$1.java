package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.e;
import com.iqoption.core.microservices.risks.response.a.c;
import io.reactivex.b.g;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: RisksRepository.kt */
final class RisksRepository$commissionsStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<Map<Integer, ? extends com.iqoption.core.microservices.risks.response.a.a>>> {
    final /* synthetic */ InstrumentType $instrumentType;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionsResult;", "update", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionEvent;", "apply"})
    /* compiled from: RisksRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bea = new a();

        a() {
        }

        /* renamed from: a */
        public final b<c, c> apply(com.iqoption.core.microservices.risks.response.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "update");
            return new RisksRepository$commissionsStreams$1$streamFactory$1$itemMutator$1$1(bVar);
        }
    }

    RisksRepository$commissionsStreams$1$streamFactory$1(InstrumentType instrumentType) {
        this.$instrumentType = instrumentType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.a.a>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        io.reactivex.e bkO = com.iqoption.core.microservices.risks.a.bxY.c(this.$instrumentType, eVar.Et()).bkO();
        kotlin.jvm.internal.i.e(bkO, "RisksRequests\n          …            .toFlowable()");
        bkO = com.iqoption.core.rx.g.f(bkO);
        io.reactivex.e g = com.iqoption.core.microservices.risks.a.bxY.d(this.$instrumentType, eVar.Et()).g(a.bea);
        kotlin.jvm.internal.i.e(g, "RisksRequests\n          …  }\n                    }");
        return io.reactivex.e.a((org.a.b) bkO, (org.a.b) g).a(new c(this.$instrumentType, eVar.Et(), m.emptyList()), (io.reactivex.b.c) AnonymousClass1.bdY).cR(1).g(AnonymousClass2.bdZ);
    }
}
