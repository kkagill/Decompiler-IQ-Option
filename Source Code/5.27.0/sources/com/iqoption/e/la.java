package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycReportableOldBinding */
public abstract class la extends ViewDataBinding {
    @NonNull
    public final TextView aIr;
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cgZ;
    @NonNull
    public final TextView cha;
    @NonNull
    public final ConfirmButtonView chb;

    protected la(Object obj, View view, int i, TextView textView, pj pjVar, ConfirmButtonView confirmButtonView, TextView textView2, ConfirmButtonView confirmButtonView2) {
        super(obj, view, i);
        this.aIr = textView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cgZ = confirmButtonView;
        this.cha = textView2;
        this.chb = confirmButtonView2;
    }
}
