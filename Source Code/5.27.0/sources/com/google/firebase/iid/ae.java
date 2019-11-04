package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final /* synthetic */ class ae implements Runnable {
    private final af adN;
    private final Intent adO;

    ae(af afVar, Intent intent) {
        this.adN = afVar;
        this.adO = intent;
    }

    public final void run() {
        af afVar = this.adN;
        String action = this.adO.getAction();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 61);
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        afVar.finish();
    }
}
