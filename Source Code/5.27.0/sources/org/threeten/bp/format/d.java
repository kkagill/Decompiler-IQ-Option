package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.a.c;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.e;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

/* compiled from: DateTimePrintContext */
final class d {
    private b fII;
    private f fIJ;
    private Locale locale;
    private int optional;

    d(b bVar, b bVar2) {
        this.fII = a(bVar, bVar2);
        this.locale = bVar2.getLocale();
        this.fIJ = bVar2.bTu();
    }

    private static b a(final b bVar, b bVar2) {
        e bSR = bVar2.bSR();
        ZoneId bSJ = bVar2.bSJ();
        if (bSR == null && bSJ == null) {
            return bVar;
        }
        e eVar = (e) bVar.query(f.bTQ());
        ZoneId zoneId = (ZoneId) bVar.query(f.bTP());
        a aVar = null;
        if (org.threeten.bp.a.d.equals(eVar, bSR)) {
            bSR = null;
        }
        if (org.threeten.bp.a.d.equals(zoneId, bSJ)) {
            bSJ = null;
        }
        if (bSR == null && bSJ == null) {
            return bVar;
        }
        StringBuilder stringBuilder;
        final e eVar2 = bSR != null ? bSR : eVar;
        if (bSJ != null) {
            zoneId = bSJ;
        }
        String str = " ";
        if (bSJ != null) {
            if (bVar.isSupported(ChronoField.INSTANT_SECONDS)) {
                if (eVar2 == null) {
                    eVar2 = IsoChronology.fHk;
                }
                return eVar2.d(Instant.c(bVar), bSJ);
            }
            ZoneId bTa = bSJ.bTa();
            ZoneOffset zoneOffset = (ZoneOffset) bVar.query(f.bTT());
            if (!(!(bTa instanceof ZoneOffset) || zoneOffset == null || bTa.equals(zoneOffset))) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid override zone for temporal: ");
                stringBuilder.append(bSJ);
                stringBuilder.append(str);
                stringBuilder.append(bVar);
                throw new DateTimeException(stringBuilder.toString());
            }
        }
        if (bSR != null) {
            if (bVar.isSupported(ChronoField.EPOCH_DAY)) {
                aVar = eVar2.C(bVar);
            } else if (!(bSR == IsoChronology.fHk && eVar == null)) {
                for (ChronoField chronoField : ChronoField.values()) {
                    if (chronoField.isDateBased() && bVar.isSupported(chronoField)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid override chronology for temporal: ");
                        stringBuilder.append(bSR);
                        stringBuilder.append(str);
                        stringBuilder.append(bVar);
                        throw new DateTimeException(stringBuilder.toString());
                    }
                }
            }
        }
        return new c() {
            public boolean isSupported(org.threeten.bp.temporal.e eVar) {
                if (aVar == null || !eVar.isDateBased()) {
                    return bVar.isSupported(eVar);
                }
                return aVar.isSupported(eVar);
            }

            public ValueRange range(org.threeten.bp.temporal.e eVar) {
                if (aVar == null || !eVar.isDateBased()) {
                    return bVar.range(eVar);
                }
                return aVar.range(eVar);
            }

            public long getLong(org.threeten.bp.temporal.e eVar) {
                if (aVar == null || !eVar.isDateBased()) {
                    return bVar.getLong(eVar);
                }
                return aVar.getLong(eVar);
            }

            public <R> R query(g<R> gVar) {
                if (gVar == f.bTQ()) {
                    return eVar2;
                }
                if (gVar == f.bTP()) {
                    return zoneId;
                }
                if (gVar == f.bTR()) {
                    return bVar.query(gVar);
                }
                return gVar.b(this);
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public b bTH() {
        return this.fII;
    }

    /* Access modifiers changed, original: 0000 */
    public Locale getLocale() {
        return this.locale;
    }

    /* Access modifiers changed, original: 0000 */
    public f bTI() {
        return this.fIJ;
    }

    /* Access modifiers changed, original: 0000 */
    public void bTJ() {
        this.optional++;
    }

    /* Access modifiers changed, original: 0000 */
    public void bTK() {
        this.optional--;
    }

    /* Access modifiers changed, original: 0000 */
    public <R> R a(g<R> gVar) {
        Object query = this.fII.query(gVar);
        if (query != null || this.optional != 0) {
            return query;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to extract value: ");
        stringBuilder.append(this.fII.getClass());
        throw new DateTimeException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public Long c(org.threeten.bp.temporal.e eVar) {
        try {
            return Long.valueOf(this.fII.getLong(eVar));
        } catch (DateTimeException e) {
            if (this.optional > 0) {
                return null;
            }
            throw e;
        }
    }

    public String toString() {
        return this.fII.toString();
    }
}
