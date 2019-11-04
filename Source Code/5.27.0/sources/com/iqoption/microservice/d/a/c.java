package com.iqoption.microservice.d.a;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/* compiled from: OtnEmissionSummary */
public final class c {
    @SerializedName("total_coins")
    private BigDecimal dGY;
    @SerializedName("total_emitted")
    private BigDecimal dGZ;
    @SerializedName("last_emission")
    private BigDecimal dHa;
    @SerializedName("next_emission")
    private BigDecimal dHb;

    public BigDecimal aOt() {
        BigDecimal bigDecimal = this.dGY;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public BigDecimal HJ() {
        BigDecimal bigDecimal = this.dGZ;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public BigDecimal HL() {
        BigDecimal bigDecimal = this.dHa;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public BigDecimal HK() {
        BigDecimal bigDecimal = this.dHb;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnEmissionSummary{totalEmitted=");
        stringBuilder.append(this.dGZ);
        stringBuilder.append(", lastEmission=");
        stringBuilder.append(this.dHa);
        stringBuilder.append(", nextEmission=");
        stringBuilder.append(this.dHb);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
