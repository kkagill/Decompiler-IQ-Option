package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.k.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: UrlRedirectCache */
class y {
    static final String TAG = "y";
    private static final String zJ;
    private static k zK;

    y() {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append("_Redirect");
        zJ = stringBuilder.toString();
    }

    static synchronized k kL() {
        k kVar;
        synchronized (y.class) {
            if (zK == null) {
                zK = new k(TAG, new d());
            }
            kVar = zK;
        }
        return kVar;
    }

    static Uri e(Uri uri) {
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        Closeable inputStreamReader;
        try {
            k kL = kL();
            Closeable closeable = null;
            Object obj = null;
            while (true) {
                try {
                    InputStream B = kL.B(uri2, zJ);
                    if (B == null) {
                        break;
                    }
                    obj = 1;
                    inputStreamReader = new InputStreamReader(B);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder stringBuilder = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                            if (read <= 0) {
                                break;
                            }
                            stringBuilder.append(cArr, 0, read);
                        }
                        z.closeQuietly(inputStreamReader);
                        closeable = inputStreamReader;
                        uri2 = stringBuilder.toString();
                    } catch (IOException unused) {
                        z.closeQuietly(inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        z.closeQuietly(inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = closeable;
                    z.closeQuietly(inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = closeable;
                    z.closeQuietly(inputStreamReader);
                    throw th;
                }
            }
            if (obj != null) {
                uri = Uri.parse(uri2);
                z.closeQuietly(closeable);
                return uri;
            }
            z.closeQuietly(closeable);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            z.closeQuietly(inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            z.closeQuietly(inputStreamReader);
            throw th;
        }
    }

    static void a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            Closeable closeable = null;
            try {
                closeable = kL().C(uri.toString(), zJ);
                closeable.write(uri2.toString().getBytes());
            } catch (IOException unused) {
            } catch (Throwable th) {
                z.closeQuietly(closeable);
            }
            z.closeQuietly(closeable);
        }
    }
}
