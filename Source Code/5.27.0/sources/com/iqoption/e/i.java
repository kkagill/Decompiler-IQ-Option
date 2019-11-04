package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: AccountSecurityConfirmedEmailFragmentBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final FormattedTextView bSN;
    @NonNull
    public final FormattedTextView bSO;

    protected i(Object obj, View view, int i, FormattedTextView formattedTextView, FormattedTextView formattedTextView2) {
        super(obj, view, i);
        this.bSN = formattedTextView;
        this.bSO = formattedTextView2;
    }
}
