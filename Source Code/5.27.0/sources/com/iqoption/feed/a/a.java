package com.iqoption.feed.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FeedBottomPanelBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final LinearLayout cPG;
    @NonNull
    public final Space cPH;
    @NonNull
    public final TextView cPI;
    @NonNull
    public final LottieAnimationView cPJ;
    @NonNull
    public final TextView cPK;
    @NonNull
    public final TextView cPL;
    @NonNull
    public final TextView cPM;

    protected a(Object obj, View view, int i, LinearLayout linearLayout, Space space, TextView textView, LottieAnimationView lottieAnimationView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cPG = linearLayout;
        this.cPH = space;
        this.cPI = textView;
        this.cPJ = lottieAnimationView;
        this.cPK = textView2;
        this.cPL = textView3;
        this.cPM = textView4;
    }
}
