package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorTitleItemBinding */
public abstract class op extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bWR;
    @NonNull
    public final ImageView bYb;

    protected op(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ImageView imageView3, TextView textView) {
        super(obj, view, i);
        this.bWR = imageView;
        this.bYb = imageView2;
        this.aGo = linearLayout;
        this.aRh = imageView3;
        this.alH = textView;
    }
}
