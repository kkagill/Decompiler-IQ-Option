package com.iqoption.view.d;

import android.os.SystemClock;

/* compiled from: OnClickDelayNative */
public abstract class a<T> {
    private long ejh = 300;
    private long eji;

    public abstract void ca(T t);

    public void cu(T t) {
        if (SystemClock.elapsedRealtime() - this.eji >= this.ejh) {
            this.eji = SystemClock.elapsedRealtime();
            ca(t);
        }
    }
}
