package com.iqoption.view.timer.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class FlowerView extends View {
    private Paint bPR;
    private a eiA;

    public FlowerView(Context context) {
        super(context);
        bP(context);
    }

    public FlowerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bP(context);
    }

    public FlowerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bP(context);
    }

    @TargetApi(21)
    public FlowerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        bP(context);
    }

    private void bP(Context context) {
        setLayerType(2, null);
        this.eiA = new a(20);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) (i / 8);
        if (f < 5.0f) {
            f = 5.0f;
        }
        float f2 = f / 2.0f;
        this.bPR = new Paint();
        this.bPR.setAntiAlias(true);
        this.bPR.setStrokeWidth(f2);
        this.bPR.setStrokeCap(Cap.ROUND);
        this.bPR.setColor(-1);
        this.eiA.f(i, f);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.bPR != null) {
            for (int i = 0; i < 20; i++) {
                RectF rectF = this.eiA.anh()[i];
                this.bPR.setAlpha(this.eiA.ani()[i]);
                canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.bPR);
            }
        }
    }

    public void y(long j, long j2) {
        this.eiA.x(j, j2);
        ViewCompat.postInvalidateOnAnimation(this);
    }
}
