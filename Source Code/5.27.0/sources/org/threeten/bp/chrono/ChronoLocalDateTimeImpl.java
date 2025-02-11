package org.threeten.bp.chrono;

import com.iqoption.dto.ChartTimeInterval;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.h;

final class ChronoLocalDateTimeImpl<D extends a> extends b<D> implements Serializable, a, c {
    private static final long serialVersionUID = 4556003607393004514L;
    private final D date;
    private final LocalTime time;

    static <R extends a> ChronoLocalDateTimeImpl<R> a(R r, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl(r, localTime);
    }

    private ChronoLocalDateTimeImpl(D d, LocalTime localTime) {
        d.requireNonNull(d, "date");
        d.requireNonNull(localTime, "time");
        this.date = d;
        this.time = localTime;
    }

    private ChronoLocalDateTimeImpl<D> a(a aVar, LocalTime localTime) {
        if (this.date == aVar && this.time == localTime) {
            return this;
        }
        return new ChronoLocalDateTimeImpl(this.date.bSR().a(aVar), localTime);
    }

    public D bSU() {
        return this.date;
    }

    public LocalTime bST() {
        return this.time;
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
            return range(eVar).b(getLong(eVar), eVar);
        }
        return eVar.isTimeBased() ? this.time.get(eVar) : this.date.get(eVar);
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        return eVar.isTimeBased() ? this.time.getLong(eVar) : this.date.getLong(eVar);
    }

    /* renamed from: n */
    public ChronoLocalDateTimeImpl<D> f(c cVar) {
        if (cVar instanceof a) {
            return a((a) cVar, this.time);
        }
        if (cVar instanceof LocalTime) {
            return a(this.date, (LocalTime) cVar);
        }
        if (cVar instanceof ChronoLocalDateTimeImpl) {
            return this.date.bSR().b((ChronoLocalDateTimeImpl) cVar);
        }
        return this.date.bSR().b((ChronoLocalDateTimeImpl) cVar.adjustInto(this));
    }

    /* renamed from: n */
    public ChronoLocalDateTimeImpl<D> f(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return this.date.bSR().b(eVar.adjustInto(this, j));
        }
        if (eVar.isTimeBased()) {
            return a(this.date, this.time.b(eVar, j));
        }
        return a(this.date.b(eVar, j), this.time);
    }

    /* renamed from: B */
    public ChronoLocalDateTimeImpl<D> l(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return this.date.bSR().b(hVar.addTo(this, j));
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return dZ(j);
            case MICROS:
                return dV(j / 86400000000L).dZ((j % 86400000000L) * 1000);
            case MILLIS:
                return dV(j / 86400000).dZ((j % 86400000) * 1000000);
            case SECONDS:
                return dY(j);
            case MINUTES:
                return dX(j);
            case HOURS:
                return dW(j);
            case HALF_DAYS:
                return dV(j / 256).dW((j % 256) * 12);
            default:
                return a(this.date.d(j, hVar), this.time);
        }
    }

    private ChronoLocalDateTimeImpl<D> dV(long j) {
        return a(this.date.d(j, ChronoUnit.DAYS), this.time);
    }

    private ChronoLocalDateTimeImpl<D> dW(long j) {
        return a(this.date, j, 0, 0, 0);
    }

    private ChronoLocalDateTimeImpl<D> dX(long j) {
        return a(this.date, 0, j, 0, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public ChronoLocalDateTimeImpl<D> dY(long j) {
        return a(this.date, 0, 0, j, 0);
    }

    private ChronoLocalDateTimeImpl<D> dZ(long j) {
        return a(this.date, 0, 0, 0, j);
    }

    private ChronoLocalDateTimeImpl<D> a(D d, long j, long j2, long j3, long j4) {
        a aVar = d;
        if ((((j | j2) | j3) | j4) == 0) {
            return a(aVar, this.time);
        }
        long j5 = (((j4 / 86400000000000L) + (j3 / 86400)) + (j2 / 1440)) + (j / 24);
        long j6 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000)) + ((j2 % 1440) * 60000000000L)) + ((j % 24) * 3600000000000L);
        long toNanoOfDay = this.time.toNanoOfDay();
        j6 += toNanoOfDay;
        j5 += d.floorDiv(j6, 86400000000000L);
        long floorMod = d.floorMod(j6, 86400000000000L);
        return a(aVar.d(j5, ChronoUnit.DAYS), floorMod == toNanoOfDay ? this.time : LocalTime.dK(floorMod));
    }

    public d<D> b(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.a(this, zoneId, null);
    }

    public long a(a aVar, h hVar) {
        b D = bSU().bSR().D(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, D);
        }
        ChronoUnit chronoUnit = (ChronoUnit) hVar;
        if (chronoUnit.isTimeBased()) {
            long j = D.getLong(ChronoField.EPOCH_DAY) - this.date.getLong(ChronoField.EPOCH_DAY);
            switch (chronoUnit) {
                case NANOS:
                    j = d.H(j, 86400000000000L);
                    break;
                case MICROS:
                    j = d.H(j, 86400000000L);
                    break;
                case MILLIS:
                    j = d.H(j, 86400000);
                    break;
                case SECONDS:
                    j = d.j(j, ChartTimeInterval.CANDLE_1D);
                    break;
                case MINUTES:
                    j = d.j(j, 1440);
                    break;
                case HOURS:
                    j = d.j(j, 24);
                    break;
                case HALF_DAYS:
                    j = d.j(j, 2);
                    break;
            }
            return d.F(j, this.time.a(D.bST(), hVar));
        }
        a bSU = D.bSU();
        if (D.bST().e(this.time)) {
            bSU = bSU.c(1, ChronoUnit.DAYS);
        }
        return this.date.a(bSU, hVar);
    }

    private Object writeReplace() {
        return new Ser((byte) 12, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }

    static b<?> a(ObjectInput objectInput) {
        return ((a) objectInput.readObject()).b((LocalTime) objectInput.readObject());
    }
}
