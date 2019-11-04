package com.iqoption.signals;

import androidx.annotation.IntRange;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\nHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006,"}, bng = {"Lcom/iqoption/signals/SignalItem;", "Lcom/iqoption/signals/AdapterItem;", "isBull", "", "time", "", "activeName", "type", "value", "level", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "signal", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/iqoption/core/microservices/tradingengine/response/active/Active;Lcom/iqoption/core/microservices/pricemovements/response/Signal;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getActiveName", "()Ljava/lang/String;", "id", "getId", "()Z", "getLevel", "()I", "getSignal", "()Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "getTime", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "signals_release"})
/* compiled from: _AdapterItems.kt */
public final class f extends a {
    private final a anF;
    private final boolean dTe;
    private final com.iqoption.core.microservices.pricemovements.a.a dTf;
    private final String dgM;
    private final String dpM;
    private final String id;
    private final int level;
    private final String type;
    private final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if ((this.dTe == fVar.dTe ? 1 : null) != null && kotlin.jvm.internal.i.y(this.dgM, fVar.dgM) && kotlin.jvm.internal.i.y(this.dpM, fVar.dpM) && kotlin.jvm.internal.i.y(this.type, fVar.type) && kotlin.jvm.internal.i.y(this.value, fVar.value)) {
                    if (!((this.level == fVar.level ? 1 : null) != null && kotlin.jvm.internal.i.y(this.anF, fVar.anF) && kotlin.jvm.internal.i.y(this.dTf, fVar.dTf))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.dTe;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        String str = this.dgM;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dpM;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.type;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.value;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.level) * 31;
        a aVar = this.anF;
        i = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.pricemovements.a.a aVar2 = this.dTf;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SignalItem(isBull=");
        stringBuilder.append(this.dTe);
        stringBuilder.append(", time=");
        stringBuilder.append(this.dgM);
        stringBuilder.append(", activeName=");
        stringBuilder.append(this.dpM);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(", level=");
        stringBuilder.append(this.level);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", signal=");
        stringBuilder.append(this.dTf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean aUc() {
        return this.dTe;
    }

    public final String getTime() {
        return this.dgM;
    }

    public final String ahP() {
        return this.dpM;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getLevel() {
        return this.level;
    }

    public final a Jt() {
        return this.anF;
    }

    public final com.iqoption.core.microservices.pricemovements.a.a aUd() {
        return this.dTf;
    }

    public f(boolean z, String str, String str2, String str3, String str4, @IntRange(from = 1, to = 2) int i, a aVar, com.iqoption.core.microservices.pricemovements.a.a aVar2) {
        kotlin.jvm.internal.i.f(str, "time");
        kotlin.jvm.internal.i.f(str2, "activeName");
        kotlin.jvm.internal.i.f(str3, "type");
        kotlin.jvm.internal.i.f(str4, ConditionalUserProperty.VALUE);
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        kotlin.jvm.internal.i.f(aVar2, "signal");
        super();
        this.dTe = z;
        this.dgM = str;
        this.dpM = str2;
        this.type = str3;
        this.value = str4;
        this.level = i;
        this.anF = aVar;
        this.dTf = aVar2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("signal:");
        stringBuilder.append(this.dTf.getId());
        this.id = stringBuilder.toString();
    }

    public String getId() {
        return this.id;
    }
}
