package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
final class zzfn extends zzfm {
    private static final Object zzakn = new Object();
    private static zzfn zzaky;
    private boolean connected = true;
    private zzcc zzaig = new zzfo(this);
    private Context zzako;
    private zzcb zzakp;
    private volatile zzby zzakq;
    private int zzakr = 1800000;
    private boolean zzaks = true;
    private boolean zzakt = false;
    private boolean zzaku = true;
    private zzfq zzakv;
    private zzdn zzakw;
    private boolean zzakx = false;

    public static zzfn zzjq() {
        if (zzaky == null) {
            zzaky = new zzfn();
        }
        return zzaky;
    }

    private zzfn() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:11:0x0014, code skipped:
            return;
     */
    public final synchronized void zza(android.content.Context r2, com.google.android.gms.tagmanager.zzby r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.zzako;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);
        return;
    L_0x0007:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x0015 }
        r1.zzako = r2;	 Catch:{ all -> 0x0015 }
        r2 = r1.zzakq;	 Catch:{ all -> 0x0015 }
        if (r2 != 0) goto L_0x0013;
    L_0x0011:
        r1.zzakq = r3;	 Catch:{ all -> 0x0015 }
    L_0x0013:
        monitor-exit(r1);
        return;
    L_0x0015:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfn.zza(android.content.Context, com.google.android.gms.tagmanager.zzby):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized zzcb zzjr() {
        if (this.zzakp == null) {
            if (this.zzako != null) {
                this.zzakp = new zzeb(this.zzaig, this.zzako);
            } else {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
        }
        if (this.zzakv == null) {
            this.zzakv = new zzfr(this, null);
            if (this.zzakr > 0) {
                this.zzakv.zzh((long) this.zzakr);
            }
        }
        this.zzakt = true;
        if (this.zzaks) {
            dispatch();
            this.zzaks = false;
        }
        if (this.zzakw == null && this.zzaku) {
            this.zzakw = new zzdn(this);
            zzdn zzdn = this.zzakw;
            Context context = this.zzako;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(zzdn, intentFilter);
            intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(context.getPackageName());
            context.registerReceiver(zzdn, intentFilter);
        }
        return this.zzakp;
    }

    public final synchronized void dispatch() {
        if (this.zzakt) {
            this.zzakq.zzc(new zzfp(this));
            return;
        }
        zzdi.zzab("Dispatch call queued. Dispatch will run once initialization is complete.");
        this.zzaks = true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    @VisibleForTesting
    public final synchronized void zza(boolean z, boolean z2) {
        boolean isPowerSaveMode = isPowerSaveMode();
        this.zzakx = z;
        this.connected = z2;
        if (isPowerSaveMode() != isPowerSaveMode) {
            if (isPowerSaveMode()) {
                this.zzakv.cancel();
                zzdi.zzab("PowerSaveMode initiated.");
                return;
            }
            this.zzakv.zzh((long) this.zzakr);
            zzdi.zzab("PowerSaveMode terminated.");
        }
    }

    public final synchronized void zzf(boolean z) {
        zza(this.zzakx, z);
    }

    public final synchronized void zzjp() {
        if (!isPowerSaveMode()) {
            this.zzakv.zzjt();
        }
    }

    private final boolean isPowerSaveMode() {
        return this.zzakx || !this.connected || this.zzakr <= 0;
    }
}
