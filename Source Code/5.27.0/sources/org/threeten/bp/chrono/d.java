package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.a.b;
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

/* compiled from: ChronoZonedDateTime */
public abstract class d<D extends a> extends b implements Comparable<d<?>>, a {
    private static Comparator<d<?>> fGn = new Comparator<d<?>>() {
        /* renamed from: a */
        public int compare(d<?> dVar, d<?> dVar2) {
            int E = org.threeten.bp.a.d.E(dVar.toEpochSecond(), dVar2.toEpochSecond());
            return E == 0 ? org.threeten.bp.a.d.E(dVar.bST().toNanoOfDay(), dVar2.bST().toNanoOfDay()) : E;
        }
    };

    /* compiled from: ChronoZonedDateTime */
    /* renamed from: org.threeten.bp.chrono.d$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoField.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFY = r0;
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.d$AnonymousClass2.<clinit>():void");
        }
    }

    public abstract ZoneId bSJ();

    public abstract ZoneOffset bSV();

    public abstract b<D> bTc();

    public abstract d<D> e(ZoneId zoneId);

    public abstract d<D> f(ZoneId zoneId);

    /* renamed from: m */
    public abstract d<D> b(e eVar, long j);

    /* renamed from: z */
    public abstract d<D> d(long j, h hVar);

    public ValueRange range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.OFFSET_SECONDS) {
            return eVar.range();
        }
        return bTc().range(eVar);
    }

    public int get(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return super.get(eVar);
        }
        int i = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        if (i == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field too large for an int: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        } else if (i != 2) {
            return bTc().get(eVar);
        } else {
            return bSV().getTotalSeconds();
        }
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int i = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return bTc().getLong(eVar);
        }
        return (long) bSV().getTotalSeconds();
    }

    public D bSU() {
        return bTc().bSU();
    }

    public LocalTime bST() {
        return bTc().bST();
    }

    /* renamed from: m */
    public d<D> b(c cVar) {
        return bSU().bSR().c(super.b(cVar));
    }

    /* renamed from: y */
    public d<D> c(long j, h hVar) {
        return bSU().bSR().c(super.c(j, hVar));
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTP() || gVar == f.bTS()) {
            return bSJ();
        }
        if (gVar == f.bTQ()) {
            return bSU().bSR();
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.NANOS;
        }
        if (gVar == f.bTT()) {
            return bSV();
        }
        if (gVar == f.bTU()) {
            return LocalDate.dx(bSU().toEpochDay());
        }
        if (gVar == f.bTV()) {
            return bST();
        }
        return super.query(gVar);
    }

    public long toEpochSecond() {
        return ((bSU().toEpochDay() * 86400) + ((long) bST().toSecondOfDay())) - ((long) bSV().getTotalSeconds());
    }

    /* renamed from: a */
    public int compareTo(d<?> dVar) {
        int E = org.threeten.bp.a.d.E(toEpochSecond(), dVar.toEpochSecond());
        if (E != 0) {
            return E;
        }
        E = bST().getNano() - dVar.bST().getNano();
        if (E != 0) {
            return E;
        }
        E = bTc().compareTo(dVar.bTc());
        if (E != 0) {
            return E;
        }
        E = bSJ().getId().compareTo(dVar.bSJ().getId());
        return E == 0 ? bSU().bSR().compareTo(dVar.bSU().bSR()) : E;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (compareTo((d) obj) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (bTc().hashCode() ^ bSV().hashCode()) ^ Integer.rotateLeft(bSJ().hashCode(), 3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bTc().toString());
        stringBuilder.append(bSV().toString());
        String stringBuilder2 = stringBuilder.toString();
        if (bSV() == bSJ()) {
            return stringBuilder2;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append('[');
        stringBuilder3.append(bSJ().toString());
        stringBuilder3.append(']');
        return stringBuilder3.toString();
    }
}
