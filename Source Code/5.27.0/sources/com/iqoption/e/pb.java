package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemTrendingTodayBinding */
public abstract class pb extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView aoh;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final ImageView bXh;
    @NonNull
    public final ConstraintLayout cfP;

    protected pb(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bXh = imageView;
        this.aoh = textView;
        this.cfP = constraintLayout;
        this.alH = textView2;
        this.aoq = textView3;
    }
}
