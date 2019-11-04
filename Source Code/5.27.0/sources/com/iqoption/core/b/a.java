package com.iqoption.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: ApiCallEventBusEvent */
public class a implements d {
    public boolean bgA;
    public final String bgx;
    public final com.iqoption.core.analytics.a bgy;
    public final Throwable bgz;

    public a(@NonNull String str, @NonNull com.iqoption.core.analytics.a aVar, @Nullable Throwable th) {
        this.bgx = str;
        this.bgy = aVar;
        this.bgz = th;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.bgy.toString());
        stringBuilder.append(this.bgz == null ? "" : " ERROR!");
        return stringBuilder.toString();
    }
}
