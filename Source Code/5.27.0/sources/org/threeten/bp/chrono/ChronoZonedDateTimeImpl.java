package org.threeten.bp.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.h;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneRules;

final class ChronoZonedDateTimeImpl<D extends a> extends d<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final ChronoLocalDateTimeImpl<D> dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    /* renamed from: org.threeten.bp.chrono.ChronoZonedDateTimeImpl$1 */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.ChronoZonedDateTimeImpl$AnonymousClass1.<clinit>():void");
        }
    }

    static <R extends a> d<R> a(ChronoLocalDateTimeImpl<R> chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        d.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        d.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        Object zoneOffset2;
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl2;
        ZoneRules bSZ = zoneId.bSZ();
        LocalDateTime g = LocalDateTime.g(chronoLocalDateTimeImpl2);
        List d = bSZ.d(g);
        if (d.size() == 1) {
            zoneOffset2 = (ZoneOffset) d.get(0);
        } else if (d.size() == 0) {
            ZoneOffsetTransition e = bSZ.e(g);
            chronoLocalDateTimeImpl2 = chronoLocalDateTimeImpl2.dY(e.getDuration().getSeconds());
            zoneOffset2 = e.bUb();
        } else if (zoneOffset2 == null || !d.contains(zoneOffset2)) {
            zoneOffset2 = (ZoneOffset) d.get(0);
        }
        d.requireNonNull(zoneOffset2, "offset");
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl2, zoneOffset2, zoneId);
    }

    static <R extends a> ChronoZonedDateTimeImpl<R> a(e eVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.bSZ().d(instant);
        d.requireNonNull(d, "offset");
        return new ChronoZonedDateTimeImpl((ChronoLocalDateTimeImpl) eVar.D(LocalDateTime.a(instant.getEpochSecond(), instant.getNano(), d)), d, zoneId);
    }

    private ChronoZonedDateTimeImpl<D> c(Instant instant, ZoneId zoneId) {
        return a(bSU().bSR(), instant, zoneId);
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = (ChronoLocalDateTimeImpl) d.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.offset = (ZoneOffset) d.requireNonNull(zoneOffset, "offset");
        this.zone = (ZoneId) d.requireNonNull(zoneId, "zone");
    }

    public ZoneOffset bSV() {
        return this.offset;
    }

    public b<D> bTc() {
        return this.dateTime;
    }

    public ZoneId bSJ() {
        return this.zone;
    }

    public d<D> f(ZoneId zoneId) {
        return a(this.dateTime, zoneId, this.offset);
    }

    public d<D> e(ZoneId zoneId) {
        d.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : c(this.dateTime.f(this.offset), zoneId);
    }

    public boolean isSupported(e eVar) {
        return (eVar instanceof ChronoField) || (eVar != null && eVar.isSupportedBy(this));
    }

    /* renamed from: m */
    public d<D> b(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return bSU().bSR().c(eVar.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) eVar;
        int i = AnonymousClass1.fFY[chronoField.ordinal()];
        if (i == 1) {
            return d(j - toEpochSecond(), ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return a(this.dateTime.f(eVar, j), this.zone, this.offset);
        }
        return c(this.dateTime.f(ZoneOffset.nq(chronoField.checkValidIntValue(j))), this.zone);
    }

    /* renamed from: z */
    public d<D> d(long j, h hVar) {
        if (hVar instanceof ChronoUnit) {
            return b(this.dateTime.l(j, hVar));
        }
        return bSU().bSR().c(hVar.addTo(this, j));
    }

    public long a(a aVar, h hVar) {
        d E = bSU().bSR().E(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, E);
        }
        return this.dateTime.a(E.e(this.offset).bTc(), hVar);
    }

    private Object writeReplace() {
        return new Ser((byte) 13, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
    }

    static d<?> b(ObjectInput objectInput) {
        b bVar = (b) objectInput.readObject();
        ZoneId zoneId = (ZoneOffset) objectInput.readObject();
        return bVar.b(zoneId).f((ZoneId) objectInput.readObject());
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
