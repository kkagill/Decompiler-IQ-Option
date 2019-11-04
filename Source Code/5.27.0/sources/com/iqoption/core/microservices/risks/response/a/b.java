package com.iqoption.core.microservices.risks.response.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/risks/response/commission/CommissionEvent;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "userGroupId", "", "activeId", "", "commission", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "(Lcom/iqoption/core/data/model/InstrumentType;JILcom/iqoption/core/microservices/risks/response/commission/CommissionData;)V", "getActiveId", "()I", "getCommission", "()Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getUserGroupId", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
@o
/* compiled from: CommissionEvent.kt */
public final class b {
    @SerializedName("user_group_id")
    private final long aZx;
    @SerializedName("active_id")
    private final int activeId;
    @SerializedName("commission")
    private final a bym;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, bVar.instrumentType)) {
                    if ((this.aZx == bVar.aZx ? 1 : null) != null) {
                        if ((this.activeId == bVar.activeId ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bym, bVar.bym)) {
                            return false;
                        }
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
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.activeId) * 31;
        a aVar = this.bym;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommissionEvent(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", userGroupId=");
        stringBuilder.append(this.aZx);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", commission=");
        stringBuilder.append(this.bym);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final long Et() {
        return this.aZx;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final a ahe() {
        return this.bym;
    }
}
