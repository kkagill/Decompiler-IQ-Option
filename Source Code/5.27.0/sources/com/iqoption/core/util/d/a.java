package com.iqoption.core.util.d;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0014R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/util/thread/ExecutorHandlerThread;", "Landroid/os/HandlerThread;", "Ljava/util/concurrent/Executor;", "name", "", "(Ljava/lang/String;)V", "value", "Landroid/os/Handler;", "handler", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "handlerCreated", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "isHandlerCreated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "execute", "", "command", "Ljava/lang/Runnable;", "onLooperPrepared", "core_release"})
/* compiled from: ExecutorHandlerThread.kt */
public final class a extends HandlerThread implements Executor {
    private final Condition bSn = this.lock.newCondition();
    private final AtomicBoolean bSo = new AtomicBoolean(false);
    private Handler handler = b.bSp;
    private final ReentrantLock lock = new ReentrantLock();

    public a(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        super(str);
    }

    private final void b(Handler handler) {
        if (!this.bSo.get()) {
            Lock lock = this.lock;
            lock.lock();
            try {
                if (!this.bSo.get()) {
                    this.bSo.set(true);
                    this.bSn.signalAll();
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
            }
        }
        this.handler = handler;
    }

    public final Handler getHandler() {
        if (this.bSo.get()) {
            return this.handler;
        }
        Lock lock = this.lock;
        lock.lock();
        try {
            if (!this.bSo.get()) {
                this.bSn.await();
            }
            Handler handler = this.handler;
            return handler;
        } finally {
            lock.unlock();
        }
    }

    public void execute(Runnable runnable) {
        getHandler().post(runnable);
    }

    /* Access modifiers changed, original: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        b(new Handler(getLooper()));
    }
}
