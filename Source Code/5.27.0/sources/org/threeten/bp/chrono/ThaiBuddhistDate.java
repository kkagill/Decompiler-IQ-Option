package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.h;

public final class ThaiBuddhistDate extends ChronoDateImpl<ThaiBuddhistDate> implements Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    private final LocalDate isoDate;

    /* renamed from: org.threeten.bp.chrono.ThaiBuddhistDate$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoField.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFY = r0;
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = org.threeten.bp.temporal.ChronoField.ERA;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.ThaiBuddhistDate$AnonymousClass1.<clinit>():void");
        }
    }

    public /* bridge */ /* synthetic */ long a(a aVar, h hVar) {
        return super.a(aVar, hVar);
    }

    ThaiBuddhistDate(LocalDate localDate) {
        d.requireNonNull(localDate, "date");
        this.isoDate = localDate;
    }

    /* renamed from: bTs */
    public ThaiBuddhistChronology bSR() {
        return ThaiBuddhistChronology.fHz;
    }

    /* renamed from: bTt */
    public ThaiBuddhistEra bSO() {
        return (ThaiBuddhistEra) super.bSO();
    }

    public ValueRange range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (isSupported(eVar)) {
            ChronoField chronoField = (ChronoField) eVar;
            int i = AnonymousClass1.fFY[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.isoDate.range(eVar);
            }
            if (i != 4) {
                return bSR().a(chronoField);
            }
            ValueRange range = ChronoField.YEAR.range();
            return ValueRange.I(1, bTr() <= 0 ? (-(range.getMinimum() + 543)) + 1 : 543 + range.getMaximum());
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
        int i = AnonymousClass1.fFY[((ChronoField) eVar).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int bTr = bTr();
            if (bTr < 1) {
                bTr = 1 - bTr;
            }
            return (long) bTr;
        } else if (i == 5) {
            return bSM();
        } else {
            if (i == 6) {
                return (long) bTr();
            }
            if (i != 7) {
                return this.isoDate.getLong(eVar);
            }
            if (bTr() < 1) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    private long bSM() {
        return ((((long) bTr()) * 12) + ((long) this.isoDate.getMonthValue())) - 1;
    }

    private int bTr() {
        return this.isoDate.getYear() + 543;
    }

    /* renamed from: r */
    public ThaiBuddhistDate d(c cVar) {
        return (ThaiBuddhistDate) super.b(cVar);
    }

    /* JADX WARNING: Missing block: B:10:0x0022, code skipped:
            if (r1 != 7) goto L_0x0055;
     */
    /* renamed from: r */
    public org.threeten.bp.chrono.ThaiBuddhistDate d(org.threeten.bp.temporal.e r7, long r8) {
        /*
        r6 = this;
        r0 = r7 instanceof org.threeten.bp.temporal.ChronoField;
        if (r0 == 0) goto L_0x0095;
    L_0x0004:
        r0 = r7;
        r0 = (org.threeten.bp.temporal.ChronoField) r0;
        r1 = r6.getLong(r0);
        r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x0010;
    L_0x000f:
        return r6;
    L_0x0010:
        r1 = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.fFY;
        r2 = r0.ordinal();
        r1 = r1[r2];
        r2 = 7;
        r3 = 6;
        r4 = 4;
        if (r1 == r4) goto L_0x003a;
    L_0x001d:
        r5 = 5;
        if (r1 == r5) goto L_0x0025;
    L_0x0020:
        if (r1 == r3) goto L_0x003a;
    L_0x0022:
        if (r1 == r2) goto L_0x003a;
    L_0x0024:
        goto L_0x0055;
    L_0x0025:
        r7 = r6.bSR();
        r7 = r7.a(r0);
        r7.a(r8, r0);
        r0 = r6.bSM();
        r8 = r8 - r0;
        r7 = r6.dT(r8);
        return r7;
    L_0x003a:
        r1 = r6.bSR();
        r1 = r1.a(r0);
        r1 = r1.b(r8, r0);
        r5 = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.fFY;
        r0 = r0.ordinal();
        r0 = r5[r0];
        r5 = 1;
        if (r0 == r4) goto L_0x007f;
    L_0x0051:
        if (r0 == r3) goto L_0x0072;
    L_0x0053:
        if (r0 == r2) goto L_0x0060;
    L_0x0055:
        r0 = r6.isoDate;
        r7 = r0.d(r7, r8);
        r7 = r6.g(r7);
        return r7;
    L_0x0060:
        r7 = r6.isoDate;
        r8 = r6.bTr();
        r5 = r5 - r8;
        r5 = r5 + -543;
        r7 = r7.nf(r5);
        r7 = r6.g(r7);
        return r7;
    L_0x0072:
        r7 = r6.isoDate;
        r1 = r1 + -543;
        r7 = r7.nf(r1);
        r7 = r6.g(r7);
        return r7;
    L_0x007f:
        r7 = r6.isoDate;
        r8 = r6.bTr();
        if (r8 < r5) goto L_0x0088;
    L_0x0087:
        goto L_0x008a;
    L_0x0088:
        r1 = 1 - r1;
    L_0x008a:
        r1 = r1 + -543;
        r7 = r7.nf(r1);
        r7 = r6.g(r7);
        return r7;
    L_0x0095:
        r7 = r7.adjustInto(r6, r8);
        r7 = (org.threeten.bp.chrono.ThaiBuddhistDate) r7;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.ThaiBuddhistDate.d(org.threeten.bp.temporal.e, long):org.threeten.bp.chrono.ThaiBuddhistDate");
    }

    /* renamed from: I */
    public ThaiBuddhistDate h(long j, h hVar) {
        return (ThaiBuddhistDate) super.h(j, hVar);
    }

    /* renamed from: J */
    public ThaiBuddhistDate g(long j, h hVar) {
        return (ThaiBuddhistDate) super.c(j, hVar);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: em */
    public ThaiBuddhistDate dS(long j) {
        return g(this.isoDate.dy(j));
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: en */
    public ThaiBuddhistDate dT(long j) {
        return g(this.isoDate.dz(j));
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: eo */
    public ThaiBuddhistDate dU(long j) {
        return g(this.isoDate.dB(j));
    }

    private ThaiBuddhistDate g(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new ThaiBuddhistDate(localDate);
    }

    public final b<ThaiBuddhistDate> b(LocalTime localTime) {
        return super.b(localTime);
    }

    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThaiBuddhistDate)) {
            return false;
        }
        return this.isoDate.equals(((ThaiBuddhistDate) obj).isoDate);
    }

    public int hashCode() {
        return bSR().getId().hashCode() ^ this.isoDate.hashCode();
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    static a p(DataInput dataInput) {
        return ThaiBuddhistChronology.fHz.T(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }
}
