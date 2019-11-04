package com.iqoption.core.microservices.tradingengine.response.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u001d\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0017J\b\u0010%\u001a\u00020\u0003H\u0016J\t\u0010&\u001a\u00020'HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006-"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Landroid/os/Parcelable;", "activeId", "", "unregulatedValues", "", "unregulatedDefault", "regulatedValues", "regulatedDefault", "(I[II[II)V", "getActiveId", "()I", "getRegulatedDefault", "getRegulatedValues", "()[I", "getUnregulatedDefault", "getUnregulatedValues", "component1", "component2", "component3", "component4", "component5", "containsRegulated", "", "value", "containsUnregulated", "copy", "describeContents", "equals", "other", "", "getActiveLeverage", "isRegulate", "tabSettingValue", "(ZLjava/lang/Integer;)I", "getDefaultLeverage", "getValue", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: LeverageInfo.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("active_id")
    private final int activeId;
    @SerializedName("unregulated")
    private final int[] bBh;
    @SerializedName("unregulated_default")
    private final int bBi;
    @SerializedName("regulated")
    private final int[] bBj;
    @SerializedName("regulated_default")
    private final int bBk;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readInt(), parcel.createIntArray(), parcel.readInt(), parcel.createIntArray(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LeverageInfo(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", unregulatedValues=");
        stringBuilder.append(Arrays.toString(this.bBh));
        stringBuilder.append(", unregulatedDefault=");
        stringBuilder.append(this.bBi);
        stringBuilder.append(", regulatedValues=");
        stringBuilder.append(Arrays.toString(this.bBj));
        stringBuilder.append(", regulatedDefault=");
        stringBuilder.append(this.bBk);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.activeId);
        parcel.writeIntArray(this.bBh);
        parcel.writeInt(this.bBi);
        parcel.writeIntArray(this.bBj);
        parcel.writeInt(this.bBk);
    }

    public a(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        kotlin.jvm.internal.i.f(iArr, "unregulatedValues");
        kotlin.jvm.internal.i.f(iArr2, "regulatedValues");
        this.activeId = i;
        this.bBh = iArr;
        this.bBi = i2;
        this.bBj = iArr2;
        this.bBk = i3;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final int[] aiH() {
        return this.bBh;
    }

    public final int[] aiI() {
        return this.bBj;
    }

    public final int[] cB(boolean z) {
        return z ? this.bBj : this.bBh;
    }

    public final int cC(boolean z) {
        return z ? this.bBk : this.bBi;
    }

    public final int a(boolean z, Integer num) {
        if (num == null) {
            return cC(z);
        }
        int intValue = num.intValue();
        if (i.contains(cB(z), intValue)) {
            return intValue;
        }
        return cC(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (this.activeId == aVar.activeId && Arrays.equals(this.bBh, aVar.bBh) && this.bBi == aVar.bBi && Arrays.equals(this.bBj, aVar.bBj) && this.bBk == aVar.bBk) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.leverage.LeverageInfo");
    }

    public int hashCode() {
        return (((((((Integer.valueOf(this.activeId).hashCode() * 31) + Arrays.hashCode(this.bBh)) * 31) + this.bBi) * 31) + Arrays.hashCode(this.bBj)) * 31) + this.bBk;
    }
}
