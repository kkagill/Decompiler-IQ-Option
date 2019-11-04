package com.iqoption.core.microservices.tradingengine.response;

import androidx.core.util.Pools.SynchronizedPool;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0002\u0010\u0012J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003Jm\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010)\u001a\u00020\r2\u0006\u0010<\u001a\u00020\rJ\t\u0010=\u001a\u00020\u000bHÖ\u0001J\u0006\u0010>\u001a\u00020:J\t\u0010?\u001a\u00020\u0004HÖ\u0001R\u000e\u0010\u0013\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010,\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018¨\u0006B"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "", "()V", "instrumentId", "", "instrumentIdEscape", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "bidTime", "", "bidSize", "", "bidPrice", "", "askTime", "askSize", "askPrice", "delta", "(Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;JIDJIDD)V", "_profit", "_profitPercent", "getAskPrice", "()D", "getAskSize", "()I", "getAskTime", "()J", "getBidPrice", "getBidSize", "getBidTime", "getDelta", "getInstrumentId", "()Ljava/lang/String;", "getInstrumentIdEscape", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "lastTimeUpdate", "getLastTimeUpdate", "setLastTimeUpdate", "(J)V", "profit", "getProfit", "profitPercent", "getProfitPercent", "profitPercentInt", "getProfitPercentInt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "amount", "hashCode", "isExpired", "toString", "Companion", "Key", "core_release"})
/* compiled from: OptionQuote.kt */
public final class a {
    private static final a bzI = new a();
    private static final SynchronizedPool<b> bzJ = new SynchronizedPool(50);
    public static final a bzK = new a();
    @SerializedName("instrument_id_escape")
    private final String bzA;
    @SerializedName("bid_time")
    private final long bzB;
    @SerializedName("bid_size")
    private final int bzC;
    @SerializedName("bid_price")
    private final double bzD;
    @SerializedName("ask_time")
    private final long bzE;
    @SerializedName("ask_size")
    private final int bzF;
    @SerializedName("ask_price")
    private final double bzG;
    @SerializedName("delta")
    private final double bzH;
    private volatile long bzx;
    private volatile double bzy;
    private volatile double bzz;
    @SerializedName("instrument_id")
    private final String instrumentId;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    @i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "getEMPTY", "()Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "sPool", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote$Key;", "computeProfit", "", "askPrice", "computeProfitPercent", "isQuoteAvailable", "", "quote", "obtain", "instrumentId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "selfAskPrice", "selfBidPrice", "core_release"})
    /* compiled from: OptionQuote.kt */
    public static final class a {
        public final double n(double d) {
            return (100.0d - d) / d;
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b d(String str, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(str, "instrumentId");
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            b bVar = (b) a.bzJ.acquire();
            if (bVar == null) {
                return new b(str, instrumentType);
            }
            bVar.gQ(str);
            bVar.M(instrumentType);
            return bVar;
        }

        public final double e(a aVar) {
            return aVar != null ? aVar.getAskPrice() : 0.0d;
        }

        public final double f(a aVar) {
            return aVar != null ? aVar.getBidPrice() : 0.0d;
        }

        public final boolean g(a aVar) {
            return (aVar != null ? Double.valueOf(aVar.getAskPrice()) : null) != null && aVar.getAskPrice() > 0.0d;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote$Key;", "", "instrumentId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;)V", "getInstrumentId", "()Ljava/lang/String;", "setInstrumentId", "(Ljava/lang/String;)V", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "setInstrumentType", "(Lcom/iqoption/core/data/model/InstrumentType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "recycle", "", "toString", "core_release"})
    /* compiled from: OptionQuote.kt */
    public static final class b {
        private String instrumentId;
        private InstrumentType instrumentType;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.instrumentType, r3.instrumentType) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.a.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.tradingengine.response.a.b) r3;
            r0 = r2.instrumentId;
            r1 = r3.instrumentId;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.instrumentType;
            r3 = r3.instrumentType;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.a$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.instrumentId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            InstrumentType instrumentType = this.instrumentType;
            if (instrumentType != null) {
                i = instrumentType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key(instrumentId=");
            stringBuilder.append(this.instrumentId);
            stringBuilder.append(", instrumentType=");
            stringBuilder.append(this.instrumentType);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(String str, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(str, "instrumentId");
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            this.instrumentId = str;
            this.instrumentType = instrumentType;
        }

        public final void M(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "<set-?>");
            this.instrumentType = instrumentType;
        }

        public final void gQ(String str) {
            kotlin.jvm.internal.i.f(str, "<set-?>");
            this.instrumentId = str;
        }

        public final void recycle() {
            a.bzJ.release(this);
        }
    }

    public static final b d(String str, InstrumentType instrumentType) {
        return bzK.d(str, instrumentType);
    }

