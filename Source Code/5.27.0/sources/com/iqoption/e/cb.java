package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsBoItemBinding */
public abstract class cb extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView alW;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final cv bXr;
    @NonNull
    public final LinearLayout bXs;
    @NonNull
    public final TextView bXt;

    protected cb(Object obj, View view, int i, cv cvVar, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bXr = cvVar;
        setContainedBinding(this.bXr);
        this.aRh = imageView;
        this.bXs = linearLayout;
        this.amZ = textView;
        this.alW = textView2;
        this.bXt = textView3;
    }
}
