package org.threeten.bp.temporal;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.e;

/* compiled from: TemporalQueries */
public final class f {
    static final g<ZoneId> fJh = new g<ZoneId>() {
        /* renamed from: w */
        public ZoneId b(b bVar) {
            return (ZoneId) bVar.query(this);
        }
    };
    static final g<e> fJi = new g<e>() {
        /* renamed from: F */
        public e b(b bVar) {
            return (e) bVar.query(this);
        }
    };
    static final g<h> fJj = new g<h>() {
        /* renamed from: Q */
        public h b(b bVar) {
            return (h) bVar.query(this);
        }
    };
    static final g<ZoneId> fJk = new g<ZoneId>() {
        /* renamed from: w */
        public ZoneId b(b bVar) {
            ZoneId zoneId = (ZoneId) bVar.query(f.fJh);
            return zoneId != null ? zoneId : (ZoneId) bVar.query(f.fJl);
        }
    };
    static final g<ZoneOffset> fJl = new g<ZoneOffset>() {
        /* renamed from: y */
        public ZoneOffset b(b bVar) {
            return bVar.isSupported(ChronoField.OFFSET_SECONDS) ? ZoneOffset.nq(bVar.get(ChronoField.OFFSET_SECONDS)) : null;
        }
    };
    static final g<LocalDate> fJm = new g<LocalDate>() {
        /* renamed from: f */
        public LocalDate b(b bVar) {
            return bVar.isSupported(ChronoField.EPOCH_DAY) ? LocalDate.dx(bVar.getLong(ChronoField.EPOCH_DAY)) : null;
        }
    };
    static final g<LocalTime> fJn = new g<LocalTime>() {
        /* renamed from: j */
        public LocalTime b(b bVar) {
            return bVar.isSupported(ChronoField.NANO_OF_DAY) ? LocalTime.dK(bVar.getLong(ChronoField.NANO_OF_DAY)) : null;
        }
    };

    public static final g<ZoneId> bTP() {
        return fJh;
    }

    public static final g<e> bTQ() {
        return fJi;
    }

    public static final g<h> bTR() {
        return fJj;
    }

    public static final g<ZoneId> bTS() {
        return fJk;
    }

    public static final g<ZoneOffset> bTT() {
        return fJl;
    }

    public static final g<LocalDate> bTU() {
        return fJm;
    }

    public static final g<LocalTime> bTV() {
        return fJn;
    }
}
