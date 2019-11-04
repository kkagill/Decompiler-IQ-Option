package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycLegalNameBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final IQTextInputEditText dvc;
    @NonNull
    public final TextInputLayout dvd;
    @NonNull
    public final IQTextInputEditText dve;
    @NonNull
    public final TextInputLayout dvf;

    protected s(Object obj, View view, int i, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout2) {
        super(obj, view, i);
        this.dvc = iQTextInputEditText;
        this.dvd = textInputLayout;
        this.dve = iQTextInputEditText2;
        this.dvf = textInputLayout2;
    }
}
