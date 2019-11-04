package com.iqoption.earningscalendar.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentEarningsCalendarBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final RecyclerView cNM;
    @NonNull
    public final com.iqoption.core.a.a cNN;

    protected a(Object obj, View view, int i, RecyclerView recyclerView, com.iqoption.core.a.a aVar) {
        super(obj, view, i);
        this.cNM = recyclerView;
        this.cNN = aVar;
        setContainedBinding(this.cNN);
    }
}
