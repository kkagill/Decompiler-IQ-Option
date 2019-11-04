package com.iqoption.tradinghistory.materialcalendar.a;

import com.iqoption.tradinghistory.materialcalendar.f;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: CalendarWeekDayFormatter */
public class b implements h {
    private final Calendar calendar;

    public b(Calendar calendar) {
        calendar.get(7);
        this.calendar = calendar;
    }

    public b() {
        this(f.getInstance());
    }

    public CharSequence hs(int i) {
        this.calendar.set(7, i);
        return this.calendar.getDisplayName(7, 1, Locale.getDefault());
    }
}
