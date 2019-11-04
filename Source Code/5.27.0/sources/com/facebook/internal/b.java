package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.g;

/* compiled from: BoltsMeasurementEventListener */
public class b extends BroadcastReceiver {
    private static b xE;
    private Context tF;

    private b(Context context) {
        this.tF = context.getApplicationContext();
    }

    private void open() {
        LocalBroadcastManager.getInstance(this.tF).registerReceiver(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    private void close() {
        LocalBroadcastManager.getInstance(this.tF).unregisterReceiver(this);
    }

    public static b W(Context context) {
        b bVar = xE;
        if (bVar != null) {
            return bVar;
        }
        xE = new b(context);
        xE.open();
        return xE;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        g gVar = new g(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bf_");
        stringBuilder.append(intent.getStringExtra("event_name"));
        String stringBuilder2 = stringBuilder.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        gVar.logEvent(stringBuilder2, bundle);
    }
}
