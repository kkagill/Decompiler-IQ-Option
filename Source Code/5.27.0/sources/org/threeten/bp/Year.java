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

public final class Year extends c implements Serializable, Comparable<Year>, a, org.threeten.bp.temporal.c {
    public static final g<Year> FROM = new g<Year>() {
        /* renamed from: s */
        public Year b(b bVar) {
            return Year.r(bVar);
        }
    };
    private static final org.threeten.bp.format.b fGk = new DateTimeFormatterBuilder().a(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).bTD();
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;

    /* renamed from: org.threeten.bp.Year$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];
        static final /* synthetic */ int[] fFZ = new int[ChronoUnit.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFZ = r0;
            r0 = 1;
            r1 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = org.threeten.bp.temporal.ChronoUnit.YEARS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = fFZ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = org.threeten.bp.temporal.ChronoUnit.DECADES;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = fFZ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = org.threeten.bp.temporal.ChronoUnit.CENTURIES;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = org.threeten.bp.temporal.ChronoUnit.MILLENNIA;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = 4;
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r3 = fFZ;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = org.threeten.bp.temporal.ChronoUnit.ERAS;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = 5;
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r3 = org.threeten.bp.temporal.ChronoField.values();
            r3 = r3.length;
            r3 = new int[r3];
            fFY = r3;
            r3 = fFY;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r4 = org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x005d }
            r3 = org.threeten.bp.temporal.ChronoField.YEAR;	 Catch:{ NoSuchFieldError -> 0x005d }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = org.threeten.bp.temporal.ChronoField.ERA;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.Year$AnonymousClass2.<clinit>():void");
        }
    }

    public static Year nn(int i) {
        ChronoField.YEAR.checkValidValue((long) i);
        return new Year(i);
    }

    public static Year r(b bVar) {
        if (bVar instanceof Year) {
            return (Year) bVar;
        }
        try {
            if (!IsoChronology.fHk.equals(e.B(bVar))) {
                bVar = LocalDate.e(bVar);
            }
            return nn(bVar.get(ChronoField.YEAR));
        } catch (DateTimeException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain Year from TemporalAccessor: ");
            stringBuilder.append(bVar);
            stringBuilder.append(", type ");
            stringBuilder.append(bVar.getClass().getName());
            throw new DateTimeException(stringBuilder.toString());
        }
    }

    private Year(int i) {
        this.year = i;
    }

    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (!(eVar == ChronoField.YEAR || eVar == ChronoField.YEAR_OF_ERA || eVar == ChronoField.ERA)) {
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
        return ValueRange.I(1, this.year <= 0 ? 1000000000 : 999999999);
    }

    public int get(org.threeten.bp.temporal.e eVar) {
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int i = AnonymousClass2.fFY[((ChronoField) eVar).ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = this.year;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 2) {
            return (long) this.year;
        } else {
            if (i == 3) {
                if (this.year < 1) {
                    i2 = 0;
                }
                return (long) i2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    /* renamed from: j */
    public Year b(org.threeten.bp.temporal.c cVar) {
        return (Year) cVar.adjustInto(this);
    }

    /* renamed from: j */
    public Year b(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (Year) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        int i = AnonymousClass2.fFY[chronoField.ordinal()];
        if (i == 1) {
            if (this.year < 1) {
                j = 1 - j;
            }
            return nn((int) j);
        } else if (i == 2) {
            return nn((int) j);
        } else {
            if (i == 3) {
                return getLong(ChronoField.ERA) == j ? this : nn(1 - this.year);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    /* renamed from: s */
    public Year d(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (Year) hVar.addTo(this, j);
        }
        int i = AnonymousClass2.fFZ[((ChronoUnit) hVar).ordinal()];
        if (i == 1) {
            return dP(j);
        }
        if (i == 2) {
            return dP(d.j(j, 10));
        }
        if (i == 3) {
            return dP(d.j(j, 100));
        }
        if (i == 4) {
            return dP(d.j(j, 1000));
        }
        if (i == 5) {
            return b(ChronoField.ERA, d.F(getLong(ChronoField.ERA), j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported unit: ");
        stringBuilder.append(hVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public Year dP(long j) {
        return j == 0 ? this : nn(ChronoField.YEAR.checkValidIntValue(((long) this.year) + j));
    }

    /* renamed from: t */
    public Year c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, hVar).d(1, hVar) : d(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTQ()) {
            return IsoChronology.fHk;
        }
        if (gVar == f.bTR()) {
            return ChronoUnit.YEARS;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTS() || gVar == f.bTP() || gVar == f.bTT()) ? null : super.query(gVar);
    }

    public a adjustInto(a aVar) {
        if (e.B(aVar).equals(IsoChronology.fHk)) {
            return aVar.b(ChronoField.YEAR, (long) this.year);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public long a(a aVar, h hVar) {
        Year r = r(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, r);
        }
        long j = ((long) r.year) - ((long) this.year);
        int i = AnonymousClass2.fFZ[((ChronoUnit) hVar).ordinal()];
        if (i != 1) {
            if (i == 2) {
                j /= 10;
            } else if (i == 3) {
                return j / 100;
            } else {
                if (i == 4) {
                    return j / 1000;
                }
                if (i == 5) {
                    return r.getLong(ChronoField.ERA) - getLong(ChronoField.ERA);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
            }
        }
        return j;
    }

    /* renamed from: a */
    public int compareTo(Year year) {
        return this.year - year.year;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Year)) {
            return false;
        }
        if (this.year != ((Year) obj).year) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.year;
    }

    public String toString() {
        return Integer.toString(this.year);
    }

    private Object writeReplace() {
        return new Ser((byte) 67, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
    }

    static Year j(DataInput dataInput) {
        return nn(dataInput.readInt());
    }
}
