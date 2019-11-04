package com.jumio.nv.api.calls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.wallet.WalletConstants;
import com.jumio.alejwt.swig.ALECore;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.commons.remote.exception.UnexpectedResponseException;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.mvp.model.Publisher;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.DownloadTask;
import com.jumio.core.network.EncryptionProvider;
import com.jumio.core.network.ErrorMock;
import com.jumio.core.network.NetworkException;
import com.jumio.core.network.PinningConfig;
import com.jumio.core.network.ale.AleSecurityConfig;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.NetverifyCredentialsModel;
import com.jumio.nv.models.NetverifyOfflineCredentialsModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorCase;
import com.jumio.sdk.models.CredentialsModel;
import com.jumio.sdk.models.OfflineCredentialsModel;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLException;
import jumio.nv.core.c;
import jumio.nv.core.d;
import jumio.nv.core.e;
import jumio.nv.core.f;
import jumio.nv.core.g;
import jumio.nv.core.h;
import jumio.nv.core.i;
import jumio.nv.core.j;
import jumio.nv.core.k;
import org.json.JSONObject;

public class NVBackend {
    public static final String USER_AGENT = "Jumio Netverify Android SDK JMSDK 2.14.0 (0-69)";
    private static final String a = StringObfuscater.format(new byte[]{(byte) -92, (byte) 67, (byte) 116, (byte) 10, (byte) 114, (byte) -8, (byte) 46, (byte) 47, (byte) 47, (byte) 39, (byte) 126, (byte) 125, (byte) -111, (byte) -124, (byte) -105, (byte) 47, (byte) 101, (byte) -74, (byte) 71, (byte) 93, (byte) -76, (byte) -7, (byte) 39, (byte) -45, (byte) -91, (byte) -22, (byte) 121, (byte) -73, (byte) -77, (byte) -103, (byte) 60, (byte) 39, (byte) -28, (byte) 12, (byte) -88, (byte) -34, (byte) -34, (byte) 76, (byte) 87, (byte) 88, (byte) 37, (byte) -54, (byte) 71, (byte) -43, (byte) -32, (byte) -67, (byte) -12, (byte) 120, (byte) -86}, -4640201068163483407L);
    private static final String b = StringObfuscater.format(new byte[]{(byte) 41, (byte) 0, (byte) 67, (byte) -126, (byte) 0, (byte) 71, (byte) -117, (byte) -67, (byte) -75, (byte) -44, (byte) 41, (byte) 25, (byte) 77, (byte) -54, (byte) -44, (byte) -23, (byte) 47, (byte) -44, (byte) -33, (byte) 85, (byte) 94, (byte) 12, (byte) 24, (byte) -117, (byte) -13, (byte) -30, (byte) 73, (byte) -91, (byte) -18, (byte) 10, (byte) 77, (byte) 73, (byte) 75, (byte) -47, (byte) 116, (byte) 104, (byte) -114, (byte) -99, (byte) -8, (byte) -57, (byte) 106, (byte) -54, (byte) 33, (byte) 50, (byte) -22, (byte) 46, (byte) -12, (byte) 22, (byte) 42, (byte) 19, (byte) -121, (byte) 109, (byte) -3}, -6229241285353764017L);
    private static String c = a;
    private static String d = b;
    private static String e = AleSecurityConfig.ALE_KEY_ID_US;
    private static String f = AleSecurityConfig.ALE_KEY_ID_EU;
    private static String g = AleSecurityConfig.ALE_PUBLIC_KEY_US;
    private static String h = AleSecurityConfig.ALE_PUBLIC_KEY_EU;
    private static int i = 0;
    private static j j = new j(Executors.newSingleThreadExecutor());
    private static ALECore k;

