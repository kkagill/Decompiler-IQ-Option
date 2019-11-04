package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsMultiWarningItemBinding */
public abstract class cz extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView bYc;

    protected cz(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.aRh = imageView;
        this.bYc = textView;
    }
}
