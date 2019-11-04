package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetInfoPriceItemBinding */
public abstract class bb extends ViewDataBinding {
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final TextView bVL;
    @NonNull
    public final TextView bVM;
    @NonNull
    public final TextView bWl;
    @NonNull
    public final TextView bWm;

    protected bb(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.aIs = imageView;
        this.bVL = textView;
        this.bVM = textView2;
        this.bWl = textView3;
        this.bWm = textView4;
    }
}
