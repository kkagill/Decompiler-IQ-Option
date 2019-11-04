package com.iqoption.kyc.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutKycBottomBarBinding */
public abstract class bq extends ViewDataBinding {
    @NonNull
    public final ContentLoadingProgressBar dwA;
    @NonNull
    public final TextView dwB;
    @NonNull
    public final TextView dwz;

    protected bq(Object obj, View view, int i, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2) {
        super(obj, view, i);
        this.dwz = textView;
        this.dwA = contentLoadingProgressBar;
        this.dwB = textView2;
    }
}
