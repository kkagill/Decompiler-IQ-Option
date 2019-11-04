package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentTradingHistoryFiltersBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final LinearLayout dVX;
    @NonNull
    public final TextView dVY;
    @NonNull
    public final LinearLayout dVZ;
    @NonNull
    public final TextView dWa;
    @NonNull
    public final LinearLayout dWb;
    @NonNull
    public final TextView dWc;
    @NonNull
    public final LinearLayout dWd;
    @NonNull
    public final TextView dWe;
    @NonNull
    public final y dWf;

    protected g(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, LinearLayout linearLayout4, TextView textView4, y yVar) {
        super(obj, view, i);
        this.dVX = linearLayout;
        this.dVY = textView;
        this.dVZ = linearLayout2;
        this.dWa = textView2;
        this.dWb = linearLayout3;
        this.dWc = textView3;
        this.dWd = linearLayout4;
        this.dWe = textView4;
        this.dWf = yVar;
        setContainedBinding(this.dWf);
    }
}
