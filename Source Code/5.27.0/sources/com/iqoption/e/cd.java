package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsCategoryItemBinding */
public abstract class cd extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView alH;
    @NonNull
    public final LinearLayout bXu;

    protected cd(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.bXu = linearLayout;
        this.aRh = imageView;
        this.alH = textView;
    }
}
