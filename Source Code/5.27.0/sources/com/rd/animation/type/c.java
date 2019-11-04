package com.rd.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;

/* compiled from: FillAnimation */
public class c extends b {
    private int eHH;
    private com.rd.animation.b.a.c eIa = new com.rd.animation.b.a.c();
    private int radius;

    public c(@NonNull a aVar) {
        super(aVar);
    }

    @NonNull
    /* renamed from: bhP */
    public ValueAnimator aYl() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.this.i(valueAnimator);
            }
        });
        return valueAnimator;
    }

    @NonNull
    public c j(int i, int i2, int i3, int i4) {
        if (this.animator != null && k(i, i2, i3, i4)) {
            this.eHP = i;
            this.eHQ = i2;
            this.radius = i3;
            this.eHH = i4;
            PropertyValuesHolder ga = ga(false);
            PropertyValuesHolder ga2 = ga(true);
            PropertyValuesHolder gb = gb(false);
            PropertyValuesHolder gb2 = gb(true);
            PropertyValuesHolder gc = gc(false);
            PropertyValuesHolder gc2 = gc(true);
            ((ValueAnimator) this.animator).setValues(new PropertyValuesHolder[]{ga, ga2, gb, gb2, gc, gc2});
        }
        return this;
    }

    @NonNull
    private PropertyValuesHolder gb(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.radius;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.radius;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @NonNull
    private PropertyValuesHolder gc(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.radius;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.radius;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.eIa.setColor(intValue);
        this.eIa.iK(intValue2);
        this.eIa.setRadius(intValue3);
        this.eIa.iL(intValue4);
        this.eIa.iM(intValue5);
        this.eIa.iN(intValue6);
        if (this.eHq != null) {
            this.eHq.a(this.eIa);
        }
    }

    private boolean k(int i, int i2, int i3, int i4) {
        if (this.eHP == i && this.eHQ == i2 && this.radius == i3 && this.eHH == i4) {
            return false;
        }
        return true;
    }
}
