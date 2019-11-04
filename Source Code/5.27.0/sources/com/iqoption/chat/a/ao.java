package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatImageMessageHeadItemBinding */
public abstract class ao extends ViewDataBinding {
    @NonNull
    public final ImageView aQK;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;
    @NonNull
    public final TextView anj;

    protected ao(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.aRe = textView;
        this.aRf = linearLayout;
        this.aQK = imageView;
        this.anj = textView2;
    }
}
