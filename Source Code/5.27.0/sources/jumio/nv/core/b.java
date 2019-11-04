package jumio.nv.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.analytics.DismissType;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.enums.Rotation;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.utils.StringUtil;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.util.ReflectionUtil;
import com.jumio.nv.NetverifySDK;
import com.jumio.nv.R;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.benchmark.Benchmark;
import com.jumio.nv.benchmark.BenchmarkAlgorithm.DeviceCategory;
import com.jumio.nv.custom.NetverifyCustomSDKController.InternalController;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.liveness.extraction.LivenessDataModel;
import com.jumio.nv.models.AdditionalDataPointsModel;
import com.jumio.nv.models.BackendModel;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.OfflineDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.models.CredentialsModel;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: NetverifyController */
public class b {
    private Activity activity;
    protected NfcController mNfcController;
    protected BroadcastReceiver mReceiver;
    protected b netverifyControllerInterface;
    protected DeviceRotationManager rotationManager;

    /* compiled from: NetverifyController */
    /* renamed from: jumio.nv.core.b$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[NVDocumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.jumio.nv.data.document.NVDocumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.nv.data.document.NVDocumentType.PASSPORT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.nv.data.document.NVDocumentType.DRIVER_LICENSE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.nv.data.document.NVDocumentType.VISA;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.b$AnonymousClass3.<clinit>():void");
        }
    }

    /* compiled from: NetverifyController */
    class a implements UncaughtExceptionHandler {
        private final UncaughtExceptionHandler b;

        public a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Wrapping handler :");
            stringBuilder.append(uncaughtExceptionHandler.getClass().toString());
            Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
            this.b = uncaughtExceptionHandler;
        }

