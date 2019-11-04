package com.iqoption.feed.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: MicroBottomPanelBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final TextView cPI;
    @NonNull
    public final LottieAnimationView cPJ;
    @NonNull
    public final TextView cPL;
    @NonNull
    public final TextView cPM;
    @NonNull
    public final ConstraintLayout cQu;
    @NonNull
    public final TextView cQv;

    protected u(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, LottieAnimationView lottieAnimationView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cQu = constraintLayout;
        this.cPI = textView;
        this.cPJ = lottieAnimationView;
        this.cQv = textView2;
        this.cPL = textView3;
        this.cPM = textView4;
    }
}
