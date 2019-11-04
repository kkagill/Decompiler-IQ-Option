package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class MinguoChronology extends e implements Serializable {
    public static final MinguoChronology fHy = new MinguoChronology();
    private static final long serialVersionUID = 1039765215346859963L;

    /* renamed from: org.threeten.bp.chrono.MinguoChronology$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fFY = new int[ChronoField.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = org.threeten.bp.temporal.ChronoField.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFY = r0;
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fFY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.threeten.bp.temporal.ChronoField.YEAR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.MinguoChronology$AnonymousClass1.<clinit>():void");
        }
    }

    public String getCalendarType() {
        return "roc";
    }

    public String getId() {
        return "Minguo";
    }

    private MinguoChronology() {
    }

    private Object readResolve() {
        return fHy;
    }

    public MinguoDate S(int i, int i2, int i3) {
        return new MinguoDate(LocalDate.G(i + 1911, i2, i3));
    }

    /* renamed from: L */
    public MinguoDate C(b bVar) {
        if (bVar instanceof MinguoDate) {
            return (MinguoDate) bVar;
        }
        return new MinguoDate(LocalDate.e(bVar));
    }

    public b<MinguoDate> D(b bVar) {
        return super.D(bVar);
    }

    public d<MinguoDate> E(b bVar) {
        return super.E(bVar);
    }

    public d<MinguoDate> d(Instant instant, ZoneId zoneId) {
        return super.d(instant, zoneId);
    }

    public boolean isLeapYear(long j) {
        return IsoChronology.fHk.isLeapYear(j + 1911);
    }

    /* renamed from: nJ */
    public MinguoEra ns(int i) {
        return MinguoEra.of(i);
    }

    public ValueRange a(ChronoField chronoField) {
        int i = AnonymousClass1.fFY[chronoField.ordinal()];
        ValueRange range;
        if (i == 1) {
            range = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.I(range.getMinimum() - 22932, range.getMaximum() - 22932);
        } else if (i == 2) {
            range = ChronoField.YEAR.range();
            return ValueRange.c(1, range.getMaximum() - 1911, ((-range.getMinimum()) + 1) + 1911);
        } else if (i != 3) {
            return chronoField.range();
        } else {
            range = ChronoField.YEAR.range();
            return ValueRange.I(range.getMinimum() - 1911, range.getMaximum() - 1911);
        }
    }
}
