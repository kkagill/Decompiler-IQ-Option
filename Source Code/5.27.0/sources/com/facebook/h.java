package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.z;
import java.net.HttpURLConnection;
import java.util.List;

/* compiled from: GraphRequestAsyncTask */
public class h extends AsyncTask<Void, Void, List<j>> {
    private static final String TAG = "com.facebook.h";
    private Exception exception;
    private final HttpURLConnection tu;
    private final i uq;

    public h(i iVar) {
        this(null, iVar);
    }

    public h(HttpURLConnection httpURLConnection, i iVar) {
        this.uq = iVar;
        this.tu = httpURLConnection;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{RequestAsyncTask: ");
        stringBuilder.append(" connection: ");
        stringBuilder.append(this.tu);
        stringBuilder.append(", requests: ");
        stringBuilder.append(this.uq);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void onPreExecute() {
        super.onPreExecute();
        if (f.isDebugEnabled()) {
            z.G(TAG, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.uq.hA() == null) {
            Handler handler;
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.uq.a(handler);
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: g */
    public void onPostExecute(List<j> list) {
        super.onPostExecute(list);
        if (this.exception != null) {
            z.G(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[]{r4.getMessage()}));
        }
    }

    /* Access modifiers changed, original: protected|varargs */
    /* renamed from: a */
    public List<j> doInBackground(Void... voidArr) {
        try {
            if (this.tu == null) {
                return this.uq.hD();
            }
            return g.a(this.tu, this.uq);
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }
}
