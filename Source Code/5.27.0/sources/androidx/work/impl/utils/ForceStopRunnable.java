package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {
    @VisibleForTesting
    static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
    private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650);
    private final Context mContext;
    private final WorkManagerImpl mWorkManager;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if (ForceStopRunnable.ACTION_FORCE_STOP_RESCHEDULE.equals(intent.getAction())) {
                    Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                    ForceStopRunnable.setAlarm(context);
                }
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
    }

    public void run() {
        if (shouldRescheduleWorkers()) {
            Logger.get().debug(TAG, "Rescheduling Workers.", new Throwable[0]);
            this.mWorkManager.rescheduleEligibleWork();
            this.mWorkManager.getPreferences().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(TAG, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.mWorkManager.rescheduleEligibleWork();
        } else {
            WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
            WorkSpecDao workSpecDao = workDatabase.workSpecDao();
            try {
                workDatabase.beginTransaction();
                List<WorkSpec> enqueuedWork = workSpecDao.getEnqueuedWork();
                if (!(enqueuedWork == null || enqueuedWork.isEmpty())) {
                    Logger.get().debug(TAG, "Found unfinished work, scheduling it.", new Throwable[0]);
                    for (WorkSpec workSpec : enqueuedWork) {
                        workSpecDao.markWorkSpecScheduled(workSpec.id, -1);
                    }
                    Schedulers.schedule(this.mWorkManager.getConfiguration(), workDatabase, this.mWorkManager.getSchedulers());
                }
                workDatabase.setTransactionSuccessful();
                Logger.get().debug(TAG, "Unfinished Workers exist, rescheduling.", new Throwable[0]);
            } finally {
                workDatabase.endTransaction();
            }
        }
        this.mWorkManager.onForceStopRunnableCompleted();
    }

    @VisibleForTesting
    public boolean isForceStopped() {
        if (getPendingIntent(this.mContext, 536870912) != null) {
            return false;
        }
        setAlarm(this.mContext);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public boolean shouldRescheduleWorkers() {
        return this.mWorkManager.getPreferences().needsReschedule();
    }

    private static PendingIntent getPendingIntent(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, getIntent(context), i);
    }

    @VisibleForTesting
    static Intent getIntent(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction(ACTION_FORCE_STOP_RESCHEDULE);
        return intent;
    }

    static void setAlarm(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = getPendingIntent(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + TEN_YEARS;
        if (alarmManager == null) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, pendingIntent);
        } else {
            alarmManager.set(0, currentTimeMillis, pendingIntent);
        }
    }
}
