package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class ThaiBuddhistChronology extends e implements Serializable {
    private static final HashMap<String, String[]> fGD = new HashMap();
    private static final HashMap<String, String[]> fGE = new HashMap();
    private static final HashMap<String, String[]> fGF = new HashMap();
    public static final ThaiBuddhistChronology fHz = new ThaiBuddhistChronology();
    private static final long serialVersionUID = 2775954514031616474L;

    /* renamed from: org.threeten.bp.chrono.ThaiBuddhistChronology$1 */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.ThaiBuddhistChronology$AnonymousClass1.<clinit>():void");
        }
    }

    public String getCalendarType() {
        return "buddhist";
    }

    public String getId() {
        return "ThaiBuddhist";
    }

    static {
        String str = "BE";
        String str2 = "BB";
        String str3 = "en";
        fGD.put(str3, new String[]{str2, str});
        String[] strArr = new String[]{str2, str};
        str2 = "th";
        fGD.put(str2, strArr);
        fGE.put(str3, new String[]{"B.B.", "B.E."});
        str = "ปีก่อนคริสต์กาลที่";
        fGE.put(str2, new String[]{"พ.ศ.", str});
        fGF.put(str3, new String[]{"Before Buddhist", "Budhhist Era"});
        fGF.put(str2, new String[]{"พุทธศักราช", str});
    }

    private ThaiBuddhistChronology() {
    }

    private Object readResolve() {
        return fHz;
    }

    public ThaiBuddhistDate T(int i, int i2, int i3) {
        return new ThaiBuddhistDate(LocalDate.G(i - 543, i2, i3));
    }

    /* renamed from: M */
    public ThaiBuddhistDate C(b bVar) {
        if (bVar instanceof ThaiBuddhistDate) {
            return (ThaiBuddhistDate) bVar;
        }
        return new ThaiBuddhistDate(LocalDate.e(bVar));
    }

    public b<ThaiBuddhistDate> D(b bVar) {
        return super.D(bVar);
    }

    public d<ThaiBuddhistDate> E(b bVar) {
        return super.E(bVar);
    }

    public d<ThaiBuddhistDate> d(Instant instant, ZoneId zoneId) {
        return super.d(instant, zoneId);
    }

    public boolean isLeapYear(long j) {
        return IsoChronology.fHk.isLeapYear(j - 543);
    }

    /* renamed from: nK */
    public ThaiBuddhistEra ns(int i) {
        return ThaiBuddhistEra.of(i);
    }

    public ValueRange a(ChronoField chronoField) {
        int i = AnonymousClass1.fFY[chronoField.ordinal()];
        ValueRange range;
        if (i == 1) {
            range = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.I(range.getMinimum() + 6516, range.getMaximum() + 6516);
        } else if (i == 2) {
            range = ChronoField.YEAR.range();
            return ValueRange.c(1, 1 + (-(range.getMinimum() + 543)), range.getMaximum() + 543);
        } else if (i != 3) {
            return chronoField.range();
        } else {
            range = ChronoField.YEAR.range();
            return ValueRange.I(range.getMinimum() + 543, range.getMaximum() + 543);
        }
    }
}
