package com.iqoption.fragment.assets.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001J\u0013\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018¨\u00068"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCfd;", "Lcom/iqoption/fragment/assets/model/AssetItem;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "volume", "", "diff", "isDiffPositive", "", "spread", "leverage", "", "image", "", "name", "isFavorite", "quote", "diffFormatted", "spreadFormatted", "leverageFormatted", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;DDZDILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getDiff", "()D", "getDiffFormatted", "()Ljava/lang/String;", "getImage", "()Z", "getLeverage", "()I", "getLeverageFormatted", "getName", "getQuote", "getSpread", "getSpreadFormatted", "getVolume", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class g extends k {
    private final String Dy;
    private final a aoX;
    private final boolean axL;
    private final double bxO;
    private final double dca;
    private final boolean dcb;
    private final double dcc;
    private final String dcd;
    private final String dce;
    private final String dcf;
    private final String image;
    private final int leverage;
    private final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (kotlin.jvm.internal.i.y(this.aoX, gVar.aoX) && Double.compare(aAK(), gVar.aAK()) == 0 && Double.compare(adn(), gVar.adn()) == 0) {
                    if ((this.dcb == gVar.dcb ? 1 : null) != null && Double.compare(aAL(), gVar.aAL()) == 0) {
                        if ((getLeverage() == gVar.getLeverage() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.image, gVar.image) && kotlin.jvm.internal.i.y(getName(), gVar.getName())) {
                            if (!((QE() == gVar.QE() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.Dy, gVar.Dy) && kotlin.jvm.internal.i.y(this.dcd, gVar.dcd) && kotlin.jvm.internal.i.y(this.dce, gVar.dce) && kotlin.jvm.internal.i.y(this.dcf, gVar.dcf))) {
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
        long doubleToLongBits = Double.doubleToLongBits(aAK());
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(adn());
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        int i2 = this.dcb;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(aAL());
        hashCode = (((hashCode + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + getLeverage()) * 31;
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
        str = this.dce;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dcf;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetCfd(asset=");
        stringBuilder.append(this.aoX);
        stringBuilder.append(", volume=");
        stringBuilder.append(aAK());
        stringBuilder.append(", diff=");
        stringBuilder.append(adn());
        stringBuilder.append(", isDiffPositive=");
        stringBuilder.append(this.dcb);
        stringBuilder.append(", spread=");
        stringBuilder.append(aAL());
        stringBuilder.append(", leverage=");
        stringBuilder.append(getLeverage());
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
        stringBuilder.append(", spreadFormatted=");
        stringBuilder.append(this.dce);
        stringBuilder.append(", leverageFormatted=");
        stringBuilder.append(this.dcf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double aAK() {
        return this.bxO;
    }

    public double adn() {
        return this.dca;
    }

    public final boolean aAV() {
        return this.dcb;
    }

    public double aAL() {
        return this.dcc;
    }

    public int getLeverage() {
        return this.leverage;
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

    public final String aAX() {
        return this.dce;
    }

    public final String aAY() {
        return this.dcf;
    }

    public g(a aVar, double d, double d2, boolean z, double d3, int i, String str, String str2, boolean z2, String str3, String str4, String str5, String str6) {
        a aVar2 = aVar;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(str7, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str8, "quote");
        kotlin.jvm.internal.i.f(str9, "diffFormatted");
        kotlin.jvm.internal.i.f(str10, "spreadFormatted");
        kotlin.jvm.internal.i.f(str11, "leverageFormatted");
        super(aVar, null);
        this.aoX = aVar2;
        this.bxO = d;
        this.dca = d2;
        this.dcb = z;
        this.dcc = d3;
        this.leverage = i;
        this.image = str;
        this.name = str7;
        this.axL = z2;
        this.Dy = str8;
        this.dcd = str9;
        this.dce = str10;
        this.dcf = str11;
    }
}
