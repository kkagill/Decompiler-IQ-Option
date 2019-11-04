package com.jumio.nv;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.face.FaceDetector.Builder;
import com.jumio.MobileSDK;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.utils.JumioBroadcastManager;
import com.jumio.core.enums.JumioCameraPosition;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.environment.Environment;
import com.jumio.core.exceptions.MissingPermissionException;
import com.jumio.core.exceptions.PlatformNotSupportedException;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.util.JumioUrlValidator;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.benchmark.BenchmarkAlgorithm.DeviceCategory;
import com.jumio.nv.custom.NetverifyCustomSDKController;
import com.jumio.nv.custom.NetverifyCustomSDKInterface;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.liveness.extraction.LivenessDataModel;
import com.jumio.nv.models.BackendModel;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.NetverifyCredentialsModel;
import com.jumio.nv.models.NetverifyOfflineCredentialsModel;
import com.jumio.nv.models.OfflineDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.models.TemplateModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.models.CredentialsModel;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import jumio.nv.core.k;
import jumio.nv.core.t;

public class NetverifySDK extends MobileSDK {
    public static final String EXTRA_ERROR_CODE = "com.jumio.nv.NetverifySDK.EXTRA_ERROR_CODE";
    public static final String EXTRA_ERROR_MESSAGE = "com.jumio.nv.NetverifySDK.EXTRA_ERROR_MESSAGE";
    public static final String EXTRA_SCAN_DATA = "com.jumio.nv.NetverifySDK.EXTRA_SCAN_DATA";
    public static final String EXTRA_SCAN_REFERENCE = "com.jumio.nv.NetverifySDK.EXTRA_SCAN_REFERENCE";
    public static int REQUEST_CODE = 200;
    private static NetverifySDK a;
    private MerchantSettingsModel b;
    private CredentialsModel c;
    private Activity d;
    private String e;
    private String f;
    private String g;
    private ArrayList<NVDocumentType> h;
    private NVDocumentVariant i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private CompressFormat t;
    private int u;
    private a v;

    public enum GoogleVisionStatus {
        OPERATIONAL,
        NOT_OPERATIONAL,
        DIALOG_PENDING
    }

    class a extends Handler implements Subscriber<ServerSettingsModel> {
        private NetverifyInitiateCallback b;
        private int c;
        private int d;

        class a implements Subscriber<Void> {
            public void onError(Throwable th) {
            }

            private a() {
            }

            /* synthetic */ a(a aVar, AnonymousClass1 anonymousClass1) {
                this();
            }

            /* renamed from: a */
            public void onResult(Void voidR) {
                a aVar = a.this;
                aVar.sendEmptyMessage(aVar.c);
            }
        }

        /* synthetic */ a(NetverifySDK netverifySDK, Looper looper, NetverifyInitiateCallback netverifyInitiateCallback, AnonymousClass1 anonymousClass1) {
            this(looper, netverifyInitiateCallback);
        }

        private a(Looper looper, NetverifyInitiateCallback netverifyInitiateCallback) {
            super(looper);
            this.c = 100;
            this.d = 200;
            this.b = netverifyInitiateCallback;
        }

