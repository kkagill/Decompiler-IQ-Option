package com.iqoption.deposit.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutDepositHoldTimeWarningBinding */
public abstract class bd extends ViewDataBinding {
    @NonNull
    public final TextView cDt;

    protected bd(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.cDt = textView;
    }
}
