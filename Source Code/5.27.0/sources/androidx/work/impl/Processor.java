package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.WorkerWrapper.Builder;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@RestrictTo({Scope.LIBRARY_GROUP})
public class Processor implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Set<String> mCancelledIds;
    private Configuration mConfiguration;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private final Object mLock;
    private final List<ExecutionListener> mOuterListeners;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;

    private static class FutureListener implements Runnable {
        @NonNull
        private ExecutionListener mExecutionListener;
        @NonNull
        private t<Boolean> mFuture;
        @NonNull
        private String mWorkSpecId;

        FutureListener(@NonNull ExecutionListener executionListener, @NonNull String str, @NonNull t<Boolean> tVar) {
            this.mExecutionListener = executionListener;
            this.mWorkSpecId = str;
            this.mFuture = tVar;
        }

        public void run() {
            boolean booleanValue;
            try {
                booleanValue = ((Boolean) this.mFuture.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                booleanValue = true;
            }
            this.mExecutionListener.onExecuted(this.mWorkSpecId, booleanValue);
        }
    }

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
        this.mCancelledIds = new HashSet();
        this.mOuterListeners = new ArrayList();
        this.mLock = new Object();
    }

    public boolean startWork(String str) {
        return startWork(str, null);
    }

    public boolean startWork(String str, RuntimeExtras runtimeExtras) {
        synchronized (this.mLock) {
            if (this.mEnqueuedWorkMap.containsKey(str)) {
                Logger.get().debug(TAG, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            WorkerWrapper build = new Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this.mWorkDatabase, str).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
            t future = build.getFuture();
            future.addListener(new FutureListener(this, str, future), this.mWorkTaskExecutor.getMainThreadExecutor());
            this.mEnqueuedWorkMap.put(str, build);
            this.mWorkTaskExecutor.getBackgroundExecutor().execute(build);
            Logger.get().debug(TAG, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean stopWork(String str) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            WorkerWrapper workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(str);
            if (workerWrapper != null) {
                workerWrapper.interrupt(false);
                Logger.get().debug(TAG, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean stopAndCancelWork(String str) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.mCancelledIds.add(str);
            WorkerWrapper workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(str);
            if (workerWrapper != null) {
                workerWrapper.interrupt(true);
                Logger.get().debug(TAG, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean isCancelled(String str) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCancelledIds.contains(str);
        }
        return contains;
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mEnqueuedWorkMap.isEmpty();
        }
        return z;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean containsKey;
        synchronized (this.mLock) {
            containsKey = this.mEnqueuedWorkMap.containsKey(str);
        }
        return containsKey;
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    public void onExecuted(@NonNull String str, boolean z) {
        synchronized (this.mLock) {
            this.mEnqueuedWorkMap.remove(str);
            Logger.get().debug(TAG, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (ExecutionListener onExecuted : this.mOuterListeners) {
                onExecuted.onExecuted(str, z);
            }
        }
    }
}
