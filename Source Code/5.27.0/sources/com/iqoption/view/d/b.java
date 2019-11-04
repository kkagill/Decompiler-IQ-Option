package com.iqoption.view.d;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: OnClickDelayView */
public abstract class b implements OnClickListener {
    private long ejh = 300;
    private long eji;

    public abstract void M(View view);

    public b(long j) {
        this.ejh = j;
    }

    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.eji >= this.ejh) {
            this.eji = SystemClock.elapsedRealtime();
            M(view);
        }
    }
}
