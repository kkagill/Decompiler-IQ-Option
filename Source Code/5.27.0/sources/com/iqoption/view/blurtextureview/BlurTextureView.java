package com.iqoption.view.blurtextureview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class BlurTextureView extends View {
    private static final String TAG = "com.iqoption.view.blurtextureview.BlurTextureView";
    private a egZ;
    int eha;
    long ehb;
    int ehc;
    long ehd;

    public BlurTextureView(Context context) {
        this(context, null);
    }

    public BlurTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlurTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.eha = 0;
        this.ehb = 0;
        this.ehc = 0;
        this.ehd = 5000;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.egZ.destroy();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.egZ.ar(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.egZ.draw(canvas);
        aYy();
    }

    private void aYy() {
        this.eha++;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.ehb;
        long j2 = this.ehd;
        if (j > j2) {
            this.ehc = (int) ((((long) this.eha) * j2) / j);
            this.eha = 0;
            this.ehb = currentTimeMillis;
        }
    }
}
