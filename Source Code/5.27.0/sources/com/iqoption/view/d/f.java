package com.iqoption.view.d;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.iqoption.view.a.a.c;

/* compiled from: OnTouchScaleEffect */
public class f implements OnTouchListener {
    private float dM = 0.95f;

    public f(float f) {
        this.dM = f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(this.dM).scaleY(this.dM).setDuration(300).setInterpolator(c.egR).start();
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(c.egR).start();
        }
        return false;
    }
}
