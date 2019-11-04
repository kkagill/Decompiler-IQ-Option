package com.google.common.util.concurrent;

import com.google.common.base.i;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class TimeoutFuture<V> extends a<V> {
    private t<V> aaY;
    private ScheduledFuture<?> aaZ;

    private static final class TimeoutFutureException extends TimeoutException {
        private TimeoutFutureException(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    private static final class a<V> implements Runnable {
        TimeoutFuture<V> aba;

        a(TimeoutFuture<V> timeoutFuture) {
            this.aba = timeoutFuture;
        }

        public void run() {
            TimeoutFuture timeoutFuture = this.aba;
            if (timeoutFuture != null) {
                t a = timeoutFuture.aaY;
                if (a != null) {
                    this.aba = null;
                    if (a.isDone()) {
                        timeoutFuture.setFuture(a);
                    } else {
                        try {
                            ScheduledFuture b = timeoutFuture.aaZ;
                            String str = "Timed out";
                            if (b != null) {
                                long abs = Math.abs(b.getDelay(TimeUnit.MILLISECONDS));
                                if (abs > 10) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(str);
                                    stringBuilder.append(" (timeout delayed by ");
                                    stringBuilder.append(abs);
                                    stringBuilder.append(" ms after scheduled time)");
                                    str = stringBuilder.toString();
                                }
                            }
                            timeoutFuture.aaZ = null;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str);
                            stringBuilder2.append(": ");
                            stringBuilder2.append(a);
                            timeoutFuture.setException(new TimeoutFutureException(stringBuilder2.toString()));
                        } finally {
                            a.cancel(true);
                        }
                    }
                }
            }
        }
    }

    static <V> t<V> b(t<V> tVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(tVar);
        a aVar = new a(timeoutFuture);
        timeoutFuture.aaZ = scheduledExecutorService.schedule(aVar, j, timeUnit);
        tVar.addListener(aVar, x.vG());
        return timeoutFuture;
    }

    private TimeoutFuture(t<V> tVar) {
        this.aaY = (t) i.checkNotNull(tVar);
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        t tVar = this.aaY;
        ScheduledFuture scheduledFuture = this.aaZ;
        if (tVar == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("inputFuture=[");
        stringBuilder.append(tVar);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(", remaining delay=[");
                stringBuilder3.append(delay);
                stringBuilder3.append(" ms]");
                stringBuilder2 = stringBuilder3.toString();
            }
        }
        return stringBuilder2;
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
        maybePropagateCancellationTo(this.aaY);
        ScheduledFuture scheduledFuture = this.aaZ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.aaY = null;
        this.aaZ = null;
    }
}
