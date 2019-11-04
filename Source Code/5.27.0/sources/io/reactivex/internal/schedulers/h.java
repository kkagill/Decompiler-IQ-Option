package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerPoolFactory */
public final class h {
    public static final int eTA;
    static final AtomicReference<ScheduledExecutorService> eTB = new AtomicReference();
    static final Map<ScheduledThreadPoolExecutor, Object> eTC = new ConcurrentHashMap();
    public static final boolean eTz;

    /* compiled from: SchedulerPoolFactory */
    static final class a {
        boolean eTD;
        int eTE;

        a() {
        }

        /* Access modifiers changed, original: 0000 */
        public void b(Properties properties) {
            String str = "rx2.purge-enabled";
            if (properties.containsKey(str)) {
                this.eTD = Boolean.parseBoolean(properties.getProperty(str));
            } else {
                this.eTD = true;
            }
            if (this.eTD) {
                str = "rx2.purge-period-seconds";
                if (properties.containsKey(str)) {
                    try {
                        this.eTE = Integer.parseInt(properties.getProperty(str));
                        return;
                    } catch (NumberFormatException unused) {
                        this.eTE = 1;
                        return;
                    }
                }
            }
            this.eTE = 1;
        }
    }

    /* compiled from: SchedulerPoolFactory */
    static final class b implements Runnable {
        b() {
        }

        public void run() {
            Iterator it = new ArrayList(h.eTC.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    h.eTC.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.b(properties);
        eTz = aVar.eTD;
        eTA = aVar.eTE;
        start();
    }

    public static void start() {
        gp(eTz);
    }

    static void gp(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eTB.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (eTB.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        b bVar = new b();
                        int i = eTA;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        a(eTz, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static void a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            eTC.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
