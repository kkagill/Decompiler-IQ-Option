package com.iqoption.charttools.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B-\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, bng = {"Lcom/iqoption/charttools/model/IndicatorCategory;", "Landroid/os/Parcelable;", "()V", "category", "Lcom/iqoption/core/microservices/techinstruments/response/Category;", "(Lcom/iqoption/core/microservices/techinstruments/response/Category;)V", "id", "", "name", "", "description", "iconUrl", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIconUrl", "getId", "()J", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "techtools_release"})
/* compiled from: IndicatorCategory.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("icon_url")
    private final String aIF;
    @SerializedName("description")
    private final String description;
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!((this.id == aVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, aVar.name) && kotlin.jvm.internal.i.y(this.description, aVar.description) && kotlin.jvm.internal.i.y(this.aIF, aVar.aIF))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.description;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.aIF;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IndicatorCategory(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", iconUrl=");
        stringBuilder.append(this.aIF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.aIF);
    }

    public a(long j, String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        kotlin.jvm.internal.i.f(str3, "iconUrl");
        this.id = j;
        this.name = str;
        this.description = str2;
        this.aIF = str3;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ a(long j, String str, String str2, String str3, int i, f fVar) {
        if ((i & 1) != 0) {
            j = -1;
        }
        String str4 = "";
        this(j, (i & 2) != 0 ? str4 : str, (i & 4) != 0 ? str4 : str2, (i & 8) != 0 ? str4 : str3);
    }

    public a() {
        this(-1, null, null, null, 14, null);
    }

    public a(com.iqoption.core.microservices.techinstruments.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "category");
        this(aVar.getId(), aVar.getName(), aVar.getDescription(), aVar.OD());
    }
}
