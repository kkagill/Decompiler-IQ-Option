package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.iqoption.dto.ToastEntity;

final class zzfl implements zzej {
    private final long zzabf;
    private final int zzabg;
    private double zzabh;
    private final Object zzabj;
    private long zzakm;
    private final Clock zzsd;

    private zzfl(int i, long j) {
        this.zzabj = new Object();
        this.zzabg = 60;
        this.zzabh = (double) this.zzabg;
        this.zzabf = ToastEntity.ERROR_TOAST_DURATION;
        this.zzsd = DefaultClock.getInstance();
    }

    public zzfl() {
        this(60, ToastEntity.ERROR_TOAST_DURATION);
    }

    public final boolean zzfm() {
        synchronized (this.zzabj) {
            long currentTimeMillis = this.zzsd.currentTimeMillis();
            if (this.zzabh < ((double) this.zzabg)) {
                double d = (double) (currentTimeMillis - this.zzakm);
                double d2 = (double) this.zzabf;
                Double.isNaN(d);
                Double.isNaN(d2);
                d /= d2;
                if (d > 0.0d) {
                    this.zzabh = Math.min((double) this.zzabg, this.zzabh + d);
                }
            }
            this.zzakm = currentTimeMillis;
            if (this.zzabh >= 1.0d) {
                this.zzabh -= 1.0d;
                return true;
            }
            zzdi.zzac("No more tokens available.");
            return false;
        }
    }
}
