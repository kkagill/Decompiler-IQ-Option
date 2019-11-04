package com.rd.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;

/* compiled from: ScaleAnimation */
public class d extends b {
    float eIc;
    private com.rd.animation.b.a.d eId = new com.rd.animation.b.a.d();
    int radius;

    public d(@NonNull a aVar) {
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
                d.this.i(valueAnimator);
            }
        });
        return valueAnimator;
    }

    @NonNull
    public d a(int i, int i2, int i3, float f) {
        if (this.animator != null && b(i, i2, i3, f)) {
            this.eHP = i;
            this.eHQ = i2;
            this.radius = i3;
            this.eIc = f;
            PropertyValuesHolder ga = ga(false);
            PropertyValuesHolder ga2 = ga(true);
            PropertyValuesHolder gd = gd(false);
            PropertyValuesHolder gd2 = gd(true);
            ((ValueAnimator) this.animator).setValues(new PropertyValuesHolder[]{ga, ga2, gd, gd2});
        }
        return this;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.eId.setColor(intValue);
        this.eId.iK(intValue2);
        this.eId.setRadius(intValue3);
        this.eId.iL(intValue4);
        if (this.eHq != null) {
            this.eHq.a(this.eId);
        }
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public PropertyValuesHolder gd(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.radius;
            i2 = (int) (((float) i) * this.eIc);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.radius;
            i = (int) (((float) i2) * this.eIc);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean b(int i, int i2, int i3, float f) {
        if (this.eHP == i && this.eHQ == i2 && this.radius == i3 && this.eIc == f) {
            return false;
        }
        return true;
    }
}
