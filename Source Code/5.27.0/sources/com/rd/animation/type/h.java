package com.rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;
import com.rd.animation.b.a.g;

/* compiled from: ThinWormAnimation */
public class h extends i {
    private g eIl = new g();

    public h(@NonNull a aVar) {
        super(aVar);
    }

    /* renamed from: cL */
    public h cM(long j) {
        super.cJ(j);
        return this;
    }

    public i a(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (b(i, i2, i3, z)) {
            this.animator = aYl();
            this.eIg = i4;
            this.eIh = i2;
            this.radius = i5;
            this.eIn = z2;
            int i6 = i5 * 2;
            this.eIo = i4 - i5;
            this.eIp = i4 + i5;
            this.eIl.iQ(this.eIo);
            this.eIl.iR(this.eIp);
            this.eIl.setHeight(i6);
            a ge = ge(z2);
            double d = (double) this.eHN;
            Double.isNaN(d);
            long j = (long) (d * 0.8d);
            d = (double) this.eHN;
            Double.isNaN(d);
            long j2 = (long) (d * 0.2d);
            d = (double) this.eHN;
            Double.isNaN(d);
            long j3 = (long) (d * 0.5d);
            d = (double) this.eHN;
            Double.isNaN(d);
            long j4 = (long) (d * 0.5d);
            long j5 = j4;
            j4 = j;
            i2 = i6;
            long j6 = j3;
            ValueAnimator a = a(ge.fromX, ge.toX, j4, false, this.eIl);
            a(ge.eIu, ge.eIv, j4, true, this.eIl).setStartDelay(j2);
            int i7 = i2;
            int i8 = i3;
            j4 = j6;
            ValueAnimator a2 = a(i7, i8, j4);
            a(i8, i7, j4).setStartDelay(j5);
            ((AnimatorSet) this.animator).playTogether(new Animator[]{a, r0, a2, r1});
        }
        return this;
    }

    private ValueAnimator a(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.i(valueAnimator);
            }
        });
        return ofInt;
    }

    private void i(@NonNull ValueAnimator valueAnimator) {
        this.eIl.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        if (this.eHq != null) {
            this.eHq.a(this.eIl);
        }
    }

    /* renamed from: ar */
    public h as(float f) {
        if (this.animator != null) {
            long j = (long) (f * ((float) this.eHN));
            int size = ((AnimatorSet) this.animator).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.animator).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
