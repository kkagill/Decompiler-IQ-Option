package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatTextMessageTailItemBinding */
public abstract class by extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final LinearLayout aRf;

    protected by(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, MessageView messageView) {
        super(obj, view, i);
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aRK = messageView;
    }
}
