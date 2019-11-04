package com.iqoption.protrader;

import com.iqoption.core.manager.ac;
import com.iqoption.core.rx.a.a;
import com.iqoption.core.util.z;
import io.reactivex.e;
import java.util.concurrent.Future;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001j\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/microservice/regulators/response/ProTraderApplicationStatus;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "it", "", "invoke"})
/* compiled from: RegulatorsRepository.kt */
final class RegulatorsRepository$positionsStreams$1 extends Lambda implements b<Long, a<z<com.iqoption.microservice.regulators.response.a>, com.iqoption.microservice.regulators.response.a>> {
    public static final RegulatorsRepository$positionsStreams$1 dQu = new RegulatorsRepository$positionsStreams$1();

    RegulatorsRepository$positionsStreams$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return cd(((Number) obj).longValue());
    }

    public final a<z<com.iqoption.microservice.regulators.response.a>, com.iqoption.microservice.regulators.response.a> cd(long j) {
        e c = e.c((Future) com.iqoption.microservice.regulators.a.dHd.aOw());
        kotlin.jvm.internal.i.e(c, "Flowable.fromFuture(Regu…raderApplicationStatus())");
        e aOx = com.iqoption.microservice.regulators.a.dHd.aOx();
        ac acVar = ac.bkp;
        e c2 = c.c((org.a.b) aOx);
        kotlin.jvm.internal.i.e(c2, "initial.concatWith(updates)");
        return ac.a(acVar, "ProTraderApplicationStatus", c2, 0, null, 12, null);
    }
}
