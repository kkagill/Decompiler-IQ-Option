package com.google.firebase.a;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class a<T> {
    private final Class<T> acw;
    private final T payload;

    @KeepForSdk
    public Class<T> getType() {
        return this.acw;
    }

    @KeepForSdk
    public T ws() {
        return this.payload;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.acw, this.payload});
    }
}
