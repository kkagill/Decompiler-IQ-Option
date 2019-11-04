package com.iqoption.kyc.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.widget.numpad.NumPad;

/* compiled from: FragmentPhoneConfirmBinding */
public abstract class ba extends ViewDataBinding {
    @NonNull
    public final bs dwb;
    @NonNull
    public final IQTextInputEditText dwc;
    @NonNull
    public final TextInputLayout dwd;
    @NonNull
    public final NumPad dwe;
    @NonNull
    public final TextView dwf;
    @NonNull
    public final TextView dwg;
    @NonNull
    public final TimeTextView dwh;

    protected ba(Object obj, View view, int i, bs bsVar, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, NumPad numPad, TextView textView, TextView textView2, TimeTextView timeTextView) {
        super(obj, view, i);
        this.dwb = bsVar;
        setContainedBinding(this.dwb);
        this.dwc = iQTextInputEditText;
        this.dwd = textInputLayout;
        this.dwe = numPad;
        this.dwf = textView;
        this.dwg = textView2;
        this.dwh = timeTextView;
    }
}
