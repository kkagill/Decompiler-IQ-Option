package jumio.nv.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame.Builder;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.core.ImageQuality;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.enums.NVLivenessResult;
import com.jumio.nv.liveness.extraction.LivenessDataModel;
import com.jumio.nv.liveness.extraction.LivenessSavingTask;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import com.jumio.sdk.manual.ManualExtractionUpdateState;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FaceManualClient */
public class q extends ExtractionClient<ExtractionUpdate, StaticModel> {
    private AtomicBoolean a = new AtomicBoolean(false);
    private AtomicBoolean b = new AtomicBoolean(false);
    private LivenessSavingTask c;
    private int d;

    public boolean takePictureManually() {
        return true;
    }

    public q(Context context) {
        super(context);
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.mContext, ServerSettingsModel.class);
        if (serverSettingsModel != null) {
            this.c = new LivenessSavingTask(this.mContext, serverSettingsModel.getMaxLivenessImages(), 60);
        }
    }

    public Size getPrefferedPreviewSize() {
        return new Size(1280, 720);
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        this.a.set(false);
        this.b.set(false);
        this.d = 0;
        this.c.init(previewProperties, rect, previewProperties.isPortrait);
        this.c.setActive(previewProperties.isPortrait);
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        boolean z = false;
        try {
            Builder timestampMillis = new Builder().setImageData(ByteBuffer.wrap(bArr), previewProperties.camera.width, previewProperties.camera.height, 17).setRotation(CameraUtils.getImageRotation(previewProperties)).setTimestampMillis(System.currentTimeMillis());
            int i = this.d;
            this.d = i + 1;
            Frame build = timestampMillis.setId(i).build();
            if (this.c != null) {
                this.c.addSync(build);
            }
            if (ImageQuality.calculateFocus(bArr, previewProperties.camera.width, previewProperties.camera.height, false) <= this.extractionInterface.getFocusThreshold()) {
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFocus, new Point(rect.centerX(), rect.centerY())));
                Log.d("setInImageCheck(false) - focus check");
                if (this.a.getAndSet(false)) {
                    publishUpdate(new ExtractionUpdate(ManualExtractionUpdateState.focusHint, null));
                }
                setResult(false);
                return;
            }
            publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFlash, Boolean.valueOf(ImageQuality.isFlashNeeded(bArr, previewProperties.camera.width, previewProperties.camera.height, false))));
            if (this.a.get() && !this.b.get() && this.extractionInterface.isSteady()) {
                this.b.set(true);
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(1.0f)));
                Bitmap yuv2bitmap = CameraUtils.yuv2bitmap(bArr, previewProperties.isPortrait, previewProperties, rect, -1);
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, yuv2bitmap));
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, yuv2bitmap));
                LivenessDataModel livenessDataModel = new LivenessDataModel();
                livenessDataModel.setLivenessResult(NVLivenessResult.BO);
                livenessDataModel.setLivenessValue(-5.0f);
                if (this.c != null) {
                    livenessDataModel.setFrames(this.c.finish());
                }
                publishResult(livenessDataModel);
                System.gc();
                z = true;
                System.gc();
                setResult(z);
            }
            this.a.set(false);
            System.gc();
            setResult(z);
        } catch (Exception e) {
            Log.w("ImageCheck", "computeFocusConfidence failed!", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.b.get() ^ 1;
    }

    public void destroy() {
        super.destroy();
    }

    public void takePicture() {
        this.a.set(true);
    }
}
