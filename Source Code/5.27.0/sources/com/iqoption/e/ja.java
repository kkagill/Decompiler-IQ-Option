package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycAcceptableDocumentsBinding */
public abstract class ja extends ViewDataBinding {
    @NonNull
    public final LinearLayout cfR;
    @NonNull
    public final pj cfS;

    protected ja(Object obj, View view, int i, LinearLayout linearLayout, pj pjVar) {
        super(obj, view, i);
        this.cfR = linearLayout;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
    }
}
