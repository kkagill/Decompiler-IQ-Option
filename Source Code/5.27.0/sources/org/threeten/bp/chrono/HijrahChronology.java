package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class HijrahChronology extends e implements Serializable {
    public static final HijrahChronology fGC = new HijrahChronology();
    private static final HashMap<String, String[]> fGD = new HashMap();
    private static final HashMap<String, String[]> fGE = new HashMap();
    private static final HashMap<String, String[]> fGF = new HashMap();
    private static final long serialVersionUID = 3127340209035924785L;

    public String getCalendarType() {
        return "islamic-umalqura";
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    static {
        String str = "en";
        fGD.put(str, new String[]{"BH", "HE"});
        fGE.put(str, new String[]{"B.H.", "H.E."});
        fGF.put(str, new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private HijrahChronology() {
    }

    private Object readResolve() {
        return fGC;
    }

    public HijrahDate L(int i, int i2, int i3) {
        return HijrahDate.M(i, i2, i3);
    }

    /* renamed from: G */
    public HijrahDate C(b bVar) {
        if (bVar instanceof HijrahDate) {
            return (HijrahDate) bVar;
        }
        return HijrahDate.ea(bVar.getLong(ChronoField.EPOCH_DAY));
    }

    public b<HijrahDate> D(b bVar) {
        return super.D(bVar);
    }

    public d<HijrahDate> E(b bVar) {
        return super.E(bVar);
    }

    public d<HijrahDate> d(Instant instant, ZoneId zoneId) {
        return super.d(instant, zoneId);
    }

    public boolean isLeapYear(long j) {
        return HijrahDate.isLeapYear(j);
    }

    /* renamed from: nt */
    public HijrahEra ns(int i) {
        if (i == 0) {
            return HijrahEra.BEFORE_AH;
        }
        if (i == 1) {
            return HijrahEra.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    public ValueRange a(ChronoField chronoField) {
        return chronoField.range();
    }
}
