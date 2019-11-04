package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zacp {
    public static final Status zakw = new Status(8, "The connection to Google Play services was lost");
    private static final BasePendingResult<?>[] zakx = new BasePendingResult[0];
    private final Map<AnyClientKey<?>, Client> zagy;
    @VisibleForTesting
    final Set<BasePendingResult<?>> zaky = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zacs zakz = new zacq(this);

    public zacp(Map<AnyClientKey<?>, Client> map) {
        this.zagy = map;
    }

    /* Access modifiers changed, original: final */
    public final void zab(BasePendingResult<? extends Result> basePendingResult) {
        this.zaky.add(basePendingResult);
        basePendingResult.zaa(this.zakz);
    }

    public final void release() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zaky.toArray(zakx)) {
            zacs zacs = null;
            basePendingResult.zaa(zacs);
            if (basePendingResult.zam() != null) {
                basePendingResult.setResultCallback(zacs);
                IBinder serviceBrokerBinder = ((Client) this.zagy.get(((ApiMethodImpl) basePendingResult).getClientKey())).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.zaa(new zacr(basePendingResult, zacs, serviceBrokerBinder, zacs));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.zaa(zacs);
                    basePendingResult.cancel();
                    zacs.remove(basePendingResult.zam().intValue());
                } else {
                    zacs zacr = new zacr(basePendingResult, zacs, serviceBrokerBinder, zacs);
                    basePendingResult.zaa(zacr);
                    try {
                        serviceBrokerBinder.linkToDeath(zacr, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.cancel();
                        zacs.remove(basePendingResult.zam().intValue());
                    }
                }
                this.zaky.remove(basePendingResult);
            } else if (basePendingResult.zat()) {
                this.zaky.remove(basePendingResult);
            }
        }
    }

    public final void zabx() {
        for (BasePendingResult zab : (BasePendingResult[]) this.zaky.toArray(zakx)) {
            zab.zab(zakw);
        }
    }
}
