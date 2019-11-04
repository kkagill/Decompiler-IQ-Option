package com.iqoption.charttools.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.model.indicator.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\u0010\fB3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\u0010\rBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "Landroid/os/Parcelable;", "tabId", "", "activeId", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "postToOutput", "", "hosts", "", "(Ljava/lang/String;ILcom/iqoption/charttools/model/indicator/ChartIndicator;ZLjava/util/List;)V", "(Ljava/lang/String;Lcom/iqoption/charttools/model/indicator/ChartIndicator;ZLjava/util/List;)V", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "(Ljava/lang/String;ILcom/iqoption/charttools/model/indicator/MetaIndicator;Lcom/iqoption/charttools/model/indicator/ChartIndicator;ZLjava/util/List;)V", "getActiveId", "()I", "getHosts", "()Ljava/util/List;", "getIndicator", "()Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getMeta", "()Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "getPostToOutput", "()Z", "getTabId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "techtools_release"})
/* compiled from: IndicatorSettingsInputData.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    private final h aCJ;
    private final String aEK;
    private final x aEL;
    private final boolean aEM;
    private final List<h> aEN;
    private final int activeId;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            x xVar = (x) z.aJA.U(parcel);
            ArrayList arrayList = null;
            h hVar = parcel.readInt() != 0 ? (h) h.CREATOR.createFromParcel(parcel) : null;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add((h) h.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new d(readString, readInt, xVar, hVar, z, arrayList);
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (kotlin.jvm.internal.i.y(this.aEK, dVar.aEK)) {
                    if ((this.activeId == dVar.activeId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.aEL, dVar.aEL) && kotlin.jvm.internal.i.y(this.aCJ, dVar.aCJ)) {
                        if ((this.aEM == dVar.aEM ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.aEN, dVar.aEN)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.aEK;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.activeId) * 31;
        x xVar = this.aEL;
        hashCode = (hashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        h hVar = this.aCJ;
        hashCode = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        int i2 = this.aEM;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list = this.aEN;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IndicatorSettingsInputData(tabId=");
        stringBuilder.append(this.aEK);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", meta=");
        stringBuilder.append(this.aEL);
        stringBuilder.append(", indicator=");
        stringBuilder.append(this.aCJ);
        stringBuilder.append(", postToOutput=");
        stringBuilder.append(this.aEM);
        stringBuilder.append(", hosts=");
        stringBuilder.append(this.aEN);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.aEK);
        parcel.writeInt(this.activeId);
        z.aJA.b(this.aEL, parcel, i);
        h hVar = this.aCJ;
        if (hVar != null) {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.aEM);
        List<h> list = this.aEN;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (h writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public d(String str, int i, x xVar, h hVar, boolean z, List<h> list) {
        kotlin.jvm.internal.i.f(str, "tabId");
        kotlin.jvm.internal.i.f(xVar, "meta");
        this.aEK = str;
        this.activeId = i;
        this.aEL = xVar;
        this.aCJ = hVar;
        this.aEM = z;
        this.aEN = list;
    }

    public final String MG() {
        return this.aEK;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final x MH() {
        return this.aEL;
    }

    public /* synthetic */ d(String str, int i, x xVar, h hVar, boolean z, List list, int i2, f fVar) {
        this(str, i, xVar, (i2 & 8) != 0 ? (h) null : hVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? (List) null : list);
    }

    public final h LU() {
        return this.aCJ;
    }

    public final boolean MI() {
        return this.aEM;
    }

    public final List<h> MJ() {
        return this.aEN;
    }

    public /* synthetic */ d(String str, int i, h hVar, boolean z, List list, int i2, f fVar) {
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            list = (List) null;
        }
        this(str, i, hVar, z2, list);
    }

    public d(String str, int i, h hVar, boolean z, List<h> list) {
        kotlin.jvm.internal.i.f(str, "tabId");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        this(str, i, hVar.MH(), hVar, z, list);
    }

    public d(String str, h hVar, boolean z, List<h> list) {
        kotlin.jvm.internal.i.f(str, "tabId");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        this(str, -1, hVar, z, list);
    }
}
