package com.iqoption.view.toppanel;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$f$Rskdt-mACdtyFMvAWHJ694TXtIs implements AnimatorUpdateListener {
    private final /* synthetic */ GradientDrawable f$0;

    public /* synthetic */ -$$Lambda$f$Rskdt-mACdtyFMvAWHJ694TXtIs(GradientDrawable gradientDrawable) {
        this.f$0 = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
