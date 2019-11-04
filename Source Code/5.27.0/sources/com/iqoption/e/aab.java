package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ToolsContentTemplatesBinding */
public abstract class aab extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView apj;
    @NonNull
    public final ConstraintLayout cun;
    @NonNull
    public final TextView cux;

    protected aab(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, TextView textView2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.cux = textView;
        this.apj = recyclerView;
        this.alH = textView2;
        this.cun = constraintLayout;
    }
}
