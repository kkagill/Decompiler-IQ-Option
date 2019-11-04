package jumio.nv.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.vision.face.FaceDetector;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.Log.LogLevel;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.environment.Environment;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.nv.R;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.api.helpers.UploadManager;
import com.jumio.nv.data.document.DocumentType;
import com.jumio.nv.data.document.NVDocumentMaskingType;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.enums.NVExtractionMethod;
import com.jumio.nv.extraction.NVExtractionUpdateState;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.liveness.extraction.LivenessClient;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.models.TemplateModel;
import com.jumio.nv.utils.NetverifyLogUtils;
import com.jumio.nv.view.interactors.NVScanView;
import com.jumio.nv.view.interactors.NVScanView.GuiState;
import com.jumio.nv.view.interactors.NVScanView.HelpViewStyle;
import com.jumio.nv.view.interactors.NVScanView.NVHelpConfiguration;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import com.jumio.sdk.manual.ManualExtractionUpdateState;
import com.jumio.sdk.models.BaseScanPartModel;
import com.jumio.sdk.presentation.BaseScanPresenter;
import com.jumio.sdk.presentation.BaseScanPresenterBase.BaseScanControl;
import com.jumio.sdk.util.DeviceMovementManager;
import java.io.File;
import java.io.Serializable;

/* compiled from: NVScanPresenter */
public class aa extends BaseScanPresenter<NVScanView, ExtractionUpdate, DocumentDataModel> {
    private NVScanPartModel a;
    private NVScanPartModel b;
    private NVHelpConfiguration c;
    private ViewGroup d;
    private boolean e;
    private GuiState f = GuiState.SCAN;
    private FaceDetector g = null;
    private SelectionModel h;
    private boolean i = false;
    private boolean j = false;
    private Handler k = new Handler(Looper.getMainLooper());
    private UploadManager l;
    private MerchantSettingsModel m;
    private ServerSettingsModel n;
    private DeviceMovementManager o;

    /* compiled from: NVScanPresenter */
    /* renamed from: jumio.nv.core.aa$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b = new int[ScreenAngle.values().length];
        static final /* synthetic */ int[] c = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        static {
            /*
            r0 = jumio.nv.core.aa.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            c = r0;
            r0 = 1;
            r1 = c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = jumio.nv.core.aa.a.HELP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = jumio.nv.core.aa.a.OVERLAY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = jumio.nv.core.aa.a.CONFIRMATION;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = c;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = jumio.nv.core.aa.a.BRANDING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = com.jumio.commons.enums.ScreenAngle.values();
            r4 = r4.length;
            r4 = new int[r4];
            b = r4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = com.jumio.commons.enums.ScreenAngle.PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = com.jumio.commons.enums.ScreenAngle.LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = com.jumio.commons.enums.ScreenAngle.INVERTED_LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r4[r5] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r5 = com.jumio.commons.enums.ScreenAngle.INVERTED_PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r4 = com.jumio.core.data.document.DocumentScanMode.values();
            r4 = r4.length;
            r4 = new int[r4];
            a = r4;
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0079 }
            r5 = com.jumio.core.data.document.DocumentScanMode.PDF417;	 Catch:{ NoSuchFieldError -> 0x0079 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0079 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r4 = com.jumio.core.data.document.DocumentScanMode.MRP;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0083 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x008d }
            r1 = com.jumio.core.data.document.DocumentScanMode.MRV;	 Catch:{ NoSuchFieldError -> 0x008d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008d }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = com.jumio.core.data.document.DocumentScanMode.TD1;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0097 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00a2 }
            r1 = com.jumio.core.data.document.DocumentScanMode.TD2;	 Catch:{ NoSuchFieldError -> 0x00a2 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a2 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a2 }
        L_0x00a2:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r1 = com.jumio.core.data.document.DocumentScanMode.CNIS;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00b8 }
            r1 = com.jumio.core.data.document.DocumentScanMode.CSSN;	 Catch:{ NoSuchFieldError -> 0x00b8 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b8 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00b8 }
        L_0x00b8:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00c4 }
            r1 = com.jumio.core.data.document.DocumentScanMode.LINEFINDER;	 Catch:{ NoSuchFieldError -> 0x00c4 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c4 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00c4 }
        L_0x00c4:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r1 = com.jumio.core.data.document.DocumentScanMode.TEMPLATEMATCHER;	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00d0 }
        L_0x00d0:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00dc }
            r1 = com.jumio.core.data.document.DocumentScanMode.MANUAL;	 Catch:{ NoSuchFieldError -> 0x00dc }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00dc }
            r2 = 10;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00dc }
        L_0x00dc:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = com.jumio.core.data.document.DocumentScanMode.FACE;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r2 = 11;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.aa$AnonymousClass3.<clinit>():void");
        }
    }

    /* compiled from: NVScanPresenter */
    public enum a {
        TITLE,
        OVERLAY,
        HELP,
        CONFIRMATION,
        BRANDING
    }

    /* compiled from: NVScanPresenter */
    class b implements OnClickListener {
        private b() {
        }

        /* synthetic */ b(aa aaVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onClick(View view) {
            aa.this.o();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean enableFlashOnStart() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public BaseScanPartModel getScanPartModel() {
        if (this.a == null) {
            this.a = (NVScanPartModel) DataAccess.load(((NVScanView) getView()).getContext(), NVScanPartModel.class);
            if (this.h == null) {
                this.h = (SelectionModel) DataAccess.load(((NVScanView) getView()).getContext(), SelectionModel.class);
            }
            SelectionModel selectionModel = this.h;
            if (!(selectionModel == null || this.a == null || selectionModel.getSelectedDoctype() == null || !this.h.getSelectedDoctype().getDocumentScanMode().equals(this.a.getScanMode()) || this.h.getSelectedDoctype().getThirdPartyOcr() == null || !NVDocumentVariant.PLASTIC.equals(this.h.getSelectedVariant()) || !PluginRegistry.hasPlugin(PluginMode.TEMPLATE_MATCHER))) {
                try {
                    if (new TemplateModel(((NVScanView) getView()).getContext()).getTemplate(this.h.getSelectedCountry(), this.h.getSelectedDoctype().getId(), this.h.getSelectedDoctype().getDocumentScanSide()) != null) {
                        this.h.getSelectedDoctype().setDocumentScanMode(DocumentScanMode.TEMPLATEMATCHER);
                        ScanSide sideToScan = this.a.getSideToScan();
                        this.a = new NVScanPartModel(sideToScan, DocumentScanMode.TEMPLATEMATCHER, this.a.getPartIndex());
                        this.h.getUploadModel().replace(sideToScan, this.a);
                        DataAccess.update(((NVScanView) getView()).getContext(), SelectionModel.class, this.h);
                    }
                } catch (Exception e) {
                    Log.e("ScanPresenter", e);
                }
            }
        }
        return this.a;
    }

    public PluginMode getScanPluginMode() {
        if (this.a.getScanMode() != DocumentScanMode.FACE || LivenessClient.getVisionStatus(((NVScanView) getView()).getContext()) == null) {
            return this.n.getScanPluginMode(this.a.getScanMode());
        }
        return PluginMode.FACE_MANUAL;
    }

    /* Access modifiers changed, original: protected */
    public boolean startCameraFrontfacing() {
        return this.m.isCameraFrontfacing() || getScanPartModel().getScanMode() == DocumentScanMode.FACE;
    }

    /* Access modifiers changed, original: protected */
    public boolean canSwitchCamera() {
        return (this.cameraManager == null || !this.cameraManager.hasMultipleCameras() || getScanPartModel().getScanMode() == DocumentScanMode.FACE) ? false : true;
    }

    public boolean control(int i) {
        boolean control = super.control(i);
        if (i == BaseScanControl.toggleFlash) {
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.FLASH, this.cameraManager.isFlashOn() ? "ON" : "OFF"));
        } else if (i == BaseScanControl.toggleCamera) {
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.CAMERA, this.cameraManager.isFrontFacing() ? "BACK" : "FRONT"));
        }
        return control;
    }

