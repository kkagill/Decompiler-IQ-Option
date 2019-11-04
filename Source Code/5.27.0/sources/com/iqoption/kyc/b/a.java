package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycAddressBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final IQTextInputEditText duq;
    @NonNull
    public final TextInputLayout dur;
    @NonNull
    public final IQTextInputEditText dus;
    @NonNull
    public final TextInputLayout dut;
    @NonNull
    public final IQTextInputEditText duu;
    @NonNull
    public final TextInputLayout duv;

    protected a(Object obj, View view, int i, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout2, IQTextInputEditText iQTextInputEditText3, TextInputLayout textInputLayout3) {
        super(obj, view, i);
        this.duq = iQTextInputEditText;
        this.dur = textInputLayout;
        this.dus = iQTextInputEditText2;
        this.dut = textInputLayout2;
        this.duu = iQTextInputEditText3;
        this.duv = textInputLayout3;
    }
}
