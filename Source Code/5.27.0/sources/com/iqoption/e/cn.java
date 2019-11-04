package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsHeaderBoBinding */
public abstract class cn extends ViewDataBinding {
    @NonNull
    public final LinearLayout bXA;
    @NonNull
    public final ImageView bXB;
    @NonNull
    public final ImageView bXC;
    @NonNull
    public final TextView bXD;
    @NonNull
    public final TextView bXE;

    protected cn(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.bXA = linearLayout;
        this.bXB = imageView;
        this.bXC = imageView2;
        this.bXD = textView;
        this.bXE = textView2;
    }
}
