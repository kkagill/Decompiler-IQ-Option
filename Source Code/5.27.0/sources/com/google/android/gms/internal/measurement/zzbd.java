package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzbd extends zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzc zzbw;
    private final /* synthetic */ Bundle zzbx;

    zzbd(zzc zzc, Activity activity, Bundle bundle) {
        this.zzbw = zzc;
        this.val$activity = activity;
        this.zzbx = bundle;
        super(zzz.this);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        zzz.this.zzar.onActivityCreated(ObjectWrapper.wrap(this.val$activity), this.zzbx, this.zzbt);
    }
}
