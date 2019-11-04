package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogProApplicationStatusBinding */
public abstract class gq extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final LinearLayout ccu;
    @NonNull
    public final TextView ccv;
    @NonNull
    public final TextView ccw;

    protected gq(Object obj, View view, int i, FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aoG = frameLayout;
        this.ccu = linearLayout;
        this.ccv = textView;
        this.ccw = textView2;
    }
}
