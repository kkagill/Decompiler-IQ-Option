package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DialogOvernightFeeBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final TextView alH;
    @NonNull
    public final View bVK;
    @NonNull
    public final TextView cMo;
    @NonNull
    public final RecyclerView cMq;
    @NonNull
    public final TextView cMr;
    @NonNull
    public final ag cMs;
    @NonNull
    public final TextView cMt;

    protected m(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, ag agVar, FrameLayout frameLayout, RecyclerView recyclerView, View view2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cMo = textView;
        this.aIv = constraintLayout;
        this.cMs = agVar;
        setContainedBinding(this.cMs);
        this.aHP = frameLayout;
        this.cMq = recyclerView;
        this.bVK = view2;
        this.cMr = textView2;
        this.cMt = textView3;
        this.alH = textView4;
    }
}
