package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: FragmentKycQuestionWarning2Binding */
public abstract class ks extends ViewDataBinding {
    @NonNull
    public final TextView bYc;
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final TextView cgP;
    @NonNull
    public final TextView cgQ;
    @NonNull
    public final SoftKeyboardEditText cgR;
    @NonNull
    public final RobotoTextView cgS;
    @NonNull
    public final TextView cgT;

    protected ks(Object obj, View view, int i, pj pjVar, ConfirmButtonView confirmButtonView, TextView textView, TextView textView2, SoftKeyboardEditText softKeyboardEditText, RobotoTextView robotoTextView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgP = textView;
        this.cgQ = textView2;
        this.cgR = softKeyboardEditText;
        this.cgS = robotoTextView;
        this.cgT = textView3;
        this.bYc = textView4;
    }
}
