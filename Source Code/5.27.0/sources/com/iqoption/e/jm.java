package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.widget.NumPad;

/* compiled from: FragmentKycDateOfBirthOldBinding */
public abstract class jm extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final SoftKeyboardEditText cgh;
    @NonNull
    public final TextView cgi;
    @NonNull
    public final NumPad cgj;

    protected jm(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, TextView textView, pj pjVar, ConfirmButtonView confirmButtonView, NumPad numPad) {
        super(obj, view, i);
        this.cgh = softKeyboardEditText;
        this.cgi = textView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgj = numPad;
    }
}
