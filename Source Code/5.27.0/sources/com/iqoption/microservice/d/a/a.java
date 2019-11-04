package com.iqoption.microservice.d.a;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/* compiled from: OtnCoinBalance */
public final class a {
    @SerializedName("coins")
    private BigDecimal dGT;
    @SerializedName("potential_coins")
    private BigDecimal dGU;
    @SerializedName("commission_volume_enrolled")
    private Double dGV;
    @SerializedName("total_commission_volume_enrolled")
    private Double dGW;

    public BigDecimal aOp() {
        BigDecimal bigDecimal = this.dGT;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public BigDecimal HF() {
        BigDecimal bigDecimal = this.dGU;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal.scaleByPowerOfTen(-18);
    }

    public Double aOq() {
        return this.dGV;
    }

    public Double aOr() {
        return this.dGW;
    }

    public void d(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            this.dGT = bigDecimal.scaleByPowerOfTen(18);
        } else {
            this.dGT = null;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnCoinBalance{coins=");
        stringBuilder.append(this.dGT);
        stringBuilder.append(", potentialCoins=");
        stringBuilder.append(this.dGU);
        stringBuilder.append(", commissionVolumeEnrolled=");
        stringBuilder.append(this.dGV);
        stringBuilder.append(", totalCommissionVolumeEnrolled=");
        stringBuilder.append(this.dGW);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void l(Double d) {
        this.dGW = d;
    }

    public void m(Double d) {
        this.dGV = d;
    }
}
