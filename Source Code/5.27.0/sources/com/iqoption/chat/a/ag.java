package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;

/* compiled from: ChatFragmentImagePreviewSliderBinding */
public abstract class ag extends ViewDataBinding {
    @NonNull
    public final ImageView aQL;
    @NonNull
    public final ImageView aRw;
    @NonNull
    public final TextView aRx;
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final TextView alH;

    protected ag(Object obj, View view, int i, ImageView imageView, TextView textView, ViewPager viewPager, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.aRw = imageView;
        this.aRx = textView;
        this.aRy = viewPager;
        this.aQL = imageView2;
        this.alH = textView2;
    }
}
