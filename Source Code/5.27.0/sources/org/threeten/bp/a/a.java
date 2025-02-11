package org.threeten.bp.a;

import org.threeten.bp.chrono.f;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.g;

/* compiled from: DefaultInterfaceEra */
public abstract class a extends c implements f {
    public boolean isSupported(e eVar) {
        boolean z = true;
        if (eVar instanceof ChronoField) {
            if (eVar != ChronoField.ERA) {
                z = false;
            }
            return z;
        }
        if (eVar == null || !eVar.isSupportedBy(this)) {
            z = false;
        }
        return z;
    }

    public int get(e eVar) {
        if (eVar == ChronoField.ERA) {
            return getValue();
        }
        return range(eVar).b(getLong(eVar), eVar);
    }

    public long getLong(e eVar) {
        if (eVar == ChronoField.ERA) {
            return (long) getValue();
        }
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.b(ChronoField.ERA, (long) getValue());
    }

    public <R> R query(g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.bTR()) {
            return ChronoUnit.ERAS;
        }
        return (gVar == org.threeten.bp.temporal.f.bTQ() || gVar == org.threeten.bp.temporal.f.bTS() || gVar == org.threeten.bp.temporal.f.bTP() || gVar == org.threeten.bp.temporal.f.bTT() || gVar == org.threeten.bp.temporal.f.bTU() || gVar == org.threeten.bp.temporal.f.bTV()) ? null : gVar.b(this);
    }
}
