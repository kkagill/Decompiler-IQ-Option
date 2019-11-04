package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.k.d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: ImageResponseCache */
class p {
    static final String TAG = "p";
    private static k zl;

    /* compiled from: ImageResponseCache */
    private static class a extends BufferedInputStream {
        HttpURLConnection tu;

        a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.tu = httpURLConnection;
        }

        public void close() {
            super.close();
            z.a(this.tu);
        }
    }

    p() {
    }

    static synchronized k X(Context context) {
        k kVar;
        synchronized (p.class) {
            if (zl == null) {
                zl = new k(TAG, new d());
            }
            kVar = zl;
        }
        return kVar;
    }

    static InputStream a(Uri uri, Context context) {
        if (uri != null && d(uri)) {
            try {
                return X(context).bi(uri.toString());
            } catch (IOException e) {
                s.a(LoggingBehavior.CACHE, 5, TAG, e.toString());
            }
        }
        return null;
    }

    static InputStream a(Context context, HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return d(parse) ? X(context).a(parse.toString(), new a(inputStream, httpURLConnection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    private static boolean d(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host.endsWith("fbcdn.net")) {
                return true;
            }
            if (host.startsWith("fbcdn") && host.endsWith("akamaihd.net")) {
                return true;
            }
        }
        return false;
    }
}
