package com.iqoption.protrader;

import com.iqoption.core.rx.a.b;
import com.iqoption.core.util.z;
import com.iqoption.microservice.regulators.response.a;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/protrader/RegulatorsRepository;", "", "()V", "positionsStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/microservice/regulators/response/ProTraderApplicationStatus;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "getProTraderApplicationStatus", "Lio/reactivex/Flowable;", "userId", "getProTraderNotification", "Lio/reactivex/Single;", "Lcom/iqoption/microservice/regulators/response/ProTraderNotification;", "app_optionXRelease"})
/* compiled from: RegulatorsRepository.kt */
public final class g {
    private static final b<Long, z<a>, a> dQs = new b(RegulatorsRepository$positionsStreams$1.dQu);
    public static final g dQt = new g();

    private g() {
    }

    public final e<a> cc(long j) {
        return dQs.bR(Long.valueOf(j));
    }

    public final p<com.iqoption.microservice.regulators.response.b> aSX() {
        p d = p.d(com.iqoption.microservice.regulators.a.dHd.aOv());
        kotlin.jvm.internal.i.e(d, "Single.fromFuture(Regula…tProTraderNotification())");
        return d;
    }
}
