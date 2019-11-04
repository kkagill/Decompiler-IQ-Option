package com.iqoption.core.microservices.tradingengine.response.custodial;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/custodial/CustordialHistory;", "", "()V", "positionId", "", "age", "", "percent", "", "countDelta", "amountDelta", "filledAt", "(JIDDDJ)V", "getAge", "()I", "getAmountDelta", "()D", "getCountDelta", "getFilledAt", "()J", "getPercent", "getPositionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "List", "core_release"})
/* compiled from: CustordialHistory.kt */
public final class CustordialHistory {
    @SerializedName("amount_delta")
    private final double amountDelta;
    @SerializedName("percent")
    private final double aug;
    @SerializedName("count_delta")
    private final double bAF;
    @SerializedName("age")
    private final int byo;
    @SerializedName("filled_at")
    private final long filledAt;
    @SerializedName("position_id")
    private final long positionId;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/custodial/CustordialHistory$List;", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/tradingengine/response/custodial/CustordialHistory;", "Lkotlin/collections/ArrayList;", "()V", "core_release"})
    /* compiled from: CustordialHistory.kt */
    public static final class List extends ArrayList<CustordialHistory> {
        public boolean a(CustordialHistory custordialHistory) {
            return super.contains(custordialHistory);
        }

        public int b(CustordialHistory custordialHistory) {
            return super.indexOf(custordialHistory);
        }

        public int c(CustordialHistory custordialHistory) {
            return super.lastIndexOf(custordialHistory);
        }

        public final boolean contains(Object obj) {
            return obj instanceof CustordialHistory ? a((CustordialHistory) obj) : false;
        }

        public boolean d(CustordialHistory custordialHistory) {
            return super.remove(custordialHistory);
        }

        public int getSize() {
            return super.size();
        }

        public final int indexOf(Object obj) {
            return obj instanceof CustordialHistory ? b((CustordialHistory) obj) : -1;
        }

        public final int lastIndexOf(Object obj) {
            return obj instanceof CustordialHistory ? c((CustordialHistory) obj) : -1;
        }

        public final boolean remove(Object obj) {
            return obj instanceof CustordialHistory ? d((CustordialHistory) obj) : false;
        }

        public final int size() {
            return getSize();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustordialHistory) {
                CustordialHistory custordialHistory = (CustordialHistory) obj;
                if ((this.positionId == custordialHistory.positionId ? 1 : null) != null) {
                    if ((this.byo == custordialHistory.byo ? 1 : null) != null && Double.compare(this.aug, custordialHistory.aug) == 0 && Double.compare(this.bAF, custordialHistory.bAF) == 0 && Double.compare(this.amountDelta, custordialHistory.amountDelta) == 0) {
                        if ((this.filledAt == custordialHistory.filledAt ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.positionId;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.byo) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.aug);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bAF);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.amountDelta);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.filledAt;
        return i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustordialHistory(positionId=");
        stringBuilder.append(this.positionId);
        stringBuilder.append(", age=");
        stringBuilder.append(this.byo);
        stringBuilder.append(", percent=");
        stringBuilder.append(this.aug);
        stringBuilder.append(", countDelta=");
        stringBuilder.append(this.bAF);
        stringBuilder.append(", amountDelta=");
        stringBuilder.append(this.amountDelta);
        stringBuilder.append(", filledAt=");
        stringBuilder.append(this.filledAt);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CustordialHistory(long j, int i, double d, double d2, double d3, long j2) {
        this.positionId = j;
        this.byo = i;
        this.aug = d;
        this.bAF = d2;
        this.amountDelta = d3;
        this.filledAt = j2;
    }

    public final double aiv() {
        return this.amountDelta;
    }

    public /* synthetic */ CustordialHistory(long j, int i, double d, double d2, double d3, long j2, int i2, f fVar) {
        long j3 = (i2 & 1) != 0 ? -1 : j;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        double d4 = 0.0d;
        double d5 = (i2 & 4) != 0 ? 0.0d : d;
        double d6 = (i2 & 8) != 0 ? 0.0d : d2;
        if ((i2 & 16) == 0) {
            d4 = d3;
        }
        this(j3, i3, d5, d6, d4, (i2 & 32) != 0 ? 0 : j2);
    }

    public final long aiw() {
        return this.filledAt;
    }

    public CustordialHistory() {
        this(-1, 0, 0.0d, 0.0d, 0.0d, 0, 62, null);
    }
}
