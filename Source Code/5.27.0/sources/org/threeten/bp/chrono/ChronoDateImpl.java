package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.h;

abstract class ChronoDateImpl<D extends a> extends a implements Serializable, a, c {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract ChronoDateImpl<D> dS(long j);

    public abstract ChronoDateImpl<D> dT(long j);

    public abstract ChronoDateImpl<D> dU(long j);

    ChronoDateImpl() {
    }

    /* renamed from: A */
    public ChronoDateImpl<D> h(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (ChronoDateImpl) bSR().a(hVar.addTo(this, j));
        }
        switch ((ChronoUnit) hVar) {
            case DAYS:
                return dU(j);
            case WEEKS:
                return dU(d.j(j, 7));
            case MONTHS:
                return dT(j);
            case YEARS:
                return dS(j);
            case DECADES:
                return dS(d.j(j, 10));
            case CENTURIES:
                return dS(d.j(j, 100));
            case MILLENNIA:
                return dS(d.j(j, 1000));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hVar);
                stringBuilder.append(" not valid for chronology ");
                stringBuilder.append(bSR().getId());
                throw new DateTimeException(stringBuilder.toString());
        }
    }

    public b<?> b(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.a((a) this, localTime);
    }

    public long a(a aVar, h hVar) {
        a C = bSR().C(aVar);
        if (hVar instanceof ChronoUnit) {
            return LocalDate.e(this).a(C, hVar);
        }
        return hVar.between(this, C);
    }
}
