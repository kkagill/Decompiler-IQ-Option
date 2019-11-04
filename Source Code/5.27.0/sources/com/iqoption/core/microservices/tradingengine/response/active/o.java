package com.iqoption.core.microservices.tradingengine.response.active;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import java.util.Map;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J#\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/UnderlyingResult;", "", "()V", "type", "Lcom/iqoption/core/data/model/InstrumentType;", "_instruments", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/util/List;)V", "instruments", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getInstruments", "()Ljava/util/Map;", "instruments$delegate", "Lkotlin/Lazy;", "getType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "copy", "equals", "", "other", "fillInstrumentType", "active", "hashCode", "instrumentList", "toString", "", "core_release"})
@com.iqoption.core.util.o
/* compiled from: UnderlyingResult.kt */
public final class o {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(o.class), "instruments", "getInstruments()Ljava/util/Map;"))};
    private final transient d bAm;
    @SerializedName("underlying")
    private final List<j> bAn;
    @SerializedName("type")
    private final InstrumentType type;

    public final Map<Integer, a> aie() {
        d dVar = this.bAm;
        j jVar = anY[0];
        return (Map) dVar.getValue();
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bAn, r3.bAn) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.active.o;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.tradingengine.response.active.o) r3;
        r0 = r2.type;
        r1 = r3.type;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bAn;
        r3 = r3.bAn;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.active.o.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        InstrumentType instrumentType = this.type;
        int i = 0;
        int hashCode = (instrumentType != null ? instrumentType.hashCode() : 0) * 31;
        List list = this.bAn;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnderlyingResult(type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", _instruments=");
        stringBuilder.append(this.bAn);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public o(InstrumentType instrumentType, List<j> list) {
        kotlin.jvm.internal.i.f(instrumentType, "type");
        kotlin.jvm.internal.i.f(list, "_instruments");
        this.type = instrumentType;
        this.bAn = list;
        this.bAm = g.c(new UnderlyingResult$instruments$2(this));
    }

    public final InstrumentType aif() {
        return this.type;
    }

    public o() {
        this(InstrumentType.UNKNOWN, m.emptyList());
    }

    private final j a(j jVar, InstrumentType instrumentType) {
        jVar.M(instrumentType);
        for (j jVar2 : jVar.aib()) {
            jVar2.M(instrumentType);
            jVar2.eY(jVar.getActiveId());
            jVar2.y(jVar);
        }
        return jVar;
    }
}
