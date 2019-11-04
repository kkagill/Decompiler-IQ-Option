package org.threeten.bp;

import com.jumio.analytics.MobileEvents;
import java.util.Locale;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

public enum Month implements b, c {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final Month[] ENUMS = null;
    public static final g<Month> FROM = null;

    static {
        FROM = new g<Month>() {
            /* renamed from: k */
            public Month b(b bVar) {
                return Month.from(bVar);
            }
        };
        ENUMS = values();
    }

    public static Month of(int i) {
        if (i >= 1 && i <= 12) {
            return ENUMS[i - 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid value for MonthOfYear: ");
        stringBuilder.append(i);
        throw new DateTimeException(stringBuilder.toString());
    }

    public static Month from(b bVar) {
        if (bVar instanceof Month) {
            return (Month) bVar;
        }
        try {
            if (!IsoChronology.fHk.equals(e.B(bVar))) {
                bVar = LocalDate.e(bVar);
            }
            return of(bVar.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain Month from TemporalAccessor: ");
            stringBuilder.append(bVar);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar.getClass().getName());
            throw new DateTimeException(stringBuilder.toString(), e);
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().a(ChronoField.MONTH_OF_YEAR, textStyle).b(locale).N(this);
    }

    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (eVar != ChronoField.MONTH_OF_YEAR) {
                z = false;
            }
            return z;
        }
        if (eVar == null || !eVar.isSupportedBy(this)) {
            z = false;
        }
        return z;
    }

    public ValueRange range(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.MONTH_OF_YEAR) {
            return eVar.range();
        }
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public int get(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public Month plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public Month minus(long j) {
        return plus(-(j % 12));
    }

    public int length(boolean z) {
        int i = AnonymousClass2.fGj[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        } else {
            return z ? 29 : 28;
        }
    }

    public int minLength() {
        int i = AnonymousClass2.fGj[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        } else {
            return 28;
        }
    }

    public int maxLength() {
        int i = AnonymousClass2.fGj[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        } else {
            return 29;
        }
    }

    public int firstDayOfYear(boolean z) {
        switch (this) {
            case FEBRUARY:
                return 32;
            case APRIL:
                return z + 91;
            case JUNE:
                return z + 152;
            case SEPTEMBER:
                return z + 244;
            case NOVEMBER:
                return z + MobileEvents.EVENTTYPE_EXCEPTION;
            case JANUARY:
                return 1;
            case MARCH:
                return z + 60;
            case MAY:
                return z + 121;
            case JULY:
                return z + 182;
            case AUGUST:
                return z + 213;
            case OCTOBER:
                return z + 274;
            default:
                return z + 335;
        }
    }

    public Month firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTQ()) {
            return IsoChronology.fHk;
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.MONTHS;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT()) ? null : gVar.b(this);
    }

    public a adjustInto(a aVar) {
        if (e.B(aVar).equals(IsoChronology.fHk)) {
            return aVar.b(ChronoField.MONTH_OF_YEAR, (long) getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }
}
