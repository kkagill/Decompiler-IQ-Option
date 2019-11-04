package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogSimpleBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;
    @NonNull
    public final TextView cMw;
    @NonNull
    public final TextView cMx;
    @NonNull
    public final TextView cMy;

    protected q(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, FrameLayout frameLayout, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.cMw = textView;
        this.cMx = textView2;
        this.aIv = constraintLayout;
        this.cMy = textView3;
        this.aHP = frameLayout;
        this.ani = textView4;
        this.alH = textView5;
    }
}
