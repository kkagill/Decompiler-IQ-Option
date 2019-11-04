package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import java.util.Collections;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DelayMetCommandHandler implements ExecutionListener, TimeLimitExceededListener, WorkConstraintsCallback {
    private static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
    private final Context mContext;
    private final SystemAlarmDispatcher mDispatcher;
    private boolean mHasConstraints = false;
    private boolean mHasPendingStopWorkCommand = false;
    private final Object mLock = new Object();
    private final int mStartId;
    @Nullable
    private WakeLock mWakeLock;
    private final WorkConstraintsTracker mWorkConstraintsTracker = new WorkConstraintsTracker(this.mContext, (WorkConstraintsCallback) this);
    private final String mWorkSpecId;

    DelayMetCommandHandler(@NonNull Context context, int i, @NonNull String str, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        this.mContext = context;
        this.mStartId = i;
        this.mDispatcher = systemAlarmDispatcher;
        this.mWorkSpecId = str;
    }

    public void onAllConstraintsMet(@NonNull List<String> list) {
        if (list.contains(this.mWorkSpecId)) {
            Logger.get().debug(TAG, String.format("onAllConstraintsMet for %s", new Object[]{this.mWorkSpecId}), new Throwable[0]);
            if (this.mDispatcher.getProcessor().startWork(this.mWorkSpecId)) {
                this.mDispatcher.getWorkTimer().startTimer(this.mWorkSpecId, 600000, this);
            } else {
                cleanUp();
            }
        }
    }

    public void onExecuted(@NonNull String str, boolean z) {
        Intent createScheduleWorkIntent;
        SystemAlarmDispatcher systemAlarmDispatcher;
        Logger.get().debug(TAG, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        cleanUp();
        if (z) {
            createScheduleWorkIntent = CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkSpecId);
            systemAlarmDispatcher = this.mDispatcher;
            systemAlarmDispatcher.postOnMainThread(new AddRunnable(systemAlarmDispatcher, createScheduleWorkIntent, this.mStartId));
        }
        if (this.mHasConstraints) {
            createScheduleWorkIntent = CommandHandler.createConstraintsChangedIntent(this.mContext);
            systemAlarmDispatcher = this.mDispatcher;
            systemAlarmDispatcher.postOnMainThread(new AddRunnable(systemAlarmDispatcher, createScheduleWorkIntent, this.mStartId));
        }
    }

    public void onTimeLimitExceeded(@NonNull String str) {
        Logger.get().debug(TAG, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        stopWork();
    }

    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        stopWork();
    }

    /* Access modifiers changed, original: 0000 */
    @WorkerThread
    public void handleProcessWork() {
        this.mWakeLock = WakeLocks.newWakeLock(this.mContext, String.format("%s (%s)", new Object[]{this.mWorkSpecId, Integer.valueOf(this.mStartId)}));
        Logger.get().debug(TAG, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.mWakeLock, this.mWorkSpecId}), new Throwable[0]);
        this.mWakeLock.acquire();
        WorkSpec workSpec = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(this.mWorkSpecId);
        if (workSpec == null) {
            stopWork();
            return;
        }
        this.mHasConstraints = workSpec.hasConstraints();
        if (this.mHasConstraints) {
            this.mWorkConstraintsTracker.replace(Collections.singletonList(workSpec));
        } else {
            Logger.get().debug(TAG, String.format("No constraints for %s", new Object[]{this.mWorkSpecId}), new Throwable[0]);
            onAllConstraintsMet(Collections.singletonList(this.mWorkSpecId));
        }
    }

    private void stopWork() {
        synchronized (this.mLock) {
            if (this.mHasPendingStopWorkCommand) {
                Logger.get().debug(TAG, String.format("Already stopped work for %s", new Object[]{this.mWorkSpecId}), new Throwable[0]);
            } else {
                Logger.get().debug(TAG, String.format("Stopping work for workspec %s", new Object[]{this.mWorkSpecId}), new Throwable[0]);
                this.mDispatcher.postOnMainThread(new AddRunnable(this.mDispatcher, CommandHandler.createStopWorkIntent(this.mContext, this.mWorkSpecId), this.mStartId));
                if (this.mDispatcher.getProcessor().isEnqueued(this.mWorkSpecId)) {
                    Logger.get().debug(TAG, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.mWorkSpecId}), new Throwable[0]);
                    this.mDispatcher.postOnMainThread(new AddRunnable(this.mDispatcher, CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkSpecId), this.mStartId));
                } else {
                    Logger.get().debug(TAG, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.mWorkSpecId}), new Throwable[0]);
                }
                this.mHasPendingStopWorkCommand = true;
            }
        }
    }

    private void cleanUp() {
        synchronized (this.mLock) {
            this.mWorkConstraintsTracker.reset();
            this.mDispatcher.getWorkTimer().stopTimer(this.mWorkSpecId);
            if (this.mWakeLock != null && this.mWakeLock.isHeld()) {
                Logger.get().debug(TAG, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.mWakeLock, this.mWorkSpecId}), new Throwable[0]);
                this.mWakeLock.release();
            }
        }
    }
}
