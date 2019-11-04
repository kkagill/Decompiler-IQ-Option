package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

final class ad extends AsyncTask<String, Void, String> {
    private boolean kH = false;
    private String lO = "";
    private boolean lQ;
    private boolean lU = false;
    String lx;
    Map<String, String> na;
    private WeakReference<Context> nb;
    private URL nc;
    private HttpURLConnection nd;
    private boolean ne;

    /* Access modifiers changed, original: protected|final */
    public final void onCancelled() {
    }

    ad(Context context, boolean z) {
        this.nb = new WeakReference(context);
        this.lQ = true;
        this.ne = true;
        this.kH = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPreExecute() {
        if (this.lx == null) {
            this.lx = new JSONObject(this.na).toString();
        }
    }

    /* Access modifiers changed, original: protected|final|varargs */
    /* renamed from: b */
    public final String doInBackground(String... strArr) {
        if (this.kH) {
            return null;
        }
        try {
            int length;
            this.nc = new URL(strArr[0]);
            String str = "UTF-8";
            if (this.lQ) {
                ag.dT().l(this.nc.toString(), this.lx);
                length = this.lx.getBytes(str).length;
                StringBuilder stringBuilder = new StringBuilder("call = ");
                stringBuilder.append(this.nc);
                stringBuilder.append("; size = ");
                stringBuilder.append(length);
                stringBuilder.append(" byte");
                stringBuilder.append(length > 1 ? "s" : "");
                stringBuilder.append("; body = ");
                stringBuilder.append(this.lx);
                a.ae(stringBuilder.toString());
            }
            this.nd = (HttpURLConnection) this.nc.openConnection();
            this.nd.setReadTimeout(30000);
            this.nd.setConnectTimeout(30000);
            this.nd.setRequestMethod("POST");
            this.nd.setDoInput(true);
            this.nd.setDoOutput(true);
            this.nd.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = this.nd.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
            bufferedWriter.write(this.lx);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.nd.connect();
            length = this.nd.getResponseCode();
            if (this.ne) {
                j.dq();
                this.lO = j.c(this.nd);
            }
            if (this.lQ) {
                ag.dT().a(this.nc.toString(), length, this.lO);
            }
            if (length == 200) {
                AFLogger.J("Status 200 ok");
                Context context = (Context) this.nb.get();
                if (this.nc.toString().startsWith(t.Y(j.kZ)) && context != null) {
                    Editor edit = j.p(context).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    AFLogger.I("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.lU = true;
            }
        } catch (Throwable th) {
            StringBuilder stringBuilder2 = new StringBuilder("Error while calling ");
            stringBuilder2.append(this.nc.toString());
            AFLogger.c(stringBuilder2.toString(), th);
            this.lU = true;
        }
        return this.lO;
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: ae */
    public final void onPostExecute(String str) {
        if (this.lU) {
            AFLogger.J("Connection error: ".concat(String.valueOf(str)));
            return;
        }
        AFLogger.J("Connection call succeeded: ".concat(String.valueOf(str)));
    }

    /* Access modifiers changed, original: final */
    public final void dp() {
        this.lQ = false;
    }
}
