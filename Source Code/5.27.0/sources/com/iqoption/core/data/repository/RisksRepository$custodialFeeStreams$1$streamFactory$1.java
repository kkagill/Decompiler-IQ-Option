package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.e;
import com.iqoption.core.microservices.risks.a;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "", "Lcom/iqoption/core/microservices/risks/response/custodialfee/CustodialFeeData;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: RisksRepository.kt */
final class RisksRepository$custodialFeeStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<Map<Integer, ? extends com.iqoption.core.microservices.risks.response.b.b>>> {
    final /* synthetic */ InstrumentType $instrumentType;

    RisksRepository$custodialFeeStreams$1$streamFactory$1(InstrumentType instrumentType) {
        this.$instrumentType = instrumentType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.b.b>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        return a.bxY.g(this.$instrumentType, eVar.Et()).t(AnonymousClass1.bec).bkO();
    }
}
