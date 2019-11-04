package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.widget.NumPad;

/* compiled from: FragmentKycPhoneBinding */
public abstract class kg extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final SoftKeyboardEditText bSU;
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final NumPad cgj;

    protected kg(Object obj, View view, int i, pj pjVar, ConfirmButtonView confirmButtonView, NumPad numPad, SoftKeyboardEditText softKeyboardEditText, TextView textView) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgj = numPad;
        this.bSU = softKeyboardEditText;
        this.alH = textView;
    }
}
