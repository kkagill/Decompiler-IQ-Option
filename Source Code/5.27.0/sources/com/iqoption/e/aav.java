package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: VipEducationSessionItemBinding */
public abstract class aav extends ViewDataBinding {
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView cuQ;

    protected aav(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cuQ = imageView;
        this.aRu = textView;
        this.alH = textView2;
    }
}
