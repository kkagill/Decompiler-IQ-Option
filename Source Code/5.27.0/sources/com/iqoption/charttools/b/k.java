package com.iqoption.charttools.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorConstructorGroupTitleItemBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final TextView alH;

    protected k(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.aIs = imageView;
        this.aGo = linearLayout;
        this.alH = textView;
    }
}
