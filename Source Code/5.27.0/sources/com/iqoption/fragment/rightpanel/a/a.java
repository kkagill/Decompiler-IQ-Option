package com.iqoption.fragment.rightpanel.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiActiveItem;", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapterItem;", "activeName", "", "activeIcon", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Z)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getActiveIcon", "()Ljava/lang/String;", "getActiveName", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: MultiSelectorAdapterItems.kt */
public final class a extends e {
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final String dpM;
    private final String dpN;
    private final boolean isSelected;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.dpM, aVar.dpM) && kotlin.jvm.internal.i.y(this.dpN, aVar.dpN) && kotlin.jvm.internal.i.y(this.anF, aVar.anF)) {
                    if ((this.isSelected == aVar.isSelected ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.dpM;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dpN;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isSelected;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiActiveItem(activeName=");
        stringBuilder.append(this.dpM);
        stringBuilder.append(", activeIcon=");
        stringBuilder.append(this.dpN);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String ahP() {
        return this.dpM;
    }

    public final String aHO() {
        return this.dpN;
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
        return this.anF;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public a(String str, String str2, com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z) {
        kotlin.jvm.internal.i.f(str2, "activeIcon");
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        super(aVar.getActiveId(), null);
        this.dpM = str;
        this.dpN = str2;
        this.anF = aVar;
        this.isSelected = z;
    }
}
