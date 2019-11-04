package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public class Response<T extends Result> {
    private T zzap;

    protected Response(@NonNull T t) {
        this.zzap = t;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public T getResult() {
        return this.zzap;
    }

    public void setResult(@NonNull T t) {
        this.zzap = t;
    }
}
