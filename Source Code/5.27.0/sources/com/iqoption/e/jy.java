package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: FragmentKycEmailConfirmedBinding */
public abstract class jy extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final RobotoTextView cgD;
    @NonNull
    public final pf cga;

    protected jy(Object obj, View view, int i, RobotoTextView robotoTextView, pj pjVar, pf pfVar) {
        super(obj, view, i);
        this.cgD = robotoTextView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
    }
}
