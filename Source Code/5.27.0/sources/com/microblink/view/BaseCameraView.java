package com.microblink.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.microblink.hardware.camera.CameraType;
import com.microblink.hardware.camera.VideoResolutionPreset;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.secured.k;
import com.microblink.secured.t;
import com.microblink.secured.v;
import com.microblink.util.Log;
import com.microblink.view.a.a;

/* compiled from: line */
public abstract class BaseCameraView extends ViewGroup {
    private RectF euH;
    private Orientation euI;
    public a eyW;
    public CameraViewState eyX;
    protected a eyY;
    protected int eyZ;
    protected b eza;
    protected int ezb;
    protected CameraAspectMode ezc;
    protected Orientation ezd;
    public com.microblink.hardware.orientation.a eze;
    private t ezf;
    private c ezg;
    private com.microblink.hardware.a.a ezh;
    private v ezi;
    private int ezj;
    private int ezk;
    private float ezl;
    private boolean ezm;
    private boolean ezn;
    private d ezo;

    /* compiled from: line */
    public enum CameraViewState {
        DESTROYED,
        CREATED,
        STARTED,
        RESUMED
    }

    private static float ak(float f) {
        return f > 1.0f ? 1.0f : f < 0.0f ? 0.0f : f;
    }

    /* Access modifiers changed, original: protected */
    public Activity getHostActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public v getCameraFactorySettings() {
        return this.ezi;
    }

