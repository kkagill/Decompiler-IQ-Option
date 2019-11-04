package com.iqoption.core.microservices.quoteshistory.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.ext.c;
import com.iqoption.dto.entity.position.Position;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u00103\u001a\u00020\u001bH\u0016J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001bJ\u0016\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001bJ(\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u000201H\u0002J\u0016\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bJ\u0016\u0010<\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020=2\u0006\u00108\u001a\u00020\u001bJ\u0016\u0010>\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bJ\u0016\u0010?\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020=2\u0006\u00108\u001a\u00020\u001bJ\u0016\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001bJ\u000e\u0010C\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001bJ\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EJ\t\u0010G\u001a\u00020HHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013¨\u0006J"}, bng = {"Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "", "()V", "from", "", "to", "at", "id", "", "open", "", "close", "min", "max", "volume", "([J[J[J[I[D[D[D[D[D)V", "getAt", "()[J", "getClose", "()[D", "getFrom", "getId", "()[I", "getMax", "getMin", "getOpen", "size", "", "getSize", "()I", "time", "Lkotlin/ranges/LongRange;", "getTime", "()Lkotlin/ranges/LongRange;", "time$delegate", "Lkotlin/Lazy;", "getTo", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "take", "n", "startIndex", "endIndex", "count", "countFromStart", "takeAfterId", "candleId", "takeAfterTime", "", "takeBeforeId", "takeBeforeTime", "takeInIdRange", "fromId", "toId", "takeLast", "toList", "", "Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle;", "toString", "", "Companion", "core_release"})
/* compiled from: CandlesCompact.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "time", "getTime()Lkotlin/ranges/LongRange;"))};
    private static final a bxH = new a();
    public static final a bxI = new a();
    @SerializedName("at")
    private final long[] bxA;
    @SerializedName("id")
    private final int[] bxB;
    @SerializedName("open")
    private final double[] bxC;
    @SerializedName("close")
    private final double[] bxD;
    @SerializedName("min")
    private final double[] bxE;
    @SerializedName("max")
    private final double[] bxF;
    @SerializedName("volume")
    private final double[] bxG;
    private final d bxx;
    @SerializedName("from")
    private final long[] bxy;
    @SerializedName("to")
    private final long[] bxz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "getEMPTY", "()Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "fromList", "candles", "", "Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandle;", "core_release"})
    /* compiled from: CandlesCompact.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CandlesCompact(from=");
        stringBuilder.append(Arrays.toString(this.bxy));
        stringBuilder.append(", to=");
        stringBuilder.append(Arrays.toString(this.bxz));
        stringBuilder.append(", at=");
        stringBuilder.append(Arrays.toString(this.bxA));
        stringBuilder.append(", id=");
        stringBuilder.append(Arrays.toString(this.bxB));
        stringBuilder.append(", open=");
        stringBuilder.append(Arrays.toString(this.bxC));
        stringBuilder.append(", close=");
        stringBuilder.append(Arrays.toString(this.bxD));
        stringBuilder.append(", min=");
        stringBuilder.append(Arrays.toString(this.bxE));
        stringBuilder.append(", max=");
        stringBuilder.append(Arrays.toString(this.bxF));
        stringBuilder.append(", volume=");
        stringBuilder.append(Arrays.toString(this.bxG));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(long[] jArr, long[] jArr2, long[] jArr3, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5) {
        kotlin.jvm.internal.i.f(jArr, "from");
        kotlin.jvm.internal.i.f(jArr2, "to");
        kotlin.jvm.internal.i.f(jArr3, "at");
        kotlin.jvm.internal.i.f(iArr, "id");
        kotlin.jvm.internal.i.f(dArr, Position.STATUS_OPEN);
        kotlin.jvm.internal.i.f(dArr2, "close");
        kotlin.jvm.internal.i.f(dArr3, "min");
        kotlin.jvm.internal.i.f(dArr4, "max");
        kotlin.jvm.internal.i.f(dArr5, "volume");
        this.bxy = jArr;
        this.bxz = jArr2;
        this.bxA = jArr3;
        this.bxB = iArr;
        this.bxC = dArr;
        this.bxD = dArr2;
        this.bxE = dArr3;
        this.bxF = dArr4;
        this.bxG = dArr5;
        this.bxx = g.c(new CandlesCompact$time$2(this));
    }

    public /* synthetic */ a(long[] jArr, long[] jArr2, long[] jArr3, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int i, f fVar) {
        int i2 = i;
        long[] jArr4 = (i2 & 1) != 0 ? c.bgT : jArr;
        this(jArr4, (i2 & 2) != 0 ? c.bgT : jArr2, (i2 & 4) != 0 ? c.bgT : jArr3, (i2 & 8) != 0 ? c.bgU : iArr, (i2 & 16) != 0 ? c.bgS : dArr, (i2 & 32) != 0 ? c.bgS : dArr2, (i2 & 64) != 0 ? c.bgS : dArr3, (i2 & 128) != 0 ? c.bgS : dArr4, (i2 & 256) != 0 ? c.bgS : dArr5);
    }

    public final long[] agK() {
        return this.bxy;
    }

    public final long[] agL() {
        return this.bxz;
    }

    public final long[] agM() {
        return this.bxA;
    }

    public final int[] agN() {
        return this.bxB;
    }

    public final double[] agO() {
        return this.bxC;
    }

    public final double[] agP() {
        return this.bxD;
    }

    public final double[] agQ() {
        return this.bxE;
    }

    public final double[] agR() {
        return this.bxF;
    }

    public final double[] agS() {
        return this.bxG;
    }

    public a() {
        this(c.bgT, null, null, null, null, null, null, null, null, 510, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (Arrays.equals(this.bxy, aVar.bxy) && Arrays.equals(this.bxz, aVar.bxz) && Arrays.equals(this.bxA, aVar.bxA) && Arrays.equals(this.bxB, aVar.bxB) && Arrays.equals(this.bxC, aVar.bxC) && Arrays.equals(this.bxD, aVar.bxD) && Arrays.equals(this.bxE, aVar.bxE) && Arrays.equals(this.bxF, aVar.bxF) && Arrays.equals(this.bxG, aVar.bxG)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.quoteshistory.response.CandlesCompact");
    }

    public int hashCode() {
        return (((((((((((((((Arrays.hashCode(this.bxy) * 31) + Arrays.hashCode(this.bxz)) * 31) + Arrays.hashCode(this.bxA)) * 31) + Arrays.hashCode(this.bxB)) * 31) + Arrays.hashCode(this.bxC)) * 31) + Arrays.hashCode(this.bxD)) * 31) + Arrays.hashCode(this.bxE)) * 31) + Arrays.hashCode(this.bxF)) * 31) + Arrays.hashCode(this.bxG);
    }
}