        public void a() {
            if (Thread.getDefaultUncaughtExceptionHandler() == this) {
                Thread.setDefaultUncaughtExceptionHandler(this.b);
            }
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (th instanceof Exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("uncaught exception: ");
                stringBuilder.append(th);
                Log.d(JumioAnalytics.LOGTAG, stringBuilder.toString());
                JumioAnalytics.add(MobileEvents.exception(JumioAnalytics.getSessionId(), (Exception) th));
                JumioAnalytics.add(MobileEvents.sdkLifecycle(JumioAnalytics.getSessionId(), DismissType.ABORTED, null));
                JumioAnalytics.flush();
            }
            UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* compiled from: NetverifyController */
    public interface b {
        void finishSDK(Intent intent);
    }

    /* compiled from: NetverifyController */
    class c implements NfcController {
        public boolean consumeIntent(int i, Intent intent) {
            return false;
        }

        public void downloadCertificates(ServerSettingsModel serverSettingsModel) {
        }

        public boolean hasNfcFeature() {
            return false;
        }

        public boolean hasRootCertificate(String str) {
            return false;
        }

        public boolean isNfcEnabled() {
            return false;
        }

        public void pause(Activity activity) {
        }

        public void setEnabled(boolean z) {
        }

        public void setTagAccess(Object obj) {
        }

        public void start(Activity activity) {
        }

        public void stop() {
        }

        private c() {
        }

        /* synthetic */ c(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public void setInterface(b bVar) {
        this.netverifyControllerInterface = bVar;
    }

    public void create(Activity activity, CredentialsModel credentialsModel, boolean z) {
        this.rotationManager = new DeviceRotationManager(activity, Rotation.NATIVE);
        this.activity = activity;
        if (z) {
            ArrayList arrayList = new ArrayList();
            checkResources(activity, R.style.Base_Theme_Netverify, R.styleable.jumio, arrayList);
            checkResources(activity, R.style.Base_Theme_Netverify, R.styleable.netverify, arrayList);
            MerchantSettingsModel merchantSettingsModel = (MerchantSettingsModel) DataAccess.load((Context) activity, MerchantSettingsModel.class);
            if (merchantSettingsModel != null) {
                MetaInfo metaInfo = new MetaInfo();
                Object obj = "";
                metaInfo.put("dataCenter", credentialsModel.getDataCenter() != null ? credentialsModel.getDataCenter().toString() : obj);
                if (merchantSettingsModel.getIsoCode() != null) {
                    obj = merchantSettingsModel.getIsoCode();
                }
                metaInfo.put("preselectedCountry", obj);
                int i = merchantSettingsModel.getDocumentVariant() == NVDocumentVariant.PAPER ? 1 : merchantSettingsModel.getDocumentVariant() == NVDocumentVariant.PLASTIC ? 2 : 0;
                metaInfo.put("preselectedDocumentStyle", Integer.valueOf(i));
                if (merchantSettingsModel.getSupportedDocumentTypes() != null) {
                    Iterator it = merchantSettingsModel.getSupportedDocumentTypes().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        int i3 = AnonymousClass3.a[((NVDocumentType) it.next()).ordinal()];
                        if (i3 == 1) {
                            i2 |= 1;
                        } else if (i3 == 2) {
                            i2 |= 2;
                        } else if (i3 == 3) {
                            i2 |= 4;
                        } else if (i3 == 4) {
                            i2 |= 8;
                        }
                    }
                    if (i2 > 0) {
                        metaInfo.put("preselectedDocumentTypes", Integer.valueOf(i2));
                    }
                }
                metaInfo.put("requireFaceMatch", Boolean.valueOf(merchantSettingsModel.isFaceMatchEnabled()));
                metaInfo.put("requireFaceMatchSet", Boolean.valueOf(merchantSettingsModel.isFaceMatchSet()));
                metaInfo.put("requireVerification", Boolean.valueOf(merchantSettingsModel.requireVerification()));
                metaInfo.put("merchantReportingCriteria", Boolean.valueOf(StringUtil.nullOrEmpty(merchantSettingsModel.getMerchantReportingCriteria()) ^ 1));
                metaInfo.put("merchantScanReference ", Boolean.valueOf(StringUtil.nullOrEmpty(merchantSettingsModel.getMerchantScanReference()) ^ 1));
                metaInfo.put("customerId", Boolean.valueOf(StringUtil.nullOrEmpty(merchantSettingsModel.getCustomerId()) ^ 1));
                metaInfo.put("cameraPositionFront", Boolean.valueOf(merchantSettingsModel.isCameraFrontfacing()));
                metaInfo.put("callbackUrl", Boolean.valueOf(StringUtil.nullOrEmpty(merchantSettingsModel.getCallbackUrl()) ^ 1));
                metaInfo.put("dataExtractionOnMobileOnly", Boolean.valueOf(merchantSettingsModel.isDataExtractionOnMobileOnly()));
                metaInfo.put("sendDebugInfoToJumio", Boolean.valueOf(merchantSettingsModel.isSendDebugInfo()));
                metaInfo.put("eMrtdEnabled", Boolean.valueOf(merchantSettingsModel.isEnableEMRTD()));
                metaInfo.put("didFinishInitializing", Boolean.valueOf(merchantSettingsModel.hasWaitedForInitialize()));
                metaInfo.put("theming", new ag().a(arrayList));
                ArrayList availablePlugins = PluginRegistry.getAvailablePlugins();
                availablePlugins.add("com.jumio.MobileSDK");
                availablePlugins.add("com.jumio.dv.DocumentVerificationSDK");
                metaInfo.put("modules", new af().a(availablePlugins));
                String str = "superDelegate";
                if (ReflectionUtil.hasClass("com.facebook.react.ReactActivity")) {
                    metaInfo.put(str, "ReactActivity");
                } else if (ReflectionUtil.hasClass("org.apache.cordova.CordovaActivity")) {
                    metaInfo.put(str, "CordovaActivity");
                }
                metaInfo.put("customUI", Boolean.valueOf(this instanceof InternalController));
                try {
                    float f = activity.getResources().getConfiguration().fontScale;
                    if (f != 1.0f) {
                        metaInfo.put("fontScale", Float.valueOf(f));
                    }
                } catch (Exception e) {
                    Log.printStackTrace(e);
                }
                try {
                    AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility");
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        metaInfo.put("talkback", Boolean.valueOf(true));
                    }
                } catch (Exception e2) {
                    Log.printStackTrace(e2);
                }
                try {
                    Locale locale;
                    if (VERSION.SDK_INT >= 24) {
                        locale = activity.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = activity.getApplicationContext().getResources().getConfiguration().locale;
                    }
                    if (locale != null) {
                        metaInfo.put("locale", locale.toString());
                    }
                } catch (Exception e22) {
                    Log.printStackTrace(e22);
                }
                try {
                    PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
                    metaInfo.put("appVersion", String.format("%s (%d)", new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)}));
                } catch (Exception e222) {
                    Log.printStackTrace(e222);
                }
                JumioAnalytics.add(MobileEvents.sdkParameters(JumioAnalytics.getSessionId(), metaInfo));
                if (merchantSettingsModel.requireVerification()) {
                    ad.a((Context) activity, System.currentTimeMillis());
                    ad.a((Context) activity, "Jumio03", 0);
                }
            } else {
                return;
            }
        }
        Benchmark.startMeasurement(activity);
    }

    private void checkResources(Activity activity, int i, int[] iArr, ArrayList<String> arrayList) {
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(i, iArr);
        TypedArray obtainStyledAttributes2 = activity.getTheme().obtainStyledAttributes(iArr);
        int i2 = 0;
        while (i2 < obtainStyledAttributes.length()) {
            try {
                TypedValue peekValue = obtainStyledAttributes.peekValue(i2);
                TypedValue peekValue2 = obtainStyledAttributes2.peekValue(i2);
                if (peekValue.type == peekValue2.type && peekValue.data == peekValue2.data && peekValue.string == peekValue2.string && peekValue.density == peekValue2.density) {
                    i2++;
                } else {
                    arrayList.add(activity.getResources().getResourceEntryName(iArr[i2]));
                    i2++;
                }
            } catch (Exception unused) {
            }
        }
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    public void start() {
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    public void resume(Context context) {
        this.mReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("com.jumio.nv.CLOSE_SDK")) {
                    b.this.finishSDK(context, intent);
                }
            }
        };
        LocalBroadcastManager.getInstance(context).registerReceiver(this.mReceiver, a.a());
    }

    public void pause(Context context) {
        if (this.mReceiver != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.mReceiver);
            this.mReceiver = null;
        }
    }

    public void stop() {
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof a)) {
            ((a) defaultUncaughtExceptionHandler).a();
        }
        ad.b(this.activity);
    }

    public void destroy() {
        this.activity = null;
        JumioAnalytics.shutdown(new Runnable() {
            public void run() {
                NVBackend.freeEncryption();
            }
        });
    }

    public NfcController getNfcController(Context context) {
        if (this.mNfcController == null) {
            this.mNfcController = p.a(context);
            if (this.mNfcController == null) {
                this.mNfcController = new c(this, null);
            }
        }
        return this.mNfcController;
    }

    public DeviceRotationManager getRotationManager() {
        return this.rotationManager;
    }

    public void finishSDK(Context context, Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("com.jumio.nv.RESULT", 0);
        DismissType dismissType = intExtra == -1 ? DismissType.FINISHED : DismissType.CANCELLED;
        MetaInfo metaInfo = null;
        if (intExtra == 0) {
            try {
                metaInfo = new MetaInfo();
                metaInfo.put("code", intent.getStringExtra(NetverifySDK.EXTRA_ERROR_CODE));
                ad.b(context, "Jumio05");
            } catch (IllegalStateException unused) {
            }
        } else if (intExtra == -1) {
            ad.b(context, "Jumio04");
        }
        JumioAnalytics.add(MobileEvents.sdkLifecycle(JumioAnalytics.getSessionId(), dismissType, metaInfo));
        DataAccess.delete(context, SelectionModel.class);
        DataAccess.delete(context, InitiateModel.class);
        DataAccess.delete(context, BackendModel.class);
        DataAccess.delete(context, LivenessDataModel.class);
        DataAccess.delete(context, DeviceCategory.class);
        DataAccess.delete(context, NVScanPartModel.class);
        DataAccess.delete(context, "fallbackScanPartModel");
        DataAccess.delete(context, PreviewProperties.class);
        DataAccess.delete(context, BackendModel.class);
        DataAccess.delete(context, DocumentDataModel.class);
        DataAccess.delete(context, OfflineDataModel.class);
        DataAccess.delete(context, AdditionalDataPointsModel.class);
        File[] listFiles = new File(context.getFilesDir(), "jumio").listFiles();
        if (listFiles != null) {
            intExtra = listFiles.length;
            while (i < intExtra) {
                File file = listFiles[i];
                if (file.isFile() && file.getName().startsWith("tmp_") && !file.delete()) {
                    file.deleteOnExit();
                }
                i++;
            }
        }
        NVBackend.cancelAllPending();
        b bVar = this.netverifyControllerInterface;
        if (bVar != null) {
            bVar.finishSDK(intent);
        }
    }
}
