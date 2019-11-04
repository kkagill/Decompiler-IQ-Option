package com.google.firebase.iid;

import android.util.Log;

final class ag implements Runnable {
    private final /* synthetic */ af adR;
    private final /* synthetic */ ah adS;

    ag(ah ahVar, af afVar) {
        this.adS = ahVar;
        this.adR = afVar;
    }

    public final void run() {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "bg processing of the intent starting now");
        }
        this.adS.adT.i(this.adR.intent);
        this.adR.finish();
    }
}
