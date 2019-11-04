package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatFileMessageTailItemBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView anj;

    protected u(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aQW = imageView;
        this.amZ = textView;
        this.anj = textView2;
    }
}
