package com.google.android.gms.tagmanager;

import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzdg implements zzej {
    private final long zzabf = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    private final int zzabg = 5;
    private double zzabh = ((double) Math.min(1, 5));
    private long zzabi;
    private final Object zzabj = new Object();
    private final long zzaia = 5000;
    private final Clock zzsd;
    private final String zzup;

    public zzdg(int i, int i2, long j, long j2, String str, Clock clock) {
        this.zzup = str;
        this.zzsd = clock;
    }

    public final boolean zzfm() {
        synchronized (this.zzabj) {
            long currentTimeMillis = this.zzsd.currentTimeMillis();
            String str;
            StringBuilder stringBuilder;
            if (currentTimeMillis - this.zzabi < this.zzaia) {
                str = this.zzup;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
                stringBuilder.append("Excessive ");
                stringBuilder.append(str);
                stringBuilder.append(" detected; call ignored.");
                zzdi.zzac(stringBuilder.toString());
                return false;
            }
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
            str = this.zzup;
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
            stringBuilder.append("Excessive ");
            stringBuilder.append(str);
            stringBuilder.append(" detected; call ignored.");
            zzdi.zzac(stringBuilder.toString());
            return false;
        }
    }
}
