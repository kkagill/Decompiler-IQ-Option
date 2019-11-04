package com.iqoption.core.microservices.configuration.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B}\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0002HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0002HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\b\u00104\u001a\u00020\u0006H\u0016J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\bHÖ\u0001R\u0016\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u0006:"}, bng = {"Lcom/iqoption/core/microservices/configuration/response/Country;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "Landroid/os/Parcelable;", "id", "name", "", "phoneCode", "", "priority", "codeId", "nameFull", "nameShort", "nameIso", "domain", "isVisible", "", "isRegulated", "isRegistrationRestricted", "(JLjava/lang/String;IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCodeId", "()J", "getDomain", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "()Z", "getName", "getNameFull", "getNameIso", "getNameShort", "getPhoneCode", "()I", "getPriority", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Country.kt */
public final class c implements Parcelable, d<Long> {
    public static final Creator CREATOR = new a();
    @SerializedName("is_regulated")
    private final boolean aZy;
    @SerializedName("phone_code")
    private final int brx;
    @SerializedName("code_id")
    private final long bry;
    @SerializedName("is_registration_restricted")
    private final boolean brz;
    @SerializedName("domain")
    private final String domain;
    @SerializedName("id")
    private final long id;
    @SerializedName("is_visible")
    private final boolean isVisible;
    @SerializedName("name")
    private final String name;
    @SerializedName("name_full")
    private final String nameFull;
    @SerializedName("name_iso")
    private final String nameIso;
    @SerializedName("name_short")
    private final String nameShort;
    @SerializedName("priority")
    private final int priority;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            long readLong2 = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new c(readLong, readString, readInt, readInt2, readLong2, readString2, readString3, readString4, readString5, z2, z3, z);
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c() {
        this(0, null, 0, 0, 0, null, null, null, null, false, false, false, 4095, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((getId().longValue() == cVar.getId().longValue() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, cVar.name)) {
                    if ((this.brx == cVar.brx ? 1 : null) != null) {
                        if ((this.priority == cVar.priority ? 1 : null) != null) {
                            if ((this.bry == cVar.bry ? 1 : null) != null && kotlin.jvm.internal.i.y(this.nameFull, cVar.nameFull) && kotlin.jvm.internal.i.y(this.nameShort, cVar.nameShort) && kotlin.jvm.internal.i.y(this.nameIso, cVar.nameIso) && kotlin.jvm.internal.i.y(this.domain, cVar.domain)) {
                                if ((this.isVisible == cVar.isVisible ? 1 : null) != null) {
                                    if ((this.aZy == cVar.aZy ? 1 : null) != null) {
                                        if ((this.brz == cVar.brz ? 1 : null) != null) {
                                            return true;
                                        }
                                    }
                                }
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
        long longValue = getId().longValue();
        int i = ((int) (longValue ^ (longValue >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.brx) * 31) + this.priority) * 31;
        long j = this.bry;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        str = this.nameFull;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.nameShort;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.nameIso;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.domain;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        int i3 = this.isVisible;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.aZy;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.brz;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.brx);
        parcel.writeInt(this.priority);
        parcel.writeLong(this.bry);
        parcel.writeString(this.nameFull);
        parcel.writeString(this.nameShort);
        parcel.writeString(this.nameIso);
        parcel.writeString(this.domain);
        parcel.writeInt(this.isVisible);
        parcel.writeInt(this.aZy);
        parcel.writeInt(this.brz);
    }

    public c(long j, String str, int i, int i2, long j2, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "nameFull");
        kotlin.jvm.internal.i.f(str3, "nameShort");
        kotlin.jvm.internal.i.f(str4, "nameIso");
        kotlin.jvm.internal.i.f(str5, "domain");
        this.id = j;
        this.name = str;
        this.brx = i;
        this.priority = i2;
        this.bry = j2;
        this.nameFull = str2;
        this.nameShort = str3;
        this.nameIso = str4;
        this.domain = str5;
        this.isVisible = z;
        this.aZy = z2;
        this.brz = z3;
    }

    public Long getId() {
        return Long.valueOf(this.id);
    }

    public final String getName() {
        return this.name;
    }

    public final int acM() {
        return this.brx;
    }

    public final String acN() {
        return this.nameShort;
    }

    public final String acO() {
        return this.nameIso;
    }

    public final boolean Er() {
        return this.aZy;
    }

    public /* synthetic */ c(long j, String str, int i, int i2, long j2, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i3, f fVar) {
        int i4 = i3;
        long j3 = -1;
        long j4 = (i4 & 1) != 0 ? -1 : j;
        String str6 = "";
        String str7 = (i4 & 2) != 0 ? str6 : str;
        boolean z4 = false;
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) == 0) {
            j3 = j2;
        }
        String str8 = (i4 & 32) != 0 ? str6 : str2;
        String str9 = (i4 & 64) != 0 ? str6 : str3;
        String str10 = (i4 & 128) != 0 ? str6 : str4;
        if ((i4 & 256) == 0) {
            str6 = str5;
        }
        boolean z5 = (i4 & 512) != 0 ? false : z;
        boolean z6 = (i4 & 1024) != 0 ? false : z2;
        if ((i4 & 2048) == 0) {
            z4 = z3;
        }
        this(j4, str7, i5, i6, j3, str8, str9, str10, str6, z5, z6, z4);
    }

    public final boolean acP() {
        return this.brz;
    }

    public String toString() {
        return this.name;
    }
}
