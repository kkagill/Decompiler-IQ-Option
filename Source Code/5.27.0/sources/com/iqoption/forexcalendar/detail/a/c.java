package com.iqoption.forexcalendar.detail.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapterItem;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "topAsset", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getTopAsset", "()Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "forexcalendar_release"})
/* compiled from: AssetAffectedAdapterItems.kt */
public final class c extends b {
    private final a anF;
    private final com.iqoption.core.microservices.f.a.a.a cTJ;

    public final a Jt() {
        return this.anF;
    }

    public final com.iqoption.core.microservices.f.a.a.a awQ() {
        return this.cTJ;
    }

    public c(a aVar, com.iqoption.core.microservices.f.a.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        super(aVar.getActiveId(), null);
        this.anF = aVar;
        this.cTJ = aVar2;
    }
}
