package com.iqoption.util;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Debouncer */
public class m {
    private final Runnable eaY;
    private final Handler handler;

    public m(Runnable runnable) {
        this(new Handler(Looper.getMainLooper()), runnable);
    }

    public m(Handler handler, Runnable runnable) {
        this.handler = handler;
        this.eaY = runnable;
    }

    public void cp(long j) {
        this.handler.removeCallbacks(this.eaY);
        this.handler.postDelayed(this.eaY, j);
    }
}
