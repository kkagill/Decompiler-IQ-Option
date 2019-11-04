package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.bp.a.b;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class OffsetDateTime extends b implements Serializable, Comparable<OffsetDateTime>, a, c {
    public static final g<OffsetDateTime> FROM = new g<OffsetDateTime>() {
        /* renamed from: o */
        public OffsetDateTime b(org.threeten.bp.temporal.b bVar) {
            return OffsetDateTime.n(bVar);
        }
    };
    public static final OffsetDateTime fGl = LocalDateTime.fGc.a(ZoneOffset.fGv);
    public static final OffsetDateTime fGm = LocalDateTime.fGd.a(ZoneOffset.fGu);
    private static final Comparator<OffsetDateTime> fGn = new Comparator<OffsetDateTime>() {
        /* renamed from: a */
        public int compare(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
            int E = d.E(offsetDateTime.toEpochSecond(), offsetDateTime2.toEpochSecond());
            return E == 0 ? d.E((long) offsetDateTime.getNano(), (long) offsetDateTime2.getNano()) : E;
        }
    };
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;

    /* renamed from: org.threeten.bp.OffsetDateTime$3 */
    static /* synthetic */ class AnonymousClass3 {
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.OffsetDateTime$AnonymousClass3.<clinit>():void");
        }
    }

    public static OffsetDateTime a(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime a(Instant instant, ZoneId zoneId) {
        d.requireNonNull(instant, "instant");
        d.requireNonNull(zoneId, "zone");
        ZoneOffset d = zoneId.bSZ().d(instant);
        return new OffsetDateTime(LocalDateTime.a(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r3 = a(org.threeten.bp.Instant.c((org.threeten.bp.temporal.b) r3), r0);
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            return r3;
     */
    public static org.threeten.bp.OffsetDateTime n(org.threeten.bp.temporal.b r3) {
        /*
        r0 = r3 instanceof org.threeten.bp.OffsetDateTime;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r3 = (org.threeten.bp.OffsetDateTime) r3;
        return r3;
    L_0x0007:
        r0 = org.threeten.bp.ZoneOffset.x(r3);	 Catch:{ DateTimeException -> 0x001d }
        r1 = org.threeten.bp.LocalDateTime.g(r3);	 Catch:{ DateTimeException -> 0x0014 }
        r3 = a(r1, r0);	 Catch:{ DateTimeException -> 0x0014 }
        return r3;
    L_0x0014:
        r1 = org.threeten.bp.Instant.c(r3);	 Catch:{ DateTimeException -> 0x001d }
        r3 = a(r1, r0);	 Catch:{ DateTimeException -> 0x001d }
        return r3;
    L_0x001d:
        r0 = new org.threeten.bp.DateTimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unable to obtain OffsetDateTime from TemporalAccessor: ";
        r1.append(r2);
        r1.append(r3);
        r2 = ", type ";
        r1.append(r2);
        r3 = r3.getClass();
        r3 = r3.getName();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.OffsetDateTime.n(org.threeten.bp.temporal.b):org.threeten.bp.OffsetDateTime");
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.dateTime = (LocalDateTime) d.requireNonNull(localDateTime, "dateTime");
        this.offset = (ZoneOffset) d.requireNonNull(zoneOffset, "offset");
    }

    private OffsetDateTime b(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.dateTime == localDateTime && this.offset.equals(zoneOffset)) {
            return this;
        }
        return new OffsetDateTime(localDateTime, zoneOffset);
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
        int i = AnonymousClass3.fFY[((ChronoField) eVar).ordinal()];
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
        int i = AnonymousClass3.fFY[((ChronoField) eVar).ordinal()];
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

    public OffsetDateTime c(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetDateTime(this.dateTime.dH((long) (zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds())), zoneOffset);
    }

    public int getNano() {
        return this.dateTime.getNano();
    }

    /* renamed from: h */
    public OffsetDateTime b(c cVar) {
        if ((cVar instanceof LocalDate) || (cVar instanceof LocalTime) || (cVar instanceof LocalDateTime)) {
            return b(this.dateTime.f(cVar), this.offset);
        }
        if (cVar instanceof Instant) {
            return a((Instant) cVar, this.offset);
        }
        if (cVar instanceof ZoneOffset) {
            return b(this.dateTime, (ZoneOffset) cVar);
        }
        if (cVar instanceof OffsetDateTime) {
            return (OffsetDateTime) cVar;
        }
        return (OffsetDateTime) cVar.adjustInto(this);
    }

    /* renamed from: h */
    public OffsetDateTime b(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (OffsetDateTime) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        int i = AnonymousClass3.fFY[chronoField.ordinal()];
        if (i == 1) {
            return a(Instant.C(j, (long) getNano()), this.offset);
        }
        if (i != 2) {
            return b(this.dateTime.f(eVar, j), this.offset);
        }
        return b(this.dateTime, ZoneOffset.nq(chronoField.checkValidIntValue(j)));
    }

    /* renamed from: o */
    public OffsetDateTime d(long j, h hVar) {
        if (hVar instanceof ChronoUnit) {
            return b(this.dateTime.l(j, hVar), this.offset);
        }
        return (OffsetDateTime) hVar.addTo(this, j);
    }

    /* renamed from: p */
    public OffsetDateTime c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, hVar).d(1, hVar) : d(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTQ()) {
            return IsoChronology.fHk;
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.NANOS;
        }
        if (gVar == f.bTT() || gVar == f.bTS()) {
            return bSV();
        }
        if (gVar == f.bTU()) {
            return bSS();
        }
        if (gVar == f.bTV()) {
            return bST();
        }
        if (gVar == f.bTP()) {
            return null;
        }
        return super.query(gVar);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.EPOCH_DAY, bSS().toEpochDay()).b(ChronoField.NANO_OF_DAY, bST().toNanoOfDay()).b(ChronoField.OFFSET_SECONDS, (long) bSV().getTotalSeconds());
    }

    public long a(a aVar, h hVar) {
        OffsetDateTime n = n(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, n);
        }
        return this.dateTime.a(n.c(this.offset).dateTime, hVar);
    }

    public LocalDateTime bSW() {
        return this.dateTime;
    }

    public LocalDate bSS() {
        return this.dateTime.bSU();
    }

    public LocalTime bST() {
        return this.dateTime.bST();
    }

    public long toEpochSecond() {
        return this.dateTime.g(this.offset);
    }

    /* renamed from: a */
    public int compareTo(OffsetDateTime offsetDateTime) {
        if (bSV().equals(offsetDateTime.bSV())) {
            return bSW().compareTo(offsetDateTime.bSW());
        }
        int E = d.E(toEpochSecond(), offsetDateTime.toEpochSecond());
        if (E == 0) {
            E = bST().getNano() - offsetDateTime.bST().getNano();
            if (E == 0) {
                E = bSW().compareTo(offsetDateTime.bSW());
            }
        }
        return E;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (!(this.dateTime.equals(offsetDateTime.dateTime) && this.offset.equals(offsetDateTime.offset))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.dateTime.toString());
        stringBuilder.append(this.offset.toString());
        return stringBuilder.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 69, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
    }

    static OffsetDateTime g(DataInput dataInput) {
        return a(LocalDateTime.d(dataInput), ZoneOffset.l(dataInput));
    }
}
