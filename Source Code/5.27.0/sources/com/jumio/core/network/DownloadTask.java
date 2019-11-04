package com.jumio.core.network;

import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import com.jumio.commons.log.Log;
import java.util.Timer;
import java.util.TimerTask;

public class DownloadTask extends AsyncTask<Void, Integer, byte[]> {
    private static final int NO_TIMEOUT = -1;
    private static final String TAG = "DownloadTask";
    private byte[] certificateKey;
    private ProgressListener mListener;
    private Timer mTaskKiller;
    private int mTimeout;
    private String mUrl;

    public interface ProgressListener {
        void onProgressDone(byte[] bArr);

        void onProgressException(Exception exception);

        void onProgressUpdate(float f);
    }

    private class TimeoutTimerTask extends TimerTask {
        private final AsyncTask mTask;

        public TimeoutTimerTask(AsyncTask asyncTask) {
            this.mTask = asyncTask;
        }

        public void run() {
            AsyncTask asyncTask = this.mTask;
            if (asyncTask != null && asyncTask.getStatus() != Status.FINISHED && !this.mTask.isCancelled()) {
                this.mTask.cancel(true);
                Log.v(DownloadTask.TAG, "timer fired - killing task");
            }
        }
    }

    public DownloadTask(String str, byte[] bArr) {
        this(str, bArr, -1);
    }

    public DownloadTask(String str, byte[] bArr, int i) {
        this.mTaskKiller = null;
        this.certificateKey = null;
        this.mUrl = str;
        this.certificateKey = bArr;
        if (i != -1) {
            this.mTaskKiller = new Timer("TimoutTaskKiller");
            this.mTimeout = i;
        }
    }

    public void start() {
        execute(new Void[0]);
    }

    public byte[] startSync() {
        return doInBackground(null);
    }

