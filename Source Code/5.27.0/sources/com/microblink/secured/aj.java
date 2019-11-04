package com.microblink.secured;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.view.animation.Transformation;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.util.Log;

/* compiled from: line */
public final class aj extends ViewGroup {
    private boolean evS;
    private int eyA;
    private int eyB;
    private Matrix eyx;
    private Orientation eyy;
    private Orientation eyz;

    /* compiled from: line */
    class a extends Animation {
        private float eyC;
        private float eyD;
        private float eyE;
        private float eyF;
        private float eyG;
        private float eyH;

        public a(float f, float f2, float f3, float f4, boolean z) {
            this.eyC = f;
            this.eyD = f2;
            if (z) {
                this.eyE = (f3 - f4) * 0.5f;
                this.eyF = (f4 - f3) * 0.5f;
            } else {
                this.eyE = 0.0f;
                this.eyF = 0.0f;
            }
            if (z) {
                this.eyG = f4 * 0.5f;
                this.eyH = f3 * 0.5f;
                return;
            }
            this.eyG = f3 * 0.5f;
            this.eyH = f4 * 0.5f;
        }

        /* Access modifiers changed, original: protected|final */
        public final void applyTransformation(float f, Transformation transformation) {
            transformation.getMatrix().preTranslate(this.eyE, this.eyF);
            Matrix matrix = transformation.getMatrix();
            float f2 = this.eyC;
            matrix.preRotate(f2 + (f * (this.eyD - f2)), this.eyG, this.eyH);
        }
    }

    public final void setAnimateRotation(boolean z) {
        this.evS = z;
    }

    public final void setAnimationDuration(int i) {
        this.eyA = i;
    }

    public final void setInitialOrientation(Orientation orientation) {
        this.eyz = orientation;
        this.eyy = a(this.eyz);
    }

    public final void setHostActivityOrientation(int i) {
        this.eyB = i;
        setOrientation(this.eyz);
    }

