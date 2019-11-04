package com.iqoption.core.microservices.tradingengine.response.b;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J#\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeveragesResult;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "leverages", "", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/util/List;)V", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "copy", "equals", "", "other", "getLeverages", "Landroid/util/SparseArray;", "getLeveragesMap", "", "", "hashCode", "toString", "", "core_release"})
@o
/* compiled from: LeveragesResult.kt */
public final class b {
    @SerializedName("leverages")
    private final List<a> bBl;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bBl, r3.bBl) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.b.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.tradingengine.response.b.b) r3;
        r0 = r2.instrumentType;
        r1 = r3.instrumentType;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bBl;
        r3 = r3.bBl;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        int i = 0;
        int hashCode = (instrumentType != null ? instrumentType.hashCode() : 0) * 31;
        List list = this.bBl;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LeveragesResult(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", leverages=");
        stringBuilder.append(this.bBl);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final Map<Integer, a> aiJ() {
        Iterable iterable = this.bBl;
        Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(Integer.valueOf(((a) next).getActiveId()), next);
        }
        return linkedHashMap;
    }
}
