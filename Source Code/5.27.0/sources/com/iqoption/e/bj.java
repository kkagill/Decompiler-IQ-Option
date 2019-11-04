package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetInfoTitleItemBinding */
public abstract class bj extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView bWP;
    @NonNull
    public final ImageView bWQ;
    @NonNull
    public final ImageView bWR;
    @NonNull
    public final TextView bWS;
    @NonNull
    public final TextView bWT;

    protected bj(Object obj, View view, int i, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bWP = textView;
        this.bWQ = imageView;
        this.bWR = imageView2;
        this.bWS = textView2;
        this.bWT = textView3;
        this.alH = textView4;
    }
}
