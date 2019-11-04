package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemPaymentMethodLightBinding */
public abstract class al extends ViewDataBinding {
    @NonNull
    public final LinearLayout cCY;
    @NonNull
    public final View cCZ;
    @NonNull
    public final TextView cDa;
    @NonNull
    public final ImageView cDb;
    @NonNull
    public final ImageView cDc;
    @NonNull
    public final TextView cDd;

    protected al(Object obj, View view, int i, View view2, LinearLayout linearLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.cCZ = view2;
        this.cCY = linearLayout;
        this.cDa = textView;
        this.cDb = imageView;
        this.cDc = imageView2;
        this.cDd = textView2;
    }
}
