package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@VisibleForTesting
public final class zzg {
    private final zzj zzsc;
    private final Clock zzsd;
    private boolean zzse;
    private long zzsf;
    private long zzsg;
    private long zzsh;
    private long zzsi;
    private long zzsj;
    private boolean zzsk;
    private final Map<Class<? extends zzi>, zzi> zzsl;
    private final List<zzo> zzsm;

    @VisibleForTesting
    public final zzg zzai() {
        return new zzg(this);
    }

    @VisibleForTesting
    public final void zza(zzi zzi) {
        Preconditions.checkNotNull(zzi);
        Class cls = zzi.getClass();
        if (cls.getSuperclass() == zzi.class) {
            zzi.zzb(zzb(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    @VisibleForTesting
    public final <T extends zzi> T zza(Class<T> cls) {
        return (zzi) this.zzsl.get(cls);
    }

    @VisibleForTesting
    public final <T extends zzi> T zzb(Class<T> cls) {
        zzi zzi = (zzi) this.zzsl.get(cls);
        if (zzi != null) {
            return zzi;
        }
        zzi = zzc(cls);
        this.zzsl.put(cls, zzi);
        return zzi;
    }

    @VisibleForTesting
    public final Collection<zzi> zzaj() {
        return this.zzsl.values();
    }

    public final List<zzo> zzak() {
        return this.zzsm;
    }

    @VisibleForTesting
    public final long zzal() {
        return this.zzsf;
    }

    @VisibleForTesting
    public final void zza(long j) {
        this.zzsg = j;
    }

    @VisibleForTesting
    public final void zzam() {
        this.zzsc.zzas().zze(this);
    }

    @VisibleForTesting
    zzg(zzj zzj, Clock clock) {
        Preconditions.checkNotNull(zzj);
        Preconditions.checkNotNull(clock);
        this.zzsc = zzj;
        this.zzsd = clock;
        this.zzsi = 1800000;
        this.zzsj = 3024000000L;
        this.zzsl = new HashMap();
        this.zzsm = new ArrayList();
    }

    private zzg(zzg zzg) {
        this.zzsc = zzg.zzsc;
        this.zzsd = zzg.zzsd;
        this.zzsf = zzg.zzsf;
        this.zzsg = zzg.zzsg;
        this.zzsh = zzg.zzsh;
        this.zzsi = zzg.zzsi;
        this.zzsj = zzg.zzsj;
        this.zzsm = new ArrayList(zzg.zzsm);
        this.zzsl = new HashMap(zzg.zzsl.size());
        for (Entry entry : zzg.zzsl.entrySet()) {
            zzi zzc = zzc((Class) entry.getKey());
            ((zzi) entry.getValue()).zzb(zzc);
            this.zzsl.put((Class) entry.getKey(), zzc);
        }
    }

    @TargetApi(19)
    private static <T extends zzi> T zzc(Class<T> cls) {
        try {
            return (zzi) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("Linkage exception", e);
            }
        }
    }

    @VisibleForTesting
    public final boolean zzan() {
        return this.zzse;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final void zzao() {
        this.zzsh = this.zzsd.elapsedRealtime();
        long j = this.zzsg;
        if (j != 0) {
            this.zzsf = j;
        } else {
            this.zzsf = this.zzsd.currentTimeMillis();
        }
        this.zzse = true;
    }

    /* Access modifiers changed, original: final */
    public final zzj zzap() {
        return this.zzsc;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final boolean zzaq() {
        return this.zzsk;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final void zzar() {
        this.zzsk = true;
    }
}
