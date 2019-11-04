package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.WakeLocks;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemAlarmDispatcher implements ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final String KEY_START_ID = "KEY_START_ID";
    private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
    final CommandHandler mCommandHandler;
    @Nullable
    private CommandsCompletedListener mCompletedListener;
    final Context mContext;
    Intent mCurrentIntent;
    final List<Intent> mIntents;
    private final Handler mMainHandler;
    private final Processor mProcessor;
    private final WorkManagerImpl mWorkManager;
    private final WorkTimer mWorkTimer;

    static class AddRunnable implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;
        private final Intent mIntent;
        private final int mStartId;

        AddRunnable(@NonNull SystemAlarmDispatcher systemAlarmDispatcher, @NonNull Intent intent, int i) {
            this.mDispatcher = systemAlarmDispatcher;
            this.mIntent = intent;
            this.mStartId = i;
        }

        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }

    interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    static class DequeueAndCheckForCompletion implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
            this.mDispatcher = systemAlarmDispatcher;
        }

        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    SystemAlarmDispatcher(@NonNull Context context) {
        this(context, null, null);
    }

    @VisibleForTesting
    SystemAlarmDispatcher(@NonNull Context context, @Nullable Processor processor, @Nullable WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mCommandHandler = new CommandHandler(this.mContext);
        this.mWorkTimer = new WorkTimer();
        if (workManagerImpl == null) {
            workManagerImpl = WorkManagerImpl.getInstance();
        }
        this.mWorkManager = workManagerImpl;
        if (processor == null) {
            processor = this.mWorkManager.getProcessor();
        }
        this.mProcessor = processor;
        this.mProcessor.addExecutionListener(this);
        this.mIntents = new ArrayList();
        this.mCurrentIntent = null;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    /* Access modifiers changed, original: 0000 */
    public void onDestroy() {
        this.mProcessor.removeExecutionListener(this);
        this.mWorkTimer.onDestroy();
        this.mCompletedListener = null;
    }

    public void onExecuted(@NonNull String str, boolean z) {
        postOnMainThread(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, str, z), 0));
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i) {
        Logger logger = Logger.get();
        String str = TAG;
        r2 = new Object[2];
        int i2 = 0;
        r2[0] = intent;
        r2[1] = Integer.valueOf(i);
        logger.debug(str, String.format("Adding command %s (%s)", r2), new Throwable[0]);
        assertMainThread();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(TAG, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra(KEY_START_ID, i);
            synchronized (this.mIntents) {
                if (!this.mIntents.isEmpty()) {
                    i2 = 1;
                }
                this.mIntents.add(intent);
                if (i2 == 0) {
                    processCommand();
                }
            }
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setCompletedListener(@NonNull CommandsCompletedListener commandsCompletedListener) {
        if (this.mCompletedListener != null) {
            Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.mCompletedListener = commandsCompletedListener;
    }

    /* Access modifiers changed, original: 0000 */
    public Processor getProcessor() {
        return this.mProcessor;
    }

    /* Access modifiers changed, original: 0000 */
    public WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    /* Access modifiers changed, original: 0000 */
    public WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    /* Access modifiers changed, original: 0000 */
    public void postOnMainThread(@NonNull Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    /* Access modifiers changed, original: 0000 */
    @MainThread
    public void dequeueAndCheckForCompletion() {
        Logger.get().debug(TAG, "Checking if commands are complete.", new Throwable[0]);
        assertMainThread();
        synchronized (this.mIntents) {
            if (this.mCurrentIntent != null) {
                Logger.get().debug(TAG, String.format("Removing command %s", new Object[]{this.mCurrentIntent}), new Throwable[0]);
                if (((Intent) this.mIntents.remove(0)).equals(this.mCurrentIntent)) {
                    this.mCurrentIntent = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty()) {
                Logger.get().debug(TAG, "No more commands & intents.", new Throwable[0]);
                if (this.mCompletedListener != null) {
                    this.mCompletedListener.onAllCommandsCompleted();
                }
            } else if (!this.mIntents.isEmpty()) {
                processCommand();
            }
        }
    }

    @MainThread
    private void processCommand() {
        assertMainThread();
        WakeLock newWakeLock = WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnBackgroundThread(new Runnable() {
                public void run() {
                    synchronized (SystemAlarmDispatcher.this.mIntents) {
                        SystemAlarmDispatcher.this.mCurrentIntent = (Intent) SystemAlarmDispatcher.this.mIntents.get(0);
                    }
                    if (SystemAlarmDispatcher.this.mCurrentIntent != null) {
                        SystemAlarmDispatcher systemAlarmDispatcher;
                        Runnable dequeueAndCheckForCompletion;
                        String action = SystemAlarmDispatcher.this.mCurrentIntent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(SystemAlarmDispatcher.KEY_START_ID, 0);
                        Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Processing command %s, %s", new Object[]{SystemAlarmDispatcher.this.mCurrentIntent, Integer.valueOf(intExtra)}), new Throwable[0]);
                        WakeLock newWakeLock = WakeLocks.newWakeLock(SystemAlarmDispatcher.this.mContext, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                        try {
                            Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, newWakeLock}), new Throwable[0]);
                            newWakeLock.acquire();
                            SystemAlarmDispatcher.this.mCommandHandler.onHandleIntent(SystemAlarmDispatcher.this.mCurrentIntent, intExtra, SystemAlarmDispatcher.this);
                            Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, newWakeLock}), new Throwable[0]);
                            newWakeLock.release();
                            systemAlarmDispatcher = SystemAlarmDispatcher.this;
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(systemAlarmDispatcher);
                        } catch (Throwable th) {
                            Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, newWakeLock}), new Throwable[0]);
                            newWakeLock.release();
                            systemAlarmDispatcher = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher.postOnMainThread(new DequeueAndCheckForCompletion(systemAlarmDispatcher));
                        }
                        systemAlarmDispatcher.postOnMainThread(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    @MainThread
    private boolean hasIntentWithAction(@NonNull String str) {
        assertMainThread();
        synchronized (this.mIntents) {
            for (Intent action : this.mIntents) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void assertMainThread() {
        if (this.mMainHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }
}
