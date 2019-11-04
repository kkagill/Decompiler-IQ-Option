package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzi<TResult> implements zzq<TResult> {
    private final Object mLock = new Object();
    private final Executor zzd;
    private OnCompleteListener<TResult> zzl;

    public zzi(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzd = executor;
        this.zzl = onCompleteListener;
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzl == null) {
                return;
            }
            this.zzd.execute(new zzj(this, task));
        }
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzl = null;
        }
    }
}
