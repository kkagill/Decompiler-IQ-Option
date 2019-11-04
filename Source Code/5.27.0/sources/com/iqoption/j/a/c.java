package com.iqoption.j.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentOperationHistoryOptionsBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final RecyclerView dJZ;
    @NonNull
    public final i dKa;

    protected c(Object obj, View view, int i, RecyclerView recyclerView, i iVar) {
        super(obj, view, i);
        this.dJZ = recyclerView;
        this.dKa = iVar;
        setContainedBinding(this.dKa);
    }
}
