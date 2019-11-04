package com.iqoption.chat.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatTextMessageHeadItemBinding */
public abstract class bw extends ViewDataBinding {
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;

    protected bw(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, MessageView messageView) {
        super(obj, view, i);
        this.aRe = textView;
        this.aRf = linearLayout;
        this.aRK = messageView;
    }
}
