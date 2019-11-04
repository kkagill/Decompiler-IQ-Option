package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: VipEducationItemViewBinding */
public abstract class aat extends ViewDataBinding {
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView cuQ;
    @NonNull
    public final ImageView cuR;

    protected aat(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cuQ = imageView;
        this.cuR = imageView2;
        this.aRu = textView;
        this.alH = textView2;
    }
}
