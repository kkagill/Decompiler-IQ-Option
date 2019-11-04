package com.iqoption.charttools.constructor.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.iqoption.core.ext.c;

@SuppressLint({"ViewConstructor"})
/* compiled from: AlphaSliderView */
final class a extends View implements AnimatorListener, AnimatorUpdateListener {
    private final float aGA;
    private final float aGB;
    private final float aGC;
    private final GradientDrawable aGD;
    private final float aGE;
    private final float aGF;
    private final e aGG;
    private final float aGH;
    private final float aGI;
    private final float aGJ;
    private final float aGK;
    private final d aGL;
    private int aGM = ViewCompat.MEASURED_STATE_MASK;
    private float aGN = 1.0f;
    private float aGO = 0.0f;
    private final ValueAnimator aGP;
    private boolean aGQ;
    private a aGR;
    private final b aGS = new b();
    private final float aGz;
    private final int height;
    private final int width;

    /* compiled from: AlphaSliderView */
    interface a {
        void el(int i);
    }

    /* compiled from: AlphaSliderView */
    private class b {
        private final float aAc;
        private boolean aGT;
        private boolean aGU;
        private float aGV;
        private float aGW;
        private float aGX;
        private float aGY;
        private final RectF fd;

        private b() {
            this.fd = new RectF();
            this.aAc = (float) ViewConfiguration.get(a.this.getContext()).getScaledTouchSlop();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.aGV = motionEvent.getX();
                this.aGW = motionEvent.getY();
                if (a.this.aGN != 1.0f) {
                    z = true;
                }
                this.aGT = z;
                if (!this.aGT) {
                    if (!k(this.aGV, this.aGW)) {
                        bS(true);
                        NK();
                        I(this.aGW - NJ());
                    }
                    NK();
                }
            } else if (action == 1) {
                if (!this.aGU && k(this.aGV, this.aGW) && k(motionEvent.getX(), motionEvent.getY())) {
                    a.this.performClick();
                }
                bS(false);
            } else if (action != 2) {
                if (action == 3) {
                    bS(false);
                }
            } else if (!this.aGT) {
                float y = motionEvent.getY() - this.aGW;
                if (this.aGU) {
                    I(y);
                } else if (Math.abs(y) >= this.aAc / 4.0f) {
                    bS(true);
                    I(y);
                }
            }
        }

        private boolean k(float f, float f2) {
            this.fd.set(a.this.aGL.getBounds());
            this.fd.offset(a.this.aGH, a.this.NE());
            return this.fd.contains(f, f2);
        }

        private float NJ() {
            this.fd.set(a.this.aGL.getBounds());
            this.fd.offset(a.this.aGH, a.this.NE());
            return this.fd.centerY();
        }

        private void NK() {
            this.aGX = (-a.this.aGK) * a.this.aGO;
            this.aGY = a.this.aGK * (1.0f - a.this.aGO);
        }

        private void bS(boolean z) {
            this.aGU = z;
            a.this.getParent().requestDisallowInterceptTouchEvent(z);
        }

