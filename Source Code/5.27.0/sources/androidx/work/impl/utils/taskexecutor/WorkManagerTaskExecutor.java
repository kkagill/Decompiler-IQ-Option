package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkManagerTaskExecutor implements TaskExecutor {
    private final ExecutorService mBackgroundExecutor = Executors.newSingleThreadExecutor(this.mBackgroundThreadFactory);
    private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {
        private int mThreadsCreated = 0;

        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WorkManager-WorkManagerTaskExecutor-thread-");
            stringBuilder.append(this.mThreadsCreated);
            newThread.setName(stringBuilder.toString());
            this.mThreadsCreated++;
            WorkManagerTaskExecutor.this.mCurrentBackgroundExecutorThread = newThread;
            return newThread;
        }
    };
    volatile Thread mCurrentBackgroundExecutorThread;
    private final Executor mMainThreadExecutor = new Executor() {
        public void execute(@NonNull Runnable runnable) {
            WorkManagerTaskExecutor.this.postToMainThread(runnable);
        }
    };
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());

    public void postToMainThread(Runnable runnable) {
        this.mMainThreadHandler.post(runnable);
    }

    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    public void executeOnBackgroundThread(Runnable runnable) {
        this.mBackgroundExecutor.execute(runnable);
    }

    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    @NonNull
    public Thread getBackgroundExecutorThread() {
        return this.mCurrentBackgroundExecutorThread;
    }
}
