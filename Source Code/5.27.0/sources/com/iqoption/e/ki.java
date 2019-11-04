package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.widget.NumPad;

/* compiled from: FragmentKycPhoneConfirmOldBinding */
public abstract class ki extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final SoftKeyboardEditText cgB;
    @NonNull
    public final FormattedTextView cgC;
    @NonNull
    public final TextView cgL;
    @NonNull
    public final TextView cgM;
    @NonNull
    public final TextView cgN;
    @NonNull
    public final NumPad cgj;

    protected ki(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, FormattedTextView formattedTextView, pj pjVar, ConfirmButtonView confirmButtonView, TextView textView, NumPad numPad, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cgB = softKeyboardEditText;
        this.cgC = formattedTextView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgL = textView;
        this.cgj = numPad;
        this.cgM = textView2;
        this.cgN = textView3;
    }
}
