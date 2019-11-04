package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycIdDeclinedBinding */
public abstract class ke extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final TextView cfU;
    @NonNull
    public final TextView cfV;
    @NonNull
    public final ConfirmButtonView cfW;

    protected ke(Object obj, View view, int i, TextView textView, TextView textView2, pj pjVar, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cfU = textView;
        this.cfV = textView2;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
    }
}