        private void I(float f) {
            a.this.G(c.g(f, this.aGY, this.aGX));
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    a(@NonNull Context context, int i, int i2) {
        super(context);
        this.width = i;
        this.height = i2;
        float f = (float) i;
        float f2 = f / 42.0f;
        float f3 = (float) i2;
        float f4 = f3 / 136.0f;
        float f5 = f2 * 30.0f;
        this.aGB = 30.0f * f4;
        this.aGC = 124.0f * f4;
        float f6 = 1.0f * f2;
        float f7 = 15.0f * f2;
        this.aGD = new GradientDrawable();
        this.aGD.setCornerRadius(f7);
        this.aGD.setStroke(Math.round(f6), -1);
        this.aGD.setSize(Math.round(f5), Math.round(this.aGC));
        GradientDrawable gradientDrawable = this.aGD;
        gradientDrawable.setBounds(0, 0, gradientDrawable.getIntrinsicWidth(), this.aGD.getIntrinsicHeight());
        this.aGD.setCallback(this);
        this.aGz = (f - f5) / 2.0f;
        this.aGA = (f3 - this.aGC) / 2.0f;
        f6 = 12.0f * f2;
        f5 = 106.0f * f4;
        this.aGG = new e(Math.round(f6), Math.round(f6), Math.round(f5), 6.0f * f2);
        e eVar = this.aGG;
        eVar.setBounds(0, 0, eVar.getIntrinsicWidth(), this.aGG.getIntrinsicHeight());
        this.aGG.setCallback(this);
        this.aGE = (f - f6) / 2.0f;
        this.aGF = (f3 - f5) / 2.0f;
        f6 = 16.0f * f2;
        this.aGL = new d(Math.round(f6), f2 * 2.0f, -1);
        d dVar = this.aGL;
        dVar.setBounds(0, 0, dVar.getIntrinsicWidth(), this.aGL.getIntrinsicHeight());
        this.aGL.setCallback(this);
        this.aGH = (f - f6) / 2.0f;
        this.aGI = 13.0f * f4;
        this.aGJ = 107.0f * f4;
        this.aGK = f4 * 94.0f;
        this.aGP = new ValueAnimator();
        this.aGP.setDuration(200);
        this.aGP.addListener(this);
        this.aGP.addUpdateListener(this);
        NF();
        NG();
        NH();
        NI();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        k(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }

    public void onAnimationStart(Animator animator) {
        this.aGQ = false;
    }

    public void onAnimationCancel(Animator animator) {
        this.aGQ = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.aGQ) {
            NC();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar) {
        this.aGR = aVar;
    }

    private void NC() {
        a aVar = this.aGR;
        if (aVar != null) {
            aVar.el(ND());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ND() {
        return this.aGM;
    }

    private float NE() {
        float f = this.aGJ;
        float f2 = this.aGI;
        return (((f - f2) * this.aGO) * this.aGN) + f2;
    }

    /* Access modifiers changed, original: 0000 */
    public void en(int i) {
        if (this.aGM != i) {
            if (this.aGP.isRunning()) {
                this.aGP.cancel();
            }
            this.aGP.setIntValues(new int[]{this.aGM, i});
            this.aGP.setEvaluator(com.iqoption.core.graphics.animation.a.XC());
            this.aGP.start();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void G(float f) {
        int M = com.iqoption.core.ext.a.M((1.0f - f) * 255.0f);
        int i = this.aGM;
        if (M != (i >>> 24)) {
            k((M << 24) | (i & ViewCompat.MEASURED_SIZE_MASK), true);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void k(int i, boolean z) {
        int i2 = this.aGM;
        if (i2 != i) {
            i2 >>>= 24;
            int i3 = i >>> 24;
            int i4 = ViewCompat.MEASURED_SIZE_MASK & i;
            Object obj = (this.aGM & ViewCompat.MEASURED_SIZE_MASK) != i4 ? 1 : null;
            this.aGM = i;
            this.aGO = 1.0f - (((float) i3) / 255.0f);
            if (obj != null) {
                this.aGG.setColor(i4);
            }
            if (z) {
                NC();
            }
            NH();
            NI();
            invalidate();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void H(float f) {
        if (this.aGN != f) {
            this.aGN = f;
            NF();
            NG();
            NI();
            invalidate();
        }
    }

    private void NF() {
        Rect bounds = this.aGD.getBounds();
        float f = this.aGB;
        this.aGD.setBounds(bounds.left, bounds.top, bounds.right, Math.round(f + ((this.aGC - f) * this.aGN)));
    }

    private void NG() {
        this.aGG.setFraction(this.aGN);
    }

    private void NH() {
        this.aGG.setOffset((this.aGJ - this.aGI) * this.aGO);
    }

    private void NI() {
        this.aGL.setAlpha(Math.round(this.aGN * 255.0f));
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(Math.round((float) this.width), Math.round((float) this.height));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.aGz, this.aGA);
        this.aGD.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.aGE, this.aGF);
        this.aGG.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.aGH, NE());
        this.aGL.draw(canvas);
        canvas.restore();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.aGS.a(motionEvent);
        return true;
    }
}
