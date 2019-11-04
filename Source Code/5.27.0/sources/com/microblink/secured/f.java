package com.microblink.secured;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.UiThread;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.util.Log;
import com.microblink.view.BaseCameraView;

/* compiled from: line */
public abstract class f extends BaseCameraView {
    private aj evQ;
    private ah evR;
    private boolean evS;
    private int evT;
    private boolean evU;

    /* compiled from: line */
    public static class a extends LayoutParams {
        boolean evV = false;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            if (attributeSet != null) {
                this.evV = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "rotatable", this.evV);
            }
        }

        public a() {
            super(-1, -1);
        }
    }

    @UiThread
    public void addView(View view) {
        if (this.evU) {
            addView(view, null);
        } else {
            super.addView(view);
        }
    }

    @UiThread
    public void addView(View view, int i) {
        if (this.evU) {
            addView(view, i, null);
        } else {
            super.addView(view, i);
        }
    }

    @UiThread
    public void addView(View view, int i, LayoutParams layoutParams) {
        if (this.evU) {
            if (layoutParams == null) {
                layoutParams = new a();
            }
            if (!(layoutParams instanceof a)) {
                throw new RuntimeException("BaseCameraView.LayoutParams are only allowed type of params");
            } else if (((a) layoutParams).evV) {
                this.evQ.addView(view, i);
                return;
            } else {
                this.evR.addView(view, i);
                return;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @UiThread
    public void addView(View view, LayoutParams layoutParams) {
        if (this.evU) {
            if (layoutParams == null) {
                layoutParams = new a();
            }
            if (!(layoutParams instanceof a)) {
                throw new RuntimeException("BaseCameraView.LayoutParams are only allowed type of params");
            } else if (((a) layoutParams).evV) {
                this.evQ.addView(view);
                return;
            } else {
                this.evR.addView(view);
                return;
            }
        }
        super.addView(view, layoutParams);
    }

    @UiThread
    public void addView(View view, int i, int i2) {
        if (this.evU) {
            throw new RuntimeException("addView method has been disabled in CameraView. Please use addChildView(View, boolean).");
        }
        super.addView(view, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @UiThread
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.e(this, "Rotatable view responded: {}", Boolean.valueOf(this.evQ.dispatchTouchEvent(motionEvent)));
        if (this.evQ.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        Log.e(this, "Fixed view responded: {}", Boolean.valueOf(this.evR.dispatchTouchEvent(motionEvent)));
        if (this.evR.dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @UiThread
    public final void setAnimateRotation(boolean z) {
        this.evS = z;
        this.evQ.setAnimateRotation(z);
    }

    public final int getRotationAnimationDuration() {
        return this.evT;
    }

    public final void setRotationAnimationDuration(int i) {
        this.evT = i;
        this.evQ.setAnimationDuration(i);
    }

    @UiThread
    public final void setInitialOrientation(Orientation orientation) {
        super.setInitialOrientation(orientation);
        this.evQ.setInitialOrientation(getInitialOrientation());
    }
}
