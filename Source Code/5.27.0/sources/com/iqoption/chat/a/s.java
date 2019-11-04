package com.iqoption.chat.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatFileMessageHeadItemBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView anj;

    protected s(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aRe = textView;
        this.aRf = linearLayout;
        this.amZ = textView2;
        this.anj = textView3;
    }
}
