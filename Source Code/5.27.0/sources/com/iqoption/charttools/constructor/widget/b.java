package com.iqoption.charttools.constructor.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.core.graphics.animation.j;

/* compiled from: ColorPresetDrawable */
final class b extends Drawable implements AnimatorUpdateListener {
    private static final int[] aHk = new int[]{16842913};
    private ValueAnimator Le;
    private final float aHl;
    private final float aHm;
    private float aHn;
    private int color;
    private final Paint fh = new Paint(1);
    private boolean isSelected;

    public int getOpacity() {
        return -1;
    }

    public boolean isStateful() {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    b(float f, float f2, float f3) {
        this.aHl = f;
        this.aHm = f2;
        this.fh.setStrokeWidth(f3);
    }

    public void draw(@NonNull Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        float centerX = (float) bounds.centerX();
        float centerY = (float) bounds.centerY();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        float f2 = this.aHn;
        if (f2 != 0.0f) {
            f = this.aHl;
            float f3 = this.aHm;
            f = ((((f - f3) * f2) + f3) - this.fh.getStrokeWidth()) / 2.0f;
            this.fh.setStyle(Style.STROKE);
            this.fh.setColor(-1);
            canvas.drawCircle(centerX, centerY, f, this.fh);
        }
        this.fh.setStyle(Style.FILL);
        this.fh.setColor(this.color);
        f2 = this.aHl;
        f = this.aHm;
        canvas.drawCircle(centerX, centerY, (((f2 - f) * (1.0f - this.aHn)) + f) / 2.0f, this.fh);
        canvas.restore();
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        boolean stateSetMatches = StateSet.stateSetMatches(aHk, iArr);
        if (this.isSelected == stateSetMatches) {
            return super.onStateChange(iArr);
        }
        this.isSelected = stateSetMatches;
        ValueAnimator NM = NM();
        NM.cancel();
        if (this.isSelected) {
            NM.setFloatValues(new float[]{this.aHn, 1.0f});
            NM.setDuration((long) ((1.0f - this.aHn) * 250.0f));
        } else {
            NM.setFloatValues(new float[]{this.aHn, 0.0f});
            NM.setDuration((long) (this.aHn * 250.0f));
        }
        NM.start();
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        NM().end();
    }

    private ValueAnimator NM() {
        if (this.Le == null) {
            this.Le = new ValueAnimator();
            this.Le.addUpdateListener(this);
            this.Le.setInterpolator(j.XJ());
            ValueAnimator valueAnimator = this.Le;
            r1 = new float[2];
            float f = this.aHn;
            r1[0] = f;
            r1[1] = f;
            valueAnimator.setFloatValues(r1);
            this.Le.setDuration(0);
        }
        return this.Le;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.aHn = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateSelf();
    }

    public void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidateSelf();
        }
    }
}
