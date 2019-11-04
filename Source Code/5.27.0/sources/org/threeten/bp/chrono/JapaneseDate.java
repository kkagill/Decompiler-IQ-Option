package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.h;

public final class JapaneseDate extends ChronoDateImpl<JapaneseDate> implements Serializable {
    static final LocalDate fHq = LocalDate.G(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private transient int fHe;
    private transient JapaneseEra fHr;
    private final LocalDate isoDate;

    JapaneseDate(LocalDate localDate) {
        if (localDate.c(fHq)) {
            throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        this.fHr = JapaneseEra.e(localDate);
        this.fHe = localDate.getYear() - (this.fHr.bTn().getYear() - 1);
        this.isoDate = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.fHr = JapaneseEra.e(this.isoDate);
        this.fHe = this.isoDate.getYear() - (this.fHr.bTn().getYear() - 1);
    }

    /* renamed from: bTj */
    public JapaneseChronology bSR() {
        return JapaneseChronology.fHm;
    }

    /* renamed from: bTk */
    public JapaneseEra bSO() {
        return this.fHr;
    }

    public int lengthOfYear() {
        Calendar instance = Calendar.getInstance(JapaneseChronology.fHl);
        instance.set(0, this.fHr.getValue() + 2);
        instance.set(this.fHe, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return instance.getActualMaximum(6);
    }

    public boolean isSupported(e eVar) {
        return (eVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || eVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || eVar == ChronoField.ALIGNED_WEEK_OF_MONTH || eVar == ChronoField.ALIGNED_WEEK_OF_YEAR) ? false : super.isSupported(eVar);
    }

    public ValueRange range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (isSupported(eVar)) {
            ChronoField chronoField = (ChronoField) eVar;
            int i = AnonymousClass1.fFY[chronoField.ordinal()];
            if (i == 1) {
                return nF(6);
            }
            if (i != 2) {
                return bSR().a(chronoField);
            }
            return nF(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    private ValueRange nF(int i) {
        Calendar instance = Calendar.getInstance(JapaneseChronology.fHl);
        instance.set(0, this.fHr.getValue() + 2);
        instance.set(this.fHe, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return ValueRange.I((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        switch ((ChronoField) eVar) {
            case DAY_OF_YEAR:
                return bTl();
            case YEAR_OF_ERA:
                return (long) this.fHe;
            case ALIGNED_DAY_OF_WEEK_IN_MONTH:
            case ALIGNED_DAY_OF_WEEK_IN_YEAR:
            case ALIGNED_WEEK_OF_MONTH:
            case ALIGNED_WEEK_OF_YEAR:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported field: ");
                stringBuilder.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
            case ERA:
                return (long) this.fHr.getValue();
            default:
                return this.isoDate.getLong(eVar);
        }
    }

    private long bTl() {
        int dayOfYear;
        if (this.fHe == 1) {
            dayOfYear = (this.isoDate.getDayOfYear() - this.fHr.bTn().getDayOfYear()) + 1;
        } else {
            dayOfYear = this.isoDate.getDayOfYear();
        }
        return (long) dayOfYear;
    }

    /* renamed from: p */
    public JapaneseDate d(c cVar) {
        return (JapaneseDate) super.b(cVar);
    }

    /* renamed from: p */
    public JapaneseDate d(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (JapaneseDate) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        if (getLong(chronoField) == j) {
            return this;
        }
        int i = AnonymousClass1.fFY[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 7) {
            i = bSR().a(chronoField).b(j, chronoField);
            int i2 = AnonymousClass1.fFY[chronoField.ordinal()];
            if (i2 == 1) {
                return d(this.isoDate.dB(((long) i) - bTl()));
            }
            if (i2 == 2) {
                return nG(i);
            }
            if (i2 == 7) {
                return a(JapaneseEra.nH(i), this.fHe);
            }
        }
        return d(this.isoDate.d(eVar, j));
    }

    /* renamed from: E */
    public JapaneseDate h(long j, h hVar) {
        return (JapaneseDate) super.h(j, hVar);
    }

    /* renamed from: F */
    public JapaneseDate g(long j, h hVar) {
        return (JapaneseDate) super.c(j, hVar);
    }

    private JapaneseDate a(JapaneseEra japaneseEra, int i) {
        return d(this.isoDate.nf(JapaneseChronology.fHm.a(japaneseEra, i)));
    }

    private JapaneseDate nG(int i) {
        return a(bSO(), i);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: eg */
    public JapaneseDate dS(long j) {
        return d(this.isoDate.dy(j));
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: eh */
    public JapaneseDate dT(long j) {
        return d(this.isoDate.dz(j));
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: ei */
    public JapaneseDate dU(long j) {
        return d(this.isoDate.dB(j));
    }

    private JapaneseDate d(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new JapaneseDate(localDate);
    }

    public final b<JapaneseDate> b(LocalTime localTime) {
        return super.b(localTime);
    }

    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JapaneseDate)) {
            return false;
        }
        return this.isoDate.equals(((JapaneseDate) obj).isoDate);
    }

    public int hashCode() {
        return bSR().getId().hashCode() ^ this.isoDate.hashCode();
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    static a p(DataInput dataInput) {
        return JapaneseChronology.fHm.R(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }
}
