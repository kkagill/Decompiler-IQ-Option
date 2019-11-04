package com.iqoption.view.a.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.ref.WeakReference;

/* compiled from: TopMarginAnimator */
public class d implements AnimatorUpdateListener {
    private final WeakReference<View> bHd;
    private final WeakReference<MarginLayoutParams> egQ;

    public d(View view) {
        this.bHd = new WeakReference(view);
        this.egQ = new WeakReference((MarginLayoutParams) view.getLayoutParams());
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = (View) this.bHd.get();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.egQ.get();
        if (view != null && marginLayoutParams != null) {
            marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.requestLayout();
        }
    }
}
