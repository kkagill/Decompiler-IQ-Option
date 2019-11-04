package com.iqoption.view.c;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.iqoption.util.r;

/* compiled from: ViewFrameHelper */
public class a {
    private float ehp;
    private float ehq;
    private int ehr;
    private float ehs;
    private Rect eht = new Rect();

    public a(float f, int i, float f2, float f3) {
        this.ehp = f;
        this.ehr = i;
        this.ehs = f2;
        this.ehq = f3;
    }

    public void setFrameTopGapSize(float f) {
        this.ehq = f;
    }

    public void onDraw(Canvas canvas) {
        canvas.getClipBounds(this.eht);
        r.a(canvas, 0.0f, 0.0f, (float) (this.eht.width() - 1), (float) (this.eht.height() - 1), this.ehp, this.ehq, this.ehr, this.ehs);
    }
}
