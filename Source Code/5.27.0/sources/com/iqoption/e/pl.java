package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutProTraderBenefitsBottomRowBinding */
public abstract class pl extends ViewDataBinding {
    @NonNull
    public final LinearLayout cmv;
    @NonNull
    public final View cmw;
    @NonNull
    public final Space cmx;
    @NonNull
    public final TextView cmy;

    protected pl(Object obj, View view, int i, LinearLayout linearLayout, View view2, Space space, TextView textView) {
        super(obj, view, i);
        this.cmv = linearLayout;
        this.cmw = view2;
        this.cmx = space;
        this.cmy = textView;
    }
}
