package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemLocaleAssetCountrySuggestBinding */
public abstract class ox extends ViewDataBinding {
    @NonNull
    public final TextView bfG;
    @NonNull
    public final TextView cmh;
    @NonNull
    public final ConstraintLayout cmi;
    @NonNull
    public final ImageView cmj;
    @NonNull
    public final TextView cmk;

    protected ox(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, ImageView imageView, TextView textView3) {
        super(obj, view, i);
        this.cmh = textView;
        this.cmi = constraintLayout;
        this.bfG = textView2;
        this.cmj = imageView;
        this.cmk = textView3;
    }
}
