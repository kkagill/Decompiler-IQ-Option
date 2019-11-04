package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class af {
    private final PendingResult adP;
    private final ScheduledFuture<?> adQ;
    final Intent intent;
    private boolean zzaa = false;

    af(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.intent = intent;
        this.adP = pendingResult;
        this.adQ = scheduledExecutorService.schedule(new ae(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void finish() {
        if (!this.zzaa) {
            this.adP.finish();
            this.adQ.cancel(false);
            this.zzaa = true;
        }
    }
}
