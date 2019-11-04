package com.iqoption.util;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.Maps;
import java.util.Map;

/* compiled from: HandlerScheduler */
public class x {
    private final Map<Runnable, Runnable> ebx = Maps.uk();
    private final Handler handler = new Handler(Looper.getMainLooper());

    public void a(final Runnable runnable, final long j, long j2) {
        AnonymousClass1 anonymousClass1 = new Runnable() {
            public void run() {
                runnable.run();
                x.this.handler.postDelayed(this, j);
            }
        };
        this.ebx.put(runnable, anonymousClass1);
        this.handler.postDelayed(anonymousClass1, j2);
    }

    public void b(Runnable runnable, long j) {
        a(runnable, j, 0);
    }

    public void i(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.ebx.get(runnable);
        if (runnable2 != null) {
            this.ebx.remove(runnable2);
            this.handler.removeCallbacks((Runnable) this.ebx.get(runnable));
        }
    }

    public void clear() {
        this.handler.removeCallbacks(null);
    }
}
