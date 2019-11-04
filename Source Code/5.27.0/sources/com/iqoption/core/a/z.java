package com.iqoption.core.a;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ViewCurrencyAmountBinding */
public abstract class z extends ViewDataBinding {
    @NonNull
    public final EditText bgs;
    @NonNull
    public final View bgt;
    @NonNull
    public final TextView bgu;
    @NonNull
    public final TextView bgv;
    @NonNull
    public final TextView bgw;

    protected z(Object obj, View view, int i, EditText editText, View view2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bgs = editText;
        this.bgt = view2;
        this.bgu = textView;
        this.bgv = textView2;
        this.bgw = textView3;
    }
}
