package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.widget.numpad.NumPad;

/* compiled from: FragmentKycPhoneInputBinding */
public abstract class y extends ViewDataBinding {
    @NonNull
    public final bs dvl;
    @NonNull
    public final IQTextInputEditText dvm;
    @NonNull
    public final TextInputLayout dvn;
    @NonNull
    public final NumPad dvo;

    protected y(Object obj, View view, int i, bs bsVar, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, NumPad numPad) {
        super(obj, view, i);
        this.dvl = bsVar;
        setContainedBinding(this.dvl);
        this.dvm = iQTextInputEditText;
        this.dvn = textInputLayout;
        this.dvo = numPad;
    }
}
