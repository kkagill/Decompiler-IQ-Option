package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.data.model.Direction;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u00002\u00020\u0001:\u0001JB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÂ\u0003J\t\u0010;\u001a\u00020\u0012HÂ\u0003J\t\u0010<\u001a\u00020\u0018HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J©\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010F\u001a\u00020'2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0004HÖ\u0001J\t\u0010I\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b&\u0010(R\u0010\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0016\u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0010\u0010\u0016\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u00101\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006K"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem;", "", "()V", "assetId", "", "instrumentId", "", "underlying", "strike", "", "instrumentDir", "Lcom/iqoption/core/data/model/Direction;", "closeUnderlyingPrice", "openUnderlyingPrice", "buyAvgPrice", "buyAvgPriceEnrolled", "sellAvgPrice", "createAt", "", "spotLowerInstrumentId", "spotUpperInstrumentId", "lowerInstrumentStrike", "upperInstrumentStrike", "winStatus", "Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;", "(ILjava/lang/String;Ljava/lang/String;DLcom/iqoption/core/data/model/Direction;DDDDDJLjava/lang/String;Ljava/lang/String;JJLcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;)V", "getAssetId", "()I", "getBuyAvgPrice", "()D", "getBuyAvgPriceEnrolled", "getCloseUnderlyingPrice", "getCreateAt", "()J", "getInstrumentDir", "()Lcom/iqoption/core/data/model/Direction;", "getInstrumentId", "()Ljava/lang/String;", "isCall", "", "()Z", "lowerStrike", "getLowerStrike", "getOpenUnderlyingPrice", "getSellAvgPrice", "getSpotLowerInstrumentId", "getSpotUpperInstrumentId", "getStrike", "getUnderlying", "upperStrike", "getUpperStrike", "getWinStatus", "()Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "WinStatus", "core_release"})
/* compiled from: MultiPositionItem.kt */
public final class MultiPositionItem {
    @SerializedName("instrument_active_id")
    private final int aqg;
    @SerializedName("instrument_dir")
    private final Direction bBF;
    @SerializedName("lower_instrument_strike")
    private final long bBT;
    @SerializedName("upper_instrument_strike")
    private final long bBU;
    @SerializedName("create_at")
    private final long bBt;
    @SerializedName("instrument_strike")
    private final double bCb;
    @SerializedName("close_underlying_price")
    private final double bCc;
    @SerializedName("open_underlying_price")
    private final double bCd;
    @SerializedName("buy_avg_price")
    private final double bCe;
    @SerializedName("buy_avg_price_enrolled")
    private final double bCf;
    @SerializedName("sell_avg_price")
    private final double bCg;
    @SerializedName("win_status")
    private final WinStatus bCh;
    @SerializedName("instrument_id")
    private final String instrumentId;
    @SerializedName("lower_instrument_id")
    private final String spotLowerInstrumentId;
    @SerializedName("upper_instrument_id")
    private final String spotUpperInstrumentId;
    @SerializedName("instrument_underlying")
    private final String underlying;

    @JsonAdapter(b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "WIN", "LOST", "SOLD", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: MultiPositionItem.kt */
    public enum WinStatus {
        UNKNOWN("_unknown"),
        WIN("win"),
        LOST("lost"),
        SOLD("sold");
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;", "value", "", "core_release"})
        /* compiled from: MultiPositionItem.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final WinStatus gR(String str) {
                if (str == null) {
                    return WinStatus.UNKNOWN;
                }
                Enum enumR = WinStatus.UNKNOWN;
                for (WinStatus winStatus : WinStatus.values()) {
                    if (kotlin.jvm.internal.i.y(winStatus.getServerValue(), str)) {
                        break;
                    }
                }
                WinStatus winStatus2 = null;
                Enum enumR2 = winStatus2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (WinStatus) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem$WinStatus;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: MultiPositionItem.kt */
        public static final class b extends TypeAdapter<WinStatus> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, WinStatus winStatus) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (winStatus == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(winStatus.getServerValue());
                }
            }

