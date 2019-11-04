package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: ItemPayoutAmountFieldBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout eqt;
    @NonNull
    public final IQTextInputEditText equ;
    @NonNull
    public final TextInputLayout eqv;
    @NonNull
    public final TextView eqw;
    @NonNull
    public final TextView eqx;

    protected o(Object obj, View view, int i, ConstraintLayout constraintLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.eqt = constraintLayout;
        this.equ = iQTextInputEditText;
        this.eqv = textInputLayout;
        this.eqw = textView;
        this.eqx = textView2;
    }
}
