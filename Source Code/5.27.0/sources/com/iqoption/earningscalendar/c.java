package com.iqoption.earningscalendar;

import com.iqoption.core.microservices.a.a.b;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, bng = {"Lcom/iqoption/earningscalendar/EarningsAdapterData;", "", "items", "", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapterItem;", "centralEvent", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "hasContentItems", "", "(Ljava/util/List;Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;Z)V", "getCentralEvent", "()Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "getHasContentItems", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "earningscalendar_release"})
/* compiled from: EarningsCalendarViewModel.kt */
public final class c {
    private final b cMW;
    private final boolean cMX;
    private final List<e> iA;

    public final b auU() {
        return this.cMW;
    }

    public final List<e> component1() {
        return this.iA;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.i.y(this.iA, cVar.iA) && kotlin.jvm.internal.i.y(this.cMW, cVar.cMW)) {
                    if ((this.cMX == cVar.cMX ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.iA;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        b bVar = this.cMW;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.cMX;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EarningsAdapterData(items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", centralEvent=");
        stringBuilder.append(this.cMW);
        stringBuilder.append(", hasContentItems=");
        stringBuilder.append(this.cMX);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(List<? extends e> list, b bVar, boolean z) {
        kotlin.jvm.internal.i.f(list, "items");
        this.iA = list;
        this.cMW = bVar;
        this.cMX = z;
    }

    public final boolean auT() {
        return this.cMX;
    }
}
