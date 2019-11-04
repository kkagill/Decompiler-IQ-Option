package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MultiActiveItemBinding */
public abstract class st extends ViewDataBinding {
    @NonNull
    public final TextView aoh;
    @NonNull
    public final ImageView bXh;

    protected st(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.bXh = imageView;
        this.aoh = textView;
    }
}
