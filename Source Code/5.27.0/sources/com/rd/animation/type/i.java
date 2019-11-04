package com.rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.h;
import java.util.Iterator;

/* compiled from: WormAnimation */
public class i extends a<AnimatorSet> {
    int eIg;
    int eIh;
    boolean eIn;
    int eIo;
    int eIp;
    private h eIq = new h();
    int radius;

    /* compiled from: WormAnimation */
    class a {
        final int eIu;
        final int eIv;
        final int fromX;
        final int toX;

        a(int i, int i2, int i3, int i4) {
            this.fromX = i;
            this.toX = i2;
            this.eIu = i3;
            this.eIv = i4;
        }
    }

    public i(@NonNull com.rd.animation.a.b.a aVar) {
        super(aVar);
    }

    @NonNull
    /* renamed from: bhQ */
    public AnimatorSet aYl() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: cM */
    public i cJ(long j) {
        super.cJ(j);
        return this;
    }

    public i a(int i, int i2, int i3, boolean z) {
        if (b(i, i2, i3, z)) {
            this.animator = aYl();
            this.eIg = i;
            this.eIh = i2;
            this.radius = i3;
            this.eIn = z;
            this.eIo = i - i3;
            this.eIp = i + i3;
            this.eIq.iQ(this.eIo);
            this.eIq.iR(this.eIp);
            a ge = ge(z);
            long j = this.eHN / 2;
            ValueAnimator a = a(ge.fromX, ge.toX, j, false, this.eIq);
            ValueAnimator a2 = a(ge.eIu, ge.eIv, j, true, this.eIq);
            ((AnimatorSet) this.animator).playSequentially(new Animator[]{a, a2});
        }
        return this;
    }

    /* renamed from: as */
    public i am(float f) {
        if (this.animator == null) {
            return this;
        }
        long j = (long) (f * ((float) this.eHN));
        Iterator it = ((AnimatorSet) this.animator).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) ((Animator) it.next());
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public ValueAnimator a(int i, int i2, long j, final boolean z, final h hVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                i.this.a(hVar, valueAnimator, z);
            }
        });
        return ofInt;
    }

    private void a(@NonNull h hVar, @NonNull ValueAnimator valueAnimator, boolean z) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.eIn) {
            if (z) {
                hVar.iQ(intValue);
            } else {
                hVar.iR(intValue);
            }
        } else if (z) {
            hVar.iR(intValue);
        } else {
            hVar.iQ(intValue);
        }
        if (this.eHq != null) {
            this.eHq.a(hVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(int i, int i2, int i3, boolean z) {
        if (this.eIg == i && this.eIh == i2 && this.radius == i3 && this.eIn == z) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public a ge(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            i = this.eIg;
            i5 = this.radius;
            i2 = i + i5;
            i3 = this.eIh;
            i4 = i3 + i5;
            i -= i5;
            i3 -= i5;
        } else {
            i = this.eIg;
            i5 = this.radius;
            i2 = i - i5;
            i3 = this.eIh;
            i4 = i3 - i5;
            i += i5;
            i3 += i5;
        }
        return new a(i2, i4, i, i3);
    }
}
