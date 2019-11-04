package com.iqoption.core.microservices.videoeducation.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0017J\t\u00107\u001a\u00020\u0004HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eHÂ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eHÂ\u0003J\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\fHÖ\u0001J\u0013\u0010F\u001a\u00020\b2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\u0006\u0010I\u001a\u00020\u0004J\t\u0010J\u001a\u00020\fHÖ\u0001J\t\u0010K\u001a\u00020\u0006HÖ\u0001J\u0019\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\fHÖ\u0001R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR#\u0010\u001e\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010!R#\u0010$\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010'R#\u0010)\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\u0012\n\u0004\b,\u0010#\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010'R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R#\u0010.\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\u0012\n\u0004\b2\u0010#\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u00101R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0019R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006Q"}, bng = {"Lcom/iqoption/core/microservices/videoeducation/response/Video;", "Landroid/os/Parcelable;", "()V", "id", "", "localizedTitle", "", "isNew", "", "isWatched", "platform", "weight", "", "categories", "", "Lcom/iqoption/core/microservices/videoeducation/response/Category;", "tags", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "imageLinks", "Lcom/iqoption/core/microservices/videoeducation/response/ImageLink;", "videoLinks", "Lcom/iqoption/core/microservices/videoeducation/response/VideoLink;", "createdAt", "(JLjava/lang/String;ZZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getCategories", "()Ljava/util/List;", "Ljava/lang/Long;", "getId", "()J", "()Z", "localizedDuration", "localizedDuration$annotations", "getLocalizedDuration", "()Ljava/lang/Integer;", "localizedDuration$delegate", "Lkotlin/Lazy;", "localizedIcon", "localizedIcon$annotations", "getLocalizedIcon", "()Ljava/lang/String;", "localizedIcon$delegate", "localizedPath", "localizedPath$annotations", "getLocalizedPath", "localizedPath$delegate", "getLocalizedTitle", "localizedVideoLink", "localizedVideoLink$annotations", "getLocalizedVideoLink", "()Lcom/iqoption/core/microservices/videoeducation/response/VideoLink;", "localizedVideoLink$delegate", "getPlatform", "getTags", "getWeight", "()I", "component1", "component10", "component11", "()Ljava/lang/Long;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;ZZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/iqoption/core/microservices/videoeducation/response/Video;", "describeContents", "equals", "other", "", "getCreatedAt", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Video.kt */
public final class g implements Parcelable {
    public static final Creator CREATOR = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(g.class), "localizedVideoLink", "getLocalizedVideoLink()Lcom/iqoption/core/microservices/videoeducation/response/VideoLink;")), k.a(new PropertyReference1Impl(k.G(g.class), "localizedDuration", "getLocalizedDuration()Ljava/lang/Integer;")), k.a(new PropertyReference1Impl(k.G(g.class), "localizedPath", "getLocalizedPath()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(g.class), "localizedIcon", "getLocalizedIcon()Ljava/lang/String;"))};
    @SerializedName("categories")
    private final List<a> aDW;
    private final transient d bDC;
    private final transient d bDD;
    private final transient d bDE;
    @SerializedName("new")
    private final boolean bDF;
    @SerializedName("watched")
    private final boolean bDG;
    @SerializedName("video_locales")
    private final List<h> bDH;
    @SerializedName("created_at")
    private final Long bDI;
    private final transient d bDv;
    @SerializedName("locale_title")
    private final String bDw;
    @SerializedName("images")
    private final List<b> bDx;
    @SerializedName("platform")
    private final String bDz;
    @SerializedName("id")
    private final long id;
    @SerializedName("tags")
    private final List<f> tags;
    @SerializedName("weight")
    private final int weight;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((a) a.CREATOR.createFromParcel(parcel2));
                readInt2--;
            }
            readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((f) f.CREATOR.createFromParcel(parcel2));
                readInt2--;
            }
            readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList3.add((b) b.CREATOR.createFromParcel(parcel2));
                readInt2--;
            }
            readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList4.add((h) h.CREATOR.createFromParcel(parcel2));
                readInt2--;
            }
            return new g(readLong, readString, z2, z, readString2, readInt, arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        public final Object[] newArray(int i) {
            return new g[i];
        }
    }

    public static /* synthetic */ g a(g gVar, long j, String str, boolean z, boolean z2, String str2, int i, List list, List list2, List list3, List list4, Long l, int i2, Object obj) {
        g gVar2 = gVar;
        int i3 = i2;
        return gVar.a((i3 & 1) != 0 ? gVar2.id : j, (i3 & 2) != 0 ? gVar2.bDw : str, (i3 & 4) != 0 ? gVar2.bDF : z, (i3 & 8) != 0 ? gVar2.bDG : z2, (i3 & 16) != 0 ? gVar2.bDz : str2, (i3 & 32) != 0 ? gVar2.weight : i, (i3 & 64) != 0 ? gVar2.aDW : list, (i3 & 128) != 0 ? gVar2.tags : list2, (i3 & 256) != 0 ? gVar2.bDx : list3, (i3 & 512) != 0 ? gVar2.bDH : list4, (i3 & 1024) != 0 ? gVar2.bDI : l);
    }

    private final h ajn() {
        d dVar = this.bDC;
        j jVar = anY[0];
        return (h) dVar.getValue();
    }

    public final g a(long j, String str, boolean z, boolean z2, String str2, int i, List<a> list, List<f> list2, List<b> list3, List<h> list4, Long l) {
        String str3 = str;
        kotlin.jvm.internal.i.f(str3, "localizedTitle");
        String str4 = str2;
        kotlin.jvm.internal.i.f(str4, "platform");
        List<a> list5 = list;
        kotlin.jvm.internal.i.f(list5, "categories");
        List<f> list6 = list2;
        kotlin.jvm.internal.i.f(list6, "tags");
        List<b> list7 = list3;
        kotlin.jvm.internal.i.f(list7, "imageLinks");
        List<h> list8 = list4;
        kotlin.jvm.internal.i.f(list8, "videoLinks");
        return new g(j, str3, z, z2, str4, i, list5, list6, list7, list8, l);
    }

    public final String ajl() {
        d dVar = this.bDv;
        j jVar = anY[3];
        return (String) dVar.getValue();
    }

    public final Integer ajo() {
        d dVar = this.bDD;
        j jVar = anY[1];
        return (Integer) dVar.getValue();
    }

    public final String ajp() {
        d dVar = this.bDE;
        j jVar = anY[2];
        return (String) dVar.getValue();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if ((this.id == gVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bDw, gVar.bDw)) {
                    if ((this.bDF == gVar.bDF ? 1 : null) != null) {
                        if ((this.bDG == gVar.bDG ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bDz, gVar.bDz)) {
                            if (!((this.weight == gVar.weight ? 1 : null) != null && kotlin.jvm.internal.i.y(this.aDW, gVar.aDW) && kotlin.jvm.internal.i.y(this.tags, gVar.tags) && kotlin.jvm.internal.i.y(this.bDx, gVar.bDx) && kotlin.jvm.internal.i.y(this.bDH, gVar.bDH) && kotlin.jvm.internal.i.y(this.bDI, gVar.bDI))) {
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
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.bDw;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        int i3 = this.bDF;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.bDG;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        str = this.bDz;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.weight) * 31;
        List list = this.aDW;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.tags;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.bDx;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.bDH;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        Long l = this.bDI;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Video(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", localizedTitle=");
        stringBuilder.append(this.bDw);
        stringBuilder.append(", isNew=");
        stringBuilder.append(this.bDF);
        stringBuilder.append(", isWatched=");
        stringBuilder.append(this.bDG);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.bDz);
        stringBuilder.append(", weight=");
        stringBuilder.append(this.weight);
        stringBuilder.append(", categories=");
        stringBuilder.append(this.aDW);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(", imageLinks=");
        stringBuilder.append(this.bDx);
        stringBuilder.append(", videoLinks=");
        stringBuilder.append(this.bDH);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.bDI);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.bDw);
        parcel.writeInt(this.bDF);
        parcel.writeInt(this.bDG);
        parcel.writeString(this.bDz);
        parcel.writeInt(this.weight);
        List<a> list = this.aDW;
        parcel.writeInt(list.size());
        for (a writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<f> list2 = this.tags;
        parcel.writeInt(list2.size());
        for (f writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        List<b> list3 = this.bDx;
        parcel.writeInt(list3.size());
        for (b writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, 0);
        }
        List<h> list4 = this.bDH;
        parcel.writeInt(list4.size());
        for (h writeToParcel4 : list4) {
            writeToParcel4.writeToParcel(parcel, 0);
        }
        Long l = this.bDI;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            return;
        }
        parcel.writeInt(0);
    }

    public g(long j, String str, boolean z, boolean z2, String str2, int i, List<a> list, List<f> list2, List<b> list3, List<h> list4, Long l) {
        kotlin.jvm.internal.i.f(str, "localizedTitle");
        kotlin.jvm.internal.i.f(str2, "platform");
        kotlin.jvm.internal.i.f(list, "categories");
        kotlin.jvm.internal.i.f(list2, "tags");
        kotlin.jvm.internal.i.f(list3, "imageLinks");
        kotlin.jvm.internal.i.f(list4, "videoLinks");
        this.id = j;
        this.bDw = str;
        this.bDF = z;
        this.bDG = z2;
        this.bDz = str2;
        this.weight = i;
        this.aDW = list;
        this.tags = list2;
        this.bDx = list3;
        this.bDH = list4;
        this.bDI = l;
        this.bDC = g.c(new Video$localizedVideoLink$2(this));
        this.bDD = g.c(new Video$localizedDuration$2(this));
        this.bDE = g.c(new Video$localizedPath$2(this));
        this.bDv = g.c(new Video$localizedIcon$2(this));
    }

    public final long getId() {
        return this.id;
    }

    public final String On() {
        return this.bDw;
    }

    public final boolean ajq() {
        return this.bDF;
    }

    public final boolean ajr() {
        return this.bDG;
    }

    public final int getWeight() {
        return this.weight;
    }

    public /* synthetic */ g(long j, String str, boolean z, boolean z2, String str2, int i, List list, List list2, List list3, List list4, Long l, int i2, f fVar) {
        int i3 = i2;
        long j2 = (i3 & 1) != 0 ? -1 : j;
        String str3 = (i3 & 2) != 0 ? "" : str;
        int i4 = 0;
        boolean z3 = (i3 & 4) != 0 ? false : z;
        boolean z4 = (i3 & 8) != 0 ? false : z2;
        String str4 = (i3 & 16) != 0 ? "mobile" : str2;
        if ((i3 & 32) == 0) {
            i4 = i;
        }
        this(j2, str3, z3, z4, str4, i4, (i3 & 64) != 0 ? m.emptyList() : list, (i3 & 128) != 0 ? m.emptyList() : list2, (i3 & 256) != 0 ? m.emptyList() : list3, (i3 & 512) != 0 ? m.emptyList() : list4, (i3 & 1024) != 0 ? (Long) null : l);
    }

    public final List<a> Mk() {
        return this.aDW;
    }

    public final List<f> ajs() {
        return this.tags;
    }

    public g() {
        this(-1, null, false, false, null, 0, null, null, null, null, null, 2046, null);
    }

    public final long ZU() {
        Long l = this.bDI;
        return l != null ? l.longValue() * ((long) 1000) : 0;
    }
}
