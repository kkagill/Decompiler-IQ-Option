package com.iqoption.welcome.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FragmentWelcomeSlideBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final LottieAnimationView cQF;
    @NonNull
    public final Guideline elk;
    @NonNull
    public final Space ell;
    @NonNull
    public final TextView elm;
    @NonNull
    public final TextView eln;

    protected u(Object obj, View view, int i, LottieAnimationView lottieAnimationView, Guideline guideline, Space space, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cQF = lottieAnimationView;
        this.elk = guideline;
        this.ell = space;
        this.elm = textView;
        this.eln = textView2;
    }
}
