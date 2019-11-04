package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycDocumentsIntroBinding */
public abstract class jq extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final TextView cgn;

    protected jq(Object obj, View view, int i, pj pjVar, ConfirmButtonView confirmButtonView, TextView textView) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgn = textView;
    }
}
