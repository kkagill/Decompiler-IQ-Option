package com.iqoption.deposit.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* compiled from: LayoutDepositButtonLightBinding */
public abstract class az extends ViewDataBinding {
    @NonNull
    public final FrameLayout cDo;
    @NonNull
    public final ContentLoadingProgressBar cDp;
    @NonNull
    public final TextView cDq;
    @NonNull
    public final ViewStubProxy cDr;

    protected az(Object obj, View view, int i, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView, ViewStubProxy viewStubProxy) {
        super(obj, view, i);
        this.cDo = frameLayout;
        this.cDp = contentLoadingProgressBar;
        this.cDq = textView;
        this.cDr = viewStubProxy;
    }
}
