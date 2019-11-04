package com.iqoption.fragment.assets.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0014\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017¨\u0006/"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetMulti;", "Lcom/iqoption/fragment/assets/model/AssetItem;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "diff", "", "isDiffPositive", "", "spotProfit", "", "image", "", "name", "isFavorite", "quote", "diffFormatted", "spotProfitFormatted", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;DZILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getDiff", "()D", "getDiffFormatted", "()Ljava/lang/String;", "getImage", "()Z", "getName", "getQuote", "getSpotProfit", "()I", "getSpotProfitFormatted", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class n extends k {
    private final String Dy;
    private final a aoX;
    private final boolean axL;
    private final double dca;
    private final boolean dcb;
    private final String dcd;
    private final int dch;
    private final String dci;
    private final String image;
    private final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (kotlin.jvm.internal.i.y(this.aoX, nVar.aoX) && Double.compare(adn(), nVar.adn()) == 0) {
                    if ((this.dcb == nVar.dcb ? 1 : null) != null) {
                        if ((aAI() == nVar.aAI() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.image, nVar.image) && kotlin.jvm.internal.i.y(getName(), nVar.getName())) {
                            if (!((QE() == nVar.QE() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.Dy, nVar.Dy) && kotlin.jvm.internal.i.y(this.dcd, nVar.dcd) && kotlin.jvm.internal.i.y(this.dci, nVar.dci))) {
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
        a aVar = this.aoX;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(adn());
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        int i2 = this.dcb;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (((hashCode + i2) * 31) + aAI()) * 31;
        String str = this.image;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = getName();
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        i2 = QE();
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str = this.Dy;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dcd;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dci;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetMulti(asset=");
        stringBuilder.append(this.aoX);
        stringBuilder.append(", diff=");
        stringBuilder.append(adn());
        stringBuilder.append(", isDiffPositive=");
        stringBuilder.append(this.dcb);
        stringBuilder.append(", spotProfit=");
        stringBuilder.append(aAI());
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", isFavorite=");
        stringBuilder.append(QE());
        stringBuilder.append(", quote=");
        stringBuilder.append(this.Dy);
        stringBuilder.append(", diffFormatted=");
        stringBuilder.append(this.dcd);
        stringBuilder.append(", spotProfitFormatted=");
        stringBuilder.append(this.dci);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double adn() {
        return this.dca;
    }

    public final boolean aAV() {
        return this.dcb;
    }

    public int aAI() {
        return this.dch;
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

    public final String aAW() {
        return this.dcd;
    }

    public final String aBa() {
        return this.dci;
    }

    public n(a aVar, double d, boolean z, int i, String str, String str2, boolean z2, String str3, String str4, String str5) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(str2, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str3, "quote");
        kotlin.jvm.internal.i.f(str4, "diffFormatted");
        kotlin.jvm.internal.i.f(str5, "spotProfitFormatted");
        super(aVar, null);
        this.aoX = aVar;
        this.dca = d;
        this.dcb = z;
        this.dch = i;
        this.image = str;
        this.name = str2;
        this.axL = z2;
        this.Dy = str3;
        this.dcd = str4;
        this.dci = str5;
    }
}
