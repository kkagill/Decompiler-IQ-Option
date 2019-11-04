package com.iqoption.core.graphics.a.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import com.iqoption.core.graphics.a.a.c.a;
import com.iqoption.core.graphics.animation.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/graphics/drawable/stateanimator/DrawableColorController;", "Lcom/iqoption/core/graphics/drawable/stateanimator/StateControlDrawable$Controller;", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "colors", "", "durations", "", "interpolators", "", "Landroid/animation/TimeInterpolator;", "(Landroid/graphics/drawable/GradientDrawable;[I[J[Landroid/animation/TimeInterpolator;)V", "animators", "Landroid/animation/ValueAnimator;", "[Landroid/animation/ValueAnimator;", "[Landroid/animation/TimeInterpolator;", "running", "Landroid/animation/Animator;", "animate", "", "fromSpecIndex", "", "toSpecIndex", "init", "specIndex", "core_release"})
/* compiled from: DrawableColorController.kt */
public final class b implements a {
    private Animator ajN;
    private final ValueAnimator[] biC;
    private final GradientDrawable biD;
    private final long[] biE;
    private final TimeInterpolator[] biF;
    private final int[] hR;

    public b(GradientDrawable gradientDrawable, int[] iArr, long[] jArr, TimeInterpolator[] timeInterpolatorArr) {
        kotlin.jvm.internal.i.f(gradientDrawable, "drawable");
        kotlin.jvm.internal.i.f(iArr, "colors");
        kotlin.jvm.internal.i.f(jArr, "durations");
        kotlin.jvm.internal.i.f(timeInterpolatorArr, "interpolators");
        this.biD = gradientDrawable;
        this.hR = iArr;
        this.biE = jArr;
        this.biF = timeInterpolatorArr;
        ValueAnimator[] valueAnimatorArr = new ValueAnimator[this.hR.length];
        int length = valueAnimatorArr.length;
        for (int i = 0; i < length; i++) {
            valueAnimatorArr[i] = null;
        }
        this.biC = valueAnimatorArr;
    }

    public void init(int i) {
        c.bhK.XD().set(this.biD, Integer.valueOf(this.hR[i]));
    }

    public void ak(int i, int i2) {
        Animator animator = this.ajN;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimator = this.biC[i2];
        if (valueAnimator == null) {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setTarget(this.biD);
            objectAnimator.setProperty(c.bhK.XD());
            objectAnimator.setInterpolator(this.biF[i2]);
            objectAnimator.setDuration(this.biE[i2]);
            valueAnimator = objectAnimator;
            this.biC[i2] = valueAnimator;
        }
        this.ajN = valueAnimator;
        r1 = new int[2];
        int[] iArr = this.hR;
        r1[0] = iArr[i];
        r1[1] = iArr[i2];
        valueAnimator.setIntValues(r1);
        valueAnimator.setEvaluator(com.iqoption.core.graphics.animation.a.bhF.XC());
        valueAnimator.start();
    }
}
