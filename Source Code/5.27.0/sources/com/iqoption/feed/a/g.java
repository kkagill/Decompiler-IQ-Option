package com.iqoption.feed.a;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FeedWebBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final WebView Aa;
    @NonNull
    public final FrameLayout cPU;
    @NonNull
    public final ConstraintLayout cPV;
    @NonNull
    public final ImageView cPW;
    @NonNull
    public final TextView cPX;
    @NonNull
    public final TextView cPY;
    @NonNull
    public final TextView cPZ;

    protected g(Object obj, View view, int i, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, WebView webView) {
        super(obj, view, i);
        this.cPU = frameLayout;
        this.cPV = constraintLayout;
        this.cPW = imageView;
        this.cPX = textView;
        this.cPY = textView2;
        this.cPZ = textView3;
        this.Aa = webView;
    }
}
