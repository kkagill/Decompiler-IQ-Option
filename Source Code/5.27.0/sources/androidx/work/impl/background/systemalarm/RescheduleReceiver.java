package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String TAG = Logger.tagWithPrefix("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        Logger.get().debug(TAG, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (VERSION.SDK_INT >= 23) {
            WorkManagerImpl instance = WorkManagerImpl.getInstance();
            if (instance == null) {
                Logger.get().error(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
                return;
            }
            instance.setReschedulePendingResult(goAsync());
            return;
        }
        context.startService(CommandHandler.createRescheduleIntent(context));
    }
}
