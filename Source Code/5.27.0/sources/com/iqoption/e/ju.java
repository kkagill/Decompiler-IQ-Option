package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: FragmentKycEmailBinding */
public abstract class ju extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final SoftKeyboardEditText cgA;
    @NonNull
    public final TextView cgi;

    protected ju(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, TextView textView, pj pjVar, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cgA = softKeyboardEditText;
        this.cgi = textView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
    }
}
