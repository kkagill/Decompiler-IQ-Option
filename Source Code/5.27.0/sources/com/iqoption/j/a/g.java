package com.iqoption.j.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentOperationSearchResultBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final ContentLoadingProgressBar bZl;
    @NonNull
    public final LinearLayout dKc;
    @NonNull
    public final RecyclerView dKd;
    @NonNull
    public final i dKe;

    protected g(Object obj, View view, int i, ContentLoadingProgressBar contentLoadingProgressBar, LinearLayout linearLayout, RecyclerView recyclerView, i iVar) {
        super(obj, view, i);
        this.bZl = contentLoadingProgressBar;
        this.dKc = linearLayout;
        this.dKd = recyclerView;
        this.dKe = iVar;
        setContainedBinding(this.dKe);
    }
}
