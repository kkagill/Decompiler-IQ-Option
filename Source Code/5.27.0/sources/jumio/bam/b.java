package jumio.bam;

import android.content.Context;
import androidx.annotation.Nullable;
import com.jumio.alejwt.swig.ALECore;
import com.jumio.analytics.MobileEvents;
import com.jumio.bam.enums.BamErrorCase;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.commons.remote.exception.UnexpectedResponseException;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.exceptions.PlatformNotSupportedException;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.EncryptionProvider;
import com.jumio.core.network.PinningConfig;
import com.jumio.core.network.ale.AleSecurityConfig;
import com.jumio.sdk.SDKExpiredException;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorCase;
import com.jumio.sdk.models.CredentialsModel;
import com.jumio.sdk.models.OfflineCredentialsModel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLException;

/* compiled from: BamBackend */
public class b {
    private static boolean a = false;
    private static final String b = StringObfuscater.format(new byte[]{(byte) 10, (byte) -12, (byte) -87, (byte) -67, (byte) 95, (byte) 90, (byte) -113, (byte) 99, (byte) 43, (byte) 123, (byte) 34, (byte) 90, (byte) -120, (byte) -96, (byte) -107, (byte) -115, (byte) -111, (byte) 84, (byte) -120, (byte) -100, (byte) 10, (byte) -126, (byte) -87, (byte) 2, (byte) -59, (byte) 100, (byte) 94, (byte) -121, (byte) 35, (byte) -4, (byte) 57, (byte) -44, (byte) -58, (byte) 116, (byte) 24, (byte) -69, (byte) -35, (byte) 55, (byte) -9, (byte) -95, (byte) -109, (byte) -81, (byte) 112, (byte) -18, (byte) -48, (byte) -110, (byte) -96, (byte) -67, (byte) -14, (byte) 80, (byte) -5, (byte) 61, (byte) -121, (byte) -119, (byte) 97}, 6187360532917353291L);
    private static final String c = StringObfuscater.format(new byte[]{(byte) -99, (byte) -110, (byte) -122, (byte) -81, (byte) -50, (byte) -107, (byte) 37, (byte) -110, (byte) -117, (byte) -90, (byte) 34, (byte) -67, (byte) -96, Byte.MIN_VALUE, (byte) 112, (byte) -40, (byte) 87, (byte) -58, (byte) 112, (byte) -39, (byte) 17, (byte) 57, (byte) -41, (byte) 41, (byte) -82, (byte) -127, (byte) -66, (byte) -26, (byte) -113, (byte) -23, (byte) -25, (byte) 60, (byte) -50, (byte) 107, (byte) 39, (byte) -14, (byte) -93, (byte) 89, (byte) -52, (byte) -86, (byte) -124, (byte) -37, (byte) -21, (byte) 48, (byte) -13, (byte) 72, (byte) 41, (byte) -80, (byte) -109, (byte) -112, (byte) 110, (byte) 67, (byte) -17, (byte) -81, (byte) -38, (byte) 14, (byte) 72, (byte) 66, (byte) -89}, -3509753331641672212L);
    private static String d = b;
    private static String e = c;
    private static String f = AleSecurityConfig.ALE_KEY_ID_US;
    private static String g = AleSecurityConfig.ALE_KEY_ID_EU;
    private static String h = AleSecurityConfig.ALE_PUBLIC_KEY_US;
    private static String i = AleSecurityConfig.ALE_PUBLIC_KEY_EU;
    private static ExecutorService j = Executors.newSingleThreadExecutor();
    private static ALECore k;

