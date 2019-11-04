package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.iqoption.dto.ToastEntity;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "referrer";
        if (intent != null) {
            String stringExtra;
            try {
                stringExtra = intent.getStringExtra(str);
            } catch (Throwable th) {
                AFLogger.c("error in BroadcastReceiver ", th);
                stringExtra = null;
            }
            if (stringExtra != null) {
                if (stringExtra.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null) {
                    j.dq().b(context, intent);
                    return;
                } else if (j.p(context).getString(str, null) != null) {
                    j.dq();
                    j.h(context, stringExtra);
                    return;
                }
            }
            String str2 = "referrer_timestamp";
            str = m.dw().getString(str2);
            long currentTimeMillis = System.currentTimeMillis();
            if (str == null || currentTimeMillis - Long.valueOf(str).longValue() >= ToastEntity.ERROR_TOAST_DURATION) {
                AFLogger.J("SingleInstallBroadcastReceiver called");
                j.dq().b(context, intent);
                m.dw().set(str2, String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
