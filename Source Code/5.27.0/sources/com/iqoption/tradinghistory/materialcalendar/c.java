package com.iqoption.tradinghistory.materialcalendar;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: CalendarPager */
class c extends ViewPager {
    private boolean dZd = true;

    public c(Context context) {
        super(context);
    }

    public void setPagingEnabled(boolean z) {
        this.dZd = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.dZd && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.dZd && super.onTouchEvent(motionEvent);
    }

    public boolean canScrollVertically(int i) {
        return this.dZd && super.canScrollVertically(i);
    }

    public boolean canScrollHorizontally(int i) {
        return this.dZd && super.canScrollHorizontally(i);
    }
}
