package com.iqoption.charttools.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: TemplatesFigureItemBinding */
public abstract class y extends ViewDataBinding {
    @NonNull
    public final ImageView aIA;
    @NonNull
    public final ImageView aIB;
    @NonNull
    public final ImageView aIC;
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView aIz;
    @NonNull
    public final TextView amZ;

    protected y(Object obj, View view, int i, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.aIz = textView;
        this.aIA = imageView;
        this.aIB = imageView2;
        this.aIC = imageView3;
        this.aIv = constraintLayout;
        this.amZ = textView2;
    }
}
