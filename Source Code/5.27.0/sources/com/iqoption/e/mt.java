package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentProTraderMoreBinding */
public abstract class mt extends ViewDataBinding {
    @NonNull
    public final TextView cih;
    @NonNull
    public final TextView cii;
    @NonNull
    public final LinearLayout cij;
    @NonNull
    public final TextView cik;

    protected mt(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3) {
        super(obj, view, i);
        this.cih = textView;
        this.cii = textView2;
        this.cij = linearLayout;
        this.cik = textView3;
    }
}
