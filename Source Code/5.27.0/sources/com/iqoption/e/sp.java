package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MicroPortfolioTotalPagerPageBinding */
public abstract class sp extends ViewDataBinding {
    @NonNull
    public final TextView aoo;
    @NonNull
    public final TextView aoq;

    protected sp(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aoo = textView;
        this.aoq = textView2;
    }
}
