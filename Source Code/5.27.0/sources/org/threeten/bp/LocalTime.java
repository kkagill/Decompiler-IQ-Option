package org.threeten.bp;

import com.iqoption.dto.ChartTimeInterval;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a.c;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class LocalTime extends c implements Serializable, Comparable<LocalTime>, a, org.threeten.bp.temporal.c {
    public static final g<LocalTime> FROM = new g<LocalTime>() {
        /* renamed from: j */
        public LocalTime b(b bVar) {
            return LocalTime.i(bVar);
        }
    };
    public static final LocalTime fGe;
    public static final LocalTime fGf = new LocalTime(23, 59, 59, 999999999);
    public static final LocalTime fGg;
    public static final LocalTime fGh;
    private static final LocalTime[] fGi = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = fGi;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                fGg = localTimeArr[0];
                fGh = localTimeArr[12];
                fGe = localTimeArr[0];
                return;
            }
        }
    }

    public static LocalTime n(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.checkValidValue((long) i);
        ChronoField.MINUTE_OF_HOUR.checkValidValue((long) i2);
        ChronoField.SECOND_OF_MINUTE.checkValidValue((long) i3);
        ChronoField.NANO_OF_SECOND.checkValidValue((long) i4);
        return o(i, i2, i3, i4);
    }

    public static LocalTime dJ(long j) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600);
        j -= (long) (i * ChartTimeInterval.CANDLE_1H);
        int i2 = (int) (j / 60);
        return o(i, i2, (int) (j - ((long) (i2 * 60))), 0);
    }

    static LocalTime h(long j, int i) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        ChronoField.NANO_OF_SECOND.checkValidValue((long) i);
        int i2 = (int) (j / 3600);
        j -= (long) (i2 * ChartTimeInterval.CANDLE_1H);
        int i3 = (int) (j / 60);
        return o(i2, i3, (int) (j - ((long) (i3 * 60))), i);
    }

    public static LocalTime dK(long j) {
        ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600000000000L);
        j -= ((long) i) * 3600000000000L;
        int i2 = (int) (j / 60000000000L);
        j -= ((long) i2) * 60000000000L;
        int i3 = (int) (j / 1000000000);
        return o(i, i2, i3, (int) (j - (((long) i3) * 1000000000)));
    }

    public static LocalTime i(b bVar) {
        LocalTime localTime = (LocalTime) bVar.query(f.bTV());
        if (localTime != null) {
            return localTime;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to obtain LocalTime from TemporalAccessor: ");
        stringBuilder.append(bVar);
        stringBuilder.append(", type ");
        stringBuilder.append(bVar.getClass().getName());
        throw new DateTimeException(stringBuilder.toString());
    }

    private static LocalTime o(int i, int i2, int i3, int i4) {
        if (((i2 | i3) | i4) == 0) {
            return fGi[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    public boolean isSupported(e eVar) {
        if (eVar instanceof ChronoField) {
            return eVar.isTimeBased();
        }
        boolean z = eVar != null && eVar.isSupportedBy(this);
        return z;
    }

    public ValueRange range(e eVar) {
        return super.range(eVar);
    }

    public int get(e eVar) {
        if (eVar instanceof ChronoField) {
            return a(eVar);
        }
        return super.get(eVar);
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        if (eVar == ChronoField.NANO_OF_DAY) {
            return toNanoOfDay();
        }
        if (eVar == ChronoField.MICRO_OF_DAY) {
            return toNanoOfDay() / 1000;
        }
        return (long) a(eVar);
    }

    private int a(e eVar) {
        String str = "Field too large for an int: ";
        StringBuilder stringBuilder;
        int i;
        switch ((ChronoField) eVar) {
            case NANO_OF_SECOND:
                return this.nano;
            case NANO_OF_DAY:
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(eVar);
                throw new DateTimeException(stringBuilder.toString());
            case MICRO_OF_SECOND:
                return this.nano / 1000;
            case MICRO_OF_DAY:
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(eVar);
                throw new DateTimeException(stringBuilder.toString());
            case MILLI_OF_SECOND:
                return this.nano / 1000000;
            case MILLI_OF_DAY:
                return (int) (toNanoOfDay() / 1000000);
            case SECOND_OF_MINUTE:
                return this.second;
            case SECOND_OF_DAY:
                return toSecondOfDay();
            case MINUTE_OF_HOUR:
                return this.minute;
            case MINUTE_OF_DAY:
                return (this.hour * 60) + this.minute;
            case HOUR_OF_AMPM:
                return this.hour % 12;
            case CLOCK_HOUR_OF_AMPM:
                i = this.hour % 12;
                if (i % 12 == 0) {
                    i = 12;
                }
                return i;
            case HOUR_OF_DAY:
                return this.hour;
            case CLOCK_HOUR_OF_DAY:
                i = this.hour;
                if (i == 0) {
                    i = 24;
                }
                return i;
            case AMPM_OF_DAY:
                return this.hour / 12;
            default:
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Unsupported field: ");
                stringBuilder2.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder2.toString());
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getSecond() {
        return this.second;
    }

    public int getNano() {
        return this.nano;
    }

    /* renamed from: g */
    public LocalTime b(org.threeten.bp.temporal.c cVar) {
        if (cVar instanceof LocalTime) {
            return (LocalTime) cVar;
        }
        return (LocalTime) cVar.adjustInto(this);
    }

    /* renamed from: g */
    public LocalTime b(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (LocalTime) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        switch (chronoField) {
            case NANO_OF_SECOND:
                return nm((int) j);
            case NANO_OF_DAY:
                return dK(j);
            case MICRO_OF_SECOND:
                return nm(((int) j) * 1000);
            case MICRO_OF_DAY:
                return dK(j * 1000);
            case MILLI_OF_SECOND:
                return nm(((int) j) * 1000000);
            case MILLI_OF_DAY:
                return dK(j * 1000000);
            case SECOND_OF_MINUTE:
                return nl((int) j);
            case SECOND_OF_DAY:
                return dN(j - ((long) toSecondOfDay()));
            case MINUTE_OF_HOUR:
                return nk((int) j);
            case MINUTE_OF_DAY:
                return dM(j - ((long) ((this.hour * 60) + this.minute)));
            case HOUR_OF_AMPM:
                return dL(j - ((long) (this.hour % 12)));
            case CLOCK_HOUR_OF_AMPM:
                if (j == 12) {
                    j = 0;
                }
                return dL(j - ((long) (this.hour % 12)));
            case HOUR_OF_DAY:
                return nj((int) j);
            case CLOCK_HOUR_OF_DAY:
                if (j == 24) {
                    j = 0;
                }
                return nj((int) j);
            case AMPM_OF_DAY:
                return dL((j - ((long) (this.hour / 12))) * 12);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported field: ");
                stringBuilder.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    public LocalTime nj(int i) {
        if (this.hour == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue((long) i);
        return o(i, this.minute, this.second, this.nano);
    }

    public LocalTime nk(int i) {
        if (this.minute == i) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue((long) i);
        return o(this.hour, i, this.second, this.nano);
    }

    public LocalTime nl(int i) {
        if (this.second == i) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.checkValidValue((long) i);
        return o(this.hour, this.minute, i, this.nano);
    }

    public LocalTime nm(int i) {
        if (this.nano == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue((long) i);
        return o(this.hour, this.minute, this.second, i);
    }

    /* renamed from: m */
    public LocalTime d(long j, h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (LocalTime) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return dO(j);
            case MICROS:
                return dO((j % 86400000000L) * 1000);
            case MILLIS:
                return dO((j % 86400000) * 1000000);
            case SECONDS:
                return dN(j);
            case MINUTES:
                return dM(j);
            case HOURS:
                return dL(j);
            case HALF_DAYS:
                return dL((j % 2) * 12);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    public LocalTime dL(long j) {
        if (j == 0) {
            return this;
        }
        return o(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    public LocalTime dM(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        if (i == i2) {
            return this;
        }
        return o(i2 / 60, i2 % 60, this.second, this.nano);
    }

    public LocalTime dN(long j) {
        if (j == 0) {
            return this;
        }
        int i = ((this.hour * ChartTimeInterval.CANDLE_1H) + (this.minute * 60)) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + ChartTimeInterval.CANDLE_1D) % ChartTimeInterval.CANDLE_1D;
        if (i == i2) {
            return this;
        }
        return o(i2 / ChartTimeInterval.CANDLE_1H, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    public LocalTime dO(long j) {
        if (j == 0) {
            return this;
        }
        long toNanoOfDay = toNanoOfDay();
        j = (((j % 86400000000000L) + toNanoOfDay) + 86400000000000L) % 86400000000000L;
        if (toNanoOfDay == j) {
            return this;
        }
        return o((int) (j / 3600000000000L), (int) ((j / 60000000000L) % 60), (int) ((j / 1000000000) % 60), (int) (j % 1000000000));
    }

    /* renamed from: n */
    public LocalTime c(long j, h hVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, hVar).d(1, hVar) : d(-j, hVar);
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTR()) {
            return ChronoUnit.NANOS;
        }
        if (gVar == f.bTV()) {
            return this;
        }
        return (gVar == f.bTQ() || gVar == f.bTP() || gVar == f.bTS() || gVar == f.bTT() || gVar == f.bTU()) ? null : gVar.b(this);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.NANO_OF_DAY, toNanoOfDay());
    }

    public long a(a aVar, h hVar) {
        LocalTime i = i(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, i);
        }
        long toNanoOfDay = i.toNanoOfDay() - toNanoOfDay();
        switch ((ChronoUnit) hVar) {
            case NANOS:
                break;
            case MICROS:
                toNanoOfDay /= 1000;
                break;
            case MILLIS:
                return toNanoOfDay / 1000000;
            case SECONDS:
                return toNanoOfDay / 1000000000;
            case MINUTES:
                return toNanoOfDay / 60000000000L;
            case HOURS:
                return toNanoOfDay / 3600000000000L;
            case HALF_DAYS:
                return toNanoOfDay / 43200000000000L;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported unit: ");
                stringBuilder.append(hVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
        return toNanoOfDay;
    }

    public OffsetTime b(ZoneOffset zoneOffset) {
        return OffsetTime.a(this, zoneOffset);
    }

    public int toSecondOfDay() {
        return ((this.hour * ChartTimeInterval.CANDLE_1H) + (this.minute * 60)) + this.second;
    }

    public long toNanoOfDay() {
        return (((((long) this.hour) * 3600000000000L) + (((long) this.minute) * 60000000000L)) + (((long) this.second) * 1000000000)) + ((long) this.nano);
    }

    /* renamed from: c */
    public int compareTo(LocalTime localTime) {
        int bx = d.bx(this.hour, localTime.hour);
        if (bx != 0) {
            return bx;
        }
        bx = d.bx(this.minute, localTime.minute);
        if (bx != 0) {
            return bx;
        }
        bx = d.bx(this.second, localTime.second);
        return bx == 0 ? d.bx(this.nano, localTime.nano) : bx;
    }

    public boolean d(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean e(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        if (!(this.hour == localTime.hour && this.minute == localTime.minute && this.second == localTime.second && this.nano == localTime.nano)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long toNanoOfDay = toNanoOfDay();
        return (int) (toNanoOfDay ^ (toNanoOfDay >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(18);
        byte b = this.hour;
        byte b2 = this.minute;
        byte b3 = this.second;
        int i = this.nano;
        stringBuilder.append(b < (byte) 10 ? "0" : "");
        stringBuilder.append(b);
        String str = ":0";
        String str2 = ":";
        stringBuilder.append(b2 < (byte) 10 ? str : str2);
        stringBuilder.append(b2);
        if (b3 > (byte) 0 || i > 0) {
            if (b3 >= (byte) 10) {
                str = str2;
            }
            stringBuilder.append(str);
            stringBuilder.append(b3);
            if (i > 0) {
                stringBuilder.append('.');
                if (i % 1000000 == 0) {
                    stringBuilder.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    stringBuilder.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    stringBuilder.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return stringBuilder.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
        } else if (this.second != (byte) 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second ^ -1);
        } else if (this.minute == (byte) 0) {
            dataOutput.writeByte(this.hour ^ -1);
        } else {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute ^ -1);
        }
    }

    static LocalTime e(DataInput dataInput) {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        int i3 = 0;
        if (readByte < 0) {
            readByte ^= -1;
            i = 0;
            i2 = 0;
        } else {
            i2 = dataInput.readByte();
            if (i2 < 0) {
                i2 ^= -1;
            } else {
                byte readByte2 = dataInput.readByte();
                if (readByte2 < (byte) 0) {
                    i3 = readByte2 ^ -1;
                } else {
                    i = dataInput.readInt();
                    i3 = readByte2;
                }
            }
            i = 0;
        }
        return n(readByte, i2, i3, i);
    }
}
