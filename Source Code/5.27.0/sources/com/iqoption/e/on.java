package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorInfoItemBinding */
public abstract class on extends ViewDataBinding {
    @NonNull
    public final TextView ani;
    @NonNull
    public final TextView clp;

    protected on(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ani = textView;
        this.clp = textView2;
    }
}
