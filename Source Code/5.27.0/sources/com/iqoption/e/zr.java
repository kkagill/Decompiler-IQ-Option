package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ToolsContentActiveToolsBinding */
public abstract class zr extends ViewDataBinding {
    @NonNull
    public final TextView aQO;
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView apj;
    @NonNull
    public final TextView cbI;
    @NonNull
    public final TextView cul;
    @NonNull
    public final TextView cum;
    @NonNull
    public final ConstraintLayout cun;

    protected zr(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView, TextView textView5, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.aQO = textView;
        this.cul = textView2;
        this.cbI = textView3;
        this.cum = textView4;
        this.apj = recyclerView;
        this.alH = textView5;
        this.cun = constraintLayout;
    }
}
