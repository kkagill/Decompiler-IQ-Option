package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zzar {
    private final Context zzwu;
    private final Context zzwv;

    public zzar(Context context) {
        Preconditions.checkNotNull(context);
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context, "Application context can't be null");
        this.zzwu = context;
        this.zzwv = context;
    }

    public final Context getApplicationContext() {
        return this.zzwu;
    }

    public final Context zzdc() {
        return this.zzwv;
    }
}
