package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycQuestionSingleChoiceOldBinding */
public abstract class ko extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final pf cga;
    @NonNull
    public final LinearLayout cgk;
    @NonNull
    public final TextView cgm;

    protected ko(Object obj, View view, int i, LinearLayout linearLayout, pj pjVar, pf pfVar, TextView textView) {
        super(obj, view, i);
        this.cgk = linearLayout;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
        this.cgm = textView;
    }
}
