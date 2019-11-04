package com.iqoption.j.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;

/* compiled from: OperationSearchResultItemBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final TextView dKl;
    @NonNull
    public final Barrier dKm;
    @NonNull
    public final TextView dKn;
    @NonNull
    public final TextView dKo;
    @NonNull
    public final ImageView dKp;
    @NonNull
    public final TextView dKq;
    @NonNull
    public final ImageView dKr;
    @NonNull
    public final TextView dKs;
    @NonNull
    public final Barrier dKt;

    protected o(Object obj, View view, int i, TextView textView, Barrier barrier, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, ImageView imageView2, TextView textView5, Barrier barrier2) {
        super(obj, view, i);
        this.dKl = textView;
        this.dKm = barrier;
        this.dKn = textView2;
        this.dKo = textView3;
        this.dKp = imageView;
        this.dKq = textView4;
        this.dKr = imageView2;
        this.dKs = textView5;
        this.dKt = barrier2;
    }
}
