package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzo<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, zzq<TResult> {
    private final Executor zzd;
    private final zzu<TContinuationResult> zzf;
    private final SuccessContinuation<TResult, TContinuationResult> zzr;

    public zzo(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation, @NonNull zzu<TContinuationResult> zzu) {
        this.zzd = executor;
        this.zzr = successContinuation;
        this.zzf = zzu;
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        this.zzd.execute(new zzp(this, task));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tContinuationResult) {
        this.zzf.setResult(tContinuationResult);
    }

    public final void onFailure(@NonNull Exception exception) {
        this.zzf.setException(exception);
    }

    public final void onCanceled() {
        this.zzf.zza();
    }
}
