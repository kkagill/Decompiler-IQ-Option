package com.iqoption.fragment.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.dd;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: IQMenuFragment */
public abstract class e extends b {
    protected Builder ajf;
    private dd ddq;
    private View ddr;

    public abstract View getContentView();

    public abstract String getEventName();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ddq = (dd) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.base_menu_fragment, viewGroup, false);
        this.ddq.a(this);
        this.ddq.bYj.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.ddr = getContentView();
        this.ddq.bYj.addView(this.ddr);
        return this.ddq.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void onResume() {
        super.onResume();
        String eventName = getEventName();
        if (getEventName() != null) {
            this.ajf = Event.Builder(Event.CATEGORY_SCREEN_OPENED, eventName);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public boolean onBackPressed() {
        return onClose();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        return true;
    }

    public void atu() {
        this.ddq.bYj.animate().alpha(0.0f).setDuration(400).setInterpolator(c.egR).start();
    }

    public void att() {
        this.ddq.bYj.setAlpha(0.0f);
        this.ddq.bYj.animate().alpha(1.0f).setDuration(400).setInterpolator(new LinearOutSlowInInterpolator()).start();
    }
}
