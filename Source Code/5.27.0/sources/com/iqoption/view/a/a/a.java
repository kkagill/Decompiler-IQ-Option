package com.iqoption.view.a.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

/* compiled from: HeightAnimator */
public class a implements AnimatorUpdateListener {
    private final WeakReference<View> bHd;
    private final WeakReference<LayoutParams> egQ;

    public a(View view) {
        this.bHd = new WeakReference(view);
        this.egQ = new WeakReference(view.getLayoutParams());
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = (View) this.bHd.get();
        LayoutParams layoutParams = (LayoutParams) this.egQ.get();
        if (view != null && layoutParams != null) {
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.requestLayout();
        }
    }
}
