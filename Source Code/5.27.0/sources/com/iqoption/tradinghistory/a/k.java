package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentTradingHistoryOptionsBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final LinearLayout dWh;
    @NonNull
    public final RecyclerView dWi;
    @NonNull
    public final y dWj;

    protected k(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, y yVar) {
        super(obj, view, i);
        this.dWh = linearLayout;
        this.dWi = recyclerView;
        this.dWj = yVar;
        setContainedBinding(this.dWj);
    }
}
