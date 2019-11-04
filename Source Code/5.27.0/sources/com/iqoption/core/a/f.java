package com.iqoption.core.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FragmentSplashBinding */
public abstract class f extends ViewDataBinding {
    @NonNull
    public final TextView bfA;
    @NonNull
    public final FrameLayout bfB;
    @NonNull
    public final TextView bfC;
    @NonNull
    public final TextView bfD;
    @NonNull
    public final LottieAnimationView bfv;
    @NonNull
    public final View bfw;
    @NonNull
    public final TextView bfx;
    @NonNull
    public final ImageView bfy;
    @NonNull
    public final TextView bfz;

    protected f(Object obj, View view, int i, LottieAnimationView lottieAnimationView, View view2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, FrameLayout frameLayout, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.bfv = lottieAnimationView;
        this.bfw = view2;
        this.bfx = textView;
        this.bfy = imageView;
        this.bfz = textView2;
        this.bfA = textView3;
        this.bfB = frameLayout;
        this.bfC = textView4;
        this.bfD = textView5;
    }
}
