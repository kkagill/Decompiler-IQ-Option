package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a.c;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class YearMonth extends c implements Serializable, Comparable<YearMonth>, a, org.threeten.bp.temporal.c {
    public static final g<YearMonth> FROM = new g<YearMonth>() {
        /* renamed from: u */
        public YearMonth b(b bVar) {
            return YearMonth.t(bVar);
        }
    };
    private static final org.threeten.bp.format.b fGk = new DateTimeFormatterBuilder().a(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).I('-').a(ChronoField.MONTH_OF_YEAR, 2).bTD();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    /* renamed from: org.threeten.bp.YearMonth$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0072 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFZ = r0;
            r0 = 1;
            r1 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = org.threeten.bp.temporal.ChronoUnit.MONTHS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = fFZ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = org.threeten.bp.temporal.ChronoUnit.YEARS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = fFZ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = org.threeten.bp.temporal.ChronoUnit.DECADES;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = org.threeten.bp.temporal.ChronoUnit.CENTURIES;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = org.threeten.bp.temporal.ChronoUnit.MILLENNIA;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = fFZ;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = org.threeten.bp.temporal.ChronoUnit.ERAS;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = 6;
            r5[r6] = r7;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r5 = org.threeten.bp.temporal.ChronoField.values();
            r5 = r5.length;
            r5 = new int[r5];
            fFY = r5;
            r5 = fFY;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005e }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0068 }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = org.threeten.bp.temporal.ChronoField.ERA;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.YearMonth$AnonymousClass2.<clinit>():void");
        }
    }

    public static YearMonth bs(int i, int i2) {
        ChronoField.YEAR.checkValidValue((long) i);
        ChronoField.MONTH_OF_YEAR.checkValidValue((long) i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth t(b bVar) {
        if (bVar instanceof YearMonth) {
            return (YearMonth) bVar;
        }
        try {
            if (!IsoChronology.fHk.equals(e.B(bVar))) {
                bVar = LocalDate.e(bVar);
            }
            return bs(bVar.get(ChronoField.YEAR), bVar.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain YearMonth from TemporalAccessor: ");
            stringBuilder.append(bVar);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar.getClass().getName());
            throw new DateTimeException(stringBuilder.toString());
        }
    }

    private YearMonth(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    private YearMonth bt(int i, int i2) {
        if (this.year == i && this.month == i2) {
            return this;
        }
        return new YearMonth(i, i2);
    }

    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (!(eVar == ChronoField.YEAR || eVar == ChronoField.MONTH_OF_YEAR || eVar == ChronoField.PROLEPTIC_MONTH || eVar == ChronoField.YEAR_OF_ERA || eVar == ChronoField.ERA)) {
                z = false;
            }
            return z;
        }
        if (eVar == null || !eVar.isSupportedBy(this)) {
            z = false;
        }
        return z;
    }

    public ValueRange range(org.threeten.bp.temporal.e eVar) {
        if (eVar != ChronoField.YEAR_OF_ERA) {
            return super.range(eVar);
        }
        return ValueRange.I(1, getYear() <= 0 ? 1000000000 : 999999999);
    }

    public int get(org.threeten.bp.temporal.e eVar) {
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int i;
        int i2 = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i = this.month;
        } else if (i2 == 2) {
            return bSM();
        } else {
            if (i2 == 3) {
                i = this.year;
                if (i < 1) {
                    i = 1 - i;
                }
                return (long) i;
            } else if (i2 == 4) {
                i = this.year;
            } else if (i2 == 5) {
                if (this.year < 1) {
                    i3 = 0;
                }
                return (long) i3;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported field: ");
                stringBuilder.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
            }
        }
        return (long) i;
    }

    private long bSM() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    public int getYear() {
        return this.year;
    }

    /* renamed from: k */
    public YearMonth b(org.threeten.bp.temporal.c cVar) {
        return (YearMonth) cVar.adjustInto(this);
    }

    /* renamed from: k */
    public YearMonth b(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (YearMonth) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        int i = AnonymousClass2.fFY[chronoField.ordinal()];
        if (i == 1) {
            return np((int) j);
        }
        if (i == 2) {
            return dR(j - getLong(ChronoField.PROLEPTIC_MONTH));
        }
        if (i == 3) {
            if (this.year < 1) {
                j = 1 - j;
            }
            return no((int) j);
        } else if (i == 4) {
            return no((int) j);
        } else {
            if (i == 5) {
                return getLong(ChronoField.ERA) == j ? this : no(1 - this.year);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    public YearMonth no(int i) {
        ChronoField.YEAR.checkValidValue((long) i);
        return bt(i, this.month);
    }

    public YearMonth np(int i) {
        ChronoField.MONTH_OF_YEAR.checkValidValue((long) i);
        return bt(this.year, i);
    }

    /* renamed from: u */
    public YearMonth d(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (YearMonth) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case MONTHS:
                return dR(j);
            case YEARS:
                return dQ(j);
            case DECADES:
                return dQ(d.j(j, 10));
            case CENTURIES:
                return dQ(d.j(j, 100));
            case MILLENNIA:
                return dQ(d.j(j, 1000));
            case ERAS:
                return b(ChronoField.ERA, d.F(getLong(ChronoField.ERA), j));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    public YearMonth dQ(long j) {
        if (j == 0) {
            return this;
        }
        return bt(ChronoField.YEAR.checkValidIntValue(((long) this.year) + j), this.month);
    }

    public YearMonth dR(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((((long) this.year) * 12) + ((long) (this.month - 1))) + j;
        return bt(ChronoField.YEAR.checkValidIntValue(d.floorDiv(j2, 12)), d.k(j2, 12) + 1);
    }

    /* renamed from: v */
    public YearMonth c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, hVar).d(1, hVar) : d(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTQ()) {
            return IsoChronology.fHk;
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.MONTHS;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT()) ? null : super.query(gVar);
    }

    public a adjustInto(a aVar) {
        if (e.B(aVar).equals(IsoChronology.fHk)) {
            return aVar.b(ChronoField.PROLEPTIC_MONTH, bSM());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public long a(a aVar, h hVar) {
        YearMonth t = t(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, t);
        }
        long bSM = t.bSM() - bSM();
        switch ((ChronoUnit) hVar) {
            case MONTHS:
                break;
            case YEARS:
                bSM /= 12;
                break;
            case DECADES:
                return bSM / 120;
            case CENTURIES:
                return bSM / 1200;
            case MILLENNIA:
                return bSM / 12000;
            case ERAS:
                return t.getLong(ChronoField.ERA) - getLong(ChronoField.ERA);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
        return bSM;
    }

    /* renamed from: a */
    public int compareTo(YearMonth yearMonth) {
        int i = this.year - yearMonth.year;
        return i == 0 ? this.month - yearMonth.month : i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        if (!(this.year == yearMonth.year && this.month == yearMonth.month)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    public String toString() {
        int abs = Math.abs(this.year);
        StringBuilder stringBuilder = new StringBuilder(9);
        if (abs < 1000) {
            abs = this.year;
            if (abs < 0) {
                stringBuilder.append(abs - 10000);
                stringBuilder.deleteCharAt(1);
            } else {
                stringBuilder.append(abs + 10000);
                stringBuilder.deleteCharAt(0);
            }
        } else {
            stringBuilder.append(this.year);
        }
        stringBuilder.append(this.month < 10 ? "-0" : "-");
        stringBuilder.append(this.month);
        return stringBuilder.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 68, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    static YearMonth k(DataInput dataInput) {
        return bs(dataInput.readInt(), dataInput.readByte());
    }
}
