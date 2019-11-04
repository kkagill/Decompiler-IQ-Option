package com.iqoption.core.microservices.g.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/tradersmood/response/TradersMood;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "", "value", "", "(Lcom/iqoption/core/data/model/InstrumentType;IF)V", "getActiveId", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getValue", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
@o
/* compiled from: TradersMood.kt */
public final class a {
    @SerializedName("asset_id")
    private final int activeId;
    @SerializedName("instrument")
    private final InstrumentType instrumentType;
    @SerializedName("value")
    private final float value;

    public a() {
        this(null, 0, 0.0f, 7, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType)) {
                    if ((this.activeId == aVar.activeId ? 1 : null) == null || Float.compare(this.value, aVar.value) != 0) {
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
        return ((((instrumentType != null ? instrumentType.hashCode() : 0) * 31) + this.activeId) * 31) + Float.floatToIntBits(this.value);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradersMood(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(InstrumentType instrumentType, int i, float f) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this.instrumentType = instrumentType;
        this.activeId = i;
        this.value = f;
    }

    public /* synthetic */ a(InstrumentType instrumentType, int i, float f, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            instrumentType = InstrumentType.UNKNOWN;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            f = 0.5f;
        }
        this(instrumentType, i, f);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final float getValue() {
        return this.value;
    }
}
