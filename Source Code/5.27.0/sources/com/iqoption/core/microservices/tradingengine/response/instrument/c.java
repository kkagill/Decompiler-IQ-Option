package com.iqoption.core.microservices.tradingengine.response.instrument;

import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/ExpirationsResponse;", "", "type", "Lcom/iqoption/core/data/model/InstrumentType;", "underlying", "", "expirations", "", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/util/List;)V", "getExpirations", "()Ljava/util/List;", "getType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getUnderlying", "()Ljava/lang/String;", "core_release"})
/* compiled from: ExpirationsResponse.kt */
public final class c {
    private final List<a> bAj;
    private final InstrumentType type;
    private final String underlying;

    public c(InstrumentType instrumentType, String str, List<a> list) {
        kotlin.jvm.internal.i.f(instrumentType, "type");
        kotlin.jvm.internal.i.f(str, "underlying");
        kotlin.jvm.internal.i.f(list, "expirations");
        this.type = instrumentType;
        this.underlying = str;
        this.bAj = list;
    }
}
