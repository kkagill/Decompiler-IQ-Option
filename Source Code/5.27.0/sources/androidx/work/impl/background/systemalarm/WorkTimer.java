package androidx.work.impl.background.systemalarm;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@RestrictTo({Scope.LIBRARY_GROUP})
class WorkTimer {
    private static final String TAG = Logger.tagWithPrefix("WorkTimer");
    private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {
        private int mThreadsCreated = 0;

        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WorkManager-WorkTimer-thread-");
            stringBuilder.append(this.mThreadsCreated);
            newThread.setName(stringBuilder.toString());
            this.mThreadsCreated++;
            return newThread;
        }
    };
    private final ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor(this.mBackgroundThreadFactory);
    final Map<String, TimeLimitExceededListener> mListeners = new HashMap();
    final Object mLock = new Object();
    final Map<String, WorkTimerRunnable> mTimerMap = new HashMap();

    interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull String str);
    }

    static class WorkTimerRunnable implements Runnable {
        static final String TAG = "WrkTimerRunnable";
        private final String mWorkSpecId;
        private final WorkTimer mWorkTimer;

        WorkTimerRunnable(@NonNull WorkTimer workTimer, @NonNull String str) {
            this.mWorkTimer = workTimer;
            this.mWorkSpecId = str;
        }

        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (((WorkTimerRunnable) this.mWorkTimer.mTimerMap.remove(this.mWorkSpecId)) != null) {
                    TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.mWorkTimer.mListeners.remove(this.mWorkSpecId);
                    if (timeLimitExceededListener != null) {
                        timeLimitExceededListener.onTimeLimitExceeded(this.mWorkSpecId);
                    }
                } else {
                    Logger.get().debug(TAG, String.format("Timer with %s is already marked as complete.", new Object[]{this.mWorkSpecId}), new Throwable[0]);
                }
            }
        }
    }

    WorkTimer() {
    }

    /* Access modifiers changed, original: 0000 */
    public void startTimer(@NonNull String str, long j, @NonNull TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            stopTimer(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.mTimerMap.put(str, workTimerRunnable);
            this.mListeners.put(str, timeLimitExceededListener);
            this.mExecutorService.schedule(workTimerRunnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void stopTimer(@NonNull String str) {
        synchronized (this.mLock) {
            if (((WorkTimerRunnable) this.mTimerMap.remove(str)) != null) {
                Logger.get().debug(TAG, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.mListeners.remove(str);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onDestroy() {
        this.mExecutorService.shutdownNow();
    }

    /* Access modifiers changed, original: declared_synchronized */
    @VisibleForTesting
    public synchronized Map<String, WorkTimerRunnable> getTimerMap() {
        return this.mTimerMap;
    }

    /* Access modifiers changed, original: declared_synchronized */
    @VisibleForTesting
    public synchronized Map<String, TimeLimitExceededListener> getListeners() {
        return this.mListeners;
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public ScheduledExecutorService getExecutorService() {
        return this.mExecutorService;
    }
}
