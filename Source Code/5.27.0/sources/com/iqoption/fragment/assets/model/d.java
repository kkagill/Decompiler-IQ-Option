package com.iqoption.fragment.assets.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006%"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetBo;", "Lcom/iqoption/fragment/assets/model/AssetItem;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "profit", "", "image", "", "name", "isFavorite", "", "quote", "profitFormatted", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getImage", "()Ljava/lang/String;", "()Z", "getName", "getProfit", "()I", "getProfitFormatted", "getQuote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class d extends k {
    private final String Dy;
    private final a aoX;
    private final boolean axL;
    private final String dbL;
    private final String image;
    private final String name;
    private final int profit;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (kotlin.jvm.internal.i.y(this.aoX, dVar.aoX)) {
                    if ((aAH() == dVar.aAH() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.image, dVar.image) && kotlin.jvm.internal.i.y(getName(), dVar.getName())) {
                        if (!((QE() == dVar.QE() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.Dy, dVar.Dy) && kotlin.jvm.internal.i.y(this.dbL, dVar.dbL))) {
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
        a aVar = this.aoX;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + aAH()) * 31;
        String str = this.image;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = getName();
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int QE = QE();
        if (QE != 0) {
            QE = 1;
        }
        hashCode = (hashCode + QE) * 31;
        str = this.Dy;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dbL;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetBo(asset=");
        stringBuilder.append(this.aoX);
        stringBuilder.append(", profit=");
        stringBuilder.append(aAH());
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", isFavorite=");
        stringBuilder.append(QE());
        stringBuilder.append(", quote=");
        stringBuilder.append(this.Dy);
        stringBuilder.append(", profitFormatted=");
        stringBuilder.append(this.dbL);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public int aAH() {
        return this.profit;
    }

    public final String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public boolean QE() {
        return this.axL;
    }

    public final String mp() {
        return this.Dy;
    }

    public final String aAM() {
        return this.dbL;
    }

    public d(a aVar, int i, String str, String str2, boolean z, String str3, String str4) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(str2, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str3, "quote");
        kotlin.jvm.internal.i.f(str4, "profitFormatted");
        super(aVar, null);
        this.aoX = aVar;
        this.profit = i;
        this.image = str;
        this.name = str2;
        this.axL = z;
        this.Dy = str3;
        this.dbL = str4;
    }
}
