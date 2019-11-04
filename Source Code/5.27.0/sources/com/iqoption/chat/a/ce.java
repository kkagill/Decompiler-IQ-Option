package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatUserImageMessageItemBinding */
public abstract class ce extends ViewDataBinding {
    @NonNull
    public final ImageView aQK;
    @NonNull
    public final TextView anj;

    protected ce(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.aQK = imageView;
        this.anj = textView;
    }
}
