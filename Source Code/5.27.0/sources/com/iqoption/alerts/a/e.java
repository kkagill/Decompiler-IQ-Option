package com.iqoption.alerts.a;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AlertsListFragmentBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final RecyclerView aou;
    @NonNull
    public final ImageView aov;

    protected e(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView) {
        super(obj, view, i);
        this.aou = recyclerView;
        this.aov = imageView;
    }
}
