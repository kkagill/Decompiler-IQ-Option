package com.iqoption.kyc.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.kyc.steps.StepProgressView;

/* compiled from: ItemKycStepBinding */
public abstract class bm extends ViewDataBinding {
    @NonNull
    public final Space dwq;
    @NonNull
    public final ImageView dwr;
    @NonNull
    public final ConstraintLayout dws;
    @NonNull
    public final TextView dwt;
    @NonNull
    public final StepProgressView dwu;
    @NonNull
    public final TextView dwv;
    @NonNull
    public final Space dww;

    protected bm(Object obj, View view, int i, Space space, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, StepProgressView stepProgressView, TextView textView2, Space space2) {
        super(obj, view, i);
        this.dwq = space;
        this.dwr = imageView;
        this.dws = constraintLayout;
        this.dwt = textView;
        this.dwu = stepProgressView;
        this.dwv = textView2;
        this.dww = space2;
    }
}
