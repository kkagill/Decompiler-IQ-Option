package com.iqoption.signals.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentSignalsBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final RecyclerView dUc;

    protected c(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.dUc = recyclerView;
    }
}
