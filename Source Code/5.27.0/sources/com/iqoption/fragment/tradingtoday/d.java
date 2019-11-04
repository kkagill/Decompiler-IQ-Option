package com.iqoption.fragment.tradingtoday;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.signals.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, bng = {"Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "type", "Lcom/iqoption/fragment/tradingtoday/PopularType;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "value", "", "signal", "Lcom/iqoption/signals/SignalItem;", "(Lcom/iqoption/fragment/tradingtoday/PopularType;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/lang/Double;Lcom/iqoption/signals/SignalItem;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "id", "getId", "()Ljava/lang/Integer;", "getSignal", "()Lcom/iqoption/signals/SignalItem;", "getType", "()Lcom/iqoption/fragment/tradingtoday/PopularType;", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Lcom/iqoption/fragment/tradingtoday/PopularType;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/lang/Double;Lcom/iqoption/signals/SignalItem;)Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "equals", "", "other", "", "hashCode", "toString", "", "app_optionXRelease"})
/* compiled from: PopularAssetItem.kt */
public final class d implements com.iqoption.core.ui.widget.recyclerview.adapter.a.d<Integer> {
    private final a anF;
    private final PopularType dqF;
    private final f dqG;
    private final Double value;

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dqG, r3.dqG) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.fragment.tradingtoday.d;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.fragment.tradingtoday.d) r3;
        r0 = r2.dqF;
        r1 = r3.dqF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.anF;
        r1 = r3.anF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.value;
        r1 = r3.value;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.dqG;
        r3 = r3.dqG;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.tradingtoday.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PopularType popularType = this.dqF;
        int i = 0;
        int hashCode = (popularType != null ? popularType.hashCode() : 0) * 31;
        a aVar = this.anF;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Double d = this.value;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        f fVar = this.dqG;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PopularAssetItem(type=");
        stringBuilder.append(this.dqF);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(", signal=");
        stringBuilder.append(this.dqG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(PopularType popularType, a aVar, Double d, f fVar) {
        kotlin.jvm.internal.i.f(popularType, "type");
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        this.dqF = popularType;
        this.anF = aVar;
        this.value = d;
        this.dqG = fVar;
    }

    public /* synthetic */ d(PopularType popularType, a aVar, Double d, f fVar, int i, f fVar2) {
        if ((i & 4) != 0) {
            d = (Double) null;
        }
        if ((i & 8) != 0) {
            fVar = (f) null;
        }
        this(popularType, aVar, d, fVar);
    }

    public final a Jt() {
        return this.anF;
    }

    public final PopularType aIf() {
        return this.dqF;
    }

    public final f aIg() {
        return this.dqG;
    }

    public final Double ahD() {
        return this.value;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.dqF.ordinal());
    }
}
