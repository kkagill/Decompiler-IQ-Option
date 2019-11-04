package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentKycQuestionWarningBinding */
public abstract class ak extends ViewDataBinding {
    @NonNull
    public final TextView dvA;
    @NonNull
    public final TextView dvB;
    @NonNull
    public final LinearLayout dvC;
    @NonNull
    public final IQTextInputEditText dvD;
    @NonNull
    public final TextInputLayout dvE;
    @NonNull
    public final bs dvF;
    @NonNull
    public final TextView dvG;

    protected ak(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, bs bsVar, TextView textView3) {
        super(obj, view, i);
        this.dvA = textView;
        this.dvB = textView2;
        this.dvC = linearLayout;
        this.dvD = iQTextInputEditText;
        this.dvE = textInputLayout;
        this.dvF = bsVar;
        setContainedBinding(this.dvF);
        this.dvG = textView3;
    }
}
