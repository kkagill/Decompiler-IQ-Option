package com.jumio.analytics.agents;

import com.jumio.analytics.EventDispatcher;
import com.jumio.analytics.Filter;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.commons.log.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FixedRateAgent extends EventAgent implements Runnable {
    private ScheduledFuture<?> mEventChecker;
    private int mSendIntervalMsec;
    private final ScheduledExecutorService scheduler;

    public FixedRateAgent(EventDispatcher eventDispatcher, Filter filter) {
        super(new ConcurrentLinkedQueue());
        this.scheduler = Executors.newScheduledThreadPool(1);
        this.mSendIntervalMsec = 20000;
        this.mEventDispatcher = eventDispatcher;
        start();
        this.mFilter = filter;
    }

    public FixedRateAgent() {
        super(new ConcurrentLinkedQueue());
        this.scheduler = Executors.newScheduledThreadPool(1);
        this.mSendIntervalMsec = 20000;
        this.mEventDispatcher = null;
        start();
    }

    private void initTimedHandler() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("start with fixed rate at P=");
        stringBuilder.append(this.mSendIntervalMsec);
        stringBuilder.append(" ms");
        String stringBuilder2 = stringBuilder.toString();
        String str = JumioAnalytics.LOGTAG;
        Log.v(str, stringBuilder2);
        if (this.mEventChecker != null) {
            Log.v(str, "cancelling old event handler");
            this.mEventChecker.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        int i = this.mSendIntervalMsec;
        this.mEventChecker = scheduledExecutorService.scheduleWithFixedDelay(this, (long) i, (long) i, TimeUnit.MILLISECONDS);
    }

    public void stop() {
        super.stop();
        ScheduledFuture scheduledFuture = this.mEventChecker;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.mEventChecker.cancel(true);
        }
    }

    public void start() {
        initTimedHandler();
    }

    public void flush() {
        Log.d(JumioAnalytics.LOGTAG, "flush() queue");
        ScheduledFuture scheduledFuture = this.mEventChecker;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        synchronized (this.queueLock) {
            if (this.mRequestQueue.isEmpty()) {
                Log.v(JumioAnalytics.LOGTAG, " -- nothing to flush()");
                return;
            }
            dispatchAndClear();
        }
    }

    public void run() {
        int size = this.mRequestQueue.size();
        String str = JumioAnalytics.LOGTAG;
        if (size > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("time trigger: dispatch ");
            stringBuilder.append(this.mRequestQueue.size());
            stringBuilder.append(" events");
            Log.d(str, stringBuilder.toString());
            dispatchAndClear();
            return;
        }
        Log.v(str, "time trigger: NOOP (no events)");
    }

    public void setSendInterval(int i) {
        this.mSendIntervalMsec = i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("set new interval to ");
        stringBuilder.append(i);
        Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
        initTimedHandler();
    }
}
