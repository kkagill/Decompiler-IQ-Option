package com.iqoption.fragment.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.df;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: IQSmartDialogFragment */
public abstract class f extends b {
    private static final String TAG = "com.iqoption.fragment.b.f";
    protected Builder ajf;
    private df ddt;

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract String getEventName();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ddt = (df) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.base_smart_dialog_fragment, viewGroup, false);
        this.ddt.a(this);
        this.ddt.bYj.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (f.this.akX()) {
                    y.a(f.this.getActivity(), view);
                }
                return true;
            }
        });
        this.ddt.bYl.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (f.this.akX()) {
                    y.a(f.this.getActivity(), view);
                }
            }
        });
        this.ddt.bYj.addView(a(layoutInflater, this.ddt.bYj, bundle));
        return this.ddt.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, getEventName());
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }
}
