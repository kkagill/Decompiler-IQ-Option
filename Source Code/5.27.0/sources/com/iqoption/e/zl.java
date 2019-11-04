package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: TemplateToastBinding */
public abstract class zl extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aRA;
    @NonNull
    public final TextView alH;
    @NonNull
    public final View bVK;
    @NonNull
    public final TextView bfF;
    @NonNull
    public final FrameLayout cdJ;
    @NonNull
    public final TextView cmS;

    protected zl(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, View view2, TextView textView3, FrameLayout frameLayout) {
        super(obj, view, i);
        this.cmS = textView;
        this.aRA = constraintLayout;
        this.bfF = textView2;
        this.bVK = view2;
        this.alH = textView3;
        this.cdJ = frameLayout;
    }
}
