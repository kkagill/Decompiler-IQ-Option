package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycPhoneConfirmedBinding */
public abstract class kk extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final pf cga;
    @NonNull
    public final TextView cgn;

    protected kk(Object obj, View view, int i, pj pjVar, pf pfVar, TextView textView) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
        this.cgn = textView;
    }
}
