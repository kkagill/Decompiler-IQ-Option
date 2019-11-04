package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.threeten.bp.a.d;

public final class Duration implements Serializable, Comparable<Duration> {
    public static final Duration fFS = new Duration(0, 0);
    private static final BigInteger fFT = BigInteger.valueOf(1000000000);
    private static final Pattern fFU = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;

    public static Duration dr(long j) {
        return f(j, 0);
    }

    public static Duration B(long j, long j2) {
        return f(d.F(j, d.floorDiv(j2, 1000000000)), d.k(j2, 1000000000));
    }

    public static Duration ds(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return f(j2, i);
    }

    private static Duration f(long j, int i) {
        if ((((long) i) | j) == 0) {
            return fFS;
        }
        return new Duration(j, i);
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public long getSeconds() {
        return this.seconds;
    }

    /* renamed from: a */
    public int compareTo(Duration duration) {
        int E = d.E(this.seconds, duration.seconds);
        if (E != 0) {
            return E;
        }
        return this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (!(this.seconds == duration.seconds && this.nanos == duration.nanos)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public String toString() {
        if (this == fFS) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("PT");
        if (j2 != 0) {
            stringBuilder.append(j2);
            stringBuilder.append('H');
        }
        if (i != 0) {
            stringBuilder.append(i);
            stringBuilder.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && stringBuilder.length() > 2) {
            return stringBuilder.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            stringBuilder.append(i2);
        } else if (i2 == -1) {
            stringBuilder.append("-0");
        } else {
            stringBuilder.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = stringBuilder.length();
            if (i2 < 0) {
                stringBuilder.append(2000000000 - this.nanos);
            } else {
                stringBuilder.append(this.nanos + 1000000000);
            }
            while (stringBuilder.charAt(stringBuilder.length() - 1) == '0') {
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            stringBuilder.setCharAt(length, '.');
        }
        stringBuilder.append('S');
        return stringBuilder.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    static Duration a(DataInput dataInput) {
        return B(dataInput.readLong(), (long) dataInput.readInt());
    }
}
