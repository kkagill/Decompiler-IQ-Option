package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/PayoutLimit;", "", "()V", "absolute", "", "percent", "", "(DI)V", "getAbsolute", "()D", "getPercent", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: PayoutLimit.kt */
public final class b {
    @SerializedName("absolute")
    private final double bCi;
    @SerializedName("percent")
    private final int percent;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Double.compare(this.bCi, bVar.bCi) == 0) {
                    if ((this.percent == bVar.percent ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.bCi);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + this.percent;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayoutLimit(absolute=");
        stringBuilder.append(this.bCi);
        stringBuilder.append(", percent=");
        stringBuilder.append(this.percent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(double d, int i) {
        this.bCi = d;
        this.percent = i;
    }

    public /* synthetic */ b(double d, int i, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            d = 0.0d;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(d, i);
    }

    public b() {
        this(0.0d, 0, 2, null);
    }
}
