package com.microblink.secured;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.Image;
import android.media.ImageReader;
import androidx.annotation.UiThread;
import com.microblink.hardware.camera.CameraType;
import com.microblink.hardware.camera.b;
import com.microblink.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(21)
/* compiled from: line */
public class n implements t {
    private boolean ewA;
    private a ewB;
    private ImageReader ewC;
    private com.microblink.hardware.a.a ewD;
    private com.microblink.hardware.a.a ewE;
    private Rect ewF;
    private float ewG;
    private Rect ewH;
    private Rect[] ewI;
    private int ewJ;
    private int ewK;
    private int ewL;
    private int ewM;
    private AtomicInteger ewN;
    private CaptureCallback ewO;
    private CameraCaptureSession ewo;
    private boolean ewp;
    private Builder ewq;
    private CaptureRequest ewr;
    protected y ews;
    protected b ewt;
    protected v ewu;
    private ak ewv;
    private ak eww;
    private boolean ewx;
    private aa ewy;
    private CameraType ewz;

    /* compiled from: line */
    class a {
        AtomicBoolean ewQ;
        AtomicBoolean ewR;
        public AtomicBoolean ewS;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        dispose();
        super.finalize();
    }

    @UiThread
    public final void dispose() {
        if (!this.ewx) {
            this.ewv = null;
            this.ews = null;
            this.ewu = null;
            this.eww = null;
            this.ewz = null;
            this.ewy = null;
            this.ewx = true;
            if (this.ewC != null) {
                Log.f(this, "Late closing ImageReader", new Object[0]);
                this.ewC.close();
                this.ewC = null;
            }
        }
    }

    @UiThread
    public void bdo() {
        Log.e(this, "Shaking started", new Object[0]);
        com.microblink.hardware.a.a aVar = this.ewE;
        if (aVar != null) {
            aVar.bdo();
        }
        aVar = this.ewD;
        if (aVar != null) {
            aVar.bdo();
        }
    }

    @UiThread
    public void bdp() {
        Log.e(this, "Shaking stopped", new Object[0]);
        com.microblink.hardware.a.a aVar = this.ewE;
        if (aVar != null) {
            aVar.bdp();
        }
        aVar = this.ewD;
        if (aVar != null) {
            aVar.bdp();
        }
        if (this.ewu.exB) {
            bek();
        }
    }

    @UiThread
    public final void setZoomLevel(float f) {
        if (this.ewq != null && this.ewo != null) {
            this.ewH = ah(f);
            this.ewq.set(CaptureRequest.SCALER_CROP_REGION, this.ewH);
            a(this.ewI);
        }
    }

    private Rect ah(float f) {
        f = this.ewy.aj(f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        f = ((f * (this.ewG - 1.0f)) + 1.0f) * 2.0f;
        int round = Math.round(((float) this.ewF.width()) / f);
        int round2 = Math.round(((float) this.ewF.height()) / f);
        int width = this.ewF.width() / 2;
        int height = this.ewF.height() / 2;
        return new Rect(width - round, height - round2, width + round, height + round2);
    }

    private void bei() {
        ImageReader imageReader = this.ewC;
        if (imageReader != null) {
            this.ewq.addTarget(imageReader.getSurface());
            this.ewr = this.ewq.build();
            this.ewq.removeTarget(imageReader.getSurface());
        }
    }

    private void bej() {
        try {
            if (this.ewo != null) {
                Log.e(this, "Capturing another frame for recognition. Currently alive images: {}", Integer.valueOf(this.ewN.get()));
                this.ewo.capture(this.ewr, null, this.ewv.getHandler());
                return;
            }
            Log.e(this, "Session is already closed. Cannot capture another frame for recognition.", new Object[0]);
        } catch (Exception e) {
            Log.a(this, e, "Failed to capture frame for recognition", new Object[0]);
        }
    }

    @UiThread
    public final void bek() {
        if (this.ewA) {
            if (!(this.ewq == null || this.ewo == null)) {
                ak akVar = this.ewv;
                if (akVar != null) {
                    akVar.k(new Runnable() {
                        public final void run() {
                            Builder b = n.this.ewq;
                            Integer valueOf = Integer.valueOf(0);
                            if (b == null || n.this.ewo == null || !n.this.ewp || n.this.ewv == null) {
                                Log.c(n.this, "Cannot trigger autofocus. Camera session is closed!", new Object[0]);
                                return;
                            }
                            Log.a(n.this, "Triggering autofocus", new Object[0]);
                            if (n.this.ewu == null || !n.this.ewu.exx) {
                                n.this.ewq.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                            } else {
                                n.this.ewq.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(2));
                            }
                            try {
                                n.this.ewq.set(CaptureRequest.CONTROL_AF_TRIGGER, valueOf);
                                n.this.bei();
                                n.this.ewo.setRepeatingRequest(n.this.ewq.build(), n.this.ewO, n.this.ewv.getHandler());
                                n.this.ewB.ewS.set(false);
                                n.this.ewq.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                                n.this.ewo.capture(n.this.ewq.build(), n.this.ewO, n.this.ewv.getHandler());
                                n.this.ewq.set(CaptureRequest.CONTROL_AF_TRIGGER, valueOf);
                            } catch (Exception unused) {
                                n.this.ewt.bdq();
                            }
                        }
                    });
                    return;
                }
            }
            Log.c(this, "Cannot trigger autofocus. Camera session is closed!", new Object[0]);
            return;
        }
        Log.c(this, "Autofocus not supported, unable to trigger it", new Object[0]);
    }

