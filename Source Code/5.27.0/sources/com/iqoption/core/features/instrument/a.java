package com.iqoption.core.features.instrument;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/features/instrument/DefaultTabParam;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "assetId", "", "(Lcom/iqoption/core/data/model/InstrumentType;I)V", "getAssetId", "()I", "setAssetId", "(I)V", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "setInstrumentType", "(Lcom/iqoption/core/data/model/InstrumentType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
@o
/* compiled from: DefaultTabParam.kt */
public final class a {
    @SerializedName("asset_id")
    private int aqg;
    @SerializedName("instrument_type")
    private InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType)) {
                    if ((this.aqg == aVar.aqg ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        return ((instrumentType != null ? instrumentType.hashCode() : 0) * 31) + this.aqg;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultTabParam(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", assetId=");
        stringBuilder.append(this.aqg);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final int Bs() {
        return this.aqg;
    }
}
