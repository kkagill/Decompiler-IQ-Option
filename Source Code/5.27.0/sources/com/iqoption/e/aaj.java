package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: VideoEducationSimpleCategoryItemBinding */
public abstract class aaj extends ViewDataBinding {
    @NonNull
    public final ImageView De;
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView cuB;
    @NonNull
    public final TextView cuC;

    protected aaj(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aIv = constraintLayout;
        this.De = imageView;
        this.cuB = textView;
        this.alH = textView2;
        this.cuC = textView3;
    }
}
