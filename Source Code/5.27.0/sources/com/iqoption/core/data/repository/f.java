package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.risks.response.a.a;
import com.iqoption.core.microservices.risks.response.overnightfee.c;
import com.iqoption.core.rx.a.b;
import com.iqoption.core.util.z;
import io.reactivex.e;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00102\u0006\u0010\u0011\u001a\u00020\u0005J \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00070\u00102\u0006\u0010\u0011\u001a\u00020\u0005J \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00102\u0006\u0010\u0011\u001a\u00020\u0005RZ\u0010\u0003\u001aN\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0004j\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007`\nX\u0004¢\u0006\u0002\n\u0000RZ\u0010\u000b\u001aN\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00070\u0004j\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007`\nX\u0004¢\u0006\u0002\n\u0000RZ\u0010\r\u001aN\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0004j\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0007`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/data/repository/RisksRepository;", "", "()V", "commissionsStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "custodialFeeStreams", "Lcom/iqoption/core/microservices/risks/response/custodialfee/CustodialFeeData;", "overnightFeeStreams", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "getCommissions", "Lio/reactivex/Flowable;", "instrumentType", "getCustodialFee", "getOvernightFee", "core_release"})
/* compiled from: RisksRepository.kt */
public final class f {
    private static final b<InstrumentType, z<Map<Integer, a>>, Map<Integer, a>> bdT = new b(RisksRepository$commissionsStreams$1.bdX);
    private static final b<InstrumentType, z<Map<Integer, c>>, Map<Integer, c>> bdU = new b(RisksRepository$overnightFeeStreams$1.bed);
    private static final b<InstrumentType, z<Map<Integer, com.iqoption.core.microservices.risks.response.b.b>>, Map<Integer, com.iqoption.core.microservices.risks.response.b.b>> bdV = new b(RisksRepository$custodialFeeStreams$1.beb);
    public static final f bdW = new f();

    private f() {
    }

    public final e<Map<Integer, a>> r(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return bdT.bR(instrumentType);
    }

    public final e<Map<Integer, c>> E(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        int i = g.aob[instrumentType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return bdU.bR(instrumentType);
        }
        e<Map<Integer, c>> cD = e.cD(af.emptyMap());
        kotlin.jvm.internal.i.e(cD, "Flowable.just(mapOf())");
        return cD;
    }

    public final e<Map<Integer, com.iqoption.core.microservices.risks.response.b.b>> F(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        if (g.axg[instrumentType.ordinal()] == 1) {
            return bdV.bR(instrumentType);
        }
        e<Map<Integer, com.iqoption.core.microservices.risks.response.b.b>> cD = e.cD(af.emptyMap());
        kotlin.jvm.internal.i.e(cD, "Flowable.just(mapOf())");
        return cD;
    }
}
