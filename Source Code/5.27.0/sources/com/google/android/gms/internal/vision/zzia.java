package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzia extends zzhz<FieldDescriptorType, Object> {
    zzia(int i) {
        super(i, null);
    }

    public final void zzci() {
        if (!isImmutable()) {
            Entry zzbp;
            for (int i = 0; i < zzgu(); i++) {
                zzbp = zzbp(i);
                if (((zzfr) zzbp.getKey()).zzeu()) {
                    zzbp.setValue(Collections.unmodifiableList((List) zzbp.getValue()));
                }
            }
            for (Entry zzbp2 : zzgv()) {
                if (((zzfr) zzbp2.getKey()).zzeu()) {
                    zzbp2.setValue(Collections.unmodifiableList((List) zzbp2.getValue()));
                }
            }
        }
        super.zzci();
    }
}
