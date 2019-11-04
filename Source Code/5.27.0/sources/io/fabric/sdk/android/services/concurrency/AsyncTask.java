package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE;
    private static final int MAXIMUM_POOL_SIZE;
    public static final Executor SERIAL_EXECUTOR = new c();
    public static final Executor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1, TimeUnit.SECONDS, eNJ, eNI);
    private static volatile Executor ack = SERIAL_EXECUTOR;
    private static final int eNH = Runtime.getRuntime().availableProcessors();
    private static final ThreadFactory eNI = new ThreadFactory() {
        private final AtomicInteger count = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AsyncTask #");
            stringBuilder.append(this.count.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    };
    private static final BlockingQueue<Runnable> eNJ = new LinkedBlockingQueue(128);
    private static final b eNK = new b();
    private final d<Params, Result> eNL = new d<Params, Result>() {
        public Result call() {
            AsyncTask.this.eNP.set(true);
            Process.setThreadPriority(10);
            AsyncTask asyncTask = AsyncTask.this;
            return asyncTask.postResult(asyncTask.doInBackground(this.eNY));
        }
    };
    private final FutureTask<Result> eNM = new FutureTask<Result>(this.eNL) {
        /* Access modifiers changed, original: protected */
        public void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            }
        }
    };
    private volatile Status eNN = Status.PENDING;
    private final AtomicBoolean eNO = new AtomicBoolean();
    private final AtomicBoolean eNP = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] eNR = new int[Status.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.values();
            r0 = r0.length;
            r0 = new int[r0];
            eNR = r0;
            r0 = eNR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.RUNNING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eNR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.FINISHED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.AsyncTask$AnonymousClass4.<clinit>():void");
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static class a<Data> {
        final AsyncTask eNS;
        final Data[] eNT;

        a(AsyncTask asyncTask, Data... dataArr) {
            this.eNS = asyncTask;
            this.eNT = dataArr;
        }
    }

    private static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.eNS.finish(aVar.eNT[0]);
            } else if (i == 2) {
                aVar.eNS.onProgressUpdate(aVar.eNT);
            }
        }
    }

    private static class c implements Executor {
        final LinkedList<Runnable> eNU;
        Runnable eNV;

        private c() {
            this.eNU = new LinkedList();
        }

        /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        public synchronized void execute(final Runnable runnable) {
            this.eNU.offer(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        c.this.bjP();
                    }
                }
            });
            if (this.eNV == null) {
                bjP();
            }
        }

        /* Access modifiers changed, original: protected|declared_synchronized */
        public synchronized void bjP() {
            Runnable runnable = (Runnable) this.eNU.poll();
            this.eNV = runnable;
            if (runnable != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(this.eNV);
            }
        }
    }

    private static abstract class d<Params, Result> implements Callable<Result> {
        Params[] eNY;

        private d() {
        }

        /* synthetic */ d(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public abstract Result doInBackground(Params... paramsArr);

    /* Access modifiers changed, original: protected */
    public void onCancelled() {
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(Result result) {
    }

    /* Access modifiers changed, original: protected */
    public void onPreExecute() {
    }

    /* Access modifiers changed, original: protected|varargs */
    public void onProgressUpdate(Progress... progressArr) {
    }

    static {
        int i = eNH;
        CORE_POOL_SIZE = i + 1;
        MAXIMUM_POOL_SIZE = (i * 2) + 1;
    }

    private void postResultIfNotInvoked(Result result) {
        if (!this.eNP.get()) {
            postResult(result);
        }
    }

    private Result postResult(Result result) {
        eNK.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    public final Status bjO() {
        return this.eNN;
    }

    /* Access modifiers changed, original: protected */
    public void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean isCancelled() {
        return this.eNO.get();
    }

    public final boolean cancel(boolean z) {
        this.eNO.set(true);
        return this.eNM.cancel(z);
    }

    public final AsyncTask<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.eNN != Status.PENDING) {
            int i = AnonymousClass4.eNR[this.eNN.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.eNN = Status.RUNNING;
        onPreExecute();
        this.eNL.eNY = paramsArr;
        executor.execute(this.eNM);
        return this;
    }

    private void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.eNN = Status.FINISHED;
    }
}
