package com.iqoption.core.microservices.quoteshistory.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 12\u00020\u0001:\u00011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B_\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\u000e\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0000J\t\u0010/\u001a\u000200HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u0011\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00062"}, bng = {"Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle;", "", "()V", "candle", "Lcom/iqoption/core/microservices/quotes/response/Candle;", "(Lcom/iqoption/core/microservices/quotes/response/Candle;)V", "from", "", "to", "at", "id", "", "open", "", "close", "min", "max", "volume", "(JJJIDDDDD)V", "getAt", "()J", "getClose", "()D", "getFrom", "getId", "()I", "getMax", "getMin", "getOpen", "getTo", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "isNext", "next", "toString", "", "Companion", "core_release"})
/* compiled from: HistoryCandle.kt */
public final class b {
    private static final b bxP = new b();
    public static final a bxQ = new a();
    @SerializedName("min")
    private final double aID;
    @SerializedName("max")
    private final double aIE;
    @SerializedName("from")
    private final long bxJ;
    @SerializedName("to")
    private final long bxK;
    @SerializedName("at")
    private final long bxL;
    @SerializedName("open")
    private final double bxM;
    @SerializedName("close")
    private final double bxN;
    @SerializedName("volume")
    private final double bxO;
    @SerializedName("id")
    private final int id;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle;", "getEMPTY", "()Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle;", "core_release"})
    /* compiled from: HistoryCandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.bxJ == bVar.bxJ ? 1 : null) != null) {
                    if ((this.bxK == bVar.bxK ? 1 : null) != null) {
                        if ((this.bxL == bVar.bxL ? 1 : null) != null) {
                            if (!((this.id == bVar.id ? 1 : null) != null && Double.compare(this.bxM, bVar.bxM) == 0 && Double.compare(this.bxN, bVar.bxN) == 0 && Double.compare(this.aID, bVar.aID) == 0 && Double.compare(this.aIE, bVar.aIE) == 0 && Double.compare(this.bxO, bVar.bxO) == 0)) {
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
        long j = this.bxJ;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.bxK;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.bxL;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.id) * 31;
        j2 = Double.doubleToLongBits(this.bxM);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bxN);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.aID);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.aIE);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bxO);
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HistoryCandle(from=");
        stringBuilder.append(this.bxJ);
        stringBuilder.append(", to=");
        stringBuilder.append(this.bxK);
        stringBuilder.append(", at=");
        stringBuilder.append(this.bxL);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", open=");
        stringBuilder.append(this.bxM);
        stringBuilder.append(", close=");
        stringBuilder.append(this.bxN);
        stringBuilder.append(", min=");
        stringBuilder.append(this.aID);
        stringBuilder.append(", max=");
        stringBuilder.append(this.aIE);
        stringBuilder.append(", volume=");
        stringBuilder.append(this.bxO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(long j, long j2, long j3, int i, double d, double d2, double d3, double d4, double d5) {
        this.bxJ = j;
        this.bxK = j2;
        this.bxL = j3;
        this.id = i;
        this.bxM = d;
        this.bxN = d2;
        this.aID = d3;
        this.aIE = d4;
        this.bxO = d5;
    }

    public final long agU() {
        return this.bxK;
    }

    public final double agV() {
        return this.bxN;
    }

    public /* synthetic */ b(long j, long j2, long j3, int i, double d, double d2, double d3, double d4, double d5, int i2, f fVar) {
        int i3 = i2;
        long j4 = 0;
        long j5 = (i3 & 1) != 0 ? 0 : j;
        long j6 = (i3 & 2) != 0 ? 0 : j2;
        if ((i3 & 4) == 0) {
            j4 = j3;
        }
        int i4 = (i3 & 8) != 0 ? -1 : i;
        double d6 = 0.0d;
        double d7 = (i3 & 16) != 0 ? 0.0d : d;
        double d8 = (i3 & 32) != 0 ? 0.0d : d2;
        double d9 = (i3 & 64) != 0 ? 0.0d : d3;
        double d10 = (i3 & 128) != 0 ? 0.0d : d4;
        if ((i3 & 256) == 0) {
            d6 = d5;
        }
        this(j5, j6, j4, i4, d7, d8, d9, d10, d6);
    }

    public b() {
        this(0, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 510, null);
    }
}
