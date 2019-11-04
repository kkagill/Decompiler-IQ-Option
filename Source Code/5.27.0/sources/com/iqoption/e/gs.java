package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogProTraderBenefitsBinding */
public abstract class gs extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final ph ccA;
    @NonNull
    public final pn ccB;
    @NonNull
    public final TextView ccx;
    @NonNull
    public final pl ccy;
    @NonNull
    public final LinearLayout ccz;

    protected gs(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, pl plVar, LinearLayout linearLayout, ph phVar, pn pnVar) {
        super(obj, view, i);
        this.aoG = frameLayout;
        this.ccx = textView;
        this.ccy = plVar;
        setContainedBinding(this.ccy);
        this.ccz = linearLayout;
        this.ccA = phVar;
        setContainedBinding(this.ccA);
        this.ccB = pnVar;
        setContainedBinding(this.ccB);
    }
}