    /* renamed from: com.jumio.nv.api.calls.NVBackend$1 */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.api.calls.NVBackend$AnonymousClass1.<clinit>():void");
        }
    }

    static class b extends Publisher<Void> implements Callable<Void> {
        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public Void call() {
            if (NVBackend.k != null) {
                NVBackend.k.delete();
                NVBackend.k = null;
            }
            publishResult(null);
            return null;
        }
    }

    static class a implements c {
        private Context a;
        private CredentialsModel b;

        public a(Context context, CredentialsModel credentialsModel) {
            this.a = context;
            this.b = credentialsModel;
        }

        public EncryptionProvider getEncryptionProvider() {
            return NVBackend.c(this.a, this.b);
        }

        public byte[][] getPublicKeys() {
            return this.b.getDataCenter() == JumioDataCenter.EU ? PinningConfig.PUBLIC_KEY_EU : PinningConfig.PUBLIC_KEY_US;
        }

        public boolean isOffline() {
            CredentialsModel credentialsModel = this.b;
            return (credentialsModel instanceof OfflineCredentialsModel) || ((credentialsModel instanceof NetverifyCredentialsModel) && ((NetverifyCredentialsModel) credentialsModel).getOfflineCredentialsModel() != null && ((NetverifyCredentialsModel) this.b).useOffline());
        }

        public boolean a(Throwable th, Context context, boolean z) {
            if ((th instanceof SocketTimeoutException) || (th instanceof NetworkException) || (th instanceof SSLException) || ((th instanceof UnexpectedResponseException) && ((UnexpectedResponseException) th).getStatusCode() == 403)) {
                InitiateModel initiateModel = (InitiateModel) DataAccess.load(context, InitiateModel.class);
                if (initiateModel == null || initiateModel.getJumioScanRef() == null) {
                    CredentialsModel credentialsModel = this.b;
                    if ((credentialsModel instanceof NetverifyCredentialsModel) && ((NetverifyCredentialsModel) credentialsModel).getOfflineCredentialsModel() != null && ((NetverifyCredentialsModel) this.b).getOfflineCredentialsModel().isNetverifyable() && !(z && NVBackend.d(context, this.b))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public CredentialsModel a() {
            return this.b;
        }
    }

    private static String a(CredentialsModel credentialsModel) {
        int i = AnonymousClass1.a[credentialsModel.getDataCenter().ordinal()];
        if (i == 1) {
            return d;
        }
        if (i != 2) {
            return null;
        }
        return c;
    }

    public static void initiate(Context context, CredentialsModel credentialsModel, MerchantSettingsModel merchantSettingsModel, ServerSettingsModel serverSettingsModel, @Nullable Subscriber<String> subscriber) {
        a(context, subscriber, new h(context, new a(context, credentialsModel), merchantSettingsModel, serverSettingsModel, j), credentialsModel);
    }

    public static void settings(Context context, CredentialsModel credentialsModel, MerchantSettingsModel merchantSettingsModel, @Nullable Subscriber<ServerSettingsModel> subscriber) {
        a(context, subscriber, new k(context, new a(context, credentialsModel), credentialsModel, merchantSettingsModel, j), credentialsModel);
    }

    public static void addPart(Context context, CredentialsModel credentialsModel, NVScanPartModel nVScanPartModel, @Nullable Subscriber<Void> subscriber, byte[] bArr) {
        a(context, subscriber, new d(context, new a(context, credentialsModel), nVScanPartModel.getSideToScan(), nVScanPartModel.getScannedImage(), bArr, j), credentialsModel);
    }

    public static void liveness(Context context, CredentialsModel credentialsModel, @Nullable Subscriber<Void> subscriber, String[] strArr) {
        a(context, subscriber, new i(context, new a(context, credentialsModel), strArr, j), credentialsModel);
    }

    public static void data(Context context, CredentialsModel credentialsModel, @Nullable Subscriber<Void> subscriber) {
        a(context, subscriber, new e(context, new a(context, credentialsModel), j), credentialsModel);
    }

    public static void extractData(Context context, CredentialsModel credentialsModel, @Nullable Subscriber<DocumentDataModel> subscriber, byte[] bArr) {
        a(context, subscriber, new f(context, new a(context, credentialsModel), bArr, j), credentialsModel);
    }

    public static void finalizeCall(Context context, CredentialsModel credentialsModel, Subscriber<Void> subscriber) {
        g gVar = new g(context, new a(context, credentialsModel), j);
        if (credentialsModel instanceof NetverifyCredentialsModel) {
            ((NetverifyCredentialsModel) credentialsModel).setFinalize(true);
        }
        a(context, subscriber, gVar, credentialsModel);
    }

    public static void registerForUpdates(Context context, Class<? extends ApiCall> cls, Subscriber subscriber) {
        j.b(context, cls, subscriber);
    }

    public static void unregisterFromUpdates(Class<? extends ApiCall> cls, Subscriber subscriber) {
        j.a(cls, subscriber);
    }

    public static void unlockAnalytics(Context context, CredentialsModel credentialsModel) {
        if (!(credentialsModel instanceof NetverifyOfflineCredentialsModel)) {
            JumioAnalytics.unlock(context, new a(context, credentialsModel), a(credentialsModel), "Jumio Netverify Android SDK JMSDK 2.14.0 (0-69)");
        }
    }

    public static int cancelAllPending() {
        int b = j.b();
        j.c();
        j = new j(Executors.newSingleThreadExecutor());
        return b;
    }

    public static void forceRetry() {
        j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|(1:(1:8)(1:9))(1:10)|11|12|13|(1:15)|16|17|(1:19)|20|(2:22|(1:24)(2:25|26))|27) */
    private static synchronized com.jumio.core.network.EncryptionProvider c(android.content.Context r8, com.jumio.sdk.models.CredentialsModel r9) {
        /*
        r0 = com.jumio.nv.api.calls.NVBackend.class;
        monitor-enter(r0);
        r1 = k;	 Catch:{ all -> 0x00db }
        r2 = 2;
        if (r1 != 0) goto L_0x00ae;
    L_0x0008:
        r1 = com.jumio.nv.api.calls.NVBackend.AnonymousClass1.a;	 Catch:{ all -> 0x00db }
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
        r6 = "^https://(?:nv|bam)-sdk\\.(.+?)?(?:\\.int)?(?:\\.)?jumio\\.com/.*$";
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
        k = r8;	 Catch:{ all -> 0x00db }
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
        r1 = k;	 Catch:{ all -> 0x00db }
        r9.<init>(r1, r8);	 Catch:{ all -> 0x00db }
        monitor-exit(r0);
        return r9;
    L_0x00db:
        r8 = move-exception;
        monitor-exit(r0);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.api.calls.NVBackend.c(android.content.Context, com.jumio.sdk.models.CredentialsModel):com.jumio.core.network.EncryptionProvider");
    }

    private static boolean d(Context context, CredentialsModel credentialsModel) {
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(context, ServerSettingsModel.class);
        boolean z = true;
        try {
            byte[] statusPublicKey;
            ErrorMock.onStatusMock(i);
            if (serverSettingsModel != null) {
                statusPublicKey = serverSettingsModel.getStatusPublicKey();
            } else if (!(credentialsModel instanceof NetverifyCredentialsModel) || ((NetverifyCredentialsModel) credentialsModel).getOfflineCredentialsModel() == null) {
                return true;
            } else {
                statusPublicKey = ((NetverifyCredentialsModel) credentialsModel).getOfflineCredentialsModel().getStatusPublicKey();
            }
            if (new JSONObject(new String(new DownloadTask("https://status.jumio.com", statusPublicKey, 5000).startSync())).optInt(NotificationCompat.CATEGORY_STATUS, 0) != 1) {
                z = false;
            }
        } catch (Exception e) {
            if ((e instanceof UnexpectedResponseException) && ((UnexpectedResponseException) e).getStatusCode() == -1) {
                z = Boolean.parseBoolean(e.getMessage());
            }
        }
        return z;
    }

    public static synchronized void freeEncryption() {
        synchronized (NVBackend.class) {
            j.a(new b());
        }
    }

    private static void a(Context context, @Nullable Subscriber subscriber, ApiCall apiCall, CredentialsModel credentialsModel) {
        j.b(context, apiCall.getClass(), subscriber);
        apiCall.configure(a(credentialsModel), "Jumio Netverify Android SDK JMSDK 2.14.0 (0-69)");
        j.a(apiCall);
    }

    public static JumioError errorFromThrowable(Context context, Throwable th, Class<?> cls) {
        JumioErrorCase jumioErrorCase;
        NetworkInfo activeNetworkInfo = context != null ? ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            jumioErrorCase = NVErrorCase.DEVICE_IS_OFFLINE;
        } else {
            boolean z = th instanceof UnexpectedResponseException;
            if (z && ((UnexpectedResponseException) th).getStatusCode() == UnexpectedResponseException.STATUS_CODE_UNAUTHORIZED) {
                jumioErrorCase = NVErrorCase.AUTH_FAILED;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == 403) {
                jumioErrorCase = NVErrorCase.INVALID_CREDENTIALS;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == MobileEvents.EVENTTYPE_EXCEPTION) {
                jumioErrorCase = NVErrorCase.ALE_KEY_NOT_VALID;
            } else if (z && ((UnexpectedResponseException) th).getStatusCode() == WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION) {
                jumioErrorCase = NVErrorCase.TRANSACTION_FINISHED;
            } else if (th instanceof SSLException) {
                jumioErrorCase = NVErrorCase.CERTIFICATE_ERROR;
            } else {
                jumioErrorCase = NVErrorCase.GENERAL_NETWORK_ERROR;
            }
        }
        int i = 0;
        int i2 = cls == k.class ? 1 : cls == h.class ? 2 : cls == f.class ? 3 : cls == d.class ? 4 : cls == e.class ? 5 : cls == g.class ? 6 : 0;
        if (th instanceof UnexpectedResponseException) {
            i = ((UnexpectedResponseException) th).getStatusCode();
        }
        return new JumioError(jumioErrorCase, i2, i);
    }
}
