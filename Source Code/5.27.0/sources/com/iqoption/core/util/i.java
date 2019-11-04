package com.iqoption.core.util;

import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: DateUtils */
public class i {
    public static boolean aP(long j) {
        return DateUtils.isToday(j);
    }

    public static boolean bl(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        instance.set(7, instance.getFirstDayOfWeek());
        long timeInMillis = instance.getTimeInMillis();
        instance.add(3, 1);
        long timeInMillis2 = instance.getTimeInMillis();
        if (j < timeInMillis || j >= timeInMillis2) {
            return false;
        }
        return true;
    }

    public static boolean aB(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(6, 1);
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        long timeInMillis = instance.getTimeInMillis();
        instance.add(1, 1);
        long timeInMillis2 = instance.getTimeInMillis();
        if (j < timeInMillis || j >= timeInMillis2) {
            return false;
        }
        return true;
    }

    public static boolean aA(long j) {
        boolean z = false;
        if (aP(j)) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        instance.add(6, -1);
        if (j >= instance.getTimeInMillis()) {
            z = true;
        }
        return z;
    }

    public static int anj() {
        return (int) (((long) TimeZone.getDefault().getOffset(new Date().getTime())) / 3600000);
    }

    public static String ay(long j) {
        if (aP(j)) {
            return TimeUtil.bRq.format(Long.valueOf(j));
        }
        if (bl(j)) {
            return TimeUtil.bRt.format(Long.valueOf(j));
        }
        if (aB(j)) {
            return TimeUtil.bRA.format(Long.valueOf(j));
        }
        return TimeUtil.bRH.format(Long.valueOf(j));
    }
}
