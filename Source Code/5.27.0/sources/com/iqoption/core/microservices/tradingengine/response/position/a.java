package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0002\u0010\u0017J\t\u00101\u001a\u00020\u0004HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\t\u00104\u001a\u00020\u0013HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\t\u0010C\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b/\u0010)R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d¨\u0006D"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/ExtraData;", "", "()V", "isAutoMarginCall", "", "_stopOutThreshold", "", "isSpotOption", "spotLowerInstrumentId", "", "spotUpperInstrumentId", "lowerInstrumentStrike", "", "upperInstrumentStrike", "payoutLimit", "Lcom/iqoption/core/microservices/tradingengine/response/position/PayoutLimit;", "stopLossValue", "", "stopLossKind", "Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "takeProfitValue", "takeProfitKind", "isTrailingStop", "(ZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;JJLcom/iqoption/core/microservices/tradingengine/response/position/PayoutLimit;Ljava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Ljava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Z)V", "get_stopOutThreshold", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getLowerInstrumentStrike", "()J", "negativeStopOutThreshold", "getNegativeStopOutThreshold", "()D", "getPayoutLimit", "()Lcom/iqoption/core/microservices/tradingengine/response/position/PayoutLimit;", "getSpotLowerInstrumentId", "()Ljava/lang/String;", "getSpotUpperInstrumentId", "getStopLossKind", "()Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "getStopLossValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "stopOutThreshold", "getStopOutThreshold", "()I", "getTakeProfitKind", "getTakeProfitValue", "getUpperInstrumentStrike", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;JJLcom/iqoption/core/microservices/tradingengine/response/position/PayoutLimit;Ljava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Ljava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Z)Lcom/iqoption/core/microservices/tradingengine/response/position/ExtraData;", "equals", "other", "hashCode", "toString", "core_release"})
/* compiled from: ExtraData.kt */
public final class a {
    @SerializedName("auto_margin_call")
    private final boolean bBQ;
    @SerializedName("stop_out_threshold")
    private final Integer bBR;
    @SerializedName("spot_option")
    private final boolean bBS;
    @SerializedName("lower_instrument_strike")
    private final long bBT;
    @SerializedName("upper_instrument_strike")
    private final long bBU;
    @SerializedName("payout_limit")
    private final b bBV;
    @SerializedName("stop_loss_value")
    private final Double bBW;
    @SerializedName("stop_loss_kind")
    private final TPSLKind bBX;
    @SerializedName("take_profit_value")
    private final Double bBY;
    @SerializedName("take_profit_kind")
    private final TPSLKind bBZ;
    @SerializedName("use_trail_stop")
    private final boolean bCa;
    @SerializedName("lower_instrument_id")
    private final String spotLowerInstrumentId;
    @SerializedName("upper_instrument_id")
    private final String spotUpperInstrumentId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.bBQ == aVar.bBQ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBR, aVar.bBR)) {
                    if ((this.bBS == aVar.bBS ? 1 : null) != null && kotlin.jvm.internal.i.y(this.spotLowerInstrumentId, aVar.spotLowerInstrumentId) && kotlin.jvm.internal.i.y(this.spotUpperInstrumentId, aVar.spotUpperInstrumentId)) {
                        if ((this.bBT == aVar.bBT ? 1 : null) != null) {
                            if ((this.bBU == aVar.bBU ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBV, aVar.bBV) && kotlin.jvm.internal.i.y(this.bBW, aVar.bBW) && kotlin.jvm.internal.i.y(this.bBX, aVar.bBX) && kotlin.jvm.internal.i.y(this.bBY, aVar.bBY) && kotlin.jvm.internal.i.y(this.bBZ, aVar.bBZ)) {
                                if ((this.bCa == aVar.bCa ? 1 : null) != null) {
                                    return true;
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
        int i = this.bBQ;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        Integer num = this.bBR;
        int i3 = 0;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        int i4 = this.bBS;
        if (i4 != 0) {
            i4 = 1;
        }
        i = (i + i4) * 31;
        String str = this.spotLowerInstrumentId;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.spotUpperInstrumentId;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j = this.bBT;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.bBU;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        b bVar = this.bBV;
        i = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Double d = this.bBW;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        TPSLKind tPSLKind = this.bBX;
        i = (i + (tPSLKind != null ? tPSLKind.hashCode() : 0)) * 31;
        d = this.bBY;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        tPSLKind = this.bBZ;
        if (tPSLKind != null) {
            i3 = tPSLKind.hashCode();
        }
        i = (i + i3) * 31;
        boolean z = this.bCa;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtraData(isAutoMarginCall=");
        stringBuilder.append(this.bBQ);
        stringBuilder.append(", _stopOutThreshold=");
        stringBuilder.append(this.bBR);
        stringBuilder.append(", isSpotOption=");
        stringBuilder.append(this.bBS);
        stringBuilder.append(", spotLowerInstrumentId=");
        stringBuilder.append(this.spotLowerInstrumentId);
        stringBuilder.append(", spotUpperInstrumentId=");
        stringBuilder.append(this.spotUpperInstrumentId);
        stringBuilder.append(", lowerInstrumentStrike=");
        stringBuilder.append(this.bBT);
        stringBuilder.append(", upperInstrumentStrike=");
        stringBuilder.append(this.bBU);
        stringBuilder.append(", payoutLimit=");
        stringBuilder.append(this.bBV);
        stringBuilder.append(", stopLossValue=");
        stringBuilder.append(this.bBW);
        stringBuilder.append(", stopLossKind=");
        stringBuilder.append(this.bBX);
        stringBuilder.append(", takeProfitValue=");
        stringBuilder.append(this.bBY);
        stringBuilder.append(", takeProfitKind=");
        stringBuilder.append(this.bBZ);
        stringBuilder.append(", isTrailingStop=");
        stringBuilder.append(this.bCa);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(boolean z, Integer num, boolean z2, String str, String str2, long j, long j2, b bVar, Double d, TPSLKind tPSLKind, Double d2, TPSLKind tPSLKind2, boolean z3) {
        String str3 = str;
        String str4 = str2;
        TPSLKind tPSLKind3 = tPSLKind;
        TPSLKind tPSLKind4 = tPSLKind2;
        kotlin.jvm.internal.i.f(str, "spotLowerInstrumentId");
        kotlin.jvm.internal.i.f(str2, "spotUpperInstrumentId");
        kotlin.jvm.internal.i.f(tPSLKind3, "stopLossKind");
        kotlin.jvm.internal.i.f(tPSLKind4, "takeProfitKind");
        this.bBQ = z;
        this.bBR = num;
        this.bBS = z2;
        this.spotLowerInstrumentId = str3;
        this.spotUpperInstrumentId = str4;
        this.bBT = j;
        this.bBU = j2;
        this.bBV = bVar;
        this.bBW = d;
        this.bBX = tPSLKind3;
        this.bBY = d2;
        this.bBZ = tPSLKind4;
        this.bCa = z3;
    }

    public /* synthetic */ a(boolean z, Integer num, boolean z2, String str, String str2, long j, long j2, b bVar, Double d, TPSLKind tPSLKind, Double d2, TPSLKind tPSLKind2, boolean z3, int i, f fVar) {
        int i2 = i;
        boolean z4 = false;
        boolean z5 = (i2 & 1) != 0 ? false : z;
        Integer num2 = (i2 & 2) != 0 ? (Integer) null : num;
        boolean z6 = (i2 & 4) != 0 ? false : z2;
        String str3 = "";
        String str4 = (i2 & 8) != 0 ? str3 : str;
        if ((i2 & 16) == 0) {
            str3 = str2;
        }
        long j3 = 0;
        long j4 = (i2 & 32) != 0 ? 0 : j;
        if ((i2 & 64) == 0) {
            j3 = j2;
        }
        b bVar2 = (i2 & 128) != 0 ? (b) null : bVar;
        Double d3 = (i2 & 256) != 0 ? (Double) null : d;
        TPSLKind tPSLKind3 = (i2 & 512) != 0 ? TPSLKind.UNKNOWN : tPSLKind;
        Double d4 = (i2 & 1024) != 0 ? (Double) null : d2;
        TPSLKind tPSLKind4 = (i2 & 2048) != 0 ? TPSLKind.UNKNOWN : tPSLKind2;
        if ((i2 & 4096) == 0) {
            z4 = z3;
        }
        this(z5, num2, z6, str4, str3, j4, j3, bVar2, d3, tPSLKind3, d4, tPSLKind4, z4);
    }

    public a() {
        this(false, null, false, null, null, 0, 0, null, null, null, null, null, false, 8190, null);
    }
}
