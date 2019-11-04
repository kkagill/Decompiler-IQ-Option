package com.rd.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;
import com.rd.animation.b.a.f;

/* compiled from: SwapAnimation */
public class g extends a<ValueAnimator> {
    private int eIg = -1;
    private int eIh = -1;
    private f eIj = new f();

    public g(@NonNull a aVar) {
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
                g.this.i(valueAnimator);
            }
        });
        return valueAnimator;
    }

    /* renamed from: aq */
    public g am(float f) {
        if (this.animator != null) {
            long j = (long) (f * ((float) this.eHN));
            if (((ValueAnimator) this.animator).getValues() != null && ((ValueAnimator) this.animator).getValues().length > 0) {
                ((ValueAnimator) this.animator).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @NonNull
    public g aP(int i, int i2) {
        if (this.animator != null && aN(i, i2)) {
            this.eIg = i;
            this.eIh = i2;
            PropertyValuesHolder g = g("ANIMATION_COORDINATE", i, i2);
            PropertyValuesHolder g2 = g("ANIMATION_COORDINATE_REVERSE", i2, i);
            ((ValueAnimator) this.animator).setValues(new PropertyValuesHolder[]{g, g2});
        }
        return this;
    }

    private PropertyValuesHolder g(String str, int i, int i2) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.eIj.iO(intValue);
        this.eIj.iP(intValue2);
        if (this.eHq != null) {
            this.eHq.a(this.eIj);
        }
    }

    private boolean aN(int i, int i2) {
        if (this.eIg == i && this.eIh == i2) {
            return false;
        }
        return true;
    }
}
