package com.iqoption.core.microservices.pricing.a;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/pricing/request/QuoteParams;", "", "instrumentId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "groupId", "", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;J)V", "getGroupId", "()J", "getInstrumentId", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: QuoteParams.kt */
public final class a {
    private final long bsw;
    private final String instrumentId;
    private final InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentId, aVar.instrumentId) && kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType)) {
                    if ((this.bsw == aVar.bsw ? 1 : null) != null) {
                        return true;
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
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType != null) {
            i = instrumentType.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.bsw;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("QuoteParams(instrumentId=");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", groupId=");
        stringBuilder.append(this.bsw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(str, "instrumentId");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this.instrumentId = str;
        this.instrumentType = instrumentType;
        this.bsw = j;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final long adj() {
        return this.bsw;
    }
}
