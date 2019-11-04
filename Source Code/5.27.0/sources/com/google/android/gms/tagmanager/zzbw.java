package com.google.android.gms.tagmanager;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzbw {
    private final long zzabb;
    private final long zzagy;
    private final long zzagz;
    private String zzaha;

    /* Access modifiers changed, original: final */
    public final long zzih() {
        return this.zzagy;
    }

    /* Access modifiers changed, original: final */
    public final long zzii() {
        return this.zzagz;
    }

    zzbw(long j, long j2, long j3) {
        this.zzagy = j;
        this.zzabb = j2;
        this.zzagz = j3;
    }

    /* Access modifiers changed, original: final */
    public final String zzij() {
        return this.zzaha;
    }

    /* Access modifiers changed, original: final */
    public final void zzbc(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.zzaha = str;
        }
    }
}
