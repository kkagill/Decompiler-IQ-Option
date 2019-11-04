package io.fabric.sdk.android.services.concurrency.a;

/* compiled from: RetryState */
public class e {
    private final d eOj;
    private final a oF;
    private final int retryCount;

    public e(a aVar, d dVar) {
        this(0, aVar, dVar);
    }

    public e(int i, a aVar, d dVar) {
        this.retryCount = i;
        this.oF = aVar;
        this.eOj = dVar;
    }

    public long bjY() {
        return this.oF.z(this.retryCount);
    }

    public e bjZ() {
        return new e(this.retryCount + 1, this.oF, this.eOj);
    }

    public e bka() {
        return new e(this.oF, this.eOj);
    }
}
