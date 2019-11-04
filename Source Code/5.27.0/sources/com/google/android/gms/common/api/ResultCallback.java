package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public interface ResultCallback<R extends Result> {
    void onResult(@NonNull R r);
}
