package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: FragmentKycEmailConfirmBinding */
public abstract class jw extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final SoftKeyboardEditText cgB;
    @NonNull
    public final FormattedTextView cgC;

    protected jw(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, FormattedTextView formattedTextView, pj pjVar, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cgB = softKeyboardEditText;
        this.cgC = formattedTextView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
    }
}
