package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentCryptoPaymentStatusBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final TextView cAU;
    @NonNull
    public final TextView cAV;
    @NonNull
    public final TextView cAW;
    @NonNull
    public final ProgressBar cAX;
    @NonNull
    public final TextView cAY;
    @NonNull
    public final TextView cAZ;
    @NonNull
    public final ImageView cBa;
    @NonNull
    public final TextView cBb;
    @NonNull
    public final bj cBc;
    @NonNull
    public final LinearLayout cod;

    protected g(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, bj bjVar, LinearLayout linearLayout) {
        super(obj, view, i);
        this.cAU = textView;
        this.cAV = textView2;
        this.cAW = textView3;
        this.cAX = progressBar;
        this.cAY = textView4;
        this.cAZ = textView5;
        this.cBa = imageView;
        this.cBb = textView6;
        this.cBc = bjVar;
        setContainedBinding(this.cBc);
        this.cod = linearLayout;
    }
}
