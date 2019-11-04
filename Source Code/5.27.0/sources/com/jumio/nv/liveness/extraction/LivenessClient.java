package com.jumio.nv.liveness.extraction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector.Builder;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.Log.LogLevel;
import com.jumio.core.ImageQuality;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.network.ErrorMock;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.enums.NVLivenessResult;
import com.jumio.nv.extraction.NVExtractionUpdateState;
import com.jumio.nv.liveness.overlay.LivenessOverlay;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.utils.NetverifyLogUtils;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import jumio.nv.core.t;

public class LivenessClient extends ExtractionClient<ExtractionUpdate, DocumentDataModel> {
    private static final int FACE_ALIGNMENT_TIME = 2500;
    protected static final float INVALID_SCORE_EYES_CLOSED = -4.0f;
    protected static final float INVALID_SCORE_NOT_DETECTED = -1.0f;
    protected static final float INVALID_SCORE_NOT_ENABLED = -2.0f;
    protected static final float INVALID_SCORE_OUT_OF_BOUNDS = -3.0f;
    protected static final int MESSAGE_AUTOMATIC_START_TIMER = 101;
    protected static final int MESSAGE_FACE_INVALID = 103;
    protected static final int MESSAGE_FACE_NOT_FOUND = 104;
    protected static final int MESSAGE_FACE_VALID = 102;
    protected static final int MESSAGE_FINISH = 106;
    protected static final int MESSAGE_INVALID_TIMER = 100;
    protected static final int MESSAGE_SAVE_IMAGES = 105;
    private static final String TAG = "LivenessManager";
    private Bitmap bitmapWithOpenEyes;
    private boolean canDetectFace;
    private t faceDetector;
    private int faceId;
    private byte[] fallbackFrame;
    private Size fallbackFrameSize;
    private int frameId;
    private byte[] frameWithOpenEyes;
    private Size frameWithOpenEyesSize;
    private float frameWithOpenEyesThreshold;
    protected Handler handler;
    private boolean isPortrait;
    protected LivenessDataModel livenessDataModel;
    private LivenessSavingTask livenessSavingTask;
    protected final Object processLock;
    private boolean startAttemptPending;
    protected int unsuccessfulAttempts;
    private Rect validAlignmentFrame;

    public class LivenessHandler extends Handler {
        private WeakReference<LivenessClient> clientWeakReference;

        public LivenessHandler(LivenessClient livenessClient) {
            super(Looper.getMainLooper());
            this.clientWeakReference = new WeakReference(livenessClient);
        }

        public void handleMessage(Message message) {
            LivenessClient livenessClient = (LivenessClient) this.clientWeakReference.get();
            if (livenessClient != null) {
                livenessClient.handleMessage(message);
            }
        }
    }

    public LivenessClient(Context context) {
        super(context);
        this.processLock = new Object();
        this.frameId = 0;
        this.faceId = -1;
        this.unsuccessfulAttempts = 0;
        this.isPortrait = true;
        this.startAttemptPending = false;
        this.shouldInitAsync = true;
    }

