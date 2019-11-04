package com.iqoption.core.microservices.risks;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionEvent;", "invoke"})
/* compiled from: RisksRequests.kt */
final class RisksRequests$getCommissionsChanges$1 extends Lambda implements b<com.iqoption.core.microservices.risks.response.a.b, Boolean> {
    final /* synthetic */ InstrumentType $instrumentType;
    final /* synthetic */ long $userGroupId;

    RisksRequests$getCommissionsChanges$1(long j, InstrumentType instrumentType) {
        this.$userGroupId = j;
        this.$instrumentType = instrumentType;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(b((com.iqoption.core.microservices.risks.response.a.b) obj));
    }

    public final boolean b(com.iqoption.core.microservices.risks.response.a.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "it");
        return bVar.Et() == this.$userGroupId && bVar.getInstrumentType() == this.$instrumentType;
    }
}
