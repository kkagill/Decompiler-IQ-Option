package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetInfoStatisticsMoreItemBinding */
public abstract class bh extends ViewDataBinding {
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final TextView alH;

    protected bh(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.aIs = imageView;
        this.alH = textView;
    }
}
