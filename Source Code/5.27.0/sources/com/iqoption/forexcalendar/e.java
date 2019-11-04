package com.iqoption.forexcalendar;

import com.iqoption.core.microservices.b.a.a;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, bng = {"Lcom/iqoption/forexcalendar/ForexAdapterData;", "", "items", "", "Lcom/iqoption/forexcalendar/ForexCalendarAdapterItem;", "centralEvent", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "hasContentItems", "", "(Ljava/util/List;Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;Z)V", "getCentralEvent", "()Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "getHasContentItems", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "forexcalendar_release"})
/* compiled from: ForexCalendarViewModel.kt */
public final class e {
    private final boolean cMX;
    private final a cSx;
    private final List<g> iA;

    public final a awA() {
        return this.cSx;
    }

    public final List<g> component1() {
        return this.iA;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.iA, eVar.iA) && kotlin.jvm.internal.i.y(this.cSx, eVar.cSx)) {
                    if ((this.cMX == eVar.cMX ? 1 : null) != null) {
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
        a aVar = this.cSx;
        if (aVar != null) {
            i = aVar.hashCode();
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
        stringBuilder.append("ForexAdapterData(items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", centralEvent=");
        stringBuilder.append(this.cSx);
        stringBuilder.append(", hasContentItems=");
        stringBuilder.append(this.cMX);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(List<? extends g> list, a aVar, boolean z) {
        kotlin.jvm.internal.i.f(list, "items");
        this.iA = list;
        this.cSx = aVar;
        this.cMX = z;
    }

    public final boolean auT() {
        return this.cMX;
    }
}
