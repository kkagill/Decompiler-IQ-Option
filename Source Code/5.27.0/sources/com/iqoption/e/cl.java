package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsFxItemBinding */
public abstract class cl extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final cv bXr;
    @NonNull
    public final LinearLayout bXs;
    @NonNull
    public final TextView bXt;
    @NonNull
    public final TextView bXv;
    @NonNull
    public final TextView bXz;

    protected cl(Object obj, View view, int i, cv cvVar, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bXr = cvVar;
        setContainedBinding(this.bXr);
        this.bXv = textView;
        this.bXz = textView2;
        this.aRh = imageView;
        this.bXs = linearLayout;
        this.amZ = textView3;
        this.bXt = textView4;
    }
}
