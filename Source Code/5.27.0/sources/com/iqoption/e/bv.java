package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetScheduleItemItemBinding */
public abstract class bv extends ViewDataBinding {
    @NonNull
    public final TextView anj;
    @NonNull
    public final TextView bWY;
    @NonNull
    public final TextView bXf;

    protected bv(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bWY = textView;
        this.bXf = textView2;
        this.anj = textView3;
    }
}
