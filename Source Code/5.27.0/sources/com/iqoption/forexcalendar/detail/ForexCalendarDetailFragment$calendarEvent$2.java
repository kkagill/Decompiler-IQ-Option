package com.iqoption.forexcalendar.detail;

import android.os.Parcelable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "invoke"})
/* compiled from: ForexCalendarDetailFragment.kt */
final class ForexCalendarDetailFragment$calendarEvent$2 extends Lambda implements a<com.iqoption.core.microservices.b.a.a> {
    final /* synthetic */ a this$0;

    ForexCalendarDetailFragment$calendarEvent$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: awL */
    public final com.iqoption.core.microservices.b.a.a invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("CALENDAR_EVENT_ARG");
        if (parcelable != null) {
            return (com.iqoption.core.microservices.b.a.a) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.economiccalendar.response.CalendarEvent");
    }
}
