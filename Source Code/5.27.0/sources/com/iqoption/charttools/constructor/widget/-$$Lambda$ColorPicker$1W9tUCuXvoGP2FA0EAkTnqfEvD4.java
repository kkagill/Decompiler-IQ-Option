package com.iqoption.charttools.constructor.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4 implements AnimatorUpdateListener {
    private final /* synthetic */ ColorPicker f$0;

    public /* synthetic */ -$$Lambda$ColorPicker$1W9tUCuXvoGP2FA0EAkTnqfEvD4(ColorPicker colorPicker) {
        this.f$0 = colorPicker;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.c(valueAnimator);
    }
}
