package com.iqoption.charttools.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: IndicatorConstructorBottomSheetInputSelectBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final TextView alH;

    protected g(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.aIq = recyclerView;
        this.alH = textView;
    }
}
