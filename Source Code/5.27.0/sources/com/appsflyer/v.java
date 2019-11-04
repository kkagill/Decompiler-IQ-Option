package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

final class v {
    private IntentFilter mq = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static final class a {
        static final v mr = new v();
    }

    static final class b {
        private final String lO;
        private final float ms;

        b(float f, String str) {
            this.ms = f;
            this.lO = str;
        }

        /* Access modifiers changed, original: final */
        public final float dF() {
            return this.ms;
        }

        /* Access modifiers changed, original: final */
        public final String dG() {
            return this.lO;
        }

        b() {
        }
    }

    v() {
    }

    /* Access modifiers changed, original: final */
    @NonNull
    public final b z(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.mq);
            if (registerReceiver != null) {
                int intExtra;
                if ((2 == registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) ? 1 : null) != null) {
                    intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra || -1 == intExtra2)) {
                    f = (((float) intExtra) * 100.0f) / ((float) intExtra2);
                }
            }
        } catch (Throwable unused) {
        }
        return new b(f, str);
    }
}
