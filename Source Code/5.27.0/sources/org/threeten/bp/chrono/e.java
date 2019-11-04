package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

/* compiled from: Chronology */
public abstract class e implements Comparable<e> {
    public static final g<e> FROM = new g<e>() {
        /* renamed from: F */
        public e b(b bVar) {
            return e.B(bVar);
        }
    };
    private static final ConcurrentHashMap<String, e> fGA = new ConcurrentHashMap();
    private static final Method fGB;
    private static final ConcurrentHashMap<String, e> fGz = new ConcurrentHashMap();

    public abstract a C(b bVar);

    public abstract String getCalendarType();

    public abstract String getId();

    public abstract boolean isLeapYear(long j);

    public abstract f ns(int i);

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
            method = null;
        }
        fGB = method;
    }

    public static e B(b bVar) {
        d.requireNonNull(bVar, "temporal");
        e eVar = (e) bVar.query(f.bTQ());
        return eVar != null ? eVar : IsoChronology.fHk;
    }

    public static e nK(String str) {
        init();
        e eVar = (e) fGz.get(str);
        if (eVar != null) {
            return eVar;
        }
        eVar = (e) fGA.get(str);
        if (eVar != null) {
            return eVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown chronology: ");
        stringBuilder.append(str);
        throw new DateTimeException(stringBuilder.toString());
    }

    private static void init() {
        if (fGz.isEmpty()) {
            a(IsoChronology.fHk);
            a(ThaiBuddhistChronology.fHz);
            a(MinguoChronology.fHy);
            a(JapaneseChronology.fHm);
            a(HijrahChronology.fGC);
            fGz.putIfAbsent("Hijrah", HijrahChronology.fGC);
            fGA.putIfAbsent("islamic", HijrahChronology.fGC);
            Iterator it = ServiceLoader.load(e.class, e.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                fGz.putIfAbsent(eVar.getId(), eVar);
                String calendarType = eVar.getCalendarType();
                if (calendarType != null) {
                    fGA.putIfAbsent(calendarType, eVar);
                }
            }
        }
    }

    private static void a(e eVar) {
        fGz.putIfAbsent(eVar.getId(), eVar);
        String calendarType = eVar.getCalendarType();
        if (calendarType != null) {
            fGA.putIfAbsent(calendarType, eVar);
        }
    }

    protected e() {
    }

    /* Access modifiers changed, original: 0000 */
    public <D extends a> D a(a aVar) {
        a aVar2 = (a) aVar;
        if (equals(aVar2.bSR())) {
            return aVar2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chrono mismatch, expected: ");
        stringBuilder.append(getId());
        stringBuilder.append(", actual: ");
        stringBuilder.append(aVar2.bSR().getId());
        throw new ClassCastException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public <D extends a> ChronoLocalDateTimeImpl<D> b(a aVar) {
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) aVar;
        if (equals(chronoLocalDateTimeImpl.bSU().bSR())) {
            return chronoLocalDateTimeImpl;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chrono mismatch, required: ");
        stringBuilder.append(getId());
        stringBuilder.append(", supplied: ");
        stringBuilder.append(chronoLocalDateTimeImpl.bSU().bSR().getId());
        throw new ClassCastException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public <D extends a> ChronoZonedDateTimeImpl<D> c(a aVar) {
        ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) aVar;
        if (equals(chronoZonedDateTimeImpl.bSU().bSR())) {
            return chronoZonedDateTimeImpl;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chrono mismatch, required: ");
        stringBuilder.append(getId());
        stringBuilder.append(", supplied: ");
        stringBuilder.append(chronoZonedDateTimeImpl.bSU().bSR().getId());
        throw new ClassCastException(stringBuilder.toString());
    }

    public b<?> D(b bVar) {
        Object bVar2;
        try {
            bVar2 = C(bVar2).b(LocalTime.i(bVar2));
            return bVar2;
        } catch (DateTimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            stringBuilder.append(bVar2.getClass());
            throw new DateTimeException(stringBuilder.toString(), e);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:6:?, code skipped:
            r5 = org.threeten.bp.chrono.ChronoZonedDateTimeImpl.a(b(D(r5)), r0, null);
     */
    /* JADX WARNING: Missing block: B:7:0x001a, code skipped:
            return r5;
     */
    public org.threeten.bp.chrono.d<?> E(org.threeten.bp.temporal.b r5) {
        /*
        r4 = this;
        r0 = org.threeten.bp.ZoneId.v(r5);	 Catch:{ DateTimeException -> 0x001b }
        r1 = org.threeten.bp.Instant.c(r5);	 Catch:{ DateTimeException -> 0x000d }
        r5 = r4.d(r1, r0);	 Catch:{ DateTimeException -> 0x000d }
        return r5;
    L_0x000d:
        r1 = r4.D(r5);	 Catch:{ DateTimeException -> 0x001b }
        r1 = r4.b(r1);	 Catch:{ DateTimeException -> 0x001b }
        r2 = 0;
        r5 = org.threeten.bp.chrono.ChronoZonedDateTimeImpl.a(r1, r0, r2);	 Catch:{ DateTimeException -> 0x001b }
        return r5;
    L_0x001b:
        r0 = move-exception;
        r1 = new org.threeten.bp.DateTimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unable to obtain ChronoZonedDateTime from TemporalAccessor: ";
        r2.append(r3);
        r5 = r5.getClass();
        r2.append(r5);
        r5 = r2.toString();
        r1.<init>(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.e.E(org.threeten.bp.temporal.b):org.threeten.bp.chrono.d");
    }

    public d<?> d(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.a(this, instant, zoneId);
    }

    /* renamed from: b */
    public int compareTo(e eVar) {
        return getId().compareTo(eVar.getId());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        if (compareTo((e) obj) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new Ser((byte) 11, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(getId());
    }

    static e o(DataInput dataInput) {
        return nK(dataInput.readUTF());
    }
}
