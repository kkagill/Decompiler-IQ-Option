package com.iqoption.cardsverification.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentVerifyCardsBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final TextView aAw;
    @NonNull
    public final ContentLoadingProgressBar aAx;
    @NonNull
    public final RecyclerView aAy;
    @NonNull
    public final q aAz;

    protected c(Object obj, View view, int i, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, RecyclerView recyclerView, q qVar) {
        super(obj, view, i);
        this.aAw = textView;
        this.aAx = contentLoadingProgressBar;
        this.aAy = recyclerView;
        this.aAz = qVar;
        setContainedBinding(this.aAz);
    }
}
