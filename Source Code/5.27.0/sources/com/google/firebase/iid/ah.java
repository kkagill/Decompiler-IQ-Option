package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class ah extends Binder {
    private final ad adT;

    ah(ad adVar) {
        this.adT = adVar;
    }

    public final void a(af afVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "EnhancedIntentService";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            if (this.adT.zzc(afVar.intent)) {
                afVar.finish();
                return;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "intent being queued for bg execution");
            }
            this.adT.adL.execute(new ag(this, afVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
