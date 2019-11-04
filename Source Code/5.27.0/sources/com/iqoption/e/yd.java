package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: RightPanelDelegateMultiSpotBinding */
public abstract class yd extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout csT;
    @NonNull
    public final TextView ctr;
    @NonNull
    public final TextView cts;

    protected yd(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.ctr = textView;
        this.cts = textView2;
        this.csT = constraintLayout;
    }
}
