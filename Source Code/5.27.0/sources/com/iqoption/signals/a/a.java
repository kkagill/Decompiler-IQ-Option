package com.iqoption.signals.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentSignalBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final RecyclerView dUc;

    protected a(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.dUc = recyclerView;
    }
}
