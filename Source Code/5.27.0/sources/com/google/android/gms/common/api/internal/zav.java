package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zav implements zabt {
    private final /* synthetic */ zas zaep;

    private zav(zas zas) {
        this.zaep = zas;
    }

    public final void zab(@Nullable Bundle bundle) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zael = ConnectionResult.RESULT_SUCCESS;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    public final void zac(@NonNull ConnectionResult connectionResult) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zael = connectionResult;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    public final void zab(int i, boolean z) {
        this.zaep.zaen.lock();
        try {
            if (this.zaep.zaem) {
                this.zaep.zaem = false;
                this.zaep.zaa(i, z);
                return;
            }
            this.zaep.zaem = true;
            this.zaep.zaee.onConnectionSuspended(i);
            this.zaep.zaen.unlock();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    /* synthetic */ zav(zas zas, zat zat) {
        this(zas);
    }
}
