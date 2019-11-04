package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatTransferDialogMessageItemBinding */
public abstract class ca extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final TextView aRV;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;

    protected ca(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2, MessageView messageView) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aRV = textView2;
        this.aRK = messageView;
    }
}
