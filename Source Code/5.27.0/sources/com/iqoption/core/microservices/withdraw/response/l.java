package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jo\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\b\u00107\u001a\u00020\u0005H\u0016J\t\u00108\u001a\u00020\u0005HÖ\u0001J\b\u00109\u001a\u00020:H\u0016J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000201HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u0006@"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethod;", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "id", "", "name", "", "commission", "", "commissions", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "fields", "", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "iconName", "limits", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "paySystem", "maxLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "(JLjava/lang/String;DLcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;Ljava/util/List;Ljava/lang/String;Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;Ljava/lang/String;Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)V", "getCommission", "()D", "getCommissions", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "getFields", "()Ljava/util/List;", "getIconName", "()Ljava/lang/String;", "getId", "()J", "getLimits", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "getMaxLimit", "()Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "setMaxLimit", "(Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)V", "getName", "getPaySystem", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "payoutMethodIdentifier", "toString", "type", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: WithdrawMethod.kt */
public final class l implements c {
    public static final Creator CREATOR = new a();
    @SerializedName("commission")
    private final double bCr;
    @SerializedName("commissions")
    private final j bDU;
    @SerializedName("fields")
    private final List<h> bDV;
    @SerializedName("limits")
    private final k bDX;
    private transient a bDY;
    @SerializedName("icon_name")
    private final String bEg;
    @SerializedName("paysystem")
    private final String bnT;
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            j jVar = parcel.readInt() != 0 ? (j) j.CREATOR.createFromParcel(parcel) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((h) h.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new l(readLong, readString, readDouble, jVar, arrayList, parcel.readString(), parcel.readInt() != 0 ? (k) k.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? (a) a.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new l[i];
        }
    }

    public static /* synthetic */ l a(l lVar, long j, String str, double d, j jVar, List list, String str2, k kVar, String str3, a aVar, int i, Object obj) {
        l lVar2 = lVar;
        int i2 = i;
        return lVar.a((i2 & 1) != 0 ? lVar.getId() : j, (i2 & 2) != 0 ? lVar.getName() : str, (i2 & 4) != 0 ? lVar.ajB() : d, (i2 & 8) != 0 ? lVar.ajC() : jVar, (i2 & 16) != 0 ? lVar.ajD() : list, (i2 & 32) != 0 ? lVar2.bEg : str2, (i2 & 64) != 0 ? lVar.ajE() : kVar, (i2 & 128) != 0 ? lVar2.bnT : str3, (i2 & 256) != 0 ? lVar.ajF() : aVar);
    }

    public final l a(long j, String str, double d, j jVar, List<h> list, String str2, k kVar, String str3, a aVar) {
        String str4 = str;
        kotlin.jvm.internal.i.f(str4, ConditionalUserProperty.NAME);
        List<h> list2 = list;
        kotlin.jvm.internal.i.f(list2, "fields");
        String str5 = str2;
        kotlin.jvm.internal.i.f(str5, "iconName");
        String str6 = str3;
        kotlin.jvm.internal.i.f(str6, "paySystem");
        return new l(j, str4, d, jVar, list2, str5, kVar, str6, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!((getId() == lVar.getId() ? 1 : null) != null && kotlin.jvm.internal.i.y(getName(), lVar.getName()) && Double.compare(ajB(), lVar.ajB()) == 0 && kotlin.jvm.internal.i.y(ajC(), lVar.ajC()) && kotlin.jvm.internal.i.y(ajD(), lVar.ajD()) && kotlin.jvm.internal.i.y(this.bEg, lVar.bEg) && kotlin.jvm.internal.i.y(ajE(), lVar.ajE()) && kotlin.jvm.internal.i.y(this.bnT, lVar.bnT) && kotlin.jvm.internal.i.y(ajF(), lVar.ajF()))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long id = getId();
        int i = ((int) (id ^ (id >>> 32))) * 31;
        String name = getName();
        int i2 = 0;
        i = (i + (name != null ? name.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(ajB());
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        j ajC = ajC();
        i = (i + (ajC != null ? ajC.hashCode() : 0)) * 31;
        List ajD = ajD();
        i = (i + (ajD != null ? ajD.hashCode() : 0)) * 31;
        name = this.bEg;
        i = (i + (name != null ? name.hashCode() : 0)) * 31;
        k ajE = ajE();
        i = (i + (ajE != null ? ajE.hashCode() : 0)) * 31;
        name = this.bnT;
        i = (i + (name != null ? name.hashCode() : 0)) * 31;
        a ajF = ajF();
        if (ajF != null) {
            i2 = ajF.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawMethod(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", commission=");
        stringBuilder.append(ajB());
        stringBuilder.append(", commissions=");
        stringBuilder.append(ajC());
        stringBuilder.append(", fields=");
        stringBuilder.append(ajD());
        stringBuilder.append(", iconName=");
        stringBuilder.append(this.bEg);
        stringBuilder.append(", limits=");
        stringBuilder.append(ajE());
        stringBuilder.append(", paySystem=");
        stringBuilder.append(this.bnT);
        stringBuilder.append(", maxLimit=");
        stringBuilder.append(ajF());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeDouble(this.bCr);
        j jVar = this.bDU;
        if (jVar != null) {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<h> list = this.bDV;
        parcel.writeInt(list.size());
        for (h writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.bEg);
        k kVar = this.bDX;
        if (kVar != null) {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.bnT);
        a aVar = this.bDY;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public l(long j, String str, double d, j jVar, List<h> list, String str2, k kVar, String str3, a aVar) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "fields");
        kotlin.jvm.internal.i.f(str2, "iconName");
        kotlin.jvm.internal.i.f(str3, "paySystem");
        this.id = j;
        this.name = str;
        this.bCr = d;
        this.bDU = jVar;
        this.bDV = list;
        this.bEg = str2;
        this.bDX = kVar;
        this.bnT = str3;
        this.bDY = aVar;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double ajB() {
        return this.bCr;
    }

    public j ajC() {
        return this.bDU;
    }

    public List<h> ajD() {
        return this.bDV;
    }

    public final String ajP() {
        return this.bEg;
    }

    public k ajE() {
        return this.bDX;
    }

    public final String aaG() {
        return this.bnT;
    }

    public a ajF() {
        return this.bDY;
    }

    public WithdrawMethodType ajz() {
        return WithdrawMethodType.COMMON;
    }

    public String ajA() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append('-');
        stringBuilder.append(getId());
        return stringBuilder.toString();
    }
}
