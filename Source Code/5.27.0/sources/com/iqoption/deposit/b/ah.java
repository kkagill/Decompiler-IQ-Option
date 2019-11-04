package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemCurrencyLightBinding */
public abstract class ah extends ViewDataBinding {
    @NonNull
    public final ImageView bfH;
    @NonNull
    public final LinearLayout bfI;
    @NonNull
    public final TextView bfJ;
    @NonNull
    public final TextView bfK;

    protected ah(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.bfH = imageView;
        this.bfI = linearLayout;
        this.bfJ = textView;
        this.bfK = textView2;
    }
}
