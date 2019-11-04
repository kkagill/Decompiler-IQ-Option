package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsClosedItemBinding */
public abstract class ch extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final ConstraintLayout aon;
    @NonNull
    public final cv bXr;
    @NonNull
    public final TextView bXt;
    @NonNull
    public final TextView bXw;
    @NonNull
    public final TextView bXx;

    protected ch(Object obj, View view, int i, cv cvVar, TextView textView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bXr = cvVar;
        setContainedBinding(this.bXr);
        this.bXw = textView;
        this.aRh = imageView;
        this.aon = constraintLayout;
        this.amZ = textView2;
        this.bXx = textView3;
        this.bXt = textView4;
    }
}
