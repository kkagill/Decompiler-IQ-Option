package com.iqoption.signals.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: PriceMovementsFilterOptionsBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final LinearLayout cPP;
    @NonNull
    public final TextView dUd;
    @NonNull
    public final TextView dUe;
    @NonNull
    public final TextView dUf;

    protected e(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3) {
        super(obj, view, i);
        this.dUd = textView;
        this.dUe = textView2;
        this.cPP = linearLayout;
        this.dUf = textView3;
    }
}
