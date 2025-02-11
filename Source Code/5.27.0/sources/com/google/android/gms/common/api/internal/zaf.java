package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaf extends zad<Void> {
    private final RegisterListenerMethod<AnyClient, ?> zaco;
    private final UnregisterListenerMethod<AnyClient, ?> zacp;

    public zaf(zabw zabw, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zaco = zabw.zajw;
        this.zacp = zabw.zajx;
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull zaab zaab, boolean z) {
    }

    public final void zad(zaa<?> zaa) {
        this.zaco.registerListener(zaa.zaab(), this.zacm);
        if (this.zaco.getListenerKey() != null) {
            zaa.zabk().put(this.zaco.getListenerKey(), new zabw(this.zaco, this.zacp));
        }
    }

    @Nullable
    public final Feature[] zab(zaa<?> zaa) {
        return this.zaco.getRequiredFeatures();
    }

    public final boolean zac(zaa<?> zaa) {
        return this.zaco.shouldAutoResolveMissingFeatures();
    }
}
