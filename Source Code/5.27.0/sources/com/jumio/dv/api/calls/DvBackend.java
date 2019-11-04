package com.jumio.dv.api.calls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.jumio.alejwt.swig.ALECore;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.commons.remote.exception.UnexpectedResponseException;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.EncryptionProvider;
import com.jumio.core.network.ale.AleSecurityConfig;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorCase;
import com.jumio.sdk.models.CredentialsModel;
import com.jumio.sdk.models.OfflineCredentialsModel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLException;

public class DvBackend {
    public static final String USER_AGENT = "Jumio Netverify Android SDK JMSDK 2.14.0 (0-69)";
    private static final String a = StringObfuscater.format(new byte[]{(byte) -8, (byte) -103, (byte) 70, (byte) 1, (byte) -52, (byte) 46, (byte) -114, (byte) 8, (byte) -49, (byte) 90, (byte) -120, (byte) -67, (byte) -45, (byte) -99, (byte) -4, (byte) -45, (byte) 97, (byte) -87, (byte) -97, (byte) 51, (byte) 2, (byte) 70, (byte) 99, (byte) -119, (byte) -125, (byte) 105, (byte) -100, (byte) -69, (byte) 95, (byte) 43, (byte) -99, (byte) -5, (byte) 121, (byte) 126, (byte) -108, (byte) -124, (byte) -112, (byte) -22, (byte) 112, (byte) -124, (byte) -41, (byte) -35, (byte) 88, (byte) 58, (byte) -15, (byte) 38, (byte) 13, (byte) -95, (byte) 79, (byte) -76, (byte) -95, (byte) 115, (byte) -2, (byte) 51, (byte) 51, (byte) -55, (byte) -10, (byte) 41, (byte) 20, (byte) -77, (byte) 22, (byte) -64, (byte) 45, (byte) 10, (byte) 117, Byte.MIN_VALUE, (byte) -88, (byte) -38, (byte) 35, (byte) 116, (byte) -74}, 8115964288434239780L);
    private static final String b = StringObfuscater.format(new byte[]{(byte) -93, (byte) -65, (byte) 37, (byte) 79, (byte) -73, (byte) 12, (byte) 85, (byte) 27, (byte) -29, (byte) 59, (byte) -71, (byte) -83, (byte) 16, (byte) 41, (byte) -4, (byte) 19, (byte) 5, (byte) 44, (byte) -102, (byte) 120, (byte) 88, (byte) 47, (byte) -68, (byte) 108, (byte) 16, (byte) -46, (byte) 105, (byte) -41, (byte) -120, (byte) -98, (byte) -7, (byte) 123, (byte) 95, (byte) 123, (byte) 62, (byte) 123, (byte) -38, (byte) -20, (byte) 80, (byte) 24, (byte) 115, (byte) 48, (byte) 54, (byte) -35, (byte) 37, (byte) 60, (byte) -107, (byte) 35, (byte) 66, (byte) -92, (byte) 54, (byte) -103, (byte) 91, (byte) -95, (byte) 120, (byte) 84, (byte) 16, (byte) 88, (byte) -45, (byte) 72, (byte) 69, (byte) -20, (byte) 112, Byte.MIN_VALUE, (byte) -81, (byte) -105, (byte) 13, (byte) -48, (byte) 51, (byte) 114, (byte) 98, (byte) 44, (byte) -102, (byte) -35, (byte) 101}, 3425189963034516002L);
    private static String c = a;
    private static String d = b;
    private static String e = AleSecurityConfig.ALE_KEY_ID_US;
    private static String f = AleSecurityConfig.ALE_KEY_ID_EU;
    private static String g = AleSecurityConfig.ALE_PUBLIC_KEY_US;
    private static String h = AleSecurityConfig.ALE_PUBLIC_KEY_EU;
    private static ExecutorService i = Executors.newSingleThreadExecutor();
    private static ALECore j;

