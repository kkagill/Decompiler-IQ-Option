package com.iqoption.core.microservices.risks.response.b;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/microservices/risks/response/custodialfee/CustodialPeriod;", "", "()V", "age", "", "percent", "", "(ID)V", "getAge", "()I", "getPercent", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: CustodialPeriod.kt */
public final class c {
    @SerializedName("percent")
    private final double aug;
    @SerializedName("age")
    private final int byo;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.byo == cVar.byo ? 1 : null) == null || Double.compare(this.aug, cVar.aug) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.byo * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.aug);
        return i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustodialPeriod(age=");
        stringBuilder.append(this.byo);
        stringBuilder.append(", percent=");
        stringBuilder.append(this.aug);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(int i, double d) {
        this.byo = i;
        this.aug = d;
    }

    public final int ahg() {
        return this.byo;
    }

    public /* synthetic */ c(int i, double d, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            d = 0.0d;
        }
        this(i, d);
    }

    public final double agx() {
        return this.aug;
    }

    public c() {
        this(0, 0.0d, 2, null);
    }
}
