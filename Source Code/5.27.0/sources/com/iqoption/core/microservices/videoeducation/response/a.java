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

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006."}, bng = {"Lcom/iqoption/core/microservices/videoeducation/response/Category;", "Landroid/os/Parcelable;", "()V", "id", "", "localizedTitle", "", "imageLinks", "", "Lcom/iqoption/core/microservices/videoeducation/response/ImageLink;", "iconLinks", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()J", "localizedIcon", "localizedIcon$annotations", "getLocalizedIcon", "()Ljava/lang/String;", "localizedIcon$delegate", "Lkotlin/Lazy;", "localizedImage", "localizedImage$annotations", "getLocalizedImage", "localizedImage$delegate", "getLocalizedTitle", "component1", "component2", "component3", "component4", "contains", "", "video", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Category.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "localizedImage", "getLocalizedImage()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "localizedIcon", "getLocalizedIcon()Ljava/lang/String;"))};
    private final transient d bDu;
    private final transient d bDv;
    @SerializedName("locale_title")
    private final String bDw;
    @SerializedName("images")
    private final List<b> bDx;
    @SerializedName("icons")
    private final List<b> bDy;
    @SerializedName("id")
    private final long id;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((b) b.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList2.add((b) b.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new a(readLong, readString, arrayList, arrayList2);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public final String ajl() {
        d dVar = this.bDv;
        j jVar = anY[1];
        return (String) dVar.getValue();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!((this.id == aVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bDw, aVar.bDw) && kotlin.jvm.internal.i.y(this.bDx, aVar.bDx) && kotlin.jvm.internal.i.y(this.bDy, aVar.bDy))) {
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
        String str = this.bDw;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.bDx;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.bDy;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Category(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", localizedTitle=");
        stringBuilder.append(this.bDw);
        stringBuilder.append(", imageLinks=");
        stringBuilder.append(this.bDx);
        stringBuilder.append(", iconLinks=");
        stringBuilder.append(this.bDy);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.bDw);
        List<b> list = this.bDx;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        list = this.bDy;
        parcel.writeInt(list.size());
        for (b writeToParcel2 : list) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    public a(long j, String str, List<b> list, List<b> list2) {
        kotlin.jvm.internal.i.f(str, "localizedTitle");
        kotlin.jvm.internal.i.f(list, "imageLinks");
        kotlin.jvm.internal.i.f(list2, "iconLinks");
        this.id = j;
        this.bDw = str;
        this.bDx = list;
        this.bDy = list2;
        this.bDu = g.c(new Category$localizedImage$2(this));
        this.bDv = g.c(new Category$localizedIcon$2(this));
    }

    public final long getId() {
        return this.id;
    }

    public final String On() {
        return this.bDw;
    }

    public /* synthetic */ a(long j, String str, List list, List list2, int i, f fVar) {
        if ((i & 1) != 0) {
            j = -1;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = m.emptyList();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = m.emptyList();
        }
        this(j2, str2, list3, list2);
    }

    public a() {
        this(-1, null, null, null, 14, null);
    }

    public final boolean a(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "video");
        for (Object next : gVar.Mk()) {
            Object obj;
            if (((a) next).id == this.id) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return next2 != null;
    }
}
