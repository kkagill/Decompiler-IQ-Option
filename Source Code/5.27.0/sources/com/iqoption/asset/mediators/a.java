package com.iqoption.asset.mediators;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\rJ\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0002\u0010\u0012JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\u0002HÖ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0002HÖ\u0001J\u0006\u0010-\u001a\u00020\u0002J\t\u0010.\u001a\u00020/HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0002HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0004\u0018\u00010\u001a8FX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, bng = {"Lcom/iqoption/asset/mediators/AssetDisplayData;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "Landroid/os/Parcelable;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "spread", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "leverages", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "isFavorite", "", "minCommission", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;ZLjava/lang/Integer;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "id", "getId", "()Ljava/lang/Integer;", "()Z", "getLeverages", "()Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Ljava/lang/Integer;", "getSpread", "()Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "spreadPercent", "", "spreadPercent$annotations", "()V", "getSpreadPercent", "()Ljava/lang/Double;", "spreadPercent$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;ZLjava/lang/Integer;)Lcom/iqoption/asset/mediators/AssetDisplayData;", "describeContents", "equals", "other", "", "hashCode", "profit", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "asset_release"})
/* compiled from: AssetDisplayData.kt */
public final class a implements Parcelable, d<Integer> {
    public static final Creator CREATOR = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "spreadPercent", "getSpreadPercent()Ljava/lang/Double;"))};
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final kotlin.d axI = g.c(new AssetDisplayData$spreadPercent$2(this));
    private final com.iqoption.core.microservices.f.a.a.a axJ;
    private final com.iqoption.core.microservices.tradingengine.response.b.a axK;
    private final boolean axL;
    private final Integer axM;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a((com.iqoption.core.microservices.tradingengine.response.active.a) parcel.readParcelable(a.class.getClassLoader()), (com.iqoption.core.microservices.f.a.a.a) parcel.readParcelable(a.class.getClassLoader()), (com.iqoption.core.microservices.tradingengine.response.b.a) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
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
                if (kotlin.jvm.internal.i.y(this.anF, aVar.anF) && kotlin.jvm.internal.i.y(this.axJ, aVar.axJ) && kotlin.jvm.internal.i.y(this.axK, aVar.axK)) {
                    if ((this.axL == aVar.axL ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.axM, aVar.axM)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.f.a.a.a aVar2 = this.axJ;
        hashCode = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.tradingengine.response.b.a aVar3 = this.axK;
        hashCode = (hashCode + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        int i2 = this.axL;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Integer num = this.axM;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetDisplayData(active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", spread=");
        stringBuilder.append(this.axJ);
        stringBuilder.append(", leverages=");
        stringBuilder.append(this.axK);
        stringBuilder.append(", isFavorite=");
        stringBuilder.append(this.axL);
        stringBuilder.append(", minCommission=");
        stringBuilder.append(this.axM);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.anF, i);
        parcel.writeParcelable(this.axJ, i);
        parcel.writeParcelable(this.axK, i);
        parcel.writeInt(this.axL);
        Integer num = this.axM;
        if (num != null) {
            parcel.writeInt(1);
            i = num.intValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, com.iqoption.core.microservices.tradingengine.response.b.a aVar3, boolean z, Integer num) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        this.anF = aVar;
        this.axJ = aVar2;
        this.axK = aVar3;
        this.axL = z;
        this.axM = num;
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
        return this.anF;
    }

    public final com.iqoption.core.microservices.f.a.a.a JS() {
        return this.axJ;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.anF.getActiveId());
    }
}
