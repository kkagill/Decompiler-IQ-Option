package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzc {
    private static final Object lock = new Object();
    private static int zzau = 0;
    private SparseArray<Integer> zzav = new SparseArray();
    private SparseArray<Integer> zzaw = new SparseArray();

    public final int zzb(int i) {
        synchronized (lock) {
            Integer num = (Integer) this.zzav.get(i);
            if (num != null) {
                i = num.intValue();
                return i;
            }
            int i2 = zzau;
            zzau++;
            this.zzav.append(i, Integer.valueOf(i2));
            this.zzaw.append(i2, Integer.valueOf(i));
            return i2;
        }
    }

    public final int zzc(int i) {
        synchronized (lock) {
            i = ((Integer) this.zzaw.get(i)).intValue();
        }
        return i;
    }
}
