package org.threeten.bp.chrono;

import com.iqoption.dto.entity.ActiveQuote;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class JapaneseChronology extends e implements Serializable {
    static final Locale fHl;
    public static final JapaneseChronology fHm = new JapaneseChronology();
    private static final Map<String, String[]> fHn = new HashMap();
    private static final Map<String, String[]> fHo = new HashMap();
    private static final Map<String, String[]> fHp = new HashMap();
    private static final long serialVersionUID = 459996390165777884L;

    public String getCalendarType() {
        return "japanese";
    }

    public String getId() {
        return "Japanese";
    }

    static {
        String str = "JP";
        String str2 = "ja";
        fHl = new Locale(str2, str, str);
        String str3 = "en";
        fHn.put(str3, new String[]{"Unknown", "K", "M", ActiveQuote.PHASE_TRADING, "S", "H"});
        fHn.put(str2, new String[]{"Unknown", "K", "M", ActiveQuote.PHASE_TRADING, "S", "H"});
        fHo.put(str3, new String[]{"Unknown", "K", "M", ActiveQuote.PHASE_TRADING, "S", "H"});
        fHo.put(str2, new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        fHp.put(str3, new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        fHp.put(str2, new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private JapaneseChronology() {
    }

    private Object readResolve() {
        return fHm;
    }

    public JapaneseDate R(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.G(i, i2, i3));
    }

    /* renamed from: K */
    public JapaneseDate C(b bVar) {
        if (bVar instanceof JapaneseDate) {
            return (JapaneseDate) bVar;
        }
        return new JapaneseDate(LocalDate.e(bVar));
    }

    public b<JapaneseDate> D(b bVar) {
        return super.D(bVar);
    }

    public d<JapaneseDate> E(b bVar) {
        return super.E(bVar);
    }

    public d<JapaneseDate> d(Instant instant, ZoneId zoneId) {
        return super.d(instant, zoneId);
    }

    public boolean isLeapYear(long j) {
        return IsoChronology.fHk.isLeapYear(j);
    }

    public int a(f fVar, int i) {
        if (fVar instanceof JapaneseEra) {
            JapaneseEra japaneseEra = (JapaneseEra) fVar;
            int year = (japaneseEra.bTn().getYear() + i) - 1;
            ValueRange.I(1, (long) ((japaneseEra.bTo().getYear() - japaneseEra.bTn().getYear()) + 1)).a((long) i, ChronoField.YEAR_OF_ERA);
            return year;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    /* renamed from: nE */
    public JapaneseEra ns(int i) {
        return JapaneseEra.nH(i);
    }

    public ValueRange a(ChronoField chronoField) {
        switch (chronoField) {
            case DAY_OF_MONTH:
            case DAY_OF_WEEK:
            case MICRO_OF_DAY:
            case MICRO_OF_SECOND:
            case HOUR_OF_DAY:
            case HOUR_OF_AMPM:
            case MINUTE_OF_DAY:
            case MINUTE_OF_HOUR:
            case SECOND_OF_DAY:
            case SECOND_OF_MINUTE:
            case MILLI_OF_DAY:
            case MILLI_OF_SECOND:
            case NANO_OF_DAY:
            case NANO_OF_SECOND:
            case CLOCK_HOUR_OF_DAY:
            case CLOCK_HOUR_OF_AMPM:
            case EPOCH_DAY:
            case PROLEPTIC_MONTH:
                return chronoField.range();
            default:
                Calendar instance = Calendar.getInstance(fHl);
                int i = 0;
                JapaneseEra[] bTm;
                int year;
                switch (chronoField) {
                    case ERA:
                        bTm = JapaneseEra.bTm();
                        return ValueRange.I((long) bTm[0].getValue(), (long) bTm[bTm.length - 1].getValue());
                    case YEAR:
                        bTm = JapaneseEra.bTm();
                        return ValueRange.I((long) JapaneseDate.fHq.getYear(), (long) bTm[bTm.length - 1].bTo().getYear());
                    case YEAR_OF_ERA:
                        bTm = JapaneseEra.bTm();
                        year = (bTm[bTm.length - 1].bTo().getYear() - bTm[bTm.length - 1].bTn().getYear()) + 1;
                        int i2 = Integer.MAX_VALUE;
                        while (i < bTm.length) {
                            i2 = Math.min(i2, (bTm[i].bTo().getYear() - bTm[i].bTn().getYear()) + 1);
                            i++;
                        }
                        return ValueRange.b(1, 6, (long) i2, (long) year);
                    case MONTH_OF_YEAR:
                        return ValueRange.b((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case DAY_OF_YEAR:
                        bTm = JapaneseEra.bTm();
                        year = 366;
                        while (i < bTm.length) {
                            year = Math.min(year, (bTm[i].bTn().lengthOfYear() - bTm[i].bTn().getDayOfYear()) + 1);
                            i++;
                        }
                        return ValueRange.c(1, (long) year, 366);
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unimplementable field: ");
                        stringBuilder.append(chronoField);
                        throw new UnsupportedOperationException(stringBuilder.toString());
                }
        }
    }
}
