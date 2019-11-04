package com.iqoption.core.ui.widget;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.iqoption.core.ext.a;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.c;

public final class TradersMoodBar extends View {
    private ValueAnimator Le;
    private Paint bLN;
    private Paint bLO;
    private RectF bLP = new RectF();
    private RectF bLQ = new RectF();
    private Paint bLh;
    private float value = 0.5f;

    public TradersMoodBar(Context context) {
        super(context);
        init();
    }

    public TradersMoodBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TradersMoodBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public TradersMoodBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private int fh(@ColorRes int i) {
        return a.k(getContext(), i);
    }

    private void init() {
        this.bLN = new Paint(1);
        this.bLN.setColor(fh(c.red));
        this.bLO = new Paint(1);
        this.bLO.setColor(fh(c.green));
        this.bLh = new Paint(1);
        this.bLh.setColor(fh(c.white));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = (float) getHeight();
        float width = (float) getWidth();
        float f = 0.8f * height;
        float f2 = (1.0f - this.value) * width;
        height /= 2.0f;
        float f3 = f / 2.0f;
        float f4 = height - f3;
        this.bLP.set(0.0f, f4, f2, f);
        this.bLQ.set(f2, f4, width, f);
        canvas.drawRoundRect(this.bLP, f3, f3, this.bLN);
        canvas.drawRoundRect(this.bLQ, f3, f3, this.bLO);
        canvas.drawCircle(f2, height, height, this.bLh);
    }

    public float getValue() {
        return this.value;
    }

    public void a(float f, boolean z) {
        if (this.value == f) {
            return;
        }
        if (z) {
            P(f);
            return;
        }
        this.value = f;
        postInvalidateOnAnimation();
    }

    private void P(float f) {
        if (this.Le == null) {
            this.Le = new ValueAnimator();
            this.Le.setInterpolator(j.XJ());
            this.Le.addUpdateListener(new -$$Lambda$TradersMoodBar$IariQbiIlE91bK0bMf80FbEy5hM(this));
        }
        if (this.Le.isRunning()) {
            this.Le.cancel();
        }
        this.Le.setDuration(500);
        this.Le.setFloatValues(new float[]{this.value, f});
        this.Le.start();
    }

    private /* synthetic */ void d(ValueAnimator valueAnimator) {
        a(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }
}
