package com.iqoption.e;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: ToolbarBlackLayoutBinding */
public abstract class zp extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final LinearLayout bfS;
    @NonNull
    public final ContentLoadingProgressBar bfT;
    @NonNull
    public final ImageButton cpc;
    @NonNull
    public final ImageView cuk;

    protected zp(Object obj, View view, int i, ImageButton imageButton, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.cpc = imageButton;
        this.cuk = imageView;
        this.bYq = imageView2;
        this.alH = textView;
        this.bfS = linearLayout;
        this.bfT = contentLoadingProgressBar;
    }
}
