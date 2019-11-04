package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: ActiveToolsItemBinding */
public abstract class z extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView aRi;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final ImageView bTo;
    @NonNull
    public final ImageView bTp;
    @NonNull
    public final ImageView bTq;

    protected z(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3) {
        super(obj, view, i);
        this.aIv = constraintLayout;
        this.bTo = imageView;
        this.amZ = textView;
        this.bTp = imageView2;
        this.aRi = textView2;
        this.bTq = imageView3;
    }
}
