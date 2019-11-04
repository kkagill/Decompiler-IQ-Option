package com.iqoption.core.microservices.configuration.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import com.iqoption.dto.Currencies;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001JB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B±\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f¢\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\u0002HÆ\u0003J\t\u0010.\u001a\u00020\u0012HÂ\u0003J\t\u0010/\u001a\u00020\u0012HÂ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003Jµ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\fHÆ\u0001J\t\u0010?\u001a\u00020\u0010HÖ\u0001J\u0013\u0010@\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0010HÖ\u0001J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0010HÖ\u0001R\u0010\u0010\u0011\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u0018\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010!R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010!R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010!R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010!R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0014\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010)\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'¨\u0006K"}, bng = {"Lcom/iqoption/core/microservices/configuration/response/Currency;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "Landroid/os/Parcelable;", "()V", "id", "name", "", "description", "symbol", "mask", "isVisible", "", "isTradable", "code", "unit", "", "_rate", "", "_rateUsd", "minDealAmount", "maxDealAmount", "minorUnits", "image", "isCrypto", "isInOut", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IDDDDILjava/lang/String;ZZ)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()Ljava/lang/Long;", "getImage", "()Z", "getMask", "getMaxDealAmount", "()D", "getMinDealAmount", "getMinorUnits", "()I", "getName", "rate", "getRate", "getSymbol", "getUnit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: Currency.kt */
public final class d implements Parcelable, com.iqoption.core.ui.widget.recyclerview.adapter.a.d<Long> {
    private static final String BTC_CURRENCY = "BTC";
    private static final int BTC_CURRENCY_ID = 44;
    public static final Creator CREATOR = new b();
    private static final String ETH_CURRENCY = "ETH";
    private static final int ETH_CURRENCY_ID = 46;
    private static final String EUR_CURRENCY = "EUR";
    private static final String OTM_CURRENCY = "OTM";
    private static final int OTM_CURRENCY_ID = 47;
    private static final String OTN_CURRENCY = "OTN";
    private static final int OTN_CURRENCY_ID = 45;
    private static final int brJ = 2;
    private static final int brK = 6;
    private static final String brL = brL;
    private static final d brM = new d();
    public static final a brN = new a();
    @SerializedName("is_tradable")
    private final boolean brA;
    @SerializedName("unit")
    private final int brB;
    @SerializedName("rate")
    private final double brC;
    @SerializedName("rate_usd")
    private final double brD;
    @SerializedName("min_deal_amount")
    private final double brE;
    @SerializedName("max_deal_amount")
    private final double brF;
    @SerializedName("minor_units")
    private final int brG;
    @SerializedName("is_crypto")
    private final boolean brH;
    @SerializedName("is_inout")
    private final boolean brI;
    @SerializedName("code")
    private final String code;
    @SerializedName("description")
    private final String description;
    @SerializedName("id")
    private final long id;
    @SerializedName("image")
    private final String image;
    @SerializedName("is_visible")
    private final boolean isVisible;
    @SerializedName("mask")
    private final String mask;
    @SerializedName("name")
    private final String name;
    @SerializedName("symbol")
    private final String symbol;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, bng = {"Lcom/iqoption/core/microservices/configuration/response/Currency$Companion;", "", "()V", "BTC_CURRENCY", "", "getBTC_CURRENCY", "()Ljava/lang/String;", "BTC_CURRENCY_ID", "", "getBTC_CURRENCY_ID", "()I", "CRYPTO_MINOR_UNITS_DEFAULT", "getCRYPTO_MINOR_UNITS_DEFAULT", "EMPTY", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "getEMPTY", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "ETH_CURRENCY", "getETH_CURRENCY", "ETH_CURRENCY_ID", "getETH_CURRENCY_ID", "EUR_CURRENCY", "getEUR_CURRENCY", "MINOR_UNITS_DEFAULT", "getMINOR_UNITS_DEFAULT", "OTM_CURRENCY", "getOTM_CURRENCY", "OTM_CURRENCY_ID", "getOTM_CURRENCY_ID", "OTN_CURRENCY", "getOTN_CURRENCY", "OTN_CURRENCY_ID", "getOTN_CURRENCY_ID", "USD_CURRENCY", "getUSD_CURRENCY", "core_release"})
    /* compiled from: Currency.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String acS() {
            return d.BTC_CURRENCY;
        }

        public final d acT() {
            return d.brM;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new d(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
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
                if ((getId().longValue() == dVar.getId().longValue() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, dVar.name) && kotlin.jvm.internal.i.y(this.description, dVar.description) && kotlin.jvm.internal.i.y(this.symbol, dVar.symbol) && kotlin.jvm.internal.i.y(this.mask, dVar.mask)) {
                    if ((this.isVisible == dVar.isVisible ? 1 : null) != null) {
                        if ((this.brA == dVar.brA ? 1 : null) != null && kotlin.jvm.internal.i.y(this.code, dVar.code)) {
                            if ((this.brB == dVar.brB ? 1 : null) != null && Double.compare(this.brC, dVar.brC) == 0 && Double.compare(this.brD, dVar.brD) == 0 && Double.compare(this.brE, dVar.brE) == 0 && Double.compare(this.brF, dVar.brF) == 0) {
                                if ((this.brG == dVar.brG ? 1 : null) != null && kotlin.jvm.internal.i.y(this.image, dVar.image)) {
                                    if ((this.brH == dVar.brH ? 1 : null) != null) {
                                        if ((this.brI == dVar.brI ? 1 : null) != null) {
                                            return true;
                                        }
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
        long longValue = getId().longValue();
        int i = ((int) (longValue ^ (longValue >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.description;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.symbol;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.mask;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        int i3 = this.isVisible;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.brA;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        str = this.code;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.brB) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.brC);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.brD);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.brE);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.brF);
        i = (((i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.brG) * 31;
        str = this.image;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        i3 = this.brH;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.brI;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Currency(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.symbol);
        stringBuilder.append(", mask=");
        stringBuilder.append(this.mask);
        stringBuilder.append(", isVisible=");
        stringBuilder.append(this.isVisible);
        stringBuilder.append(", isTradable=");
        stringBuilder.append(this.brA);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(", unit=");
        stringBuilder.append(this.brB);
        stringBuilder.append(", _rate=");
        stringBuilder.append(this.brC);
        stringBuilder.append(", _rateUsd=");
        stringBuilder.append(this.brD);
        stringBuilder.append(", minDealAmount=");
        stringBuilder.append(this.brE);
        stringBuilder.append(", maxDealAmount=");
        stringBuilder.append(this.brF);
        stringBuilder.append(", minorUnits=");
        stringBuilder.append(this.brG);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", isCrypto=");
        stringBuilder.append(this.brH);
        stringBuilder.append(", isInOut=");
        stringBuilder.append(this.brI);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.symbol);
        parcel.writeString(this.mask);
        parcel.writeInt(this.isVisible);
        parcel.writeInt(this.brA);
        parcel.writeString(this.code);
        parcel.writeInt(this.brB);
        parcel.writeDouble(this.brC);
        parcel.writeDouble(this.brD);
        parcel.writeDouble(this.brE);
        parcel.writeDouble(this.brF);
        parcel.writeInt(this.brG);
        parcel.writeString(this.image);
        parcel.writeInt(this.brH);
        parcel.writeInt(this.brI);
    }

    public d(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i, double d, double d2, double d3, double d4, int i2, String str6, boolean z3, boolean z4) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        kotlin.jvm.internal.i.f(str3, "symbol");
        kotlin.jvm.internal.i.f(str4, "mask");
        kotlin.jvm.internal.i.f(str11, "code");
        this.id = j;
        this.name = str7;
        this.description = str8;
        this.symbol = str9;
        this.mask = str10;
        this.isVisible = z;
        this.brA = z2;
        this.code = str11;
        this.brB = i;
        this.brC = d;
        this.brD = d2;
        this.brE = d3;
        this.brF = d4;
        this.brG = i2;
        this.image = str6;
        this.brH = z3;
        this.brI = z4;
    }

    public Long getId() {
        return Long.valueOf(this.id);
    }

    public final String getName() {
        return this.name;
    }

    public final String getMask() {
        return this.mask;
    }

    public /* synthetic */ d(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i, double d, double d2, double d3, double d4, int i2, String str6, boolean z3, boolean z4, int i3, f fVar) {
        int i4 = i3;
        long j2 = (i4 & 1) != 0 ? -1 : j;
        String str7 = "";
        String str8 = (i4 & 2) != 0 ? str7 : str;
        String str9 = (i4 & 4) != 0 ? str7 : str2;
        String str10 = (i4 & 8) != 0 ? str7 : str3;
        String str11 = (i4 & 16) != 0 ? Currencies.REPLACE_CURRENCY_MASK : str4;
        boolean z5 = (i4 & 32) != 0 ? false : z;
        boolean z6 = (i4 & 64) != 0 ? false : z2;
        if ((i4 & 128) == 0) {
            str7 = str5;
        }
        int i5 = (i4 & 256) != 0 ? 1 : i;
        double d5 = 1.0d;
        double d6 = (i4 & 512) != 0 ? 1.0d : d;
        if ((i4 & 1024) == 0) {
            d5 = d2;
        }
        double d7 = 0.0d;
        double d8 = (i4 & 2048) != 0 ? 0.0d : d3;
        if ((i4 & 4096) == 0) {
            d7 = d4;
        }
        this(j2, str8, str9, str10, str11, z5, z6, str7, i5, d6, d5, d8, d7, (i4 & 8192) != 0 ? brJ : i2, (i4 & 16384) != 0 ? (String) null : str6, (i4 & 32768) != 0 ? false : z3, (i4 & 65536) != 0 ? false : z4);
    }

    public final int getMinorUnits() {
        return this.brG;
    }

    public final double getRate() {
        double d = this.brD;
        double d2 = (double) this.brB;
        Double.isNaN(d2);
        return d / d2;
    }

    public d() {
        this(-1, null, null, null, null, false, false, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, false, false, 131070, null);
    }
}
