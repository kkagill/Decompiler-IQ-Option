package com.iqoption.bottomsheet;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$e$UltgCT1_tAUGCql4Hd2SRUvOA24 implements AnimatorUpdateListener {
    private final /* synthetic */ IQBottomSheetBehavior f$0;
    private final /* synthetic */ View f$1;

    public /* synthetic */ -$$Lambda$e$UltgCT1_tAUGCql4Hd2SRUvOA24(IQBottomSheetBehavior iQBottomSheetBehavior, View view) {
        this.f$0 = iQBottomSheetBehavior;
        this.f$1 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.c(this.f$1, ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.f$1.getTop());
    }
}
