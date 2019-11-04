package com.iqoption.dialogs.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentMenuListLightBinding */
public abstract class aa extends ViewDataBinding {
    @NonNull
    public final RecyclerView cMF;

    protected aa(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.cMF = recyclerView;
    }
}
