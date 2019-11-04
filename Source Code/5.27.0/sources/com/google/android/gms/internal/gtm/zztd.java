package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zztd extends zztc<FieldDescriptorType, Object> {
    zztd(int i) {
        super(i, null);
    }

    public final void zzmi() {
        if (!isImmutable()) {
            Entry zzbv;
            for (int i = 0; i < zzra(); i++) {
                zzbv = zzbv(i);
                if (((zzqv) zzbv.getKey()).zzoz()) {
                    zzbv.setValue(Collections.unmodifiableList((List) zzbv.getValue()));
                }
            }
            for (Entry zzbv2 : zzrb()) {
                if (((zzqv) zzbv2.getKey()).zzoz()) {
                    zzbv2.setValue(Collections.unmodifiableList((List) zzbv2.getValue()));
                }
            }
        }
        super.zzmi();
    }
}
