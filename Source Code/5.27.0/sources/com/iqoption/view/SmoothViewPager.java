package com.iqoption.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.iqoption.view.a.a.c;
import java.lang.reflect.Field;

public class SmoothViewPager extends ViewPager {
    private boolean egj;

    public class a extends Scroller {
        public a(Context context) {
            super(context, SmoothViewPager.this.getInterpolator());
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, SmoothViewPager.this.getDuration());
        }
    }

    /* Access modifiers changed, original: protected */
    public int getDuration() {
        return 300;
    }

    public SmoothViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aYq();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.SmoothViewPager);
        try {
            this.egj = obtainStyledAttributes.getBoolean(0, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.egj && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.egj && super.onTouchEvent(motionEvent);
    }

    private void aYq() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new a(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSwipeable(boolean z) {
        this.egj = z;
    }

    /* Access modifiers changed, original: protected */
    public Interpolator getInterpolator() {
        return c.egR;
    }
}
