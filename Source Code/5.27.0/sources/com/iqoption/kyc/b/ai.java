package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycQuestionTextBinding */
public abstract class ai extends ViewDataBinding {
    @NonNull
    public final IQTextInputEditText dvx;
    @NonNull
    public final ViewStubProxy dvy;
    @NonNull
    public final TextInputLayout dvz;

    protected ai(Object obj, View view, int i, IQTextInputEditText iQTextInputEditText, ViewStubProxy viewStubProxy, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.dvx = iQTextInputEditText;
        this.dvy = viewStubProxy;
        this.dvz = textInputLayout;
    }
}
