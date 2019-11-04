package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

final class zzr<TResult> {
    private final Object mLock = new Object();
    private Queue<zzq<TResult>> zzt;
    private boolean zzu;

    zzr() {
    }

    public final void zza(@NonNull zzq<TResult> zzq) {
        synchronized (this.mLock) {
            if (this.zzt == null) {
                this.zzt = new ArrayDeque();
            }
            this.zzt.add(zzq);
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r1 = r2.mLock;
     */
    /* JADX WARNING: Missing block: B:11:0x0012, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            r0 = (com.google.android.gms.tasks.zzq) r2.zzt.poll();
     */
    /* JADX WARNING: Missing block: B:14:0x001b, code skipped:
            if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:15:0x001d, code skipped:
            r2.zzu = false;
     */
    /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:17:0x0021, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:18:0x0022, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:19:0x0023, code skipped:
            r0.onComplete(r3);
     */
    public final void zza(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.zzt;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;
    L_0x0007:
        r1 = r2.zzu;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r1 = 1;
        r2.zzu = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.mLock;
        monitor-enter(r1);
        r0 = r2.zzt;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (com.google.android.gms.tasks.zzq) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r3 = 0;
        r2.zzu = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.onComplete(r3);
        goto L_0x0010;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        goto L_0x0030;
    L_0x002f:
        throw r3;
    L_0x0030:
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzr.zza(com.google.android.gms.tasks.Task):void");
    }
}
