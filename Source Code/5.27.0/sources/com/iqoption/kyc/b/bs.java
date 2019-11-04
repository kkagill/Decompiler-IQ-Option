package com.iqoption.kyc.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutKycButtonBinding */
public abstract class bs extends ViewDataBinding {
    @NonNull
    public final FrameLayout dwC;
    @NonNull
    public final ContentLoadingProgressBar dwD;
    @NonNull
    public final TextView dwE;

    protected bs(Object obj, View view, int i, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView) {
        super(obj, view, i);
        this.dwC = frameLayout;
        this.dwD = contentLoadingProgressBar;
        this.dwE = textView;
    }
}
