package com.iqoption.kyc.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycFinishBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final TextView duV;
    @NonNull
    public final bs duW;

    protected k(Object obj, View view, int i, TextView textView, bs bsVar) {
        super(obj, view, i);
        this.duV = textView;
        this.duW = bsVar;
        setContainedBinding(this.duW);
    }
}
