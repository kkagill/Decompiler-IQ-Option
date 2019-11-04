package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatTextMessageFullItemBinding */
public abstract class bu extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;

    protected bu(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, MessageView messageView) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aRK = messageView;
    }
}
