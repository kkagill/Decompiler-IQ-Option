package com.iqoption.microservice.d.a;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/* compiled from: OtnOperation */
public final class d {
    @SerializedName("diff")
    private BigDecimal dHc;
    @SerializedName("time")
    private long time;
    @SerializedName("operation_type")
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void e(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            this.dHc = bigDecimal.scaleByPowerOfTen(18);
        } else {
            this.dHc = null;
        }
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnOperation{type='");
        stringBuilder.append(this.type);
        stringBuilder.append('\'');
        stringBuilder.append(", diff=");
        stringBuilder.append(this.dHc);
        stringBuilder.append(", time=");
        stringBuilder.append(this.time);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
