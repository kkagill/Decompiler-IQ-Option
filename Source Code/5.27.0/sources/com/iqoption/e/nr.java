package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentVideoEducationCategoriesBinding */
public abstract class nr extends ViewDataBinding {
    @NonNull
    public final Guideline aHQ;
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView cky;

    protected nr(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, Guideline guideline) {
        super(obj, view, i);
        this.cky = recyclerView;
        this.alH = textView;
        this.aHQ = guideline;
    }
}
