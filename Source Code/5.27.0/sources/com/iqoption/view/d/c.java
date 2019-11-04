package com.iqoption.view.d;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: OnTouchAlphaAndScaleEffect */
public class c implements OnTouchListener {
    private float ejj = 0.95f;
    private float mAlpha = 0.5f;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().alpha(this.mAlpha).scaleX(this.ejj).scaleY(this.ejj).setInterpolator(com.iqoption.view.a.a.c.egR).setDuration(150).start();
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(com.iqoption.view.a.a.c.egR).setDuration(300).start();
        }
        return false;
    }
}
