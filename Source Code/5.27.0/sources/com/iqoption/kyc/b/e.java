package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycDateOfBirthBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final IQTextInputEditText duC;
    @NonNull
    public final TextInputLayout duD;

    protected e(Object obj, View view, int i, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.duC = iQTextInputEditText;
        this.duD = textInputLayout;
    }
}
