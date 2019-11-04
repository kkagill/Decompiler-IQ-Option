package com.iqoption.forexcalendar.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.a.a;

/* compiled from: FragmentForexCalendarBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final RecyclerView cTe;
    @NonNull
    public final a cTf;

    protected g(Object obj, View view, int i, RecyclerView recyclerView, a aVar) {
        super(obj, view, i);
        this.cTe = recyclerView;
        this.cTf = aVar;
        setContainedBinding(this.cTf);
    }
}
