package com.iqoption.dialogs.a;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, bng = {"Lcom/iqoption/dialogs/custodial/ScheduleItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "id", "period", "", "chargeDate", "feePercent", "feeAmount", "isHighlighted", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getChargeDate", "()Ljava/lang/String;", "getFeeAmount", "getFeePercent", "getId", "()Ljava/lang/Integer;", "()Z", "getPeriod", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "dialogs_release"})
/* compiled from: ScheduleItem.kt */
public final class d implements com.iqoption.core.ui.widget.recyclerview.adapter.a.d<Integer> {
    private final String bsT;
    private final String cLW;
    private final String cLX;
    private final String cLY;
    private final boolean cLZ;
    private final int id;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((getId().intValue() == dVar.getId().intValue() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bsT, dVar.bsT) && kotlin.jvm.internal.i.y(this.cLW, dVar.cLW) && kotlin.jvm.internal.i.y(this.cLX, dVar.cLX) && kotlin.jvm.internal.i.y(this.cLY, dVar.cLY)) {
                    if ((this.cLZ == dVar.cLZ ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int intValue = getId().intValue() * 31;
        String str = this.bsT;
        int i = 0;
        intValue = (intValue + (str != null ? str.hashCode() : 0)) * 31;
        str = this.cLW;
        intValue = (intValue + (str != null ? str.hashCode() : 0)) * 31;
        str = this.cLX;
        intValue = (intValue + (str != null ? str.hashCode() : 0)) * 31;
        str = this.cLY;
        if (str != null) {
            i = str.hashCode();
        }
        intValue = (intValue + i) * 31;
        int i2 = this.cLZ;
        if (i2 != 0) {
            i2 = 1;
        }
        return intValue + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScheduleItem(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", period=");
        stringBuilder.append(this.bsT);
        stringBuilder.append(", chargeDate=");
        stringBuilder.append(this.cLW);
        stringBuilder.append(", feePercent=");
        stringBuilder.append(this.cLX);
        stringBuilder.append(", feeAmount=");
        stringBuilder.append(this.cLY);
        stringBuilder.append(", isHighlighted=");
        stringBuilder.append(this.cLZ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(int i, String str, String str2, String str3, String str4, boolean z) {
        kotlin.jvm.internal.i.f(str, "period");
        kotlin.jvm.internal.i.f(str3, "feePercent");
        kotlin.jvm.internal.i.f(str4, "feeAmount");
        this.id = i;
        this.bsT = str;
        this.cLW = str2;
        this.cLX = str3;
        this.cLY = str4;
        this.cLZ = z;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.id);
    }

    public final String auP() {
        return this.bsT;
    }

    public final String auQ() {
        return this.cLW;
    }

    public final String auR() {
        return this.cLX;
    }

    public final String auS() {
        return this.cLY;
    }

    public final boolean isHighlighted() {
        return this.cLZ;
    }
}
