package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: PortfolioMacroFilterItemBinding */
public abstract class vd extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView aoq;

    protected vd(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aRh = imageView;
        this.alH = textView;
        this.aoq = textView2;
    }
}
