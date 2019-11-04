package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetOvernightTodayItemBinding */
public abstract class bt extends ViewDataBinding {
    @NonNull
    public final TextView bWX;
    @NonNull
    public final TextView bWZ;
    @NonNull
    public final TextView bXe;

    protected bt(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bWX = textView;
        this.bWZ = textView2;
        this.bXe = textView3;
    }
}