        public void handleMessage(Message message) {
            if (NetverifySDK.this.v != null) {
                NVBackend.unregisterFromUpdates(k.class, this);
            }
            if (message.what == this.c) {
                this.b.onNetverifyInitiateSuccess();
            } else if (message.what == this.d) {
                JumioError jumioError = (JumioError) message.obj;
                this.b.onNetverifyInitiateError(jumioError.getErrorCode(), jumioError.getLocalizedError(NetverifySDK.this.d), jumioError.isRetryable());
            }
        }

        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(ServerSettingsModel serverSettingsModel) {
            DataAccess.update(NetverifySDK.this.d, ServerSettingsModel.class, (Serializable) serverSettingsModel);
            NVBackend.unregisterFromUpdates(k.class, this);
            if (NetverifySDK.this.b.isSendDebugInfo() || serverSettingsModel.isAnalyticsEnabled()) {
                NVBackend.unlockAnalytics(NetverifySDK.this.d, NetverifySDK.this.c);
            } else {
                JumioAnalytics.disable();
            }
            if (NetverifySDK.this.b.isCountryPreSelected()) {
                ArrayList arrayList = new ArrayList(NetverifySDK.this.b.getSupportedDocumentTypes());
                arrayList.remove(NVDocumentType.PASSPORT);
                arrayList.remove(NVDocumentType.VISA);
                Country country = new Country(NetverifySDK.this.b.getIsoCode());
                TemplateModel templateModel = new TemplateModel(NetverifySDK.this.d);
                templateModel.add(new a(this, null));
                templateModel.getOrLoad(country, (NVDocumentType[]) arrayList.toArray(new NVDocumentType[arrayList.size()]), serverSettingsModel);
                return;
            }
            sendEmptyMessage(this.c);
        }

        @InvokeOnUiThread(false)
        public void onError(Throwable th) {
            NVBackend.cancelAllPending();
            NetverifySDK.this.v = null;
            Message message = new Message();
            message.what = this.d;
            message.obj = NVBackend.errorFromThrowable(NetverifySDK.this.d, th, k.class);
            sendMessage(message);
        }
    }

    private NetverifySDK(Activity activity, String str, String str2, JumioDataCenter jumioDataCenter) {
        String str3 = "";
        this.e = str3;
        this.f = str3;
        this.g = str3;
        this.h = null;
        this.i = null;
        this.j = str3;
        this.k = true;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = str3;
        this.q = true;
        this.r = false;
        this.v = null;
        if (activity != null) {
            MobileSDK.checkSDKRequirements(activity, false);
            Environment.checkOcrVersion(activity);
            DataAccess.delete((Context) activity, MerchantSettingsModel.class);
            DataAccess.delete((Context) activity, ServerSettingsModel.class);
            DataAccess.delete((Context) activity, SelectionModel.class);
            DataAccess.delete((Context) activity, LivenessDataModel.class);
            DataAccess.delete((Context) activity, InitiateModel.class);
            this.d = activity;
            this.c = new NetverifyCredentialsModel();
            this.c.setApiToken(str);
            this.c.setApiSecret(str2);
            this.c.setDataCenter(jumioDataCenter);
            this.b = new MerchantSettingsModel();
            this.b.setContext(activity);
            return;
        }
        throw new NullPointerException("rootActivity is null");
    }

    private NetverifySDK(Activity activity, String str) {
        this(activity, null, null, null);
        this.c = new NetverifyOfflineCredentialsModel();
        ((NetverifyOfflineCredentialsModel) this.c).setOfflineToken(str);
        ((NetverifyOfflineCredentialsModel) this.c).verify(activity);
        if (((NetverifyOfflineCredentialsModel) this.c).isNetverifyable()) {
            throw new PlatformNotSupportedException("Wrong product token");
        }
    }

    public static synchronized NetverifySDK create(Activity activity, String str, String str2, JumioDataCenter jumioDataCenter) {
        NetverifySDK netverifySDK;
        synchronized (NetverifySDK.class) {
            if (a == null) {
                a = new NetverifySDK(activity, str, str2, jumioDataCenter);
            }
            netverifySDK = a;
        }
        return netverifySDK;
    }

    public static synchronized NetverifySDK create(Activity activity, String str, @Nullable String str2) {
        NetverifySDK netverifySDK;
        synchronized (NetverifySDK.class) {
            if (a == null) {
                a = new NetverifySDK(activity, str);
            }
            if (!(str2 == null || str2.length() == 3)) {
                str2 = null;
            }
            ((NetverifyOfflineCredentialsModel) a.c).setPreferredCountry(str2);
            netverifySDK = a;
        }
        return netverifySDK;
    }

    private static synchronized void a() {
        synchronized (NetverifySDK.class) {
            a = null;
        }
    }

