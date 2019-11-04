package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycStepsBinding */
public abstract class aw extends ViewDataBinding {
    @NonNull
    public final bs dvS;
    @NonNull
    public final LinearLayout dvT;
    @NonNull
    public final ContentLoadingProgressBar dvU;
    @NonNull
    public final ScrollView dvV;

    protected aw(Object obj, View view, int i, bs bsVar, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar, ScrollView scrollView) {
        super(obj, view, i);
        this.dvS = bsVar;
        setContainedBinding(this.dvS);
        this.dvT = linearLayout;
        this.dvU = contentLoadingProgressBar;
        this.dvV = scrollView;
    }
}
