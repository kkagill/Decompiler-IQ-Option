package com.iqoption.core.microservices.risks.response.overnightfee;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFee;", "", "()V", "userGroupId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "items", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "(JLcom/iqoption/core/data/model/InstrumentType;Ljava/util/List;)V", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getItems", "()Ljava/util/List;", "getUserGroupId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: OvernightFee.kt */
public final class b {
    @SerializedName("user_group_id")
    private final long aZx;
    @SerializedName("items")
    private final List<c> iA;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!((this.aZx == bVar.aZx ? 1 : null) != null && kotlin.jvm.internal.i.y(this.instrumentType, bVar.instrumentType) && kotlin.jvm.internal.i.y(this.iA, bVar.iA))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.aZx;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        InstrumentType instrumentType = this.instrumentType;
        int i2 = 0;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        List list = this.iA;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OvernightFee(userGroupId=");
        stringBuilder.append(this.aZx);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(long j, InstrumentType instrumentType, List<c> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "items");
        this.aZx = j;
        this.instrumentType = instrumentType;
        this.iA = list;
    }

    public /* synthetic */ b(long j, InstrumentType instrumentType, List list, int i, f fVar) {
        if ((i & 1) != 0) {
            j = -1;
        }
        if ((i & 2) != 0) {
            instrumentType = InstrumentType.UNKNOWN;
        }
        if ((i & 4) != 0) {
            list = m.emptyList();
        }
        this(j, instrumentType, list);
    }

    public final List<c> getItems() {
        return this.iA;
    }

    public b() {
        this(-1, null, null, 6, null);
    }
}
