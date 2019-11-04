package com.iqoption.cardsverification.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FragmentVerifyStatusBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final TextView aAK;
    @NonNull
    public final FrameLayout aAL;
    @NonNull
    public final TextView aAM;
    @NonNull
    public final FrameLayout aAN;
    @NonNull
    public final LottieAnimationView aAO;
    @NonNull
    public final FrameLayout aAP;
    @NonNull
    public final TextView aAQ;
    @NonNull
    public final q aAR;

    protected g(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, FrameLayout frameLayout2, LottieAnimationView lottieAnimationView, FrameLayout frameLayout3, TextView textView3, q qVar) {
        super(obj, view, i);
        this.aAK = textView;
        this.aAL = frameLayout;
        this.aAM = textView2;
        this.aAN = frameLayout2;
        this.aAO = lottieAnimationView;
        this.aAP = frameLayout3;
        this.aAQ = textView3;
        this.aAR = qVar;
        setContainedBinding(this.aAR);
    }
}
