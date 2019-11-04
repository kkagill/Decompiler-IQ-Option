package com.iqoption.core.b;

/* compiled from: RetryFutureEvent */
public class f implements d {
    public final long bgC;
    public final long bgD;
    public final long bgE;
    public final String tag;

    public f(long j, long j2, long j3, String str) {
        this.bgC = j;
        this.bgD = j2;
        this.bgE = j3;
        this.tag = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TIMEOUT ");
        stringBuilder.append(this.tag);
        stringBuilder.append(" retry ");
        stringBuilder.append(this.bgC);
        stringBuilder.append('/');
        stringBuilder.append(this.bgD);
        return stringBuilder.toString();
    }
}
