package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemScanCardLightBinding */
public abstract class ar extends ViewDataBinding {
    @NonNull
    public final LinearLayout cDh;
    @NonNull
    public final ImageView cDi;
    @NonNull
    public final TextView cDj;

    protected ar(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cDh = linearLayout;
        this.cDi = imageView;
        this.cDj = textView;
    }
}
