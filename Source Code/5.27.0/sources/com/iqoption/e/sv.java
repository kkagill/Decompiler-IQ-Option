package com.iqoption.e;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MultiAssetViewBinding */
public abstract class sv extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final ImageView cos;
    @NonNull
    public final HorizontalScrollView cot;

    protected sv(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView) {
        super(obj, view, i);
        this.cos = imageView;
        this.aGo = linearLayout;
        this.cot = horizontalScrollView;
    }
}
