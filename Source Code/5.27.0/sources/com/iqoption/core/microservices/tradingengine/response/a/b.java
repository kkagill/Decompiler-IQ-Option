package com.iqoption.core.microservices.tradingengine.response.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J'\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006`\u0013J\t\u0010\u0014\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/commision/CommissionSettingsResult;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "commissions", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/util/ArrayList;)V", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "copy", "equals", "", "other", "getResult", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "hashCode", "toString", "", "core_release"})
/* compiled from: CommissionSettingsResult.kt */
public final class b {
    @SerializedName("commissions")
    private final ArrayList<a> atv;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public b() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.atv, r3.atv) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.a.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.tradingengine.response.a.b) r3;
        r0 = r2.instrumentType;
        r1 = r3.instrumentType;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.atv;
        r3 = r3.atv;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.a.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        int i = 0;
        int hashCode = (instrumentType != null ? instrumentType.hashCode() : 0) * 31;
        ArrayList arrayList = this.atv;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommissionSettingsResult(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", commissions=");
        stringBuilder.append(this.atv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(InstrumentType instrumentType, ArrayList<a> arrayList) {
        this.instrumentType = instrumentType;
        this.atv = arrayList;
    }

    public /* synthetic */ b(InstrumentType instrumentType, ArrayList arrayList, int i, f fVar) {
        if ((i & 1) != 0) {
            instrumentType = (InstrumentType) null;
        }
        if ((i & 2) != 0) {
            arrayList = (ArrayList) null;
        }
        this(instrumentType, arrayList);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final HashMap<Integer, a> aiu() {
        HashMap hashMap = new HashMap(c.T(this.instrumentType));
        ArrayList arrayList = this.atv;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.aiq() != null) {
                    Map map = hashMap;
                    Integer aiq = aVar.aiq();
                    kotlin.jvm.internal.i.e(aVar, "current");
                    map.put(aiq, aVar);
                }
            }
        }
        return hashMap;
    }
}
