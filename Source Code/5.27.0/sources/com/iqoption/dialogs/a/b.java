package com.iqoption.dialogs.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, bng = {"Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "Landroid/os/Parcelable;", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "initialInvestment", "", "createPositionTime", "", "custodialLastAge", "(ILcom/iqoption/core/data/model/InstrumentType;DJI)V", "getActiveId", "()I", "getCreatePositionTime", "()J", "getCustodialLastAge", "getInitialInvestment", "()D", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "dialogs_release"})
/* compiled from: CustodialFeeInput.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    private final int activeId;
    private final int bCG;
    private final double cLK;
    private final long cLL;
    private final InstrumentType instrumentType;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readInt(), (InstrumentType) Enum.valueOf(InstrumentType.class, parcel.readString()), parcel.readDouble(), parcel.readLong(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.activeId == bVar.activeId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.instrumentType, bVar.instrumentType) && Double.compare(this.cLK, bVar.cLK) == 0) {
                    if ((this.cLL == bVar.cLL ? 1 : null) != null) {
                        if ((this.bCG == bVar.bCG ? 1 : null) != null) {
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
        int i = this.activeId * 31;
        InstrumentType instrumentType = this.instrumentType;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.cLK);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.cLL;
        return ((i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.bCG;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustodialFeeInput(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", initialInvestment=");
        stringBuilder.append(this.cLK);
        stringBuilder.append(", createPositionTime=");
        stringBuilder.append(this.cLL);
        stringBuilder.append(", custodialLastAge=");
        stringBuilder.append(this.bCG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.activeId);
        parcel.writeString(this.instrumentType.name());
        parcel.writeDouble(this.cLK);
        parcel.writeLong(this.cLL);
        parcel.writeInt(this.bCG);
    }

    public b(int i, InstrumentType instrumentType, double d, long j, int i2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this.activeId = i;
        this.instrumentType = instrumentType;
        this.cLK = d;
        this.cLL = j;
        this.bCG = i2;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final double auM() {
        return this.cLK;
    }

    public final long auN() {
        return this.cLL;
    }

    public final int getCustodialLastAge() {
        return this.bCG;
    }
}
