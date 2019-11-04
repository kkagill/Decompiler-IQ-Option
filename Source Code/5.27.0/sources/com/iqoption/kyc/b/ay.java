package com.iqoption.kyc.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.a.n;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycTinBinding */
public abstract class ay extends ViewDataBinding {
    @NonNull
    public final bs duX;
    @NonNull
    public final n dvW;
    @NonNull
    public final IQTextInputEditText dvX;
    @NonNull
    public final TextInputLayout dvY;
    @NonNull
    public final TextView dvZ;
    @NonNull
    public final TextView dwa;

    protected ay(Object obj, View view, int i, n nVar, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, TextView textView, TextView textView2, bs bsVar) {
        super(obj, view, i);
        this.dvW = nVar;
        setContainedBinding(this.dvW);
        this.dvX = iQTextInputEditText;
        this.dvY = textInputLayout;
        this.dvZ = textView;
        this.dwa = textView2;
        this.duX = bsVar;
        setContainedBinding(this.duX);
    }
}
