package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatFilePickerItemBinding */
public abstract class y extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView aRi;
    @NonNull
    public final TextView alH;

    protected y(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aRh = imageView;
        this.aRi = textView;
        this.alH = textView2;
    }
}
