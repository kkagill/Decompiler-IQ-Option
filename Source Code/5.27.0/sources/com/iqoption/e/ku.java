package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: FragmentKycQuestionYesNoBinding */
public abstract class ku extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final RobotoTextView cgU;
    @NonNull
    public final RobotoTextView cgV;
    @NonNull
    public final TextView cgm;

    protected ku(Object obj, View view, int i, pj pjVar, RobotoTextView robotoTextView, TextView textView, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cgU = robotoTextView;
        this.cgm = textView;
        this.cgV = robotoTextView2;
    }
}
