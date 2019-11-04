package com.iqoption.core.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TradersMoodBar$IariQbiIlE91bK0bMf80FbEy5hM implements AnimatorUpdateListener {
    private final /* synthetic */ TradersMoodBar f$0;

    public /* synthetic */ -$$Lambda$TradersMoodBar$IariQbiIlE91bK0bMf80FbEy5hM(TradersMoodBar tradersMoodBar) {
        this.f$0 = tradersMoodBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.d(valueAnimator);
    }
}
