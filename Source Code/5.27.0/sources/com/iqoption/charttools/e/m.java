package com.iqoption.charttools.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, bng = {"Lcom/iqoption/charttools/templates/TemplateInputData;", "Landroid/os/Parcelable;", "tabId", "", "chartConfig", "Lcom/iqoption/charttools/model/chart/ChartConfig;", "(Ljava/lang/String;Lcom/iqoption/charttools/model/chart/ChartConfig;)V", "templateId", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/Long;Lcom/iqoption/charttools/model/chart/ChartConfig;)V", "getChartConfig", "()Lcom/iqoption/charttools/model/chart/ChartConfig;", "getTabId", "()Ljava/lang/String;", "getTemplateId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "techtools_release"})
/* compiled from: TemplateInputData.kt */
public final class m implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String aEK;
    private final Long aKJ;
    private final com.iqoption.charttools.model.a.a aKK;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            com.iqoption.charttools.model.a.a aVar = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                aVar = (com.iqoption.charttools.model.a.a) com.iqoption.charttools.model.a.a.CREATOR.createFromParcel(parcel);
            }
            return new m(readString, valueOf, aVar);
        }

        public final Object[] newArray(int i) {
            return new m[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.aEK);
        Long l = this.aKJ;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        com.iqoption.charttools.model.a.a aVar = this.aKK;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public m(String str, Long l, com.iqoption.charttools.model.a.a aVar) {
        kotlin.jvm.internal.i.f(str, "tabId");
        this.aEK = str;
        this.aKJ = l;
        this.aKK = aVar;
    }

    public final String MG() {
        return this.aEK;
    }

    public final Long Pm() {
        return this.aKJ;
    }

    public final com.iqoption.charttools.model.a.a Pn() {
        return this.aKK;
    }

    public m(String str, com.iqoption.charttools.model.a.a aVar) {
        kotlin.jvm.internal.i.f(str, "tabId");
        kotlin.jvm.internal.i.f(aVar, "chartConfig");
        this(str, null, aVar);
    }

    public m(String str, Long l) {
        kotlin.jvm.internal.i.f(str, "tabId");
        this(str, l, null);
    }
}
