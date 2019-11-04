package com.iqoption.core.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$LowHighBar$XnPzs4b6BJBu3u4bMz0zpMS9l0s implements AnimatorUpdateListener {
    private final /* synthetic */ LowHighBar f$0;

    public /* synthetic */ -$$Lambda$LowHighBar$XnPzs4b6BJBu3u4bMz0zpMS9l0s(LowHighBar lowHighBar) {
        this.f$0 = lowHighBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.d(valueAnimator);
    }
}
