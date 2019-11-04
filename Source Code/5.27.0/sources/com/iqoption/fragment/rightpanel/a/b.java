package com.iqoption.fragment.rightpanel.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JN\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0002\u0010\u0012¨\u0006\""}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiPositionItem;", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapterItem;", "isWin", "", "isCall", "activeName", "", "activeIcon", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "isSelected", "(Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Z)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getActiveIcon", "()Ljava/lang/String;", "getActiveName", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Z)Lcom/iqoption/fragment/rightpanel/multiselector/MultiPositionItem;", "equals", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: MultiSelectorAdapterItems.kt */
public final class b extends e {
    private final a anF;
    private final String dpM;
    private final String dpN;
    private final Boolean dpO;
    private final boolean isCall;
    private final boolean isSelected;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.dpO, bVar.dpO)) {
                    if ((this.isCall == bVar.isCall ? 1 : null) != null && kotlin.jvm.internal.i.y(this.dpM, bVar.dpM) && kotlin.jvm.internal.i.y(this.dpN, bVar.dpN) && kotlin.jvm.internal.i.y(this.anF, bVar.anF)) {
                        if ((this.isSelected == bVar.isSelected ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.dpO;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        int i2 = this.isCall;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.dpM;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dpN;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a aVar = this.anF;
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
        stringBuilder.append("MultiPositionItem(isWin=");
        stringBuilder.append(this.dpO);
        stringBuilder.append(", isCall=");
        stringBuilder.append(this.isCall);
        stringBuilder.append(", activeName=");
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

    public final Boolean aHP() {
        return this.dpO;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final String ahP() {
        return this.dpM;
    }

    public final String aHO() {
        return this.dpN;
    }

    public final a Jt() {
        return this.anF;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public b(Boolean bool, boolean z, String str, String str2, a aVar, boolean z2) {
        kotlin.jvm.internal.i.f(str2, "activeIcon");
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        super(aVar.getActiveId(), null);
        this.dpO = bool;
        this.isCall = z;
        this.dpM = str;
        this.dpN = str2;
        this.anF = aVar;
        this.isSelected = z2;
    }
}
