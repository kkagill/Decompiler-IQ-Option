package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ActivityWelcomeOnboardingBinding */
public abstract class al extends ViewDataBinding {
    @NonNull
    public final FrameLayout aIb;
    @NonNull
    public final FrameLayout bTA;
    @NonNull
    public final LottieAnimationView bTz;
    @NonNull
    public final TextView bfC;
    @NonNull
    public final ImageView bfy;

    protected al(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, LottieAnimationView lottieAnimationView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i);
        this.aIb = frameLayout;
        this.bfy = imageView;
        this.bTz = lottieAnimationView;
        this.bTA = frameLayout2;
        this.bfC = textView;
    }
}
