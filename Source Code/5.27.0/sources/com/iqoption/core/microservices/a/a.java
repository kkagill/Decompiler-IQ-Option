package com.iqoption.core.microservices.a;

import com.iqoption.core.d;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/earningscalendar/EarningsCalendarRequests;", "", "()V", "CMD_GET_EARNINGS_CALENDAR_EVENTS", "", "MICROSERVICE_NAME", "getEarningsCalendarEvents", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/earningscalendar/response/CalendarEarningEventResult;", "offset", "", "limit", "activeId", "(IILjava/lang/Integer;)Lio/reactivex/Single;", "core_release"})
/* compiled from: EarningsCalendarRequests.kt */
public final class a {
    public static final a bsD = new a();

    private a() {
    }

    public final p<com.iqoption.core.microservices.a.a.a> a(int i, int i2, Integer num) {
        String str = "offset";
        return d.EV().a("get-earnings-calendar-events", com.iqoption.core.microservices.a.a.a.class).fp("1.0").fq("earnings-calendar").k(str, Integer.valueOf(i)).k(Order.LIMIT, Integer.valueOf(i2)).k("active_id", num).UB();
    }
}
