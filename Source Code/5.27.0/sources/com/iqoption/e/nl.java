package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentTraderoomRestrictionBinding */
public abstract class nl extends ViewDataBinding {
    @NonNull
    public final TextView ani;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final TextView cbI;
    @NonNull
    public final FrameLayout cfH;
    @NonNull
    public final LinearLayout cfL;
    @NonNull
    public final TextView cjW;

    protected nl(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cfH = frameLayout;
        this.cbI = textView;
        this.bYN = frameLayout2;
        this.cfL = linearLayout;
        this.ani = textView2;
        this.cjW = textView3;
    }
}
