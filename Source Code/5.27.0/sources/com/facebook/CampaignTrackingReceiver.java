package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appevents.AppEventsLogger;

public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "referrer";
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null && stringExtra.startsWith("fb")) {
            AppEventsLogger.aP(intent.getStringExtra(str));
        }
    }
}
