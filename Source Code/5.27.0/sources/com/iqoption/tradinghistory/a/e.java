package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentTradingHistoryBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final RecyclerView bYB;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final TextView dVV;
    @NonNull
    public final y dVW;

    protected e(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, y yVar) {
        super(obj, view, i);
        this.bYB = recyclerView;
        this.dVV = textView;
        this.bYW = contentLoadingProgressBar;
        this.dVW = yVar;
        setContainedBinding(this.dVW);
    }
}
