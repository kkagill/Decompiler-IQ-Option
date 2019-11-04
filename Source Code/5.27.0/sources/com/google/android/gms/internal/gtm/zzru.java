package com.google.android.gms.internal.gtm;

import java.util.List;

abstract class zzru {
    private static final zzru zzbch = new zzrw();
    private static final zzru zzbci = new zzrx();

    private zzru() {
    }

    public abstract <L> List<L> zza(Object obj, long j);

    public abstract <L> void zza(Object obj, Object obj2, long j);

    public abstract void zzb(Object obj, long j);

    static zzru zzqc() {
        return zzbch;
    }

    static zzru zzqd() {
        return zzbci;
    }

    /* synthetic */ zzru(zzrv zzrv) {
        this();
    }
}
