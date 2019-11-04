package com.iqoption.core.microservices.tradingengine.response.instrument;

import androidx.core.util.Pools.SynchronizedPool;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.ab;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/GroupStrikeKey;", "Lcom/iqoption/core/util/Recyclable;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "underlying", "", "expiration", "", "period", "isSpot", "", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;JJZ)V", "<set-?>", "getExpiration", "()J", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "()Z", "getPeriod", "getUnderlying", "()Ljava/lang/String;", "equals", "other", "", "hashCode", "", "recycle", "", "toString", "Companion", "core_release"})
/* compiled from: GroupStrikeKey.kt */
public final class d implements ab {
    private static final SynchronizedPool<d> bAM = new SynchronizedPool(10);
    public static final a bAQ = new a();
    private boolean bAP;
    private long expiration;
    private InstrumentType instrumentType;
    private long period;
    private String underlying;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/GroupStrikeKey$Companion;", "", "()V", "POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/GroupStrikeKey;", "obtain", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "underlying", "", "expiration", "", "period", "isSpot", "", "core_release"})
    /* compiled from: GroupStrikeKey.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d(InstrumentType instrumentType, String str, long j, long j2, boolean z) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "underlying");
        this.instrumentType = instrumentType;
        this.underlying = str;
        this.expiration = j;
        this.period = j2;
        this.bAP = z;
    }

    public void recycle() {
        bAM.release(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            d dVar = (d) obj;
            if (this.instrumentType == dVar.instrumentType && (kotlin.jvm.internal.i.y(this.underlying, dVar.underlying) ^ 1) == 0 && this.expiration == dVar.expiration && this.period == dVar.period && this.bAP == dVar.bAP) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.instrument.GroupStrikeKey");
    }

    public int hashCode() {
        return (((((((this.instrumentType.hashCode() * 31) + this.underlying.hashCode()) * 31) + Long.valueOf(this.expiration).hashCode()) * 31) + Long.valueOf(this.period).hashCode()) * 31) + Boolean.valueOf(this.bAP).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GroupStrikeKey(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", underlying='");
        stringBuilder.append(this.underlying);
        stringBuilder.append("', expiration=");
        stringBuilder.append(this.expiration);
        stringBuilder.append(", period=");
        stringBuilder.append(this.period);
        stringBuilder.append(", isSpot=");
        stringBuilder.append(this.bAP);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
