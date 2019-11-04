package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: RightPanelDelegateCryptoSuccessBinding */
public abstract class xv extends ViewDataBinding {
    @NonNull
    public final FormattedTextView csq;
    @NonNull
    public final TextView csr;
    @NonNull
    public final RobotoTextView css;
    @NonNull
    public final TextView cst;

    protected xv(Object obj, View view, int i, FormattedTextView formattedTextView, TextView textView, RobotoTextView robotoTextView, TextView textView2) {
        super(obj, view, i);
        this.csq = formattedTextView;
        this.csr = textView;
        this.css = robotoTextView;
        this.cst = textView2;
    }
}