    public static final double e(a aVar) {
        return bzK.e(aVar);
    }

    public static final double f(a aVar) {
        return bzK.f(aVar);
    }

    public static final boolean g(a aVar) {
        return bzK.g(aVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentId, aVar.instrumentId) && kotlin.jvm.internal.i.y(this.bzA, aVar.bzA) && kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType)) {
                    if ((this.bzB == aVar.bzB ? 1 : null) != null) {
                        if ((this.bzC == aVar.bzC ? 1 : null) != null && Double.compare(this.bzD, aVar.bzD) == 0) {
                            if ((this.bzE == aVar.bzE ? 1 : null) != null) {
                                if (!((this.bzF == aVar.bzF ? 1 : null) != null && Double.compare(this.bzG, aVar.bzG) == 0 && Double.compare(this.bzH, aVar.bzH) == 0)) {
                                    return false;
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
        String str = this.instrumentId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bzA;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType != null) {
            i = instrumentType.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.bzB;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.bzC) * 31;
        j = Double.doubleToLongBits(this.bzD);
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.bzE;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.bzF) * 31;
        j = Double.doubleToLongBits(this.bzG);
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = Double.doubleToLongBits(this.bzH);
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OptionQuote(instrumentId=");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append(", instrumentIdEscape=");
        stringBuilder.append(this.bzA);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", bidTime=");
        stringBuilder.append(this.bzB);
        stringBuilder.append(", bidSize=");
        stringBuilder.append(this.bzC);
        stringBuilder.append(", bidPrice=");
        stringBuilder.append(this.bzD);
        stringBuilder.append(", askTime=");
        stringBuilder.append(this.bzE);
        stringBuilder.append(", askSize=");
        stringBuilder.append(this.bzF);
        stringBuilder.append(", askPrice=");
        stringBuilder.append(this.bzG);
        stringBuilder.append(", delta=");
        stringBuilder.append(this.bzH);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, String str2, InstrumentType instrumentType, long j, int i, double d, long j2, int i2, double d2, double d3) {
        String str3 = str;
        String str4 = str2;
        InstrumentType instrumentType2 = instrumentType;
        kotlin.jvm.internal.i.f(str, "instrumentId");
        kotlin.jvm.internal.i.f(str2, "instrumentIdEscape");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this.instrumentId = str3;
        this.bzA = str4;
        this.instrumentType = instrumentType2;
        this.bzB = j;
        this.bzC = i;
        this.bzD = d;
        this.bzE = j2;
        this.bzF = i2;
        this.bzG = d2;
        this.bzH = d3;
        this.bzy = -1.0d;
        this.bzz = -1.0d;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public /* synthetic */ a(String str, String str2, InstrumentType instrumentType, long j, int i, double d, long j2, int i2, double d2, double d3, int i3, f fVar) {
        int i4 = i3;
        String str3 = "";
        String str4 = (i4 & 1) != 0 ? str3 : str;
        if ((i4 & 2) == 0) {
            str3 = str2;
        }
        InstrumentType instrumentType2 = (i4 & 4) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        long j3 = 0;
        long j4 = (i4 & 8) != 0 ? 0 : j;
        int i5 = 0;
        int i6 = (i4 & 16) != 0 ? 0 : i;
        double d4 = 0.0d;
        double d5 = (i4 & 32) != 0 ? 0.0d : d;
        if ((i4 & 64) == 0) {
            j3 = j2;
        }
        if ((i4 & 128) == 0) {
            i5 = i2;
        }
        double d6 = (i4 & 256) != 0 ? 0.0d : d2;
        if ((i4 & 512) == 0) {
            d4 = d3;
        }
        this(str4, str3, instrumentType2, j4, i6, d5, j3, i5, d6, d4);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final double getBidPrice() {
        return this.bzD;
    }

    public final double getAskPrice() {
        return this.bzG;
    }

    public a() {
        this("", null, null, 0, 0, 0.0d, 0, 0, 0.0d, 0.0d, 1022, null);
    }

    public final void aW(long j) {
        this.bzx = j;
    }

    public final double ahI() {
        if (this.bzy == -1.0d) {
            this.bzy = bzK.n(this.bzG);
        }
        return this.bzy;
    }

    public final double ahJ() {
        if (this.bzz == -1.0d) {
            this.bzz = ahI() * 100.0d;
        }
        return this.bzz;
    }

    public final int ahK() {
        return c.S(ahJ());
    }

    public final double m(double d) {
        double d2 = (double) 1;
        double ahI = ahI();
        Double.isNaN(d2);
        return d * (d2 + ahI);
    }

    public final synchronized boolean isExpired() {
        return System.currentTimeMillis() - this.bzx > TimeUnit.MINUTES.toMillis(10);
    }
}
