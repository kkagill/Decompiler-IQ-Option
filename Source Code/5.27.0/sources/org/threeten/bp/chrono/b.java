package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

/* compiled from: ChronoLocalDateTime */
public abstract class b<D extends a> extends org.threeten.bp.a.b implements Comparable<b<?>>, a, c {
    private static final Comparator<b<?>> fGy = new Comparator<b<?>>() {
        /* renamed from: a */
        public int compare(b<?> bVar, b<?> bVar2) {
            int E = d.E(bVar.bSU().toEpochDay(), bVar2.bSU().toEpochDay());
            return E == 0 ? d.E(bVar.bST().toNanoOfDay(), bVar2.bST().toNanoOfDay()) : E;
        }
    };

    public abstract d<D> b(ZoneId zoneId);

    public abstract LocalTime bST();

    public abstract D bSU();

    /* renamed from: f */
    public abstract b<D> b(e eVar, long j);

    /* renamed from: l */
    public abstract b<D> d(long j, h hVar);

    public e bSR() {
        return bSU().bSR();
    }

    /* renamed from: f */
    public b<D> b(c cVar) {
        return bSU().bSR().b(super.b(cVar));
    }

    /* renamed from: k */
    public b<D> c(long j, h hVar) {
        return bSU().bSR().b(super.c(j, hVar));
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTQ()) {
            return bSR();
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.NANOS;
        }
        if (gVar == f.bTU()) {
            return LocalDate.dx(bSU().toEpochDay());
        }
        if (gVar == f.bTV()) {
            return bST();
        }
        return (gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT()) ? null : super.query(gVar);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.EPOCH_DAY, bSU().toEpochDay()).b(ChronoField.NANO_OF_DAY, bST().toNanoOfDay());
    }

    public Instant f(ZoneOffset zoneOffset) {
        return Instant.C(g(zoneOffset), (long) bST().getNano());
    }

    public long g(ZoneOffset zoneOffset) {
        d.requireNonNull(zoneOffset, "offset");
        return ((bSU().toEpochDay() * 86400) + ((long) bST().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    /* renamed from: a */
    public int compareTo(b<?> bVar) {
        int a = bSU().compareTo(bVar.bSU());
        if (a != 0) {
            return a;
        }
        a = bST().compareTo(bVar.bST());
        return a == 0 ? bSR().compareTo(bVar.bSR()) : a;
    }

    public boolean b(b<?> bVar) {
        long toEpochDay = bSU().toEpochDay();
        long toEpochDay2 = bVar.bSU().toEpochDay();
        return toEpochDay > toEpochDay2 || (toEpochDay == toEpochDay2 && bST().toNanoOfDay() > bVar.bST().toNanoOfDay());
    }

    public boolean c(b<?> bVar) {
        long toEpochDay = bSU().toEpochDay();
        long toEpochDay2 = bVar.bSU().toEpochDay();
        return toEpochDay < toEpochDay2 || (toEpochDay == toEpochDay2 && bST().toNanoOfDay() < bVar.bST().toNanoOfDay());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (compareTo((b) obj) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return bSU().hashCode() ^ bST().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bSU().toString());
        stringBuilder.append('T');
        stringBuilder.append(bST().toString());
        return stringBuilder.toString();
    }
}
