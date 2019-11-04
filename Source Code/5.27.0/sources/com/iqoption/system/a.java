package com.iqoption.system;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: CountTimer */
public abstract class a {
    private final long dUh;
    private boolean dUi = false;
    private Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            synchronized (a.this) {
                if (a.this.dUi) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a.this.aRW();
                elapsedRealtime = (elapsedRealtime + a.this.dUh) - SystemClock.elapsedRealtime();
                while (elapsedRealtime < 0) {
                    elapsedRealtime += a.this.dUh;
                }
                sendMessageDelayed(obtainMessage(1), elapsedRealtime);
            }
        }
    };

    public abstract void aRW();

    public a(long j) {
        this.dUh = j;
    }

    public final synchronized void cancel() {
        this.dUi = true;
        this.mHandler.removeMessages(1);
    }

    public final synchronized a aUy() {
        this.dUi = false;
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1));
        return this;
    }
}
