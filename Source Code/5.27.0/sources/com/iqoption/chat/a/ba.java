package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatMicroItemBinding */
public abstract class ba extends ViewDataBinding {
    @NonNull
    public final ImageView De;
    @NonNull
    public final TextView aPR;
    @NonNull
    public final TextView aPS;
    @NonNull
    public final ImageView aRE;
    @NonNull
    public final TextView alH;

    protected ba(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3) {
        super(obj, view, i);
        this.De = imageView;
        this.aPR = textView;
        this.aPS = textView2;
        this.aRE = imageView2;
        this.alH = textView3;
    }
}
