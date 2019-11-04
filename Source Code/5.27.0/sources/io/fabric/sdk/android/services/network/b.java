package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.k;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: DefaultHttpRequestFactory */
public class b implements c {
    private final k eMm;
    private e eOw;
    private boolean eOx;
    private SSLSocketFactory sslSocketFactory;

    /* compiled from: DefaultHttpRequestFactory */
    /* renamed from: io.fabric.sdk.android.services.network.b$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eOy = new int[HttpMethod.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = io.fabric.sdk.android.services.network.HttpMethod.values();
            r0 = r0.length;
            r0 = new int[r0];
            eOy = r0;
            r0 = eOy;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = io.fabric.sdk.android.services.network.HttpMethod.GET;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eOy;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = io.fabric.sdk.android.services.network.HttpMethod.POST;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eOy;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = io.fabric.sdk.android.services.network.HttpMethod.PUT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = eOy;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = io.fabric.sdk.android.services.network.HttpMethod.DELETE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.b$AnonymousClass1.<clinit>():void");
        }
    }

    public b() {
        this(new io.fabric.sdk.android.b());
    }

    public b(k kVar) {
        this.eMm = kVar;
    }

    public void a(e eVar) {
        if (this.eOw != eVar) {
            this.eOw = eVar;
            bkj();
        }
    }

    private synchronized void bkj() {
        this.eOx = false;
        this.sslSocketFactory = null;
    }

    public HttpRequest a(HttpMethod httpMethod, String str, Map<String, String> map) {
        HttpRequest b;
        int i = AnonymousClass1.eOy[httpMethod.ordinal()];
        if (i == 1) {
            b = HttpRequest.b(str, map, true);
        } else if (i == 2) {
            b = HttpRequest.c(str, map, true);
        } else if (i == 3) {
            b = HttpRequest.U(str);
        } else if (i == 4) {
            b = HttpRequest.V(str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (lx(str) && this.eOw != null) {
            SSLSocketFactory sSLSocketFactory = getSSLSocketFactory();
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) b.bkn()).setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return b;
    }

    private boolean lx(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    private synchronized SSLSocketFactory getSSLSocketFactory() {
        if (this.sslSocketFactory == null && !this.eOx) {
            this.sslSocketFactory = bkk();
        }
        return this.sslSocketFactory;
    }

    private synchronized SSLSocketFactory bkk() {
        SSLSocketFactory b;
        this.eOx = true;
        try {
            b = d.b(this.eOw);
            this.eMm.d("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.eMm.e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return b;
    }
}
