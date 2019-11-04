package com.microblink.secured;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.TreeMap;

/* compiled from: line */
public final class g extends AsyncTask<z, Void, a> {
    private b evW = null;

    /* compiled from: line */
    public class a {
        d evX = null;
        Exception evY = null;

        public a(d dVar) {
            this.evX = dVar;
        }

        public a(Exception exception) {
            this.evY = exception;
        }
    }

    /* compiled from: line */
    public interface b {
        void a(d dVar);

        void bec();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    @SuppressLint({"ObsoleteSdkInt"})
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((z[]) objArr);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        if (!(aVar == null || this.evW == null)) {
            if (aVar.evY != null) {
                this.evW.bec();
                return;
            }
            this.evW.a(aVar.evX);
        }
    }

    public g(b bVar) {
        this.evW = bVar;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    private a a(z... zVarArr) {
        try {
            if (VERSION.SDK_INT < 8) {
                System.setProperty("https.keepAlive", "false");
            }
            z zVar = zVarArr[0];
            TreeMap treeMap = new TreeMap();
            if (zVar.exN != null) {
                treeMap.put("product", zVar.exN);
            }
            if (zVar.evP != null) {
                treeMap.put("productVersion", zVar.evP);
            }
            treeMap.put("licensee", zVar.euj);
            treeMap.put("userId", zVar.exQ);
            treeMap.put("scans", String.valueOf(zVar.exR));
            treeMap.put("packageName", zVar.mPackageName);
            if (zVar.exc != null) {
                treeMap.put("device", zVar.exc);
            }
            if (zVar.exP != null) {
                treeMap.put("osVersion", zVar.exP);
            }
            treeMap.put("platform", zVar.exO);
            if (zVar.exS) {
                treeMap.put("refreshKey", String.valueOf(zVar.exS));
            }
            IIllIIllll kp = IIllIIllll.kp("https://ping.microblink.com/ping");
            kp.beh().setConnectTimeout(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            kp.P(treeMap);
            return new a(new d(kp.getResponseCode()));
        } catch (Exception e) {
            return new a(e);
        }
    }
}