    public void onPreviewAvailable(PreviewProperties previewProperties) {
        super.onPreviewAvailable(previewProperties);
        boolean z = true;
        this.mExtractionClient.setDataExtractionActive(this.f == GuiState.SCAN);
        if (this.f == GuiState.SCAN) {
            ServerSettingsModel serverSettingsModel = this.n;
            if (serverSettingsModel == null || !serverSettingsModel.isBrandingEnabled()) {
                z = false;
            }
            ((NVScanView) getView()).updateBranding(z);
            return;
        }
        ((NVScanView) getView()).updateBranding(false);
    }

    public void onCameraError(Throwable th) {
        if (getView() != null) {
            ((NVScanView) getView()).onError(new JumioError(NVErrorCase.NO_CAMERA_CONNECTION));
        }
    }

    public void onManualRefocus(int i, int i2) {
        super.onManualRefocus(i, i2);
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.REFOCUS));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        if (this.m == null) {
            this.m = (MerchantSettingsModel) DataAccess.load(((NVScanView) getView()).getContext(), MerchantSettingsModel.class);
            if (this.m == null) {
                ((NVScanView) getView()).onError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
                return;
            }
        }
        if (this.n == null) {
            this.n = (ServerSettingsModel) DataAccess.load(((NVScanView) getView()).getContext(), ServerSettingsModel.class);
            if (this.n == null) {
                ((NVScanView) getView()).onError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
                return;
            }
        }
        if (!(this.o != null || this.n.getShakeDetection() == -1 || Environment.isPieOrAbove())) {
            this.o = new DeviceMovementManager(((NVScanView) getView()).getContext(), this.n.getShakeDetection(), this.n.getShakeScore());
        }
        super.onCreate();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        SelectionModel selectionModel = this.h;
        boolean z = true;
        boolean z2 = selectionModel != null && selectionModel.isVerificationRequired();
        this.e = z2;
        DeviceMovementManager deviceMovementManager = this.o;
        if (deviceMovementManager != null) {
            deviceMovementManager.start();
        }
        if (this.a == null) {
            this.a = (NVScanPartModel) DataAccess.load(((NVScanView) getView()).getContext(), NVScanPartModel.class);
            if (this.a == null) {
                ((NVScanView) getView()).onError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
                return;
            }
        }
        if (this.b == null) {
            this.b = (NVScanPartModel) DataAccess.load(((NVScanView) getView()).getContext(), "fallbackScanPartModel");
        }
        if (!(((NVScanView) getView()).getRotationManager().isScreenPortrait() || ((NVScanView) getView()).getRotationManager().isTablet())) {
            z = false;
        }
        if (this.mOverlay != null) {
            onUpdate(new ExtractionUpdate(ExtractionUpdateState.receiveClickListener, new b(this, null)));
            this.mOverlay.setVisible(((NVScanView) getView()).displayOverlay(z) ? 0 : 4);
        }
        selectionModel = this.h;
        if (selectionModel != null) {
            this.c = a(selectionModel, z);
            if (this.f == GuiState.SCAN) {
                ((NVScanView) getView()).showHelp(this.c, false);
            }
            if (c()) {
                NVHelpConfiguration nVHelpConfiguration = this.c;
                if (!(nVHelpConfiguration == null || nVHelpConfiguration.scanMode == DocumentScanMode.FACE)) {
                    r();
                }
            }
            if (this.l == null) {
                this.l = new UploadManager(((NVScanView) getView()).getContext(), this.h.getUploadModel().getActivePart().getSideToScan(), ((NVScanView) getView()).getCredentialsModel(), this.e);
                this.l.add(new Subscriber<Boolean>() {
                    /* renamed from: a */
                    public void onResult(Boolean bool) {
                    }

                    public void onError(Throwable th) {
                        if (aa.this.isActive()) {
                            ((NVScanView) aa.this.getView()).onError(th);
                        }
                    }
                });
                this.l.addSubscribers();
            }
            PluginMode scanPluginMode = getScanPluginMode();
            MetaInfo metaInfo = new MetaInfo();
            metaInfo.put(PendingOrderWrapper.SIDE, this.a.getSideToScan().toString());
            metaInfo.put("type", scanPluginMode.toString());
            JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.SCAN, metaInfo));
            ((NVScanView) getView()).updateUiAutomationScanId(scanPluginMode);
        }
        super.onStart();
    }

    public void a() {
        if (this.cameraManager != null) {
            this.cameraManager.startPreview();
        }
    }

    public void b() {
        this.f = GuiState.SCAN;
        if (this.a.getScannedImage().getImagePath() != null) {
            this.a.getScannedImage().clear();
        }
        this.mExtractionClient.cancel();
        this.mExtractionClient.reinit();
        this.mExtractionClient.setDataExtractionActive(true);
        onStart();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        DeviceMovementManager deviceMovementManager = this.o;
        if (deviceMovementManager != null) {
            deviceMovementManager.stop();
        }
        UploadManager uploadManager = this.l;
        if (uploadManager != null) {
            uploadManager.removeSubscribers();
            this.l = null;
        }
        if (this.a != null) {
            DataAccess.update(((NVScanView) getView()).getContext(), NVScanPartModel.class, this.a);
        }
        if (this.b != null) {
            DataAccess.update(((NVScanView) getView()).getContext(), "fallbackScanPartModel", this.b);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.mOrientationListener != null) {
            this.mOrientationListener.disable();
            this.mOrientationListener = null;
        }
        FaceDetector faceDetector = this.g;
        if (faceDetector != null) {
            faceDetector.release();
            this.g = null;
        }
    }

    /* renamed from: a */
    public void onUpdate(final ExtractionUpdate extractionUpdate) {
        if (isActive() && extractionUpdate != null) {
            int state = extractionUpdate.getState();
            if (state == ExtractionUpdateState.shotTaken) {
                ((NVScanView) getView()).extractionStarted();
                ImageData scannedImage = this.a.getScannedImage();
                this.cameraManager.getImageData(scannedImage);
                this.cameraManager.stopPreview(false);
                scannedImage.setFocusConfidence(((Float) extractionUpdate.getData()).floatValue());
                try {
                    ((Vibrator) ((NVScanView) getView()).getContext().getSystemService("vibrator")).vibrate(100);
                } catch (Exception unused) {
                }
            } else if (state == ExtractionUpdateState.notifyFlash) {
                this.cameraManager.requestFlashHint(((Boolean) extractionUpdate.getData()).booleanValue());
            } else if (state == ExtractionUpdateState.notifyFocus) {
                Point point = (Point) extractionUpdate.getData();
                this.cameraManager.requestFocus(point.x, point.y);
            } else {
                String str = "tmp_%d";
                Bitmap bitmap;
                File file;
                if (state == ExtractionUpdateState.saveImage) {
                    bitmap = (Bitmap) extractionUpdate.getData();
                    if (Log.isLogEnabledForLevel(LogLevel.DEBUG) && bitmap != null) {
                        NetverifyLogUtils.dumpImageInSubfolder(bitmap, this.mExtractionClient.getClass().getSimpleName(), CompressFormat.JPEG, 80, String.valueOf(this.a.getPartIndex()));
                    }
                    file = new File(Environment.getDataDirectory(((NVScanView) getView()).getContext()), String.format(str, new Object[]{Long.valueOf(System.currentTimeMillis())}));
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        CameraUtils.saveBitmap(bitmap, file, CompressFormat.WEBP, 75);
                    }
                    this.a.getScannedImage().setImagePath(file.getAbsolutePath());
                } else if (state == ExtractionUpdateState.saveExactImage) {
                    bitmap = (Bitmap) extractionUpdate.getData();
                    file = new File(Environment.getDataDirectory(((NVScanView) getView()).getContext()), String.format(str, new Object[]{Long.valueOf(System.currentTimeMillis())}));
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        CameraUtils.saveBitmap(bitmap, file, CompressFormat.JPEG, 80);
                    }
                    this.a.getScannedImage().setExactImagePath(file.getAbsolutePath());
                } else if (state == NVExtractionUpdateState.showHelp) {
                    if (this.f == GuiState.SCAN) {
                        this.c.showFullscreen = true;
                        ((NVScanView) getView()).showHelp(this.c, false);
                    }
                } else if (state == ManualExtractionUpdateState.focusHint) {
                    ((NVScanView) getView()).displayBlurHint();
                } else {
                    this.k.post(new Runnable() {
                        public void run() {
                            if (aa.this.mOverlay != null && aa.this.isActive()) {
                                aa.this.mOverlay.update(extractionUpdate);
                                ((NVScanView) aa.this.getView()).invalidateDrawView(false);
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f9  */
    /* renamed from: a */
    public void onResult(com.jumio.nv.models.DocumentDataModel r8) {
        /*
        r7 = this;
        super.onResult(r8);
        r0 = r7.isActive();
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = "ScanPresenter";
        r1 = "onResult";
        com.jumio.commons.log.Log.d(r0, r1);
        r0 = com.jumio.analytics.JumioAnalytics.getSessionId();
        r1 = com.jumio.analytics.Screen.SCAN;
        r2 = com.jumio.analytics.UserAction.SCAN_TRIGGERED;
        r3 = r7.cameraManager;
        r3 = r3.isFrontFacing();
        if (r3 == 0) goto L_0x0024;
    L_0x0021:
        r3 = "FRONT";
        goto L_0x0026;
    L_0x0024:
        r3 = "BACK";
    L_0x0026:
        r0 = com.jumio.analytics.MobileEvents.userAction(r0, r1, r2, r3);
        com.jumio.analytics.JumioAnalytics.add(r0);
        r0 = r7.a;
        r0 = r0.getScanMode();
        r1 = r7.h;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x02ec;
    L_0x0039:
        if (r8 != 0) goto L_0x0056;
    L_0x003b:
        r1 = r1.getUploadModel();
        r1 = r1.getExtractionMethod();
        r4 = com.jumio.nv.enums.NVExtractionMethod.NONE;
        if (r1 != r4) goto L_0x0056;
    L_0x0047:
        r1 = r7.a;
        r1 = r1.getSideToScan();
        r4 = com.jumio.core.data.document.ScanSide.FRONT;
        if (r1 != r4) goto L_0x0056;
    L_0x0051:
        r8 = new com.jumio.nv.models.DocumentDataModel;
        r8.<init>();
    L_0x0056:
        r1 = r7.a;
        r1.setDocumentInfo(r8);
        r1 = jumio.nv.core.aa.AnonymousClass3.a;
        r4 = r0.ordinal();
        r1 = r1[r4];
        r4 = 0;
        switch(r1) {
            case 1: goto L_0x01a7;
            case 2: goto L_0x012b;
            case 3: goto L_0x012b;
            case 4: goto L_0x012b;
            case 5: goto L_0x012b;
            case 6: goto L_0x012b;
            case 7: goto L_0x0088;
            case 8: goto L_0x0088;
            case 9: goto L_0x0085;
            case 10: goto L_0x0085;
            case 11: goto L_0x0069;
            default: goto L_0x0067;
        };
    L_0x0067:
        goto L_0x02ec;
    L_0x0069:
        r0 = r8 instanceof com.jumio.nv.liveness.extraction.LivenessDataModel;
        if (r0 == 0) goto L_0x02ec;
    L_0x006d:
        r8 = (com.jumio.nv.liveness.extraction.LivenessDataModel) r8;
        r0 = r7.getView();
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;
        r0 = r0.getContext();
        r1 = com.jumio.nv.liveness.extraction.LivenessDataModel.class;
        com.jumio.persistence.DataAccess.update(r0, r1, r8);
        r0 = r7.l;
        r0.startLiveness(r8);
        goto L_0x02ec;
    L_0x0085:
        r1 = 1;
        goto L_0x02ed;
    L_0x0088:
        r8 = r7.a;
        r8 = r8.getSideToScan();
        r0 = com.jumio.core.data.document.ScanSide.BACK;
        if (r8 != r0) goto L_0x0085;
    L_0x0092:
        r8 = new com.google.android.gms.vision.face.FaceDetector$Builder;	 Catch:{ Exception -> 0x0085 }
        r0 = r7.getView();	 Catch:{ Exception -> 0x0085 }
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;	 Catch:{ Exception -> 0x0085 }
        r0 = r0.getContext();	 Catch:{ Exception -> 0x0085 }
        r8.<init>(r0);	 Catch:{ Exception -> 0x0085 }
        r8 = r8.setTrackingEnabled(r3);	 Catch:{ Exception -> 0x0085 }
        r8 = r8.setLandmarkType(r3);	 Catch:{ Exception -> 0x0085 }
        r8 = r8.setMode(r3);	 Catch:{ Exception -> 0x0085 }
        r8 = r8.build();	 Catch:{ Exception -> 0x0085 }
        r7.g = r8;	 Catch:{ Exception -> 0x0085 }
        r8 = r7.g;	 Catch:{ Exception -> 0x0085 }
        r8 = r8.isOperational();	 Catch:{ Exception -> 0x0085 }
        if (r8 == 0) goto L_0x0123;
    L_0x00bb:
        r8 = new jumio.nv.core.t;	 Catch:{ Exception -> 0x0085 }
        r0 = r7.g;	 Catch:{ Exception -> 0x0085 }
        r8.<init>(r0);	 Catch:{ Exception -> 0x0085 }
        r0 = r7.a;	 Catch:{ Exception -> 0x0085 }
        r0 = r0.getScannedImage();	 Catch:{ Exception -> 0x0085 }
        r0 = r0.getImagePath();	 Catch:{ Exception -> 0x0085 }
        r0 = android.graphics.BitmapFactory.decodeFile(r0);	 Catch:{ Exception -> 0x0085 }
        r1 = new com.google.android.gms.vision.Frame$Builder;	 Catch:{ Exception -> 0x0085 }
        r1.<init>();	 Catch:{ Exception -> 0x0085 }
        r0 = r1.setBitmap(r0);	 Catch:{ Exception -> 0x0085 }
        r0 = r0.build();	 Catch:{ Exception -> 0x0085 }
        r8 = r8.detect(r0);	 Catch:{ Exception -> 0x0085 }
        if (r8 == 0) goto L_0x0085;
    L_0x00e3:
        r8 = r8.size();	 Catch:{ Exception -> 0x0085 }
        if (r8 <= 0) goto L_0x0085;
    L_0x00e9:
        r7.i = r2;	 Catch:{ Exception -> 0x0085 }
        r8 = r7.h;	 Catch:{ Exception -> 0x0085 }
        r0 = r7.getView();	 Catch:{ Exception -> 0x0085 }
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;	 Catch:{ Exception -> 0x0085 }
        r0 = r0.getRotationManager();	 Catch:{ Exception -> 0x0085 }
        r0 = r0.isScreenPortrait();	 Catch:{ Exception -> 0x0085 }
        if (r0 != 0) goto L_0x0110;
    L_0x00fd:
        r0 = r7.getView();	 Catch:{ Exception -> 0x0085 }
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;	 Catch:{ Exception -> 0x0085 }
        r0 = r0.getRotationManager();	 Catch:{ Exception -> 0x0085 }
        r0 = r0.isTablet();	 Catch:{ Exception -> 0x0085 }
        if (r0 == 0) goto L_0x010e;
    L_0x010d:
        goto L_0x0110;
    L_0x010e:
        r0 = 0;
        goto L_0x0111;
    L_0x0110:
        r0 = 1;
    L_0x0111:
        r8 = r7.a(r8, r0);	 Catch:{ Exception -> 0x0085 }
        r7.c = r8;	 Catch:{ Exception -> 0x0085 }
        r8 = r7.getView();	 Catch:{ Exception -> 0x0085 }
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;	 Catch:{ Exception -> 0x0085 }
        r0 = r7.c;	 Catch:{ Exception -> 0x0085 }
        r8.showHelp(r0, r3);	 Catch:{ Exception -> 0x0085 }
        return;
    L_0x0123:
        r8 = new java.lang.Exception;	 Catch:{ Exception -> 0x0085 }
        r0 = "Detector dependencies are not yet available.";
        r8.<init>(r0);	 Catch:{ Exception -> 0x0085 }
        throw r8;	 Catch:{ Exception -> 0x0085 }
    L_0x012b:
        r1 = r7.e;
        r5 = r7.h;
        r6 = r7.d();
        r5 = r7.a(r5, r6);
        if (r5 == 0) goto L_0x02ed;
    L_0x0139:
        r5 = r7.h;
        r5 = r5.getSelectedCountry();
        if (r5 == 0) goto L_0x02ed;
    L_0x0141:
        r5 = r7.h;
        r5 = r5.getSelectedCountry();
        r5 = r5.getIsoCode();
        r6 = "NLD";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x02ed;
    L_0x0153:
        if (r8 == 0) goto L_0x02ed;
    L_0x0155:
        r5 = r8.getMrzData();
        if (r5 == 0) goto L_0x02ed;
    L_0x015b:
        r5 = com.jumio.core.data.document.DocumentScanMode.TD1;
        if (r0 != r5) goto L_0x0181;
    L_0x015f:
        r0 = r8.getMrzData();
        r0 = r0.getMrzLine1();
        r5 = 15;
        r6 = 30;
        r5 = r0.substring(r5, r6);
        r6 = "XXXXXXXXXXXXXXX";
        r0 = r0.replace(r5, r6);
        r5 = r8.getMrzData();
        r5.setMrzLine1(r0);
        r8.setPersonalNumber(r4);
        goto L_0x02ed;
    L_0x0181:
        r5 = com.jumio.core.data.document.DocumentScanMode.MRP;
        if (r0 != r5) goto L_0x02ed;
    L_0x0185:
        r0 = r8.getMrzData();
        r0 = r0.getMrzLine2();
        r5 = 28;
        r6 = 42;
        r5 = r0.substring(r5, r6);
        r6 = "XXXXXXXXXXXXXX";
        r0 = r0.replace(r5, r6);
        r5 = r8.getMrzData();
        r5.setMrzLine2(r0);
        r8.setIdNumber(r4);
        goto L_0x02ed;
    L_0x01a7:
        if (r8 == 0) goto L_0x01b2;
    L_0x01a9:
        r4 = r8.getAddressLine();
        r8 = r8.getCity();
        goto L_0x01b3;
    L_0x01b2:
        r8 = r4;
    L_0x01b3:
        r0 = r7.e;
        if (r0 != 0) goto L_0x02ec;
    L_0x01b7:
        r0 = r7.m;
        r0 = r0.isDataExtractionOnMobileOnly();
        if (r0 != 0) goto L_0x02ec;
    L_0x01bf:
        r0 = r7.h;
        r0 = r0.isAddressEnabled();
        if (r0 == 0) goto L_0x02ec;
    L_0x01c7:
        r0 = r7.h;
        r0 = r0.getSelectedCountry();
        r0 = r0.getIsoCode();
        r1 = "USA";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02ec;
    L_0x01d9:
        if (r4 == 0) goto L_0x01e9;
    L_0x01db:
        r0 = r4.length();
        if (r0 == 0) goto L_0x01e9;
    L_0x01e1:
        if (r8 == 0) goto L_0x01e9;
    L_0x01e3:
        r8 = r8.length();
        if (r8 != 0) goto L_0x02ec;
    L_0x01e9:
        r8 = r7.mExtractionClient;
        r8.unsubscribe(r7);
        r8 = r7.mExtractionClient;
        r8.destroy();
        r8 = com.jumio.core.data.document.DocumentScanMode.CSSN;
        r0 = r7.a;
        r0 = r0.getScanMode();
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0202;
    L_0x0201:
        return;
    L_0x0202:
        r8 = r7.a;
        r0 = r7.h;
        r7.a(r8, r0);
        r8 = r7.a;
        r7.b = r8;
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r8 = r8.getContext();
        r0 = r7.b;
        r1 = "fallbackScanPartModel";
        com.jumio.persistence.DataAccess.update(r8, r1, r0);
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r8 = r8.getContext();
        r0 = com.jumio.nv.models.NVScanPartModel.class;
        r1 = r7.a;
        com.jumio.persistence.DataAccess.update(r8, r0, r1);
        r8 = new com.jumio.nv.models.NVScanPartModel;
        r0 = com.jumio.core.data.document.ScanSide.FRONT;
        r1 = com.jumio.core.data.document.DocumentScanMode.CSSN;
        r8.<init>(r0, r1, r3);
        r7.a = r8;
        r7.j = r2;
        r8 = r7.h;
        r0 = r7.getView();
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;
        r0 = r0.getRotationManager();
        r0 = r0.isScreenPortrait();
        if (r0 != 0) goto L_0x0260;
    L_0x024e:
        r0 = r7.getView();
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;
        r0 = r0.getRotationManager();
        r0 = r0.isTablet();
        if (r0 == 0) goto L_0x025f;
    L_0x025e:
        goto L_0x0260;
    L_0x025f:
        r2 = 0;
    L_0x0260:
        r8 = r7.a(r8, r2);
        r7.c = r8;
        r8 = r7.getScanPluginMode();
        r8 = com.jumio.core.plugins.PluginRegistry.getPlugin(r8);
        r7.plugin = r8;
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r0 = r7.c;
        r8.showHelp(r0, r3);
        r8 = r7.plugin;
        r0 = r7.getView();
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;
        r0 = r0.getContext();
        r8 = r8.getExtractionClient(r0);
        r7.mExtractionClient = r8;
        r8 = r7.mExtractionClient;
        r8.setExtractionInterface(r7);
        r8 = r7.mExtractionClient;
        r0 = r7.a;
        r8.configure(r0);
        r8 = r7.mExtractionClient;
        r8.subscribe(r7);
        r8 = r7.mExtractionClient;
        r0 = r7.getView();
        r0 = (com.jumio.nv.view.interactors.NVScanView) r0;
        r0 = r0.getRotationManager();
        r0 = r0.isTablet();
        r8.setTablet(r0);
        r8 = r7.mExtractionClient;
        r0 = r7.mPreviewProperties;
        r8.setPreviewProperties(r0);
        r8 = r7.mExtractionClient;
        r0 = r7.getExtractionArea();
        r8.setExtractionArea(r0);
        r8 = r7.mExtractionClient;
        r8.reinit();
        r8 = r7.h;
        r8 = r8.getSelectedDoctype();
        r0 = com.jumio.core.data.document.ScanSide.FRONT;
        r8.setDocumentScanSide(r0);
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r8 = r8.getContext();
        r0 = com.jumio.nv.models.SelectionModel.class;
        r1 = r7.h;
        com.jumio.persistence.DataAccess.update(r8, r0, r1);
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r8.noUsAddressFound();
        return;
    L_0x02ec:
        r1 = 0;
    L_0x02ed:
        r8 = r7.cameraManager;
        r8.stopPreview(r2);
        r8 = r7.mExtractionClient;
        r8.cancel();
        if (r1 == 0) goto L_0x031a;
    L_0x02f9:
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r8.hideHelp();
        r8 = r7.getView();
        r8 = (com.jumio.nv.view.interactors.NVScanView) r8;
        r0 = r7.a;
        r0 = r0.getScannedImage();
        r0 = r0.getExactImagePath();
        r8.showConfirmation(r0, r3);
        r8 = com.jumio.nv.view.interactors.NVScanView.GuiState.CONFIRMATION;
        r7.f = r8;
        goto L_0x0325;
    L_0x031a:
        r8 = r7.e;
        if (r8 != 0) goto L_0x0322;
    L_0x031e:
        r7.q();
        goto L_0x0325;
    L_0x0322:
        r7.b(r3);
    L_0x0325:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.aa.onResult(com.jumio.nv.models.DocumentDataModel):void");
    }

    @InvokeOnUiThread
    public void onError(Throwable th) {
        super.onError(th);
    }

    /* Access modifiers changed, original: protected */
    public void onScreenAngleChanged(ScreenAngle screenAngle) {
        super.onScreenAngleChanged(screenAngle);
        int i = AnonymousClass3.b[screenAngle.ordinal()];
        String str = ActiveQuote.PHASE_OPENING_AUCTION;
        if (i != 1) {
            if (i == 2) {
                str = "L";
            } else if (i == 3) {
                str = "IL";
            } else if (i == 4) {
                str = "IP";
            }
        }
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), null, UserAction.ORIENTATION_CHANGED, str));
    }

    public void addChildren(@NonNull ViewGroup viewGroup) {
        super.addChildren(viewGroup);
        this.d = viewGroup;
    }

    public boolean isSteady() {
        DeviceMovementManager deviceMovementManager = this.o;
        return deviceMovementManager == null || deviceMovementManager.isDeviceSteady();
    }

    public float getFocusThreshold() {
        return this.n.getFocusScore() != -1.0f ? this.n.getFocusScore() : super.getFocusThreshold();
    }

    public boolean c() {
        return this.e;
    }

    public ScanSide d() {
        NVScanPartModel nVScanPartModel = this.a;
        return nVScanPartModel != null ? nVScanPartModel.getSideToScan() : null;
    }

    public DocumentScanMode e() {
        NVScanPartModel nVScanPartModel = this.a;
        return nVScanPartModel != null ? nVScanPartModel.getScanMode() : null;
    }

    public void f() {
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.CONFIRMATION, UserAction.CONFIRM));
        if (this.e) {
            b(false);
        } else {
            q();
        }
    }

    public void g() {
        NVBackend.finalizeCall(((NVScanView) getView()).getContext(), ((NVScanView) getView()).getCredentialsModel(), null);
    }

    public void h() {
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.CONFIRMATION, UserAction.RETRY));
        if (c()) {
            ad.b(((NVScanView) getView()).getContext(), "Jumio03");
        }
        b();
    }

    private boolean a(SelectionModel selectionModel) {
        NfcController nfcController = ((NVScanView) getView()).getNfcController();
        DocumentDataModel documentInfo = this.a.getDocumentInfo();
        if (documentInfo != null && nfcController.hasNfcFeature()) {
            String isoCode = selectionModel.getSelectedCountry().getIsoCode();
            if (!(documentInfo.getIssuingCountry() == null || documentInfo.getIssuingCountry().length() == 0)) {
                isoCode = documentInfo.getIssuingCountry();
            }
            String substring;
            try {
                substring = documentInfo.getMrzData().getMrzLine1().substring(0, 2);
            } catch (Exception unused) {
                substring = "";
            }
            DocumentType documentTypeFor = this.n.getCountryModel().getDocumentTypeFor(isoCode, selectionModel.getSelectedDoctype().getId());
            if (documentTypeFor != null && documentTypeFor.hasEMRTD(substring) && this.a.getSideToScan() == documentTypeFor.getDocumentScanSide()) {
                return nfcController.hasRootCertificate(isoCode);
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void a(NVScanPartModel nVScanPartModel, SelectionModel selectionModel) {
        Context context = ((NVScanView) getView()).getContext();
        DataAccess.delete(context, NVScanPartModel.class);
        if (selectionModel != null) {
            selectionModel.getUploadModel().replace(nVScanPartModel.getSideToScan(), nVScanPartModel);
            DataAccess.update(context, SelectionModel.class, (Serializable) selectionModel);
            return;
        }
        Log.w("ScanPresenter", "NVScanPresenter#storeScanPart(): Selection model was not found in persistence!!");
    }

    /* Access modifiers changed, original: protected */
    public void i() {
        DocumentDataModel documentInfo = this.a.getDocumentInfo();
        if (documentInfo != null) {
            Bundle bundle = new Bundle();
            String issuingCountry = documentInfo.getIssuingCountry();
            if (issuingCountry == null) {
                SelectionModel selectionModel = this.h;
                if (selectionModel != null) {
                    issuingCountry = selectionModel.getSelectedCountry().getIsoCode();
                }
            }
            if (issuingCountry != null) {
                issuingCountry = issuingCountry.toLowerCase();
            }
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(((NVScanView) getView()).getContext(), InitiateModel.class);
            bundle.putString("country", issuingCountry);
            bundle.putString("idnumber", documentInfo.getIdNumber());
            long j = 0;
            bundle.putLong("dob", documentInfo.getDob() != null ? documentInfo.getDob().getTime() : 0);
            if (documentInfo.getExpiryDate() != null) {
                j = documentInfo.getExpiryDate().getTime();
            }
            bundle.putLong("doe", j);
            bundle.putString("scanReference", initiateModel != null ? initiateModel.getJumioScanRef() : "");
            ((NVScanView) getView()).showNFC(bundle);
        }
    }

    private void q() {
        this.f = GuiState.LOADING;
        ((NVScanView) getView()).showLoading();
        SelectionModel selectionModel = this.h;
        if (selectionModel == null) {
            Log.w("ScanPresenter", "NVScanPresenter#extractDataAndClose(): data model cannot be null!");
            return;
        }
        if (selectionModel.getUploadModel().has(this.a.getSideToScan())) {
            this.h.getUploadModel().replace(this.a.getSideToScan(), this.a);
        } else {
            this.h.getUploadModel().add(this.a);
        }
        this.h.getUploadModel().setDocumentData(this.a.getSideToScan(), this.a.getDocumentInfo());
        DataAccess.update(((NVScanView) getView()).getContext(), SelectionModel.class, this.h);
        if (this.a.getScanMode() == DocumentScanMode.TEMPLATEMATCHER || this.a.getScanMode() == DocumentScanMode.CSSN) {
            this.l.startExtractData(this.h, this.a.getSideToScan());
        } else {
            this.l.startData();
        }
    }

    private void b(boolean z) {
        a(this.a, this.h);
        MerchantSettingsModel merchantSettingsModel = (MerchantSettingsModel) DataAccess.load(((NVScanView) getView()).getContext(), MerchantSettingsModel.class);
        if (merchantSettingsModel != null) {
            SelectionModel selectionModel = this.h;
            if (!(selectionModel == null || selectionModel.getUploadModel() == null)) {
                Object obj = 1;
                Object obj2 = (merchantSettingsModel == null || !merchantSettingsModel.isEnableEMRTD()) ? null : 1;
                if (obj2 == null || !a(this.h)) {
                    obj = null;
                }
                if (z) {
                    this.l.startExtractData(this.h, ScanSide.FRONT);
                } else {
                    this.l.startAddPart(this.h);
                }
                if (obj != null) {
                    i();
                } else if (this.h.getUploadModel() == null || this.h.getUploadModel().allPartsScanned()) {
                    if (this.h.getUploadModel().getExtractionMethod() == NVExtractionMethod.OCR) {
                        for (NVScanPartModel nVScanPartModel : this.h.getUploadModel().getScans()) {
                            if (nVScanPartModel.getScanMode() == DocumentScanMode.TEMPLATEMATCHER || nVScanPartModel.getScanMode() == DocumentScanMode.CSSN) {
                                this.l.startExtractData(this.h, nVScanPartModel.getSideToScan());
                            }
                        }
                    }
                    this.l.startData();
                    ((NVScanView) getView()).scansComplete();
                } else {
                    ((NVScanView) getView()).partComplete();
                }
                return;
            }
        }
        onError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
    }

    public void j() {
        if (this.h.getUploadModel().hasNext()) {
            this.a = this.h.getUploadModel().nextPart();
            DataAccess.update(((NVScanView) getView()).getContext(), SelectionModel.class, this.h);
            DataAccess.update(((NVScanView) getView()).getContext(), NVScanPartModel.class, this.a);
        }
    }

    private NVDocumentMaskingType b(SelectionModel selectionModel) {
        ServerSettingsModel serverSettingsModel = this.n;
        if (!(serverSettingsModel == null || serverSettingsModel.getCountryModel() == null || selectionModel.getSelectedCountry() == null || selectionModel.getSelectedDoctype() == null)) {
            DocumentType documentTypeFor = this.n.getCountryModel().getDocumentTypeFor(selectionModel.getSelectedCountry().getIsoCode(), selectionModel.getSelectedDoctype().getId());
            if (documentTypeFor != null) {
                return documentTypeFor.getMaskingType();
            }
        }
        return NVDocumentMaskingType.NONE;
    }

    private boolean a(SelectionModel selectionModel, ScanSide scanSide) {
        NVDocumentMaskingType b = b(selectionModel);
        return b.toString().equalsIgnoreCase(scanSide.toString()) || b == NVDocumentMaskingType.BOTH;
    }

    private void r() {
        if (a(this.h, d())) {
            String isoCode = this.h.getSelectedCountry().getIsoCode();
            int i = -1;
            int hashCode = isoCode.hashCode();
            int i2 = 0;
            if (hashCode != 67572) {
                if (hashCode != 74606) {
                    if (hashCode == 77382 && isoCode.equals("NLD")) {
                        i = 0;
                    }
                } else if (isoCode.equals("KOR")) {
                    i = 1;
                }
            } else if (isoCode.equals("DEU")) {
                i = 2;
            }
            if (i == 0) {
                i2 = R.string.netverify_scanview_legal_hint_nld;
            } else if (i == 1) {
                i2 = R.string.netverify_scanview_legal_hint_kor;
            } else if (i == 2) {
                if (this.h.getSelectedDoctype().getId() == NVDocumentType.PASSPORT) {
                    i2 = R.string.netverify_scanview_legal_hint_deu_passport;
                } else if (this.h.getSelectedDoctype().getId() == NVDocumentType.IDENTITY_CARD) {
                    if (this.h.getSelectedVariant() == NVDocumentVariant.PLASTIC) {
                        i2 = R.string.netverify_scanview_legal_hint_deu_id_plastic;
                    } else if (this.h.getSelectedVariant() == NVDocumentVariant.PAPER) {
                        i2 = R.string.netverify_scanview_legal_hint_deu_id_paper;
                    }
                }
            }
            ((NVScanView) getView()).showLegalHint(i2);
        }
    }

    public void a(a aVar, boolean z) {
        int i = AnonymousClass3.c[aVar.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            int i2 = 4;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.f == GuiState.SCAN) {
                            ServerSettingsModel serverSettingsModel = this.n;
                            if (serverSettingsModel == null || !serverSettingsModel.isBrandingEnabled()) {
                                z2 = false;
                            }
                            ((NVScanView) getView()).updateBranding(z2);
                            return;
                        }
                        ((NVScanView) getView()).updateBranding(false);
                    }
                } else if (this.f == GuiState.CONFIRMATION) {
                    ((NVScanView) getView()).showConfirmation(this.a.getScannedImage().getExactImagePath(), true);
                }
            } else if (this.mOverlay != null) {
                this.mOverlay.calculate(this.a.getScanMode(), this.a.getFormat(), getExtractionArea());
                this.mOverlay.prepareDraw(this.a.getSideToScan(), this.cameraManager.isFrontFacing(), z);
                if (getView() != null) {
                    Overlay overlay = this.mOverlay;
                    if (((NVScanView) getView()).displayOverlay(z)) {
                        i2 = 0;
                    }
                    overlay.setVisible(i2);
                    ((NVScanView) getView()).invalidateDrawView(false);
                }
            }
        } else if (this.f != GuiState.LOADING) {
            SelectionModel selectionModel = this.h;
            if (selectionModel != null) {
                this.c = a(selectionModel, z);
                this.c.showFullscreen = false;
                ((NVScanView) getView()).showHelp(this.c, true);
            }
        }
    }

    public GuiState k() {
        return this.f;
    }

    public void a(GuiState guiState) {
        this.f = guiState;
    }

    public void a(boolean z) {
        if (isActive()) {
            this.f = z ? GuiState.HELP : GuiState.SCAN;
            boolean z2 = true;
            this.mExtractionClient.setDataExtractionActive(this.f == GuiState.SCAN);
            if (this.f == GuiState.SCAN) {
                NVHelpConfiguration nVHelpConfiguration = this.c;
                if (nVHelpConfiguration != null) {
                    z = nVHelpConfiguration.isUSDLFallback;
                    String str = "type";
                    String str2 = PendingOrderWrapper.SIDE;
                    PluginMode scanPluginMode;
                    MetaInfo metaInfo;
                    if (z) {
                        this.j = false;
                        nVHelpConfiguration = this.c;
                        nVHelpConfiguration.isUSDLFallback = false;
                        nVHelpConfiguration.showFullscreen = false;
                        nVHelpConfiguration.showFallback = false;
                        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.HELP, UserAction.FALLBACK));
                        ((NVScanView) getView()).showHelp(this.c, true);
                        scanPluginMode = getScanPluginMode();
                        metaInfo = new MetaInfo();
                        metaInfo.put(str2, this.a.getSideToScan().toString());
                        metaInfo.put(str, scanPluginMode.toString());
                        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.SCAN, metaInfo));
                    } else if (this.c.isIdBackFaceDetected) {
                        this.i = false;
                        ((NVScanView) getView()).flipDocument();
                        b();
                    } else {
                        scanPluginMode = getScanPluginMode();
                        metaInfo = new MetaInfo();
                        metaInfo.put(str2, this.a.getSideToScan().toString());
                        metaInfo.put(str, scanPluginMode.toString());
                        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.SCAN, metaInfo));
                    }
                }
                ServerSettingsModel serverSettingsModel = this.n;
                if (serverSettingsModel == null || !serverSettingsModel.isBrandingEnabled()) {
                    z2 = false;
                }
                ((NVScanView) getView()).updateBranding(z2);
            } else {
                if (!(this.c.isUSDLFallback || this.c.isIdBackFaceDetected)) {
                    JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.HELP, null));
                }
                ((NVScanView) getView()).updateBranding(false);
            }
        }
    }

    public void l() {
        NVHelpConfiguration nVHelpConfiguration = this.c;
        if (nVHelpConfiguration == null) {
            return;
        }
        if (nVHelpConfiguration.isUSDLFallback || this.c.isIdBackFaceDetected) {
            this.mOverlay = this.plugin.getOverlay(((NVScanView) getView()).getContext(), null);
            DeviceRotationManager rotationManager = ((NVScanView) getView()).getRotationManager();
            if (this.mOverlay != null && this.a != null && this.cameraManager != null && rotationManager != null) {
                this.mOverlay.calculate(this.a.getScanMode(), this.a.getFormat(), getExtractionArea());
                boolean z = rotationManager.isScreenPortrait() || rotationManager.isTablet();
                this.mOverlay.prepareDraw(this.a.getSideToScan(), this.cameraManager.isFrontFacing(), z);
                this.mOverlay.setVisible(((NVScanView) getView()).displayOverlay(z) ? 0 : 4);
                ((NVScanView) getView()).invalidateDrawView(false);
            }
        }
    }

    public void m() {
        NVBackend.forceRetry();
    }

    public void a(JumioError jumioError) {
        if (getView() != null && ((NVScanView) getView()).getContext() != null) {
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(((NVScanView) getView()).getContext(), InitiateModel.class);
            if (jumioError != null) {
                LocalBroadcastManager.getInstance(((NVScanView) getView()).getContext()).sendBroadcast(new a(jumioError.getErrorCode(), jumioError.getLocalizedError(((NVScanView) getView()).getContext()), initiateModel != null ? initiateModel.getJumioScanRef() : null));
            }
        }
    }

    public boolean n() {
        return this.h.getSelectedDoctype().getDocumentScanSide() == this.a.getSideToScan() && (this.h.getSelectedDoctype().hasFallbackScan() || (this.e && this.a.getScanMode() == DocumentScanMode.PDF417));
    }

    public void o() {
        if (this.mExtractionClient != null && this.mExtractionClient.takePictureManually()) {
            this.mExtractionClient.takePicture();
        }
    }

    public void p() {
        if (!DocumentScanMode.CSSN.equals(this.a.getScanMode()) && !DocumentScanMode.MANUAL.equals(this.a.getScanMode())) {
            ScanSide sideToScan = this.a.getSideToScan();
            DocumentScanMode scanMode = this.a.getScanMode();
            int partIndex = this.a.getPartIndex();
            if (n() && getView() != null) {
                DocumentScanMode documentScanMode = this.h.getSelectedDoctype().hasFallbackScan() ? DocumentScanMode.CSSN : DocumentScanMode.LINEFINDER;
                ScanSide fallbackScanSide = this.h.getSelectedDoctype().getFallbackScanSide();
                boolean z = false;
                this.mExtractionClient.setDataExtractionActive(false);
                this.mExtractionClient.destroy();
                SelectionModel selectionModel = this.h;
                if (selectionModel != null) {
                    if (selectionModel.getSelectedDoctype() != null) {
                        this.h.getSelectedDoctype().setDocumentScanMode(documentScanMode);
                        this.h.getSelectedDoctype().setDocumentScanSide(fallbackScanSide);
                    }
                    if (this.h.getUploadModel() != null) {
                        NVScanPartModel scan;
                        if (!this.e) {
                            this.a = new NVScanPartModel(fallbackScanSide, documentScanMode, scanMode.getFormat(), partIndex);
                            this.h.getUploadModel().remove(sideToScan);
                            this.h.getUploadModel().add(this.a);
                        } else if (sideToScan == fallbackScanSide) {
                            this.a = new NVScanPartModel(fallbackScanSide, documentScanMode, scanMode.getFormat(), partIndex);
                            this.h.getUploadModel().replace(sideToScan, this.a);
                        } else if (sideToScan == ScanSide.FRONT) {
                            this.a = new NVScanPartModel(sideToScan, DocumentScanMode.LINEFINDER, scanMode.getFormat(), partIndex);
                            this.h.getUploadModel().replace(sideToScan, this.a);
                            NVScanPartModel nVScanPartModel = new NVScanPartModel(fallbackScanSide, documentScanMode, scanMode.getFormat(), partIndex);
                            if (this.h.getUploadModel().has(sideToScan)) {
                                this.h.getUploadModel().replace(fallbackScanSide, nVScanPartModel);
                            } else {
                                this.h.getUploadModel().add(nVScanPartModel);
                            }
                        } else if (sideToScan == ScanSide.BACK) {
                            this.a = new NVScanPartModel(sideToScan, DocumentScanMode.LINEFINDER, scanMode.getFormat(), partIndex);
                            this.h.getUploadModel().replace(sideToScan, this.a);
                            scan = this.h.getUploadModel().getScan(fallbackScanSide);
                            if (scan != null) {
                                scan.setScanMode(documentScanMode);
                            }
                        }
                        scan = this.h.getUploadModel().getScan(ScanSide.FRONT);
                        if (documentScanMode == DocumentScanMode.LINEFINDER && this.h.getUploadModel().getDocumentData() == null && scan != null) {
                            scan.setDocumentInfo(new DocumentDataModel());
                        }
                    }
                    DataAccess.update(((NVScanView) getView()).getContext(), SelectionModel.class, this.h);
                }
                this.plugin = PluginRegistry.getPlugin(getScanPluginMode());
                this.mExtractionClient = this.plugin.getExtractionClient(((NVScanView) getView()).getContext());
                this.mExtractionClient.setExtractionInterface(this);
                this.mExtractionClient.configure(this.a);
                this.mExtractionClient.subscribe(this);
                this.mExtractionClient.setTablet(((NVScanView) getView()).getRotationManager().isTablet());
                this.mExtractionClient.setPreviewProperties(this.mPreviewProperties);
                this.mExtractionClient.setExtractionArea(getExtractionArea());
                this.mExtractionClient.reinit();
                if (this.mOverlay != null) {
                    this.mOverlay.setVisible(8);
                    this.mOverlay = this.plugin.getOverlay(((NVScanView) getView()).getContext(), null);
                    this.mOverlay.addViews(this.d);
                    this.mOverlay.calculate(this.a.getScanMode(), this.a.getFormat(), getExtractionArea());
                    boolean z2 = ((NVScanView) getView()).getRotationManager().isScreenPortrait() || ((NVScanView) getView()).getRotationManager().isTablet();
                    this.mOverlay.prepareDraw(this.a.getSideToScan(), this.cameraManager.isFrontFacing(), z2);
                    this.mOverlay.setVisible(((NVScanView) getView()).displayOverlay(z2) ? 0 : 4);
                    ((NVScanView) getView()).invalidateDrawView(false);
                }
                SelectionModel selectionModel2 = this.h;
                boolean z3 = ((NVScanView) getView()).getRotationManager().isScreenPortrait() || ((NVScanView) getView()).getRotationManager().isTablet();
                this.c = a(selectionModel2, z3);
                if (scanMode == DocumentScanMode.CNIS) {
                    this.c.initialScanMode = DocumentScanMode.CNIS;
                }
                ((NVScanView) getView()).showHelp(this.c, true);
                NVScanView nVScanView = (NVScanView) getView();
                ServerSettingsModel serverSettingsModel = this.n;
                if (serverSettingsModel != null && serverSettingsModel.isBrandingEnabled()) {
                    z = true;
                }
                nVScanView.updateBranding(z);
                onUpdate(new ExtractionUpdate(ExtractionUpdateState.receiveClickListener, new b(this, null)));
                this.mExtractionClient.setDataExtractionActive(true);
            }
        }
    }

    public Rect getExtractionArea() {
        Rect extractionArea = super.getExtractionArea();
        if (getView() != null) {
            boolean z = ((NVScanView) getView()).getRotationManager().isScreenPortrait() || ((NVScanView) getView()).getRotationManager().isTablet();
            if (!(this.h == null || this.mPreviewProperties == null)) {
                NVHelpConfiguration nVHelpConfiguration = this.c;
                if (nVHelpConfiguration == null || nVHelpConfiguration.isPortrait != z) {
                    this.c = a(this.h, z);
                }
            }
            int i = extractionArea.bottom;
            NVScanView nVScanView = (NVScanView) getView();
            NVHelpConfiguration nVHelpConfiguration2 = this.c;
            extractionArea.bottom = i - nVScanView.getHelpViewHeight(nVHelpConfiguration2 != null ? nVHelpConfiguration2.helpViewStyle : HelpViewStyle.NONE);
        }
        return extractionArea;
    }

    private NVHelpConfiguration a(SelectionModel selectionModel, boolean z) {
        NVHelpConfiguration nVHelpConfiguration = new NVHelpConfiguration();
        if (!(selectionModel == null || selectionModel.getSelectedDoctype() == null)) {
            nVHelpConfiguration.documentType = selectionModel.getSelectedDoctype().getId();
            nVHelpConfiguration.documentVariant = selectionModel.getSelectedVariant();
            nVHelpConfiguration.scanMode = this.a.getScanMode();
            nVHelpConfiguration.side = this.a.getSideToScan();
            nVHelpConfiguration.part = this.a.getPartIndex() + 1;
            nVHelpConfiguration.totalParts = selectionModel.getUploadModel().getScans().size();
            nVHelpConfiguration.isUSDLFallback = this.j;
            nVHelpConfiguration.isIdBackFaceDetected = this.i;
            boolean z2 = false;
            boolean z3 = (!selectionModel.getSelectedDoctype().hasFallbackScan() || this.a.getScanMode() == DocumentScanMode.CSSN || this.a.getScanMode() == DocumentScanMode.LINEFINDER) ? false : true;
            nVHelpConfiguration.showFallback = z3;
            nVHelpConfiguration.isExpandable = true;
            nVHelpConfiguration.isPortrait = z;
            switch (this.a.getScanMode()) {
                case PDF417:
                case MRP:
                case MRV:
                case TD1:
                case TD2:
                case CNIS:
                case CSSN:
                case LINEFINDER:
                case TEMPLATEMATCHER:
                    nVHelpConfiguration.isExpandable = true;
                    z3 = nVHelpConfiguration.isUSDLFallback || nVHelpConfiguration.isIdBackFaceDetected;
                    nVHelpConfiguration.showFullscreen = z3;
                    if (nVHelpConfiguration.showFallback || nVHelpConfiguration.isUSDLFallback || nVHelpConfiguration.isIdBackFaceDetected || (this.e && this.a.getScanMode() == DocumentScanMode.PDF417)) {
                        z2 = true;
                    }
                    nVHelpConfiguration.showFallback = z2;
                    nVHelpConfiguration.helpViewStyle = z ? HelpViewStyle.SMALL : HelpViewStyle.MICRO;
                    break;
                case MANUAL:
                    HelpViewStyle helpViewStyle;
                    nVHelpConfiguration.isExpandable = false;
                    if (z) {
                        helpViewStyle = HelpViewStyle.MINI;
                    } else {
                        helpViewStyle = HelpViewStyle.NONE;
                    }
                    nVHelpConfiguration.helpViewStyle = helpViewStyle;
                    break;
                case FACE:
                    nVHelpConfiguration.showFullscreen = false;
                    nVHelpConfiguration.showFallback = true;
                    nVHelpConfiguration.isExpandable = false;
                    nVHelpConfiguration.helpViewStyle = HelpViewStyle.NONE;
                    break;
                default:
                    nVHelpConfiguration.helpViewStyle = HelpViewStyle.NONE;
                    break;
            }
        }
        return nVHelpConfiguration;
    }
}
