package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.DialogContentLayout;

/* compiled from: DialogCommissionChangeBinding */
public abstract class h extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView aQX;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView cMj;
    @NonNull
    public final TextView cMk;
    @NonNull
    public final c cMl;
    @NonNull
    public final RecyclerView cMm;
    @NonNull
    public final DialogContentLayout cMn;

    protected h(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, c cVar, RecyclerView recyclerView, DialogContentLayout dialogContentLayout, TextView textView4) {
        super(obj, view, i);
        this.aQX = textView;
        this.aIv = constraintLayout;
        this.cMj = textView2;
        this.cMk = textView3;
        this.cMl = cVar;
        setContainedBinding(this.cMl);
        this.cMm = recyclerView;
        this.cMn = dialogContentLayout;
        this.alH = textView4;
    }
}
