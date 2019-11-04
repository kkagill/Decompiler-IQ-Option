package com.iqoption.core.ui.transition;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TextScaleResize$-gfDLUQjpQ-KLFZpJ2cyMu5mxks implements AnimatorUpdateListener {
    private final /* synthetic */ TextView f$0;

    public /* synthetic */ -$$Lambda$TextScaleResize$-gfDLUQjpQ-KLFZpJ2cyMu5mxks(TextView textView) {
        this.f$0 = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextScaleResize.a(this.f$0, valueAnimator);
    }
}
