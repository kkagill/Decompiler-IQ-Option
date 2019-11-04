package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PortfolioFilterOptionsBinding */
public abstract class vb extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;

    protected vb(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.aIq = recyclerView;
    }
}
