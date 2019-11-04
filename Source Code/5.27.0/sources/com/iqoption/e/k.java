package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: AccountSecurityConfirmedPhoneFragmentBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final FormattedTextView bSO;
    @NonNull
    public final FormattedTextView bSP;

    protected k(Object obj, View view, int i, FormattedTextView formattedTextView, FormattedTextView formattedTextView2) {
        super(obj, view, i);
        this.bSP = formattedTextView;
        this.bSO = formattedTextView2;
    }
}
