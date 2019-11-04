package org.threeten.bp;

import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

public enum DayOfWeek implements b, c {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final DayOfWeek[] ENUMS = null;
    public static final g<DayOfWeek> FROM = null;

    static {
        FROM = new g<DayOfWeek>() {
            /* renamed from: a */
            public DayOfWeek b(b bVar) {
                return DayOfWeek.from(bVar);
            }
        };
        ENUMS = values();
    }

    public static DayOfWeek of(int i) {
        if (i >= 1 && i <= 7) {
            return ENUMS[i - 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid value for DayOfWeek: ");
        stringBuilder.append(i);
        throw new DateTimeException(stringBuilder.toString());
    }

    public static DayOfWeek from(b bVar) {
        if (bVar instanceof DayOfWeek) {
            return (DayOfWeek) bVar;
        }
        Object bVar2;
        try {
            bVar2 = of(bVar2.get(ChronoField.DAY_OF_WEEK));
            return bVar2;
        } catch (DateTimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain DayOfWeek from TemporalAccessor: ");
            stringBuilder.append(bVar2);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar2.getClass().getName());
            throw new DateTimeException(stringBuilder.toString(), e);
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().a(ChronoField.DAY_OF_WEEK, textStyle).b(locale).N(this);
    }

    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (eVar != ChronoField.DAY_OF_WEEK) {
                z = false;
            }
            return z;
        }
        if (eVar == null || !eVar.isSupportedBy(this)) {
            z = false;
        }
        return z;
    }

    public ValueRange range(e eVar) {
        if (eVar == ChronoField.DAY_OF_WEEK) {
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

    public int get(e eVar) {
        if (eVar == ChronoField.DAY_OF_WEEK) {
            return getValue();
        }
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(e eVar) {
        if (eVar == ChronoField.DAY_OF_WEEK) {
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

    public DayOfWeek plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    public DayOfWeek minus(long j) {
        return plus(-(j % 7));
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTR()) {
            return ChronoUnit.DAYS;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTQ() || gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT()) ? null : gVar.b(this);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.DAY_OF_WEEK, (long) getValue());
    }
}
