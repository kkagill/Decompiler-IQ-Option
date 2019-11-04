package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: VideoEducationVideoItemBinding */
public abstract class aan extends ViewDataBinding {
    @NonNull
    public final ImageView De;
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView cuD;
    @NonNull
    public final TextView cuE;
    @NonNull
    public final TextView cuF;

    protected aan(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.aRl = linearLayout;
        this.cuD = textView;
        this.De = imageView;
        this.cuE = textView2;
        this.alH = textView3;
        this.cuF = textView4;
    }
}
