package com.iqoption.deposit.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentPaymentFieldsLightBinding */
public abstract class z extends ViewDataBinding {
    @NonNull
    public final LinearLayout cCK;
    @NonNull
    public final LinearLayout cCL;
    @NonNull
    public final TextView cCM;

    protected z(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        super(obj, view, i);
        this.cCK = linearLayout;
        this.cCL = linearLayout2;
        this.cCM = textView;
    }
}
