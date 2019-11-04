package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: WithdrawButtonLayoutBinding */
public abstract class y extends ViewDataBinding {
    @NonNull
    public final Button eqK;
    @NonNull
    public final ContentLoadingProgressBar eqL;

    protected y(Object obj, View view, int i, Button button, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.eqK = button;
        this.eqL = contentLoadingProgressBar;
    }
}
