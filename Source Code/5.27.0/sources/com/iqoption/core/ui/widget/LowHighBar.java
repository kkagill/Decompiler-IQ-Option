package com.iqoption.core.ui.widget;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.iqoption.core.ext.a;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.c;

public final class LowHighBar extends View {
    private ValueAnimator Le;
    private Paint bLh;
    private Paint bLi;
    private Shader bLj;
    private RectF bLk = new RectF();
    private int bLl = 663988418;
    private int bLm = 1288033251;
    private float value = 0.5f;

    public LowHighBar(Context context) {
        super(context);
        init();
    }

    public LowHighBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LowHighBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public LowHighBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bLj = new LinearGradient(0.0f, 0.0f, (float) i, 0.0f, this.bLl, this.bLm, TileMode.CLAMP);
    }

    private int fh(@ColorRes int i) {
        return a.k(getContext(), i);
    }

    private void init() {
        this.bLi = new Paint(1);
        this.bLh = new Paint(1);
        this.bLh.setColor(fh(c.white));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = (float) getHeight();
        float width = (float) getWidth();
        float f = 0.8f * height;
        float f2 = height / 2.0f;
        float f3 = (this.value * (width - height)) + f2;
        float f4 = f / 2.0f;
        this.bLk.set(0.0f, f2 - f4, width, f);
        this.bLi.setShader(this.bLj);
        canvas.drawRoundRect(this.bLk, f4, f4, this.bLi);
        canvas.drawCircle(f3, f2, f2, this.bLh);
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
            this.Le.addUpdateListener(new -$$Lambda$LowHighBar$XnPzs4b6BJBu3u4bMz0zpMS9l0s(this));
        }
        if (this.Le.isRunning()) {
            this.Le.cancel();
        }
        this.Le.setDuration(300);
        this.Le.setFloatValues(new float[]{this.value, f});
        this.Le.start();
    }

    private /* synthetic */ void d(ValueAnimator valueAnimator) {
        a(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }
}
