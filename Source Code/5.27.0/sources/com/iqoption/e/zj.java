package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: TemplateItemBinding */
public abstract class zj extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final ImageView cng;
    @NonNull
    public final ImageView cui;
    @NonNull
    public final TextView cuj;

    protected zj(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cng = imageView;
        this.cui = imageView2;
        this.aIv = constraintLayout;
        this.cuj = textView;
        this.amZ = textView2;
    }
}
