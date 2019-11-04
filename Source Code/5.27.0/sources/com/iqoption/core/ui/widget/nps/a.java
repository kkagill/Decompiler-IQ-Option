package com.iqoption.core.ui.widget.nps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.d;

/* compiled from: NpsThumbDrawable */
final class a extends Drawable implements AnimatorUpdateListener {
    private static final int bOT = d.dp36;
    private static final int bOU = d.dp28;
    private static final int bOV = d.dp8;
    private static final int[] bOW = new int[]{16842919};
    private ValueAnimator Le;
    private float aHn;
    private final int bOX;
    private final int bOY;
    private float bOZ;
    private float bPa;
    private float bPb;
    private boolean bPc;
    private boolean bPd;
    private final Paint fh = new Paint(1);

    public boolean isStateful() {
        return true;
    }

    a(int i, int i2) {
        this.bOX = i;
        this.bOY = i2;
        this.bOZ = fo(bOT);
        this.bPa = fo(bOU);
        this.bPb = fo(bOV);
    }

    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            float f = this.bOZ;
            float f2 = this.bPa;
            float f3 = ((f - f2) * this.aHn) + f2;
            f /= 2.0f;
            this.fh.setColor(this.bOX);
            canvas.drawCircle(f, f, f3 / 2.0f, this.fh);
            this.fh.setColor(this.bOY);
            canvas.drawCircle(f, f, this.bPb / 2.0f, this.fh);
            canvas.restore();
        }
    }

    public void setAlpha(int i) {
        this.fh.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.fh.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        int alpha = this.fh.getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        } else {
            return -2;
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        boolean stateSetMatches = StateSet.stateSetMatches(bOW, iArr);
        if (this.bPc == stateSetMatches) {
            return super.onStateChange(iArr);
        }
        this.bPc = stateSetMatches;
        amT();
        return true;
    }

    private void amT() {
        ValueAnimator NM = NM();
        if (NM.isRunning()) {
            NM.cancel();
        }
        if (this.bPc) {
            if (this.aHn != 1.0f) {
                NM.setFloatValues(new float[]{this.aHn, 1.0f});
                NM.setDuration((long) ((1.0f - this.aHn) * 250.0f));
            } else {
                return;
            }
        }
        if (this.aHn != 0.0f) {
            NM.setFloatValues(new float[]{this.aHn, 0.0f});
            NM.setDuration((long) (this.aHn * 250.0f));
        } else {
            return;
        }
        NM.start();
    }

    @NonNull
    private ValueAnimator NM() {
        if (this.Le == null) {
            this.Le = new ValueAnimator();
            this.Le.setInterpolator(j.XJ());
            this.Le.addUpdateListener(this);
        }
        return this.Le;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.Le.end();
        }
    }

    public int getIntrinsicWidth() {
        return (int) this.bOZ;
    }

    public int getIntrinsicHeight() {
        return (int) this.bOZ;
    }

    public int getMinimumWidth() {
        return (int) this.bPa;
    }

    public int getMinimumHeight() {
        return (int) this.bPa;
    }

    private float fo(@DimenRes int i) {
        return com.iqoption.core.ext.a.l(com.iqoption.core.d.Uo(), i);
    }

    public void bk(long j) {
        final ValueAnimator NM = NM();
        if (!NM.isRunning()) {
            NM.setFloatValues(new float[]{this.aHn, 1.0f, 0.0f, 1.0f, 0.0f});
            NM.setInterpolator(j.XN());
            NM.setDuration(j);
            NM.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    a.this.bPd = true;
                }

                public void onAnimationEnd(Animator animator) {
                    NM.setInterpolator(j.XJ());
                    a.this.bPd = false;
                }
            });
            NM.start();
        }
    }

    public void amU() {
        if (this.bPd) {
            NM().cancel();
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.aHn = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateSelf();
    }
}
