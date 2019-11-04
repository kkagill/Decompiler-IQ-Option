package com.jumio.commons.utils;

import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import com.jumio.commons.log.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class DownloadTask extends AsyncTask<Void, Integer, byte[]> {
    private static final int DEFAULT_TIMEOUT = 5000;
    private static final String TAG = "DownloadTask";
    private ProgressListener mListener;
    private final Timer mTaskKiller;
    private int mTimeout;
    private final String mUrl;

    public interface ProgressListener {
        void onProgressDone(byte[] bArr);

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

    public DownloadTask(String str) {
        this(str, DEFAULT_TIMEOUT);
    }

    public DownloadTask(String str, int i) {
        this.mUrl = str;
        str = this.mUrl;
        if (str == null || !str.startsWith("http")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("URL ");
            stringBuilder.append(this.mUrl);
            stringBuilder.append(" might not be valid");
            Log.w(TAG, stringBuilder.toString());
        }
        this.mTaskKiller = new Timer("TimoutTaskKiller");
        this.mTimeout = i;
    }

    public void start() {
        execute(new Void[0]);
    }

    /* Access modifiers changed, original: protected|varargs */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00af A:{SYNTHETIC, Splitter:B:52:0x00af} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9 A:{SYNTHETIC, Splitter:B:58:0x00b9} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3 A:{Catch:{ IOException -> 0x00c7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00af A:{SYNTHETIC, Splitter:B:52:0x00af} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9 A:{SYNTHETIC, Splitter:B:58:0x00b9} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3 A:{Catch:{ IOException -> 0x00c7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00af A:{SYNTHETIC, Splitter:B:52:0x00af} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9 A:{SYNTHETIC, Splitter:B:58:0x00b9} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3 A:{Catch:{ IOException -> 0x00c7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00af A:{SYNTHETIC, Splitter:B:52:0x00af} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9 A:{SYNTHETIC, Splitter:B:58:0x00b9} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3 A:{Catch:{ IOException -> 0x00c7 }} */
    public byte[] doInBackground(java.lang.Void... r13) {
        /*
        r12 = this;
        r13 = "";
        r0 = "DownloadTask";
        r1 = 0;
        java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00a9 }
        r2 = new java.net.URL;	 Catch:{ all -> 0x00a9 }
        r3 = r12.mUrl;	 Catch:{ all -> 0x00a9 }
        r2.<init>(r3);	 Catch:{ all -> 0x00a9 }
        r3 = r2.openConnection();	 Catch:{ all -> 0x00a9 }
        r3 = (java.net.HttpURLConnection) r3;	 Catch:{ all -> 0x00a9 }
        r4 = 1;
        r3.setDoInput(r4);	 Catch:{ all -> 0x00a6 }
        r3.connect();	 Catch:{ all -> 0x00a6 }
        r5 = r3.getContentLength();	 Catch:{ all -> 0x00a6 }
        r6 = r3.getResponseCode();	 Catch:{ all -> 0x00a6 }
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 == r7) goto L_0x0052;
    L_0x0028:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r4.<init>();	 Catch:{ all -> 0x00a6 }
        r5 = "Requesting file ";
        r4.append(r5);	 Catch:{ all -> 0x00a6 }
        r2 = r2.toString();	 Catch:{ all -> 0x00a6 }
        r4.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = " returned ";
        r4.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = r3.getResponseCode();	 Catch:{ all -> 0x00a6 }
        r4.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = r4.toString();	 Catch:{ all -> 0x00a6 }
        com.jumio.commons.log.Log.e(r0, r2);	 Catch:{ all -> 0x00a6 }
        if (r3 == 0) goto L_0x0051;
    L_0x004e:
        r3.disconnect();	 Catch:{ IOException -> 0x0096 }
    L_0x0051:
        return r1;
    L_0x0052:
        r2 = r3.getInputStream();	 Catch:{ all -> 0x00a6 }
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r6 = new byte[r6];	 Catch:{ all -> 0x00a0 }
        r7 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x009d }
        r7.<init>();	 Catch:{ all -> 0x009d }
        r1 = 0;
        r8 = 0;
    L_0x0061:
        r9 = r2.read(r6);	 Catch:{ all -> 0x0098 }
        if (r9 <= 0) goto L_0x007a;
    L_0x0067:
        r7.write(r6, r1, r9);	 Catch:{ all -> 0x0098 }
        r8 = r8 + r9;
        r9 = new java.lang.Integer[r4];	 Catch:{ all -> 0x0098 }
        r10 = r8 * 100;
        r10 = r10 / r5;
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0098 }
        r9[r1] = r10;	 Catch:{ all -> 0x0098 }
        r12.publishProgress(r9);	 Catch:{ all -> 0x0098 }
        goto L_0x0061;
    L_0x007a:
        r1 = r7.toByteArray();	 Catch:{ all -> 0x0098 }
        if (r2 == 0) goto L_0x0088;
    L_0x0080:
        r2.close();	 Catch:{ IOException -> 0x0084 }
        goto L_0x0088;
    L_0x0084:
        r2 = move-exception;
        com.jumio.commons.log.Log.e(r0, r13, r2);	 Catch:{ IOException -> 0x0096 }
    L_0x0088:
        r7.close();	 Catch:{ IOException -> 0x008c }
        goto L_0x0090;
    L_0x008c:
        r2 = move-exception;
        com.jumio.commons.log.Log.e(r0, r13, r2);	 Catch:{ IOException -> 0x0096 }
    L_0x0090:
        if (r3 == 0) goto L_0x00cc;
    L_0x0092:
        r3.disconnect();	 Catch:{ IOException -> 0x0096 }
        goto L_0x00cc;
    L_0x0096:
        r2 = move-exception;
        goto L_0x00c9;
    L_0x0098:
        r1 = move-exception;
        r11 = r2;
        r2 = r1;
        r1 = r11;
        goto L_0x00ad;
    L_0x009d:
        r4 = move-exception;
        r7 = r1;
        goto L_0x00a3;
    L_0x00a0:
        r4 = move-exception;
        r6 = r1;
        r7 = r6;
    L_0x00a3:
        r1 = r2;
        r2 = r4;
        goto L_0x00ad;
    L_0x00a6:
        r2 = move-exception;
        r6 = r1;
        goto L_0x00ac;
    L_0x00a9:
        r2 = move-exception;
        r3 = r1;
        r6 = r3;
    L_0x00ac:
        r7 = r6;
    L_0x00ad:
        if (r1 == 0) goto L_0x00b7;
    L_0x00af:
        r1.close();	 Catch:{ IOException -> 0x00b3 }
        goto L_0x00b7;
    L_0x00b3:
        r1 = move-exception;
        com.jumio.commons.log.Log.e(r0, r13, r1);	 Catch:{ IOException -> 0x00c7 }
    L_0x00b7:
        if (r7 == 0) goto L_0x00c1;
    L_0x00b9:
        r7.close();	 Catch:{ IOException -> 0x00bd }
        goto L_0x00c1;
    L_0x00bd:
        r1 = move-exception;
        com.jumio.commons.log.Log.e(r0, r13, r1);	 Catch:{ IOException -> 0x00c7 }
    L_0x00c1:
        if (r3 == 0) goto L_0x00c6;
    L_0x00c3:
        r3.disconnect();	 Catch:{ IOException -> 0x00c7 }
    L_0x00c6:
        throw r2;	 Catch:{ IOException -> 0x00c7 }
    L_0x00c7:
        r2 = move-exception;
        r1 = r6;
    L_0x00c9:
        com.jumio.commons.log.Log.e(r0, r13, r2);
    L_0x00cc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.DownloadTask.doInBackground(java.lang.Void[]):byte[]");
    }

    /* Access modifiers changed, original: protected */
    public void onPreExecute() {
        super.onPreExecute();
        this.mTaskKiller.schedule(new TimeoutTimerTask(this), (long) this.mTimeout);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("started timer at ");
        stringBuilder.append(this.mTimeout);
        stringBuilder.append(" s");
        Log.v(TAG, stringBuilder.toString());
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

    public byte[] getData() {
        try {
            if (this.mUrl != null) {
                return (byte[]) execute(new Void[0]).get();
            }
            throw new IllegalStateException("no Url was specified!");
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            return null;
        }
    }

    public void setListener(ProgressListener progressListener) {
        this.mListener = progressListener;
    }

    public boolean exists() {
        boolean booleanValue;
        final Exception[] exceptionArr = new Exception[1];
        try {
            booleanValue = ((Boolean) new AsyncTask<String, Integer, Boolean>() {
                /* Access modifiers changed, original: protected */
                public void onPreExecute() {
                    DownloadTask.this.mTaskKiller.schedule(new TimeoutTimerTask(this), (long) DownloadTask.this.mTimeout);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("started timer at ");
                    stringBuilder.append(DownloadTask.this.mTimeout);
                    stringBuilder.append(" s");
                    Log.v(DownloadTask.TAG, stringBuilder.toString());
                    super.onPreExecute();
                }

                /* Access modifiers changed, original: protected|varargs */
                public Boolean doInBackground(String... strArr) {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                        boolean z = true;
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() != 200) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (Exception e) {
                        exceptionArr[0] = e;
                        Log.e(DownloadTask.TAG, "", e);
                        return Boolean.valueOf(false);
                    }
                }

                /* Access modifiers changed, original: protected */
                public void onPostExecute(Boolean bool) {
                    if (DownloadTask.this.mTaskKiller != null) {
                        Log.v(DownloadTask.TAG, "killing timer");
                        DownloadTask.this.mTaskKiller.cancel();
                        DownloadTask.this.mTaskKiller.purge();
                    }
                }
            }.execute(new String[]{this.mUrl}).get()).booleanValue();
        } catch (Exception e) {
            Log.e(TAG, "", e);
            exceptionArr[0] = e;
            booleanValue = false;
        }
        if (exceptionArr[0] == null) {
            return booleanValue;
        }
        throw new Exception(exceptionArr[0]);
    }
}
