package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.iqoption.dto.ToastEntity;

@VisibleForTesting
public final class zzcg {
    private final long zzabf;
    private final int zzabg;
    private double zzabh;
    private long zzabi;
    private final Object zzabj;
    private final Clock zzsd;
    private final String zzup;

    private zzcg(int i, long j, String str, Clock clock) {
        this.zzabj = new Object();
        this.zzabg = 60;
        this.zzabh = (double) this.zzabg;
        this.zzabf = ToastEntity.ERROR_TOAST_DURATION;
        this.zzup = str;
        this.zzsd = clock;
    }

    public zzcg(String str, Clock clock) {
        this(60, ToastEntity.ERROR_TOAST_DURATION, str, clock);
    }

    public final boolean zzfm() {
        synchronized (this.zzabj) {
            long currentTimeMillis = this.zzsd.currentTimeMillis();
            if (this.zzabh < ((double) this.zzabg)) {
                double d = (double) (currentTimeMillis - this.zzabi);
                double d2 = (double) this.zzabf;
                Double.isNaN(d);
                Double.isNaN(d2);
                d /= d2;
                if (d > 0.0d) {
                    this.zzabh = Math.min((double) this.zzabg, this.zzabh + d);
                }
            }
            this.zzabi = currentTimeMillis;
            if (this.zzabh >= 1.0d) {
                this.zzabh -= 1.0d;
                return true;
            }
            String str = this.zzup;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
            stringBuilder.append("Excessive ");
            stringBuilder.append(str);
            stringBuilder.append(" detected; call ignored.");
            zzch.zzac(stringBuilder.toString());
            return false;
        }
    }
}
