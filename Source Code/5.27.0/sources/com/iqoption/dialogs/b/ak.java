package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: TradeOnPracticeBottomSheetBinding */
public abstract class ak extends ViewDataBinding {
    @NonNull
    public final ImageView cMO;
    @NonNull
    public final ConstraintLayout cMP;
    @NonNull
    public final TextView cMS;
    @NonNull
    public final TextView cMU;
    @NonNull
    public final TextView cMV;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final TextView cdz;

    protected ak(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cbk = imageView;
        this.cMU = textView;
        this.cMO = imageView2;
        this.cMP = constraintLayout;
        this.cMS = textView2;
        this.cdz = textView3;
        this.cMV = textView4;
    }
}
