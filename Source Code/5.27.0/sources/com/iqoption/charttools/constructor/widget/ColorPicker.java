package com.iqoption.charttools.constructor.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.iqoption.charttools.model.indicator.i;
import com.iqoption.charttools.n.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.graphics.animation.j;

public final class ColorPicker extends ViewGroup {
    private final ValueAnimator Le = new ValueAnimator();
    private float aGN = 0.0f;
    private a aHa;
    private c aHb;
    private Paint aHc = new Paint();
    private float aHd;
    private float aHe;
    private float aHf;
    private float aHg;
    private c aHh;
    private b aHi;

    public interface b {
        void el(int i);
    }

    public interface c {
        void Ny();
    }

    private class a extends g implements a, a {
        private a() {
        }

        /* synthetic */ a(ColorPicker colorPicker, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void el(int i) {
            if (ColorPicker.this.aHi != null) {
                ColorPicker.this.aHi.el(i);
                if ((i >>> 24) == 255) {
                    ColorPicker.this.aHb.setSelected(i);
                } else {
                    ColorPicker.this.aHb.setSelected(0);
                }
            }
        }

        public void eo(int i) {
            ColorPicker.this.aHa.en(i);
            ColorPicker.this.aHb.setSelected(i);
        }

        public void M(View view) {
            if (ColorPicker.this.aHh != null) {
                ColorPicker.this.aHh.Ny();
            }
        }
    }

    public ColorPicker(Context context) {
        super(context);
        this.Le.setFloatValues(new float[]{1.0f, 0.0f});
        this.Le.setDuration(250);
        this.Le.setInterpolator(j.XJ());
        this.Le.addUpdateListener(new -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4(this));
        this.Le.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                ColorPicker.this.aHb.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                if (ColorPicker.this.aGN == 0.0f) {
                    ColorPicker.this.aHb.setVisibility(4);
                }
            }
        });
        init();
    }

    public ColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Le.setFloatValues(new float[]{1.0f, 0.0f});
        this.Le.setDuration(250);
        this.Le.setInterpolator(j.XJ());
        this.Le.addUpdateListener(new -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4(this));
        this.Le.addListener(/* anonymous class already generated */);
        init();
    }

    public ColorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Le.setFloatValues(new float[]{1.0f, 0.0f});
        this.Le.setDuration(250);
        this.Le.setInterpolator(j.XJ());
        this.Le.addUpdateListener(new -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4(this));
        this.Le.addListener(/* anonymous class already generated */);
        init();
    }

    @TargetApi(21)
    public ColorPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Le.setFloatValues(new float[]{1.0f, 0.0f});
        this.Le.setDuration(250);
        this.Le.setInterpolator(j.XJ());
        this.Le.addUpdateListener(new -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4(this));
        this.Le.addListener(/* anonymous class already generated */);
        init();
    }

    private void init() {
        a aVar = new a(this, null);
        int m = com.iqoption.core.ext.a.m(getContext(), d.dp42);
        int m2 = com.iqoption.core.ext.a.m(getContext(), d.dp136);
        this.aHb = new c(getContext(), i.aIZ);
        this.aHb.a((a) aVar);
        this.aHb.setAlpha(this.aGN);
        if (this.aGN == 0.0f) {
            this.aHb.setVisibility(4);
        }
        addView(this.aHb);
        this.aHa = new a(getContext(), m, m2);
        this.aHa.setOnClickListener(aVar);
        this.aHa.a(aVar);
        addView(this.aHa);
        this.aHc.setColor(-15262159);
        this.aHd = com.iqoption.core.ext.a.l(getContext(), d.separator);
        this.aHf = com.iqoption.core.ext.a.l(getContext(), d.dp10);
        this.aHg = com.iqoption.core.ext.a.l(getContext(), d.dp11);
        setWillNotDraw(false);
    }

    private int getExpandedHeight() {
        int measuredHeight = this.aHb.getMeasuredHeight();
        int lineHeight = this.aHb.getLineHeight();
        return Math.round(((float) lineHeight) + (((float) (measuredHeight - lineHeight)) * this.aGN));
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.aHb.getMeasuredWidth() == 0) {
            this.aHb.measure(0, 0);
        }
        if (this.aHa.getMeasuredWidth() == 0) {
            this.aHa.measure(0, 0);
        }
        i = (this.aHa.getMeasuredWidth() + this.aHb.getMeasuredWidth()) + com.iqoption.core.ext.a.M((this.aHf * 2.0f) + this.aHd);
        i2 = getExpandedHeight();
        this.aHe = ((float) i2) - (this.aHg * 2.0f);
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.aHb.getMeasuredWidth();
        this.aHb.layout(0, 0, measuredWidth, i4);
        measuredWidth += com.iqoption.core.ext.a.M((this.aHf * 2.0f) + this.aHd);
        a aVar = this.aHa;
        aVar.layout(measuredWidth, 0, aVar.getMeasuredWidth() + measuredWidth, this.aHa.getMeasuredHeight());
        this.aHa.H(this.aGN);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.aGN > 0.0f) {
            canvas.save();
            canvas.translate(((float) this.aHb.getWidth()) + this.aHf, this.aHg);
            this.aHc.setAlpha(com.iqoption.core.ext.a.M(this.aGN * 255.0f));
            canvas.drawRect(0.0f, 0.0f, this.aHd, this.aHe, this.aHc);
            canvas.restore();
        }
    }

    public void setOnColorChangeListener(b bVar) {
        this.aHi = bVar;
    }

    public void setOnSliderClickListener(c cVar) {
        this.aHh = cVar;
    }

    public void setColor(int i) {
        this.aHa.k(i, false);
        this.aHb.setSelected(i);
    }

    public void toggle() {
        if (this.aGN == 0.0f) {
            this.Le.reverse();
        } else {
            this.Le.start();
        }
    }

    public void setExpanded(boolean z) {
        if (nq() != z) {
            this.aGN = z ? 1.0f : 0.0f;
            if (z) {
                this.aHb.setAlpha(1.0f);
                this.aHb.setVisibility(0);
            } else {
                this.aHb.setAlpha(0.0f);
                this.aHb.setVisibility(4);
            }
            requestLayout();
        }
    }

    public boolean nq() {
        return this.aGN == 1.0f;
    }

    public boolean NL() {
        return this.Le.isRunning();
    }

    public boolean hasFocusable() {
        return super.hasFocusable();
    }
}
