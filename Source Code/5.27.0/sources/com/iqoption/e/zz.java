package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ToolsContentSettingsBinding */
public abstract class zz extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView apj;
    @NonNull
    public final ConstraintLayout cun;

    protected zz(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.apj = recyclerView;
        this.alH = textView;
        this.cun = constraintLayout;
    }
}