    public static boolean isSupportedPlatform(Context context) {
        return MobileSDK.isSupportedPlatform(context, false);
    }

    public static GoogleVisionStatus isMobileVisionOperational(Activity activity, int i) {
        try {
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(activity);
            if (isGooglePlayServicesAvailable == 0) {
                t tVar = new t(new Builder(activity).setLandmarkType(0).setMode(1).setProminentFaceOnly(true).setClassificationType(1).build());
                if (tVar.isOperational()) {
                    tVar.release();
                    return GoogleVisionStatus.OPERATIONAL;
                }
                throw new Exception("Facedetector not operational");
            } else if (!instance.isUserResolvableError(isGooglePlayServicesAvailable)) {
                return GoogleVisionStatus.NOT_OPERATIONAL;
            } else {
                Dialog errorDialog = instance.getErrorDialog(activity, isGooglePlayServicesAvailable, i);
                errorDialog.setCancelable(false);
                errorDialog.show();
                return GoogleVisionStatus.DIALOG_PENDING;
            }
        } catch (Exception unused) {
            return GoogleVisionStatus.NOT_OPERATIONAL;
        }
    }

    public static String getDebugID() {
        try {
            UUID sessionId = JumioAnalytics.getSessionId();
            if (sessionId != null) {
                return sessionId.toString();
            }
            return null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public synchronized void destroy() {
        DataAccess.delete(this.d, MerchantSettingsModel.class);
        DataAccess.delete(this.d, ServerSettingsModel.class);
        DataAccess.delete(this.d, SelectionModel.class);
        DataAccess.delete(this.d, LivenessDataModel.class);
        DataAccess.delete(this.d, InitiateModel.class);
        DataAccess.delete(this.d, DeviceCategory.class);
        DataAccess.delete(this.d, NVScanPartModel.class);
        DataAccess.delete(this.d, "fallbackScanPartModel");
        DataAccess.delete(this.d, PreviewProperties.class);
        DataAccess.delete(this.d, BackendModel.class);
        DataAccess.delete(this.d, DocumentDataModel.class);
        DataAccess.delete(this.d, OfflineDataModel.class);
        JumioAnalytics.shutdown(new Runnable() {
            public void run() {
                NVBackend.freeEncryption();
            }
        });
        JumioBroadcastManager.destroy();
        this.c = null;
        this.b = null;
        this.d = null;
        a();
        super.destroy();
    }

    public void setOfflineToken(String str, @Nullable String str2) {
        if (this.c instanceof NetverifyCredentialsModel) {
            NetverifyOfflineCredentialsModel netverifyOfflineCredentialsModel = new NetverifyOfflineCredentialsModel();
            netverifyOfflineCredentialsModel.setOfflineToken(str);
            netverifyOfflineCredentialsModel.verify(this.d);
            netverifyOfflineCredentialsModel.setPreferredCountry(str2);
            if (netverifyOfflineCredentialsModel.isNetverifyable()) {
                ((NetverifyCredentialsModel) this.c).setOfflineCredentialsModel(netverifyOfflineCredentialsModel);
                return;
            }
            throw new PlatformNotSupportedException("Wrong product token");
        }
    }

    public void setOutput(String str, CompressFormat compressFormat, int i) {
        if (str == null || !new File(str).isDirectory()) {
            throw new IllegalArgumentException("Provided path is no directory or doesn't exist.");
        } else if (compressFormat == null) {
            throw new IllegalArgumentException("Compressformat can not be null!");
        } else if (i < 0 || i > 100) {
            throw new IllegalArgumentException("Quality level must be between 0 and 100 !");
        } else {
            this.s = str;
            this.t = compressFormat;
            this.u = i;
        }
    }

    public void setCustomerId(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        this.f = str;
    }

    public void setPreselectedCountry(String str) {
        if (str == null || str.length() != 3) {
            str = "";
        }
        this.g = str;
    }

    public void setPreselectedDocumentTypes(ArrayList<NVDocumentType> arrayList) {
        this.h = new ArrayList();
        if (arrayList != null && arrayList.size() != 0) {
            this.h.addAll(arrayList);
        }
    }

    public void setPreselectedDocumentVariant(NVDocumentVariant nVDocumentVariant) {
        this.i = nVDocumentVariant;
    }

    public void setMerchantScanReference(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        this.j = str;
    }

    public void setRequireFaceMatch(boolean z) {
        this.l = true;
        this.k = z;
    }

    public void setRequireVerification(boolean z) {
        this.m = z;
    }

    public void setMerchantReportingCriteria(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        this.e = str;
    }

    public void setCameraPosition(JumioCameraPosition jumioCameraPosition) {
        this.n = jumioCameraPosition == JumioCameraPosition.FRONT;
    }

    public void setDataExtractionOnMobileOnly(boolean z) {
        this.o = z;
    }

    public void setCallbackUrl(String str) {
        if (str == null) {
            str = "";
        }
        if (!new JumioUrlValidator(new String[]{"https"}, false, false, false, false).isValid(str) || str.length() > 255) {
            Log.w("NetverifySDK", "The provided callback url is not valid!");
        } else {
            this.p = str;
        }
    }

    public void setEnableEMRTD(boolean z) {
        this.q = z;
    }

    public void sendDebugInfoToJumio(boolean z) {
        this.r = z;
    }

    public synchronized void initiate(@NonNull NetverifyInitiateCallback netverifyInitiateCallback) {
        if (netverifyInitiateCallback == null) {
            throw new IllegalArgumentException("NetverifyInitiateCallback must be set!");
        } else if (this.c instanceof NetverifyOfflineCredentialsModel) {
            netverifyInitiateCallback.onNetverifyInitiateSuccess();
        } else if (this.v == null) {
            this.v = new a(this, Looper.getMainLooper(), netverifyInitiateCallback, null);
            b();
            ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.d, ServerSettingsModel.class);
            if (serverSettingsModel == null || !serverSettingsModel.isLoaded()) {
                NVBackend.settings(this.d, this.c, this.b, this.v);
            } else {
                this.v.onResult(serverSettingsModel);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x024e  */
    private void b() {
        /*
        r11 = this;
        com.jumio.nv.utils.NetverifyLogUtils.init();
        r0 = r11.c;
        r0 = r0 instanceof com.jumio.nv.models.NetverifyOfflineCredentialsModel;
        if (r0 != 0) goto L_0x000d;
    L_0x0009:
        com.jumio.analytics.JumioAnalytics.start();
        goto L_0x0010;
    L_0x000d:
        com.jumio.analytics.JumioAnalytics.disable();
    L_0x0010:
        r0 = com.jumio.analytics.JumioAnalytics.getSessionId();
        r1 = com.jumio.analytics.DismissType.INSTANCE_CREATED;
        r2 = 0;
        r0 = com.jumio.analytics.MobileEvents.sdkLifecycle(r0, r1, r2);
        com.jumio.analytics.JumioAnalytics.add(r0);
        r0 = r11.h;
        if (r0 != 0) goto L_0x0029;
    L_0x0022:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r11.h = r0;
    L_0x0029:
        r0 = r11.h;
        r0 = r0.size();
        if (r0 != 0) goto L_0x004d;
    L_0x0031:
        r0 = r11.h;
        r1 = com.jumio.nv.data.document.NVDocumentType.PASSPORT;
        r0.add(r1);
        r0 = r11.h;
        r1 = com.jumio.nv.data.document.NVDocumentType.VISA;
        r0.add(r1);
        r0 = r11.h;
        r1 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;
        r0.add(r1);
        r0 = r11.h;
        r1 = com.jumio.nv.data.document.NVDocumentType.DRIVER_LICENSE;
        r0.add(r1);
    L_0x004d:
        r0 = r11.d;
        r1 = com.jumio.nv.models.MerchantSettingsModel.class;
        r0 = com.jumio.persistence.DataAccess.load(r0, r1);
        r0 = (com.jumio.nv.models.MerchantSettingsModel) r0;
        r1 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x009b;
    L_0x005b:
        r4 = r0.getSupportedDocumentTypes();
        if (r4 == 0) goto L_0x009b;
    L_0x0061:
        r4 = r11.h;
        r4 = r4.size();
        r5 = r0.getSupportedDocumentTypes();
        r5 = r5.size();
        if (r4 != r5) goto L_0x0073;
    L_0x0071:
        r4 = 1;
        goto L_0x0074;
    L_0x0073:
        r4 = 0;
    L_0x0074:
        r5 = r11.h;
        r5 = r5.iterator();
    L_0x007a:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x0091;
    L_0x0080:
        r6 = r5.next();
        r6 = (com.jumio.nv.data.document.NVDocumentType) r6;
        r7 = r0.getSupportedDocumentTypes();
        r6 = r7.contains(r6);
        if (r6 != 0) goto L_0x007a;
    L_0x0090:
        r4 = 0;
    L_0x0091:
        if (r4 != 0) goto L_0x00a2;
    L_0x0093:
        r0 = r11.d;
        r4 = com.jumio.nv.models.ServerSettingsModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        goto L_0x00a2;
    L_0x009b:
        r0 = r11.d;
        r4 = com.jumio.nv.models.ServerSettingsModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
    L_0x00a2:
        r0 = r11.d;
        r4 = com.jumio.nv.models.MerchantSettingsModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.SelectionModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.liveness.extraction.LivenessDataModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.InitiateModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.benchmark.BenchmarkAlgorithm.DeviceCategory.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.NVScanPartModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = "fallbackScanPartModel";
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.commons.camera.PreviewProperties.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.BackendModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.DocumentDataModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.d;
        r4 = com.jumio.nv.models.OfflineDataModel.class;
        com.jumio.persistence.DataAccess.delete(r0, r4);
        r0 = r11.b;
        r4 = r11.g;
        r0.setCountryIsoCode(r4);
        r0 = r11.b;
        r4 = r11.g;
        r4 = r4.length();
        if (r4 == 0) goto L_0x0102;
    L_0x0100:
        r4 = 1;
        goto L_0x0103;
    L_0x0102:
        r4 = 0;
    L_0x0103:
        r0.setCountryPreSelected(r4);
        r0 = r11.h;
        r0 = r0.size();
        if (r0 != r1) goto L_0x011b;
    L_0x010e:
        r0 = r11.b;
        r4 = r11.h;
        r4 = r4.get(r3);
        r4 = (com.jumio.nv.data.document.NVDocumentType) r4;
        r0.setPreSelectedDocumentType(r4);
    L_0x011b:
        r0 = r11.b;
        r4 = r11.h;
        r0.setSupportedDocumentTypes(r4);
        r0 = r11.b;
        r4 = r11.i;
        r0.setDocumentVariant(r4);
        r0 = r11.b;
        r4 = r11.i;
        if (r4 == 0) goto L_0x0131;
    L_0x012f:
        r4 = 1;
        goto L_0x0132;
    L_0x0131:
        r4 = 0;
    L_0x0132:
        r0.setDocumentVariantPreSelected(r4);
        r0 = r11.b;
        r4 = r11.k;
        if (r4 == 0) goto L_0x0145;
    L_0x013b:
        r4 = r11.d;
        r4 = com.jumio.commons.camera.JumioCameraManager.hasFrontFacingCamera(r4);
        if (r4 == 0) goto L_0x0145;
    L_0x0143:
        r4 = 1;
        goto L_0x0146;
    L_0x0145:
        r4 = 0;
    L_0x0146:
        r0.setFaceMatchEnabled(r4);
        r0 = r11.b;
        r4 = r11.l;
        if (r4 != 0) goto L_0x015a;
    L_0x014f:
        r4 = r11.d;
        r4 = com.jumio.commons.camera.JumioCameraManager.hasFrontFacingCamera(r4);
        if (r4 != 0) goto L_0x0158;
    L_0x0157:
        goto L_0x015a;
    L_0x0158:
        r4 = 0;
        goto L_0x015b;
    L_0x015a:
        r4 = 1;
    L_0x015b:
        r0.setFaceMatchSet(r4);
        r0 = r11.b;
        r4 = r11.j;
        r0.setMerchantScanReference(r4);
        r0 = r11.b;
        r4 = r11.e;
        r0.setMerchantReportingCriteria(r4);
        r0 = r11.b;
        r4 = r11.f;
        r0.setCustomerId(r4);
        r0 = r11.b;
        r4 = r11.m;
        r0.setRequireVerification(r4);
        r0 = r11.b;
        r4 = r11.n;
        r0.setCameraFacingFront(r4);
        r0 = r11.b;
        r4 = r11.p;
        r0.setCallbackUrl(r4);
        r0 = r11.b;
        r4 = r11.o;
        r0.setDataExtractionOnMobileOnly(r4);
        r0 = r11.b;
        r4 = r11.q;
        r0.setEnableEMRTD(r4);
        r0 = r11.b;
        r4 = r11.r;
        r0.setSendDebugInfo(r4);
        r0 = r11.b;
        r4 = r11.s;
        r0.setOutputDirectory(r4);
        r0 = r11.b;
        r4 = r11.t;
        r0.setOutputFormat(r4);
        r0 = r11.b;
        r4 = r11.u;
        r0.setOutputLevel(r4);
        r0 = r11.c;
        r0 = r0 instanceof com.jumio.nv.models.NetverifyOfflineCredentialsModel;
        if (r0 == 0) goto L_0x01c2;
    L_0x01b8:
        r0 = r11.b;
        r0.setRequireVerification(r3);
        r0 = r11.b;
        r0.setDataExtractionOnMobileOnly(r1);
    L_0x01c2:
        r0 = r11.c;
        r4 = r0 instanceof com.jumio.nv.models.NetverifyCredentialsModel;
        if (r4 == 0) goto L_0x01cd;
    L_0x01c8:
        r0 = (com.jumio.nv.models.NetverifyCredentialsModel) r0;
        r0.setOfflineSwitch(r3);
    L_0x01cd:
        r0 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r4 = r11.r;
        com.jumio.analytics.JumioAnalytics.allowEvent(r0, r4);
        r0 = r11.d;
        r0 = r0.getPackageManager();
        r4 = "android.hardware.nfc";
        r8 = r0.hasSystemFeature(r4);
        r0 = r11.d;
        r0 = android.nfc.NfcAdapter.getDefaultAdapter(r0);
        if (r0 == 0) goto L_0x01f0;
    L_0x01e8:
        r0 = r0.isEnabled();
        if (r0 == 0) goto L_0x01f0;
    L_0x01ee:
        r9 = 1;
        goto L_0x01f1;
    L_0x01f0:
        r9 = 0;
    L_0x01f1:
        r0 = r11.d;	 Catch:{ Exception -> 0x0228 }
        r1 = "connectivity";
        r0 = r0.getSystemService(r1);	 Catch:{ Exception -> 0x0228 }
        r0 = (android.net.ConnectivityManager) r0;	 Catch:{ Exception -> 0x0228 }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ Exception -> 0x0228 }
        r1 = "CELLULAR";
        if (r0 == 0) goto L_0x0214;
    L_0x0203:
        r4 = r0.isConnected();	 Catch:{ Exception -> 0x0228 }
        if (r4 == 0) goto L_0x0214;
    L_0x0209:
        r0 = r0.getType();	 Catch:{ Exception -> 0x0228 }
        if (r0 != 0) goto L_0x0210;
    L_0x020f:
        goto L_0x0212;
    L_0x0210:
        r1 = "WIFI";
    L_0x0212:
        r2 = r1;
        goto L_0x0228;
    L_0x0214:
        r0 = r11.d;	 Catch:{ Exception -> 0x0228 }
        r4 = "phone";
        r0 = r0.getSystemService(r4);	 Catch:{ Exception -> 0x0228 }
        r0 = (android.telephony.TelephonyManager) r0;	 Catch:{ Exception -> 0x0228 }
        r0 = r0.getDataState();	 Catch:{ Exception -> 0x0228 }
        r4 = 2;
        if (r0 != r4) goto L_0x0226;
    L_0x0225:
        goto L_0x0212;
    L_0x0226:
        r1 = r2;
        goto L_0x0212;
    L_0x0228:
        r7 = r2;
        r0 = "2.14.0 (69)";
        r1 = " (";
        r1 = r0.indexOf(r1);
        r6 = r0.substring(r3, r1);
        r5 = com.jumio.analytics.JumioAnalytics.getSessionId();
        r0 = r11.d;
        r10 = com.jumio.commons.utils.DeviceRotationManager.isTabletDevice(r0);
        r0 = com.jumio.analytics.MobileEvents.mobileDeviceInformation(r5, r6, r7, r8, r9, r10);
        com.jumio.analytics.JumioAnalytics.add(r0);
        r0 = com.jumio.core.plugins.PluginRegistry.PluginMode.NFC;
        r0 = com.jumio.core.plugins.PluginRegistry.getPlugin(r0);
        if (r0 != 0) goto L_0x0253;
    L_0x024e:
        r0 = r11.b;
        r0.setEnableEMRTD(r3);
    L_0x0253:
        r0 = "org.jmrtd";
        r0 = java.util.logging.Logger.getLogger(r0);
        r1 = java.util.logging.Level.OFF;
        r0.setLevel(r1);
        r0 = r11.d;
        r1 = com.jumio.nv.models.MerchantSettingsModel.class;
        r2 = r11.b;
        com.jumio.persistence.DataAccess.update(r0, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.NetverifySDK.b():void");
    }

    public void start() {
        this.d.startActivityForResult(getIntent(), REQUEST_CODE);
    }

    public Intent getIntent() {
        if (MobileSDK.hasAllRequiredPermissions(this.d)) {
            this.b.setWaitedForInitialize(this.v != null);
            a aVar = this.v;
            if (aVar != null) {
                NVBackend.unregisterFromUpdates(k.class, aVar);
                this.v = null;
            } else {
                b();
                ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.d, ServerSettingsModel.class);
                if (serverSettingsModel == null || !serverSettingsModel.isLoaded()) {
                    NVBackend.settings(this.d, this.c, this.b, null);
                }
            }
            DataAccess.update(this.d, MerchantSettingsModel.class, this.b);
            return super.getIntent(this.d, NetverifyActivity.class, this.c);
        }
        throw new MissingPermissionException(MobileSDK.getMissingPermissions(this.d));
    }

    public NetverifyCustomSDKController start(NetverifyCustomSDKInterface netverifyCustomSDKInterface) {
        if (MobileSDK.hasAllRequiredPermissions(this.d)) {
            if (this.g != null) {
                this.g = "";
            }
            ArrayList arrayList = this.h;
            if (arrayList != null) {
                arrayList.clear();
            }
            b();
            boolean z = false;
            this.b.setEnableEMRTD(false);
            MerchantSettingsModel merchantSettingsModel = this.b;
            if (this.v != null) {
                z = true;
            }
            merchantSettingsModel.setWaitedForInitialize(z);
            DataAccess.update(this.d, MerchantSettingsModel.class, this.b);
            a aVar = this.v;
            if (aVar != null) {
                NVBackend.unregisterFromUpdates(k.class, aVar);
                this.v = null;
            } else {
                ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.d, ServerSettingsModel.class);
                if (serverSettingsModel == null || !serverSettingsModel.isLoaded()) {
                    NVBackend.settings(this.d, this.c, this.b, null);
                }
            }
            return new NetverifyCustomSDKController(this.d, this.c, netverifyCustomSDKInterface);
        }
        throw new MissingPermissionException(MobileSDK.getMissingPermissions(this.d));
    }
}
