package com.iqoption.chat.e;

import java.util.Calendar;
import java.util.TimeZone;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/chat/util/DateComparator;", "", "()V", "c", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "c1", "c2", "utc", "Ljava/util/TimeZone;", "checkFieldsEquality", "", "field", "", "initCalendarForDayStart", "", "millis", "", "isTheSameDay", "d1", "d2", "isThisWeek", "d", "isThisYear", "isToday", "isYesterday", "chat_release"})
/* compiled from: DateComparator.kt */
public final class b {
    private final TimeZone aWs = TimeZone.getTimeZone("UTC");
    private final Calendar aWt = Calendar.getInstance(this.aWs);
    private final Calendar aWu = Calendar.getInstance(this.aWs);
    private final Calendar aWv = Calendar.getInstance(this.aWs);

    public final boolean n(long j, long j2) {
        Calendar calendar = this.aWt;
        String str = "c1";
        kotlin.jvm.internal.i.e(calendar, str);
        a(calendar, j);
        Calendar calendar2 = this.aWu;
        String str2 = "c2";
        kotlin.jvm.internal.i.e(calendar2, str2);
        a(calendar2, j2);
        calendar2 = this.aWt;
        kotlin.jvm.internal.i.e(calendar2, str);
        Calendar calendar3 = this.aWu;
        kotlin.jvm.internal.i.e(calendar3, str2);
        if (a(calendar2, calendar3, 1)) {
            calendar2 = this.aWt;
            kotlin.jvm.internal.i.e(calendar2, str);
            calendar3 = this.aWu;
            kotlin.jvm.internal.i.e(calendar3, str2);
            if (a(calendar2, calendar3, 6)) {
                return true;
            }
        }
        return false;
    }

    private final void a(Calendar calendar, long j) {
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
    }

    private final boolean a(Calendar calendar, Calendar calendar2, int i) {
        return calendar.get(i) == calendar2.get(i);
    }

    public final boolean isToday(long j) {
        Calendar calendar = this.aWv;
        String str = "c";
        kotlin.jvm.internal.i.e(calendar, str);
        a(calendar, System.currentTimeMillis());
        calendar = this.aWv;
        kotlin.jvm.internal.i.e(calendar, str);
        return j >= calendar.getTimeInMillis();
    }

    public final boolean aA(long j) {
        boolean z = false;
        if (isToday(j)) {
            return false;
        }
        Calendar calendar = this.aWv;
        String str = "c";
        kotlin.jvm.internal.i.e(calendar, str);
        a(calendar, System.currentTimeMillis());
        this.aWv.add(6, -1);
        calendar = this.aWv;
        kotlin.jvm.internal.i.e(calendar, str);
        if (j >= calendar.getTimeInMillis()) {
            z = true;
        }
        return z;
    }

    public final boolean aB(long j) {
        Calendar calendar = this.aWv;
        String str = "c";
        kotlin.jvm.internal.i.e(calendar, str);
        a(calendar, System.currentTimeMillis());
        this.aWv.set(6, 1);
        calendar = this.aWv;
        kotlin.jvm.internal.i.e(calendar, str);
        long timeInMillis = calendar.getTimeInMillis();
        this.aWv.add(1, 1);
        calendar = this.aWv;
        kotlin.jvm.internal.i.e(calendar, str);
        long timeInMillis2 = calendar.getTimeInMillis() - 1;
        if (timeInMillis <= j && timeInMillis2 >= j) {
            return true;
        }
        return false;
    }
}
