package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PriceMovementsFragmentBinding */
public abstract class wh extends ViewDataBinding {
    @NonNull
    public final Guideline aHQ;
    @NonNull
    public final LinearLayout cqg;
    @NonNull
    public final TextView cqh;
    @NonNull
    public final RecyclerView cqi;
    @NonNull
    public final TextView cqj;

    protected wh(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, TextView textView2, Guideline guideline) {
        super(obj, view, i);
        this.cqg = linearLayout;
        this.cqh = textView;
        this.cqi = recyclerView;
        this.cqj = textView2;
        this.aHQ = guideline;
    }
}
