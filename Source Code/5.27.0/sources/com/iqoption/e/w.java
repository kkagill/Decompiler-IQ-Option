package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ActiveSessionsFragmentBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final View bTk;
    @NonNull
    public final FrameLayout bTl;
    @NonNull
    public final RecyclerView bTm;
    @NonNull
    public final LinearLayout bTn;

    protected w(Object obj, View view, int i, View view2, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.bTk = view2;
        this.bTl = frameLayout;
        this.bTm = recyclerView;
        this.bTn = linearLayout;
    }
}
