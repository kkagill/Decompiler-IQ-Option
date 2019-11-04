package org.threeten.bp.temporal;

import org.threeten.bp.Duration;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.b;
import org.threeten.bp.chrono.d;

public enum ChronoUnit implements h {
    NANOS("Nanos", Duration.ds(1)),
    MICROS("Micros", Duration.ds(1000)),
    MILLIS("Millis", Duration.ds(1000000)),
    SECONDS("Seconds", Duration.dr(1)),
    MINUTES("Minutes", Duration.dr(60)),
    HOURS("Hours", Duration.dr(3600)),
    HALF_DAYS("HalfDays", Duration.dr(43200)),
    DAYS("Days", Duration.dr(86400)),
    WEEKS("Weeks", Duration.dr(604800)),
    MONTHS("Months", Duration.dr(2629746)),
    YEARS("Years", Duration.dr(31556952)),
    DECADES("Decades", Duration.dr(315569520)),
    CENTURIES("Centuries", Duration.dr(3155695200L)),
    MILLENNIA("Millennia", Duration.dr(31556952000L)),
    ERAS("Eras", Duration.dr(31556952000000000L)),
    FOREVER("Forever", Duration.B(Long.MAX_VALUE, 999999999));
    
    private final Duration duration;
    private final String name;

    private ChronoUnit(String str, Duration duration) {
        this.name = str;
        this.duration = duration;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    public boolean isSupportedBy(a aVar) {
        if (this == FOREVER) {
            return false;
        }
        if (aVar instanceof a) {
            return isDateBased();
        }
        if ((aVar instanceof b) || (aVar instanceof d)) {
            return true;
        }
        try {
            aVar.d(1, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                aVar.d(-1, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public <R extends a> R addTo(R r, long j) {
        return r.d(j, this);
    }

    public long between(a aVar, a aVar2) {
        return aVar.a(aVar2, this);
    }

    public String toString() {
        return this.name;
    }
}
