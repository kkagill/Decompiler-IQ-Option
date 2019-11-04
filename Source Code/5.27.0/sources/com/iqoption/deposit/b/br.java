package com.iqoption.deposit.b;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: NfcScanFragmentBinding */
public abstract class br extends ViewDataBinding {
    @NonNull
    public final LottieAnimationView bfv;
    @NonNull
    public final RelativeLayout cDK;
    @NonNull
    public final TextView cDL;
    @NonNull
    public final TextView cor;

    protected br(Object obj, View view, int i, LottieAnimationView lottieAnimationView, TextView textView, RelativeLayout relativeLayout, TextView textView2) {
        super(obj, view, i);
        this.bfv = lottieAnimationView;
        this.cor = textView;
        this.cDK = relativeLayout;
        this.cDL = textView2;
    }
}
