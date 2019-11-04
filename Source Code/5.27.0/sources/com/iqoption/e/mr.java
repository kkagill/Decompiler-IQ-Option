package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentProTraderActiveBinding */
public abstract class mr extends ViewDataBinding {
    @NonNull
    public final ImageView cib;
    @NonNull
    public final Barrier cic;
    @NonNull
    public final ImageView cid;
    @NonNull
    public final ConstraintLayout cie;
    @NonNull
    public final TextView cif;
    @NonNull
    public final TextView cig;

    protected mr(Object obj, View view, int i, ImageView imageView, Barrier barrier, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cib = imageView;
        this.cic = barrier;
        this.cid = imageView2;
        this.cie = constraintLayout;
        this.cif = textView;
        this.cig = textView2;
    }
}
