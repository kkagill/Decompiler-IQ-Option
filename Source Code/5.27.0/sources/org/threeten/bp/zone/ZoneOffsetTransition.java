package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

public final class ZoneOffsetTransition implements Serializable, Comparable<ZoneOffsetTransition> {
    private static final long serialVersionUID = -6946044323557704546L;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final LocalDateTime transition;

    ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = localDateTime;
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    ZoneOffsetTransition(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = LocalDateTime.a(j, 0, zoneOffset);
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        Ser.a(toEpochSecond(), dataOutput);
        Ser.a(this.offsetBefore, dataOutput);
        Ser.a(this.offsetAfter, dataOutput);
    }

    static ZoneOffsetTransition u(DataInput dataInput) {
        long s = Ser.s(dataInput);
        ZoneOffset r = Ser.r(dataInput);
        ZoneOffset r2 = Ser.r(dataInput);
        if (!r.equals(r2)) {
            return new ZoneOffsetTransition(s, r, r2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    public Instant bTX() {
        return this.transition.f(this.offsetBefore);
    }

    public long toEpochSecond() {
        return this.transition.g(this.offsetBefore);
    }

    public LocalDateTime bTY() {
        return this.transition;
    }

    public LocalDateTime bTZ() {
        return this.transition.dH((long) bUc());
    }

    public ZoneOffset bUa() {
        return this.offsetBefore;
    }

    public ZoneOffset bUb() {
        return this.offsetAfter;
    }

    public Duration getDuration() {
        return Duration.dr((long) bUc());
    }

    private int bUc() {
        return bUb().getTotalSeconds() - bUa().getTotalSeconds();
    }

    public boolean isGap() {
        return bUb().getTotalSeconds() > bUa().getTotalSeconds();
    }

    /* Access modifiers changed, original: 0000 */
    public List<ZoneOffset> bUd() {
        if (isGap()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{bUa(), bUb()});
    }

    /* renamed from: a */
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        return bTX().compareTo(zoneOffsetTransition.bTX());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransition)) {
            return false;
        }
        ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
        if (!(this.transition.equals(zoneOffsetTransition.transition) && this.offsetBefore.equals(zoneOffsetTransition.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransition.offsetAfter))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transition[");
        stringBuilder.append(isGap() ? "Gap" : "Overlap");
        stringBuilder.append(" at ");
        stringBuilder.append(this.transition);
        stringBuilder.append(this.offsetBefore);
        stringBuilder.append(" to ");
        stringBuilder.append(this.offsetAfter);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
