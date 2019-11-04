package com.iqoption.core.microservices.b;

import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.microservices.b.a.c;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/economiccalendar/EconomicCalendarRequests;", "", "()V", "CMD_GET_ECONOMIC_CALENDAR_EVENTS", "", "CMD_GET_ECONOMIC_CALENDAR_EVENTS_INFO", "EVENT_ECONOMIC_CALENDAR_EVENT_UPDATED", "MICROSERVICE_NAME", "geCalendarEventUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "activeIds", "", "", "getCalendarEvents", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventResult;", "offset", "limit", "getCalendarEventsInfo", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventInfoResult;", "ids", "", "core_release"})
/* compiled from: EconomicCalendarRequests.kt */
public final class a {
    public static final a bsO = new a();

    private a() {
    }

    public final p<c> aA(List<Long> list) {
        String str = "ids";
        kotlin.jvm.internal.i.f(list, str);
        return d.EV().a("get-economic-calendar-events-info", c.class).fq("economic-calendar").k("locale", d.getLocale()).k(str, list).UB();
    }

    public final p<com.iqoption.core.microservices.b.a.d> c(List<Integer> list, int i, int i2) {
        String str = "offset";
        j k = d.EV().a("get-economic-calendar-events", com.iqoption.core.microservices.b.a.d.class).fp("3.0").fq("economic-calendar").k("locale", d.getLocale()).k(str, Integer.valueOf(i)).k(Order.LIMIT, Integer.valueOf(i2));
        if (list != null) {
            k.k("assets", list);
        }
        return k.UB();
    }

    public final e<com.iqoption.core.microservices.b.a.a> aB(List<Integer> list) {
        com.iqoption.core.connect.c i = d.EW().b("economic-calendar-event-updated", com.iqoption.core.microservices.b.a.a.class).ec("1.0").ed("economic-calendar").i("locale", d.getLocale());
        if (list != null) {
            i.i("assets", list);
        }
        return i.HQ();
    }
}
