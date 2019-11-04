package com.iqoption.view.d;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: OnTouchDecorator */
public abstract class e implements OnTouchListener {
    private OnTouchListener ejk;

    public abstract boolean d(View view, MotionEvent motionEvent);

    public e(OnTouchListener onTouchListener) {
        this.ejk = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OnTouchListener onTouchListener = this.ejk;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        return d(view, motionEvent);
    }
}
