package com.iqoption.portfolio.component.b;

import androidx.annotation.NonNull;

/* compiled from: ExpHeaderItem */
public final class c implements f {
    private final long expiration;

    public int asd() {
        return -3;
    }

    public c(long j) {
        this.expiration = j;
    }

    @NonNull
    public String Or() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expHeader:");
        stringBuilder.append(this.expiration);
        return stringBuilder.toString();
    }

    public long getExpiration() {
        return this.expiration;
    }
}
