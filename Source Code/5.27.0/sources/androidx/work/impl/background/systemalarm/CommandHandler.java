package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CommandHandler implements ExecutionListener {
    static final String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final String TAG = Logger.tagWithPrefix("CommandHandler");
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final Context mContext;
    private final Object mLock = new Object();
    private final Map<String, ExecutionListener> mPendingDelayMet = new HashMap();

    static Intent createScheduleWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_SCHEDULE_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    static Intent createDelayMetIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_DELAY_MET);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    static Intent createStopWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    static Intent createConstraintsChangedIntent(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_CONSTRAINTS_CHANGED);
        return intent;
    }

    static Intent createRescheduleIntent(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_RESCHEDULE);
        return intent;
    }

    static Intent createExecutionCompletedIntent(@NonNull Context context, @NonNull String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_EXECUTION_COMPLETED);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        intent.putExtra(KEY_NEEDS_RESCHEDULE, z);
        return intent;
    }

    CommandHandler(@NonNull Context context) {
        this.mContext = context;
    }

    public void onExecuted(@NonNull String str, boolean z) {
        synchronized (this.mLock) {
            ExecutionListener executionListener = (ExecutionListener) this.mPendingDelayMet.remove(str);
            if (executionListener != null) {
                executionListener.onExecuted(str, z);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasPendingCommands() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mPendingDelayMet.isEmpty();
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    @WorkerThread
    public void onHandleIntent(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if (ACTION_CONSTRAINTS_CHANGED.equals(action)) {
            handleConstraintsChanged(intent, i, systemAlarmDispatcher);
        } else if (ACTION_RESCHEDULE.equals(action)) {
            handleReschedule(intent, i, systemAlarmDispatcher);
        } else {
            if (!hasKeys(intent.getExtras(), KEY_WORKSPEC_ID)) {
                Logger.get().error(TAG, String.format("Invalid request for %s, requires %s.", new Object[]{action, r2}), new Throwable[0]);
            } else if (ACTION_SCHEDULE_WORK.equals(action)) {
                handleScheduleWorkIntent(intent, i, systemAlarmDispatcher);
            } else if (ACTION_DELAY_MET.equals(action)) {
                handleDelayMet(intent, i, systemAlarmDispatcher);
            } else if (ACTION_STOP_WORK.equals(action)) {
                handleStopWork(intent, i, systemAlarmDispatcher);
            } else if (ACTION_EXECUTION_COMPLETED.equals(action)) {
                handleExecutionCompleted(intent, i, systemAlarmDispatcher);
            } else {
                Logger.get().warning(TAG, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }

    private void handleScheduleWorkIntent(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString(KEY_WORKSPEC_ID);
        Logger.get().debug(TAG, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase workDatabase = systemAlarmDispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(string);
            String str = "Skipping scheduling ";
            Logger logger;
            String str2;
            StringBuilder stringBuilder;
            if (workSpec == null) {
                logger = Logger.get();
                str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(string);
                stringBuilder.append(" because it's no longer in the DB");
                logger.warning(str2, stringBuilder.toString(), new Throwable[0]);
            } else if (workSpec.state.isFinished()) {
                logger = Logger.get();
                str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(string);
                stringBuilder.append("because it is finished.");
                logger.warning(str2, stringBuilder.toString(), new Throwable[0]);
                workDatabase.endTransaction();
            } else {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                if (workSpec.hasConstraints()) {
                    Logger.get().debug(TAG, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(calculateNextRunTime)}), new Throwable[0]);
                    Alarms.setAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string, calculateNextRunTime);
                    systemAlarmDispatcher.postOnMainThread(new AddRunnable(systemAlarmDispatcher, createConstraintsChangedIntent(this.mContext), i));
                } else {
                    Logger.get().debug(TAG, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(calculateNextRunTime)}), new Throwable[0]);
                    Alarms.setAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string, calculateNextRunTime);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleDelayMet(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.mLock) {
            String string = extras.getString(KEY_WORKSPEC_ID);
            Logger.get().debug(TAG, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (this.mPendingDelayMet.containsKey(string)) {
                Logger.get().debug(TAG, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            } else {
                DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.mContext, i, string, systemAlarmDispatcher);
                this.mPendingDelayMet.put(string, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            }
        }
    }

    private void handleStopWork(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString(KEY_WORKSPEC_ID);
        Logger.get().debug(TAG, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        systemAlarmDispatcher.getWorkManager().stopWork(string);
        Alarms.cancelAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string);
        systemAlarmDispatcher.onExecuted(string, false);
    }

    private void handleConstraintsChanged(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.get().debug(TAG, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new ConstraintsCommandHandler(this.mContext, i, systemAlarmDispatcher).handleConstraintsChanged();
    }

    private void handleReschedule(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.get().debug(TAG, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        systemAlarmDispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleExecutionCompleted(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Bundle extras = intent.getExtras();
        String string = extras.getString(KEY_WORKSPEC_ID);
        boolean z = extras.getBoolean(KEY_NEEDS_RESCHEDULE);
        Logger.get().debug(TAG, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        onExecuted(string, z);
    }

    private static boolean hasKeys(@Nullable Bundle bundle, @NonNull String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