    private int getCameraRotation() {
        int i = this.ezb;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i != 8) {
            return i != 9 ? 0 : 270;
        } else {
            return 180;
        }
    }

    /* Access modifiers changed, original: protected */
    @UiThread
    public void onMeasure(int i, int i2) {
        i = resolveSize(getSuggestedMinimumWidth(), i);
        i2 = resolveSize(getSuggestedMinimumHeight(), i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                childAt.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            }
        }
        Log.a(this, "Measured dimension: {}x{}", Integer.valueOf(i), Integer.valueOf(i2));
        setMeasuredDimension(i, i2);
    }

    @UiThread
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.eyY;
        return (aVar == null || aVar.getView() == null || !this.eyY.getView().dispatchTouchEvent(motionEvent)) ? false : true;
    }

    /* Access modifiers changed, original: protected */
    @UiThread
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.a(this, "Camera preview ({} childs) layouting to: top: {} bottom: {}, left: {}, right: {} (changed: {}) ", Integer.valueOf(getChildCount()), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(z));
        if (getChildCount() == 0) {
            Log.d(this, "Camera view has no children?!?", new Object[0]);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 == 0 || i6 == 0) {
            Log.d(this, "Layout size is 0x0?!?", new Object[0]);
            return;
        }
        a aVar = this.eyY;
        if (aVar == null) {
            Log.b(this, "Create not called. Cannot layout view!", new Object[0]);
            return;
        }
        int i7;
        int i8;
        int size = MeasureSpec.getSize(aVar.getView().getMeasuredWidth());
        int size2 = MeasureSpec.getSize(this.eyY.getView().getMeasuredHeight());
        Log.a(this, "Camera surface view size is {}x{}", Integer.valueOf(size), Integer.valueOf(size2));
        Log.a(this, "Base camera view size: {}x{}", Integer.valueOf(i5), Integer.valueOf(i6));
        int i9 = (i5 - size) / 2;
        int i10 = (i5 + size) / 2;
        int i11 = (i6 - size2) / 2;
        int i12 = (i6 + size2) / 2;
        float f = 1.0f;
        float f2 = 0.0f;
        if (this.ezc == CameraAspectMode.ASPECT_FIT) {
            Log.a(this, "Layouting in ASPECT_FIT mode", new Object[0]);
            this.euH = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            i6 = i9;
            i5 = i10;
            i7 = i11;
            i8 = i12;
        } else {
            float f3;
            float f4;
            Log.a(this, "Layouting in ASPECT_FILL mode", new Object[0]);
            if (size <= 0 || size2 <= 0) {
                f3 = 1.0f;
                f4 = 0.0f;
            } else {
                f2 = (float) size;
                f = ((float) i5) / f2;
                f3 = (float) i6;
                f4 = (float) size2;
                f3 /= f4;
                f2 = ((float) (-i9)) / f2;
                f4 = ((float) (-i11)) / f4;
            }
            if (!k.bS(getContext())) {
                float f5 = f;
                f = f3;
                f3 = f5;
                float f6 = f2;
                f2 = f4;
                f4 = f6;
            }
            f4 = ak(f4);
            f2 = ak(f2);
            this.euH = new RectF(f4, f2, ak(f3) + f4, ak(f) + f2);
            StringBuilder stringBuilder = new StringBuilder("Visible ROI: ");
            stringBuilder.append(this.euH.toString());
            Log.a(this, stringBuilder.toString(), new Object[0]);
            i6 = i;
            i7 = i2;
            i5 = i3;
            i8 = i4;
        }
        this.ezj = i5 - i6;
        this.ezk = i8 - i7;
        Log.f(this, "Layouting camera surface view: Left: {}, Top: {}, Right: {}, Bottom: {}", Integer.valueOf(i9), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12));
        this.eyY.getView().layout(i9, i11, i10, i12);
        if (this.ezg != null) {
            if (this.euI.isHorizontal()) {
                this.ezg.ar(this.ezk, this.ezj);
            } else {
                this.ezg.ar(this.ezj, this.ezk);
            }
        }
        for (int i13 = 1; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            Log.f(this, "Layouting child {}: Left: {}, Top: {}, Right: {}, Bottom: {}", Integer.valueOf(i13), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5), Integer.valueOf(i8));
            childAt.layout(i6, i7, i5, i8);
        }
    }

    @UiThread
    public final CameraType getOpenedCameraType() {
        t tVar = this.ezf;
        return tVar != null ? tVar.getOpenedCameraType() : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean beM() {
        t tVar = this.ezf;
        return tVar != null ? tVar.bel() : false;
    }

    @UiThread
    public final float getZoomLevel() {
        return this.ezl;
    }

    @UiThread
    public final void setZoomLevel(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.ezl = f;
        t tVar = this.ezf;
        if (tVar != null) {
            tVar.setZoomLevel(this.ezl);
        }
    }

    @UiThread
    public final CameraViewState getCameraViewState() {
        return this.eyX;
    }

    public final void setTapToFocusAllowed(boolean z) {
        this.ezm = z;
    }

    public final void setPinchToZoomAllowed(boolean z) {
        this.ezn = z;
    }

    public final int getCameraPreviewWidth() {
        return this.ezj;
    }

    public final int getCameraPreviewHeight() {
        return this.ezk;
    }

    /* Access modifiers changed, original: protected|final */
    public final int getConfigurationOrientation() {
        return this.eyZ;
    }

    @UiThread
    public void setCameraType(CameraType cameraType) {
        if (this.eyX != CameraViewState.DESTROYED) {
            throw new IllegalStateException("Method setCameraType must be called before calling create()");
        } else if (cameraType != null) {
            this.ezi.exy = cameraType;
        }
    }

    @UiThread
    public void setShakeListener(com.microblink.hardware.a.a aVar) {
        this.ezh = aVar;
    }

    public CameraAspectMode getAspectMode() {
        return this.ezc;
    }

    @UiThread
    public void setAspectMode(CameraAspectMode cameraAspectMode) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezc = cameraAspectMode;
            if (this.ezc == null) {
                this.ezc = CameraAspectMode.ASPECT_FILL;
                return;
            }
            return;
        }
        throw new IllegalStateException("Method setAspectMode must be called before calling create()");
    }

    @UiThread
    public final void setOnSizeChangedListener(c cVar) {
        this.ezg = cVar;
    }

    @UiThread
    public final void setOnActivityFlipListener(b bVar) {
        this.eza = bVar;
    }

    @UiThread
    public final void setVideoResolutionPreset(VideoResolutionPreset videoResolutionPreset) {
        if (this.eyX == CameraViewState.DESTROYED) {
            v vVar = this.ezi;
            if (videoResolutionPreset != null) {
                vVar.exv = videoResolutionPreset;
                return;
            } else {
                vVar.exv = VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT;
                return;
            }
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    @UiThread
    public final void setForceUseLegacyCamera(boolean z) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezi.exz = z;
            return;
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    @UiThread
    public final void setRequestAutofocusOnShakingStopInContinousAutofocusMode(boolean z) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezi.exB = z;
            return;
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    @UiThread
    public final void setPhotoMode(boolean z) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezi.exw = z;
            return;
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    @UiThread
    public final void setOptimizeCameraForNearScan(boolean z) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezi.exx = z;
            return;
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    @UiThread
    public final void setRequestedSurfaceViewForCameraDisplay(@NonNull CameraSurface cameraSurface) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezi.exA = cameraSurface;
            return;
        }
        throw new IllegalStateException("This method can only be called before calling create().");
    }

    public a getCameraEventsListener() {
        return this.eyW;
    }

    @UiThread
    public void setCameraEventsListener(a aVar) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.eyW = aVar;
            return;
        }
        throw new IllegalStateException("Method setCameraEventsListener must be called before calling create()");
    }

    public int getHostScreenOrientation() {
        return this.ezb;
    }

    public RectF getVisiblePart() {
        return this.euH;
    }

    public Orientation getCurrentOrientation() {
        return this.euI;
    }

    public final Orientation getInitialOrientation() {
        return this.ezd;
    }

    @CallSuper
    @UiThread
    public void setInitialOrientation(Orientation orientation) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezd = orientation;
            if (getInitialOrientation() == null) {
                this.ezd = Orientation.fromActivityInfoCode(this.ezb);
                return;
            }
            return;
        }
        throw new IllegalStateException("Method setInitialOrientation must be called before calling create()");
    }

    @UiThread
    public void setOrientationAllowedListener(d dVar) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezo = dVar;
            return;
        }
        throw new IllegalStateException("Method setOrientationAllowedListener must be called before calling create()");
    }

    public com.microblink.hardware.orientation.a getOrientationChangeListener() {
        return this.eze;
    }

    public void setOrientationChangeListener(com.microblink.hardware.orientation.a aVar) {
        if (this.eyX == CameraViewState.DESTROYED || this.eyX == CameraViewState.CREATED) {
            this.eze = aVar;
            return;
        }
        throw new IllegalStateException("Method setOrientationChangeListener must be called before calling start()");
    }
}