    private Orientation a(Orientation orientation) {
        int ordinal = orientation.ordinal();
        int i = this.eyB;
        i = i != 0 ? i != 8 ? i != 9 ? 0 : 2 : 1 : 3;
        Log.a(this, "Normalized orientation {} to {}", orientation, Orientation.values()[(ordinal + i) % 4]);
        return Orientation.values()[(ordinal + i) % 4];
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i = resolveSize(getSuggestedMinimumWidth(), i);
        i2 = resolveSize(getSuggestedMinimumHeight(), i2);
        if (this.eyy.isHorizontal()) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        Log.a(this, "Measured dimension: {}x{}", Integer.valueOf(i), Integer.valueOf(i2));
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        r1 = new Object[6];
        Integer valueOf = Integer.valueOf(childCount);
        Integer valueOf2 = Integer.valueOf(0);
        r1[0] = valueOf;
        r1[1] = Integer.valueOf(i2);
        r1[2] = Integer.valueOf(i4);
        r1[3] = Integer.valueOf(i);
        r1[4] = Integer.valueOf(i3);
        r1[5] = Boolean.valueOf(z);
        Log.a(this, "Rotatable view group ({} childs) layouting to: top: {} bottom: {}, left: {}, right: {} (changed: {}) ", r1);
        int width = getWidth();
        int height = getHeight();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(getChildDrawingOrder(childCount, i5));
            if (this.eyy.isHorizontal()) {
                childAt.measure(MeasureSpec.makeMeasureSpec(height, 1073741824), MeasureSpec.makeMeasureSpec(width, 1073741824));
                Log.f(this, "Horizontal layouting child {} to: top: {} bottom: {}, left: {}, right: {}", Integer.valueOf(i5), valueOf2, Integer.valueOf(width), valueOf2, Integer.valueOf(height));
                childAt.layout(0, 0, height, width);
            } else {
                childAt.measure(MeasureSpec.makeMeasureSpec(width, 1073741824), MeasureSpec.makeMeasureSpec(height, 1073741824));
                Log.f(this, "Vertical layouting child {} to: top: {} bottom: {}, left: {}, right: {}", Integer.valueOf(i5), valueOf2, Integer.valueOf(height), valueOf2, Integer.valueOf(width));
                childAt.layout(0, 0, width, height);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.a(this, "[RotatableViewGroup] size changed from {}x{} to {}x{}", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        if (i != i3 || i2 != i4) {
            Animation a = a(Orientation.ORIENTATION_PORTRAIT, this.eyy);
            if (a != null) {
                a.setFillEnabled(true);
                a.setDuration(0);
                a.setFillAfter(true);
                a.setFillBefore(true);
                setLayoutAnimation(new LayoutAnimationController(a));
                startLayoutAnimation();
            }
            beG();
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain(motionEvent);
        float[] fArr = new float[]{motionEvent.getRawX(), motionEvent.getRawY()};
        Log.a(this, "Tap coordinate: ({}, {})", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Log.a(this, "Location on screen: ({}, {})", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        fArr[0] = fArr[0] - ((float) iArr[0]);
        fArr[1] = fArr[1] - ((float) iArr[1]);
        Log.a(this, "View-normalized tap coordinate: ({}, {})", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
        this.eyx.mapPoints(fArr);
        Log.a(this, "Mapped tap coordinate: ({} {})", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
        motionEvent.setLocation(fArr[0], fArr[1]);
        return super.dispatchTouchEvent(motionEvent);
    }

    private Animation a(Orientation orientation, Orientation orientation2) {
        Log.a(this, "Creating animation from {} to {}", orientation, orientation2);
        Log.a(this, "Width: {},  heigth: {}", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
        if (orientation == Orientation.ORIENTATION_PORTRAIT) {
            if (orientation2 == Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
                return new a(0.0f, 90.0f, (float) getWidth(), (float) getHeight(), true);
            } else if (orientation2 == Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                return new a(0.0f, -90.0f, (float) getWidth(), (float) getHeight(), true);
            } else if (orientation2 != Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                return null;
            } else {
                return new a(0.0f, 180.0f, (float) getWidth(), (float) getHeight(), false);
            }
        } else if (orientation == Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
            if (orientation2 == Orientation.ORIENTATION_PORTRAIT) {
                return new a(90.0f, 0.0f, (float) getWidth(), (float) getHeight(), false);
            } else if (orientation2 == Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                return new a(90.0f, 180.0f, (float) getWidth(), (float) getHeight(), false);
            } else if (orientation2 != Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                return null;
            } else {
                return new a(90.0f, -90.0f, (float) getWidth(), (float) getHeight(), true);
            }
        } else if (orientation != Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
            if (orientation == Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                if (orientation2 == Orientation.ORIENTATION_PORTRAIT) {
                    return new a(-90.0f, 0.0f, (float) getWidth(), (float) getHeight(), false);
                } else if (orientation2 == Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                    return new a(270.0f, 180.0f, (float) getWidth(), (float) getHeight(), false);
                } else if (orientation2 == Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
                    return new a(-90.0f, 90.0f, (float) getWidth(), (float) getHeight(), true);
                }
            }
            return null;
        } else if (orientation2 == Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
            return new a(180.0f, 90.0f, (float) getWidth(), (float) getHeight(), true);
        } else if (orientation2 == Orientation.ORIENTATION_LANDSCAPE_LEFT) {
            return new a(180.0f, 270.0f, (float) getWidth(), (float) getHeight(), true);
        } else if (orientation2 != Orientation.ORIENTATION_PORTRAIT) {
            return null;
        } else {
            return new a(180.0f, 0.0f, (float) getWidth(), (float) getHeight(), false);
        }
    }

    private void beG() {
        int width = getWidth();
        int height = getHeight();
        Matrix matrix = new Matrix();
        if (this.eyy == Orientation.ORIENTATION_LANDSCAPE_RIGHT) {
            matrix.preTranslate((float) width, 0.0f);
            matrix.preRotate(90.0f);
        } else if (this.eyy == Orientation.ORIENTATION_LANDSCAPE_LEFT) {
            matrix.preTranslate(0.0f, (float) height);
            matrix.preRotate(-90.0f);
        } else if (this.eyy != Orientation.ORIENTATION_PORTRAIT && this.eyy == Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
            matrix.preTranslate((float) width, (float) height);
            matrix.preRotate(180.0f);
        }
        matrix.invert(this.eyx);
    }

    public final void setOrientation(Orientation orientation) {
        invalidate();
        this.eyz = orientation;
        orientation = a(this.eyz);
        Animation a = a(this.eyy, orientation);
        if (a != null) {
            a.setFillAfter(true);
            if (this.evS) {
                a.setDuration((long) this.eyA);
            } else {
                a.setDuration(0);
            }
            setLayoutAnimation(new LayoutAnimationController(a));
            startLayoutAnimation();
        } else {
            requestLayout();
        }
        this.eyy = orientation;
        beG();
        StringBuilder stringBuilder = new StringBuilder("Set orientation: ");
        stringBuilder.append(this.eyy);
        Log.a(this, stringBuilder.toString(), new Object[0]);
    }
}
