package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutWithdrawFeeBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final ImageView eqB;
    @NonNull
    public final TextView eqC;
    @NonNull
    public final ContentLoadingProgressBar eqD;
    @NonNull
    public final TextView eqE;
    @NonNull
    public final TextView eqF;
    @NonNull
    public final TextView eqG;

    protected s(Object obj, View view, int i, ImageView imageView, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.eqB = imageView;
        this.eqC = textView;
        this.eqD = contentLoadingProgressBar;
        this.eqE = textView2;
        this.eqF = textView3;
        this.eqG = textView4;
    }
}
