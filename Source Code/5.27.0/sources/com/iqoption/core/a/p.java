package com.iqoption.core.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: LayoutPlaceholderFieldBinding */
public abstract class p extends ViewDataBinding {
    @NonNull
    public final IQTextInputEditText bfO;
    @NonNull
    public final TextInputLayout bfP;
    @NonNull
    public final TextView bfQ;

    protected p(Object obj, View view, int i, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, TextView textView) {
        super(obj, view, i);
        this.bfO = iQTextInputEditText;
        this.bfP = textInputLayout;
        this.bfQ = textView;
    }
}
