package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatFileMessageFullItemBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final TextView aRe;
    @NonNull
    public final LinearLayout aRf;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView anj;

    protected q(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aRe = textView;
        this.aQW = imageView;
        this.aRf = linearLayout;
        this.amZ = textView2;
        this.anj = textView3;
    }
}
