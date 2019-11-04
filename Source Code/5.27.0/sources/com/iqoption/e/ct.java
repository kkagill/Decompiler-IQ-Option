package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsHeaderFxBinding */
public abstract class ct extends ViewDataBinding {
    @NonNull
    public final ImageView bXB;
    @NonNull
    public final TextView bXD;
    @NonNull
    public final ImageView bXK;
    @NonNull
    public final TextView bXO;
    @NonNull
    public final LinearLayout bXS;
    @NonNull
    public final LinearLayout bXT;
    @NonNull
    public final LinearLayout bXV;
    @NonNull
    public final LinearLayout bXY;
    @NonNull
    public final ImageView bXZ;
    @NonNull
    public final TextView bYa;

    protected ct(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bXS = linearLayout;
        this.bXY = linearLayout2;
        this.bXT = linearLayout3;
        this.bXV = linearLayout4;
        this.bXK = imageView;
        this.bXZ = imageView2;
        this.bXB = imageView3;
        this.bXO = textView;
        this.bYa = textView2;
        this.bXD = textView3;
    }
}
