package com.jumio.sdk.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jumio.commons.camera.ICameraCallback;
import com.jumio.commons.camera.JumioCameraManager;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.exceptions.MissingPluginException;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.SubscriberWithUpdate;
import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.Plugin;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.gui.DrawView.DrawViewInterface;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionInterface;
import com.jumio.sdk.models.BaseScanPartModel;
import com.jumio.sdk.view.interactors.BaseScanView;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseScanPresenterBase<Interactor extends BaseScanView, Update, Result> extends Presenter<Interactor> implements ICameraCallback, SubscriberWithUpdate<Update, Result>, DrawViewInterface, ExtractionInterface {
    private static final String TAG = "BaseScanPresenter";
    protected static final int WEBP_QUALITY = 75;
    protected JumioCameraManager cameraManager;
    protected ExtractionClient mExtractionClient;
    protected OrientationHandler mOrientationListener;
    @Nullable
    protected Overlay mOverlay;
    protected PreviewProperties mPreviewProperties;
    protected Plugin plugin;
    protected int viewHeight;
    protected int viewWidth;

    public static class BaseScanControl {
        public static int flashOnStartupEnabled = id.getAndIncrement();
        public static int hasFlash = id.getAndIncrement();
        public static int hasMultipleCameras = id.getAndIncrement();
        protected static AtomicInteger id = new AtomicInteger(0);
        public static int isCameraFrontfacing = id.getAndIncrement();
        public static int isFlashOn = id.getAndIncrement();
        public static int startCameraFrontfacing = id.getAndIncrement();
        public static int startExtraction = id.getAndIncrement();
        public static int stopExtraction = id.getAndIncrement();
        public static int toggleCamera = id.getAndIncrement();
        public static int toggleFlash = id.getAndIncrement();
    }

    protected class OrientationHandler extends OrientationEventListener {
        public OrientationHandler(Context context) {
            super(context);
        }

        public OrientationHandler(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            if (i != -1 && BaseScanPresenterBase.this.getView() != null) {
                DeviceRotationManager rotationManager = ((BaseScanView) BaseScanPresenterBase.this.getView()).getRotationManager();
                if (rotationManager != null) {
                    ScreenAngle angle = rotationManager.getAngle();
                    rotationManager.setAngleFromScreen();
                    ScreenAngle angle2 = rotationManager.getAngle();
                    if (!angle2.equals(angle)) {
                        BaseScanPresenterBase.this.onScreenAngleChanged(angle2);
                    }
                    if (BaseScanPresenterBase.this.cameraManager != null && BaseScanPresenterBase.this.cameraManager.isPreviewRunning() && ((angle == ScreenAngle.LANDSCAPE && angle2 == ScreenAngle.INVERTED_LANDSCAPE) || ((angle == ScreenAngle.INVERTED_LANDSCAPE && angle2 == ScreenAngle.LANDSCAPE) || ((rotationManager.isTablet() && angle == ScreenAngle.PORTRAIT && angle2 == ScreenAngle.INVERTED_PORTRAIT) || (rotationManager.isTablet() && angle == ScreenAngle.INVERTED_PORTRAIT && angle2 == ScreenAngle.PORTRAIT))))) {
                        BaseScanPresenterBase.this.cameraManager.onSurfaceTextureSizeChanged(((BaseScanView) BaseScanPresenterBase.this.getView()).getTextureView().getSurfaceTexture(), ((BaseScanView) BaseScanPresenterBase.this.getView()).getTextureView().getWidth(), ((BaseScanView) BaseScanPresenterBase.this.getView()).getTextureView().getHeight());
                    }
                }
            }
        }
    }

    public abstract boolean canSwitchCamera();

    public abstract boolean enableFlashOnStart();

    public float getFocusThreshold() {
        return 0.12f;
    }

    public abstract BaseScanPartModel getScanPartModel();

    public abstract PluginMode getScanPluginMode();

    public boolean isSteady() {
        return true;
    }

    public void onManualRefocus(int i, int i2) {
    }

    public void onResult(Result result) {
    }

    /* Access modifiers changed, original: protected */
    public void onScreenAngleChanged(ScreenAngle screenAngle) {
    }

    public abstract boolean startCameraFrontfacing();

    public void onCameraAvailable(boolean z) {
        if (isActive()) {
            ((BaseScanView) getView()).resetCameraControls(this.cameraManager.isFrontFacing(), this.cameraManager.isFlashOn());
        }
    }

    public void onPreviewAvailable(PreviewProperties previewProperties) {
        if (getView() != null) {
            this.mPreviewProperties = previewProperties;
            DataAccess.update(((BaseScanView) getView()).getContext(), PreviewProperties.class, this.mPreviewProperties);
            ((BaseScanView) getView()).getRotationManager().setAngleFromScreen();
            if (this.mOverlay != null) {
                ((BaseScanView) getView()).invalidateDrawView(true);
            }
            this.mExtractionClient.cancel();
            this.mExtractionClient.setPreviewProperties(previewProperties);
            this.mExtractionClient.setExtractionArea(getExtractionArea());
            this.mExtractionClient.setTablet(((BaseScanView) getView()).getRotationManager().isTablet());
            this.mExtractionClient.setExtractionInterface(this);
            this.mExtractionClient.reinit();
            ((BaseScanView) getView()).updateCameraControls(canSwitchCamera(), this.cameraManager.isFlashSupported());
        }
    }

    public void onStopPreview() {
        this.mPreviewProperties = null;
        DataAccess.delete(((BaseScanView) getView()).getContext(), PreviewProperties.class);
    }

    public void onPreviewFrame(byte[] bArr) {
        if (!this.cameraManager.isFocusing()) {
            ExtractionClient extractionClient = this.mExtractionClient;
            if (extractionClient != null) {
                extractionClient.feed(bArr);
            }
        }
        this.cameraManager.addCallbackBuffer();
    }

    /* Access modifiers changed, original: protected */
    public JumioCameraManager initCamera() {
        return JumioCameraManager.create(((BaseScanView) getView()).getTextureView(), this, ((BaseScanView) getView()).getRotationManager(), startCameraFrontfacing(), enableFlashOnStart());
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        TextureView textureView = ((BaseScanView) getView()).getTextureView();
        if (getScanPartModel() != null) {
            DocumentScanMode scanMode = getScanPartModel().getScanMode();
            this.plugin = PluginRegistry.getPlugin(getScanPluginMode());
            Plugin plugin = this.plugin;
            if (plugin == null) {
                onError(new MissingPluginException(scanMode));
                return;
            }
            if (this.mOverlay == null) {
                this.mOverlay = plugin.getOverlay(((BaseScanView) getView()).getContext(), null);
            }
            this.mExtractionClient = this.plugin.getExtractionClient(((BaseScanView) getView()).getContext());
            if (scanMode == DocumentScanMode.NFC) {
                JumioCameraManager jumioCameraManager = this.cameraManager;
                if (jumioCameraManager != null) {
                    jumioCameraManager.stopPreview(true);
                }
                textureView.setVisibility(4);
            } else {
                textureView.setVisibility(0);
                JumioCameraManager jumioCameraManager2 = this.cameraManager;
                if (jumioCameraManager2 == null) {
                    this.cameraManager = initCamera();
                    this.cameraManager.setRequestedSize(this.mExtractionClient.getPrefferedPreviewSize());
                } else {
                    jumioCameraManager2.reinitCamera();
                }
            }
            this.mOrientationListener = new OrientationHandler(((BaseScanView) getView()).getContext(), 1);
            this.mOrientationListener.enable();
            this.mExtractionClient.subscribe(this);
            this.mExtractionClient.configure(getScanPartModel());
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        JumioCameraManager jumioCameraManager = this.cameraManager;
        if (jumioCameraManager != null) {
            jumioCameraManager.startPreview();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        JumioCameraManager jumioCameraManager = this.cameraManager;
        if (jumioCameraManager != null) {
            jumioCameraManager.stopPreview(true);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        ExtractionClient extractionClient = this.mExtractionClient;
        if (extractionClient != null) {
            extractionClient.unsubscribe(this);
            this.mExtractionClient.destroy();
        }
        OrientationHandler orientationHandler = this.mOrientationListener;
        if (orientationHandler != null) {
            orientationHandler.disable();
            this.mOrientationListener = null;
        }
        JumioCameraManager jumioCameraManager = this.cameraManager;
        if (jumioCameraManager != null) {
            jumioCameraManager.stopPreview(false);
            this.cameraManager.destroy();
        }
    }

    @InvokeOnUiThread
    public void onError(Throwable th) {
        if (isActive()) {
            ExtractionClient extractionClient = this.mExtractionClient;
            if (extractionClient != null) {
                extractionClient.cancel();
            }
            ((BaseScanView) getView()).onError(th);
        }
    }

    public void draw(Canvas canvas) {
        Overlay overlay = this.mOverlay;
        if (overlay != null) {
            overlay.doDraw(canvas);
        }
    }

    public void addChildren(@NonNull ViewGroup viewGroup) {
        Overlay overlay = this.mOverlay;
        if (overlay != null) {
            overlay.addViews(viewGroup);
        }
    }

    public Rect getOverlayBounds() {
        Overlay overlay = this.mOverlay;
        return overlay != null ? overlay.getOverlayBounds() : null;
    }

    public Rect getExtractionArea() {
        PreviewProperties previewProperties = this.mPreviewProperties;
        if (previewProperties == null || previewProperties.surface == null) {
            return new Rect(0, 0, this.viewWidth, this.viewHeight);
        }
        return new Rect(0, 0, this.mPreviewProperties.surface.width, this.mPreviewProperties.surface.height);
    }

    public void measure(int i, int i2) {
        this.viewWidth = i;
        this.viewHeight = i2;
        if (this.mOverlay != null && getView() != null) {
            this.mOverlay.calculate(getScanPartModel().getScanMode(), getScanPartModel().getFormat(), getExtractionArea());
            Overlay overlay = this.mOverlay;
            ScanSide sideToScan = getScanPartModel().getSideToScan();
            JumioCameraManager jumioCameraManager = this.cameraManager;
            boolean z = true;
            boolean z2 = jumioCameraManager != null && jumioCameraManager.isFrontFacing();
            if (!(((BaseScanView) getView()).getRotationManager().isScreenPortrait() || ((BaseScanView) getView()).getRotationManager().isTablet())) {
                z = false;
            }
            overlay.prepareDraw(sideToScan, z2, z);
        }
    }

    public boolean control(int i) {
        JumioCameraManager jumioCameraManager;
        if (i == BaseScanControl.toggleCamera) {
            jumioCameraManager = this.cameraManager;
            if (jumioCameraManager != null) {
                jumioCameraManager.changeCamera();
                return true;
            }
        }
        if (i == BaseScanControl.toggleFlash) {
            jumioCameraManager = this.cameraManager;
            if (jumioCameraManager != null) {
                jumioCameraManager.toggleFlash();
                return true;
            }
        }
        if (i == BaseScanControl.hasMultipleCameras && this.cameraManager != null) {
            return canSwitchCamera();
        }
        if (i == BaseScanControl.hasFlash) {
            jumioCameraManager = this.cameraManager;
            if (jumioCameraManager != null) {
                return jumioCameraManager.isFlashSupported();
            }
        }
        if (i == BaseScanControl.isCameraFrontfacing) {
            jumioCameraManager = this.cameraManager;
            if (jumioCameraManager != null) {
                return jumioCameraManager.isFrontFacing();
            }
        }
        if (i == BaseScanControl.isFlashOn) {
            jumioCameraManager = this.cameraManager;
            if (jumioCameraManager != null) {
                return jumioCameraManager.isFlashOn();
            }
        }
        if (i == BaseScanControl.flashOnStartupEnabled) {
            return enableFlashOnStart();
        }
        if (i == BaseScanControl.startCameraFrontfacing) {
            return startCameraFrontfacing();
        }
        if (i == BaseScanControl.startExtraction) {
            this.mExtractionClient.setDataExtractionActive(true);
            return true;
        } else if (i != BaseScanControl.stopExtraction) {
            return false;
        } else {
            this.mExtractionClient.setDataExtractionActive(false);
            return true;
        }
    }
}
