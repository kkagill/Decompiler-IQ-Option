package org.threeten.bp;

import java.io.Serializable;

public abstract class Clock {

    static final class SystemClock extends Clock implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId zone;

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }

        public ZoneId bSJ() {
            return this.zone;
        }

        public long millis() {
            return System.currentTimeMillis();
        }

        public Instant bSK() {
            return Instant.dt(millis());
        }

        public boolean equals(Object obj) {
            return obj instanceof SystemClock ? this.zone.equals(((SystemClock) obj).zone) : false;
        }

        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SystemClock[");
            stringBuilder.append(this.zone);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public abstract ZoneId bSJ();

    public abstract Instant bSK();

    public static Clock bSI() {
        return new SystemClock(ZoneId.bSY());
    }

    protected Clock() {
    }

    public long millis() {
        return bSK().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
