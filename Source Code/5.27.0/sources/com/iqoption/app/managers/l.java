package com.iqoption.app.managers;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.rx.d;
import com.iqoption.gl.c;
import io.reactivex.processors.a;
import java.util.concurrent.TimeUnit;

/* compiled from: TimeServerManager */
public class l implements com.iqoption.core.l {
    private static final String TAG = "com.iqoption.app.managers.l";
    private static final n<l> avf = Suppliers.a(-$$Lambda$l$wqnUaD8E2l2ZNHc4RhSSboTuBuk.INSTANCE);
    private static final long avg = TimeUnit.MINUTES.toMillis(30);
    private volatile long akN = 0;
    private volatile long avh = 0;
    private volatile long avi;
    private volatile long avj = 0;
    private volatile long avk = 0;
    @NonNull
    private a<Long> avl = d.akd().bmJ();

    private l() {
    }

    public static l HZ() {
        return (l) avf.get();
    }

    public void clear() {
        this.avj = 0;
        this.avk = 0;
        this.akN = 0;
        this.avh = 0;
    }

    public void ao(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.avi;
        ChartWindow aIy;
        double d;
        if (j > this.avh) {
            long j3 = j - this.akN;
            if ((j3 < j2 ? 1 : null) == null || this.akN == 0 || Math.abs(j3 - j2) >= avg) {
                this.akN = j;
                this.avi = elapsedRealtime;
                aIy = c.aIy();
                d = (double) j;
                Double.isNaN(d);
                aIy.setServerTime(d / 1000.0d);
            } else {
                this.akN += j2;
                this.avi = elapsedRealtime;
                aIy = c.aIy();
                d = (double) this.akN;
                Double.isNaN(d);
                aIy.setServerTime(d / 1000.0d);
            }
        } else {
            this.akN += j2;
            this.avi = elapsedRealtime;
            aIy = c.aIy();
            d = (double) this.akN;
            Double.isNaN(d);
            aIy.setServerTime(d / 1000.0d);
        }
        this.avh = j;
        this.avl.onNext(Long.valueOf(this.akN));
    }

    public long Ia() {
        return this.avh;
    }

    public long Ib() {
        if (this.akN == 0) {
            return System.currentTimeMillis();
        }
        return this.akN + (SystemClock.elapsedRealtime() - this.avi);
    }

    public void e(int i, long j) {
        if (TabHelper.IM().IX() == i) {
            this.avj = SystemClock.elapsedRealtime();
            this.avk = j;
        }
    }

    public boolean Ic() {
        return this.avj != 0;
    }

    public boolean Id() {
        return SystemClock.elapsedRealtime() - this.avj > 5000;
    }

    public boolean Ie() {
        return Ib() - this.avk < 3000;
    }

    public long If() {
        return Ib();
    }
}
