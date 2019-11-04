package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import okio.Timeout;

final class RealCall implements Call {
    final OkHttpClient client;
    private EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    final AsyncTimeout timeout = new AsyncTimeout() {
        /* Access modifiers changed, original: protected */
        public void timedOut() {
            RealCall.this.cancel();
        }
    };

    final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        static {
            Class cls = RealCall.class;
        }

        AsyncCall(Callback callback) {
            super("OkHttp %s", r3.redactedUrl());
            this.responseCallback = callback;
        }

        /* Access modifiers changed, original: 0000 */
        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        /* Access modifiers changed, original: 0000 */
        public Request request() {
            return RealCall.this.originalRequest;
        }

        /* Access modifiers changed, original: 0000 */
        public RealCall get() {
            return RealCall.this;
        }

        /* Access modifiers changed, original: 0000 */
        public void executeOn(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                this.responseCallback.onFailure(RealCall.this, interruptedIOException);
            } finally {
                RealCall.this.client.dispatcher().finished(this);
            }
        }

        /* Access modifiers changed, original: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0051 A:{Catch:{ all -> 0x0024 }} */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A:{Catch:{ all -> 0x0024 }} */
        public void execute() {
            /*
            r5 = this;
            r0 = okhttp3.RealCall.this;
            r0 = r0.timeout;
            r0.enter();
            r0 = 0;
            r1 = okhttp3.RealCall.this;	 Catch:{ IOException -> 0x0026 }
            r0 = r1.getResponseWithInterceptorChain();	 Catch:{ IOException -> 0x0026 }
            r1 = 1;
            r2 = r5.responseCallback;	 Catch:{ IOException -> 0x0022 }
            r3 = okhttp3.RealCall.this;	 Catch:{ IOException -> 0x0022 }
            r2.onResponse(r3, r0);	 Catch:{ IOException -> 0x0022 }
        L_0x0016:
            r0 = okhttp3.RealCall.this;
            r0 = r0.client;
            r0 = r0.dispatcher();
            r0.finished(r5);
            goto L_0x0064;
        L_0x0022:
            r0 = move-exception;
            goto L_0x0029;
        L_0x0024:
            r0 = move-exception;
            goto L_0x0065;
        L_0x0026:
            r1 = move-exception;
            r0 = r1;
            r1 = 0;
        L_0x0029:
            r2 = okhttp3.RealCall.this;	 Catch:{ all -> 0x0024 }
            r0 = r2.timeoutExit(r0);	 Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0051;
        L_0x0031:
            r1 = okhttp3.internal.platform.Platform.get();	 Catch:{ all -> 0x0024 }
            r2 = 4;
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0024 }
            r3.<init>();	 Catch:{ all -> 0x0024 }
            r4 = "Callback failure for ";
            r3.append(r4);	 Catch:{ all -> 0x0024 }
            r4 = okhttp3.RealCall.this;	 Catch:{ all -> 0x0024 }
            r4 = r4.toLoggableString();	 Catch:{ all -> 0x0024 }
            r3.append(r4);	 Catch:{ all -> 0x0024 }
            r3 = r3.toString();	 Catch:{ all -> 0x0024 }
            r1.log(r2, r3, r0);	 Catch:{ all -> 0x0024 }
            goto L_0x0016;
        L_0x0051:
            r1 = okhttp3.RealCall.this;	 Catch:{ all -> 0x0024 }
            r1 = r1.eventListener;	 Catch:{ all -> 0x0024 }
            r2 = okhttp3.RealCall.this;	 Catch:{ all -> 0x0024 }
            r1.callFailed(r2, r0);	 Catch:{ all -> 0x0024 }
            r1 = r5.responseCallback;	 Catch:{ all -> 0x0024 }
            r2 = okhttp3.RealCall.this;	 Catch:{ all -> 0x0024 }
            r1.onFailure(r2, r0);	 Catch:{ all -> 0x0024 }
            goto L_0x0016;
        L_0x0064:
            return;
        L_0x0065:
            r1 = okhttp3.RealCall.this;
            r1 = r1.client;
            r1 = r1.dispatcher();
            r1.finished(r5);
            goto L_0x0072;
        L_0x0071:
            throw r0;
        L_0x0072:
            goto L_0x0071;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall$AsyncCall.execute():void");
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        this.timeout.timeout((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    public Request request() {
        return this.originalRequest;
    }

    public Response execute() {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        captureCallStackTrace();
        this.timeout.enter();
        this.eventListener.callStart(this);
        try {
            this.client.dispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain();
            if (responseWithInterceptorChain != null) {
                this.client.dispatcher().finished(this);
                return responseWithInterceptorChain;
            }
            throw new IOException("Canceled");
        } catch (IOException iOException) {
            IOException iOException2 = timeoutExit(iOException2);
            this.eventListener.callFailed(this, iOException2);
            throw iOException2;
        } catch (Throwable th) {
            this.client.dispatcher().finished(this);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public IOException timeoutExit(IOException iOException) {
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    public Timeout timeout() {
        return this.timeout;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    public RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    /* Access modifiers changed, original: 0000 */
    public StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    /* Access modifiers changed, original: 0000 */
    public String toLoggableString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(isCanceled() ? "canceled " : "");
        stringBuilder.append(this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
        stringBuilder.append(" to ");
        stringBuilder.append(redactedUrl());
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    /* Access modifiers changed, original: 0000 */
    public Response getResponseWithInterceptorChain() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Closeable proceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
        if (!this.retryAndFollowUpInterceptor.isCanceled()) {
            return proceed;
        }
        Util.closeQuietly(proceed);
        throw new IOException("Canceled");
    }
}
