package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LeftMenuItemDropDownBinding */
public abstract class pv extends ViewDataBinding {
    @NonNull
    public final TextView cmC;
    @NonNull
    public final ImageView cmE;
    @NonNull
    public final ImageView cmF;

    protected pv(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.cmE = imageView;
        this.cmF = imageView2;
        this.cmC = textView;
    }
}
