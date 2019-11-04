package org.threeten.bp.format;

import java.util.ArrayList;
import java.util.Map;
import org.threeten.bp.ZoneId;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

/* compiled from: DateTimeParseContext */
final class c {
    private boolean fIF;
    private boolean fIG;
    private final ArrayList<a> fIH;

    /* compiled from: DateTimeParseContext */
    final class a extends org.threeten.bp.a.c {
        final Map<e, Long> fHA;
        org.threeten.bp.chrono.e fHB;
        ZoneId zone;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fHA.toString());
            String str = ",";
            stringBuilder.append(str);
            stringBuilder.append(this.fHB);
            stringBuilder.append(str);
            stringBuilder.append(this.zone);
            return stringBuilder.toString();
        }

        public boolean isSupported(e eVar) {
            return this.fHA.containsKey(eVar);
        }

        public int get(e eVar) {
            if (this.fHA.containsKey(eVar)) {
                return d.eq(((Long) this.fHA.get(eVar)).longValue());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }

        public long getLong(e eVar) {
            if (this.fHA.containsKey(eVar)) {
                return ((Long) this.fHA.get(eVar)).longValue();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported field: ");
            stringBuilder.append(eVar);
            throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }

        public <R> R query(g<R> gVar) {
            if (gVar == f.bTQ()) {
                return this.fHB;
            }
            if (gVar == f.bTP() || gVar == f.bTS()) {
                return this.zone;
            }
            return super.query(gVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void hq(boolean z) {
        this.fIF = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void setStrict(boolean z) {
        this.fIG = z;
    }

    private a bTG() {
        ArrayList arrayList = this.fIH;
        return (a) arrayList.get(arrayList.size() - 1);
    }

    public String toString() {
        return bTG().toString();
    }
}
