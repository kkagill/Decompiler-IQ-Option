package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzhb extends zzhc<FieldDescriptorType, Object> {
    zzhb(int i) {
        super(i, null);
    }

    public final void zzry() {
        if (!isImmutable()) {
            Entry zzcf;
            for (int i = 0; i < zzwh(); i++) {
                zzcf = zzcf(i);
                if (((zzeq) zzcf.getKey()).zzty()) {
                    zzcf.setValue(Collections.unmodifiableList((List) zzcf.getValue()));
                }
            }
            for (Entry zzcf2 : zzwi()) {
                if (((zzeq) zzcf2.getKey()).zzty()) {
                    zzcf2.setValue(Collections.unmodifiableList((List) zzcf2.getValue()));
                }
            }
        }
        super.zzry();
    }
}
