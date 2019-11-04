package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatImageMessageTailItemBinding */
public abstract class aq extends ViewDataBinding {
    @NonNull
    public final ImageView aQK;
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final TextView anj;

    protected aq(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.aQW = imageView;
        this.aQK = imageView2;
        this.anj = textView;
    }
}
