package com.iqoption.analytics;

import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Constraints.Builder;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.app.IQApp;
import com.iqoption.app.db.a;
import com.iqoption.core.d;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EventManager implements LifecycleObserver {
    private static final String TAG = "com.iqoption.analytics.EventManager";
    private static Condition aqI = initLock.newCondition();
    private static AtomicBoolean aqJ = new AtomicBoolean();
    private static volatile EventManager aqM;
    private static Lock initLock = new ReentrantLock();
    private final ExecutorService aqH = Executors.newSingleThreadExecutor();
    private final n<WorkManager> aqK = Suppliers.b(-$$Lambda$EventManager$KAANXvgoi4ccN1HcvimGyEKSHHc.INSTANCE);
    private a aqL;
    private final Constraints constraints = new Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();

    private static /* synthetic */ WorkManager BY() {
        try {
            return WorkManager.getInstance();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized EventManager BS() {
        EventManager eventManager;
        synchronized (EventManager.class) {
            if (aqM == null) {
                synchronized (EventManager.class) {
                    if (aqM == null) {
                        aqM = new EventManager();
                    }
                }
            }
            eventManager = aqM;
        }
        return eventManager;
    }

    private EventManager() {
        BT();
    }

    private void BT() {
        this.aqH.execute(new -$$Lambda$EventManager$iYaCkWWPhH-uXQPjthg_vTjl2Dk(this));
    }

    private /* synthetic */ void BX() {
        try {
            initLock.lock();
            this.aqL = new a(IQApp.Eu());
            aqJ.set(true);
            aqI.signalAll();
        } finally {
            initLock.unlock();
        }
    }

    public static void BU() {
        try {
            initLock.lock();
            if (!aqJ.get()) {
                aqI.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            initLock.unlock();
        }
        initLock.unlock();
    }

    /* Access modifiers changed, original: 0000 */
    @OnLifecycleEvent(Event.ON_START)
    public void onStart() {
        WorkRequest workRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) new PeriodicWorkRequest.Builder(SyncWorker.class, (long) PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, TimeUnit.MILLISECONDS).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 30000, TimeUnit.MILLISECONDS)).setConstraints(this.constraints)).addTag("PERIODIC")).build();
        WorkManager workManager = (WorkManager) this.aqK.get();
        if (workManager != null) {
            workManager.enqueue(workRequest);
        }
    }

    /* Access modifiers changed, original: 0000 */
    @OnLifecycleEvent(Event.ON_STOP)
    public void onStop() {
        WorkRequest workRequest = (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(EventsSendWorker.class).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 30000, TimeUnit.MILLISECONDS)).setConstraints(this.constraints)).addTag("SEND_EVENTS_BEFOR_EXIT")).build();
        WorkManager workManager = (WorkManager) this.aqK.get();
        if (workManager != null) {
            workManager.cancelAllWork();
            workManager.enqueue(workRequest);
        }
    }

    @WorkerThread
    public void f(ArrayList<com.iqoption.dto.Event> arrayList) {
        this.aqL.f(arrayList);
    }

    @WorkerThread
    public ArrayList<com.iqoption.dto.Event> aA(boolean z) {
        return this.aqL.aA(z);
    }

    @WorkerThread
    public Long BV() {
        return this.aqL.BV();
    }

    public void a(com.iqoption.dto.Event event) {
        if (event != null) {
            if (com.iqoption.core.data.d.a.bdi.Wm() && !d.Un().Ds()) {
                d.Un().Dr();
            }
            this.aqH.execute(new -$$Lambda$EventManager$-K6ezeiCMCrE7zI76dEN6h1Vbww(this, event));
        }
    }

    private /* synthetic */ void b(com.iqoption.dto.Event event) {
        BU();
        if (this.aqL.c(event) > 10) {
            BW();
        }
    }

    public void BW() {
        String str = "ONESHOT";
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(EventsSendWorker.class).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 30000, TimeUnit.MILLISECONDS)).setConstraints(this.constraints)).addTag(str)).build();
        WorkManager workManager = (WorkManager) this.aqK.get();
        if (workManager != null) {
            workManager.beginUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequest).enqueue();
        }
    }
}
