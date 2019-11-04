package com.jumio.core.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.jumio.commons.log.Log;
import com.jumio.core.mvp.model.Publisher;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ale.AleKeyUpdateException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.TrustManager;

public abstract class ApiCall<T> extends Publisher<T> implements Callable<T> {
    private static String mTrackingId;
    public final String TAG;
    private int connectTimeout = 10000;
    protected Context context;
    protected DynamicProvider dynamicProvider;
    protected int ioTimeout = 10000;
    protected EncryptionProvider mEncryptionProvider;
    protected String urlPrefix;
    private String userAgent;

    public interface DynamicProvider {
        EncryptionProvider getEncryptionProvider();

        byte[][] getPublicKeys();

        boolean isOffline();
    }

    public abstract void fillRequest(OutputStream outputStream);

    public abstract String getBoundary();

    /* Access modifiers changed, original: protected */
    public String getMethod() {
        return "POST";
    }

    public abstract String getUri();

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public T offlineResponse() {
        return null;
    }

    public abstract T parseResponse(String str);

    public abstract int prepareRequest();

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
    }

    public ApiCall(Context context, DynamicProvider dynamicProvider, Subscriber<T> subscriber) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Network/");
        stringBuilder.append(getClass().getSimpleName());
        this.TAG = stringBuilder.toString();
        init(context, dynamicProvider);
        if (subscriber != null) {
            add(subscriber);
        }
    }

    protected static synchronized void setTrackingId(String str) {
        synchronized (ApiCall.class) {
            mTrackingId = str;
        }
    }

    @VisibleForTesting
    protected ApiCall(Context context, DynamicProvider dynamicProvider) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Network/");
        stringBuilder.append(getClass().getSimpleName());
        this.TAG = stringBuilder.toString();
        init(context, dynamicProvider);
    }

    private void init(Context context, DynamicProvider dynamicProvider) {
        this.context = context;
        this.dynamicProvider = dynamicProvider;
    }

    public void configure(String str, String str2) {
        this.urlPrefix = str;
        this.userAgent = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a7 A:{Catch:{ all -> 0x0184 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018c A:{Catch:{ all -> 0x0184 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017f A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x001c} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:60:0x017f, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:61:0x0181, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:62:0x0182, code skipped:
            r2 = r3;
     */
    @androidx.annotation.Nullable
    public T execute() {
        /*
        r17 = this;
        r1 = r17;
        r2 = 0;
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0187 }
        r0.<init>();	 Catch:{ Exception -> 0x0187 }
        r3 = r1.urlPrefix;	 Catch:{ Exception -> 0x0187 }
        r0.append(r3);	 Catch:{ Exception -> 0x0187 }
        r3 = r17.getUri();	 Catch:{ Exception -> 0x0187 }
        r0.append(r3);	 Catch:{ Exception -> 0x0187 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0187 }
        r3 = r1.createClient(r0);	 Catch:{ Exception -> 0x0187 }
        r0 = r1.dynamicProvider;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = r0.getEncryptionProvider();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r1.mEncryptionProvider = r0;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = r17.prepareRequest();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = r1.TAG;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r5 = "Sending request %s";
        r6 = 1;
        r7 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8 = r3.getURL();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8 = r8.toString();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r9 = 0;
        r7[r9] = r8;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r5 = java.lang.String.format(r5, r7);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        com.jumio.commons.log.Log.d(r4, r5);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = com.jumio.commons.log.Log.LogLevel.VERBOSE;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = com.jumio.commons.log.Log.isLogEnabledForLevel(r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        if (r4 == 0) goto L_0x008a;
    L_0x0049:
        r4 = r3.getRequestProperties();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = r4.entrySet();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = r4.iterator();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
    L_0x0055:
        r5 = r4.hasNext();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        if (r5 == 0) goto L_0x008a;
    L_0x005b:
        r5 = r4.next();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r7 = r1.TAG;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8.<init>();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r10 = "Headers: ";
        r8.append(r10);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r10 = r5.getKey();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r10 = (java.lang.String) r10;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8.append(r10);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r10 = "=";
        r8.append(r10);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r5 = r5.getValue();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r8.append(r5);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r5 = r8.toString();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        com.jumio.commons.log.Log.v(r7, r5);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        goto L_0x0055;
    L_0x008a:
        r4 = 0;
        r7 = java.lang.System.nanoTime();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r10 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r12 = r17.networkErrorMock();	 Catch:{ all -> 0x016e }
        com.jumio.core.network.ErrorMock.onApiMock(r12);	 Catch:{ all -> 0x016e }
        r12 = r1.mEncryptionProvider;	 Catch:{ all -> 0x0169 }
        r13 = r3.getOutputStream();	 Catch:{ all -> 0x0169 }
        r14 = r17.getBoundary();	 Catch:{ all -> 0x0169 }
        r2 = r12.createRequest(r13, r0, r14);	 Catch:{ all -> 0x0169 }
        r1.fillRequest(r2);	 Catch:{ all -> 0x0169 }
        r2.flush();	 Catch:{ all -> 0x0169 }
        com.jumio.commons.utils.IOUtils.closeQuietly(r2);	 Catch:{ all -> 0x016e }
        r2 = r3.getResponseCode();	 Catch:{ all -> 0x016e }
        r0 = r1.TAG;	 Catch:{ all -> 0x0167 }
        r12 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x0167 }
        r13 = "Response was %d, %s";
        r14 = 2;
        r15 = new java.lang.Object[r14];	 Catch:{ all -> 0x0167 }
        r16 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0167 }
        r15[r9] = r16;	 Catch:{ all -> 0x0167 }
        r16 = r3.getResponseMessage();	 Catch:{ all -> 0x0167 }
        r15[r6] = r16;	 Catch:{ all -> 0x0167 }
        r12 = java.lang.String.format(r12, r13, r15);	 Catch:{ all -> 0x0167 }
        com.jumio.commons.log.Log.d(r0, r12);	 Catch:{ all -> 0x0167 }
        r0 = r1.TAG;	 Catch:{ all -> 0x0167 }
        r12 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x0167 }
        r13 = "Received response for %s in %d ms";
        r14 = new java.lang.Object[r14];	 Catch:{ all -> 0x0167 }
        r15 = r3.getURL();	 Catch:{ all -> 0x0167 }
        r15 = r15.toString();	 Catch:{ all -> 0x0167 }
        r14[r9] = r15;	 Catch:{ all -> 0x0167 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0167 }
        r14[r6] = r4;	 Catch:{ all -> 0x0167 }
        r4 = java.lang.String.format(r12, r13, r14);	 Catch:{ all -> 0x0167 }
        com.jumio.commons.log.Log.v(r0, r4);	 Catch:{ all -> 0x0167 }
        r4 = java.lang.System.nanoTime();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = r4 - r7;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r4 = r4 / r10;
        r4 = (long) r4;
        r1.responseReceived(r2, r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r0) goto L_0x0109;
    L_0x0104:
        r6 = r3.getInputStream();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        goto L_0x010d;
    L_0x0109:
        r6 = r3.getErrorStream();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
    L_0x010d:
        r7 = r1.mEncryptionProvider;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r6 = r7.getResponse(r6);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r7 = r17.getClass();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r7 = r7.getSimpleName();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        com.jumio.commons.log.LogUtils.logServerResponse(r7, r2, r4, r6);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        if (r2 != r0) goto L_0x014d;
    L_0x0120:
        r0 = r1.TAG;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r2 = "parsing response";
        com.jumio.commons.log.Log.d(r0, r2);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = r1.TAG;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r2.<init>();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = "Response: ";
        r2.append(r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        if (r6 == 0) goto L_0x0137;
    L_0x0135:
        r4 = r6;
        goto L_0x0139;
    L_0x0137:
        r4 = "null";
    L_0x0139:
        r2.append(r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        com.jumio.commons.log.Log.v(r0, r2);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = r1.parseResponse(r6);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        if (r3 == 0) goto L_0x014c;
    L_0x0149:
        r3.disconnect();
    L_0x014c:
        return r0;
    L_0x014d:
        r4 = r3.getResponseMessage();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x015d, all -> 0x017f }
        r0.<init>(r6);	 Catch:{ Exception -> 0x015d, all -> 0x017f }
        r5 = "message";
        r4 = r0.getString(r5);	 Catch:{ Exception -> 0x015d, all -> 0x017f }
        goto L_0x0161;
    L_0x015d:
        r0 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r0);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
    L_0x0161:
        r0 = new com.jumio.commons.remote.exception.UnexpectedResponseException;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        throw r0;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
    L_0x0167:
        r0 = move-exception;
        goto L_0x0170;
    L_0x0169:
        r0 = move-exception;
        com.jumio.commons.utils.IOUtils.closeQuietly(r2);	 Catch:{ all -> 0x016e }
        throw r0;	 Catch:{ all -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        r2 = 0;
    L_0x0170:
        r4 = java.lang.System.nanoTime();	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        r4 = r4 - r7;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r4 = r4 / r10;
        r4 = (long) r4;
        r1.responseReceived(r2, r4);	 Catch:{ Exception -> 0x0181, all -> 0x017f }
        throw r0;	 Catch:{ Exception -> 0x0181, all -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        goto L_0x01aa;
    L_0x0181:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0188;
    L_0x0184:
        r0 = move-exception;
        r3 = r2;
        goto L_0x01aa;
    L_0x0187:
        r0 = move-exception;
    L_0x0188:
        r3 = r0 instanceof java.net.SocketTimeoutException;	 Catch:{ all -> 0x0184 }
        if (r3 != 0) goto L_0x01a7;
    L_0x018c:
        r3 = r0 instanceof com.jumio.core.network.ale.AleKeyUpdateException;	 Catch:{ all -> 0x0184 }
        if (r3 != 0) goto L_0x01a4;
    L_0x0190:
        r3 = r0 instanceof com.jumio.commons.remote.exception.UnexpectedResponseException;	 Catch:{ all -> 0x0184 }
        if (r3 != 0) goto L_0x01a1;
    L_0x0194:
        r3 = r0 instanceof javax.net.ssl.SSLException;	 Catch:{ all -> 0x0184 }
        if (r3 == 0) goto L_0x019b;
    L_0x0198:
        r0 = (javax.net.ssl.SSLException) r0;	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x019b:
        r3 = new com.jumio.core.network.NetworkException;	 Catch:{ all -> 0x0184 }
        r3.<init>(r0);	 Catch:{ all -> 0x0184 }
        throw r3;	 Catch:{ all -> 0x0184 }
    L_0x01a1:
        r0 = (com.jumio.commons.remote.exception.UnexpectedResponseException) r0;	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x01a4:
        r0 = (com.jumio.core.network.ale.AleKeyUpdateException) r0;	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x01a7:
        r0 = (java.net.SocketTimeoutException) r0;	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x01aa:
        if (r3 == 0) goto L_0x01af;
    L_0x01ac:
        r3.disconnect();
    L_0x01af:
        goto L_0x01b1;
    L_0x01b0:
        throw r0;
    L_0x01b1:
        goto L_0x01b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.network.ApiCall.execute():java.lang.Object");
    }

    @NonNull
    private HttpURLConnection createClient(String str) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        if (str.contains("https://")) {
            httpURLConnection = (HttpsURLConnection) url.openConnection();
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new TLSSocketFactory(new TrustManager[]{new MultiPinningTrustManager(this.dynamicProvider.getPublicKeys(), url.getHost())}));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        if (getMethod() != null) {
            httpURLConnection.setRequestMethod(getMethod());
            if (!httpURLConnection.getRequestMethod().equals(getMethod())) {
                throw new AssertionError();
            }
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/ale");
        String str2 = "identity";
        httpURLConnection.setRequestProperty("Content-Encoding", str2);
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("User-Agent", this.userAgent);
        str2 = mTrackingId;
        if (str2 == null) {
            str2 = "";
        }
        httpURLConnection.setRequestProperty("X-TrackingId", str2);
        httpURLConnection.setConnectTimeout(this.connectTimeout);
        httpURLConnection.setReadTimeout(this.ioTimeout);
        return httpURLConnection;
    }

    public final T call() {
        String str = "Device is offline";
        Log.i(this.TAG, "-> call()");
        try {
            T offlineResponse;
            if (this.dynamicProvider.isOffline()) {
                offlineResponse = offlineResponse();
            } else if (isDeviceOffline()) {
                Log.w(this.TAG, str);
                throw new Exception(str);
            } else {
                Log.v(this.TAG, "execute()");
                try {
                    offlineResponse = execute();
                } catch (AleKeyUpdateException e) {
                    Log.w(this.TAG, "### ALE key update required. Re-execute call", e);
                    offlineResponse = execute();
                }
            }
            publishResult(offlineResponse);
            Log.i(this.TAG, "<- call(success)");
            return offlineResponse;
        } catch (NetworkException | SocketTimeoutException e2) {
            Log.i(this.TAG, "<- call(failed)");
            publishError(e2);
            return null;
        } catch (Exception e22) {
            Log.w(this.TAG, "<- call(failed general error)", e22);
            publishError(e22);
            return null;
        }
    }

    public void setTimeout(int i) {
        this.connectTimeout = i;
        this.ioTimeout = i;
    }

    /* Access modifiers changed, original: protected */
    public boolean isDeviceOffline() {
        return ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo() == null;
    }
}