    /* renamed from: com.jumio.dv.api.calls.DvBackend$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[JumioDataCenter.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.jumio.core.enums.JumioDataCenter.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.core.enums.JumioDataCenter.EU;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.core.enums.JumioDataCenter.US;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.dv.api.calls.DvBackend$AnonymousClass2.<clinit>():void");
        }
    }

    private static class a implements DynamicProvider {
        private Context a;
        private CredentialsModel b;

        public a(Context context, CredentialsModel credentialsModel) {
            this.a = context;
            this.b = credentialsModel;
        }

        public EncryptionProvider getEncryptionProvider() {
            return DvBackend.b(this.a, this.b);
        }

        public byte[][] getPublicKeys() {
            return this.b.getDataCenter() == JumioDataCenter.EU ? b.b : b.a;
        }

        public boolean isOffline() {
            return this.b instanceof OfflineCredentialsModel;
        }
    }

    private static String a(CredentialsModel credentialsModel) {
        int i = AnonymousClass2.a[credentialsModel.getDataCenter().ordinal()];
        if (i == 1) {
            return d;
        }
        if (i != 2) {
            return null;
        }
        return c;
    }

    public static ApiCall complete(Context context, CredentialsModel credentialsModel, ImageData imageData, Subscriber<String> subscriber) {
        a aVar = new a(context, new a(context, credentialsModel), imageData, subscriber);
        aVar.configure(a(credentialsModel), "Jumio Netverify Android SDK JMSDK 2.14.0 (0-69)");
        i.submit(aVar);
        return aVar;
    }

    public static int cancelAllPending() {
        int size = i.shutdownNow().size();
        i = Executors.newSingleThreadExecutor();
        return size;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|(1:(1:8)(1:9))(1:10)|11|12|13|(1:15)|16|17|(1:19)|20|(2:22|(1:24)(2:25|26))|27) */
    private static synchronized com.jumio.core.network.EncryptionProvider b(android.content.Context r8, com.jumio.sdk.models.CredentialsModel r9) {
        /*
        r0 = com.jumio.dv.api.calls.DvBackend.class;
        monitor-enter(r0);
        r1 = j;	 Catch:{ all -> 0x00db }
        r2 = 2;
        if (r1 != 0) goto L_0x00ae;
    L_0x0008:
        r1 = com.jumio.dv.api.calls.DvBackend.AnonymousClass2.a;	 Catch:{ all -> 0x00db }
        r3 = r9.getDataCenter();	 Catch:{ all -> 0x00db }
        r3 = r3.ordinal();	 Catch:{ all -> 0x00db }
        r1 = r1[r3];	 Catch:{ all -> 0x00db }
        r3 = 1;
        r4 = 0;
        if (r1 == r3) goto L_0x0022;
    L_0x0018:
        if (r1 == r2) goto L_0x001d;
    L_0x001a:
        r1 = r4;
        r5 = r1;
        goto L_0x0026;
    L_0x001d:
        r1 = e;	 Catch:{ all -> 0x00db }
        r5 = g;	 Catch:{ all -> 0x00db }
        goto L_0x0026;
    L_0x0022:
        r1 = f;	 Catch:{ all -> 0x00db }
        r5 = h;	 Catch:{ all -> 0x00db }
    L_0x0026:
        com.jumio.core.environment.Environment.loadAleLib();	 Catch:{ all -> 0x00db }
        r6 = "^https://acquisition\\.(.+?)?(?:\\.int)?(?:\\.)?(?:jumio|netverify)\\.com/.*$";
        r6 = java.util.regex.Pattern.compile(r6);	 Catch:{ Exception -> 0x0041 }
        r7 = a(r9);	 Catch:{ Exception -> 0x0041 }
        r6 = r6.matcher(r7);	 Catch:{ Exception -> 0x0041 }
        r7 = r6.matches();	 Catch:{ Exception -> 0x0041 }
        if (r7 == 0) goto L_0x0041;
    L_0x003d:
        r4 = r6.group(r3);	 Catch:{ Exception -> 0x0041 }
    L_0x0041:
        r3 = new com.jumio.alejwt.swig.ALESettings;	 Catch:{ all -> 0x00db }
        r3.<init>();	 Catch:{ all -> 0x00db }
        r3.setKeyID(r1);	 Catch:{ all -> 0x00db }
        r3.setPublicKey(r5);	 Catch:{ all -> 0x00db }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r1.<init>();	 Catch:{ all -> 0x00db }
        r8 = com.jumio.core.environment.Environment.getDataDirectory(r8);	 Catch:{ all -> 0x00db }
        r8 = r8.getAbsolutePath();	 Catch:{ all -> 0x00db }
        r1.append(r8);	 Catch:{ all -> 0x00db }
        r8 = "/ale/";
        r1.append(r8);	 Catch:{ all -> 0x00db }
        r8 = r1.toString();	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x007b;
    L_0x0067:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r1.<init>();	 Catch:{ all -> 0x00db }
        r1.append(r8);	 Catch:{ all -> 0x00db }
        r1.append(r4);	 Catch:{ all -> 0x00db }
        r8 = "/";
        r1.append(r8);	 Catch:{ all -> 0x00db }
        r8 = r1.toString();	 Catch:{ all -> 0x00db }
    L_0x007b:
        r1 = new java.io.File;	 Catch:{ all -> 0x00db }
        r1.<init>(r8);	 Catch:{ all -> 0x00db }
        r4 = r1.exists();	 Catch:{ all -> 0x00db }
        if (r4 != 0) goto L_0x00a4;
    L_0x0086:
        r4 = r1.mkdirs();	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x008d;
    L_0x008c:
        goto L_0x00a4;
    L_0x008d:
        r8 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00db }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r9.<init>();	 Catch:{ all -> 0x00db }
        r2 = "cannot create directory ";
        r9.append(r2);	 Catch:{ all -> 0x00db }
        r9.append(r1);	 Catch:{ all -> 0x00db }
        r9 = r9.toString();	 Catch:{ all -> 0x00db }
        r8.<init>(r9);	 Catch:{ all -> 0x00db }
        throw r8;	 Catch:{ all -> 0x00db }
    L_0x00a4:
        r3.setDirectory(r8);	 Catch:{ all -> 0x00db }
        r8 = new com.jumio.core.network.ale.SynchronizedAleCore;	 Catch:{ all -> 0x00db }
        r8.<init>(r3);	 Catch:{ all -> 0x00db }
        j = r8;	 Catch:{ all -> 0x00db }
    L_0x00ae:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r8.<init>();	 Catch:{ all -> 0x00db }
        r1 = r9.getApiToken();	 Catch:{ all -> 0x00db }
        r8.append(r1);	 Catch:{ all -> 0x00db }
        r1 = ":";
        r8.append(r1);	 Catch:{ all -> 0x00db }
        r9 = r9.getApiSecret();	 Catch:{ all -> 0x00db }
        r8.append(r9);	 Catch:{ all -> 0x00db }
        r8 = r8.toString();	 Catch:{ all -> 0x00db }
        r8 = r8.getBytes();	 Catch:{ all -> 0x00db }
        r8 = android.util.Base64.encodeToString(r8, r2);	 Catch:{ all -> 0x00db }
        r9 = new com.jumio.core.network.ale.AleEncryptionProvider;	 Catch:{ all -> 0x00db }
        r1 = j;	 Catch:{ all -> 0x00db }
        r9.<init>(r1, r8);	 Catch:{ all -> 0x00db }
        monitor-exit(r0);
        return r9;
    L_0x00db:
        r8 = move-exception;
        monitor-exit(r0);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.dv.api.calls.DvBackend.b(android.content.Context, com.jumio.sdk.models.CredentialsModel):com.jumio.core.network.EncryptionProvider");
    }

    public static synchronized void freeEncryption() {
        synchronized (DvBackend.class) {
            i.submit(new Runnable() {
                public void run() {
                    if (DvBackend.j != null) {
                        DvBackend.j.delete();
                        DvBackend.j = null;
                    }
                }
            });
        }
    }

    public static JumioError errorFromThrowable(Context context, Throwable th, Class<?> cls) {
        JumioErrorCase jumioErrorCase;
        NetworkInfo activeNetworkInfo = context != null ? ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            jumioErrorCase = com.jumio.dv.a.a.DEVICE_IS_OFFLINE;
        } else {
            boolean z = th instanceof UnexpectedResponseException;
            if (z && ((UnexpectedResponseException) th).isHttpUnauthorized()) {
                jumioErrorCase = com.jumio.dv.a.a.AUTH_FAILED;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == 400 && th.getMessage() != null && (th.getMessage().toLowerCase().contains("bad request: invalid document") || th.getMessage().toLowerCase().contains("bad request: invalid custom document code") || th.getMessage().toLowerCase().contains("bad request: custom document code is missing"))) {
                jumioErrorCase = com.jumio.dv.a.a.INVALID_DOCUMENT_TYPE;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == 403) {
                jumioErrorCase = com.jumio.dv.a.a.INVALID_CREDENTIALS;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == MobileEvents.EVENTTYPE_EXCEPTION) {
                jumioErrorCase = com.jumio.dv.a.a.ALE_KEY_NOT_VALID;
            } else if (th instanceof SSLException) {
                jumioErrorCase = com.jumio.dv.a.a.CERTIFICATE_ERROR;
            } else {
                jumioErrorCase = com.jumio.dv.a.a.GENERAL_NETWORK_ERROR;
            }
        }
        Class cls2 = a.class;
        return new JumioError(jumioErrorCase, 1, th instanceof UnexpectedResponseException ? ((UnexpectedResponseException) th).getStatusCode() : 0);
    }
}