    public static String getVisionStatus(Context context) {
        try {
            ErrorMock.onGoogleVisionMock();
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                t tVar = new t(new Builder(context).setLandmarkType(0).setMode(1).setProminentFaceOnly(false).setClassificationType(1).build());
                if (tVar.isOperational()) {
                    tVar.release();
                    return null;
                }
                throw new Exception("Facedetector not operational");
            }
            throw new Exception(String.format("Google Play Services not Available - Code: %d", new Object[]{Integer.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context))}));
        } catch (Exception e) {
            return e.getMessage();
        } catch (NoClassDefFoundError e2) {
            return e2.getMessage();
        }
    }

    public Size getPrefferedPreviewSize() {
        return new Size(1280, 720);
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.mContext, ServerSettingsModel.class);
        if (serverSettingsModel != null) {
            this.livenessSavingTask = new LivenessSavingTask(this.mContext, serverSettingsModel.getMaxLivenessImages(), 60);
        }
    }

    public void setDataExtractionActive(boolean z) {
        boolean z2 = z && (this.isPortrait || this.isTablet);
        super.setDataExtractionActive(z2);
        if (z) {
            resetValuesAndArrays();
            resetFaceDetection();
        }
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        try {
            this.isPortrait = previewProperties.isPortrait;
            LivenessOverlay livenessOverlay = new LivenessOverlay(this.mContext);
            livenessOverlay.calculate(DocumentScanMode.FACE, DocumentFormat.NONE, rect);
            this.validAlignmentFrame = new Rect(livenessOverlay.getOverlayBounds());
            this.livenessSavingTask.init(previewProperties, rect, previewProperties.isPortrait);
            this.livenessSavingTask.setActive(previewProperties.isPortrait);
            this.frameId = 0;
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.mContext);
            if (isGooglePlayServicesAvailable == 0) {
                if (this.faceDetector != null) {
                    this.faceDetector.release();
                    this.faceDetector = null;
                }
                this.faceDetector = new t(new Builder(this.mContext).setLandmarkType(0).setMode(1).setProminentFaceOnly(false).setClassificationType(1).build());
                if (this.faceDetector.isOperational()) {
                    this.canDetectFace = true;
                    return;
                }
                throw new Exception("FaceDetector not operational");
            }
            throw new JumioError(NVErrorCase.GOOGLE_VISION_LOADING_FAILED, 0, isGooglePlayServicesAvailable);
        } catch (Exception e) {
            if (e instanceof JumioError) {
                publishError(e);
            } else {
                publishError(new JumioError(NVErrorCase.GOOGLE_VISION_LOADING_FAILED));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        byte[] bArr2 = bArr;
        PreviewProperties previewProperties2 = previewProperties;
        if (this.handler == null) {
            this.handler = new LivenessHandler(this);
        }
        if (this.canDetectFace) {
            Frame build = new Frame.Builder().setImageData(ByteBuffer.wrap(Arrays.copyOf(bArr2, bArr2.length)), previewProperties2.camera.width, previewProperties2.camera.height, 17).setRotation(CameraUtils.getImageRotation(previewProperties)).setTimestampMillis(System.currentTimeMillis()).setId(this.frameId).build();
            LivenessSavingTask livenessSavingTask = this.livenessSavingTask;
            if (livenessSavingTask != null) {
                livenessSavingTask.addSync(build);
            }
            try {
                SparseArray detect = this.faceDetector.detect(build);
                boolean z = true;
                if (detect == null || detect.size() != 1) {
                    if (this.frameWithOpenEyes != null && this.canDetectFace) {
                        if (detect == null || detect.size() <= 1) {
                            Log.w("recycle frameWithOpenEyes - no face found");
                        } else {
                            Log.w(String.format("recycle frameWithOpenEyes - %d faces found", new Object[]{Integer.valueOf(detect.size())}));
                        }
                        this.frameWithOpenEyes = null;
                        this.frameWithOpenEyesThreshold = 0.0f;
                    }
                    this.startAttemptPending = false;
                    this.faceId = -1;
                    this.handler.removeMessages(101);
                    this.handler.sendEmptyMessage(104);
                    setResult(false);
                }
                Face face = (Face) detect.valueAt(0);
                this.handler.removeMessages(100);
                if (this.faceId == -1) {
                    this.faceId = face.getId();
                }
                RectF surfaceToPreview = CameraUtils.surfaceToPreview(previewProperties2, this.validAlignmentFrame);
                surfaceToPreview.inset(surfaceToPreview.width() / 3.0f, surfaceToPreview.height() / 3.0f);
                RectF rectF = new RectF(face.getPosition().x, face.getPosition().y, face.getPosition().x + face.getWidth(), face.getPosition().y + face.getHeight());
                float width = (((float) this.validAlignmentFrame.width()) / ((float) rect.width())) - 0.3f;
                float width2 = (((float) this.validAlignmentFrame.width()) / ((float) rect.width())) + 0.2f;
                if (Log.isLogEnabledForLevel(LogLevel.DEBUG)) {
                    publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.facePosition, CameraUtils.previewToSurface(previewProperties2, rectF)));
                    publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.validAlignmentFrame, CameraUtils.previewToSurface(previewProperties2, surfaceToPreview)));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(String.format("happiness: %.2f", new Object[]{Float.valueOf(face.getIsSmilingProbability())}));
                    arrayList.add(String.format("right eye: %.2f", new Object[]{Float.valueOf(face.getIsRightEyeOpenProbability())}));
                    arrayList.add(String.format("left eye: %.2f", new Object[]{Float.valueOf(face.getIsLeftEyeOpenProbability())}));
                    arrayList.add(String.format("euler z: %.2f", new Object[]{Float.valueOf(face.getEulerZ())}));
                    arrayList.add(String.format("width: %.2f", new Object[]{Float.valueOf(rectF.width() / ((float) rect.width()))}));
                    publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceDetails, arrayList));
                }
                if (face.getEulerZ() < -60.0f || face.getEulerZ() > 60.0f || !surfaceToPreview.contains(rectF.centerX(), rectF.centerY()) || rectF.width() / ((float) rect.width()) <= width || rectF.width() / ((float) rect.width()) >= width2 || this.faceId != face.getId()) {
                    boolean z2;
                    Bundle bundle;
                    Message message;
                    this.startAttemptPending = false;
                    this.handler.removeMessages(101);
                    if (this.frameWithOpenEyes != null && this.canDetectFace) {
                        Log.w("recycle frameWithOpenEyes - face invalid");
                        this.frameWithOpenEyes = null;
                        this.frameWithOpenEyesThreshold = 0.0f;
                    }
                    if (surfaceToPreview.contains(rectF.centerX(), rectF.centerY())) {
                        if (rectF.width() / ((float) rect.width()) <= width) {
                            z2 = false;
                            bundle = new Bundle();
                            bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_small, z);
                            bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_big, z2);
                            message = new Message();
                            message.what = 103;
                            message.setData(bundle);
                            this.handler.sendMessage(message);
                            setResult(false);
                        } else if (rectF.width() / ((float) rect.width()) >= width2) {
                            z2 = true;
                            z = false;
                            bundle = new Bundle();
                            bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_small, z);
                            bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_big, z2);
                            message = new Message();
                            message.what = 103;
                            message.setData(bundle);
                            this.handler.sendMessage(message);
                            setResult(false);
                        }
                    }
                    z2 = false;
                    z = false;
                    bundle = new Bundle();
                    bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_small, z);
                    bundle.putBoolean(LivenessExtractionUpdateState.faceAlignmentInvalid_big, z2);
                    message = new Message();
                    message.what = 103;
                    message.setData(bundle);
                    this.handler.sendMessage(message);
                    setResult(false);
                }
                this.handler.sendEmptyMessage(102);
                float calculateFocus = ImageQuality.calculateFocus(build.getGrayscaleImageData().array(), previewProperties2.camera.width, previewProperties2.camera.height, false);
                if ((this.frameWithOpenEyes == null || calculateFocus > this.frameWithOpenEyesThreshold) && calculateFocus >= this.extractionInterface.getFocusThreshold() && face.getIsLeftEyeOpenProbability() > 0.8f && face.getIsRightEyeOpenProbability() > 0.8f) {
                    Log.d(String.format("Higher focus confidence: %f", new Object[]{Float.valueOf(calculateFocus)}));
                    this.frameWithOpenEyesSize = new Size(-1, -1);
                    this.frameWithOpenEyes = CameraUtils.yuv2rgb(build.getGrayscaleImageData().array(), previewProperties2.isPortrait, previewProperties, rect, this.frameWithOpenEyesSize, 640);
                    this.frameWithOpenEyesThreshold = calculateFocus;
                } else if (this.unsuccessfulAttempts >= 2 && this.fallbackFrame == null && this.frameWithOpenEyes == null) {
                    this.fallbackFrameSize = new Size(-1, -1);
                    this.fallbackFrame = CameraUtils.yuv2rgb(build.getGrayscaleImageData().array(), previewProperties2.isPortrait, previewProperties, rect, this.fallbackFrameSize, 640);
                }
                if (!this.startAttemptPending) {
                    this.startAttemptPending = true;
                    this.handler.sendEmptyMessageDelayed(101, 2500);
                }
                setResult(false);
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        int i = this.frameId;
        this.frameId = i + 1;
        return i > 5 && this.canDetectFace;
    }

    public void destroy() {
        super.destroy();
        t tVar = this.faceDetector;
        if (tVar != null) {
            tVar.release();
            this.faceDetector = null;
        }
        if (this.frameWithOpenEyes != null) {
            Log.w("recycle frameWithOpenEyes - destroy");
            this.frameWithOpenEyes = null;
        }
        Bitmap bitmap = this.bitmapWithOpenEyes;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmapWithOpenEyes = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void resetFaceDetection() {
        this.startAttemptPending = false;
        this.canDetectFace = true;
    }

    /* Access modifiers changed, original: protected */
    public void handleMessage(Message message) {
        if (message != null) {
            switch (message.what) {
                case 100:
                    faceNotInScreen();
                    break;
                case 101:
                    if (this.frameWithOpenEyes != null) {
                        this.canDetectFace = false;
                        resetValuesAndArrays();
                        automaticStartAttempt();
                        break;
                    }
                    this.unsuccessfulAttempts++;
                    int i = this.unsuccessfulAttempts;
                    if (i >= 4) {
                        this.livenessDataModel = new LivenessDataModel();
                        this.livenessDataModel.setLivenessResult(NVLivenessResult.BO);
                        this.livenessDataModel.setLivenessValue(INVALID_SCORE_EYES_CLOSED);
                        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.EYE_TRACKING_EYES_CLOSED));
                        this.frameWithOpenEyes = this.fallbackFrame;
                        this.frameWithOpenEyesSize = this.fallbackFrameSize;
                        this.handler.sendEmptyMessage(105);
                        this.handler.sendEmptyMessage(106);
                        this.canDetectFace = false;
                    } else if (i == 2) {
                        this.canDetectFace = false;
                        publishUpdate(new ExtractionUpdate(NVExtractionUpdateState.showHelp, null));
                    } else {
                        this.startAttemptPending = false;
                    }
                    return;
                case 102:
                    if (this.canDetectFace) {
                        publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceAlignmentValid, null));
                        break;
                    }
                    break;
                case 103:
                    if (this.canDetectFace) {
                        publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceAlignmentInvalid, message.getData()));
                        break;
                    }
                    break;
                case 104:
                    if (this.canDetectFace) {
                        publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceAlignmentOutOfBounds, null));
                        break;
                    }
                    break;
                case 105:
                    Bitmap bitmap = this.bitmapWithOpenEyes;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.bitmapWithOpenEyes = null;
                    }
                    this.bitmapWithOpenEyes = CameraUtils.rgb2bitmap(this.frameWithOpenEyes, this.frameWithOpenEyesSize.width, this.frameWithOpenEyesSize.height);
                    publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, this.bitmapWithOpenEyes));
                    publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, this.bitmapWithOpenEyes));
                    LivenessSavingTask livenessSavingTask = this.livenessSavingTask;
                    if (livenessSavingTask != null) {
                        String[] finish = livenessSavingTask.finish();
                        this.livenessDataModel.setFrames(finish);
                        if (Log.isFileLoggingActivated()) {
                            for (int i2 = 0; i2 < finish.length; i2++) {
                                String name = new File(finish[i2]).getName();
                                NetverifyLogUtils.copyFile(finish[i2], LivenessClient.class.getSimpleName(), String.format("%02d_%s.jpg", new Object[]{Integer.valueOf(i2), name}));
                            }
                            break;
                        }
                    }
                    break;
                case 106:
                    publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(1.0f)));
                    publishResult(this.livenessDataModel);
                    setResult(true);
                    break;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void automaticStartAttempt() {
        this.livenessDataModel = new LivenessDataModel();
        this.livenessDataModel.setLivenessResult(NVLivenessResult.BO);
        this.livenessDataModel.setLivenessValue(INVALID_SCORE_NOT_ENABLED);
        this.handler.sendEmptyMessage(105);
        this.handler.sendEmptyMessage(106);
        JumioAnalytics.add(MobileEvents.customAlert(JumioAnalytics.getSessionId(), "EyeTrackingInitFailed", null));
    }

    /* Access modifiers changed, original: protected */
    public void faceNotInScreen() {
        resetValuesAndArrays();
        publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceAlignmentOutOfBounds, null));
    }

    /* Access modifiers changed, original: protected */
    public void resetValuesAndArrays() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(100);
            this.handler.removeMessages(101);
        }
    }
}
