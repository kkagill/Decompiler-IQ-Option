package org.threeten.bp;

import com.iqoption.dto.ChartTimeInterval;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a.c;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class Instant extends c implements Serializable, Comparable<Instant>, a, org.threeten.bp.temporal.c {
    public static final g<Instant> FROM = new g<Instant>() {
        /* renamed from: d */
        public Instant b(b bVar) {
            return Instant.c(bVar);
        }
    };
    public static final Instant fFV = new Instant(0, 0);
    public static final Instant fFW = C(-31557014167219200L, 0);
    public static final Instant fFX = C(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;

    /* renamed from: org.threeten.bp.Instant$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|(3:31|32|34)) */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFZ = r0;
            r0 = 1;
            r1 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = org.threeten.bp.temporal.ChronoUnit.NANOS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = fFZ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = org.threeten.bp.temporal.ChronoUnit.MICROS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = fFZ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = org.threeten.bp.temporal.ChronoUnit.MILLIS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = org.threeten.bp.temporal.ChronoUnit.SECONDS;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = org.threeten.bp.temporal.ChronoUnit.MINUTES;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = org.threeten.bp.temporal.ChronoUnit.HOURS;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = 6;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = org.threeten.bp.temporal.ChronoUnit.HALF_DAYS;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r6 = 7;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = org.threeten.bp.temporal.ChronoUnit.DAYS;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r6 = 8;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r4 = org.threeten.bp.temporal.ChronoField.values();
            r4 = r4.length;
            r4 = new int[r4];
            fFY = r4;
            r4 = fFY;	 Catch:{ NoSuchFieldError -> 0x0075 }
            r5 = org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND;	 Catch:{ NoSuchFieldError -> 0x0075 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0075 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0075 }
        L_0x0075:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x007f }
            r4 = org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND;	 Catch:{ NoSuchFieldError -> 0x007f }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x007f }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x007f }
        L_0x007f:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND;	 Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0089 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0089 }
        L_0x0089:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0093 }
        L_0x0093:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.Instant$AnonymousClass2.<clinit>():void");
        }
    }

    public static Instant C(long j, long j2) {
        return g(d.F(j, d.floorDiv(j2, 1000000000)), d.k(j2, 1000000000));
    }

    public static Instant dt(long j) {
        return g(d.floorDiv(j, 1000), d.k(j, 1000) * 1000000);
    }

    public static Instant c(b bVar) {
        Object bVar2;
        try {
            bVar2 = C(bVar2.getLong(ChronoField.INSTANT_SECONDS), (long) bVar2.get(ChronoField.NANO_OF_SECOND));
            return bVar2;
        } catch (DateTimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain Instant from TemporalAccessor: ");
            stringBuilder.append(bVar2);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar2.getClass().getName());
            throw new DateTimeException(stringBuilder.toString(), e);
        }
    }

    private static Instant g(long j, int i) {
        if ((((long) i) | j) == 0) {
            return fFV;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (!(eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.NANO_OF_SECOND || eVar == ChronoField.MICRO_OF_SECOND || eVar == ChronoField.MILLI_OF_SECOND)) {
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
        return super.range(eVar);
    }

    public int get(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return range(eVar).b(eVar.getFrom(this), eVar);
        }
        int i = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        if (i == 1) {
            return this.nanos;
        }
        if (i == 2) {
            return this.nanos / 1000;
        }
        if (i == 3) {
            return this.nanos / 1000000;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int i;
        int i2 = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        if (i2 == 1) {
            i = this.nanos;
        } else if (i2 == 2) {
            i = this.nanos / 1000;
        } else if (i2 == 3) {
            i = this.nanos / 1000000;
        } else if (i2 == 4) {
            return this.seconds;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
        return (long) i;
    }

    public long getEpochSecond() {
        return this.seconds;
    }

    public int getNano() {
        return this.nanos;
    }

    /* renamed from: a */
    public Instant b(org.threeten.bp.temporal.c cVar) {
        return (Instant) cVar.adjustInto(this);
    }

    /* renamed from: a */
    public Instant b(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (Instant) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        int i = AnonymousClass2.fFY[chronoField.ordinal()];
        int i2;
        if (i == 1) {
            return j != ((long) this.nanos) ? g(this.seconds, (int) j) : this;
        } else if (i == 2) {
            i2 = ((int) j) * 1000;
            return i2 != this.nanos ? g(this.seconds, i2) : this;
        } else if (i == 3) {
            i2 = ((int) j) * 1000000;
            return i2 != this.nanos ? g(this.seconds, i2) : this;
        } else if (i == 4) {
            return j != this.seconds ? g(j, this.nanos) : this;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public Instant d(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (Instant) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return dw(j);
            case MICROS:
                return D(j / 1000000, (j % 1000000) * 1000);
            case MILLIS:
                return dv(j);
            case SECONDS:
                return du(j);
            case MINUTES:
                return du(d.j(j, 60));
            case HOURS:
                return du(d.j(j, ChartTimeInterval.CANDLE_1H));
            case HALF_DAYS:
                return du(d.j(j, ChartTimeInterval.CANDLE_12H));
            case DAYS:
                return du(d.j(j, ChartTimeInterval.CANDLE_1D));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    public Instant du(long j) {
        return D(j, 0);
    }

    public Instant dv(long j) {
        return D(j / 1000, (j % 1000) * 1000000);
    }

    public Instant dw(long j) {
        return D(0, j);
    }

    private Instant D(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return C(d.F(d.F(this.seconds, j), j2 / 1000000000), ((long) this.nanos) + (j2 % 1000000000));
    }

    /* renamed from: b */
    public Instant c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, hVar).d(1, hVar) : d(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTR()) {
            return ChronoUnit.NANOS;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTQ() || gVar == f.bTP() || gVar == f.bTS() || gVar == f.bTT()) ? null : gVar.b(this);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.INSTANT_SECONDS, this.seconds).b(ChronoField.NANO_OF_SECOND, (long) this.nanos);
    }

    public long a(a aVar, h hVar) {
        Instant c = c((b) aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, c);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return a(c);
            case MICROS:
                return a(c) / 1000;
            case MILLIS:
                return d.G(c.toEpochMilli(), toEpochMilli());
            case SECONDS:
                return b(c);
            case MINUTES:
                return b(c) / 60;
            case HOURS:
                return b(c) / 3600;
            case HALF_DAYS:
                return b(c) / 43200;
            case DAYS:
                return b(c) / 86400;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    private long a(Instant instant) {
        return d.F(d.j(d.G(instant.seconds, this.seconds), 1000000000), (long) (instant.nanos - this.nanos));
    }

    private long b(Instant instant) {
        long G = d.G(instant.seconds, this.seconds);
        long j = (long) (instant.nanos - this.nanos);
        if (G <= 0 || j >= 0) {
            return (G >= 0 || j <= 0) ? G : G + 1;
        } else {
            return G - 1;
        }
    }

    public long toEpochMilli() {
        long j = this.seconds;
        if (j >= 0) {
            return d.F(d.H(j, 1000), (long) (this.nanos / 1000000));
        }
        return d.G(d.H(j + 1, 1000), 1000 - ((long) (this.nanos / 1000000)));
    }

    /* renamed from: c */
    public int compareTo(Instant instant) {
        int E = d.E(this.seconds, instant.seconds);
        if (E != 0) {
            return E;
        }
        return this.nanos - instant.nanos;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        if (!(this.seconds == instant.seconds && this.nanos == instant.nanos)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public String toString() {
        return org.threeten.bp.format.b.fHQ.N(this);
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    static Instant b(DataInput dataInput) {
        return C(dataInput.readLong(), (long) dataInput.readInt());
    }
}
