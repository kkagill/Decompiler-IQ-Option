package org.threeten.bp;

import com.iqoption.dto.ChartTimeInterval;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.zone.ZoneRules;

public final class ZoneOffset extends ZoneId implements Serializable, Comparable<ZoneOffset>, b, c {
    public static final g<ZoneOffset> FROM = new g<ZoneOffset>() {
        /* renamed from: y */
        public ZoneOffset b(b bVar) {
            return ZoneOffset.x(bVar);
        }
    };
    private static final ConcurrentMap<Integer, ZoneOffset> fGr = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap<String, ZoneOffset> fGs = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset fGt = nq(0);
    public static final ZoneOffset fGu = nq(-64800);
    public static final ZoneOffset fGv = nq(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient String id;
    private final int totalSeconds;

    private static int K(int i, int i2, int i3) {
        return ((i * ChartTimeInterval.CANDLE_1H) + (i2 * 60)) + i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    public static org.threeten.bp.ZoneOffset nI(java.lang.String r7) {
        /*
        r0 = "offsetId";
        org.threeten.bp.a.d.requireNonNull(r7, r0);
        r0 = fGs;
        r0 = r0.get(r7);
        r0 = (org.threeten.bp.ZoneOffset) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = r7.length();
        r1 = 2;
        r2 = 1;
        r3 = 0;
        if (r0 == r1) goto L_0x006d;
    L_0x0019:
        r1 = 3;
        if (r0 == r1) goto L_0x0089;
    L_0x001c:
        r4 = 5;
        if (r0 == r4) goto L_0x0064;
    L_0x001f:
        r5 = 6;
        r6 = 4;
        if (r0 == r5) goto L_0x005b;
    L_0x0023:
        r5 = 7;
        if (r0 == r5) goto L_0x004e;
    L_0x0026:
        r1 = 9;
        if (r0 != r1) goto L_0x0037;
    L_0x002a:
        r0 = a(r7, r2, r3);
        r1 = a(r7, r6, r2);
        r2 = a(r7, r5, r2);
        goto L_0x008f;
    L_0x0037:
        r0 = new org.threeten.bp.DateTimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid ID for ZoneOffset, invalid format: ";
        r1.append(r2);
        r1.append(r7);
        r7 = r1.toString();
        r0.<init>(r7);
        throw r0;
    L_0x004e:
        r0 = a(r7, r2, r3);
        r1 = a(r7, r1, r3);
        r2 = a(r7, r4, r3);
        goto L_0x008f;
    L_0x005b:
        r0 = a(r7, r2, r3);
        r1 = a(r7, r6, r2);
        goto L_0x008e;
    L_0x0064:
        r0 = a(r7, r2, r3);
        r1 = a(r7, r1, r3);
        goto L_0x008e;
    L_0x006d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r7.charAt(r3);
        r0.append(r1);
        r1 = "0";
        r0.append(r1);
        r7 = r7.charAt(r2);
        r0.append(r7);
        r7 = r0.toString();
    L_0x0089:
        r0 = a(r7, r2, r3);
        r1 = 0;
    L_0x008e:
        r2 = 0;
    L_0x008f:
        r3 = r7.charAt(r3);
        r4 = 43;
        r5 = 45;
        if (r3 == r4) goto L_0x00b3;
    L_0x0099:
        if (r3 != r5) goto L_0x009c;
    L_0x009b:
        goto L_0x00b3;
    L_0x009c:
        r0 = new org.threeten.bp.DateTimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: ";
        r1.append(r2);
        r1.append(r7);
        r7 = r1.toString();
        r0.<init>(r7);
        throw r0;
    L_0x00b3:
        if (r3 != r5) goto L_0x00bd;
    L_0x00b5:
        r7 = -r0;
        r0 = -r1;
        r1 = -r2;
        r7 = I(r7, r0, r1);
        return r7;
    L_0x00bd:
        r7 = I(r0, r1, r2);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.ZoneOffset.nI(java.lang.String):org.threeten.bp.ZoneOffset");
    }

    private static int a(CharSequence charSequence, int i, boolean z) {
        StringBuilder stringBuilder;
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - 48) * 10) + (charAt2 - 48);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid ID for ZoneOffset, non numeric characters found: ");
            stringBuilder.append(charSequence);
            throw new DateTimeException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid ID for ZoneOffset, colon not found when expected: ");
        stringBuilder.append(charSequence);
        throw new DateTimeException(stringBuilder.toString());
    }

    public static ZoneOffset I(int i, int i2, int i3) {
        J(i, i2, i3);
        return nq(K(i, i2, i3));
    }

    public static ZoneOffset x(b bVar) {
        ZoneOffset zoneOffset = (ZoneOffset) bVar.query(f.bTT());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to obtain ZoneOffset from TemporalAccessor: ");
        stringBuilder.append(bVar);
        stringBuilder.append(", type ");
        stringBuilder.append(bVar.getClass().getName());
        throw new DateTimeException(stringBuilder.toString());
    }

    private static void J(int i, int i2, int i3) {
        StringBuilder stringBuilder;
        if (i < -18 || i > 18) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Zone offset hours not in valid range: value ");
            stringBuilder.append(i);
            stringBuilder.append(" is not in the range -18 to 18");
            throw new DateTimeException(stringBuilder.toString());
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        String str = " is not in the range 0 to 59";
        if (Math.abs(i2) > 59) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Zone offset minutes not in valid range: abs(value) ");
            stringBuilder.append(Math.abs(i2));
            stringBuilder.append(str);
            throw new DateTimeException(stringBuilder.toString());
        } else if (Math.abs(i3) > 59) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Zone offset seconds not in valid range: abs(value) ");
            stringBuilder2.append(Math.abs(i3));
            stringBuilder2.append(str);
            throw new DateTimeException(stringBuilder2.toString());
        } else if (Math.abs(i) != 18) {
        } else {
            if (Math.abs(i2) > 0 || Math.abs(i3) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    public static ZoneOffset nq(int i) {
        if (Math.abs(i) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % ChartTimeInterval.CANDLE_15m != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ZoneOffset zoneOffset = (ZoneOffset) fGr.get(valueOf);
            if (zoneOffset == null) {
                fGr.putIfAbsent(valueOf, new ZoneOffset(i));
                zoneOffset = (ZoneOffset) fGr.get(valueOf);
                fGs.putIfAbsent(zoneOffset.getId(), zoneOffset);
            }
            return zoneOffset;
        }
    }

    private ZoneOffset(int i) {
        this.totalSeconds = i;
        this.id = nr(i);
    }

    private static String nr(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = abs / ChartTimeInterval.CANDLE_1H;
        int i3 = (abs / 60) % 60;
        stringBuilder.append(i < 0 ? "-" : "+");
        stringBuilder.append(i2 < 10 ? "0" : "");
        stringBuilder.append(i2);
        String str = ":0";
        String str2 = ":";
        stringBuilder.append(i3 < 10 ? str : str2);
        stringBuilder.append(i3);
        abs %= 60;
        if (abs != 0) {
            if (abs >= 10) {
                str = str2;
            }
            stringBuilder.append(str);
            stringBuilder.append(abs);
        }
        return stringBuilder.toString();
    }

    public int getTotalSeconds() {
        return this.totalSeconds;
    }

    public String getId() {
        return this.id;
    }

    public ZoneRules bSZ() {
        return ZoneRules.h(this);
    }

    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (eVar != ChronoField.OFFSET_SECONDS) {
                z = false;
            }
            return z;
        }
        if (eVar == null || !eVar.isSupportedBy(this)) {
            z = false;
        }
        return z;
    }

    public ValueRange range(e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return eVar.range();
        }
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public int get(e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(eVar instanceof ChronoField)) {
            return range(eVar).b(getLong(eVar), eVar);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public long getLong(e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return (long) this.totalSeconds;
        }
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new DateTimeException(stringBuilder.toString());
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTT() || gVar == f.bTS()) {
            return this;
        }
        return (gVar == f.bTU() || gVar == f.bTV() || gVar == f.bTR() || gVar == f.bTQ() || gVar == f.bTP()) ? null : gVar.b(this);
    }

    public a adjustInto(a aVar) {
        return aVar.b(ChronoField.OFFSET_SECONDS, (long) this.totalSeconds);
    }

    /* renamed from: d */
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.totalSeconds - this.totalSeconds;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        if (this.totalSeconds != ((ZoneOffset) obj).totalSeconds) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.totalSeconds;
    }

    public String toString() {
        return this.id;
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        writeExternal(dataOutput);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        int i = this.totalSeconds;
        int i2 = i % ChartTimeInterval.CANDLE_15m == 0 ? i / ChartTimeInterval.CANDLE_15m : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    static ZoneOffset l(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? nq(dataInput.readInt()) : nq(readByte * ChartTimeInterval.CANDLE_15m);
    }
}
