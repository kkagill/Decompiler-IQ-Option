package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: RightPanelDelegateCryptoLoadingBinding */
public abstract class xr extends ViewDataBinding {
    @NonNull
    public final FormattedTextView csp;

    protected xr(Object obj, View view, int i, FormattedTextView formattedTextView) {
        super(obj, view, i);
        this.csp = formattedTextView;
    }
}
