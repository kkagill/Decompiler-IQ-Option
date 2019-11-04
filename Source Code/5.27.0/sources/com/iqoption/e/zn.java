package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: ToastFxNextExpirationBinding */
public abstract class zn extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView anj;
    @NonNull
    public final TextView aol;
    @NonNull
    public final FrameLayout caT;

    protected zn(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, FrameLayout frameLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.aIv = constraintLayout;
        this.aol = textView2;
        this.caT = frameLayout;
        this.anj = textView3;
        this.alH = textView4;
    }
}
