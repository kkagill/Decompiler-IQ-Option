package com.iqoption.cardsverification.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: VerifyCardItemBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final TextView aAE;
    @NonNull
    public final ImageView aAG;
    @NonNull
    public final ImageView aAW;

    protected k(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2) {
        super(obj, view, i);
        this.aAW = imageView;
        this.aAE = textView;
        this.aAG = imageView2;
    }
}
