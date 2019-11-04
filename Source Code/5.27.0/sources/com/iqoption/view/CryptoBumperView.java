package com.iqoption.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.iqoption.x.R;

public final class CryptoBumperView extends View {
    private static Property<CryptoBumperView, Integer> efa = new Property<CryptoBumperView, Integer>(Integer.class, "staticGradientBalance") {
        /* renamed from: c */
        public Integer get(CryptoBumperView cryptoBumperView) {
            return Integer.valueOf(cryptoBumperView.eeW.getAlpha());
        }

        /* renamed from: a */
        public void set(CryptoBumperView cryptoBumperView, Integer num) {
            cryptoBumperView.eeW.setAlpha(num.intValue());
            cryptoBumperView.aHD.setAlpha(255 - num.intValue());
            cryptoBumperView.postInvalidateOnAnimation();
        }
    };
    private float Jq;
    private Paint aHD;
    private Animator animator;
    @ColorInt
    private int color;
    @ColorInt
    private int eeU;
    @ColorInt
    private int eeV;
    private Paint eeW;
    private float eeX;
    private float eeY;
    private boolean eeZ;
    private float radius;

    public void setDrawStatic(boolean z) {
        if (this.eeZ != z) {
            this.eeZ = z;
            invalidate();
        }
    }

    public CryptoBumperView(Context context) {
        this(context, null);
    }

    public CryptoBumperView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CryptoBumperView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.eeW = new Paint(1);
        init();
    }

    @TargetApi(21)
    public CryptoBumperView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.eeW = new Paint(1);
        init();
    }

    private void init() {
        Context context = getContext();
        this.color = ContextCompat.getColor(context, R.color.green);
        this.eeU = ContextCompat.getColor(context, R.color.green_80);
        this.eeV = ContextCompat.getColor(context, R.color.green_00);
        this.Jq = getResources().getDimension(R.dimen.dp2);
        this.eeW = new Paint(1);
        this.eeW.setColor(this.color);
        this.eeW.setStyle(Style.STROKE);
        this.eeW.setStrokeWidth(this.Jq);
        this.aHD = new Paint(this.eeW);
        this.aHD.setAlpha(0);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.eeX = ((float) i) / 2.0f;
        this.eeY = ((float) i2) / 2.0f;
        this.radius = Math.min(this.eeX, this.eeY) - (this.Jq / 2.0f);
        Paint paint = this.aHD;
        float f = this.eeX;
        float f2 = this.eeY;
        r1 = new int[4];
        int i5 = this.eeV;
        r1[2] = i5;
        r1[3] = i5;
        paint.setShader(new SweepGradient(f, f2, r1, new float[]{0.0f, 0.5f, 0.75f, 1.0f}));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.eeZ) {
            canvas.drawCircle(this.eeX, this.eeY, this.radius, this.eeW);
        }
        canvas.drawCircle(this.eeX, this.eeY, this.radius, this.aHD);
    }

    public void aXX() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = ObjectAnimator.ofInt(this, efa, new int[]{0}).setDuration(500);
        this.animator.start();
    }

    public void aXY() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = ObjectAnimator.ofInt(this, efa, new int[]{255}).setDuration(500);
        this.animator.start();
    }
}
