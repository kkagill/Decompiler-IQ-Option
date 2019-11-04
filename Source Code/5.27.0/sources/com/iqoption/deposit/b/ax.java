package com.iqoption.deposit.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutDepositButtonBinding */
public abstract class ax extends ViewDataBinding {
    @NonNull
    public final FrameLayout cDo;
    @NonNull
    public final ContentLoadingProgressBar cDp;
    @NonNull
    public final TextView cDq;

    protected ax(Object obj, View view, int i, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView) {
        super(obj, view, i);
        this.cDo = frameLayout;
        this.cDp = contentLoadingProgressBar;
        this.cDq = textView;
    }
}
