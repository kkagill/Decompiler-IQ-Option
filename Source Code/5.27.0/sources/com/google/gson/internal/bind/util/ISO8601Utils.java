package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder stringBuilder = new StringBuilder((19 + (z ? 4 : 0)) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(stringBuilder, gregorianCalendar.get(1), 4);
        char c = '-';
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(5), 2);
        stringBuilder.append('T');
        padInt(stringBuilder, gregorianCalendar.get(11), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(12), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(13), 2);
        if (z) {
            stringBuilder.append('.');
            padInt(stringBuilder, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            i = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            stringBuilder.append(c);
            padInt(stringBuilder, abs, 2);
            stringBuilder.append(':');
            padInt(stringBuilder, i, 2);
        } else {
            stringBuilder.append('Z');
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }} */
    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) {
        /*
        r1 = r17;
        r2 = r18;
        r0 = r18.getIndex();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = r0 + 4;
        r0 = parseInt(r1, r0, r3);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = 45;
        r5 = checkOffset(r1, r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r5 == 0) goto L_0x0018;
    L_0x0016:
        r3 = r3 + 1;
    L_0x0018:
        r5 = r3 + 2;
        r3 = parseInt(r1, r3, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r6 = checkOffset(r1, r5, r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r6 == 0) goto L_0x0026;
    L_0x0024:
        r5 = r5 + 1;
    L_0x0026:
        r6 = r5 + 2;
        r5 = parseInt(r1, r5, r6);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r7 = 84;
        r7 = checkOffset(r1, r6, r7);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r8 = 1;
        if (r7 != 0) goto L_0x0049;
    L_0x0035:
        r9 = r17.length();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r9 > r6) goto L_0x0049;
    L_0x003b:
        r4 = new java.util.GregorianCalendar;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = r3 - r8;
        r4.<init>(r0, r3, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r2.setIndex(r6);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = r4.getTime();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        return r0;
    L_0x0049:
        r9 = 43;
        r10 = 90;
        r12 = 2;
        if (r7 == 0) goto L_0x00bf;
    L_0x0050:
        r6 = r6 + 1;
        r7 = r6 + 2;
        r6 = parseInt(r1, r6, r7);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r13 = 58;
        r14 = checkOffset(r1, r7, r13);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r14 == 0) goto L_0x0062;
    L_0x0060:
        r7 = r7 + 1;
    L_0x0062:
        r14 = r7 + 2;
        r7 = parseInt(r1, r7, r14);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r13 = checkOffset(r1, r14, r13);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r13 == 0) goto L_0x0070;
    L_0x006e:
        r14 = r14 + 1;
    L_0x0070:
        r13 = r17.length();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r13 <= r14) goto L_0x00c2;
    L_0x0076:
        r13 = r1.charAt(r14);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r13 == r10) goto L_0x00c2;
    L_0x007c:
        if (r13 == r9) goto L_0x00c2;
    L_0x007e:
        if (r13 == r4) goto L_0x00c2;
    L_0x0080:
        r13 = r14 + 2;
        r14 = parseInt(r1, r14, r13);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r15 = 59;
        if (r14 <= r15) goto L_0x0090;
    L_0x008a:
        r15 = 63;
        if (r14 >= r15) goto L_0x0090;
    L_0x008e:
        r14 = 59;
    L_0x0090:
        r15 = 46;
        r15 = checkOffset(r1, r13, r15);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r15 == 0) goto L_0x00bc;
    L_0x0098:
        r13 = r13 + 1;
        r15 = r13 + 1;
        r15 = indexOfNonDigit(r1, r15);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r11 = r13 + 3;
        r11 = java.lang.Math.min(r15, r11);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r16 = parseInt(r1, r13, r11);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r11 = r11 - r13;
        if (r11 == r8) goto L_0x00b5;
    L_0x00ad:
        if (r11 == r12) goto L_0x00b2;
    L_0x00af:
        r11 = r16;
        goto L_0x00b8;
    L_0x00b2:
        r16 = r16 * 10;
        goto L_0x00af;
    L_0x00b5:
        r16 = r16 * 100;
        goto L_0x00af;
    L_0x00b8:
        r13 = r11;
        r11 = r14;
        r14 = r15;
        goto L_0x00c4;
    L_0x00bc:
        r11 = r14;
        r14 = r13;
        goto L_0x00c3;
    L_0x00bf:
        r14 = r6;
        r6 = 0;
        r7 = 0;
    L_0x00c2:
        r11 = 0;
    L_0x00c3:
        r13 = 0;
    L_0x00c4:
        r15 = r17.length();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r15 <= r14) goto L_0x01af;
    L_0x00ca:
        r15 = r1.charAt(r14);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r12 = 5;
        if (r15 != r10) goto L_0x00d6;
    L_0x00d1:
        r4 = TIMEZONE_UTC;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r14 = r14 + r8;
        goto L_0x017e;
    L_0x00d6:
        if (r15 == r9) goto L_0x00f7;
    L_0x00d8:
        if (r15 != r4) goto L_0x00db;
    L_0x00da:
        goto L_0x00f7;
    L_0x00db:
        r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = "Invalid time zone indicator '";
        r3.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3.append(r15);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = "'";
        r3.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = r3.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0.<init>(r3);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
    L_0x00f7:
        r4 = r1.substring(r14);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9 = r4.length();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r9 < r12) goto L_0x0102;
    L_0x0101:
        goto L_0x0113;
    L_0x0102:
        r9 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = "00";
        r9.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = r9.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
    L_0x0113:
        r9 = r4.length();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r14 = r14 + r9;
        r9 = "+0000";
        r9 = r9.equals(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r9 != 0) goto L_0x017c;
    L_0x0120:
        r9 = "+00:00";
        r9 = r9.equals(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r9 == 0) goto L_0x0129;
    L_0x0128:
        goto L_0x017c;
    L_0x0129:
        r9 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r10 = "GMT";
        r9.append(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = r9.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9 = java.util.TimeZone.getTimeZone(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r10 = r9.getID();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r15 = r10.equals(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r15 != 0) goto L_0x017a;
    L_0x0148:
        r15 = ":";
        r12 = "";
        r10 = r10.replace(r15, r12);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r10 = r10.equals(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        if (r10 == 0) goto L_0x0157;
    L_0x0156:
        goto L_0x017a;
    L_0x0157:
        r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r5 = "Mismatching time zone indicator: ";
        r3.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = " given, resolves to ";
        r3.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = r9.getID();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = r3.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0.<init>(r3);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
    L_0x017a:
        r4 = r9;
        goto L_0x017e;
    L_0x017c:
        r4 = TIMEZONE_UTC;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
    L_0x017e:
        r9 = new java.util.GregorianCalendar;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.<init>(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r4 = 0;
        r9.setLenient(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r9.set(r8, r0);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = r3 - r8;
        r0 = 2;
        r9.set(r0, r3);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = 5;
        r9.set(r0, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = 11;
        r9.set(r0, r6);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = 12;
        r9.set(r0, r7);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = 13;
        r9.set(r0, r11);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = 14;
        r9.set(r0, r13);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r2.setIndex(r14);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r0 = r9.getTime();	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        return r0;
    L_0x01af:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        r3 = "No time zone indicator";
        r0.<init>(r3);	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01bb, NumberFormatException -> 0x01b9, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        goto L_0x01bc;
    L_0x01b9:
        r0 = move-exception;
        goto L_0x01bc;
    L_0x01bb:
        r0 = move-exception;
    L_0x01bc:
        if (r1 != 0) goto L_0x01c0;
    L_0x01be:
        r1 = 0;
        goto L_0x01d4;
    L_0x01c0:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = 34;
        r3.append(r4);
        r3.append(r1);
        r3.append(r4);
        r1 = r3.toString();
    L_0x01d4:
        r3 = r0.getMessage();
        if (r3 == 0) goto L_0x01e0;
    L_0x01da:
        r4 = r3.isEmpty();
        if (r4 == 0) goto L_0x01fe;
    L_0x01e0:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "(";
        r3.append(r4);
        r4 = r0.getClass();
        r4 = r4.getName();
        r3.append(r4);
        r4 = ")";
        r3.append(r4);
        r3 = r3.toString();
    L_0x01fe:
        r4 = new java.text.ParseException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed to parse date [";
        r5.append(r6);
        r5.append(r1);
        r1 = "]: ";
        r5.append(r1);
        r5.append(r3);
        r1 = r5.toString();
        r2 = r18.getIndex();
        r4.<init>(r1, r2);
        r4.initCause(r0);
        goto L_0x0225;
    L_0x0224:
        throw r4;
    L_0x0225:
        goto L_0x0224;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int i3;
        int digit;
        StringBuilder stringBuilder;
        String str2 = "Invalid number: ";
        if (i < i2) {
            i3 = i + 1;
            digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                digit = -digit;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        i3 = i;
        digit = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            i3 = Character.digit(str.charAt(i3), 10);
            if (i3 >= 0) {
                digit = (digit * 10) - i3;
                i3 = i4;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        return -digit;
    }

    private static void padInt(StringBuilder stringBuilder, int i, int i2) {
        String num = Integer.toString(i);
        for (i2 -= num.length(); i2 > 0; i2--) {
            stringBuilder.append('0');
        }
        stringBuilder.append(num);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
