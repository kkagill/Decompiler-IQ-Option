package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatLikeDislikeMessageItemBinding */
public abstract class au extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final FrameLayout aRG;
    @NonNull
    public final LinearLayout aRH;
    @NonNull
    public final ImageView aRI;
    @NonNull
    public final ImageView aRJ;
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;

    protected au(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, ImageView imageView2, ImageView imageView3, MessageView messageView) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aRG = frameLayout;
        this.aRH = linearLayout2;
        this.aRI = imageView2;
        this.aRJ = imageView3;
        this.aRK = messageView;
    }
}
