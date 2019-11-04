package com.iqoption.kyc.b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycQuestionnaireContainerBinding */
public abstract class am extends ViewDataBinding {
    @NonNull
    public final FrameLayout dvH;
    @NonNull
    public final ContentLoadingProgressBar dvI;

    protected am(Object obj, View view, int i, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.dvH = frameLayout;
        this.dvI = contentLoadingProgressBar;
    }
}
