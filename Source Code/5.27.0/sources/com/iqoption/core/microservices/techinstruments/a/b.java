package com.iqoption.core.microservices.techinstruments.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u00101\u001a\u00020\u000fHÖ\u0001J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u000fHÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u0006<"}, bng = {"Lcom/iqoption/core/microservices/techinstruments/response/Indicator;", "Landroid/os/Parcelable;", "()V", "id", "", "name", "", "type", "description", "iconUrl", "videoId", "script", "hidden", "", "instanceCount", "", "canHostFigures", "created", "keywords", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZIZJLjava/lang/String;)V", "getCanHostFigures", "()Z", "getCreated", "()J", "getDescription", "()Ljava/lang/String;", "getHidden", "getIconUrl", "getId", "getInstanceCount", "()I", "getKeywords", "getName", "getScript", "getType", "getVideoId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Indicator.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("icon_url")
    private final String aIF;
    @SerializedName("instance_count")
    private final int aJJ;
    @SerializedName("can_host_figures")
    private final boolean aJK;
    @SerializedName("keywords")
    private final String aJL;
    @SerializedName("video_id")
    private final long byR;
    @SerializedName("script")
    private final String byS;
    @SerializedName("created")
    private final long created;
    @SerializedName("description")
    private final String description;
    @SerializedName("hidden")
    private final boolean fq;
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    private final String name;
    @SerializedName("type")
    private final String type;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            long readLong2 = parcel.readLong();
            String readString5 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new b(readLong, readString, readString2, readString3, readString4, readLong2, readString5, z2, readInt, z, parcel.readLong(), parcel.readString());
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
                if ((this.id == bVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, bVar.name) && kotlin.jvm.internal.i.y(this.type, bVar.type) && kotlin.jvm.internal.i.y(this.description, bVar.description) && kotlin.jvm.internal.i.y(this.aIF, bVar.aIF)) {
                    if ((this.byR == bVar.byR ? 1 : null) != null && kotlin.jvm.internal.i.y(this.byS, bVar.byS)) {
                        if ((this.fq == bVar.fq ? 1 : null) != null) {
                            if ((this.aJJ == bVar.aJJ ? 1 : null) != null) {
                                if ((this.aJK == bVar.aJK ? 1 : null) != null) {
                                    if ((this.created == bVar.created ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.aJL, bVar.aJL)) {
                                        return false;
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
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.type;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.description;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.aIF;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.byR;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.byS;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        int i3 = this.fq;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (((i + i3) * 31) + this.aJJ) * 31;
        i3 = this.aJK;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        j2 = this.created;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.aJL;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Indicator(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", iconUrl=");
        stringBuilder.append(this.aIF);
        stringBuilder.append(", videoId=");
        stringBuilder.append(this.byR);
        stringBuilder.append(", script=");
        stringBuilder.append(this.byS);
        stringBuilder.append(", hidden=");
        stringBuilder.append(this.fq);
        stringBuilder.append(", instanceCount=");
        stringBuilder.append(this.aJJ);
        stringBuilder.append(", canHostFigures=");
        stringBuilder.append(this.aJK);
        stringBuilder.append(", created=");
        stringBuilder.append(this.created);
        stringBuilder.append(", keywords=");
        stringBuilder.append(this.aJL);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.description);
        parcel.writeString(this.aIF);
        parcel.writeLong(this.byR);
        parcel.writeString(this.byS);
        parcel.writeInt(this.fq);
        parcel.writeInt(this.aJJ);
        parcel.writeInt(this.aJK);
        parcel.writeLong(this.created);
        parcel.writeString(this.aJL);
    }

    public b(long j, String str, String str2, String str3, String str4, long j2, String str5, boolean z, int i, boolean z2, long j3, String str6) {
        String str7 = str2;
        String str8 = str4;
        String str9 = str5;
        kotlin.jvm.internal.i.f(str2, "type");
        kotlin.jvm.internal.i.f(str4, "iconUrl");
        kotlin.jvm.internal.i.f(str5, "script");
        this.id = j;
        this.name = str;
        this.type = str7;
        this.description = str3;
        this.aIF = str8;
        this.byR = j2;
        this.byS = str9;
        this.fq = z;
        this.aJJ = i;
        this.aJK = z2;
        this.created = j3;
        this.aJL = str6;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ b(long j, String str, String str2, String str3, String str4, long j2, String str5, boolean z, int i, boolean z2, long j3, String str6, int i2, f fVar) {
        int i3 = i2;
        long j4 = -1;
        long j5 = (i3 & 1) != 0 ? -1 : j;
        String str7 = (i3 & 2) != 0 ? (String) null : str;
        String str8 = (i3 & 4) != 0 ? "Scripted" : str2;
        String str9 = (i3 & 8) != 0 ? (String) null : str3;
        String str10 = "";
        String str11 = (i3 & 16) != 0 ? str10 : str4;
        if ((i3 & 32) == 0) {
            j4 = j2;
        }
        if ((i3 & 64) == 0) {
            str10 = str5;
        }
        boolean z3 = false;
        boolean z4 = (i3 & 128) != 0 ? false : z;
        int i4 = (i3 & 256) != 0 ? 1 : i;
        if ((i3 & 512) == 0) {
            z3 = z2;
        }
        this(j5, str7, str8, str9, str11, j4, str10, z4, i4, z3, (i3 & 1024) != 0 ? 0 : j3, (i3 & 2048) != 0 ? (String) null : str6);
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String OD() {
        return this.aIF;
    }

    public final long ahs() {
        return this.byR;
    }

    public final String getScript() {
        return this.byS;
    }

    public final int aht() {
        return this.aJJ;
    }

    public final boolean Od() {
        return this.aJK;
    }

    public final String getKeywords() {
        return this.aJL;
    }

    public b() {
        this(-1, null, null, null, null, 0, null, false, 0, false, 0, null, 4094, null);
    }
}
