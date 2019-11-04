package com.iqoption.tradinghistory.filter.a;

import com.iqoption.core.microservices.tradingengine.response.active.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "selected", "", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Z)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "id", "", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "getViewType", "", "hashCode", "isAll", "toString", "tradinghistory_release"})
/* compiled from: ActiveAdapterItems.kt */
public final class a implements h {
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final boolean cFW;

    public static /* synthetic */ a a(a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar2 = aVar.anF;
        }
        if ((i & 2) != 0) {
            z = aVar.cFW;
        }
        return aVar.b(aVar2, z);
    }

    public int asd() {
        return 1;
    }

    public final a b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z) {
        return new a(aVar, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.anF, aVar.anF)) {
                    if ((this.cFW == aVar.cFW ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        int i = this.cFW;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActiveAdapterItem(active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.cFW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z) {
        this.anF = aVar;
        this.cFW = z;
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
        return this.anF;
    }

    public final boolean asM() {
        return this.cFW;
    }

    public String getId() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        Object obj = null;
        f ahU = aVar != null ? aVar.ahU() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("active:");
        stringBuilder.append(ahU != null ? ahU.getInstrumentType() : null);
        stringBuilder.append(':');
        if (ahU != null) {
            obj = Integer.valueOf(ahU.getActiveId());
        }
        stringBuilder.append(obj);
        return stringBuilder.toString();
    }

    public final boolean aVN() {
        return this.anF == null;
    }
}
