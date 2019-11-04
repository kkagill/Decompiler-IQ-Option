package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable aaC = new a();
    private static final Runnable aaD = new a();
    private static final Runnable aaE = new a();

    private static final class a implements Runnable {
        public void run() {
        }

        private a() {
        }
    }

    public abstract void b(T t, Throwable th);

    public abstract boolean isDone();

    public abstract String vB();

    public abstract T vC();

    InterruptibleTask() {
    }

    static {
        Class cls = LockSupport.class;
    }

    public final void run() {
        Runnable runnable;
        Object obj;
        int i;
        Runnable runnable2;
        Object obj2;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            Object vC;
            int isDone = isDone() ^ 1;
            if (isDone != 0) {
                try {
                    vC = vC();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, aaC)) {
                        runnable = (Runnable) get();
                        obj = null;
                        i = 0;
                        while (true) {
                            if (runnable != aaD && runnable != aaE) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                runnable2 = aaE;
                                if (runnable == runnable2 || compareAndSet(aaD, runnable2)) {
                                    obj2 = (Thread.interrupted() || obj != null) ? 1 : null;
                                    LockSupport.park(this);
                                    obj = obj2;
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (obj != null) {
                            currentThread.interrupt();
                        }
                    }
                    if (isDone != 0) {
                        b(null, null);
                    }
                }
            } else {
                vC = null;
            }
            if (!compareAndSet(currentThread, aaC)) {
                runnable = (Runnable) get();
                obj = null;
                i = 0;
                while (true) {
                    if (runnable != aaD && runnable != aaE) {
                        break;
                    }
                    i++;
                    if (i > 1000) {
                        runnable2 = aaE;
                        if (runnable == runnable2 || compareAndSet(aaD, runnable2)) {
                            obj2 = (Thread.interrupted() || obj != null) ? 1 : null;
                            LockSupport.park(this);
                            obj = obj2;
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable = (Runnable) get();
                }
                if (obj != null) {
                    currentThread.interrupt();
                }
            }
            if (isDone != 0) {
                b(vC, null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Failed to extract finally block: empty outs */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            return;
     */
    public final void interruptTask() {
        /*
        r4 = this;
        r0 = r4.get();
        r0 = (java.lang.Runnable) r0;
        r1 = r0 instanceof java.lang.Thread;
        if (r1 == 0) goto L_0x003d;
    L_0x000a:
        r1 = aaD;
        r1 = r4.compareAndSet(r0, r1);
        if (r1 == 0) goto L_0x003d;
    L_0x0012:
        r1 = r0;
        r1 = (java.lang.Thread) r1;	 Catch:{ all -> 0x002a }
        r1.interrupt();	 Catch:{ all -> 0x002a }
        r1 = aaC;
        r1 = r4.getAndSet(r1);
        r1 = (java.lang.Runnable) r1;
        r2 = aaE;
        if (r1 != r2) goto L_0x003d;
    L_0x0024:
        r0 = (java.lang.Thread) r0;
        java.util.concurrent.locks.LockSupport.unpark(r0);
        goto L_0x003d;
    L_0x002a:
        r1 = move-exception;
        r2 = aaC;
        r2 = r4.getAndSet(r2);
        r2 = (java.lang.Runnable) r2;
        r3 = aaE;
        if (r2 != r3) goto L_0x003c;
    L_0x0037:
        r0 = (java.lang.Thread) r0;
        java.util.concurrent.locks.LockSupport.unpark(r0);
    L_0x003c:
        throw r1;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.InterruptibleTask.interruptTask():void");
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder;
        Runnable runnable = (Runnable) get();
        if (runnable == aaC) {
            str = "running=[DONE]";
        } else if (runnable == aaD) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("running=[RUNNING ON ");
            stringBuilder.append(((Thread) runnable).getName());
            stringBuilder.append("]");
            str = stringBuilder.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(vB());
        return stringBuilder.toString();
    }
}
