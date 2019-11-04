package com.jumio.sdk.manual;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.ImageQuality;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.util.concurrent.atomic.AtomicBoolean;

public class ManualPictureClient extends ExtractionClient<ExtractionUpdate, StaticModel> {
    private AtomicBoolean mPictureTaken = new AtomicBoolean(false);
    private AtomicBoolean mTakePicture = new AtomicBoolean(false);

    public boolean takePictureManually() {
        return true;
    }

    public ManualPictureClient(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        this.mTakePicture.set(false);
        this.mPictureTaken.set(false);
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        boolean z = false;
        try {
            if (ImageQuality.calculateFocus(bArr, previewProperties.camera.width, previewProperties.camera.height, false) <= this.extractionInterface.getFocusThreshold()) {
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFocus, new Point(rect.centerX(), rect.centerY())));
                Log.d("setInImageCheck(false) - focus check");
                if (this.mTakePicture.getAndSet(false)) {
                    publishUpdate(new ExtractionUpdate(ManualExtractionUpdateState.focusHint, null));
                }
                setResult(false);
                return;
            }
            publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFlash, Boolean.valueOf(ImageQuality.isFlashNeeded(bArr, previewProperties.camera.width, previewProperties.camera.height, false))));
            if (this.mTakePicture.get() && !this.mPictureTaken.get() && this.extractionInterface.isSteady()) {
                this.mPictureTaken.set(true);
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(1.0f)));
                Bitmap yuv2bitmap = CameraUtils.yuv2bitmap(bArr, previewProperties.isPortrait, previewProperties, rect, -1);
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, yuv2bitmap));
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, yuv2bitmap));
                publishResult(null);
                System.gc();
                z = true;
            } else {
                this.mTakePicture.set(false);
            }
            setResult(z);
        } catch (Exception e) {
            Log.w("ImageCheck", "computeFocusConfidence failed!", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.mPictureTaken.get() ^ 1;
    }

    public void takePicture() {
        this.mTakePicture.set(true);
    }
}
