package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: StringBasketItemBinding */
public abstract class zf extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final ImageView bTo;
    @NonNull
    public final ImageView bTp;
    @NonNull
    public final ImageView bTq;

    protected zf(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i);
        this.aGo = linearLayout;
        this.bTo = imageView;
        this.amZ = textView;
        this.bTp = imageView2;
        this.bTq = imageView3;
    }
}
