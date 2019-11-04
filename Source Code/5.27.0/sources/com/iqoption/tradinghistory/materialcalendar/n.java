package com.iqoption.tradinghistory.materialcalendar;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Collection;

@SuppressLint({"ViewConstructor"})
/* compiled from: MonthView */
class n extends e {
    /* Access modifiers changed, original: protected */
    public int getRows() {
        return 7;
    }

    public n(@NonNull MaterialCalendarView materialCalendarView, b bVar, int i) {
        super(materialCalendarView, bVar, i);
    }

    /* Access modifiers changed, original: protected */
    public void b(Collection<h> collection, Calendar calendar) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                a(collection, calendar);
            }
        }
    }

    public b aWF() {
        return getFirstViewDay();
    }

    /* Access modifiers changed, original: protected */
    public boolean d(b bVar) {
        return bVar.getMonth() == getFirstViewDay().getMonth();
    }
}
