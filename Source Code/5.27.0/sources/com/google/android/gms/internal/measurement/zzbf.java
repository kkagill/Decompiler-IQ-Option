package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzbf extends zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzc zzbw;

    zzbf(zzc zzc, Activity activity) {
        this.zzbw = zzc;
        this.val$activity = activity;
        super(zzz.this);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        zzz.this.zzar.onActivityResumed(ObjectWrapper.wrap(this.val$activity), this.zzbt);
    }
}
