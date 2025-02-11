package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

public enum MinguoEra implements f {
    BEFORE_ROC,
    ROC;

    public static MinguoEra of(int i) {
        if (i == 0) {
            return BEFORE_ROC;
        }
        if (i == 1) {
            return ROC;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid era: ");
        stringBuilder.append(i);
        throw new DateTimeException(stringBuilder.toString());
    }

    public int getValue() {
        return ordinal();
    }

    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (eVar != ChronoField.ERA) {
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
        if (eVar == ChronoField.ERA) {
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
        if (eVar == ChronoField.ERA) {
            return getValue();
        }
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(e eVar) {
        if (eVar == ChronoField.ERA) {
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

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.ERA, (long) getValue());
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTR()) {
            return ChronoUnit.ERAS;
        }
        return (gVar == f.bTQ() || gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT() || gVar == f.bTU() || gVar == f.bTV()) ? null : gVar.b(this);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().a(ChronoField.ERA, textStyle).b(locale).N(this);
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    static MinguoEra readExternal(DataInput dataInput) {
        return of(dataInput.readByte());
    }
}
