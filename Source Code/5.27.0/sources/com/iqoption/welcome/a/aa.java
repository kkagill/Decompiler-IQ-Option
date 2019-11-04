package com.iqoption.welcome.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutRegisterButtonBinding */
public abstract class aa extends ViewDataBinding {
    @NonNull
    public final TextView aRV;
    @NonNull
    public final ContentLoadingProgressBar bYW;

    protected aa(Object obj, View view, int i, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.aRV = textView;
        this.bYW = contentLoadingProgressBar;
    }
}
