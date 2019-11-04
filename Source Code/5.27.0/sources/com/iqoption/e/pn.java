package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutProTraderBenefitsTopRowBinding */
public abstract class pn extends ViewDataBinding {
    @NonNull
    public final ImageView cmA;
    @NonNull
    public final TextView cmB;

    protected pn(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cmA = imageView;
        this.cmB = textView;
    }
}
