package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatImageMessageFullItemBinding */
public abstract class am extends ViewDataBinding {
    @NonNull
    public final ImageView aQK;
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;
    @NonNull
    public final TextView anj;

    protected am(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aQK = imageView2;
        this.anj = textView2;
    }
}
