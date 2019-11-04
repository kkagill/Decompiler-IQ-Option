package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;

@VisibleForTesting
public final class zzat extends zzan {
    private final zzav zzxa = new zzav(this);
    private zzce zzxb;
    private final zzbs zzxc;
    private final zzcv zzxd;

    protected zzat(zzap zzap) {
        super(zzap);
        this.zzxd = new zzcv(zzap.zzcn());
        this.zzxc = new zzau(this, zzap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
    }

    public final boolean isConnected() {
        zzk.zzav();
        zzdb();
        return this.zzxb != null;
    }

    public final boolean zzb(zzcd zzcd) {
        Preconditions.checkNotNull(zzcd);
        zzk.zzav();
        zzdb();
        zzce zzce = this.zzxb;
        if (zzce == null) {
            return false;
        }
        String zzet;
        if (zzcd.zzfj()) {
            zzet = zzbq.zzet();
        } else {
            zzet = zzbq.zzeu();
        }
        try {
            zzce.zza(zzcd.zzdm(), zzcd.zzfh(), zzet, Collections.emptyList());
            zzdo();
            return true;
        } catch (RemoteException unused) {
            zzq("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public final boolean zzdn() {
        zzk.zzav();
        zzdb();
        zzce zzce = this.zzxb;
        if (zzce == null) {
            return false;
        }
        try {
            zzce.zzch();
            zzdo();
            return true;
        } catch (RemoteException unused) {
            zzq("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    private final void zzdo() {
        this.zzxd.start();
        this.zzxc.zzh(((Long) zzby.zzaaj.get()).longValue());
    }

    public final boolean connect() {
        zzk.zzav();
        zzdb();
        if (this.zzxb != null) {
            return true;
        }
        zzce zzdq = this.zzxa.zzdq();
        if (zzdq == null) {
            return false;
        }
        this.zzxb = zzdq;
        zzdo();
        return true;
    }

    private final void zza(zzce zzce) {
        zzk.zzav();
        this.zzxb = zzce;
        zzdo();
        zzcs().onServiceConnected();
    }

    public final void disconnect() {
        zzk.zzav();
        zzdb();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzxa);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzxb != null) {
            this.zzxb = null;
            zzcs().zzck();
        }
    }

    private final void onServiceDisconnected(ComponentName componentName) {
        zzk.zzav();
        if (this.zzxb != null) {
            this.zzxb = null;
            zza("Disconnected from device AnalyticsService", componentName);
            zzcs().zzck();
        }
    }

    private final void zzdp() {
        zzk.zzav();
        if (isConnected()) {
            zzq("Inactivity, disconnecting from device AnalyticsService");
            disconnect();
        }
    }
}
