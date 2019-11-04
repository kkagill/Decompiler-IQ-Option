package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: KycContinueButtonBinding */
public abstract class pf extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView cfW;

    protected pf(Object obj, View view, int i, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cfW = confirmButtonView;
    }
}
