package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MultiPositionItemBinding */
public abstract class sz extends ViewDataBinding {
    @NonNull
    public final TextView aoh;
    @NonNull
    public final ImageView bXh;
    @NonNull
    public final ImageView cow;
    @NonNull
    public final TextView cox;

    protected sz(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.bXh = imageView;
        this.aoh = textView;
        this.cow = imageView2;
        this.cox = textView2;
    }
}
