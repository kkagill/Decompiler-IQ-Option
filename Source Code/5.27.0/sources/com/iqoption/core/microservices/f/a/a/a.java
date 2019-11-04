package com.iqoption.core.microservices.f.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\t\u00108\u001a\u00020\u0004HÖ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0004HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R \u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017¨\u0006G"}, bng = {"Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "Landroid/os/Parcelable;", "()V", "activeId", "", "spread", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;", "diff1h", "diffTradingDay", "curPrice", "volatility", "popularity", "volume", "expiration", "spotProfit", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "(ILcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;Lcom/iqoption/core/data/model/InstrumentType;)V", "getActiveId", "()I", "getCurPrice", "()Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;", "setCurPrice", "(Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;)V", "getDiff1h", "setDiff1h", "getDiffTradingDay", "setDiffTradingDay", "getExpiration", "setExpiration", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "setInstrumentType", "(Lcom/iqoption/core/data/model/InstrumentType;)V", "getPopularity", "setPopularity", "getSpotProfit", "setSpotProfit", "getSpread", "setSpread", "getVolatility", "setVolatility", "getVolume", "setVolume", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "ValueIsValid", "core_release"})
/* compiled from: SpreadData.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a bzg = new a();
    @SerializedName("active_id")
    private final int activeId;
    @SerializedName("spread")
    private c byX;
    @SerializedName("diff_1h")
    private c byY;
    @SerializedName("diff_trading_day")
    private c byZ;
    @SerializedName("cur_price")
    private c bza;
    @SerializedName("volatility")
    private c bzb;
    @SerializedName("popularity")
    private c bzc;
    @SerializedName("volume")
    private c bzd;
    @SerializedName("expiration")
    private c bze;
    @SerializedName("spot_profit")
    private c bzf;
    private InstrumentType instrumentType;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$Companion;", "", "()V", "getCurPrice", "", "spread", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "(Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;)Ljava/lang/Double;", "getDiff1H", "getDiffTradingDay", "getExpiration", "", "(Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;)Ljava/lang/Long;", "getSpotProfit", "", "(Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;)Ljava/lang/Integer;", "getSpotProfitDouble", "getSpread", "getValue", "valueIsValid", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;", "(Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;)Ljava/lang/Double;", "getVolume", "core_release"})
    /* compiled from: SpreadData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Double d(a aVar) {
            if (aVar != null) {
                c ahw = aVar.ahw();
                if (ahw != null) {
                    return ahw.ahD();
                }
            }
            return null;
        }

        public final Double e(a aVar) {
            if (aVar != null) {
                c ahx = aVar.ahx();
                if (ahx != null) {
                    return ahx.ahD();
                }
            }
            return null;
        }

        public final Double f(a aVar) {
            if (aVar != null) {
                c ahy = aVar.ahy();
                if (ahy != null) {
                    return ahy.ahD();
                }
            }
            return null;
        }

        public final Double g(a aVar) {
            if (aVar != null) {
                c ahz = aVar.ahz();
                if (ahz != null) {
                    return ahz.ahD();
                }
            }
            return null;
        }

        public final Double h(a aVar) {
            if (aVar != null) {
                c ahA = aVar.ahA();
                if (ahA != null) {
                    return ahA.ahD();
                }
            }
            return null;
        }

        public final Long a(a aVar) {
            if (aVar != null) {
                c ahB = aVar.ahB();
                if (ahB != null) {
                    Double ahD = ahB.ahD();
                    if (ahD != null) {
                        return Long.valueOf((long) ahD.doubleValue());
                    }
                }
            }
            return null;
        }

        public final Integer b(a aVar) {
            if (aVar != null) {
                c ahC = aVar.ahC();
                if (ahC != null) {
                    Double ahD = ahC.ahD();
                    if (ahD != null) {
                        return Integer.valueOf((int) ahD.doubleValue());
                    }
                }
            }
            return null;
        }

        public final double c(a aVar) {
            Double ahD;
            if (aVar != null) {
                c ahC = aVar.ahC();
                if (ahC != null) {
                    ahD = ahC.ahD();
                    return com.iqoption.core.ext.c.c(ahD);
                }
            }
            ahD = null;
            return com.iqoption.core.ext.c.c(ahD);
        }

        public final Double a(c cVar) {
            return cVar != null ? cVar.ahD() : null;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readInt(), parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null, (InstrumentType) Enum.valueOf(InstrumentType.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData$ValueIsValid;", "Landroid/os/Parcelable;", "()V", "_value", "", "isValid", "", "(DZ)V", "get_value", "()D", "()Z", "value", "getValue", "()Ljava/lang/Double;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: SpreadData.kt */
    public static final class c implements Parcelable {
        public static final Creator CREATOR = new a();
        @SerializedName("value")
        private final double bzh;
        @SerializedName("is_valid")
        private final boolean isValid;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                return new c(parcel.readDouble(), parcel.readInt() != 0);
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (Double.compare(this.bzh, cVar.bzh) == 0) {
                        if ((this.isValid == cVar.isValid ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.bzh);
            int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            int i2 = this.isValid;
            if (i2 != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ValueIsValid(_value=");
            stringBuilder.append(this.bzh);
            stringBuilder.append(", isValid=");
            stringBuilder.append(this.isValid);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            parcel.writeDouble(this.bzh);
            parcel.writeInt(this.isValid);
        }

        public c(double d, boolean z) {
            this.bzh = d;
            this.isValid = z;
        }

        public /* synthetic */ c(double d, boolean z, int i, f fVar) {
            if ((i & 1) != 0) {
                d = 0.0d;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            this(d, z);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final Double ahD() {
            return this.isValid ? Double.valueOf(this.bzh) : null;
        }

        public c() {
            this(0.0d, false, 2, null);
        }
    }

    public static final Double a(c cVar) {
        return bzg.a(cVar);
    }

    public static final Long a(a aVar) {
        return bzg.a(aVar);
    }

    public static final Integer b(a aVar) {
        return bzg.b(aVar);
    }

    public static final double c(a aVar) {
        return bzg.c(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!((this.activeId == aVar.activeId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.byX, aVar.byX) && kotlin.jvm.internal.i.y(this.byY, aVar.byY) && kotlin.jvm.internal.i.y(this.byZ, aVar.byZ) && kotlin.jvm.internal.i.y(this.bza, aVar.bza) && kotlin.jvm.internal.i.y(this.bzb, aVar.bzb) && kotlin.jvm.internal.i.y(this.bzc, aVar.bzc) && kotlin.jvm.internal.i.y(this.bzd, aVar.bzd) && kotlin.jvm.internal.i.y(this.bze, aVar.bze) && kotlin.jvm.internal.i.y(this.bzf, aVar.bzf) && kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.activeId * 31;
        c cVar = this.byX;
        int i2 = 0;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.byY;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.byZ;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bza;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bzb;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bzc;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bzd;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bze;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bzf;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType != null) {
            i2 = instrumentType.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpreadData(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", spread=");
        stringBuilder.append(this.byX);
        stringBuilder.append(", diff1h=");
        stringBuilder.append(this.byY);
        stringBuilder.append(", diffTradingDay=");
        stringBuilder.append(this.byZ);
        stringBuilder.append(", curPrice=");
        stringBuilder.append(this.bza);
        stringBuilder.append(", volatility=");
        stringBuilder.append(this.bzb);
        stringBuilder.append(", popularity=");
        stringBuilder.append(this.bzc);
        stringBuilder.append(", volume=");
        stringBuilder.append(this.bzd);
        stringBuilder.append(", expiration=");
        stringBuilder.append(this.bze);
        stringBuilder.append(", spotProfit=");
        stringBuilder.append(this.bzf);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.activeId);
        c cVar = this.byX;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.byY;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.byZ;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bza;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bzb;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bzc;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bzd;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bze;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        cVar = this.bzf;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.instrumentType.name());
    }

    public a(int i, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this.activeId = i;
        this.byX = cVar;
        this.byY = cVar2;
        this.byZ = cVar3;
        this.bza = cVar4;
        this.bzb = cVar5;
        this.bzc = cVar6;
        this.bzd = cVar7;
        this.bze = cVar8;
        this.bzf = cVar9;
        this.instrumentType = instrumentType;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public /* synthetic */ a(int i, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, InstrumentType instrumentType, int i2, f fVar) {
        int i3 = i2;
        int i4 = (i3 & 1) != 0 ? -1 : i;
        this(i4, (i3 & 2) != 0 ? (c) null : cVar, (i3 & 4) != 0 ? (c) null : cVar2, (i3 & 8) != 0 ? (c) null : cVar3, (i3 & 16) != 0 ? (c) null : cVar4, (i3 & 32) != 0 ? (c) null : cVar5, (i3 & 64) != 0 ? (c) null : cVar6, (i3 & 128) != 0 ? (c) null : cVar7, (i3 & 256) != 0 ? (c) null : cVar8, (i3 & 512) != 0 ? (c) null : cVar9, (i3 & 1024) != 0 ? InstrumentType.UNKNOWN : instrumentType);
    }

    public final c ahw() {
        return this.byX;
    }

    public final c ahx() {
        return this.byY;
    }

    public final c ahy() {
        return this.byZ;
    }

    public final c ahz() {
        return this.bza;
    }

    public final c ahA() {
        return this.bzd;
    }

    public final c ahB() {
        return this.bze;
    }

    public final c ahC() {
        return this.bzf;
    }

    public final void M(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "<set-?>");
        this.instrumentType = instrumentType;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public a() {
        this(-1, null, null, null, null, null, null, null, null, null, null, 2046, null);
    }
}
