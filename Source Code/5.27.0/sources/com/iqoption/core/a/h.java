package com.iqoption.core.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentTechnicalLogBinding */
public abstract class h extends ViewDataBinding {
    @NonNull
    public final FrameLayout bfE;
    @NonNull
    public final TextView bfF;

    protected h(Object obj, View view, int i, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i);
        this.bfE = frameLayout;
        this.bfF = textView;
    }
}
