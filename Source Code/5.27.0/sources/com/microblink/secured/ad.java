package com.microblink.secured;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.Looper;
import androidx.annotation.UiThread;
import com.microblink.hardware.a.a;
import com.microblink.hardware.camera.CameraType;
import com.microblink.hardware.camera.b;
import com.microblink.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"NewApi"})
/* compiled from: line */
public abstract class ad implements t {
    protected a ewD;
    private int ewM;
    protected y ews;
    protected b ewt;
    protected v ewu;
    ak ewv;
    protected aa ewy;
    CameraType exy;
    protected Camera eya;
    ab eyb;
    private j eyc;
    protected boolean eyd;
    protected o eye;
    private Size eyf;
    private AtomicBoolean eyg;
    private t.a eyh;
    private boolean eyi;

    public abstract PreviewCallback beD();

    /* Access modifiers changed, original: protected */
    public void finalize() {
        dispose();
        super.finalize();
    }

    @UiThread
    public void dispose() {
        if (this.eyg.compareAndSet(false, true)) {
            o oVar = this.eye;
            if (oVar != null) {
                oVar.ewT.dispose();
                oVar.ewT = null;
            }
            this.eye = null;
            ab abVar = this.eyb;
            if (abVar != null) {
                abVar.dispose();
            }
            this.eyb = null;
            this.ews = null;
            this.ewu = null;
            this.ewt = null;
            this.eyc = null;
            this.ewD = null;
            this.eyf = null;
            this.exy = null;
            this.ewy = null;
            this.eyh = null;
        }
    }

    @UiThread
    public void bdo() {
        Log.e(this, "shaking started, this = {}, focus manager: {}, camera queue: {}", this, this.eyb, this.ewv);
        this.eyd = true;
        if (this.eyb != null) {
            this.ewv.k(new Runnable() {
                public final void run() {
                    ab a = ad.this.eyb;
                    if (a != null) {
                        a.beB();
                    }
                }
            });
        }
        a aVar = this.ewD;
        if (aVar != null) {
            aVar.bdo();
        }
    }

    @UiThread
    public void bdp() {
        Log.e(this, "shaking stopped, this = {}, focus manager: {}, camera queue: {}", this, this.eyb, this.ewv);
        if (this.eyb != null) {
            this.ewv.k(new Runnable() {
                public final void run() {
                    ab a = ad.this.eyb;
                    if (a != null) {
                        a.beA();
                        if (!a.beC() || ad.this.ewu.exB) {
                            a.bez();
                        }
                        a.fK(false);
                    }
                }
            });
        }
        this.eyd = false;
        a aVar = this.ewD;
        if (aVar != null) {
            aVar.bdp();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void j(Runnable runnable) {
        if (this.ewv != null) {
            if (Looper.myLooper() == this.ewv.getHandler().getLooper()) {
                runnable.run();
                return;
            }
            this.ewv.k(runnable);
        }
    }

    public void a(final q qVar) {
        j(new Runnable() {
            public final void run() {
                if (ad.this.eya == null || ad.this.eyi) {
                    Log.c(ad.this, "Camera is released, cannot request another frame", new Object[0]);
                    return;
                }
                if (!ad.this.beE()) {
                    ad.this.eya.setOneShotPreviewCallback(ad.this.beD());
                } else if (qVar.bem() != null) {
                    ad.this.eya.addCallbackBuffer(qVar.bem());
                }
                ab a = ad.this.eyb;
                if (a != null) {
                    a.bey();
                }
            }
        });
    }

    /* Access modifiers changed, original: protected */
    @SuppressLint({"ObsoleteSdkInt"})
    public boolean beE() {
        return VERSION.SDK_INT >= 8;
    }

    private void a(float f, Parameters parameters) {
        f = this.ewy.aj(f);
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        parameters.setZoom(Math.round(f * ((float) parameters.getMaxZoom())));
    }

    @UiThread
    public final void setZoomLevel(final float f) {
        this.ewv.k(new Runnable() {
            public final void run() {
                if (ad.this.eya != null) {
                    try {
                        Parameters parameters = ad.this.eya.getParameters();
                        ad.this.a(f, parameters);
                        ad.this.eya.setParameters(parameters);
                    } catch (RuntimeException unused) {
                        Log.b(ad.this, "Failed to set zoom level to {}", Float.valueOf(f));
                    }
                }
            }
        });
    }

    public final CameraType getOpenedCameraType() {
        return this.exy;
    }

    public final boolean bel() {
        return this.ewM == 270;
    }
}
