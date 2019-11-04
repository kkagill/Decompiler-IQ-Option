package com.iqoption.core.util;

import android.text.format.DateUtils;
import com.iqoption.core.d;
import com.iqoption.core.i.k;
import com.iqoption.dto.ChartTimeInterval;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001]B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020<H\u0007J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000bJ\u000e\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u000209J\u0018\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u0002092\b\b\u0002\u0010B\u001a\u00020CJ)\u0010@\u001a\u00060Dj\u0002`E2\u0006\u0010;\u001a\u0002092\u0006\u0010B\u001a\u00020C2\n\u0010F\u001a\u00060Dj\u0002`EH\u0010J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u000209H\u0007J\u0018\u0010G\u001a\u00020\u00042\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0007J\u0016\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u0002092\u0006\u0010K\u001a\u000209J\u000e\u0010L\u001a\u00020\u00042\u0006\u00100\u001a\u000209J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010;\u001a\u000209H\u0007J\u000e\u0010N\u001a\u00020\u00042\u0006\u00100\u001a\u000209J\u0016\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u000209J\u0006\u0010R\u001a\u00020\u0004J\u0006\u0010S\u001a\u00020\u000bJ\u0018\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020\u000bH\u0007J\u0010\u0010W\u001a\u00020\u00042\u0006\u00100\u001a\u000209H\u0007J\u000e\u0010X\u001a\u00020\u00042\u0006\u0010;\u001a\u000209J\u0006\u0010Y\u001a\u00020\u000bJ\u000e\u0010Z\u001a\u00020<2\u0006\u0010A\u001a\u000209J\u000e\u0010[\u001a\u00020<2\u0006\u0010A\u001a\u000209J\u000e\u0010\\\u001a\u00020<2\u0006\u0010A\u001a\u000209R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u000b8\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u000b8\u0006XD¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00180\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0010\u0010#\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u000e\u0010,\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u00020'8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u00020'8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u00020'8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u00020'8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u00020'8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u00020'8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, bng = {"Lcom/iqoption/core/util/TimeUtil;", "", "()V", "FORMAT_DAYS_CANDLY", "", "FORMAT_HOURS_CANDLY", "FORMAT_MINUTES_CANDLY", "FORMAT_MONTH_CANDLY", "FORMAT_SEKEND_CANDLY", "FORMAT_WEEK_CANDLY", "SECOND_IN_DAYS", "", "SECOND_IN_HOURS", "SECOND_IN_MINUTES", "SECOND_IN_MONTH", "SECOND_IN_WEEK", "TIME_UNIT_MILLIS", "TIME_UNIT_SECOND", "UTC", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "getUTC", "()Ljava/util/TimeZone;", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "clockFormat", "Ljava/text/DateFormat;", "date", "dateLinkQuoteFormat", "getDateLinkQuoteFormat", "()Ljava/text/DateFormat;", "dateMonthFormat", "getDateMonthFormat", "dateTime", "dateTimeTwoLine", "day", "hoursDuration", "Ljava/text/SimpleDateFormat;", "getHoursDuration", "()Ljava/text/SimpleDateFormat;", "minutesDuration", "getMinutesDuration", "monthDateFormat", "reverseDateTime", "shortDateTime", "shortDateTimeMs", "time", "timeDate", "timeMs", "timeSeconds", "weekDay", "yearDateTime", "yearDateTimeMs", "formatAssetTime", "timeSync", "", "schedule", "seconds", "", "formatCandleSize", "formatDate", "utc", "formatDuration", "millis", "precision", "Lcom/iqoption/core/util/TimeUtil$Duration;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "formatElapsedTime", "elapsed", "formatLeftTime", "fromMillis", "nowMillis", "formatMonthDate", "formatPluralsDuration", "formatTime", "formatTimeInterval", "time1", "time2", "formatUtcOffset", "getDayOfWeek", "getFormatTime", "_time", "timeUnit", "getFormattedDate", "getMinSecondsFromSeconds", "getUtcOffset", "isToday", "isTomorrow", "isYesterday", "Duration", "core_release"})
/* compiled from: TimeUtil.kt */
public final class TimeUtil {
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    public static final DateFormat bRA;
    public static final DateFormat bRB;
    public static final DateFormat bRC = new SimpleDateFormat("dd.MM.yyyy\nHH:mm", Locale.getDefault());
    private static final DateFormat bRD = new SimpleDateFormat("d MMMM, yyyy", Locale.getDefault());
    private static final DateFormat bRE = new SimpleDateFormat("yyyy-MM-dd-HH-mm", Locale.US);
    private static final SimpleDateFormat bRF = new SimpleDateFormat("d MMMM", Locale.US);
    public static final DateFormat bRG = new SimpleDateFormat("HH:mm:ss.SSS, dd MMM yyyy", Locale.getDefault());
    public static final DateFormat bRH = new SimpleDateFormat("HH:mm, dd MMM yyyy", Locale.getDefault());
    public static final DateFormat bRI = new SimpleDateFormat("HH:mm, dd MMM", Locale.getDefault());
    public static final DateFormat bRJ = new SimpleDateFormat("d MMM H:mm:ss", Locale.getDefault());
    public static final int bRK = 1;
    public static final int bRL = 2;
    public static final TimeUtil bRM = new TimeUtil();
    public static final SimpleDateFormat bRq = new SimpleDateFormat("HH:mm", Locale.getDefault());
    public static final SimpleDateFormat bRr = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
    public static final SimpleDateFormat bRs;
    public static SimpleDateFormat bRt = new SimpleDateFormat("HH:mm, EEE", Locale.getDefault());
    private static final SimpleDateFormat bRu;
    private static final SimpleDateFormat bRv;
    public static final SimpleDateFormat bRw = new SimpleDateFormat("dd/MM, HH:mm", Locale.getDefault());
    public static final SimpleDateFormat bRx = new SimpleDateFormat("dd/MM, HH:mm:ss.SSS", Locale.getDefault());
    public static final DateFormat bRy = new SimpleDateFormat("dd MMM", Locale.getDefault());
    public static final DateFormat bRz = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    private static final Calendar calendar = Calendar.getInstance();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/util/TimeUtil$Duration;", "", "seconds", "", "symbol", "", "(Ljava/lang/String;IIC)V", "getSeconds", "()I", "getSymbol", "()C", "toSeconds", "", "units", "SECOND", "MINUTE", "HOUR", "DAY", "WEEK", "MONTH", "core_release"})
    /* compiled from: TimeUtil.kt */
    public enum Duration {
        SECOND(1, 's'),
        MINUTE(60, 'm'),
        HOUR(ChartTimeInterval.CANDLE_1H, 'h'),
        DAY(ChartTimeInterval.CANDLE_1D, 'd'),
        WEEK(ChartTimeInterval.CANDLE_1W, 'w'),
        MONTH(ChartTimeInterval.CANDLE_1M, 'M');
        
        private final int seconds;
        private final char symbol;

        private Duration(int i, char c) {
            this.seconds = i;
            this.symbol = c;
        }

        public final int getSeconds() {
            return this.seconds;
        }

        public final char getSymbol() {
            return this.symbol;
        }

        public final long toSeconds(long j) {
            return j * ((long) this.seconds);
        }
    }

    public static final String r(long j, long j2) {
        return a(j, j2, false, 4, null);
    }

    static {
        String str = "HH:mm:ss";
        bRs = new SimpleDateFormat(str, Locale.getDefault());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(UTC);
        bRu = simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(UTC);
        bRv = simpleDateFormat;
        str = "dd.MM.yyyy HH:mm";
        bRA = new SimpleDateFormat(str, Locale.getDefault());
        bRB = new SimpleDateFormat(str, Locale.getDefault());
    }

    private TimeUtil() {
    }

    public final TimeZone anJ() {
        return UTC;
    }

    public final SimpleDateFormat anK() {
        return bRv;
    }

    public final DateFormat anL() {
        return bRD;
    }

    public final DateFormat anM() {
        return bRE;
    }

    public static /* synthetic */ String a(long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return a(j, j2, z);
    }

    public static final String a(long j, long j2, boolean z) {
        Calendar instance = Calendar.getInstance();
        kotlin.jvm.internal.i.e(instance, "calendar");
        instance.setTimeInMillis(j2);
        int i = instance.get(5);
        instance.setTimeInMillis(j);
        Object format;
        String str;
        if (i == instance.get(5)) {
            instance.setTimeInMillis(j2);
            if (z) {
                format = bRs.format(instance.getTime());
                str = "timeSeconds.format(calendar.time)";
            } else {
                format = bRq.format(instance.getTime());
                str = "time.format(calendar.time)";
            }
            kotlin.jvm.internal.i.e(format, str);
            return format;
        }
        int i2 = (int) ((j2 - j) / ((long) 1000));
        int i3 = i2 / ChartTimeInterval.CANDLE_1M;
        i2 = (i2 % ChartTimeInterval.CANDLE_1M) % ChartTimeInterval.CANDLE_1W;
        int i4 = i2 / ChartTimeInterval.CANDLE_1D;
        i2 %= ChartTimeInterval.CANDLE_1D;
        int i5 = i2 / ChartTimeInterval.CANDLE_1H;
        i2 %= ChartTimeInterval.CANDLE_1H;
        int i6 = i2 / 60;
        i2 %= 60;
        String str2 = "%dD";
        String str3 = " ";
        String str4 = "null cannot be cast to non-null type java.lang.String";
        String str5 = "(this as java.lang.String).toLowerCase()";
        String str6 = "java.lang.String.format(locale, format, *args)";
        String str7 = "Locale.US";
        StringBuilder stringBuilder;
        n nVar;
        Locale locale;
        Object[] objArr;
        Object[] objArr2;
        if (i3 > 0) {
            stringBuilder = new StringBuilder();
            nVar = n.eWf;
            locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, str7);
            objArr = new Object[]{Integer.valueOf(i3)};
            str = String.format(locale, "%dM", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(str, str6);
            if (str != null) {
                str = str.toLowerCase();
                kotlin.jvm.internal.i.e(str, str5);
                stringBuilder.append(str);
                stringBuilder.append(str3);
                nVar = n.eWf;
                locale = Locale.US;
                kotlin.jvm.internal.i.e(locale, str7);
                objArr2 = new Object[]{Integer.valueOf(i4)};
                str = String.format(locale, str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(str, str6);
                if (str != null) {
                    str = str.toLowerCase();
                    kotlin.jvm.internal.i.e(str, str5);
                    stringBuilder.append(str);
                    return stringBuilder.toString();
                }
                throw new TypeCastException(str4);
            }
            throw new TypeCastException(str4);
        }
        String str8 = "%dH";
        n nVar2;
        Locale locale2;
        if (i4 > 0) {
            stringBuilder = new StringBuilder();
            n nVar3 = n.eWf;
            Locale locale3 = Locale.US;
            kotlin.jvm.internal.i.e(locale3, str7);
            Object[] objArr3 = new Object[]{Integer.valueOf(i4)};
            String format2 = String.format(locale3, str2, Arrays.copyOf(objArr3, objArr3.length));
            kotlin.jvm.internal.i.e(format2, str6);
            if (format2 != null) {
                format2 = format2.toLowerCase();
                kotlin.jvm.internal.i.e(format2, str5);
                stringBuilder.append(format2);
                stringBuilder.append(str3);
                nVar2 = n.eWf;
                locale2 = Locale.US;
                kotlin.jvm.internal.i.e(locale2, str7);
                objArr = new Object[]{Integer.valueOf(i5)};
                str = String.format(locale2, str8, Arrays.copyOf(objArr, objArr.length));
                kotlin.jvm.internal.i.e(str, str6);
                if (str != null) {
                    str = str.toLowerCase();
                    kotlin.jvm.internal.i.e(str, str5);
                    stringBuilder.append(str);
                    return stringBuilder.toString();
                }
                throw new TypeCastException(str4);
            }
            throw new TypeCastException(str4);
        } else if (i5 <= 0) {
            return "";
        } else {
            String stringBuilder2;
            if (z) {
                Object stringBuilder3;
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(String.valueOf(i5));
                str = ":";
                stringBuilder4.append(str);
                if (i6 < 10) {
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append('0');
                    stringBuilder5.append(i6);
                    stringBuilder3 = stringBuilder5.toString();
                } else {
                    stringBuilder3 = Integer.valueOf(i6);
                }
                stringBuilder4.append(stringBuilder3);
                stringBuilder4.append(str);
                if (i2 < 10) {
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append('0');
                    stringBuilder6.append(i2);
                    format = stringBuilder6.toString();
                } else {
                    format = Integer.valueOf(i2);
                }
                stringBuilder4.append(format);
                stringBuilder2 = stringBuilder4.toString();
            } else {
                stringBuilder = new StringBuilder();
                nVar2 = n.eWf;
                locale2 = Locale.US;
                kotlin.jvm.internal.i.e(locale2, str7);
                objArr = new Object[]{Integer.valueOf(i5)};
                str = String.format(locale2, str8, Arrays.copyOf(objArr, objArr.length));
                kotlin.jvm.internal.i.e(str, str6);
                if (str != null) {
                    str = str.toLowerCase();
                    kotlin.jvm.internal.i.e(str, str5);
                    stringBuilder.append(str);
                    stringBuilder.append(str3);
                    nVar = n.eWf;
                    locale = Locale.US;
                    kotlin.jvm.internal.i.e(locale, str7);
                    objArr2 = new Object[]{Integer.valueOf(i6)};
                    str = String.format(locale, "%dm", Arrays.copyOf(objArr2, objArr2.length));
                    kotlin.jvm.internal.i.e(str, str6);
                    if (str != null) {
                        str = str.toLowerCase();
                        kotlin.jvm.internal.i.e(str, str5);
                        stringBuilder.append(str);
                        stringBuilder2 = stringBuilder.toString();
                    } else {
                        throw new TypeCastException(str4);
                    }
                }
                throw new TypeCastException(str4);
            }
            return stringBuilder2;
        }
    }

    public final String fv(int i) {
        StringBuilder stringBuilder;
        if (i >= ChartTimeInterval.CANDLE_1M) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i / ChartTimeInterval.CANDLE_1M);
            stringBuilder.append('M');
            return stringBuilder.toString();
        } else if (i >= ChartTimeInterval.CANDLE_1W) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i / ChartTimeInterval.CANDLE_1W);
            stringBuilder.append('W');
            return stringBuilder.toString();
        } else if (i >= ChartTimeInterval.CANDLE_1D) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i / ChartTimeInterval.CANDLE_1D);
            stringBuilder.append('D');
            return stringBuilder.toString();
        } else if (i >= ChartTimeInterval.CANDLE_1H) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i / ChartTimeInterval.CANDLE_1H);
            stringBuilder.append('H');
            return stringBuilder.toString();
        } else if (i >= 60) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i / 60);
            stringBuilder.append('m');
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(i);
            stringBuilder2.append('s');
            return stringBuilder2.toString();
        }
    }

    public final String a(long j, Duration duration) {
        kotlin.jvm.internal.i.f(duration, "precision");
        String stringBuilder = a(j / ((long) 1000), duration, new StringBuilder()).toString();
        kotlin.jvm.internal.i.e(stringBuilder, "formatDuration(millis / …ringBuilder()).toString()");
        return stringBuilder;
    }

    private final StringBuilder a(long j, Duration duration, StringBuilder stringBuilder) {
        while (true) {
            Duration duration2;
            long j2 = (long) ChartTimeInterval.CANDLE_1M;
            if (j >= j2) {
                duration2 = Duration.MONTH;
                j2 = j / j2;
            } else {
                j2 = (long) ChartTimeInterval.CANDLE_1W;
                if (j >= j2) {
                    duration2 = Duration.WEEK;
                    j2 = j / j2;
                } else {
                    j2 = (long) ChartTimeInterval.CANDLE_1D;
                    if (j >= j2) {
                        duration2 = Duration.DAY;
                        j2 = j / j2;
                    } else {
                        j2 = (long) ChartTimeInterval.CANDLE_1H;
                        if (j >= j2) {
                            duration2 = Duration.HOUR;
                            j2 = j / j2;
                        } else {
                            j2 = (long) 60;
                            if (j >= j2) {
                                duration2 = Duration.MINUTE;
                                j2 = j / j2;
                            } else {
                                duration2 = Duration.SECOND;
                                j2 = j;
                            }
                        }
                    }
                }
            }
            if (duration2.getSeconds() <= duration.getSeconds()) {
                stringBuilder.append(j2);
                stringBuilder.append(duration2.getSymbol());
                kotlin.jvm.internal.i.e(stringBuilder, "out.append(currentUnits)…(currentPrecision.symbol)");
                return stringBuilder;
            }
            j -= duration2.toSeconds(j2);
            stringBuilder.append(j2);
            stringBuilder.append(duration2.getSymbol());
            if (j <= 0) {
                return stringBuilder;
            }
            stringBuilder.append(' ');
            kotlin.jvm.internal.i.e(stringBuilder, "out.append(' ')");
        }
    }

    public static final String formatElapsedTime(long j) {
        long j2 = j % 2592000;
        long j3 = j2 / 604800;
        j2 %= 604800;
        long j4 = j2 / 86400;
        j2 %= 86400;
        long j5 = j2 / 3600;
        j2 = (j2 % 3600) / 60;
        String str = "java.lang.String.format(format, *args)";
        n nVar;
        Object[] objArr;
        String format;
        if (j / 2592000 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(r2)};
            format = String.format("%dM", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j3 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j3)};
            format = String.format("%dW", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j4 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j4)};
            format = String.format("%dD", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j5 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j5)};
            format = String.format("%dH", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j2 > 0) {
            n nVar2 = n.eWf;
            Object[] objArr2 = new Object[]{Long.valueOf(j2)};
            format = String.format("%dm", Arrays.copyOf(objArr2, objArr2.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j)};
            format = String.format("%ds", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        }
    }

    public static final String bo(long j) {
        long j2 = (long) ChartTimeInterval.CANDLE_1M;
        int i = (int) (j / j2);
        j %= j2;
        j2 = (long) ChartTimeInterval.CANDLE_1W;
        int i2 = (int) (j / j2);
        j %= j2;
        j2 = (long) ChartTimeInterval.CANDLE_1D;
        int i3 = (int) (j / j2);
        j %= j2;
        j2 = (long) ChartTimeInterval.CANDLE_1H;
        int i4 = (int) (j / j2);
        j %= j2;
        j2 = (long) 60;
        int i5 = (int) (j / j2);
        j %= j2;
        String quantityString;
        if (i > 0) {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.months, i, new Object[]{Integer.valueOf(i)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…apsedMonth, elapsedMonth)");
            return quantityString;
        } else if (i2 > 0) {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.weeks, i2, new Object[]{Integer.valueOf(i2)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…elapsedWeek, elapsedWeek)");
            return quantityString;
        } else if (i3 > 0) {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.days, i3, new Object[]{Integer.valueOf(i3)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…elapsedDays, elapsedDays)");
            return quantityString;
        } else if (i4 > 0) {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.hours, i4, new Object[]{Integer.valueOf(i4)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…apsedHours, elapsedHours)");
            return quantityString;
        } else if (i5 > 0) {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.minutes, i5, new Object[]{Integer.valueOf(i5)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…dMinutes, elapsedMinutes)");
            return quantityString;
        } else {
            quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.seconds, (int) j, new Object[]{Long.valueOf(j)});
            kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get….toInt(), elapsedSeconds)");
            return quantityString;
        }
    }

    public static final String s(long j, long j2) {
        int i = (int) ((j2 - j) / ((long) 1000));
        int i2 = i / ChartTimeInterval.CANDLE_1M;
        i = (i % ChartTimeInterval.CANDLE_1M) % ChartTimeInterval.CANDLE_1W;
        int i3 = i / ChartTimeInterval.CANDLE_1D;
        i %= ChartTimeInterval.CANDLE_1D;
        int i4 = i / ChartTimeInterval.CANDLE_1H;
        i %= ChartTimeInterval.CANDLE_1H;
        int i5 = i / 60;
        i %= 60;
        String str = " ";
        String str2 = "%dD";
        String str3 = "null cannot be cast to non-null type java.lang.String";
        String str4 = "(this as java.lang.String).toLowerCase()";
        String str5 = "java.lang.String.format(locale, format, *args)";
        String str6 = "Locale.US";
        StringBuilder stringBuilder;
        Object[] objArr;
        String format;
        if (i2 > 0) {
            stringBuilder = new StringBuilder();
            n nVar = n.eWf;
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, str6);
            objArr = new Object[]{Integer.valueOf(i2)};
            format = String.format(locale, "%dM", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str5);
            if (format != null) {
                format = format.toLowerCase();
                kotlin.jvm.internal.i.e(format, str4);
                stringBuilder.append(format);
                stringBuilder.append(str);
                nVar = n.eWf;
                locale = Locale.US;
                kotlin.jvm.internal.i.e(locale, str6);
                Object[] objArr2 = new Object[]{Integer.valueOf(i3)};
                format = String.format(locale, str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(format, str5);
                if (format != null) {
                    format = format.toLowerCase();
                    kotlin.jvm.internal.i.e(format, str4);
                    stringBuilder.append(format);
                    return stringBuilder.toString();
                }
                throw new TypeCastException(str3);
            }
            throw new TypeCastException(str3);
        } else if (i3 > 0) {
            stringBuilder = new StringBuilder();
            n nVar2 = n.eWf;
            Locale locale2 = Locale.US;
            kotlin.jvm.internal.i.e(locale2, str6);
            objArr = new Object[]{Integer.valueOf(i3)};
            String format2 = String.format(locale2, str2, Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format2, str5);
            if (format2 != null) {
                format2 = format2.toLowerCase();
                kotlin.jvm.internal.i.e(format2, str4);
                stringBuilder.append(format2);
                stringBuilder.append(str);
                nVar2 = n.eWf;
                locale2 = Locale.US;
                kotlin.jvm.internal.i.e(locale2, str6);
                Object[] objArr3 = new Object[]{Integer.valueOf(i4)};
                format = String.format(locale2, "%dH", Arrays.copyOf(objArr3, objArr3.length));
                kotlin.jvm.internal.i.e(format, str5);
                if (format != null) {
                    format = format.toLowerCase();
                    kotlin.jvm.internal.i.e(format, str4);
                    stringBuilder.append(format);
                    return stringBuilder.toString();
                }
                throw new TypeCastException(str3);
            }
            throw new TypeCastException(str3);
        } else {
            Object obj;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(String.valueOf(i4));
            format = ":";
            stringBuilder2.append(format);
            Object obj2 = "00";
            if (i5 < 0) {
                obj = obj2;
            } else if (i5 < 10) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append('0');
                stringBuilder3.append(i5);
                obj = stringBuilder3.toString();
            } else {
                obj = Integer.valueOf(i5);
            }
            stringBuilder2.append(obj);
            stringBuilder2.append(format);
            if (i >= 0) {
                if (i < 10) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append('0');
                    stringBuilder4.append(i);
                    obj2 = stringBuilder4.toString();
                } else {
                    obj2 = Integer.valueOf(i);
                }
            }
            stringBuilder2.append(obj2);
            return stringBuilder2.toString();
        }
    }

    public final boolean isToday(long j) {
        return DateUtils.isToday(j);
    }

    public final boolean aA(long j) {
        return DateUtils.isToday(j + 86400000);
    }

    public final String aQ(long j) {
        String format = bRq.format(Long.valueOf(j));
        kotlin.jvm.internal.i.e(format, "this.time.format(time)");
        return format;
    }

    public final String ay(long j) {
        String format = bRz.format(Long.valueOf(j));
        kotlin.jvm.internal.i.e(format, "date.format(utc)");
        return format;
    }

    public final int anN() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis());
    }

    public final synchronized int anO() {
        Calendar calendar = calendar;
        kotlin.jvm.internal.i.e(calendar, "calendar");
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(7);
    }

    public final String bp(long j) {
        long j2 = (long) 60;
        long j3 = j / j2;
        j %= j2;
        String quantityString = d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.seconds, (int) j, new Object[]{Integer.valueOf((int) j)});
        if (j3 == 0) {
            kotlin.jvm.internal.i.e(quantityString, "secondsString");
            return quantityString;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.Uo().getResources().getQuantityString(com.iqoption.core.i.i.minutes, (int) j3, new Object[]{Integer.valueOf((int) j3)}));
        stringBuilder.append(" ");
        stringBuilder.append(quantityString);
        return stringBuilder.toString();
    }

    public static final String c(long j, int i) {
        String format;
        if (i == bRK) {
            format = bRq.format(Long.valueOf(((long) 1000) * j));
            kotlin.jvm.internal.i.e(format, "time.format(1000 * _time)");
            return format;
        }
        String str = "time.format(_time)";
        if (i == bRL) {
            format = bRq.format(Long.valueOf(j));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        }
        format = bRq.format(Long.valueOf(j));
        kotlin.jvm.internal.i.e(format, str);
        return format;
    }

    public static final String bq(long j) {
        if (bRM.isToday(j)) {
            return d.getString(k.today);
        }
        if (bRM.aA(j)) {
            return d.getString(k.yesterday);
        }
        String format = bRz.format(Long.valueOf(j));
        kotlin.jvm.internal.i.e(format, "date.format(time)");
        return format;
    }
}
