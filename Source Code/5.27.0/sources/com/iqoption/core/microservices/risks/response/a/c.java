package com.iqoption.core.microservices.risks.response.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/risks/response/commission/CommissionsResult;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "userGroupId", "", "data", "", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "(Lcom/iqoption/core/data/model/InstrumentType;JLjava/util/List;)V", "getData", "()Ljava/util/List;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getUserGroupId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "update", "newCommissionData", "core_release"})
@o
/* compiled from: CommissionsResult.kt */
public final class c {
    @SerializedName("user_group_id")
    private final long aZx;
    @SerializedName("items")
    private final List<a> bxW;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public static /* synthetic */ c a(c cVar, InstrumentType instrumentType, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentType = cVar.instrumentType;
        }
        if ((i & 2) != 0) {
            j = cVar.aZx;
        }
        if ((i & 4) != 0) {
            list = cVar.bxW;
        }
        return cVar.a(instrumentType, j, list);
    }

    public final c a(InstrumentType instrumentType, long j, List<a> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "data");
        return new c(instrumentType, j, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, cVar.instrumentType)) {
                    if ((this.aZx == cVar.aZx ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bxW, cVar.bxW)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        int i = 0;
        int hashCode = (instrumentType != null ? instrumentType.hashCode() : 0) * 31;
        long j = this.aZx;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        List list = this.bxW;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommissionsResult(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", userGroupId=");
        stringBuilder.append(this.aZx);
        stringBuilder.append(", data=");
        stringBuilder.append(this.bxW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(InstrumentType instrumentType, long j, List<a> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "data");
        this.instrumentType = instrumentType;
        this.aZx = j;
        this.bxW = list;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final List<a> agZ() {
        return this.bxW;
    }
}
