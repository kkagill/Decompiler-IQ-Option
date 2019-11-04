package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: RightPanelClosedBinding */
public abstract class wz extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView cqR;
    @NonNull
    public final TextView cqS;
    @NonNull
    public final ToggleButton cqT;
    @NonNull
    public final FrameLayout cqU;

    protected wz(Object obj, View view, int i, ImageView imageView, TextView textView, ToggleButton toggleButton, FrameLayout frameLayout, TextView textView2) {
        super(obj, view, i);
        this.cqR = imageView;
        this.cqS = textView;
        this.cqT = toggleButton;
        this.cqU = frameLayout;
        this.alH = textView2;
    }
}
