package org.threeten.bp.zone;

import com.iqoption.dto.ChartTimeInterval;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.IsoChronology;

public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final int adjustDays;
    private final byte dom;
    private final DayOfWeek dow;
    private final Month month;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final ZoneOffset standardOffset;
    private final LocalTime time;
    private final TimeDefinition timeDefinition;

    /* renamed from: org.threeten.bp.zone.ZoneOffsetTransitionRule$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fJv = new int[TimeDefinition.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.values();
            r0 = r0.length;
            r0 = new int[r0];
            fJv = r0;
            r0 = fJv;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fJv;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.zone.ZoneOffsetTransitionRule$AnonymousClass1.<clinit>():void");
        }
    }

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime createDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            int i = AnonymousClass1.fJv[ordinal()];
            if (i == 1) {
                return localDateTime.dH((long) (zoneOffset2.getTotalSeconds() - ZoneOffset.fGt.getTotalSeconds()));
            }
            if (i != 2) {
                return localDateTime;
            }
            return localDateTime.dH((long) (zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
        }
    }

    ZoneOffsetTransitionRule(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, int i2, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.month = month;
        this.dom = (byte) i;
        this.dow = dayOfWeek;
        this.time = localTime;
        this.adjustDays = i2;
        this.timeDefinition = timeDefinition;
        this.standardOffset = zoneOffset;
        this.offsetBefore = zoneOffset2;
        this.offsetAfter = zoneOffset3;
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        int toSecondOfDay = this.time.toSecondOfDay() + (this.adjustDays * ChartTimeInterval.CANDLE_1D);
        int totalSeconds = this.standardOffset.getTotalSeconds();
        int totalSeconds2 = this.offsetBefore.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.offsetAfter.getTotalSeconds() - totalSeconds;
        int hour = (toSecondOfDay % ChartTimeInterval.CANDLE_1H != 0 || toSecondOfDay > ChartTimeInterval.CANDLE_1D) ? 31 : toSecondOfDay == ChartTimeInterval.CANDLE_1D ? 24 : this.time.getHour();
        int i = totalSeconds % ChartTimeInterval.CANDLE_15m == 0 ? (totalSeconds / ChartTimeInterval.CANDLE_15m) + 128 : 255;
        if (totalSeconds2 == 0 || totalSeconds2 == ChartTimeInterval.CANDLE_30m || totalSeconds2 == ChartTimeInterval.CANDLE_1H) {
            totalSeconds2 /= ChartTimeInterval.CANDLE_30m;
        } else {
            totalSeconds2 = 3;
        }
        if (totalSeconds3 == 0 || totalSeconds3 == ChartTimeInterval.CANDLE_30m || totalSeconds3 == ChartTimeInterval.CANDLE_1H) {
            totalSeconds3 /= ChartTimeInterval.CANDLE_30m;
        } else {
            totalSeconds3 = 3;
        }
        DayOfWeek dayOfWeek = this.dow;
        dataOutput.writeInt((((((((this.month.getValue() << 28) + ((this.dom + 32) << 22)) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19)) + (hour << 14)) + (this.timeDefinition.ordinal() << 12)) + (i << 4)) + (totalSeconds2 << 2)) + totalSeconds3);
        if (hour == 31) {
            dataOutput.writeInt(toSecondOfDay);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (totalSeconds2 == 3) {
            dataOutput.writeInt(this.offsetBefore.getTotalSeconds());
        }
        if (totalSeconds3 == 3) {
            dataOutput.writeInt(this.offsetAfter.getTotalSeconds());
        }
    }

    static ZoneOffsetTransitionRule v(DataInput dataInput) {
        DayOfWeek dayOfWeek;
        int readInt = dataInput.readInt();
        Month of = Month.of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        if (i2 == 0) {
            dayOfWeek = null;
        } else {
            dayOfWeek = DayOfWeek.of(i2);
        }
        DayOfWeek dayOfWeek2 = dayOfWeek;
        i2 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i3 = (readInt & 4080) >>> 4;
        int i4 = (readInt & 12) >>> 2;
        readInt &= 3;
        i2 = i2 == 31 ? dataInput.readInt() : i2 * ChartTimeInterval.CANDLE_1H;
        ZoneOffset nq = ZoneOffset.nq(i3 == 255 ? dataInput.readInt() : (i3 - 128) * ChartTimeInterval.CANDLE_15m);
        ZoneOffset nq2 = ZoneOffset.nq(i4 == 3 ? dataInput.readInt() : nq.getTotalSeconds() + (i4 * ChartTimeInterval.CANDLE_30m));
        ZoneOffset nq3 = ZoneOffset.nq(readInt == 3 ? dataInput.readInt() : nq.getTotalSeconds() + (readInt * ChartTimeInterval.CANDLE_30m));
        if (i >= -28 && i <= 31 && i != 0) {
            return new ZoneOffsetTransitionRule(of, i, dayOfWeek2, LocalTime.dJ((long) d.floorMod(i2, (int) ChartTimeInterval.CANDLE_1D)), d.floorDiv(i2, (int) ChartTimeInterval.CANDLE_1D), timeDefinition, nq, nq2, nq3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    public ZoneOffsetTransition nN(int i) {
        LocalDate a;
        byte b = this.dom;
        DayOfWeek dayOfWeek;
        if (b < (byte) 0) {
            Month month = this.month;
            a = LocalDate.a(i, month, (month.length(IsoChronology.fHk.isLeapYear((long) i)) + 1) + this.dom);
            dayOfWeek = this.dow;
            if (dayOfWeek != null) {
                a = a.d(org.threeten.bp.temporal.d.b(dayOfWeek));
            }
        } else {
            a = LocalDate.a(i, this.month, b);
            dayOfWeek = this.dow;
            if (dayOfWeek != null) {
                a = a.d(org.threeten.bp.temporal.d.a(dayOfWeek));
            }
        }
        return new ZoneOffsetTransition(this.timeDefinition.createDateTime(LocalDateTime.a(a.dB((long) this.adjustDays), this.time), this.standardOffset, this.offsetBefore), this.offsetBefore, this.offsetAfter);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        if (!(this.month == zoneOffsetTransitionRule.month && this.dom == zoneOffsetTransitionRule.dom && this.dow == zoneOffsetTransitionRule.dow && this.timeDefinition == zoneOffsetTransitionRule.timeDefinition && this.adjustDays == zoneOffsetTransitionRule.adjustDays && this.time.equals(zoneOffsetTransitionRule.time) && this.standardOffset.equals(zoneOffsetTransitionRule.standardOffset) && this.offsetBefore.equals(zoneOffsetTransitionRule.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransitionRule.offsetAfter))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int toSecondOfDay = (((this.time.toSecondOfDay() + this.adjustDays) << 15) + (this.month.ordinal() << 11)) + ((this.dom + 32) << 5);
        DayOfWeek dayOfWeek = this.dow;
        return ((((toSecondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionRule[");
        stringBuilder.append(this.offsetBefore.compareTo(this.offsetAfter) > 0 ? "Gap " : "Overlap ");
        stringBuilder.append(this.offsetBefore);
        stringBuilder.append(" to ");
        stringBuilder.append(this.offsetAfter);
        stringBuilder.append(", ");
        DayOfWeek dayOfWeek = this.dow;
        if (dayOfWeek != null) {
            byte b = this.dom;
            if (b == (byte) -1) {
                stringBuilder.append(dayOfWeek.name());
                stringBuilder.append(" on or before last day of ");
                stringBuilder.append(this.month.name());
            } else if (b < (byte) 0) {
                stringBuilder.append(dayOfWeek.name());
                stringBuilder.append(" on or before last day minus ");
                stringBuilder.append((-this.dom) - 1);
                stringBuilder.append(" of ");
                stringBuilder.append(this.month.name());
            } else {
                stringBuilder.append(dayOfWeek.name());
                stringBuilder.append(" on or after ");
                stringBuilder.append(this.month.name());
                stringBuilder.append(' ');
                stringBuilder.append(this.dom);
            }
        } else {
            stringBuilder.append(this.month.name());
            stringBuilder.append(' ');
            stringBuilder.append(this.dom);
        }
        stringBuilder.append(" at ");
        if (this.adjustDays == 0) {
            stringBuilder.append(this.time);
        } else {
            long toSecondOfDay = (long) ((this.time.toSecondOfDay() / 60) + ((this.adjustDays * 24) * 60));
            a(stringBuilder, d.floorDiv(toSecondOfDay, 60));
            stringBuilder.append(':');
            a(stringBuilder, (long) d.k(toSecondOfDay, 60));
        }
        stringBuilder.append(" ");
        stringBuilder.append(this.timeDefinition);
        stringBuilder.append(", standard offset ");
        stringBuilder.append(this.standardOffset);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder, long j) {
        if (j < 10) {
            stringBuilder.append(0);
        }
        stringBuilder.append(j);
    }
}
