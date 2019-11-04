package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutDepositToolbarLiteBinding */
public abstract class bj extends ViewDataBinding {
    @NonNull
    public final ImageView cCu;
    @NonNull
    public final TextView cDD;

    protected bj(Object obj, View view, int i, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.cDD = textView;
        this.cCu = imageView;
    }
}
