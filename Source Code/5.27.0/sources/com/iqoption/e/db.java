package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.amountview.AmountView;

/* compiled from: BalanceCellBinding */
public abstract class db extends ViewDataBinding {
    @NonNull
    public final TextView alQ;
    @NonNull
    public final ImageView bYd;
    @NonNull
    public final AmountView bYe;
    @NonNull
    public final ImageView bYf;
    @NonNull
    public final ConstraintLayout bYg;
    @NonNull
    public final TextView bYh;
    @NonNull
    public final TextView bYi;

    protected db(Object obj, View view, int i, ImageView imageView, AmountView amountView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bYd = imageView;
        this.bYe = amountView;
        this.bYf = imageView2;
        this.bYg = constraintLayout;
        this.bYh = textView;
        this.alQ = textView2;
        this.bYi = textView3;
    }
}
