package org.threeten.bp.format;

import java.util.HashMap;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.a.c;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

/* compiled from: DateTimeBuilder */
final class a extends c implements Cloneable, b {
    org.threeten.bp.chrono.a date;
    final Map<e, Long> fHA = new HashMap();
    org.threeten.bp.chrono.e fHB;
    boolean fHC;
    Period fHD;
    LocalTime time;
    ZoneId zone;

    private Long b(e eVar) {
        return (Long) this.fHA.get(eVar);
    }

    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            if (r1.isSupported(r3) != false) goto L_0x0020;
     */
    public boolean isSupported(org.threeten.bp.temporal.e r3) {
        /*
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r2.fHA;
        r1 = r1.containsKey(r3);
        if (r1 != 0) goto L_0x0020;
    L_0x000c:
        r1 = r2.date;
        if (r1 == 0) goto L_0x0016;
    L_0x0010:
        r1 = r1.isSupported(r3);
        if (r1 != 0) goto L_0x0020;
    L_0x0016:
        r1 = r2.time;
        if (r1 == 0) goto L_0x0021;
    L_0x001a:
        r3 = r1.isSupported(r3);
        if (r3 == 0) goto L_0x0021;
    L_0x0020:
        r0 = 1;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.a.isSupported(org.threeten.bp.temporal.e):boolean");
    }

    public long getLong(e eVar) {
        d.requireNonNull(eVar, "field");
        Long b = b(eVar);
        if (b != null) {
            return b.longValue();
        }
        org.threeten.bp.chrono.a aVar = this.date;
        if (aVar != null && aVar.isSupported(eVar)) {
            return this.date.getLong(eVar);
        }
        LocalTime localTime = this.time;
        if (localTime != null && localTime.isSupported(eVar)) {
            return this.time.getLong(eVar);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field not found: ");
        stringBuilder.append(eVar);
        throw new DateTimeException(stringBuilder.toString());
    }

    public <R> R query(g<R> gVar) {
        if (gVar == f.bTP()) {
            return this.zone;
        }
        if (gVar == f.bTQ()) {
            return this.fHB;
        }
        R r = null;
        if (gVar == f.bTU()) {
            org.threeten.bp.chrono.a aVar = this.date;
            if (aVar != null) {
                r = LocalDate.e(aVar);
            }
            return r;
        } else if (gVar == f.bTV()) {
            return this.time;
        } else {
            if (gVar == f.bTS() || gVar == f.bTT()) {
                return gVar.b(this);
            }
            if (gVar == f.bTR()) {
                return null;
            }
            return gVar.b(this);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("DateTimeBuilder[");
        if (this.fHA.size() > 0) {
            stringBuilder.append("fields=");
            stringBuilder.append(this.fHA);
        }
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.fHB);
        stringBuilder.append(str);
        stringBuilder.append(this.zone);
        stringBuilder.append(str);
        stringBuilder.append(this.date);
        stringBuilder.append(str);
        stringBuilder.append(this.time);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
