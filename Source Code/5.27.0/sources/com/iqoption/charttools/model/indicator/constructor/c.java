package com.iqoption.charttools.model.indicator.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "Landroid/os/Parcelable;", "()V", "name", "", "description", "iconUrl", "indices", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V", "getDescription", "()Ljava/lang/String;", "getIconUrl", "getIndices", "()[I", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "techtools_release"})
/* compiled from: InputGroup.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("icon_url")
    private final String aIF;
    @SerializedName("indices")
    private final int[] aJT;
    @SerializedName("description")
    private final String description;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createIntArray());
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InputGroup(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", iconUrl=");
        stringBuilder.append(this.aIF);
        stringBuilder.append(", indices=");
        stringBuilder.append(Arrays.toString(this.aJT));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.aIF);
        parcel.writeIntArray(this.aJT);
    }

    public c(String str, String str2, String str3, int[] iArr) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        this.name = str;
        this.description = str2;
        this.aIF = str3;
        this.aJT = iArr;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ c(String str, String str2, String str3, int[] iArr, int i, f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = (String) null;
        }
        if ((i & 4) != 0) {
            str3 = (String) null;
        }
        if ((i & 8) != 0) {
            iArr = (int[]) null;
        }
        this(str, str2, str3, iArr);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int[] OC() {
        return this.aJT;
    }

    public c() {
        this("", null, null, null, 14, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            c cVar = (c) obj;
            if ((kotlin.jvm.internal.i.y(this.name, cVar.name) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.description, cVar.description) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.aIF, cVar.aIF) ^ 1) == 0 && Arrays.equals(this.aJT, cVar.aJT)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.model.indicator.constructor.InputGroup");
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.description;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.aIF;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int[] iArr = this.aJT;
        if (iArr != null) {
            i = Arrays.hashCode(iArr);
        }
        return hashCode + i;
    }
}
