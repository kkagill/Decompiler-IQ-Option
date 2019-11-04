package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzej extends zzei<FieldDescriptorType, Object> {
    zzej(int i) {
        super(i, null);
    }

    public final void zzv() {
        if (!isImmutable()) {
            Entry zzak;
            for (int i = 0; i < zzdr(); i++) {
                zzak = zzak(i);
                if (((zzca) zzak.getKey()).zzaw()) {
                    zzak.setValue(Collections.unmodifiableList((List) zzak.getValue()));
                }
            }
            for (Entry zzak2 : zzds()) {
                if (((zzca) zzak2.getKey()).zzaw()) {
                    zzak2.setValue(Collections.unmodifiableList((List) zzak2.getValue()));
                }
            }
        }
        super.zzv();
    }
}
