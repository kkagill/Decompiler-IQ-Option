package com.iqoption.deposit.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentDepositCryptoBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final ProgressBar cBd;
    @NonNull
    public final TextView cBe;
    @NonNull
    public final TextView cBf;
    @NonNull
    public final LinearLayout cBg;
    @NonNull
    public final ContentLoadingProgressBar cBh;
    @NonNull
    public final TextView cBi;
    @NonNull
    public final TextView cBj;

    protected i(Object obj, View view, int i, ProgressBar progressBar, TextView textView, TextView textView2, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cBd = progressBar;
        this.cBe = textView;
        this.cBf = textView2;
        this.cBg = linearLayout;
        this.cBh = contentLoadingProgressBar;
        this.cBi = textView3;
        this.cBj = textView4;
    }
}
