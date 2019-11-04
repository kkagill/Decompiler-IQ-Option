package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: SessionOtherItemBinding */
public abstract class yv extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView anC;
    @NonNull
    public final TextView cub;
    @NonNull
    public final TextView cuc;
    @NonNull
    public final TextView cue;
    @NonNull
    public final ImageView cuf;

    protected yv(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4) {
        super(obj, view, i);
        this.anC = textView;
        this.aRh = imageView;
        this.cub = textView2;
        this.cuc = textView3;
        this.cuf = imageView2;
        this.cue = textView4;
    }
}
