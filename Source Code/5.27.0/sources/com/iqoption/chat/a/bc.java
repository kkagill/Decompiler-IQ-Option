package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;
import com.iqoption.core.ui.widget.StarBar;

/* compiled from: ChatRateMessageItemBinding */
public abstract class bc extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final FrameLayout aRG;
    @NonNull
    public final MessageView aRK;
    @NonNull
    public final StarBar aRL;
    @NonNull
    public final MessageView aRM;
    @NonNull
    public final FrameLayout aRN;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;

    protected bc(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, MessageView messageView, StarBar starBar, MessageView messageView2, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.aRG = frameLayout;
        this.aRK = messageView;
        this.aRL = starBar;
        this.aRM = messageView2;
        this.aRN = frameLayout2;
    }
}