    private Rect n(Rect rect) {
        float f = ((float) (rect.left + 1000)) / 2000.0f;
        float f2 = ((float) (rect.right + 1000)) / 2000.0f;
        return new Rect(this.ewH.left + Math.round(f * ((float) this.ewH.width())), this.ewH.top + Math.round((((float) (rect.top + 1000)) / 2000.0f) * ((float) this.ewH.height())), this.ewH.left + Math.round(f2 * ((float) this.ewH.width())), this.ewH.top + Math.round((((float) (rect.bottom + 1000)) / 2000.0f) * ((float) this.ewH.height())));
    }

    public final void a(Rect[] rectArr) {
        if (this.ewq != null && this.ewo != null && this.ewH != null && !this.ewy.beq()) {
            Object obj;
            Object obj2;
            Object obj3 = null;
            if (rectArr != null) {
                int i = this.ewJ;
                if (i > 0) {
                    if (rectArr.length < i) {
                        i = rectArr.length;
                    }
                    obj = new MeteringRectangle[i];
                } else {
                    obj = null;
                }
                int i2 = this.ewK;
                if (i2 > 0) {
                    if (rectArr.length < i2) {
                        i2 = rectArr.length;
                    }
                    obj2 = new MeteringRectangle[i2];
                } else {
                    obj2 = null;
                }
                int i3 = this.ewL;
                if (i3 > 0) {
                    if (rectArr.length < i3) {
                        i3 = rectArr.length;
                    }
                    obj3 = new MeteringRectangle[i3];
                }
                for (i3 = 0; i3 < rectArr.length; i3++) {
                    if (i3 < this.ewJ) {
                        obj[i3] = new MeteringRectangle(n(rectArr[i3]), 1000);
                    }
                    if (i3 < this.ewK) {
                        obj2[i3] = new MeteringRectangle(n(rectArr[i3]), 1000);
                    }
                    if (i3 < this.ewL) {
                        obj3[i3] = new MeteringRectangle(n(rectArr[i3]), 1000);
                    }
                }
                Object obj4 = obj;
                obj = obj3;
                obj3 = obj4;
            } else {
                obj = null;
                obj2 = obj;
            }
            if (obj3 != null) {
                this.ewq.set(CaptureRequest.CONTROL_AF_REGIONS, obj3);
            } else if (this.ewJ > 0) {
                this.ewq.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(this.ewH, 0)});
            }
            if (obj2 != null) {
                this.ewq.set(CaptureRequest.CONTROL_AE_REGIONS, obj2);
            } else if (this.ewK > 0) {
                this.ewq.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(this.ewH, 0)});
            }
            if (obj != null) {
                this.ewq.set(CaptureRequest.CONTROL_AWB_REGIONS, obj);
            } else if (this.ewL > 0) {
                this.ewq.set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{new MeteringRectangle(this.ewH, 0)});
            }
            this.ewI = rectArr;
            this.ewv.k(new Runnable() {
                public final void run() {
                    if (!(n.this.ewo == null || n.this.ewq == null)) {
                        try {
                            n.this.bei();
                            n.this.ewo.setRepeatingRequest(n.this.ewq.build(), n.this.ewO, n.this.ewv.getHandler());
                        } catch (CameraAccessException e) {
                            Log.b((Object) this, e, "Failed to set capture request with new parameters", new Object[0]);
                        } catch (IllegalStateException e2) {
                            Log.b((Object) this, e2, "Failed to set capture request with new parameters - capture session is already closed", new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public final CameraType getOpenedCameraType() {
        return this.ewz;
    }

    public final boolean bel() {
        return this.ewM == 270;
    }

    public final void a(Image image) {
        image.close();
        Log.e(this, "[close] Active images: {}", Integer.valueOf(this.ewN.decrementAndGet()));
        if (this.ewN.decrementAndGet() == 0 && this.ewB.ewR.get()) {
            Log.f(this, "Closing image reader", new Object[0]);
            ImageReader imageReader = this.ewC;
            if (imageReader != null) {
                imageReader.close();
                this.ewC = null;
            }
            return;
        }
        if (!this.ewB.ewQ.get()) {
            bej();
        }
    }
}
