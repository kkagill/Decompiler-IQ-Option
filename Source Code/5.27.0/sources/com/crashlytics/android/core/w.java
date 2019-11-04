package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DevicePowerStateListener */
class w {
    private static final IntentFilter rk = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final IntentFilter rl = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    private static final IntentFilter rm = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final Context context;
    private final AtomicBoolean rn = new AtomicBoolean(false);
    private final BroadcastReceiver ro = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            w.this.rq = false;
        }
    };
    private final BroadcastReceiver rp = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            w.this.rq = true;
        }
    };
    private boolean rq;

    public w(Context context) {
        this.context = context;
    }

    public void initialize() {
        boolean z = true;
        if (!this.rn.getAndSet(true)) {
            Intent registerReceiver = this.context.registerReceiver(null, rk);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.rq = z;
            this.context.registerReceiver(this.rp, rl);
            this.context.registerReceiver(this.ro, rm);
        }
    }

    public boolean fA() {
        return this.rq;
    }

    public void dispose() {
        if (this.rn.getAndSet(false)) {
            this.context.unregisterReceiver(this.rp);
            this.context.unregisterReceiver(this.ro);
        }
    }
}
