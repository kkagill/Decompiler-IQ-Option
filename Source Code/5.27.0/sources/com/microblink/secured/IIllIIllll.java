package com.microblink.secured;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* compiled from: line */
public final class IIllIIllll {
    private HttpsURLConnection ewh = null;
    private OutputStream ewi = null;
    private final URL ewj;
    private final String ewk;
    private boolean ewl = false;

    /* compiled from: line */
    public static class llIIlIlIIl extends Exception {
        public llIIlIlIIl(Exception exception) {
            super(exception);
        }

        public final /* bridge */ /* synthetic */ Throwable getCause() {
            return (IOException) super.getCause();
        }
    }

    private IIllIIllll(URL url, String str) {
        this.ewj = url;
        this.ewk = str;
    }

    public static IIllIIllll kp(String str) {
        try {
            return new IIllIIllll(new URL(str), "POST");
        } catch (Exception e) {
            throw new llIIlIlIIl(e);
        }
    }

    private static String kq(String str) {
        try {
            Charset.forName(str);
            return str;
        } catch (UnsupportedCharsetException unused) {
            return "UTF-8";
        }
    }

    private void addHeader(String str, String str2) {
        beh().setRequestProperty(str, str2);
    }

    public final HttpsURLConnection beh() {
        if (this.ewh == null) {
            try {
                this.ewh = (HttpsURLConnection) this.ewj.openConnection();
                this.ewh.setRequestMethod(this.ewk);
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                this.ewh.setSSLSocketFactory(instance.getSocketFactory());
            } catch (Exception e) {
                throw new llIIlIlIIl(e);
            }
        }
        return this.ewh;
    }

    public final void P(Map<String, String> map) {
        String str = "UTF-8";
        String kq = kq(str);
        String str2 = "Content-Type";
        String str3 = "application/x-www-form-urlencoded";
        if (kq == null || kq.length() <= 0) {
            addHeader(str2, str3);
        } else {
            StringBuilder stringBuilder = new StringBuilder("; charset=");
            stringBuilder.append(kq);
            kq = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(kq);
            addHeader(str2, stringBuilder.toString());
        }
        boolean z = true;
        if (this.ewi == null) {
            try {
                beh();
                this.ewh.setDoOutput(true);
                this.ewi = new BufferedOutputStream(beh().getOutputStream(), 8192);
            } catch (Exception e) {
                throw new llIIlIlIIl(e);
            }
        }
        if (this.ewi != null) {
            for (Entry entry : map.entrySet()) {
                if (!z) {
                    try {
                        this.ewi.write("&".getBytes(str));
                    } catch (Exception e2) {
                        throw new llIIlIlIIl(e2);
                    }
                }
                this.ewi.write(URLEncoder.encode((String) entry.getKey(), str).getBytes(str));
                this.ewi.write("=".getBytes(str));
                this.ewi.write(URLEncoder.encode((String) entry.getValue(), str).getBytes(str));
                z = false;
            }
            return;
        }
        throw new llIIlIlIIl(new NullPointerException("outputStream == null"));
    }

    public final int getResponseCode() {
        if (!this.ewl) {
            this.ewl = true;
            try {
                this.ewi.close();
            } catch (Exception e) {
                throw new llIIlIlIIl(e);
            }
        }
        try {
            return beh().getResponseCode();
        } catch (Exception e2) {
            throw new llIIlIlIIl(e2);
        }
    }
}
