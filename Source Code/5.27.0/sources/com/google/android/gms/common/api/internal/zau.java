package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zau implements zabt {
    private final /* synthetic */ zas zaep;

    private zau(zas zas) {
        this.zaep = zas;
    }

    public final void zab(@Nullable Bundle bundle) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zaa(bundle);
            this.zaep.zaek = ConnectionResult.RESULT_SUCCESS;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    public final void zac(@NonNull ConnectionResult connectionResult) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zaek = connectionResult;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    public final void zab(int i, boolean z) {
        this.zaep.zaen.lock();
        try {
            if (!(this.zaep.zaem || this.zaep.zael == null)) {
                if (this.zaep.zael.isSuccess()) {
                    this.zaep.zaem = true;
                    this.zaep.zaef.onConnectionSuspended(i);
                    this.zaep.zaen.unlock();
                    return;
                }
            }
            this.zaep.zaem = false;
            this.zaep.zaa(i, z);
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    /* synthetic */ zau(zas zas, zat zat) {
        this(zas);
    }
}
