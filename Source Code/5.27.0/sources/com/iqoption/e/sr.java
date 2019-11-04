package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MoreTradingOpportunitiesBinding */
public abstract class sr extends ViewDataBinding {
    @NonNull
    public final ImageView cle;
    @NonNull
    public final TextView cop;
    @NonNull
    public final ImageView coq;
    @NonNull
    public final TextView cor;

    protected sr(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2) {
        super(obj, view, i);
        this.cop = textView;
        this.coq = imageView;
        this.cor = textView2;
        this.cle = imageView2;
    }
}
