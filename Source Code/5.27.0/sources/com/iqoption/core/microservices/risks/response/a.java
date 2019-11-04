package com.iqoption.core.microservices.risks.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0007J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/risks/response/Exposure;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "active_id", "", "call", "", "put", "buy", "sell", "(Lcom/iqoption/core/data/model/InstrumentType;IDDDD)V", "getActive_id", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "getCall", "getPut", "hashCode", "toString", "", "core_release"})
/* compiled from: Exposure.kt */
public final class a {
    @SerializedName("active_id")
    private final int bxZ;
    @SerializedName("call")
    private final double bya;
    @SerializedName("put")
    private final double byb;
    @SerializedName("buy")
    private final double byc;
    @SerializedName("sell")
    private final double byd;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType)) {
                    if (!((this.bxZ == aVar.bxZ ? 1 : null) != null && Double.compare(this.bya, aVar.bya) == 0 && Double.compare(this.byb, aVar.byb) == 0 && Double.compare(this.byc, aVar.byc) == 0 && Double.compare(this.byd, aVar.byd) == 0)) {
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
        int hashCode = (((instrumentType != null ? instrumentType.hashCode() : 0) * 31) + this.bxZ) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bya);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.byb);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.byc);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.byd);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exposure(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", active_id=");
        stringBuilder.append(this.bxZ);
        stringBuilder.append(", call=");
        stringBuilder.append(this.bya);
        stringBuilder.append(", put=");
        stringBuilder.append(this.byb);
        stringBuilder.append(", buy=");
        stringBuilder.append(this.byc);
        stringBuilder.append(", sell=");
        stringBuilder.append(this.byd);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final double ahb() {
        return this.instrumentType == InstrumentType.CRYPTO_INSTRUMENT ? this.byc : this.bya;
    }

    public final double ahc() {
        return this.instrumentType == InstrumentType.CRYPTO_INSTRUMENT ? this.byd : this.byb;
    }
}
