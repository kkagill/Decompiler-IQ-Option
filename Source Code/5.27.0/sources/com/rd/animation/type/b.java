package com.rd.animation.type;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.b.a.a;

/* compiled from: ColorAnimation */
public class b extends a<ValueAnimator> {
    private a eHO = new a();
    int eHP;
    int eHQ;

    public b(@Nullable com.rd.animation.a.b.a aVar) {
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
                b.this.i(valueAnimator);
            }
        });
        return valueAnimator;
    }

    /* renamed from: an */
    public b am(float f) {
        if (this.animator != null) {
            long j = (long) (f * ((float) this.eHN));
            if (((ValueAnimator) this.animator).getValues() != null && ((ValueAnimator) this.animator).getValues().length > 0) {
                ((ValueAnimator) this.animator).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @NonNull
    public b aM(int i, int i2) {
        if (this.animator != null && aN(i, i2)) {
            this.eHP = i;
            this.eHQ = i2;
            PropertyValuesHolder ga = ga(false);
            PropertyValuesHolder ga2 = ga(true);
            ((ValueAnimator) this.animator).setValues(new PropertyValuesHolder[]{ga, ga2});
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public PropertyValuesHolder ga(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.eHQ;
            i2 = this.eHP;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.eHP;
            i2 = this.eHQ;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    private boolean aN(int i, int i2) {
        if (this.eHP == i && this.eHQ == i2) {
            return false;
        }
        return true;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.eHO.setColor(intValue);
        this.eHO.iK(intValue2);
        if (this.eHq != null) {
            this.eHq.a(this.eHO);
        }
    }
}
