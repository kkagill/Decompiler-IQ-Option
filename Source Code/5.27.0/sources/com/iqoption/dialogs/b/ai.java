package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: RefreshBalanceBottomSheetBinding */
public abstract class ai extends ViewDataBinding {
    @NonNull
    public final TextView cMN;
    @NonNull
    public final ImageView cMO;
    @NonNull
    public final ConstraintLayout cMP;
    @NonNull
    public final TextView cMQ;
    @NonNull
    public final ImageView cMR;
    @NonNull
    public final TextView cMS;
    @NonNull
    public final TextView cMT;
    @NonNull
    public final ImageView cbk;

    protected ai(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView2, ImageView imageView3, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cbk = imageView;
        this.cMN = textView;
        this.cMO = imageView2;
        this.cMP = constraintLayout;
        this.cMQ = textView2;
        this.cMR = imageView3;
        this.cMS = textView3;
        this.cMT = textView4;
    }
}
