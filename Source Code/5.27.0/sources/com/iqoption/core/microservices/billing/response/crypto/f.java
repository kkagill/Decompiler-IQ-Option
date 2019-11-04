package com.iqoption.core.microservices.billing.response.crypto;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b,\b\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%Jr\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0002\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R*\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00069"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;", "", "isSuccessful", "", "maxLimits", "", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CurrencyLimit;", "currentLimit", "", "amlRestricted", "limitExhausted", "cryptoRateFixInterval", "", "previousRefundWallet", "minorUnits", "(Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Float;ZZILjava/lang/String;Ljava/lang/Integer;)V", "getAmlRestricted", "()Z", "setAmlRestricted", "(Z)V", "getCryptoRateFixInterval", "()I", "getCurrentLimit", "()Ljava/lang/Float;", "setCurrentLimit", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLimitExhausted", "setLimitExhausted", "getMaxLimits", "()Ljava/util/Map;", "setMaxLimits", "(Ljava/util/Map;)V", "getMinorUnits", "()Ljava/lang/Integer;", "setMinorUnits", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPreviousRefundWallet", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Float;ZZILjava/lang/String;Ljava/lang/Integer;)Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;", "equals", "other", "hashCode", "toString", "core_release"})
@o
/* compiled from: CryptoToFiatSettingsResult.kt */
public final class f {
    @SerializedName("crypto_rate_fix_interval")
    private final int bmV;
    @SerializedName("max_limits")
    private Map<String, g> bna;
    @SerializedName("current_limit")
    private Float bnb;
    @SerializedName("aml_restricted")
    private boolean bnc;
    @SerializedName("limit_exhausted")
    private boolean bnd;
    @SerializedName("previous_refund_wallet")
    private final String bne;
    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;
    @SerializedName("minor_units")
    private Integer minorUnits;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (kotlin.jvm.internal.i.y(this.isSuccessful, fVar.isSuccessful) && kotlin.jvm.internal.i.y(this.bna, fVar.bna) && kotlin.jvm.internal.i.y(this.bnb, fVar.bnb)) {
                    if ((this.bnc == fVar.bnc ? 1 : null) != null) {
                        if ((this.bnd == fVar.bnd ? 1 : null) != null) {
                            if (!((this.bmV == fVar.bmV ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bne, fVar.bne) && kotlin.jvm.internal.i.y(this.minorUnits, fVar.minorUnits))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.isSuccessful;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Map map = this.bna;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Float f = this.bnb;
        hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        int i2 = this.bnc;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bnd;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (((hashCode + i2) * 31) + this.bmV) * 31;
        String str = this.bne;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.minorUnits;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoToFiatSettingsResult(isSuccessful=");
        stringBuilder.append(this.isSuccessful);
        stringBuilder.append(", maxLimits=");
        stringBuilder.append(this.bna);
        stringBuilder.append(", currentLimit=");
        stringBuilder.append(this.bnb);
        stringBuilder.append(", amlRestricted=");
        stringBuilder.append(this.bnc);
        stringBuilder.append(", limitExhausted=");
        stringBuilder.append(this.bnd);
        stringBuilder.append(", cryptoRateFixInterval=");
        stringBuilder.append(this.bmV);
        stringBuilder.append(", previousRefundWallet=");
        stringBuilder.append(this.bne);
        stringBuilder.append(", minorUnits=");
        stringBuilder.append(this.minorUnits);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Map<String, g> aag() {
        return this.bna;
    }

    public final Float aah() {
        return this.bnb;
    }

    public final boolean aai() {
        return this.bnc;
    }

    public final boolean aaj() {
        return this.bnd;
    }

    public final int aad() {
        return this.bmV;
    }

    public final String aak() {
        return this.bne;
    }
}
