package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

final class zzfg extends Thread {
    private final /* synthetic */ zzfc zznt;
    private final Object zznu = new Object();
    private final BlockingQueue<zzfh<?>> zznv;

    public zzfg(zzfc zzfc, String str, BlockingQueue<zzfh<?>> blockingQueue) {
        this.zznt = zzfc;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zznv = blockingQueue;
        setName(str);
    }

    /* JADX WARNING: Missing block: B:37:0x0065, code skipped:
            r1 = r6.zznt.zzng;
     */
    /* JADX WARNING: Missing block: B:38:0x006b, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            r6.zznt.zznh.release();
            r6.zznt.zzng.notifyAll();
     */
    /* JADX WARNING: Missing block: B:41:0x0084, code skipped:
            if (r6 != r6.zznt.zzna) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:42:0x0086, code skipped:
            r6.zznt.zzna = null;
     */
    /* JADX WARNING: Missing block: B:44:0x0092, code skipped:
            if (r6 != r6.zznt.zznb) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:45:0x0094, code skipped:
            r6.zznt.zznb = null;
     */
    /* JADX WARNING: Missing block: B:46:0x009a, code skipped:
            r6.zznt.zzab().zzgk().zzao("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Missing block: B:47:0x00a9, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:48:0x00aa, code skipped:
            return;
     */
    public final void run() {
        /*
        r6 = this;
        r0 = 0;
    L_0x0001:
        if (r0 != 0) goto L_0x0013;
    L_0x0003:
        r1 = r6.zznt;	 Catch:{ InterruptedException -> 0x000e }
        r1 = r1.zznh;	 Catch:{ InterruptedException -> 0x000e }
        r1.acquire();	 Catch:{ InterruptedException -> 0x000e }
        r0 = 1;
        goto L_0x0001;
    L_0x000e:
        r1 = move-exception;
        r6.zza(r1);
        goto L_0x0001;
    L_0x0013:
        r0 = 0;
        r1 = android.os.Process.myTid();	 Catch:{ all -> 0x00b7 }
        r1 = android.os.Process.getThreadPriority(r1);	 Catch:{ all -> 0x00b7 }
    L_0x001c:
        r2 = r6.zznv;	 Catch:{ all -> 0x00b7 }
        r2 = r2.poll();	 Catch:{ all -> 0x00b7 }
        r2 = (com.google.android.gms.measurement.internal.zzfh) r2;	 Catch:{ all -> 0x00b7 }
        if (r2 == 0) goto L_0x0035;
    L_0x0026:
        r3 = r2.zznx;	 Catch:{ all -> 0x00b7 }
        if (r3 == 0) goto L_0x002c;
    L_0x002a:
        r3 = r1;
        goto L_0x002e;
    L_0x002c:
        r3 = 10;
    L_0x002e:
        android.os.Process.setThreadPriority(r3);	 Catch:{ all -> 0x00b7 }
        r2.run();	 Catch:{ all -> 0x00b7 }
        goto L_0x001c;
    L_0x0035:
        r2 = r6.zznu;	 Catch:{ all -> 0x00b7 }
        monitor-enter(r2);	 Catch:{ all -> 0x00b7 }
        r3 = r6.zznv;	 Catch:{ all -> 0x00b4 }
        r3 = r3.peek();	 Catch:{ all -> 0x00b4 }
        if (r3 != 0) goto L_0x0054;
    L_0x0040:
        r3 = r6.zznt;	 Catch:{ all -> 0x00b4 }
        r3 = r3.zzni;	 Catch:{ all -> 0x00b4 }
        if (r3 != 0) goto L_0x0054;
    L_0x0048:
        r3 = r6.zznu;	 Catch:{ InterruptedException -> 0x0050 }
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3.wait(r4);	 Catch:{ InterruptedException -> 0x0050 }
        goto L_0x0054;
    L_0x0050:
        r3 = move-exception;
        r6.zza(r3);	 Catch:{ all -> 0x00b4 }
    L_0x0054:
        monitor-exit(r2);	 Catch:{ all -> 0x00b4 }
        r2 = r6.zznt;	 Catch:{ all -> 0x00b7 }
        r2 = r2.zzng;	 Catch:{ all -> 0x00b7 }
        monitor-enter(r2);	 Catch:{ all -> 0x00b7 }
        r3 = r6.zznv;	 Catch:{ all -> 0x00b1 }
        r3 = r3.peek();	 Catch:{ all -> 0x00b1 }
        if (r3 != 0) goto L_0x00ae;
    L_0x0064:
        monitor-exit(r2);	 Catch:{ all -> 0x00b1 }
        r1 = r6.zznt;
        r1 = r1.zzng;
        monitor-enter(r1);
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2 = r2.zznh;	 Catch:{ all -> 0x00ab }
        r2.release();	 Catch:{ all -> 0x00ab }
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2 = r2.zzng;	 Catch:{ all -> 0x00ab }
        r2.notifyAll();	 Catch:{ all -> 0x00ab }
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2 = r2.zzna;	 Catch:{ all -> 0x00ab }
        if (r6 != r2) goto L_0x008c;
    L_0x0086:
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2.zzna = null;	 Catch:{ all -> 0x00ab }
        goto L_0x00a9;
    L_0x008c:
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2 = r2.zznb;	 Catch:{ all -> 0x00ab }
        if (r6 != r2) goto L_0x009a;
    L_0x0094:
        r2 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r2.zznb = null;	 Catch:{ all -> 0x00ab }
        goto L_0x00a9;
    L_0x009a:
        r0 = r6.zznt;	 Catch:{ all -> 0x00ab }
        r0 = r0.zzab();	 Catch:{ all -> 0x00ab }
        r0 = r0.zzgk();	 Catch:{ all -> 0x00ab }
        r2 = "Current scheduler thread is neither worker nor network";
        r0.zzao(r2);	 Catch:{ all -> 0x00ab }
    L_0x00a9:
        monitor-exit(r1);	 Catch:{ all -> 0x00ab }
        return;
    L_0x00ab:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ab }
        throw r0;
    L_0x00ae:
        monitor-exit(r2);	 Catch:{ all -> 0x00b1 }
        goto L_0x001c;
    L_0x00b1:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00b1 }
        throw r1;	 Catch:{ all -> 0x00b7 }
    L_0x00b4:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00b4 }
        throw r1;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r1 = move-exception;
        r2 = r6.zznt;
        r2 = r2.zzng;
        monitor-enter(r2);
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3 = r3.zznh;	 Catch:{ all -> 0x00fe }
        r3.release();	 Catch:{ all -> 0x00fe }
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3 = r3.zzng;	 Catch:{ all -> 0x00fe }
        r3.notifyAll();	 Catch:{ all -> 0x00fe }
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3 = r3.zzna;	 Catch:{ all -> 0x00fe }
        if (r6 == r3) goto L_0x00f7;
    L_0x00d9:
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3 = r3.zznb;	 Catch:{ all -> 0x00fe }
        if (r6 != r3) goto L_0x00e7;
    L_0x00e1:
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3.zznb = null;	 Catch:{ all -> 0x00fe }
        goto L_0x00fc;
    L_0x00e7:
        r0 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r0 = r0.zzab();	 Catch:{ all -> 0x00fe }
        r0 = r0.zzgk();	 Catch:{ all -> 0x00fe }
        r3 = "Current scheduler thread is neither worker nor network";
        r0.zzao(r3);	 Catch:{ all -> 0x00fe }
        goto L_0x00fc;
    L_0x00f7:
        r3 = r6.zznt;	 Catch:{ all -> 0x00fe }
        r3.zzna = null;	 Catch:{ all -> 0x00fe }
    L_0x00fc:
        monitor-exit(r2);	 Catch:{ all -> 0x00fe }
        throw r1;
    L_0x00fe:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00fe }
        goto L_0x0102;
    L_0x0101:
        throw r0;
    L_0x0102:
        goto L_0x0101;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfg.run():void");
    }

    public final void zzhr() {
        synchronized (this.zznu) {
            this.zznu.notifyAll();
        }
    }

    private final void zza(InterruptedException interruptedException) {
        this.zznt.zzab().zzgn().zza(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