    /* compiled from: BamBackend */
    /* renamed from: jumio.bam.b$2 */
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
            throw new UnsupportedOperationException("Method not decompiled: jumio.bam.b$AnonymousClass2.<clinit>():void");
        }
    }

    /* compiled from: BamBackend */
    static class b implements Runnable {
        private Context a;
        private OfflineCredentialsModel b;
        private Subscriber<u> c;

        public b(Context context, OfflineCredentialsModel offlineCredentialsModel, @Nullable Subscriber<u> subscriber) {
            this.a = context;
            this.b = offlineCredentialsModel;
            this.c = subscriber;
        }

        public void run() {
            try {
                this.b.verify(this.a);
                u uVar = new u();
                uVar.c(this.b.isBranding());
                uVar.a(false);
                uVar.b(false);
                this.c.onResult(uVar);
            } catch (Exception e) {
                this.c.onError(e);
            }
        }
    }

    /* compiled from: BamBackend */
    static class a implements DynamicProvider {
        private Context a;
        private CredentialsModel b;

        public a(Context context, CredentialsModel credentialsModel) {
            this.a = context;
            this.b = credentialsModel;
        }

        public EncryptionProvider getEncryptionProvider() {
            return b.b(this.a, this.b);
        }

        public byte[][] getPublicKeys() {
            return this.b.getDataCenter() == JumioDataCenter.EU ? PinningConfig.PUBLIC_KEY_EU : PinningConfig.PUBLIC_KEY_US;
        }

        public boolean isOffline() {
            return this.b instanceof OfflineCredentialsModel;
        }
    }

    private static String a(CredentialsModel credentialsModel) {
        int i = AnonymousClass2.a[credentialsModel.getDataCenter().ordinal()];
        if (i == 1) {
            return e;
        }
        if (i != 2) {
            return null;
        }
        return d;
    }

    public static void a(Context context, CredentialsModel credentialsModel, v vVar, @Nullable Subscriber<u> subscriber) {
        if (credentialsModel instanceof OfflineCredentialsModel) {
            j.submit(new b(context, (OfflineCredentialsModel) credentialsModel, subscriber));
            return;
        }
        a(false);
        d dVar = new d(context, new a(context, credentialsModel), vVar, subscriber);
        dVar.configure(a(credentialsModel), "Jumio Netswipe Android SDK JMSDK 2.14.0 (0-69)");
        j.submit(dVar);
    }

    public static void a(Context context, CredentialsModel credentialsModel, ImageData imageData, String str, @Nullable Subscriber<String> subscriber, byte[] bArr) {
        if (a) {
            if (subscriber != null) {
                subscriber.onResult(str);
            }
            return;
        }
        c cVar = new c(context, new a(context, credentialsModel), imageData, bArr, str, subscriber);
        cVar.configure(a(credentialsModel), "Jumio Netswipe Android SDK JMSDK 2.14.0 (0-69)");
        j.submit(cVar);
    }

    public static void a(Context context, CredentialsModel credentialsModel, v vVar, w wVar, String str, @Nullable Subscriber<String> subscriber) {
        if (a) {
            if (subscriber != null) {
                subscriber.onResult(str);
            }
            return;
        }
        e eVar = new e(context, new a(context, credentialsModel), vVar, wVar, str, subscriber);
        eVar.configure(a(credentialsModel), "Jumio Netswipe Android SDK JMSDK 2.14.0 (0-69)");
        j.submit(eVar);
    }

    public static void a(Context context, CredentialsModel credentialsModel, w wVar, String str) {
        if (!a) {
            f fVar = new f(context, new a(context, credentialsModel), wVar, str);
            fVar.configure(a(credentialsModel), "Jumio Netswipe Android SDK JMSDK 2.14.0 (0-69)");
            j.submit(fVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|(1:(1:8)(1:9))(1:10)|11|12|13|(1:15)|16|17|(1:19)|20|(2:22|(1:24)(2:25|26))|27) */
    private static synchronized com.jumio.core.network.EncryptionProvider b(android.content.Context r8, com.jumio.sdk.models.CredentialsModel r9) {
        /*
        r0 = jumio.bam.b.class;
        monitor-enter(r0);
        r1 = k;	 Catch:{ all -> 0x00db }
        r2 = 2;
        if (r1 != 0) goto L_0x00ae;
    L_0x0008:
        r1 = jumio.bam.b.AnonymousClass2.a;	 Catch:{ all -> 0x00db }
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
        r1 = f;	 Catch:{ all -> 0x00db }
        r5 = h;	 Catch:{ all -> 0x00db }
        goto L_0x0026;
    L_0x0022:
        r1 = g;	 Catch:{ all -> 0x00db }
        r5 = i;	 Catch:{ all -> 0x00db }
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
        throw new UnsupportedOperationException("Method not decompiled: jumio.bam.b.b(android.content.Context, com.jumio.sdk.models.CredentialsModel):com.jumio.core.network.EncryptionProvider");
    }

    public static synchronized void a() {
        synchronized (b.class) {
            j.submit(new Runnable() {
                public void run() {
                    if (b.k != null) {
                        b.k.delete();
                        b.k = null;
                    }
                }
            });
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    public static JumioError a(Throwable th, Class<?> cls) {
        JumioErrorCase jumioErrorCase;
        boolean z = th instanceof UnexpectedResponseException;
        if (z && ((UnexpectedResponseException) th).isHttpUnauthorized()) {
            jumioErrorCase = BamErrorCase.AUTH_FAILED;
        } else if (z && ((UnexpectedResponseException) th).getStatusCode() == 403) {
            jumioErrorCase = BamErrorCase.INVALID_CREDENTIALS;
        } else if (z && ((UnexpectedResponseException) th).getStatusCode() == MobileEvents.EVENTTYPE_EXCEPTION) {
            jumioErrorCase = BamErrorCase.ALE_KEY_NOT_VALID;
        } else if (th instanceof SSLException) {
            jumioErrorCase = BamErrorCase.CERTIFICATE_ERROR;
        } else if ((th instanceof PlatformNotSupportedException) || (th instanceof SDKExpiredException)) {
            jumioErrorCase = BamErrorCase.AUTH_FAILED;
        } else {
            jumioErrorCase = null;
        }
        int i = 0;
        int i2 = cls == d.class ? 1 : cls == c.class ? 2 : cls == e.class ? 3 : cls == f.class ? 4 : 0;
        if (z) {
            i = ((UnexpectedResponseException) th).getStatusCode();
        }
        if (jumioErrorCase == null) {
            return null;
        }
        return new JumioError(jumioErrorCase, i2, i);
    }
}
