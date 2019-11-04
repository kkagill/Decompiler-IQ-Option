package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ToolbarLayoutBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final ImageView cCu;
    @NonNull
    public final TextView eqH;
    @NonNull
    public final TextView eqI;
    @NonNull
    public final ImageView eqJ;

    protected w(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        super(obj, view, i);
        this.cCu = imageView;
        this.eqH = textView;
        this.eqI = textView2;
        this.eqJ = imageView2;
    }
}