            /* renamed from: ac */
            public WinStatus read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return WinStatus.Companion.gR(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return WinStatus.UNKNOWN;
            }
        }

        private WinStatus(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultiPositionItem) {
                MultiPositionItem multiPositionItem = (MultiPositionItem) obj;
                if ((this.aqg == multiPositionItem.aqg ? 1 : null) != null && kotlin.jvm.internal.i.y(this.instrumentId, multiPositionItem.instrumentId) && kotlin.jvm.internal.i.y(this.underlying, multiPositionItem.underlying) && Double.compare(this.bCb, multiPositionItem.bCb) == 0 && kotlin.jvm.internal.i.y(this.bBF, multiPositionItem.bBF) && Double.compare(this.bCc, multiPositionItem.bCc) == 0 && Double.compare(this.bCd, multiPositionItem.bCd) == 0 && Double.compare(this.bCe, multiPositionItem.bCe) == 0 && Double.compare(this.bCf, multiPositionItem.bCf) == 0 && Double.compare(this.bCg, multiPositionItem.bCg) == 0) {
                    if ((this.bBt == multiPositionItem.bBt ? 1 : null) != null && kotlin.jvm.internal.i.y(this.spotLowerInstrumentId, multiPositionItem.spotLowerInstrumentId) && kotlin.jvm.internal.i.y(this.spotUpperInstrumentId, multiPositionItem.spotUpperInstrumentId)) {
                        if ((this.bBT == multiPositionItem.bBT ? 1 : null) != null) {
                            if ((this.bBU == multiPositionItem.bBU ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bCh, multiPositionItem.bCh)) {
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
        int i = this.aqg * 31;
        String str = this.instrumentId;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.underlying;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bCb);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        Direction direction = this.bBF;
        i = (i + (direction != null ? direction.hashCode() : 0)) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bCc);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bCd);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bCe);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bCf);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bCg);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.bBt;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str2 = this.spotLowerInstrumentId;
        i = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.spotUpperInstrumentId;
        i = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        doubleToLongBits = this.bBT;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.bBU;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        WinStatus winStatus = this.bCh;
        if (winStatus != null) {
            i2 = winStatus.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiPositionItem(assetId=");
        stringBuilder.append(this.aqg);
        stringBuilder.append(", instrumentId=");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append(", underlying=");
        stringBuilder.append(this.underlying);
        stringBuilder.append(", strike=");
        stringBuilder.append(this.bCb);
        stringBuilder.append(", instrumentDir=");
        stringBuilder.append(this.bBF);
        stringBuilder.append(", closeUnderlyingPrice=");
        stringBuilder.append(this.bCc);
        stringBuilder.append(", openUnderlyingPrice=");
        stringBuilder.append(this.bCd);
        stringBuilder.append(", buyAvgPrice=");
        stringBuilder.append(this.bCe);
        stringBuilder.append(", buyAvgPriceEnrolled=");
        stringBuilder.append(this.bCf);
        stringBuilder.append(", sellAvgPrice=");
        stringBuilder.append(this.bCg);
        stringBuilder.append(", createAt=");
        stringBuilder.append(this.bBt);
        stringBuilder.append(", spotLowerInstrumentId=");
        stringBuilder.append(this.spotLowerInstrumentId);
        stringBuilder.append(", spotUpperInstrumentId=");
        stringBuilder.append(this.spotUpperInstrumentId);
        stringBuilder.append(", lowerInstrumentStrike=");
        stringBuilder.append(this.bBT);
        stringBuilder.append(", upperInstrumentStrike=");
        stringBuilder.append(this.bBU);
        stringBuilder.append(", winStatus=");
        stringBuilder.append(this.bCh);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MultiPositionItem(int i, String str, String str2, double d, Direction direction, double d2, double d3, double d4, double d5, double d6, long j, String str3, String str4, long j2, long j3, WinStatus winStatus) {
        String str5 = str;
        String str6 = str2;
        Direction direction2 = direction;
        String str7 = str3;
        String str8 = str4;
        WinStatus winStatus2 = winStatus;
        kotlin.jvm.internal.i.f(str, "instrumentId");
        kotlin.jvm.internal.i.f(str2, "underlying");
        kotlin.jvm.internal.i.f(direction, "instrumentDir");
        kotlin.jvm.internal.i.f(str7, "spotLowerInstrumentId");
        kotlin.jvm.internal.i.f(str8, "spotUpperInstrumentId");
        kotlin.jvm.internal.i.f(winStatus2, "winStatus");
        this.aqg = i;
        this.instrumentId = str5;
        this.underlying = str6;
        this.bCb = d;
        this.bBF = direction2;
        this.bCc = d2;
        this.bCd = d3;
        this.bCe = d4;
        this.bCf = d5;
        this.bCg = d6;
        this.bBt = j;
        this.spotLowerInstrumentId = str7;
        this.spotUpperInstrumentId = str8;
        this.bBT = j2;
        this.bBU = j3;
        this.bCh = winStatus2;
    }

    public final int Bs() {
        return this.aqg;
    }

    public /* synthetic */ MultiPositionItem(int i, String str, String str2, double d, Direction direction, double d2, double d3, double d4, double d5, double d6, long j, String str3, String str4, long j2, long j3, WinStatus winStatus, int i2, f fVar) {
        Direction direction2;
        int i3 = i2;
        int i4 = (i3 & 1) != 0 ? -1 : i;
        String str5 = "";
        String str6 = (i3 & 2) != 0 ? str5 : str;
        String str7 = (i3 & 4) != 0 ? str5 : str2;
        double d7 = (i3 & 8) != 0 ? 0.0d : d;
        if ((i3 & 16) != 0) {
            direction2 = Direction.UNKNOWN;
        } else {
            direction2 = direction;
        }
        double d8 = (i3 & 32) != 0 ? 0.0d : d2;
        double d9 = (i3 & 64) != 0 ? 0.0d : d3;
        double d10 = (i3 & 128) != 0 ? 0.0d : d4;
        double d11 = (i3 & 256) != 0 ? 0.0d : d5;
        String str8 = str5;
        double d12 = (i3 & 512) != 0 ? 0.0d : d6;
        long j4 = 0;
        long j5 = (i3 & 1024) != 0 ? 0 : j;
        String str9 = (i3 & 2048) != 0 ? str8 : str3;
        str8 = (i3 & 4096) != 0 ? str8 : str4;
        long j6 = (i3 & 8192) != 0 ? 0 : j2;
        if ((i3 & 16384) == 0) {
            j4 = j3;
        }
        this(i4, str6, str7, d7, direction2, d8, d9, d10, d11, d12, j5, str9, str8, j6, j4, (i3 & 32768) != 0 ? WinStatus.UNKNOWN : winStatus);
    }

    public final double getCloseUnderlyingPrice() {
        return this.bCc;
    }

    public final double getOpenUnderlyingPrice() {
        return this.bCd;
    }

    public final long aiN() {
        return this.bBt;
    }

    public final WinStatus aiO() {
        return this.bCh;
    }

    public final boolean isCall() {
        return this.bBF == Direction.CALL;
    }

    public MultiPositionItem() {
        this(-1, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, null, 0, 0, null, 65534, null);
    }
}
