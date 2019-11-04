package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher */
public class b {
    private final Context cO;
    private final a jH;
    private final String url;

    public static m<e> f(Context context, String str) {
        return new b(context, str).cB();
    }

    private b(Context context, String str) {
        this.cO = context.getApplicationContext();
        this.url = str;
        this.jH = new a(this.cO, str);
    }

    @WorkerThread
    public m<e> cB() {
        Object cC = cC();
        if (cC != null) {
            return new m(cC);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animation for ");
        stringBuilder.append(this.url);
        stringBuilder.append(" not found in cache. Fetching from network.");
        d.q(stringBuilder.toString());
        return cD();
    }

    @WorkerThread
    @Nullable
    private e cC() {
        Pair cA = this.jH.cA();
        if (cA == null) {
            return null;
        }
        m a;
        FileExtension fileExtension = (FileExtension) cA.first;
        InputStream inputStream = (InputStream) cA.second;
        if (fileExtension == FileExtension.ZIP) {
            a = f.a(new ZipInputStream(inputStream), this.url);
        } else {
            a = f.b(inputStream, this.url);
        }
        if (a.getValue() != null) {
            return (e) a.getValue();
        }
        return null;
    }

    @WorkerThread
    private m<e> cD() {
        try {
            return cE();
        } catch (IOException e) {
            return new m(e);
        }
    }

    @WorkerThread
    private m cE() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fetching ");
        stringBuilder.append(this.url);
        d.q(stringBuilder.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
        httpURLConnection.setRequestMethod("GET");
        m mVar;
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                mVar = 200;
                if (httpURLConnection.getResponseCode() == 200) {
                    m b = b(httpURLConnection);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed fetch from network. Success: ");
                    stringBuilder2.append(b.getValue() != null);
                    d.q(stringBuilder2.toString());
                    httpURLConnection.disconnect();
                    return b;
                }
            }
            String a = a(httpURLConnection);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Unable to fetch ");
            stringBuilder3.append(this.url);
            stringBuilder3.append(". Failed with ");
            stringBuilder3.append(httpURLConnection.getResponseCode());
            stringBuilder3.append("\n");
            stringBuilder3.append(a);
            mVar = new m(new IllegalArgumentException(stringBuilder3.toString()));
            return mVar;
        } catch (Exception e) {
            mVar = new m(e);
            return mVar;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private String a(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuilder.append(readLine);
                    stringBuilder.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }

    @Nullable
    private m<e> b(HttpURLConnection httpURLConnection) {
        FileExtension fileExtension;
        m b;
        String contentType = httpURLConnection.getContentType();
        String str = "application/json";
        if (contentType == null) {
            contentType = str;
        }
        Object obj = -1;
        int hashCode = contentType.hashCode();
        if (hashCode != -1248325150) {
            if (hashCode == -43840953 && contentType.equals(str)) {
                obj = 1;
            }
        } else if (contentType.equals("application/zip")) {
            obj = null;
        }
        if (obj != null) {
            d.q("Received json response.");
            fileExtension = FileExtension.JSON;
            b = f.b(new FileInputStream(new File(this.jH.a(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.url);
        } else {
            d.q("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            b = f.a(new ZipInputStream(new FileInputStream(this.jH.a(httpURLConnection.getInputStream(), fileExtension))), this.url);
        }
        if (b.getValue() != null) {
            this.jH.a(fileExtension);
        }
        return b;
    }
}
