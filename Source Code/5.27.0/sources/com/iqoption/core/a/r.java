package com.iqoption.core.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutToolbarBlackBinding */
public abstract class r extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bfR;
    @NonNull
    public final LinearLayout bfS;
    @NonNull
    public final ContentLoadingProgressBar bfT;

    protected r(Object obj, View view, int i, ImageView imageView, TextView textView, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.bfR = imageView;
        this.alH = textView;
        this.bfS = linearLayout;
        this.bfT = contentLoadingProgressBar;
    }
}
