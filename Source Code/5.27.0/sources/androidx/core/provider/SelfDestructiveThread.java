package androidx.core.provider;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private Callback mCallback = new Callback() {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                SelfDestructiveThread.this.onDestruction();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                SelfDestructiveThread.this.onInvokeRunnable((Runnable) message.obj);
                return true;
            }
        }
    };
    private final int mDestructAfterMillisec;
    @GuardedBy("mLock")
    private int mGeneration;
    @GuardedBy("mLock")
    private Handler mHandler;
    private final Object mLock = new Object();
    private final int mPriority;
    @GuardedBy("mLock")
    private HandlerThread mThread;
    private final String mThreadName;

    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.mThreadName = str;
        this.mPriority = i;
        this.mDestructAfterMillisec = i2;
        this.mGeneration = 0;
    }

    @VisibleForTesting
    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mThread != null;
        }
        return z;
    }

    @VisibleForTesting
    public int getGeneration() {
        int i;
        synchronized (this.mLock) {
            i = this.mGeneration;
        }
        return i;
    }

    private void post(Runnable runnable) {
        synchronized (this.mLock) {
            if (this.mThread == null) {
                this.mThread = new HandlerThread(this.mThreadName, this.mPriority);
                this.mThread.start();
                this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);
                this.mGeneration++;
            }
            this.mHandler.removeMessages(0);
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, runnable));
        }
    }

    public <T> void postAndReply(final Callable<T> callable, final ReplyCallback<T> replyCallback) {
        final Handler handler = new Handler();
        post(new Runnable() {
            public void run() {
                Object call;
                try {
                    call = callable.call();
                } catch (Exception unused) {
                    call = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        replyCallback.onReply(call);
                    }
                });
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045 A:{SYNTHETIC} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003f */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(4:24|13|14|15)(2:16|(1:18)(3:19|20|21))) */
    public <T> T postAndWait(java.util.concurrent.Callable<T> r13, int r14) {
        /*
        r12 = this;
        r7 = new java.util.concurrent.locks.ReentrantLock;
        r7.<init>();
        r8 = r7.newCondition();
        r9 = new java.util.concurrent.atomic.AtomicReference;
        r9.<init>();
        r10 = new java.util.concurrent.atomic.AtomicBoolean;
        r0 = 1;
        r10.<init>(r0);
        r11 = new androidx.core.provider.SelfDestructiveThread$3;
        r0 = r11;
        r1 = r12;
        r2 = r9;
        r3 = r13;
        r4 = r7;
        r5 = r10;
        r6 = r8;
        r0.<init>(r2, r3, r4, r5, r6);
        r12.post(r11);
        r7.lock();
        r13 = r10.get();	 Catch:{ all -> 0x005d }
        if (r13 != 0) goto L_0x0034;
    L_0x002c:
        r13 = r9.get();	 Catch:{ all -> 0x005d }
        r7.unlock();
        return r13;
    L_0x0034:
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x005d }
        r0 = (long) r14;	 Catch:{ all -> 0x005d }
        r13 = r13.toNanos(r0);	 Catch:{ all -> 0x005d }
    L_0x003b:
        r13 = r8.awaitNanos(r13);	 Catch:{ InterruptedException -> 0x003f }
    L_0x003f:
        r0 = r10.get();	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x004d;
    L_0x0045:
        r13 = r9.get();	 Catch:{ all -> 0x005d }
        r7.unlock();
        return r13;
    L_0x004d:
        r0 = 0;
        r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0054;
    L_0x0053:
        goto L_0x003b;
    L_0x0054:
        r13 = new java.lang.InterruptedException;	 Catch:{ all -> 0x005d }
        r14 = "timeout";
        r13.<init>(r14);	 Catch:{ all -> 0x005d }
        throw r13;	 Catch:{ all -> 0x005d }
    L_0x005d:
        r13 = move-exception;
        r7.unlock();
        goto L_0x0063;
    L_0x0062:
        throw r13;
    L_0x0063:
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.SelfDestructiveThread.postAndWait(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* Access modifiers changed, original: 0000 */
    public void onInvokeRunnable(Runnable runnable) {
        runnable.run();
        synchronized (this.mLock) {
            this.mHandler.removeMessages(0);
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0), (long) this.mDestructAfterMillisec);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onDestruction() {
        synchronized (this.mLock) {
            if (this.mHandler.hasMessages(1)) {
                return;
            }
            this.mThread.quit();
            this.mThread = null;
            this.mHandler = null;
        }
    }
}
