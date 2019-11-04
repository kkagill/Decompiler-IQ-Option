package org.threeten.bp;

import com.iqoption.dto.ChartTimeInterval;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class LocalDateTime extends b<LocalDate> implements Serializable, a, c {
    public static final g<LocalDateTime> FROM = new g<LocalDateTime>() {
        /* renamed from: h */
        public LocalDateTime b(org.threeten.bp.temporal.b bVar) {
            return LocalDateTime.g(bVar);
        }
    };
    public static final LocalDateTime fGc = a(LocalDate.fGa, LocalTime.fGe);
    public static final LocalDateTime fGd = a(LocalDate.fGb, LocalTime.fGf);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate date;
    private final LocalTime time;

    public static LocalDateTime a(LocalDate localDate, LocalTime localTime) {
        d.requireNonNull(localDate, "date");
        d.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime a(long j, int i, ZoneOffset zoneOffset) {
        d.requireNonNull(zoneOffset, "offset");
        j += (long) zoneOffset.getTotalSeconds();
        return new LocalDateTime(LocalDate.dx(d.floorDiv(j, 86400)), LocalTime.h((long) d.k(j, ChartTimeInterval.CANDLE_1D), i));
    }

    public static LocalDateTime g(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof LocalDateTime) {
            return (LocalDateTime) bVar;
        }
        if (bVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) bVar).bTc();
        }
        try {
            return new LocalDateTime(LocalDate.e(bVar), LocalTime.i(bVar));
        } catch (DateTimeException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain LocalDateTime from TemporalAccessor: ");
            stringBuilder.append(bVar);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar.getClass().getName());
            throw new DateTimeException(stringBuilder.toString());
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }

    private LocalDateTime b(LocalDate localDate, LocalTime localTime) {
        if (this.date == localDate && this.time == localTime) {
            return this;
        }
        return new LocalDateTime(localDate, localTime);
    }

    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (!(eVar.isDateBased() || eVar.isTimeBased())) {
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
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        return eVar.isTimeBased() ? this.time.range(eVar) : this.date.range(eVar);
    }

    public int get(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return super.get(eVar);
        }
        return eVar.isTimeBased() ? this.time.get(eVar) : this.date.get(eVar);
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        return eVar.isTimeBased() ? this.time.getLong(eVar) : this.date.getLong(eVar);
    }

    public int getYear() {
        return this.date.getYear();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int getNano() {
        return this.time.getNano();
    }

    /* renamed from: e */
    public LocalDateTime f(c cVar) {
        if (cVar instanceof LocalDate) {
            return b((LocalDate) cVar, this.time);
        }
        if (cVar instanceof LocalTime) {
            return b(this.date, (LocalTime) cVar);
        }
        if (cVar instanceof LocalDateTime) {
            return (LocalDateTime) cVar;
        }
        return (LocalDateTime) cVar.adjustInto(this);
    }

    /* renamed from: e */
    public LocalDateTime f(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (LocalDateTime) eVar.adjustInto(this, j);
        }
        if (eVar.isTimeBased()) {
            return b(this.date, this.time.b(eVar, j));
        }
        return b(this.date.d(eVar, j), this.time);
    }

    /* renamed from: i */
    public LocalDateTime l(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (LocalDateTime) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return dI(j);
            case MICROS:
                return dE(j / 86400000000L).dI((j % 86400000000L) * 1000);
            case MILLIS:
                return dE(j / 86400000).dI((j % 86400000) * 1000000);
            case SECONDS:
                return dH(j);
            case MINUTES:
                return dG(j);
            case HOURS:
                return dF(j);
            case HALF_DAYS:
                return dE(j / 256).dF((j % 256) * 12);
            default:
                return b(this.date.h(j, hVar), this.time);
        }
    }

    public LocalDateTime dE(long j) {
        return b(this.date.dB(j), this.time);
    }

    public LocalDateTime dF(long j) {
        return a(this.date, j, 0, 0, 0, 1);
    }

    public LocalDateTime dG(long j) {
        return a(this.date, 0, j, 0, 0, 1);
    }

    public LocalDateTime dH(long j) {
        return a(this.date, 0, 0, j, 0, 1);
    }

    public LocalDateTime dI(long j) {
        return a(this.date, 0, 0, 0, j, 1);
    }

    /* renamed from: j */
    public LocalDateTime k(long j, h hVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, hVar).l(1, hVar) : l(-j, hVar);
    }

    private LocalDateTime a(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        LocalDate localDate2 = localDate;
        if ((((j | j2) | j3) | j4) == 0) {
            return b(localDate2, this.time);
        }
        long j5 = (long) i;
        long j6 = ((((j4 / 86400000000000L) + (j3 / 86400)) + (j2 / 1440)) + (j / 24)) * j5;
        long j7 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000)) + ((j2 % 1440) * 60000000000L)) + ((j % 24) * 3600000000000L);
        long toNanoOfDay = this.time.toNanoOfDay();
        j7 = (j7 * j5) + toNanoOfDay;
        j6 += d.floorDiv(j7, 86400000000000L);
        long floorMod = d.floorMod(j7, 86400000000000L);
        return b(localDate2.dB(j6), floorMod == toNanoOfDay ? this.time : LocalTime.dK(floorMod));
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTU()) {
            return bSU();
        }
        return super.query(gVar);
    }

    public a adjustInto(a aVar) {
        return super.adjustInto(aVar);
    }

    public long a(a aVar, h hVar) {
        LocalDateTime g = g(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, g);
        }
        ChronoUnit chronoUnit = (ChronoUnit) hVar;
        if (chronoUnit.isTimeBased()) {
            long a = this.date.a(g.date);
            long toNanoOfDay = g.time.toNanoOfDay() - this.time.toNanoOfDay();
            if (a > 0 && toNanoOfDay < 0) {
                a--;
                toNanoOfDay += 86400000000000L;
            } else if (a < 0 && toNanoOfDay > 0) {
                a++;
                toNanoOfDay -= 86400000000000L;
            }
            switch (chronoUnit) {
                case NANOS:
                    return d.F(d.H(a, 86400000000000L), toNanoOfDay);
                case MICROS:
                    return d.F(d.H(a, 86400000000L), toNanoOfDay / 1000);
                case MILLIS:
                    return d.F(d.H(a, 86400000), toNanoOfDay / 1000000);
                case SECONDS:
                    return d.F(d.j(a, ChartTimeInterval.CANDLE_1D), toNanoOfDay / 1000000000);
                case MINUTES:
                    return d.F(d.j(a, 1440), toNanoOfDay / 60000000000L);
                case HOURS:
                    return d.F(d.j(a, 24), toNanoOfDay / 3600000000000L);
                case HALF_DAYS:
                    return d.F(d.j(a, 2), toNanoOfDay / 43200000000000L);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported unit: ");
                    stringBuilder.append(hVar);
                    throw new UnsupportedTemporalTypeException(stringBuilder.toString());
            }
        }
        a aVar2 = g.date;
        if (aVar2.b(this.date) && g.time.e(this.time)) {
            aVar2 = aVar2.dD(1);
        } else if (aVar2.c(this.date) && g.time.d(this.time)) {
            aVar2 = aVar2.dB(1);
        }
        return this.date.a(aVar2, hVar);
    }

    public OffsetDateTime a(ZoneOffset zoneOffset) {
        return OffsetDateTime.a(this, zoneOffset);
    }

    /* renamed from: a */
    public ZonedDateTime b(ZoneId zoneId) {
        return ZonedDateTime.a(this, zoneId);
    }

    /* renamed from: bSS */
    public LocalDate bSU() {
        return this.date;
    }

    public LocalTime bST() {
        return this.time;
    }

    /* renamed from: a */
    public int compareTo(b<?> bVar) {
        if (bVar instanceof LocalDateTime) {
            return a((LocalDateTime) bVar);
        }
        return super.compareTo(bVar);
    }

    private int a(LocalDateTime localDateTime) {
        int c = this.date.c(localDateTime.bSU());
        return c == 0 ? this.time.compareTo(localDateTime.bST()) : c;
    }

    public boolean b(b<?> bVar) {
        if (!(bVar instanceof LocalDateTime)) {
            return super.b((b) bVar);
        }
        return a((LocalDateTime) bVar) > 0;
    }

    public boolean c(b<?> bVar) {
        if (!(bVar instanceof LocalDateTime)) {
            return super.c(bVar);
        }
        return a((LocalDateTime) bVar) < 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (!(this.date.equals(localDateTime.date) && this.time.equals(localDateTime.time))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.date.toString());
        stringBuilder.append('T');
        stringBuilder.append(this.time.toString());
        return stringBuilder.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 4, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        this.date.writeExternal(dataOutput);
        this.time.writeExternal(dataOutput);
    }

    static LocalDateTime d(DataInput dataInput) {
        return a(LocalDate.c(dataInput), LocalTime.e(dataInput));
    }
}
