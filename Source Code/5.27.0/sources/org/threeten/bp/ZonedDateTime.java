package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.chrono.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneRules;

public final class ZonedDateTime extends d<LocalDate> implements Serializable, a {
    public static final g<ZonedDateTime> FROM = new g<ZonedDateTime>() {
        /* renamed from: A */
        public ZonedDateTime b(b bVar) {
            return ZonedDateTime.z(bVar);
        }
    };
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    /* renamed from: org.threeten.bp.ZonedDateTime$2 */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.ZonedDateTime$AnonymousClass2.<clinit>():void");
        }
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneId zoneId) {
        return a(localDateTime, zoneId, null);
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        org.threeten.bp.a.d.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules bSZ = zoneId.bSZ();
        List d = bSZ.d(localDateTime);
        if (d.size() == 1) {
            zoneOffset = (ZoneOffset) d.get(0);
        } else if (d.size() == 0) {
            ZoneOffsetTransition e = bSZ.e(localDateTime);
            localDateTime = localDateTime.dH(e.getDuration().getSeconds());
            zoneOffset = e.bUb();
        } else if (zoneOffset == null || !d.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) org.threeten.bp.a.d.requireNonNull(d.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime b(Instant instant, ZoneId zoneId) {
        org.threeten.bp.a.d.requireNonNull(instant, "instant");
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        return a(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        org.threeten.bp.a.d.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.a.d.requireNonNull(zoneOffset, "offset");
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        return a(localDateTime.g(zoneOffset), localDateTime.getNano(), zoneId);
    }

    private static ZonedDateTime a(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.bSZ().d(Instant.C(j, (long) i));
        return new ZonedDateTime(LocalDateTime.a(j, i, d), d, zoneId);
    }

    private static ZonedDateTime b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        org.threeten.bp.a.d.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.a.d.requireNonNull(zoneOffset, "offset");
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffset.equals(zoneId)) {
            return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    public static org.threeten.bp.ZonedDateTime z(org.threeten.bp.temporal.b r4) {
        /*
        r0 = r4 instanceof org.threeten.bp.ZonedDateTime;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r4 = (org.threeten.bp.ZonedDateTime) r4;
        return r4;
    L_0x0007:
        r0 = org.threeten.bp.ZoneId.v(r4);	 Catch:{ DateTimeException -> 0x002d }
        r1 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS;	 Catch:{ DateTimeException -> 0x002d }
        r1 = r4.isSupported(r1);	 Catch:{ DateTimeException -> 0x002d }
        if (r1 == 0) goto L_0x0024;
    L_0x0013:
        r1 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS;	 Catch:{ DateTimeException -> 0x0024 }
        r1 = r4.getLong(r1);	 Catch:{ DateTimeException -> 0x0024 }
        r3 = org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND;	 Catch:{ DateTimeException -> 0x0024 }
        r3 = r4.get(r3);	 Catch:{ DateTimeException -> 0x0024 }
        r4 = a(r1, r3, r0);	 Catch:{ DateTimeException -> 0x0024 }
        return r4;
    L_0x0024:
        r1 = org.threeten.bp.LocalDateTime.g(r4);	 Catch:{ DateTimeException -> 0x002d }
        r4 = a(r1, r0);	 Catch:{ DateTimeException -> 0x002d }
        return r4;
    L_0x002d:
        r0 = new org.threeten.bp.DateTimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unable to obtain ZonedDateTime from TemporalAccessor: ";
        r1.append(r2);
        r1.append(r4);
        r2 = ", type ";
        r1.append(r2);
        r4 = r4.getClass();
        r4 = r4.getName();
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.ZonedDateTime.z(org.threeten.bp.temporal.b):org.threeten.bp.ZonedDateTime");
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = localDateTime;
        this.offset = zoneOffset;
        this.zone = zoneId;
    }

    private ZonedDateTime b(LocalDateTime localDateTime) {
        return a(localDateTime, this.zone, this.offset);
    }

    private ZonedDateTime c(LocalDateTime localDateTime) {
        return a(localDateTime, this.offset, this.zone);
    }

    private ZonedDateTime e(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.offset) || !this.zone.bSZ().c(this.dateTime, zoneOffset)) ? this : new ZonedDateTime(this.dateTime, zoneOffset, this.zone);
    }

    public boolean isSupported(e eVar) {
        return (eVar instanceof ChronoField) || (eVar != null && eVar.isSupportedBy(this));
    }

    public ValueRange range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.OFFSET_SECONDS) {
            return eVar.range();
        }
        return this.dateTime.range(eVar);
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
            throw new DateTimeException(stringBuilder.toString());
        } else if (i != 2) {
            return this.dateTime.get(eVar);
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
            return this.dateTime.getLong(eVar);
        }
        return (long) bSV().getTotalSeconds();
    }

    public ZoneOffset bSV() {
        return this.offset;
    }

    public ZoneId bSJ() {
        return this.zone;
    }

    /* renamed from: c */
    public ZonedDateTime f(ZoneId zoneId) {
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : a(this.dateTime, zoneId, this.offset);
    }

    /* renamed from: d */
    public ZonedDateTime e(ZoneId zoneId) {
        org.threeten.bp.a.d.requireNonNull(zoneId, "zone");
        if (this.zone.equals(zoneId)) {
            return this;
        }
        return a(this.dateTime.g(this.offset), this.dateTime.getNano(), zoneId);
    }

    public int getNano() {
        return this.dateTime.getNano();
    }

    /* renamed from: l */
    public ZonedDateTime m(c cVar) {
        if (cVar instanceof LocalDate) {
            return b(LocalDateTime.a((LocalDate) cVar, this.dateTime.bST()));
        }
        if (cVar instanceof LocalTime) {
            return b(LocalDateTime.a(this.dateTime.bSU(), (LocalTime) cVar));
        }
        if (cVar instanceof LocalDateTime) {
            return b((LocalDateTime) cVar);
        }
        if (cVar instanceof Instant) {
            Instant instant = (Instant) cVar;
            return a(instant.getEpochSecond(), instant.getNano(), this.zone);
        } else if (cVar instanceof ZoneOffset) {
            return e((ZoneOffset) cVar);
        } else {
            return (ZonedDateTime) cVar.adjustInto(this);
        }
    }

    /* renamed from: l */
    public ZonedDateTime m(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (ZonedDateTime) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        int i = AnonymousClass2.fFY[chronoField.ordinal()];
        if (i == 1) {
            return a(j, getNano(), this.zone);
        }
        if (i != 2) {
            return b(this.dateTime.f(eVar, j));
        }
        return e(ZoneOffset.nq(chronoField.checkValidIntValue(j)));
    }

    /* renamed from: w */
    public ZonedDateTime z(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (ZonedDateTime) hVar.addTo(this, j);
        }
        if (hVar.isDateBased()) {
            return b(this.dateTime.l(j, hVar));
        }
        return c(this.dateTime.l(j, hVar));
    }

    /* renamed from: x */
    public ZonedDateTime y(long j, h hVar) {
        return j == Long.MIN_VALUE ? z(Long.MAX_VALUE, hVar).z(1, hVar) : z(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTU()) {
            return bSU();
        }
        return super.query(gVar);
    }

    public long a(a aVar, h hVar) {
        ZonedDateTime z = z(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, z);
        }
        z = z.e(this.zone);
        if (hVar.isDateBased()) {
            return this.dateTime.a(z.dateTime, hVar);
        }
        return bTb().a(z.bTb(), hVar);
    }

    /* renamed from: bSW */
    public LocalDateTime bTc() {
        return this.dateTime;
    }

    /* renamed from: bSS */
    public LocalDate bSU() {
        return this.dateTime.bSU();
    }

    public LocalTime bST() {
        return this.dateTime.bST();
    }

    public OffsetDateTime bTb() {
        return OffsetDateTime.a(this.dateTime, this.offset);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        if (!(this.dateTime.equals(zonedDateTime.dateTime) && this.offset.equals(zonedDateTime.offset) && this.zone.equals(zonedDateTime.zone))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.dateTime.toString());
        stringBuilder.append(this.offset.toString());
        String stringBuilder2 = stringBuilder.toString();
        if (this.offset == this.zone) {
            return stringBuilder2;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append('[');
        stringBuilder3.append(this.zone.toString());
        stringBuilder3.append(']');
        return stringBuilder3.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
        this.zone.a(dataOutput);
    }

    static ZonedDateTime n(DataInput dataInput) {
        return b(LocalDateTime.d(dataInput), ZoneOffset.l(dataInput), (ZoneId) Ser.i(dataInput));
    }
}
