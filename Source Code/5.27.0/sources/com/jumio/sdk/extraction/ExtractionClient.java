package com.jumio.sdk.extraction;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.CallSuper;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.core.environment.Environment;
import com.jumio.core.mvp.model.PublisherWithUpdate;
import com.jumio.core.mvp.model.StaticModel;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ExtractionClient<U, R> extends PublisherWithUpdate<U, R> {
    private AtomicBoolean dataExtractionActive;
    private Rect extractionArea;
    protected ExtractionInterface extractionInterface;
    private ExtractionWorker extractionWorker;
    private AtomicBoolean inProcessing;
    protected boolean isTablet;
    protected Context mContext;
    private PreviewProperties previewProperties;
    protected boolean shouldInitAsync = false;

    public interface ExtractionInterface {
        float getFocusThreshold();

        boolean isSteady();
    }

    public static class ExtractionUpdate<T> {
        private final T mData;
        private final int mState;

        public ExtractionUpdate(int i, T t) {
            this.mState = i;
            this.mData = t;
        }

        public T getData() {
            return this.mData;
        }

        public int getState() {
            return this.mState;
        }
    }

    private class ExtractionWorker extends Thread {
        private Semaphore available = new Semaphore(0);
        private byte[] frame;

        ExtractionWorker() {
        }

        /* Access modifiers changed, original: 0000 */
        public void feed(byte[] bArr) {
            if (ExtractionClient.this.dataExtractionActive.get() && ExtractionClient.this.shouldFeed() && ExtractionClient.this.inProcessing.compareAndSet(false, true)) {
                byte[] bArr2 = this.frame;
                if (bArr2 == null || bArr2.length != bArr.length) {
                    this.frame = new byte[bArr.length];
                }
                System.arraycopy(bArr, 0, this.frame, 0, bArr.length);
                this.available.release();
            }
        }

        public void run() {
            while (!isInterrupted()) {
                try {
                    this.available.acquire();
                    ExtractionClient.this.process(this.frame, ExtractionClient.this.previewProperties, ExtractionClient.this.extractionArea);
                } catch (InterruptedException unused) {
                    interrupt();
                    return;
                } catch (Exception e) {
                    Log.printStackTrace(e);
                }
            }
        }
    }

    protected class InitThread extends Thread {
        private Rect extractionArea;
        private PreviewProperties previewProperties;

        public InitThread(PreviewProperties previewProperties, Rect rect) {
            this.previewProperties = previewProperties;
            this.extractionArea = rect;
        }

        public void run() {
            ExtractionClient.this.init(this.previewProperties, this.extractionArea);
        }
    }

    @CallSuper
    public void configure(StaticModel staticModel) {
    }

    public Size getPrefferedPreviewSize() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    @CallSuper
    public void init(PreviewProperties previewProperties, Rect rect) {
    }

    public abstract void process(byte[] bArr, PreviewProperties previewProperties, Rect rect);

    public abstract boolean shouldFeed();

    public void takePicture() {
    }

    public boolean takePictureManually() {
        return false;
    }

    public ExtractionClient(Context context) {
        this.mContext = context;
        Environment.loadJniInterfaceLib();
        Environment.loadJniImageQualityLib();
        CameraUtils.setYuvConversion(new YuvConversionWrapper());
        this.dataExtractionActive = new AtomicBoolean(false);
        this.inProcessing = new AtomicBoolean(false);
    }

    public void reinit() {
        if (this.previewProperties == null) {
            throw new NullPointerException("setPreviewProperties must be called first");
        } else if (this.extractionArea != null) {
            if (this.extractionWorker == null) {
                this.extractionWorker = new ExtractionWorker();
                this.extractionWorker.start();
            }
            if (!this.dataExtractionActive.get()) {
                if (this.shouldInitAsync) {
                    new InitThread(this.previewProperties, this.extractionArea).start();
                } else {
                    init(this.previewProperties, this.extractionArea);
                }
            }
            this.inProcessing.set(false);
        } else {
            throw new NullPointerException("setExtractionArea must be called first");
        }
    }

    public synchronized void feed(byte[] bArr) {
        if (this.extractionWorker != null) {
            this.extractionWorker.feed(bArr);
        }
    }

    @CallSuper
    public void cancel() {
        setDataExtractionActive(false);
        System.gc();
    }

    @CallSuper
    public void destroy() {
        cancel();
        ExtractionWorker extractionWorker = this.extractionWorker;
        if (extractionWorker != null) {
            extractionWorker.interrupt();
            this.extractionWorker = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void setResult(boolean z) {
        this.inProcessing.set(z);
    }

    public void setDataExtractionActive(boolean z) {
        this.dataExtractionActive.set(z);
    }

    public void setPreviewProperties(PreviewProperties previewProperties) {
        if (previewProperties != null) {
            this.previewProperties = previewProperties.copy();
        }
    }

    public void setExtractionArea(Rect rect) {
        this.extractionArea = new Rect(rect);
    }

    public void setTablet(boolean z) {
        this.isTablet = z;
    }

    public void setExtractionInterface(ExtractionInterface extractionInterface) {
        this.extractionInterface = extractionInterface;
    }
}
