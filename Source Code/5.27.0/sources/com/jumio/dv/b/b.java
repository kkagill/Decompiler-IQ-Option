package com.jumio.dv.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.Log.LogLevel;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.environment.Environment;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.dv.R;
import com.jumio.dv.models.DvScanPartModel;
import com.jumio.dv.models.DvSettingsModel;
import com.jumio.dv.view.interactors.DvScanView;
import com.jumio.dv.view.interactors.DvScanView.GuiState;
import com.jumio.dv.view.interactors.DvScanView.HelpViewStyle;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import com.jumio.sdk.manual.ManualExtractionUpdateState;
import com.jumio.sdk.models.BaseScanPartModel;
import com.jumio.sdk.presentation.BaseScanPresenter;
import java.io.File;

/* compiled from: DvScanPresenter */
public class b extends BaseScanPresenter<DvScanView, ExtractionUpdate, StaticModel> {
    private DvScanPartModel a;
    private GuiState b = GuiState.SCAN;
    private Handler c = new Handler(Looper.getMainLooper());
    private DvSettingsModel d;

    /* compiled from: DvScanPresenter */
    /* renamed from: com.jumio.dv.b.b$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[HelpViewStyle.values().length];
        static final /* synthetic */ int[] b = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        static {
            /*
            r0 = com.jumio.dv.b.b.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.jumio.dv.b.b.a.HELP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.jumio.dv.b.b.a.CONFIRMATION;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.MICRO;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.MINI;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.SMALL;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.NONE;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.dv.b.b$AnonymousClass2.<clinit>():void");
        }
    }

    /* compiled from: DvScanPresenter */
    public enum a {
        HELP,
        CONFIRMATION,
        BRANDING
    }

    /* compiled from: DvScanPresenter */
    private class b implements OnClickListener {
        private b() {
        }

        /* synthetic */ b(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onClick(View view) {
            if (b.this.mExtractionClient.takePictureManually()) {
                b.this.mExtractionClient.takePicture();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean enableFlashOnStart() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public BaseScanPartModel getScanPartModel() {
        if (this.a == null) {
            this.a = (DvScanPartModel) DataAccess.load(((DvScanView) getView()).getContext(), DvScanPartModel.class);
            if (this.a == null) {
                this.a = new DvScanPartModel();
            }
        }
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public PluginMode getScanPluginMode() {
        return PluginMode.MANUAL;
    }

    /* Access modifiers changed, original: protected */
    public boolean startCameraFrontfacing() {
        return this.d.isCameraFrontfacing() || getScanPartModel().getScanMode() == DocumentScanMode.FACE;
    }

    /* Access modifiers changed, original: protected */
    public boolean canSwitchCamera() {
        return (this.cameraManager == null || !this.cameraManager.hasMultipleCameras() || getScanPartModel().getScanMode() == DocumentScanMode.FACE) ? false : true;
    }

    public boolean control(int i) {
        return super.control(i);
    }

    public int a(HelpViewStyle helpViewStyle) {
        int i = 0;
        if (helpViewStyle == null) {
            return 0;
        }
        float dimension;
        int i2 = AnonymousClass2.a[helpViewStyle.ordinal()];
        if (i2 == 1) {
            dimension = ((DvScanView) getView()).getContext().getResources().getDimension(R.dimen.dv_helpview_small_landscape_height);
        } else if (i2 != 2) {
            if (i2 == 3) {
                dimension = ((DvScanView) getView()).getContext().getResources().getDimension(R.dimen.dv_helpview_small_portrait_height);
            }
            return i;
        } else {
            dimension = ((DvScanView) getView()).getContext().getResources().getDimension(R.dimen.dv_helpview_small_portrait_manual_height);
        }
        i = (int) dimension;
        return i;
    }

    public void onPreviewAvailable(PreviewProperties previewProperties) {
        super.onPreviewAvailable(previewProperties);
        this.mExtractionClient.setDataExtractionActive(this.b == GuiState.SCAN);
    }

    public void onCameraError(Throwable th) {
        if (getView() != null) {
            ((DvScanView) getView()).onError(new JumioError(com.jumio.dv.a.a.NO_CAMERA_CONNECTION));
        }
    }

    public void onManualRefocus(int i, int i2) {
        super.onManualRefocus(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        if (this.d == null) {
            this.d = (DvSettingsModel) DataAccess.load(((DvScanView) getView()).getContext(), DvSettingsModel.class);
            if (this.d == null) {
                ((DvScanView) getView()).onError(new JumioError(com.jumio.dv.a.a.OCR_LOADING_FAILED));
                return;
            }
        }
        super.onCreate();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        DvScanPartModel dvScanPartModel = this.a;
        if (dvScanPartModel == null) {
            this.a = (DvScanPartModel) DataAccess.load(((DvScanView) getView()).getContext(), DvScanPartModel.class);
            if (this.a == null) {
                this.a = new DvScanPartModel();
            }
        } else if (dvScanPartModel.getScannedImage().getImagePath() != null) {
            return;
        }
        if (this.mOverlay != null) {
            onUpdate(new ExtractionUpdate(ExtractionUpdateState.receiveClickListener, new b(this, null)));
        }
        if (this.b == GuiState.SCAN) {
            DvScanView dvScanView = (DvScanView) getView();
            String type = this.d.getType();
            HelpViewStyle helpViewStyle = (((DvScanView) getView()).getRotationManager().isScreenPortrait() || ((DvScanView) getView()).getRotationManager().isTablet()) ? HelpViewStyle.MINI : HelpViewStyle.NONE;
            dvScanView.showHelp(type, helpViewStyle, this.d.getDocumentName(), false);
        }
        ((DvScanView) getView()).updateUiAutomationScanId(getScanPluginMode());
        super.onStart();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        DataAccess.update(((DvScanView) getView()).getContext(), DvScanPartModel.class, this.a);
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.mOrientationListener != null) {
            this.mOrientationListener.disable();
            this.mOrientationListener = null;
        }
    }

    /* renamed from: a */
    public void onUpdate(final ExtractionUpdate extractionUpdate) {
        if (isActive() && extractionUpdate != null) {
            int state = extractionUpdate.getState();
            if (state == ExtractionUpdateState.shotTaken) {
                ((DvScanView) getView()).extractionStarted();
                ImageData scannedImage = this.a.getScannedImage();
                this.cameraManager.getImageData(scannedImage);
                this.cameraManager.stopPreview(false);
                scannedImage.setFocusConfidence(((Float) extractionUpdate.getData()).floatValue());
                try {
                    ((Vibrator) ((DvScanView) getView()).getContext().getSystemService("vibrator")).vibrate(100);
                } catch (Exception unused) {
                }
            } else if (state == ExtractionUpdateState.notifyFlash) {
                this.cameraManager.requestFlashHint(((Boolean) extractionUpdate.getData()).booleanValue());
            } else if (state == ExtractionUpdateState.notifyFocus) {
                Point point = (Point) extractionUpdate.getData();
                this.cameraManager.requestFocus(point.x, point.y);
            } else {
                String str = "tmpm_%d";
                Bitmap bitmap;
                File file;
                if (state == ExtractionUpdateState.saveImage) {
                    bitmap = (Bitmap) extractionUpdate.getData();
                    if (Log.isLogEnabledForLevel(LogLevel.DEBUG)) {
                        com.jumio.dv.c.a.a(bitmap, "", CompressFormat.JPEG, 80, null);
                    }
                    file = new File(Environment.getDataDirectory(((DvScanView) getView()).getContext()), String.format(str, new Object[]{Long.valueOf(System.currentTimeMillis())}));
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        CameraUtils.saveBitmap(bitmap, file, CompressFormat.JPEG, 80);
                    }
                    this.a.getScannedImage().setImagePath(file.getAbsolutePath());
                } else if (state == ExtractionUpdateState.saveExactImage) {
                    bitmap = (Bitmap) extractionUpdate.getData();
                    file = new File(Environment.getDataDirectory(((DvScanView) getView()).getContext()), String.format(str, new Object[]{Long.valueOf(System.currentTimeMillis())}));
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        CameraUtils.saveBitmap(bitmap, file, CompressFormat.JPEG, 80);
                    }
                    this.a.getScannedImage().setExactImagePath(file.getAbsolutePath());
                } else if (state == ManualExtractionUpdateState.focusHint) {
                    ((DvScanView) getView()).displayBlurHint();
                } else {
                    this.c.post(new Runnable() {
                        public void run() {
                            if (b.this.mOverlay != null && b.this.isActive()) {
                                b.this.mOverlay.update(extractionUpdate);
                                ((DvScanView) b.this.getView()).invalidateDrawView(false);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void onResult(StaticModel staticModel) {
        super.onResult(staticModel);
        if (isActive()) {
            Log.d("ScanPresenter", "onResult");
            this.cameraManager.stopPreview(true);
            this.mExtractionClient.cancel();
            ((DvScanView) getView()).hideHelp();
            ((DvScanView) getView()).showConfirmation(this.a.getScannedImage().getExactImagePath(), false);
            this.b = GuiState.CONFIRMATION;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onScreenAngleChanged(ScreenAngle screenAngle) {
        super.onScreenAngleChanged(screenAngle);
    }

    public void a() {
        DataAccess.update(((DvScanView) getView()).getContext(), DvScanPartModel.class, this.a);
        ((DvScanView) getView()).scansComplete();
    }

    public void b() {
        this.b = GuiState.SCAN;
        this.a.getScannedImage().clear();
        this.mExtractionClient.cancel();
        this.mExtractionClient.reinit();
        this.mExtractionClient.setDataExtractionActive(true);
        onStart();
    }

    public void a(a aVar, boolean z) {
        int i = AnonymousClass2.b[aVar.ordinal()];
        if (i == 1) {
            DvScanView dvScanView = (DvScanView) getView();
            String type = this.d.getType();
            HelpViewStyle helpViewStyle = (z || ((DvScanView) getView()).getRotationManager().isTablet()) ? HelpViewStyle.MINI : HelpViewStyle.NONE;
            dvScanView.showHelp(type, helpViewStyle, this.d.getDocumentName(), true);
        } else if (i == 2 && this.b == GuiState.CONFIRMATION) {
            ((DvScanView) getView()).showConfirmation(this.a.getScannedImage().getExactImagePath(), true);
        }
    }

    public void a(GuiState guiState) {
        this.b = guiState;
    }

    public void a(JumioError jumioError) {
        LocalBroadcastManager.getInstance(((DvScanView) getView()).getContext()).sendBroadcast(new com.jumio.dv.a(jumioError.getErrorCode(), jumioError.getLocalizedError(((DvScanView) getView()).getContext())));
    }
}
