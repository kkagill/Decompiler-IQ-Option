package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.a.e;

/* compiled from: RetryManager */
class v {
    long oH;
    private e oI;

    public v(e eVar) {
        if (eVar != null) {
            this.oI = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public boolean d(long j) {
        return j - this.oH >= this.oI.bjY() * 1000000;
    }

    public void e(long j) {
        this.oH = j;
        this.oI = this.oI.bjZ();
    }

    public void reset() {
        this.oH = 0;
        this.oI = this.oI.bka();
    }
}