    /* Access modifiers changed, original: protected|varargs */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A:{Catch:{ Exception -> 0x0069 }} */
    public byte[] doInBackground(java.lang.Void... r8) {
        /*
        r7 = this;
        r8 = 0;
        java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0061 }
        r0 = new java.net.URL;	 Catch:{ all -> 0x0061 }
        r1 = r7.mUrl;	 Catch:{ all -> 0x0061 }
        r0.<init>(r1);	 Catch:{ all -> 0x0061 }
        r1 = r0.openConnection();	 Catch:{ all -> 0x0061 }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ all -> 0x0061 }
        r2 = "https";
        r3 = r0.getProtocol();	 Catch:{ all -> 0x005f }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x005f }
        r3 = 1;
        if (r2 == 0) goto L_0x0039;
    L_0x001e:
        r2 = new javax.net.ssl.TrustManager[r3];	 Catch:{ all -> 0x005f }
        r4 = 0;
        r5 = new com.jumio.core.network.MultiPinningTrustManager;	 Catch:{ all -> 0x005f }
        r6 = r7.certificateKey;	 Catch:{ all -> 0x005f }
        r0 = r0.getHost();	 Catch:{ all -> 0x005f }
        r5.<init>(r6, r0);	 Catch:{ all -> 0x005f }
        r2[r4] = r5;	 Catch:{ all -> 0x005f }
        r0 = r1;
        r0 = (javax.net.ssl.HttpsURLConnection) r0;	 Catch:{ all -> 0x005f }
        r4 = new com.jumio.core.network.TLSSocketFactory;	 Catch:{ all -> 0x005f }
        r4.<init>(r2);	 Catch:{ all -> 0x005f }
        r0.setSSLSocketFactory(r4);	 Catch:{ all -> 0x005f }
    L_0x0039:
        r1.setDoInput(r3);	 Catch:{ all -> 0x005f }
        r1.connect();	 Catch:{ all -> 0x005f }
        r0 = r1.getResponseCode();	 Catch:{ all -> 0x005f }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r2) goto L_0x004d;
    L_0x0047:
        if (r1 == 0) goto L_0x004c;
    L_0x0049:
        r1.disconnect();	 Catch:{ Exception -> 0x0069 }
    L_0x004c:
        return r8;
    L_0x004d:
        r0 = r1.getInputStream();	 Catch:{ all -> 0x005f }
        r2 = r1.getContentLength();	 Catch:{ all -> 0x005f }
        r8 = r7.processInputStream(r0, r2);	 Catch:{ all -> 0x005f }
        if (r1 == 0) goto L_0x0078;
    L_0x005b:
        r1.disconnect();	 Catch:{ Exception -> 0x0069 }
        goto L_0x0078;
    L_0x005f:
        r0 = move-exception;
        goto L_0x0063;
    L_0x0061:
        r0 = move-exception;
        r1 = r8;
    L_0x0063:
        if (r1 == 0) goto L_0x0068;
    L_0x0065:
        r1.disconnect();	 Catch:{ Exception -> 0x0069 }
    L_0x0068:
        throw r0;	 Catch:{ Exception -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        r1 = "DownloadTask";
        r2 = "";
        com.jumio.commons.log.Log.e(r1, r2, r0);
        r1 = r7.mListener;
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1.onProgressException(r0);
    L_0x0078:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.network.DownloadTask.doInBackground(java.lang.Void[]):byte[]");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A:{SYNTHETIC, Splitter:B:23:0x0047} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A:{SYNTHETIC, Splitter:B:28:0x0051} */
    public byte[] processInputStream(java.io.InputStream r9, int r10) {
        /*
        r8 = this;
        r0 = "";
        r1 = "DownloadTask";
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = 0;
        r2 = new byte[r2];	 Catch:{ all -> 0x0043 }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x0043 }
        r4.<init>();	 Catch:{ all -> 0x0043 }
        r3 = 0;
        r5 = 0;
    L_0x0010:
        r6 = r9.read(r2);	 Catch:{ all -> 0x0041 }
        if (r6 <= 0) goto L_0x002a;
    L_0x0016:
        r4.write(r2, r3, r6);	 Catch:{ all -> 0x0041 }
        r5 = r5 + r6;
        r6 = 1;
        r6 = new java.lang.Integer[r6];	 Catch:{ all -> 0x0041 }
        r7 = r5 * 100;
        r7 = r7 / r10;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0041 }
        r6[r3] = r7;	 Catch:{ all -> 0x0041 }
        r8.publishProgress(r6);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x002a:
        r10 = r4.toByteArray();	 Catch:{ all -> 0x0041 }
        r4.close();	 Catch:{ IOException -> 0x0032 }
        goto L_0x0036;
    L_0x0032:
        r2 = move-exception;
        com.jumio.commons.log.Log.e(r1, r0, r2);
    L_0x0036:
        if (r9 == 0) goto L_0x0040;
    L_0x0038:
        r9.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0040;
    L_0x003c:
        r9 = move-exception;
        com.jumio.commons.log.Log.e(r1, r0, r9);
    L_0x0040:
        return r10;
    L_0x0041:
        r10 = move-exception;
        goto L_0x0045;
    L_0x0043:
        r10 = move-exception;
        r4 = r3;
    L_0x0045:
        if (r4 == 0) goto L_0x004f;
    L_0x0047:
        r4.close();	 Catch:{ IOException -> 0x004b }
        goto L_0x004f;
    L_0x004b:
        r2 = move-exception;
        com.jumio.commons.log.Log.e(r1, r0, r2);
    L_0x004f:
        if (r9 == 0) goto L_0x0059;
    L_0x0051:
        r9.close();	 Catch:{ IOException -> 0x0055 }
        goto L_0x0059;
    L_0x0055:
        r9 = move-exception;
        com.jumio.commons.log.Log.e(r1, r0, r9);
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        throw r10;
    L_0x005b:
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.network.DownloadTask.processInputStream(java.io.InputStream, int):byte[]");
    }

    /* Access modifiers changed, original: protected */
    public void onPreExecute() {
        super.onPreExecute();
        Timer timer = this.mTaskKiller;
        if (timer != null) {
            timer.schedule(new TimeoutTimerTask(this), (long) this.mTimeout);
        }
    }

    /* Access modifiers changed, original: protected|varargs */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        ProgressListener progressListener = this.mListener;
        if (progressListener != null) {
            progressListener.onProgressUpdate((float) numArr[0].intValue());
        }
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(byte[] bArr) {
        super.onPostExecute(bArr);
        ProgressListener progressListener = this.mListener;
        if (progressListener != null) {
            progressListener.onProgressDone(bArr);
        }
        Timer timer = this.mTaskKiller;
        if (timer != null) {
            timer.cancel();
            this.mTaskKiller.purge();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCancelled(byte[] bArr) {
        super.onCancelled(bArr);
    }

    public void setListener(ProgressListener progressListener) {
        this.mListener = progressListener;
    }
}
