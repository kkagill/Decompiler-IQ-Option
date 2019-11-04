package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.risks.response.overnightfee.c;
import com.iqoption.core.rx.a.a;
import com.iqoption.core.util.z;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003`\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "invoke"})
/* compiled from: RisksRepository.kt */
final class RisksRepository$overnightFeeStreams$1 extends Lambda implements b<InstrumentType, a<z<Map<Integer, ? extends c>>, Map<Integer, ? extends c>>> {
    public static final RisksRepository$overnightFeeStreams$1 bed = new RisksRepository$overnightFeeStreams$1();

    RisksRepository$overnightFeeStreams$1() {
        super(1);
    }

    /* renamed from: A */
    public final a<z<Map<Integer, c>>, Map<Integer, c>> invoke(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        b risksRepository$overnightFeeStreams$1$streamFactory$1 = new RisksRepository$overnightFeeStreams$1$streamFactory$1(instrumentType);
        ac acVar = ac.bkp;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Overnight fee: ");
        stringBuilder.append(instrumentType);
        return ac.a(acVar, stringBuilder.toString(), risksRepository$overnightFeeStreams$1$streamFactory$1, com.iqoption.core.manager.i.bjd.Yq(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
