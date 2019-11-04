package com.iqoption.forexcalendar;

import com.iqoption.core.microservices.b.a.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarItem;", "Lcom/iqoption/forexcalendar/ForexCalendarAdapterItem;", "calendarEvent", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "(Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;)V", "getCalendarEvent", "()Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "forexcalendar_release"})
/* compiled from: ForexCalendarAdapterItems.kt */
public final class j extends g {
    private final a cSH;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.cSH, ((com.iqoption.forexcalendar.j) r2).cSH) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.forexcalendar.j;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.forexcalendar.j) r2;
        r0 = r1.cSH;
        r2 = r2.cSH;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.forexcalendar.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.cSH;
        return aVar != null ? aVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ForexCalendarItem(calendarEvent=");
        stringBuilder.append(this.cSH);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final a awB() {
        return this.cSH;
    }

    public j(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "calendarEvent");
        super(String.valueOf(aVar.getId()), null);
        this.cSH = aVar;
    }
}
