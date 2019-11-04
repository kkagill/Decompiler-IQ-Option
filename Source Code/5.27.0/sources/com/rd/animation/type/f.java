package com.rd.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;
import com.rd.animation.b.a.e;

/* compiled from: SlideAnimation */
public class f extends a<ValueAnimator> {
    private e eIf = new e();
    private int eIg = -1;
    private int eIh = -1;

    public f(@NonNull a aVar) {
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
                f.this.i(valueAnimator);
            }
        });
        return valueAnimator;
    }

    /* renamed from: ap */
    public f am(float f) {
        if (this.animator != null) {
            long j = (long) (f * ((float) this.eHN));
            if (((ValueAnimator) this.animator).getValues() != null && ((ValueAnimator) this.animator).getValues().length > 0) {
                ((ValueAnimator) this.animator).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @NonNull
    public f aO(int i, int i2) {
        if (this.animator != null && aN(i, i2)) {
            this.eIg = i;
            this.eIh = i2;
            PropertyValuesHolder bhR = bhR();
            ((ValueAnimator) this.animator).setValues(new PropertyValuesHolder[]{bhR});
        }
        return this;
    }

    private PropertyValuesHolder bhR() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.eIg, this.eIh});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        this.eIf.iO(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        if (this.eHq != null) {
            this.eHq.a(this.eIf);
        }
    }

    private boolean aN(int i, int i2) {
        if (this.eIg == i && this.eIh == i2) {
            return false;
        }
        return true;
    }
}
