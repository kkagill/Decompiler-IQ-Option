package io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

/* compiled from: TimingMetric */
public class u {
    private long duration;
    private long eef;
    private final String eventName;
    private final boolean qW;
    private final String tag;

    public u(String str, String str2) {
        this.eventName = str;
        this.tag = str2;
        this.qW = Log.isLoggable(str2, 2) ^ 1;
    }

    public synchronized void bjL() {
        if (!this.qW) {
            this.eef = SystemClock.elapsedRealtime();
            this.duration = 0;
        }
    }

    public synchronized void bjM() {
        if (!this.qW) {
            if (this.duration == 0) {
                this.duration = SystemClock.elapsedRealtime() - this.eef;
                bjN();
            }
        }
    }

    private void bjN() {
        String str = this.tag;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.eventName);
        stringBuilder.append(": ");
        stringBuilder.append(this.duration);
        stringBuilder.append("ms");
        Log.v(str, stringBuilder.toString());
    }
}
