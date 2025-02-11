package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzg<TResult> implements zzq<TResult> {
    private final Object mLock = new Object();
    private final Executor zzd;
    private OnCanceledListener zzj;

    public zzg(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.zzd = executor;
        this.zzj = onCanceledListener;
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r1.zzd.execute(new com.google.android.gms.tasks.zzh(r1));
     */
    public final void onComplete(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r2) {
        /*
        r1 = this;
        r2 = r2.isCanceled();
        if (r2 == 0) goto L_0x001e;
    L_0x0006:
        r2 = r1.mLock;
        monitor-enter(r2);
        r0 = r1.zzj;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        r2 = r1.zzd;
        r0 = new com.google.android.gms.tasks.zzh;
        r0.<init>(r1);
        r2.execute(r0);
        goto L_0x001e;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzg.onComplete(com.google.android.gms.tasks.Task):void");
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzj = null;
        }
    }
}
