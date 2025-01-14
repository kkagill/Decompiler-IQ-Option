package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzk;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzes implements zzag {
    private boolean closed;
    private final String zzaec;
    private String zzafd;
    private zzdh<zzk> zzajf;
    private zzal zzajg;
    private final ScheduledExecutorService zzaji;
    private final zzev zzajj;
    private ScheduledFuture<?> zzajk;
    private final Context zzrm;

    public zzes(Context context, String str, zzal zzal) {
        this(context, str, zzal, null, null);
    }

    @VisibleForTesting
    private zzes(Context context, String str, zzal zzal, zzew zzew, zzev zzev) {
        this.zzajg = zzal;
        this.zzrm = context;
        this.zzaec = str;
        this.zzaji = new zzet(this).zzjc();
        this.zzajj = new zzeu(this);
    }

    public final synchronized void release() {
        zzjb();
        if (this.zzajk != null) {
            this.zzajk.cancel(false);
        }
        this.zzaji.shutdown();
        this.closed = true;
    }

    public final synchronized void zza(zzdh<zzk> zzdh) {
        zzjb();
        this.zzajf = zzdh;
    }

    public final synchronized void zza(long j, String str) {
        String str2 = this.zzaec;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 55);
        stringBuilder.append("loadAfterDelay: containerId=");
        stringBuilder.append(str2);
        stringBuilder.append(" delay=");
        stringBuilder.append(j);
        zzdi.zzab(stringBuilder.toString());
        zzjb();
        if (this.zzajf != null) {
            if (this.zzajk != null) {
                this.zzajk.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.zzaji;
            zzer zza = this.zzajj.zza(this.zzajg);
            zza.zza(this.zzajf);
            zza.zzap(this.zzafd);
            zza.zzbi(str);
            this.zzajk = scheduledExecutorService.schedule(zza, j, TimeUnit.MILLISECONDS);
        } else {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
    }

    public final synchronized void zzap(String str) {
        zzjb();
        this.zzafd = str;
    }

    private final synchronized void zzjb() {
        if (this.closed) {
            throw new IllegalStateException("called method after closed");
        }
    }
}
