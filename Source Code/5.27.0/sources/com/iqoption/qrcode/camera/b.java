package com.iqoption.qrcode.camera;

import android.graphics.Canvas;
import android.view.View;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* compiled from: GraphicOverlay */
public class b<T extends a> extends View {
    private int dRA;
    private float dRB;
    private int dRC;
    private float dRD;
    private Set<T> dRE;
    private int dRc;
    private final Object mLock;

    /* compiled from: GraphicOverlay */
    public static abstract class a {
        public abstract void draw(Canvas canvas);
    }

    public void clear() {
        synchronized (this.mLock) {
            this.dRE.clear();
        }
        postInvalidate();
    }

    public List<T> getGraphics() {
        Vector vector;
        synchronized (this.mLock) {
            vector = new Vector(this.dRE);
        }
        return vector;
    }

    public float getWidthScaleFactor() {
        return this.dRB;
    }

    public float getHeightScaleFactor() {
        return this.dRD;
    }

    public void s(int i, int i2, int i3) {
        synchronized (this.mLock) {
            this.dRA = i;
            this.dRC = i2;
            this.dRc = i3;
        }
        postInvalidate();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.mLock) {
            if (!(this.dRA == 0 || this.dRC == 0)) {
                this.dRB = ((float) canvas.getWidth()) / ((float) this.dRA);
                this.dRD = ((float) canvas.getHeight()) / ((float) this.dRC);
            }
            for (a draw : this.dRE) {
                draw.draw(canvas);
            }
        }
    }
}
